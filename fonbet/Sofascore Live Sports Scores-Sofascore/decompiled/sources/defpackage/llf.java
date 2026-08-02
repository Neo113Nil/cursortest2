package defpackage;

import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class llf extends klf {
    public static double a(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float b(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int d(int i, IntRange intRange) {
        intRange.getClass();
        int i2 = intRange.b;
        int i3 = intRange.a;
        if (intRange instanceof mz2) {
            throw null;
        }
        if (!intRange.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        pvd.k(46, intRange, "Cannot coerce value to an empty range: ");
        return 0;
    }

    public static long e(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        a70.p(fn0.n(ljg.o("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum "), j2, '.'));
        return 0L;
    }

    public static long f(long j, hkb hkbVar) {
        long j2 = hkbVar.b;
        long j3 = hkbVar.a;
        if (hkbVar instanceof mz2) {
            throw null;
        }
        if (!hkbVar.isEmpty()) {
            return j < Long.valueOf(j3).longValue() ? Long.valueOf(j3).longValue() : j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
        }
        pvd.k(46, hkbVar, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    public static Comparable g(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        comparable.getClass();
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static a h(int i, int i2) {
        a.d.getClass();
        return new a(i, i2, -1);
    }

    public static a i(int i, IntRange intRange) {
        intRange.getClass();
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            pvd.k(46, valueOf, "Step must be positive, was: ");
            return null;
        }
        u6a u6aVar = a.d;
        int i2 = intRange.a;
        int i3 = intRange.b;
        if (intRange.c <= 0) {
            i = -i;
        }
        u6aVar.getClass();
        return new a(i2, i3, i);
    }

    public static IntRange j(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.e.getClass();
        return IntRange.f;
    }
}
