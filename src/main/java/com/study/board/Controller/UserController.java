package com.study.board.Controller;

import com.study.board.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.board.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService UserService;

    @Autowired
    public UserController(UserService personService) {
        this.UserService = personService;
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody User user) {
        return UserService.createUser(user);
    }
}