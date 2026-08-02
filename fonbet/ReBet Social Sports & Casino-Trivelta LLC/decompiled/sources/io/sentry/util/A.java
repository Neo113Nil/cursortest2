package io.sentry.util;

import io.sentry.l4;

/* loaded from: classes3.dex */
public abstract class A {
    public static l4 a(l4 l4Var) {
        if (l4Var.c() != null) {
            return l4Var;
        }
        return new l4(l4Var.e(), l4Var.d(), b(null, l4Var.d(), l4Var.e()), l4Var.b(), l4Var.a());
    }

    public static Double b(Double d10, Double d11, Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double c10 = B.a().c();
        return (d11 == null || bool == null) ? Double.valueOf(c10) : bool.booleanValue() ? Double.valueOf(c10 * d11.doubleValue()) : Double.valueOf(d11.doubleValue() + (c10 * (1.0d - d11.doubleValue())));
    }

    public static boolean c(Double d10) {
        return e(d10, true);
    }

    public static boolean d(Double d10) {
        return e(d10, true);
    }

    public static boolean e(Double d10, boolean z10) {
        return d10 == null ? z10 : !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d10) {
        return e(d10, true);
    }

    public static boolean g(Double d10) {
        return h(d10, true);
    }

    public static boolean h(Double d10, boolean z10) {
        return e(d10, z10);
    }
}
