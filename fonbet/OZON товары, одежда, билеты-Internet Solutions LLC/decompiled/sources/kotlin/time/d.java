package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes.dex */
class d {
    public static final double a(double d11, @NotNull EnumC10311b sourceUnit, @NotNull EnumC10311b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert = targetUnit.a().convert(1L, sourceUnit.a());
        return convert > 0 ? d11 * convert : d11 / sourceUnit.a().convert(1L, targetUnit.a());
    }

    public static final long b(long j11, @NotNull EnumC10311b sourceUnit, @NotNull EnumC10311b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.a().convert(j11, sourceUnit.a());
    }

    public static final long c(long j11, @NotNull EnumC10311b sourceUnit, @NotNull EnumC10311b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.a().convert(j11, sourceUnit.a());
    }
}
