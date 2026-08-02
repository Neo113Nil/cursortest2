package je;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.C10038p;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class D0 {
    @NotNull
    public static final Y a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        K0 K02 = n11.K0();
        Y y11 = K02 instanceof Y ? (Y) K02 : null;
        if (y11 != null) {
            return y11;
        }
        throw new IllegalStateException(("This is should be simple type: " + n11).toString());
    }

    @NotNull
    public static final N b(@NotNull N n11, @NotNull List<? extends y0> newArguments, @NotNull InterfaceC10030h newAnnotations) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return d(n11, newArguments, newAnnotations, 4);
    }

    @NotNull
    public static final Y c(@NotNull Y y11, @NotNull List<? extends y0> newArguments, @NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == y11.G0()) ? y11 : newArguments.isEmpty() ? y11.N0(newAttributes) : y11 instanceof le.i ? ((le.i) y11).S0(newArguments) : Q.f(newArguments, newAttributes, y11.H0(), null, y11.I0());
    }

    public static N d(N n11, List newArgumentsForUpperBound, InterfaceC10030h newAnnotations, int i11) {
        if ((i11 & 2) != 0) {
            newAnnotations = n11.getAnnotations();
        }
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArgumentsForUpperBound.isEmpty() || newArgumentsForUpperBound == n11.F0()) && newAnnotations == n11.getAnnotations()) {
            return n11;
        }
        o0 G02 = n11.G0();
        if ((newAnnotations instanceof C10038p) && ((C10038p) newAnnotations).isEmpty()) {
            newAnnotations = InterfaceC10030h.a.b();
        }
        o0 a11 = p0.a(G02, newAnnotations);
        K0 K02 = n11.K0();
        if (K02 instanceof AbstractC7360E) {
            AbstractC7360E abstractC7360E = (AbstractC7360E) K02;
            return Q.c(c(abstractC7360E.P0(), newArgumentsForUpperBound, a11), c(abstractC7360E.Q0(), newArgumentsForUpperBound, a11));
        }
        if (K02 instanceof Y) {
            return c((Y) K02, newArgumentsForUpperBound, a11);
        }
        throw new Sc.o();
    }

    public static /* synthetic */ Y e(Y y11, List list, o0 o0Var, int i11) {
        if ((i11 & 1) != 0) {
            list = y11.F0();
        }
        if ((i11 & 2) != 0) {
            o0Var = y11.G0();
        }
        return c(y11, list, o0Var);
    }
}
