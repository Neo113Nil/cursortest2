package je;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7402w extends Y {
    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return Q0().F0();
    }

    @Override // je.N
    @NotNull
    public o0 G0() {
        return Q0().G0();
    }

    @Override // je.N
    @NotNull
    public final s0 H0() {
        return Q0().H0();
    }

    @Override // je.N
    public boolean I0() {
        return Q0().I0();
    }

    @NotNull
    protected abstract Y Q0();

    @Override // je.K0
    @NotNull
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public Y M0(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(Q0());
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return S0((Y) a11);
    }

    @NotNull
    public abstract AbstractC7402w S0(@NotNull Y y11);

    @Override // je.N
    @NotNull
    public final ce.l p() {
        return Q0().p();
    }
}
