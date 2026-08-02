package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes8.dex */
public enum FieldNamingPolicy implements FieldNamingStrategy {
    IDENTITY { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.1
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.2
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.3
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return upperCaseFirstLetter(separateCamelCase(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.4
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.5
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.6
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.7
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    static String separateCamelCase(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }
}
