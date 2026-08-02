package defpackage;

import com.google.gson.FieldNamingStrategy;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class yz7 implements FieldNamingStrategy {
    public static final rz7 a;
    public static final /* synthetic */ yz7[] b;

    static {
        rz7 rz7Var = new rz7();
        a = rz7Var;
        b = new yz7[]{rz7Var, new yz7() { // from class: sz7
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return yz7.b(field.getName());
            }
        }, new yz7() { // from class: tz7
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return yz7.b(yz7.a(field.getName(), ' '));
            }
        }, new yz7() { // from class: uz7
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return yz7.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new yz7() { // from class: vz7
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return yz7.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new yz7() { // from class: wz7
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return yz7.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new yz7() { // from class: xz7
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return yz7.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c) {
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
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static yz7 valueOf(String str) {
        return (yz7) Enum.valueOf(yz7.class, str);
    }

    public static yz7[] values() {
        return (yz7[]) b.clone();
    }
}
