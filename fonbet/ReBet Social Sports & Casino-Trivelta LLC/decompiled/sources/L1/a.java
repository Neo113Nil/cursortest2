package L1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.L;
import H1.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final L f6755a = new L(16973, 2, "image/bmp");

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f6755a.a(j10, j11);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f6755a.c(rVar);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        return this.f6755a.g(interfaceC1184q, i10);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return this.f6755a.j(interfaceC1184q);
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
