package kotlin.jvm.internal;

import defpackage.dmi;
import defpackage.gka;
import defpackage.iak;
import defpackage.lnb;
import defpackage.mz1;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class Intrinsics {
    public static boolean a(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static boolean b(Double d, Double d2) {
        return d == null ? d2 == null : d2 != null && d.doubleValue() == d2.doubleValue();
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(dmi.y(str, " must not be null"));
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder s = mz1.s("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        s.append(str);
        NullPointerException nullPointerException = new NullPointerException(s.toString());
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int e(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void g() {
        gka gkaVar = new gka();
        f(gkaVar, Intrinsics.class.getName());
        throw gkaVar;
    }

    public static void h() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void i(String str) {
        iak iakVar = new iak(lnb.o("lateinit property ", str, " has not been initialized"));
        f(iakVar, Intrinsics.class.getName());
        throw iakVar;
    }
}
