package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7363H {
    public static final boolean a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        return n11.K0() instanceof AbstractC7360E;
    }

    @NotNull
    public static final Y b(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        K0 K02 = n11.K0();
        if (K02 instanceof AbstractC7360E) {
            return ((AbstractC7360E) K02).P0();
        }
        if (K02 instanceof Y) {
            return (Y) K02;
        }
        throw new Sc.o();
    }

    @NotNull
    public static final Y c(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        K0 K02 = n11.K0();
        if (K02 instanceof AbstractC7360E) {
            return ((AbstractC7360E) K02).Q0();
        }
        if (K02 instanceof Y) {
            return (Y) K02;
        }
        throw new Sc.o();
    }
}
