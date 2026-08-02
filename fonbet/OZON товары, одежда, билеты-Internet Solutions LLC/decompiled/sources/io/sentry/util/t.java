package io.sentry.util;

import io.sentry.s3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t {
    @NotNull
    public static s3 a(@NotNull s3 s3Var) {
        if (s3Var.c() != null) {
            return s3Var;
        }
        return new s3(s3Var.e(), s3Var.d(), b(null, s3Var.d(), s3Var.e()), s3Var.b(), s3Var.a());
    }

    @NotNull
    public static Double b(Double d11, Double d12, Boolean bool) {
        if (d11 != null) {
            return d11;
        }
        double d13 = u.a().d();
        if (d12 == null || bool == null) {
            return Double.valueOf(d13);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d12.doubleValue() * d13);
        }
        return Double.valueOf(((1.0d - d12.doubleValue()) * d13) + d12.doubleValue());
    }

    public static boolean c(Double d11) {
        return e(d11, true);
    }

    public static boolean d(Double d11) {
        return e(d11, true);
    }

    private static boolean e(Double d11, boolean z11) {
        return d11 == null ? z11 : !d11.isNaN() && d11.doubleValue() >= 0.0d && d11.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d11) {
        return e(d11, true);
    }

    public static boolean g(Double d11) {
        return e(d11, true);
    }

    public static boolean h(Double d11) {
        return e(d11, false);
    }
}
