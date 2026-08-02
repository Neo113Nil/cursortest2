package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7371b0 extends AbstractC7402w implements I0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Y f69872b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final N f69873c;

    public C7371b0(@NotNull Y delegate, @NotNull N enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f69872b = delegate;
        this.f69873c = enhancement;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        K0 c11 = J0.c(this.f69872b.L0(z11), this.f69873c.K0().L0(z11));
        Intrinsics.g(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (Y) c11;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        K0 c11 = J0.c(this.f69872b.N0(newAttributes), this.f69873c);
        Intrinsics.g(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (Y) c11;
    }

    @Override // je.AbstractC7402w
    @NotNull
    protected final Y Q0() {
        return this.f69872b;
    }

    @Override // je.AbstractC7402w
    public final AbstractC7402w S0(Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C7371b0(delegate, this.f69873c);
    }

    @NotNull
    public final Y T0() {
        return this.f69872b;
    }

    @Override // je.AbstractC7402w
    @NotNull
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final C7371b0 M0(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(this.f69872b);
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7371b0((Y) a11, kotlinTypeRefiner.a(this.f69873c));
    }

    @Override // je.I0
    public final K0 V() {
        return this.f69872b;
    }

    @Override // je.I0
    @NotNull
    public final N n0() {
        return this.f69873c;
    }

    @Override // je.Y
    @NotNull
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f69873c + ")] " + this.f69872b;
    }
}
