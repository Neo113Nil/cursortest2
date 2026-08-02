package je;

import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.F, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7361F extends AbstractC7360E implements InterfaceC7399t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7361F(@NotNull Y lowerBound, @NotNull Y upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // je.InterfaceC7399t
    public final boolean C0() {
        return (P0().H0().p() instanceof td.i0) && Intrinsics.d(P0().H0(), Q0().H0());
    }

    @Override // je.K0
    @NotNull
    public final K0 L0(boolean z11) {
        return Q.c(P0().L0(z11), Q0().L0(z11));
    }

    @Override // je.InterfaceC7399t
    @NotNull
    public final K0 N(@NotNull N replacement) {
        K0 c11;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        K0 K02 = replacement.K0();
        if (K02 instanceof AbstractC7360E) {
            c11 = K02;
        } else {
            if (!(K02 instanceof Y)) {
                throw new Sc.o();
            }
            Y y11 = (Y) K02;
            c11 = Q.c(y11, y11.L0(true));
        }
        return J0.b(c11, K02);
    }

    @Override // je.K0
    @NotNull
    public final K0 N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return Q.c(P0().N0(newAttributes), Q0().N0(newAttributes));
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final Y O0() {
        return P0();
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final String R0(@NotNull Ud.u renderer, @NotNull Ud.u options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.z()) {
            return renderer.N(renderer.h0(P0()), renderer.h0(Q0()), C8701c.h(this));
        }
        return "(" + renderer.h0(P0()) + ".." + renderer.h0(Q0()) + ')';
    }

    @Override // je.K0
    @NotNull
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final AbstractC7360E M0(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(P0());
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        N a12 = kotlinTypeRefiner.a(Q0());
        Intrinsics.g(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7361F((Y) a11, (Y) a12);
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final String toString() {
        return "(" + P0() + ".." + Q0() + ')';
    }
}
