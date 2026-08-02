package io.agora.base.internal;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

    public static Object safeCallMethod(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (Throwable th2) {
            th2.printStackTrace();
            method = null;
        }
        if (method == null) {
            Logging.e(TAG, "cannot find method:  " + cls.getSimpleName() + "." + str + ":" + Arrays.toString(clsArr));
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable th3) {
            Logging.e(TAG, "cannot execute method:  " + cls.getSimpleName() + "." + str + ":" + Arrays.toString(clsArr));
            th3.printStackTrace();
            return null;
        }
    }

    public static Class<?> safeFindClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static Method safeGetMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
