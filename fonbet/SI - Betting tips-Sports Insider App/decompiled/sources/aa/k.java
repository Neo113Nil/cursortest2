package aa;

import android.os.Build;
import androidx.appcompat.widget.c1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f110a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f111b;

    static {
        Method method;
        Method method2 = null;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
                method = null;
            }
            try {
                method2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            } catch (NoSuchMethodException e9) {
                e9.printStackTrace();
            }
        } else {
            method = null;
        }
        f110a = method;
        f111b = method2;
    }

    public static Field a(Class cls, String str) {
        if (Build.VERSION.SDK_INT < 28) {
            return c(cls, str);
        }
        try {
            Field field = (Field) f110a.invoke(cls, str);
            if (field != null) {
                field.setAccessible(true);
                return field;
            }
            throw new NoSuchFieldException("Field '" + str + "' does not exist.");
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new NoSuchFieldException(c1.n("Field '", str, "' does not exist."));
        }
    }

    public static Method b(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            throw new ClassNotFoundException();
        }
        if (Build.VERSION.SDK_INT < 28) {
            return d(cls, str, clsArr);
        }
        try {
            Method method = (Method) f111b.invoke(cls, str, clsArr);
            if (method != null) {
                method.setAccessible(true);
                return method;
            }
            throw new NoSuchMethodException("Method '" + str + "' does not exist.");
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new NoSuchMethodException(c1.n("Method '", str, "' does not exist."));
        }
    }

    public static Field c(Class cls, String str) {
        if (cls == null) {
            throw new ClassNotFoundException();
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static Method d(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            throw new ClassNotFoundException();
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
