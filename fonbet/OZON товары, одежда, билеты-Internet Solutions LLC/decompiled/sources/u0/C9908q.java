package u0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9908q implements InterfaceC9914x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f99678a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z1.d f99679b;

    public C9908q(@NotNull J j11, @NotNull Z1.d dVar) {
        this.f99678a = j11;
        this.f99679b = dVar;
    }

    @Override // u0.InterfaceC9914x
    public final float a() {
        J j11 = this.f99678a;
        Z1.d dVar = this.f99679b;
        return dVar.B(j11.b(dVar));
    }

    @Override // u0.InterfaceC9914x
    public final float b(@NotNull Z1.s sVar) {
        J j11 = this.f99678a;
        Z1.d dVar = this.f99679b;
        return dVar.B(j11.a(dVar, sVar));
    }

    @Override // u0.InterfaceC9914x
    public final float c(@NotNull Z1.s sVar) {
        J j11 = this.f99678a;
        Z1.d dVar = this.f99679b;
        return dVar.B(j11.d(dVar, sVar));
    }

    @Override // u0.InterfaceC9914x
    public final float d() {
        J j11 = this.f99678a;
        Z1.d dVar = this.f99679b;
        return dVar.B(j11.c(dVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9908q)) {
            return false;
        }
        C9908q c9908q = (C9908q) obj;
        return Intrinsics.d(this.f99678a, c9908q.f99678a) && Intrinsics.d(this.f99679b, c9908q.f99679b);
    }

    public final int hashCode() {
        return this.f99679b.hashCode() + (this.f99678a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f99678a + ", density=" + this.f99679b + ')';
    }
}
