package d2;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.L;
import H1.r;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3995a implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final L f44916a = new L(35152, 2, ClipboardModule.MIMETYPE_PNG);

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f44916a.a(j10, j11);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f44916a.c(rVar);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        return this.f44916a.g(interfaceC1184q, i10);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return this.f44916a.j(interfaceC1184q);
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
