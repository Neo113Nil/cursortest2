package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.G, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7362G extends AbstractC7360E implements I0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC7360E f69832d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final N f69833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7362G(@NotNull AbstractC7360E origin, @NotNull N enhancement) {
        super(origin.P0(), origin.Q0());
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f69832d = origin;
        this.f69833e = enhancement;
    }

    @Override // je.N
    /* renamed from: J0 */
    public final N M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(this.f69832d);
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C7362G((AbstractC7360E) a11, kotlinTypeRefiner.a(this.f69833e));
    }

    @Override // je.K0
    @NotNull
    public final K0 L0(boolean z11) {
        return J0.c(this.f69832d.L0(z11), this.f69833e.K0().L0(z11));
    }

    @Override // je.K0
    public final K0 M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(this.f69832d);
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C7362G((AbstractC7360E) a11, kotlinTypeRefiner.a(this.f69833e));
    }

    @Override // je.K0
    @NotNull
    public final K0 N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return J0.c(this.f69832d.N0(newAttributes), this.f69833e);
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final Y O0() {
        return this.f69832d.O0();
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final String R0(@NotNull Ud.u renderer, @NotNull Ud.u options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return options.A() ? renderer.h0(this.f69833e) : this.f69832d.R0(renderer, options);
    }

    @Override // je.I0
    public final K0 V() {
        return this.f69832d;
    }

    @Override // je.I0
    @NotNull
    public final N n0() {
        return this.f69833e;
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f69833e + ")] " + this.f69832d;
    }
}
