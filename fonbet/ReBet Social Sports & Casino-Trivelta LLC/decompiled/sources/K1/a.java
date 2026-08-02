package K1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.L;
import H1.r;
import e1.J;

/* loaded from: classes.dex */
public final class a implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final J f6218a = new J(4);

    /* renamed from: b, reason: collision with root package name */
    public final L f6219b = new L(-1, -1, "image/avif");

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f6219b.a(j10, j11);
    }

    public final boolean b(InterfaceC1184q interfaceC1184q, int i10) {
        this.f6218a.X(4);
        interfaceC1184q.n(this.f6218a.f(), 0, 4);
        return this.f6218a.O() == ((long) i10);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f6219b.c(rVar);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        return this.f6219b.g(interfaceC1184q, i10);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.j(4);
        return b(interfaceC1184q, 1718909296) && b(interfaceC1184q, 1635150182);
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
