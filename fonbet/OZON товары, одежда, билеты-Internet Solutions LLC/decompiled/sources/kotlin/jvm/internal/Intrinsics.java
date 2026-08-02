package kotlin.jvm.internal;

import B0.A0;
import N3.C3660k;
import Sc.C4006h;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Intrinsics {

    public static class a {
        private a() {
        }
    }

    private Intrinsics() {
    }

    public static boolean a(Double d11, Double d12) {
        return d11 == null ? d12 == null : d12 != null && d11.doubleValue() == d12.doubleValue();
    }

    public static boolean b(Float f7, float f11) {
        return f7 != null && f7.floatValue() == f11;
    }

    public static boolean c(Float f7, Float f11) {
        return f7 == null ? f11 == null : f11 != null && f7.floatValue() == f11.floatValue();
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(U7.d.e(str, " must not be null"));
        k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(j(str));
        k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        k(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j(str));
        k(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    public static int i(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    private static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i11 = 0;
        while (!stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        while (stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        StackTraceElement stackTraceElement = stackTrace[i11];
        StringBuilder d11 = C3660k.d("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        d11.append(str);
        return d11.toString();
    }

    static void k(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(stackTrace[i12].getClassName())) {
                i11 = i12;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11 + 1, length));
    }

    public static String l(Object obj, String str) {
        return str + obj;
    }

    public static void m() {
        C4006h c4006h = new C4006h();
        k(c4006h, Intrinsics.class.getName());
        throw c4006h;
    }

    public static void n(String str) {
        Sc.H h11 = new Sc.H(A0.b("lateinit property ", str, " has not been initialized"));
        k(h11, Intrinsics.class.getName());
        throw h11;
    }
}
