package q0;

import E.B;
import d2.InterfaceC6040Q;
import org.jetbrains.annotations.NotNull;

/* renamed from: q0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8956k implements InterfaceC6040Q {

    /* renamed from: a, reason: collision with root package name */
    private final long f81321a;

    public C8956k(long j11) {
        this.f81321a = j11;
    }

    @Override // d2.InterfaceC6040Q
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo6calculatePositionllwVHH4(@NotNull Z1.o oVar, long j11, @NotNull Z1.s sVar, long j12) {
        int e11 = oVar.e();
        long j13 = this.f81321a;
        return Z1.n.a(B.a(e11 + ((int) (j13 >> 32)), (int) (j12 >> 32), (int) (j11 >> 32), sVar == Z1.s.Ltr), B.a(oVar.g() + ((int) (j13 & 4294967295L)), (int) (j12 & 4294967295L), (int) (j11 & 4294967295L), true));
    }
}
