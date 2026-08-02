package com.google.gson;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Field;
import java.util.Locale;
import xsna.up;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;

    static {
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.a
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return field.getName();
            }
        };
        IDENTITY = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.b
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return FieldNamingPolicy.b(field.getName());
            }
        };
        UPPER_CAMEL_CASE = fieldNamingPolicy2;
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.c
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return FieldNamingPolicy.b(FieldNamingPolicy.a(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = fieldNamingPolicy3;
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.d
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = fieldNamingPolicy4;
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.e
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = fieldNamingPolicy5;
        FieldNamingPolicy fieldNamingPolicy6 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.f
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = fieldNamingPolicy6;
        FieldNamingPolicy fieldNamingPolicy7 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.g
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), JwtParser.SEPARATOR_CHAR).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = fieldNamingPolicy7;
        $VALUES = new FieldNamingPolicy[]{fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5, fieldNamingPolicy6, fieldNamingPolicy7};
    }

    public FieldNamingPolicy() {
        throw null;
    }

    public static String a(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String b(String str) {
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
                    StringBuilder sb = new StringBuilder();
                    sb.append(upperCase);
                    return up.b(1, str, sb);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i));
                sb2.append(upperCase);
                return up.b(i + 1, str, sb2);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }
}
