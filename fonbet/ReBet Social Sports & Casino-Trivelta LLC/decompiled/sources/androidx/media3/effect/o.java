package androidx.media3.effect;

import androidx.media3.effect.r;
import b1.C2366u;
import b1.C2368w;
import b1.InterfaceC2336E;
import b1.InterfaceC2367v;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import java.util.Objects;
import l1.AbstractC5366l;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: d, reason: collision with root package name */
    public h f20840d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2336E f20841e;

    /* renamed from: f, reason: collision with root package name */
    public C2366u f20842f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2367v f20843g;

    public o(InterfaceC2367v interfaceC2367v, r rVar) {
        super(rVar);
        this.f20843g = interfaceC2367v;
    }

    public static /* synthetic */ void s(o oVar) {
        ((h) AbstractC4134a.e(oVar.f20840d)).h();
        AbstractC5366l.e("TexIdTextureManager", "SignalEOS", Long.MIN_VALUE);
    }

    public static /* synthetic */ void t(o oVar, int i10, C2366u c2366u, long j10) {
        oVar.getClass();
        androidx.media3.common.a aVar = c2366u.f24632a;
        ((h) AbstractC4134a.e(oVar.f20840d)).g(new C2368w(i10, -1, -1, aVar.f20550v, aVar.f20551w), j10);
        AbstractC5366l.f("VideoFrameProcessor", "QueueTexture", j10, "%dx%d", Integer.valueOf(c2366u.f24632a.f20550v), Integer.valueOf(c2366u.f24632a.f20551w));
    }

    @Override // androidx.media3.effect.i.b
    public void b(final C2368w c2368w) {
        this.f20844a.j(new r.b() { // from class: l1.U0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                ((InterfaceC2336E) AbstractC4134a.e(androidx.media3.effect.o.this.f20841e)).a(c2368w.f24635a, AbstractC4151s.p());
            }
        });
    }

    @Override // androidx.media3.effect.p
    public synchronized void d() {
        ((h) AbstractC4134a.e(this.f20840d)).a();
        super.d();
    }

    @Override // androidx.media3.effect.i.b
    public void e() {
        AbstractC4134a.e(this.f20840d);
        r rVar = this.f20844a;
        final h hVar = this.f20840d;
        Objects.requireNonNull(hVar);
        rVar.j(new r.b() { // from class: l1.V0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.h.this.e();
            }
        });
    }

    @Override // androidx.media3.effect.p
    public int g() {
        return ((h) AbstractC4134a.e(this.f20840d)).f();
    }

    @Override // androidx.media3.effect.p
    public void i(final int i10, final long j10) {
        final C2366u c2366u = (C2366u) AbstractC4134a.e(this.f20842f);
        AbstractC4134a.e(this.f20841e);
        this.f20844a.j(new r.b() { // from class: l1.W0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.o.t(androidx.media3.effect.o.this, i10, c2366u, j10);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public void k() {
    }

    @Override // androidx.media3.effect.p
    public void m(C2366u c2366u, boolean z10) {
        this.f20842f = c2366u;
    }

    @Override // androidx.media3.effect.p
    public void o(InterfaceC2336E interfaceC2336E) {
        this.f20841e = interfaceC2336E;
    }

    @Override // androidx.media3.effect.p
    public void p(i iVar) {
        this.f20840d = new h(this.f20843g, iVar, this.f20844a);
    }

    @Override // androidx.media3.effect.p
    public void q() {
        this.f20844a.j(new r.b() { // from class: l1.T0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.o.s(androidx.media3.effect.o.this);
            }
        });
    }
}
