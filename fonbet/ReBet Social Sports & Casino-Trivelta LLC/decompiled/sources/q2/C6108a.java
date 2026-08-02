package q2;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.L;
import H1.r;
import com.reactnativecommunity.clipboard.ClipboardModule;
import e1.J;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6108a implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final J f63353a = new J(4);

    /* renamed from: b, reason: collision with root package name */
    public final L f63354b = new L(-1, -1, ClipboardModule.MIMETYPE_WEBP);

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f63354b.a(j10, j11);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f63354b.c(rVar);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        return this.f63354b.g(interfaceC1184q, i10);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        this.f63353a.X(4);
        interfaceC1184q.n(this.f63353a.f(), 0, 4);
        if (this.f63353a.O() != 1380533830) {
            return false;
        }
        interfaceC1184q.j(4);
        this.f63353a.X(4);
        interfaceC1184q.n(this.f63353a.f(), 0, 4);
        return this.f63353a.O() == 1464156752;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
