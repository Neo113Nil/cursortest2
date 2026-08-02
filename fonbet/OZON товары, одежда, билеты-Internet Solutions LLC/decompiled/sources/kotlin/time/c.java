package kotlin.time;

import hd.C6915b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.C10310a;
import ve.EnumC10311b;

/* loaded from: classes.dex */
public final class c {
    public static final long a(long j11) {
        long j12 = (j11 << 1) + 1;
        b.Companion companion = b.INSTANCE;
        int i11 = C10310a.f102867a;
        return j12;
    }

    public static final long d(long j11) {
        if (-4611686018426999999L <= j11 && j11 < 4611686018427000000L) {
            return f(j11);
        }
        long j12 = ((j11 / 1000000) << 1) + 1;
        b.Companion companion = b.INSTANCE;
        int i11 = C10310a.f102867a;
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j11) {
        if (-4611686018426L <= j11 && j11 < 4611686018427L) {
            return f(j11 * 1000000);
        }
        long g10 = (h.g(j11, -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        b.Companion companion = b.INSTANCE;
        int i11 = C10310a.f102867a;
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j11) {
        long j12 = j11 << 1;
        b.Companion companion = b.INSTANCE;
        int i11 = C10310a.f102867a;
        return j12;
    }

    public static final long g(int i11, @NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(EnumC10311b.SECONDS) <= 0 ? f(d.c(i11, unit, EnumC10311b.NANOSECONDS)) : h(i11, unit);
    }

    public static final long h(long j11, @NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        EnumC10311b enumC10311b = EnumC10311b.NANOSECONDS;
        long c11 = d.c(4611686018426999999L, enumC10311b, unit);
        if ((-c11) <= j11 && j11 <= c11) {
            return f(d.c(j11, unit, enumC10311b));
        }
        long g10 = (h.g(d.b(j11, unit, EnumC10311b.MILLISECONDS), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        b.Companion companion = b.INSTANCE;
        int i11 = C10310a.f102867a;
        return g10;
    }

    public static final long i(@NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double a11 = d.a(-1.0d, unit, EnumC10311b.NANOSECONDS);
        if (Double.isNaN(a11)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long d11 = C6915b.d(a11);
        return (-4611686018426999999L > d11 || d11 >= 4611686018427000000L) ? e(C6915b.d(d.a(-1.0d, unit, EnumC10311b.MILLISECONDS))) : f(d11);
    }
}
