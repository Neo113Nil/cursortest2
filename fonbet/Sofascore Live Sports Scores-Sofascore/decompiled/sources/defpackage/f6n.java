package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f6n {
    public static final vha a;

    static {
        vha d6nVar;
        try {
            d6nVar = new e6n(0);
        } catch (ReflectiveOperationException unused) {
            d6nVar = new d6n();
        }
        a = d6nVar;
    }

    public static void a(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String b = b(accessibleObject, false);
            int length = b.length();
            String e2 = e(e);
            throw new o9p(16, fc6.o(new StringBuilder(length + 111 + e2.length()), "Failed making ", b, " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e2), e);
        }
    }

    public static String b(AccessibleObject accessibleObject, boolean z) {
        String concat;
        if (accessibleObject instanceof Field) {
            String c = c((Field) accessibleObject);
            concat = wt3.m("field '", c, new StringBuilder(c.length() + 8), "'");
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            f(method, sb);
            String sb2 = sb.toString();
            String name = method.getDeclaringClass().getName();
            StringBuilder sb3 = new StringBuilder(mz1.d(name.length() + 9, 1, sb2));
            sb3.append("method '");
            sb3.append(name);
            sb3.append("#");
            sb3.append(sb2);
            sb3.append("'");
            concat = sb3.toString();
        } else if (accessibleObject instanceof Constructor) {
            String d = d((Constructor) accessibleObject);
            concat = wt3.m("constructor '", d, new StringBuilder(d.length() + 14), "'");
        } else {
            concat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (!z || !Character.isLowerCase(concat.charAt(0))) {
            return concat;
        }
        char upperCase = Character.toUpperCase(concat.charAt(0));
        String substring = concat.substring(1);
        StringBuilder sb4 = new StringBuilder(String.valueOf(upperCase).length() + substring.length());
        sb4.append(upperCase);
        sb4.append(substring);
        return sb4.toString();
    }

    public static String c(Field field) {
        String name = field.getDeclaringClass().getName();
        String name2 = field.getName();
        return wt3.m(name, "#", new StringBuilder(name.length() + 1 + String.valueOf(name2).length()), name2);
    }

    public static String d(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        f(constructor, sb);
        return sb.toString();
    }

    public static String e(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
    }

    public static void f(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }
}
