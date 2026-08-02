package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.L;
import b1.AbstractC2346O;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;

/* loaded from: classes.dex */
public final class h0 extends AbstractC2200a {

    /* renamed from: h, reason: collision with root package name */
    public final C4418n f21797h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC4411g.a f21798i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.a f21799j;

    /* renamed from: k, reason: collision with root package name */
    public final long f21800k;

    /* renamed from: l, reason: collision with root package name */
    public final D1.k f21801l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21802m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC2346O f21803n;

    /* renamed from: o, reason: collision with root package name */
    public final b1.z f21804o;

    /* renamed from: p, reason: collision with root package name */
    public final Ra.t f21805p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC4403F f21806q;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4411g.a f21807a;

        /* renamed from: b, reason: collision with root package name */
        public D1.k f21808b = new D1.j();

        /* renamed from: c, reason: collision with root package name */
        public boolean f21809c = true;

        /* renamed from: d, reason: collision with root package name */
        public Object f21810d;

        /* renamed from: e, reason: collision with root package name */
        public String f21811e;

        /* renamed from: f, reason: collision with root package name */
        public Ra.t f21812f;

        public b(InterfaceC4411g.a aVar) {
            this.f21807a = (InterfaceC4411g.a) AbstractC4134a.e(aVar);
        }

        public h0 a(z.k kVar, long j10) {
            return new h0(this.f21811e, kVar, this.f21807a, j10, this.f21808b, this.f21809c, this.f21810d, this.f21812f);
        }

        public b b(D1.k kVar) {
            if (kVar == null) {
                kVar = new D1.j();
            }
            this.f21808b = kVar;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        this.f21806q = interfaceC4403F;
        E(this.f21803n);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        C4418n c4418n = this.f21797h;
        InterfaceC4411g.a aVar = this.f21798i;
        InterfaceC4403F interfaceC4403F = this.f21806q;
        androidx.media3.common.a aVar2 = this.f21799j;
        long j11 = this.f21800k;
        D1.k kVar = this.f21801l;
        L.a y10 = y(bVar);
        boolean z10 = this.f21802m;
        Ra.t tVar = this.f21805p;
        return new g0(c4418n, aVar, interfaceC4403F, aVar2, j11, kVar, y10, z10, tVar != null ? (E1.b) tVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.D
    public b1.z d() {
        return this.f21804o;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        ((g0) c10).w();
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
    }

    public h0(String str, z.k kVar, InterfaceC4411g.a aVar, long j10, D1.k kVar2, boolean z10, Object obj, Ra.t tVar) {
        this.f21798i = aVar;
        this.f21800k = j10;
        this.f21801l = kVar2;
        this.f21802m = z10;
        b1.z a10 = new z.c().i(Uri.EMPTY).d(kVar.f24776a.toString()).g(AbstractC3445z.u(kVar)).h(obj).a();
        this.f21804o = a10;
        a.b l02 = new a.b().y0((String) Ra.h.a(kVar.f24777b, "text/x-unknown")).n0(kVar.f24778c).A0(kVar.f24779d).w0(kVar.f24780e).l0(kVar.f24781f);
        String str2 = kVar.f24782g;
        this.f21799j = l02.j0(str2 != null ? str2 : str).P();
        this.f21797h = new C4418n.b().i(kVar.f24776a).b(1).a();
        this.f21803n = new f0(j10, true, false, false, null, a10);
        this.f21805p = tVar;
    }
}
