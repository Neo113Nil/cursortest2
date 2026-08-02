package androidx.media3.exoplayer.source;

import H1.C1180m;
import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.Q;
import androidx.media3.exoplayer.source.W;
import androidx.media3.exoplayer.source.X;
import b1.AbstractC2346O;
import b1.z;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import n1.G1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q1.C6103l;
import q1.t;

/* loaded from: classes.dex */
public final class X extends AbstractC2200a implements W.c {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4411g.a f21639h;

    /* renamed from: i, reason: collision with root package name */
    public final Q.a f21640i;

    /* renamed from: j, reason: collision with root package name */
    public final q1.u f21641j;

    /* renamed from: k, reason: collision with root package name */
    public final D1.k f21642k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21643l;

    /* renamed from: m, reason: collision with root package name */
    public final int f21644m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.a f21645n;

    /* renamed from: o, reason: collision with root package name */
    public final Ra.t f21646o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21647p;

    /* renamed from: q, reason: collision with root package name */
    public long f21648q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21649r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21650s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC4403F f21651t;

    /* renamed from: u, reason: collision with root package name */
    public b1.z f21652u;

    public class a extends AbstractC2221w {
        public a(AbstractC2346O abstractC2346O) {
            super(abstractC2346O);
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f24359f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f24387k = true;
            return cVar;
        }
    }

    public static final class b implements M {

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC4411g.a f21654c;

        /* renamed from: d, reason: collision with root package name */
        public Q.a f21655d;

        /* renamed from: e, reason: collision with root package name */
        public q1.w f21656e;

        /* renamed from: f, reason: collision with root package name */
        public D1.k f21657f;

        /* renamed from: g, reason: collision with root package name */
        public int f21658g;

        /* renamed from: h, reason: collision with root package name */
        public Ra.t f21659h;

        /* renamed from: i, reason: collision with root package name */
        public int f21660i;

        /* renamed from: j, reason: collision with root package name */
        public androidx.media3.common.a f21661j;

        public b(InterfaceC4411g.a aVar) {
            this(aVar, new C1180m());
        }

        public static /* synthetic */ Q h(H1.u uVar, G1 g12) {
            return new C2203d(uVar);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public X e(b1.z zVar) {
            AbstractC4134a.e(zVar.f24655b);
            return new X(zVar, this.f21654c, this.f21655d, this.f21656e.a(zVar), this.f21657f, this.f21658g, this.f21660i, this.f21661j, this.f21659h, null);
        }

        public b j(int i10, androidx.media3.common.a aVar) {
            this.f21660i = i10;
            this.f21661j = (androidx.media3.common.a) AbstractC4134a.e(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b d(q1.w wVar) {
            this.f21656e = (q1.w) AbstractC4134a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b g(D1.k kVar) {
            this.f21657f = (D1.k) AbstractC4134a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(InterfaceC4411g.a aVar, final H1.u uVar) {
            this(aVar, new Q.a() { // from class: androidx.media3.exoplayer.source.Y
                @Override // androidx.media3.exoplayer.source.Q.a
                public final Q a(G1 g12) {
                    return X.b.h(H1.u.this, g12);
                }
            });
        }

        public b(InterfaceC4411g.a aVar, Q.a aVar2) {
            this(aVar, aVar2, new C6103l(), new D1.j(), PKIFailureInfo.badCertTemplate);
        }

        public b(InterfaceC4411g.a aVar, Q.a aVar2, q1.w wVar, D1.k kVar, int i10) {
            this.f21654c = aVar;
            this.f21655d = aVar2;
            this.f21656e = wVar;
            this.f21657f = kVar;
            this.f21658g = i10;
        }
    }

    public /* synthetic */ X(b1.z zVar, InterfaceC4411g.a aVar, Q.a aVar2, q1.u uVar, D1.k kVar, int i10, int i11, androidx.media3.common.a aVar3, Ra.t tVar, a aVar4) {
        this(zVar, aVar, aVar2, uVar, kVar, i10, i11, aVar3, tVar);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        this.f21651t = interfaceC4403F;
        this.f21641j.a((Looper) AbstractC4134a.e(Looper.myLooper()), B());
        this.f21641j.g();
        H();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        this.f21641j.release();
    }

    public final z.h G() {
        return (z.h) AbstractC4134a.e(d().f24655b);
    }

    public final void H() {
        AbstractC2346O f0Var = new f0(this.f21648q, this.f21649r, false, this.f21650s, null, d());
        if (this.f21647p) {
            f0Var = new a(f0Var);
        }
        E(f0Var);
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        InterfaceC4411g a10 = this.f21639h.a();
        InterfaceC4403F interfaceC4403F = this.f21651t;
        if (interfaceC4403F != null) {
            a10.c(interfaceC4403F);
        }
        z.h G10 = G();
        Uri uri = G10.f24749a;
        Q a11 = this.f21640i.a(B());
        q1.u uVar = this.f21641j;
        t.a w10 = w(bVar);
        D1.k kVar = this.f21642k;
        L.a y10 = y(bVar);
        String str = G10.f24754f;
        int i10 = this.f21643l;
        int i11 = this.f21644m;
        androidx.media3.common.a aVar = this.f21645n;
        long a12 = e1.Z.a1(G10.f24758j);
        Ra.t tVar = this.f21646o;
        return new W(uri, a10, a11, uVar, w10, kVar, y10, this, bVar2, str, i10, i11, aVar, a12, tVar != null ? (E1.b) tVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized b1.z d() {
        return this.f21652u;
    }

    @Override // androidx.media3.exoplayer.source.W.c
    public void e(long j10, H1.J j11, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f21648q;
        }
        boolean i10 = j11.i();
        if (!this.f21647p && this.f21648q == j10 && this.f21649r == i10 && this.f21650s == z10) {
            return;
        }
        this.f21648q = j10;
        this.f21649r = i10;
        this.f21650s = z10;
        this.f21647p = false;
        H();
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        ((W) c10).f0();
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized void n(b1.z zVar) {
        this.f21652u = zVar;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
    }

    public X(b1.z zVar, InterfaceC4411g.a aVar, Q.a aVar2, q1.u uVar, D1.k kVar, int i10, int i11, androidx.media3.common.a aVar3, Ra.t tVar) {
        this.f21652u = zVar;
        this.f21639h = aVar;
        this.f21640i = aVar2;
        this.f21641j = uVar;
        this.f21642k = kVar;
        this.f21643l = i10;
        this.f21645n = aVar3;
        this.f21644m = i11;
        this.f21647p = true;
        this.f21648q = -9223372036854775807L;
        this.f21646o = tVar;
    }
}
