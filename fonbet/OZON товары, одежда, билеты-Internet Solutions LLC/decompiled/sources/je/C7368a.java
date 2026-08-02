package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7368a extends AbstractC7402w {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Y f69869b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Y f69870c;

    public C7368a(@NotNull Y delegate, @NotNull Y abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f69869b = delegate;
        this.f69870c = abbreviation;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C7368a(this.f69869b.N0(newAttributes), this.f69870c);
    }

    @Override // je.AbstractC7402w
    @NotNull
    protected final Y Q0() {
        return this.f69869b;
    }

    @Override // je.AbstractC7402w
    public final AbstractC7402w S0(Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C7368a(delegate, this.f69870c);
    }

    @NotNull
    public final Y T0() {
        return this.f69870c;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final C7368a L0(boolean z11) {
        return new C7368a(this.f69869b.L0(z11), this.f69870c.L0(z11));
    }

    @Override // je.AbstractC7402w
    @NotNull
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final C7368a M0(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(this.f69869b);
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        N a12 = kotlinTypeRefiner.a(this.f69870c);
        Intrinsics.g(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7368a((Y) a11, (Y) a12);
    }

    @NotNull
    public final Y Z() {
        return this.f69869b;
    }
}
