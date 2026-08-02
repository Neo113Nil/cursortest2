package androidx.media3.exoplayer.hls;

import D1.b;
import D1.e;
import D1.j;
import D1.k;
import android.os.Looper;
import androidx.media3.exoplayer.source.AbstractC2200a;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2210k;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.InterfaceC2209j;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.M;
import androidx.media3.exoplayer.source.f0;
import b1.AbstractC2332A;
import b1.z;
import e1.AbstractC4134a;
import e1.Z;
import e2.s;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.util.List;
import q1.C6103l;
import q1.u;
import q1.w;
import r1.c;
import r1.d;
import r1.g;
import r1.h;
import r1.i;
import s1.C6308a;
import s1.C6310c;
import s1.f;
import s1.l;
import s1.m;

/* loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC2200a implements m.e {

    /* renamed from: h, reason: collision with root package name */
    public final h f21227h;

    /* renamed from: i, reason: collision with root package name */
    public final g f21228i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2209j f21229j;

    /* renamed from: k, reason: collision with root package name */
    public final e f21230k;

    /* renamed from: l, reason: collision with root package name */
    public final u f21231l;

    /* renamed from: m, reason: collision with root package name */
    public final k f21232m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21233n;

    /* renamed from: o, reason: collision with root package name */
    public final int f21234o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21235p;

    /* renamed from: q, reason: collision with root package name */
    public final m f21236q;

    /* renamed from: r, reason: collision with root package name */
    public final long f21237r;

    /* renamed from: s, reason: collision with root package name */
    public final long f21238s;

    /* renamed from: t, reason: collision with root package name */
    public z.g f21239t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC4403F f21240u;

    /* renamed from: v, reason: collision with root package name */
    public z f21241v;

    public static final class Factory implements M {

        /* renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int f21242s = 0;

        /* renamed from: c, reason: collision with root package name */
        public final g f21243c;

        /* renamed from: d, reason: collision with root package name */
        public h f21244d;

        /* renamed from: e, reason: collision with root package name */
        public s.a f21245e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21246f;

        /* renamed from: g, reason: collision with root package name */
        public int f21247g;

        /* renamed from: h, reason: collision with root package name */
        public l f21248h;

        /* renamed from: i, reason: collision with root package name */
        public m.a f21249i;

        /* renamed from: j, reason: collision with root package name */
        public InterfaceC2209j f21250j;

        /* renamed from: k, reason: collision with root package name */
        public e.a f21251k;

        /* renamed from: l, reason: collision with root package name */
        public w f21252l;

        /* renamed from: m, reason: collision with root package name */
        public k f21253m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f21254n;

        /* renamed from: o, reason: collision with root package name */
        public int f21255o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f21256p;

        /* renamed from: q, reason: collision with root package name */
        public long f21257q;

        /* renamed from: r, reason: collision with root package name */
        public long f21258r;

        public Factory(InterfaceC4411g.a aVar) {
            this(new c(aVar));
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource e(z zVar) {
            AbstractC4134a.e(zVar.f24655b);
            if (this.f21244d == null) {
                this.f21244d = new d();
            }
            s.a aVar = this.f21245e;
            if (aVar != null) {
                this.f21244d.a(aVar);
            }
            this.f21244d.b(this.f21246f);
            this.f21244d.c(this.f21247g);
            h hVar = this.f21244d;
            l lVar = this.f21248h;
            List list = zVar.f24655b.f24753e;
            if (!list.isEmpty()) {
                lVar = new s1.e(lVar, list);
            }
            e.a aVar2 = this.f21251k;
            e a10 = aVar2 == null ? null : aVar2.a(zVar);
            g gVar = this.f21243c;
            InterfaceC2209j interfaceC2209j = this.f21250j;
            u a11 = this.f21252l.a(zVar);
            k kVar = this.f21253m;
            return new HlsMediaSource(zVar, gVar, hVar, interfaceC2209j, a10, a11, kVar, this.f21249i.a(this.f21243c, kVar, lVar, a10), this.f21257q, this.f21254n, this.f21255o, this.f21256p, this.f21258r);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f21246f = z10;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory c(int i10) {
            this.f21247g = i10;
            return this;
        }

        public Factory k(boolean z10) {
            this.f21254n = z10;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory f(e.a aVar) {
            this.f21251k = (e.a) AbstractC4134a.e(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f21252l = (w) AbstractC4134a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory g(k kVar) {
            this.f21253m = (k) AbstractC4134a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f21245e = aVar;
            return this;
        }

        public Factory(g gVar) {
            this.f21243c = (g) AbstractC4134a.e(gVar);
            this.f21252l = new C6103l();
            this.f21248h = new C6308a();
            this.f21249i = C6310c.f64430q;
            this.f21253m = new j();
            this.f21250j = new C2210k();
            this.f21255o = 1;
            this.f21257q = -9223372036854775807L;
            this.f21254n = true;
            b(true);
        }
    }

    static {
        AbstractC2332A.a("media3.exoplayer.hls");
    }

    public static f.d I(List list, long j10) {
        f.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            f.d dVar2 = (f.d) list.get(i10);
            long j11 = dVar2.f64533e;
            if (j11 > j10 || !dVar2.f64522l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public static f.C0896f J(List list, long j10) {
        return (f.C0896f) list.get(Z.f(list, Long.valueOf(j10), true, true));
    }

    public static long M(f fVar, long j10) {
        long j11;
        f.h hVar = fVar.f64482v;
        long j12 = fVar.f64465e;
        if (j12 != -9223372036854775807L) {
            j11 = fVar.f64481u - j12;
        } else {
            long j13 = hVar.f64543d;
            if (j13 == -9223372036854775807L || fVar.f64474n == -9223372036854775807L) {
                long j14 = hVar.f64542c;
                j11 = j14 != -9223372036854775807L ? j14 : fVar.f64473m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        this.f21240u = interfaceC4403F;
        this.f21231l.a((Looper) AbstractC4134a.e(Looper.myLooper()), B());
        this.f21231l.g();
        this.f21236q.h(((z.h) AbstractC4134a.e(d().f24655b)).f24749a, y(null), this);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        this.f21236q.stop();
        this.f21231l.release();
    }

    public final f0 G(f fVar, long j10, long j11, i iVar) {
        long d10 = fVar.f64468h - this.f21236q.d();
        long j12 = fVar.f64475o ? d10 + fVar.f64481u : -9223372036854775807L;
        long K10 = K(fVar);
        long j13 = this.f21239t.f24731a;
        N(fVar, Z.p(j13 != -9223372036854775807L ? Z.a1(j13) : M(fVar, K10), K10, fVar.f64481u + K10));
        return new f0(j10, j11, -9223372036854775807L, j12, fVar.f64481u, d10, L(fVar, K10), true, !fVar.f64475o, fVar.f64464d == 2 && fVar.f64466f, iVar, d(), this.f21239t);
    }

    public final f0 H(f fVar, long j10, long j11, i iVar) {
        long j12;
        if (fVar.f64465e == -9223372036854775807L || fVar.f64478r.isEmpty()) {
            j12 = 0;
        } else {
            if (!fVar.f64467g) {
                long j13 = fVar.f64465e;
                if (j13 != fVar.f64481u) {
                    j12 = J(fVar.f64478r, j13).f64533e;
                }
            }
            j12 = fVar.f64465e;
        }
        long j14 = j12;
        long j15 = fVar.f64481u;
        return new f0(j10, j11, -9223372036854775807L, j15, j15, 0L, j14, true, false, true, iVar, d(), null);
    }

    public final long K(f fVar) {
        if (fVar.f64476p) {
            return Z.a1(Z.m0(this.f21237r)) - fVar.e();
        }
        return 0L;
    }

    public final long L(f fVar, long j10) {
        long j11 = fVar.f64465e;
        if (j11 == -9223372036854775807L) {
            j11 = (fVar.f64481u + j10) - Z.a1(this.f21239t.f24731a);
        }
        if (fVar.f64467g) {
            return j11;
        }
        f.d I10 = I(fVar.f64479s, j11);
        if (I10 != null) {
            return I10.f64533e;
        }
        if (fVar.f64478r.isEmpty()) {
            return 0L;
        }
        f.C0896f J10 = J(fVar.f64478r, j11);
        f.d I11 = I(J10.f64528m, j11);
        return I11 != null ? I11.f64533e : J10.f64533e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(f fVar, long j10) {
        boolean z10;
        z.g gVar = d().f24657d;
        if (gVar.f24734d == -3.4028235E38f && gVar.f24735e == -3.4028235E38f) {
            f.h hVar = fVar.f64482v;
            if (hVar.f64542c == -9223372036854775807L && hVar.f64543d == -9223372036854775807L) {
                z10 = true;
                this.f21239t = new z.g.a().k(Z.J1(j10)).j(!z10 ? 1.0f : this.f21239t.f24734d).h(z10 ? 1.0f : this.f21239t.f24735e).f();
            }
        }
        z10 = false;
        this.f21239t = new z.g.a().k(Z.J1(j10)).j(!z10 ? 1.0f : this.f21239t.f24734d).h(z10 ? 1.0f : this.f21239t.f24735e).f();
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, b bVar2, long j10) {
        L.a y10 = y(bVar);
        return new r1.m(this.f21227h, this.f21236q, this.f21228i, this.f21240u, this.f21230k, this.f21231l, w(bVar), this.f21232m, y10, bVar2, this.f21229j, this.f21233n, this.f21234o, this.f21235p, B(), this.f21238s);
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized z d() {
        return this.f21241v;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        ((r1.m) c10).D();
    }

    @Override // s1.m.e
    public void h(f fVar) {
        long J12 = fVar.f64476p ? Z.J1(fVar.f64468h) : -9223372036854775807L;
        int i10 = fVar.f64464d;
        long j10 = (i10 == 2 || i10 == 1) ? J12 : -9223372036854775807L;
        i iVar = new i((s1.i) AbstractC4134a.e(this.f21236q.e()), fVar);
        E(this.f21236q.m() ? G(fVar, j10, J12, iVar) : H(fVar, j10, J12, iVar));
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized void n(z zVar) {
        this.f21241v = zVar;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
        this.f21236q.p();
    }

    public HlsMediaSource(z zVar, g gVar, h hVar, InterfaceC2209j interfaceC2209j, e eVar, u uVar, k kVar, m mVar, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f21241v = zVar;
        this.f21239t = zVar.f24657d;
        this.f21228i = gVar;
        this.f21227h = hVar;
        this.f21229j = interfaceC2209j;
        this.f21230k = eVar;
        this.f21231l = uVar;
        this.f21232m = kVar;
        this.f21236q = mVar;
        this.f21237r = j10;
        this.f21233n = z10;
        this.f21234o = i10;
        this.f21235p = z11;
        this.f21238s = j11;
    }
}
