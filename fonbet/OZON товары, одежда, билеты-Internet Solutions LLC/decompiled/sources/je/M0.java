package je;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class M0 extends N {
    public M0() {
        super(0);
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return L0().F0();
    }

    @Override // je.N
    @NotNull
    public final o0 G0() {
        return L0().G0();
    }

    @Override // je.N
    @NotNull
    public final s0 H0() {
        return L0().H0();
    }

    @Override // je.N
    public final boolean I0() {
        return L0().I0();
    }

    @Override // je.N
    @NotNull
    public final K0 K0() {
        N L02 = L0();
        while (L02 instanceof M0) {
            L02 = ((M0) L02).L0();
        }
        Intrinsics.g(L02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (K0) L02;
    }

    @NotNull
    protected abstract N L0();

    public boolean M0() {
        return true;
    }

    @Override // je.N
    @NotNull
    public final ce.l p() {
        return L0().p();
    }

    @NotNull
    public final String toString() {
        return M0() ? L0().toString() : "<Not computed yet>";
    }
}
