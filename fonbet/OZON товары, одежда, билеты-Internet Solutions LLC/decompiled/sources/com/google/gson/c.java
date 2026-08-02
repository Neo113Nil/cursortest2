package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c implements com.google.gson.d {
    private static final /* synthetic */ c[] $VALUES;
    public static final c IDENTITY;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;
    public static final c UPPER_CASE_WITH_UNDERSCORES;

    static {
        c cVar = new c() { // from class: com.google.gson.c.a
            @Override // com.google.gson.d
            public final String a(Field field) {
                return field.getName();
            }
        };
        IDENTITY = cVar;
        c cVar2 = new c() { // from class: com.google.gson.c.b
            @Override // com.google.gson.d
            public final String a(Field field) {
                return c.d(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar2;
        c cVar3 = new c() { // from class: com.google.gson.c.c
            @Override // com.google.gson.d
            public final String a(Field field) {
                return c.d(c.b(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar3;
        c cVar4 = new c() { // from class: com.google.gson.c.d
            @Override // com.google.gson.d
            public final String a(Field field) {
                return c.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = cVar4;
        c cVar5 = new c() { // from class: com.google.gson.c.e
            @Override // com.google.gson.d
            public final String a(Field field) {
                return c.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar5;
        c cVar6 = new c() { // from class: com.google.gson.c.f
            @Override // com.google.gson.d
            public final String a(Field field) {
                return c.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar6;
        c cVar7 = new c() { // from class: com.google.gson.c.g
            @Override // com.google.gson.d
            public final String a(Field field) {
                return c.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar7;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c() {
        throw null;
    }

    static String b(String str, char c11) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c11);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String d(String str) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (!Character.isLetter(charAt)) {
                i11++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i11 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i11) + upperCase + str.substring(i11 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
