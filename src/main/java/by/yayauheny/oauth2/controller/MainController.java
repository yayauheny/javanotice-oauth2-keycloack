package by.yayauheny.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/home")
    public String homePage() {
        return "Hello, user! You are not authenticated yet, but welcome to our service!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Hello, admin! Welcome to our system";
    }
}
