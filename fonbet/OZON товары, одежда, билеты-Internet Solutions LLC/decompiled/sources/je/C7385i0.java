package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.i0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7385i0 extends AbstractC7376e {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ce.l f69894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7385i0(@NotNull ke.s originalTypeVariable, boolean z11) {
        super(originalTypeVariable, z11);
        Intrinsics.checkNotNullParameter(originalTypeVariable, "originalTypeVariable");
        Intrinsics.checkNotNullParameter(null, "constructor");
        this.f69894e = originalTypeVariable.n().i().p();
    }

    @Override // je.N
    @NotNull
    public final s0 H0() {
        return null;
    }

    @Override // je.AbstractC7376e
    @NotNull
    public final C7385i0 R0(boolean z11) {
        return new C7385i0(Q0(), z11);
    }

    @Override // je.AbstractC7376e, je.N
    @NotNull
    public final ce.l p() {
        return this.f69894e;
    }

    @Override // je.Y
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stub (BI): ");
        sb2.append(Q0());
        sb2.append(I0() ? "?" : "");
        return sb2.toString();
    }
}
