package kotlin.ranges;

import C.C2702w;
import kd.InterfaceC7663b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h extends j {
    @NotNull
    public static Comparable b(@NotNull Comparable comparable, @NotNull Comparable minimumValue) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return comparable.compareTo(minimumValue) < 0 ? minimumValue : comparable;
    }

    public static double c(double d11, double d12, double d13) {
        if (d12 <= d13) {
            return d11 < d12 ? d12 : d11 > d13 ? d13 : d11;
        }
        StringBuilder e11 = Cm.e.e(d13, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        e11.append(d12);
        e11.append('.');
        throw new IllegalArgumentException(e11.toString());
    }

    public static float d(float f7, float f11, float f12) {
        if (f11 <= f12) {
            return f7 < f11 ? f11 : f7 > f12 ? f12 : f7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int e(int i11, int i12, int i13) {
        if (i12 <= i13) {
            return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(int i11, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof InterfaceC7663b) {
            return ((Number) i(Integer.valueOf(i11), (InterfaceC7663b) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i11 < range.getStart().intValue() ? range.getStart().intValue() : i11 > ((Number) range.e()).intValue() ? ((Number) range.e()).intValue() : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long g(long j11, long j12, long j13) {
        if (j12 <= j13) {
            return j11 < j12 ? j12 : j11 > j13 ? j13 : j11;
        }
        StringBuilder d11 = C2702w.d(j13, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        d11.append(j12);
        d11.append('.');
        throw new IllegalArgumentException(d11.toString());
    }

    @NotNull
    public static Comparable h(@NotNull Comparable comparable, Comparable comparable2, Comparable comparable3) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
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

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable] */
    @NotNull
    public static Comparable i(@NotNull Comparable comparable, @NotNull InterfaceC7663b range) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.b(comparable, range.getStart()) || range.b(range.getStart(), comparable)) ? (!range.b(range.e(), comparable) || range.b(comparable, range.e())) ? comparable : range.e() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static e j(int i11, int i12) {
        e.INSTANCE.getClass();
        return new e(i11, i12, -1);
    }

    @NotNull
    public static InterfaceC7663b k(double d11, double d12) {
        return new c(d11, d12);
    }

    @NotNull
    public static InterfaceC7663b l(float f7, float f11) {
        return new d(f7, f11);
    }

    @NotNull
    public static e m(@NotNull e eVar, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        i.a(Integer.valueOf(i11), i11 > 0);
        e.Companion companion = e.INSTANCE;
        int f71842a = eVar.getF71842a();
        int f71843b = eVar.getF71843b();
        if (eVar.getF71844c() <= 0) {
            i11 = -i11;
        }
        companion.getClass();
        return new e(f71842a, f71843b, i11);
    }

    @NotNull
    public static f n(@NotNull g gVar, long j11) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        i.a(Long.valueOf(j11), j11 > 0);
        f.Companion companion = f.INSTANCE;
        long f71846a = gVar.getF71846a();
        long f71847b = gVar.getF71847b();
        if (gVar.getF71848c() <= 0) {
            j11 = -j11;
        }
        long j12 = j11;
        companion.getClass();
        return f.Companion.a(f71846a, f71847b, j12);
    }

    @NotNull
    public static IntRange o(int i11, int i12) {
        IntRange intRange;
        if (i12 > Integer.MIN_VALUE) {
            return new IntRange(i11, i12 - 1, 1);
        }
        IntRange.INSTANCE.getClass();
        intRange = IntRange.f71831f;
        return intRange;
    }
}
