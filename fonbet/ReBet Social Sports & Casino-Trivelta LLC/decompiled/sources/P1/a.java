package P1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.L;
import H1.r;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* loaded from: classes.dex */
public final class a implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1183p f8689a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f8689a = new L(65496, 2, ClipboardModule.MIMETYPE_JPEG);
        } else {
            this.f8689a = new b();
        }
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f8689a.a(j10, j11);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f8689a.c(rVar);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        return this.f8689a.g(interfaceC1184q, i10);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return this.f8689a.j(interfaceC1184q);
    }

    @Override // H1.InterfaceC1183p
    public void release() {
        this.f8689a.release();
    }
}
