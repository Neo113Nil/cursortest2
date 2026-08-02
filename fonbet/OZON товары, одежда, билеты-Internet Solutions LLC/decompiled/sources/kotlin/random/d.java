package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {
    @NotNull
    public static final String a(@NotNull Number from, @NotNull Number until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final int b(@NotNull c.Companion companion, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getF71843b() < Integer.MAX_VALUE ? companion.f(range.getF71842a(), range.getF71843b() + 1) : range.getF71842a() > Integer.MIN_VALUE ? companion.f(range.getF71842a() - 1, range.getF71843b()) + 1 : companion.d();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }
}
