package cg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class f {
    public static final double a(double d10, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert = targetUnit.f3924a.convert(1L, sourceUnit.f3924a);
        return convert > 0 ? d10 * convert : d10 / r9.convert(1L, targetUnit.f3924a);
    }

    public static final long b(long j, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f3924a.convert(j, sourceUnit.f3924a);
    }

    public static final long c(long j, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f3924a.convert(j, sourceUnit.f3924a);
    }
}
