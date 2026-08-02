package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7358C {
    @NotNull
    public y0 a(@NotNull td.i0 parameter, @NotNull Hd.a typeAttr, @NotNull x0 typeParameterUpperBoundEraser, @NotNull N erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        return new A0(erasedUpperBound, L0.OUT_VARIANCE);
    }
}
