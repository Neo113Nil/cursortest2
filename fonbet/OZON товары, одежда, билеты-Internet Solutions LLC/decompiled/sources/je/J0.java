package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final N a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        if (n11 instanceof I0) {
            return ((I0) n11).n0();
        }
        return null;
    }

    @NotNull
    public static final K0 b(@NotNull K0 k02, @NotNull N origin) {
        Intrinsics.checkNotNullParameter(k02, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return c(k02, a(origin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final K0 c(@NotNull K0 k02, N n11) {
        Intrinsics.checkNotNullParameter(k02, "<this>");
        if (k02 instanceof I0) {
            return c(((I0) k02).V(), n11);
        }
        if (n11 == null || n11.equals(k02)) {
            return k02;
        }
        if (k02 instanceof Y) {
            return new C7371b0((Y) k02, n11);
        }
        if (k02 instanceof AbstractC7360E) {
            return new C7362G((AbstractC7360E) k02, n11);
        }
        throw new Sc.o();
    }
}
