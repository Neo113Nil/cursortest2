package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S {
    public static final boolean a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        K0 K02 = n11.K0();
        if (K02 instanceof le.i) {
            return true;
        }
        return (K02 instanceof AbstractC7360E) && (((AbstractC7360E) K02).O0() instanceof le.i);
    }
}
