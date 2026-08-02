package com.google.common.math;

import Ra.n;

/* loaded from: classes3.dex */
public abstract class c {
    public static long a(double d10) {
        n.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean c(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    public static double d(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
    }
}
