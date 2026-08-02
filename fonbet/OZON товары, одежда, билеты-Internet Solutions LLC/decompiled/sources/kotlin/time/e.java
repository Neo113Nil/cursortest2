package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes.dex */
public final class e {
    private static final long a(long j11) {
        long j12;
        long j13;
        if (j11 < 0) {
            b.INSTANCE.getClass();
            j13 = b.f71984d;
            return j13;
        }
        b.INSTANCE.getClass();
        j12 = b.f71983c;
        return j12;
    }

    public static final long b(long j11, long j12, @NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j12 - 1)) == Long.MAX_VALUE ? b.q(a(j12)) : c(j11, j12, unit);
    }

    private static final long c(long j11, long j12, EnumC10311b enumC10311b) {
        long j13 = j11 - j12;
        if (((j13 ^ j11) & (~(j13 ^ j12))) >= 0) {
            return c.h(j13, enumC10311b);
        }
        EnumC10311b enumC10311b2 = EnumC10311b.MILLISECONDS;
        if (enumC10311b.compareTo(enumC10311b2) >= 0) {
            return b.q(a(j13));
        }
        long b11 = d.b(1L, enumC10311b2, enumC10311b);
        long j14 = (j11 / b11) - (j12 / b11);
        long j15 = (j11 % b11) - (j12 % b11);
        b.Companion companion = b.INSTANCE;
        return b.l(c.h(j14, enumC10311b2), c.h(j15, enumC10311b));
    }

    public static final long d(long j11, long j12, @NotNull EnumC10311b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j12 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j11 - 1)) == Long.MAX_VALUE ? a(j11) : c(j11, j12, unit);
        }
        if (j11 != j12) {
            return b.q(a(j12));
        }
        b.INSTANCE.getClass();
        return 0L;
    }
}
