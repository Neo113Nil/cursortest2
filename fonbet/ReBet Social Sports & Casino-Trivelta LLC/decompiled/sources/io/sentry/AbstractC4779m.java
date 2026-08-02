package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/* renamed from: io.sentry.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4779m {
    public static double a(Date date) {
        return j(date.getTime());
    }

    public static BigDecimal b(double d10) {
        return BigDecimal.valueOf(d10).setScale(6, RoundingMode.DOWN);
    }

    public static Date c() {
        return new Date();
    }

    public static Date d(long j10) {
        return new Date(j10);
    }

    public static Date e(String str) {
        try {
            return d(io.sentry.vendor.b.p(str));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date f(String str) {
        try {
            return d(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String g(Date date) {
        return h(date.getTime());
    }

    public static String h(long j10) {
        return io.sentry.vendor.b.i(j10);
    }

    public static long i(long j10) {
        return j10 * 1000000;
    }

    public static double j(double d10) {
        return d10 / 1000.0d;
    }

    public static Date k(long j10) {
        return d((long) l(j10));
    }

    public static double l(double d10) {
        return d10 / 1000000.0d;
    }

    public static double m(long j10) {
        return j10 / 1.0E9d;
    }

    public static long n(long j10) {
        return j10 * 1000000000;
    }

    public static Date o(AbstractC4856v2 abstractC4856v2) {
        if (abstractC4856v2 == null) {
            return null;
        }
        return p(abstractC4856v2);
    }

    public static Date p(AbstractC4856v2 abstractC4856v2) {
        return k(abstractC4856v2.f());
    }
}
