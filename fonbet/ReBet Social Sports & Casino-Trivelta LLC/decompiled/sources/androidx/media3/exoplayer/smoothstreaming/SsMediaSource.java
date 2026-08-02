package androidx.media3.exoplayer.smoothstreaming;

import D1.e;
import D1.f;
import D1.j;
import D1.k;
import D1.m;
import D1.n;
import D1.o;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.a;
import androidx.media3.exoplayer.smoothstreaming.b;
import androidx.media3.exoplayer.source.AbstractC2200a;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2210k;
import androidx.media3.exoplayer.source.C2223y;
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
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import q1.C6103l;
import q1.u;
import q1.w;
import x1.C6778b;
import z1.C6909a;
import z1.C6910b;

/* loaded from: classes.dex */
public final class SsMediaSource extends AbstractC2200a implements m.b {

    /* renamed from: A, reason: collision with root package name */
    public z f21439A;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21440h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f21441i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC4411g.a f21442j;

    /* renamed from: k, reason: collision with root package name */
    public final b.a f21443k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2209j f21444l;

    /* renamed from: m, reason: collision with root package name */
    public final e f21445m;

    /* renamed from: n, reason: collision with root package name */
    public final u f21446n;

    /* renamed from: o, reason: collision with root package name */
    public final k f21447o;

    /* renamed from: p, reason: collision with root package name */
    public final long f21448p;

    /* renamed from: q, reason: collision with root package name */
    public final L.a f21449q;

    /* renamed from: r, reason: collision with root package name */
    public final o.a f21450r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f21451s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC4411g f21452t;

    /* renamed from: u, reason: collision with root package name */
    public m f21453u;

    /* renamed from: v, reason: collision with root package name */
    public n f21454v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC4403F f21455w;

    /* renamed from: x, reason: collision with root package name */
    public long f21456x;

    /* renamed from: y, reason: collision with root package name */
    public C6909a f21457y;

    /* renamed from: z, reason: collision with root package name */
    public Handler f21458z;

    public static final class Factory implements M {

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f21459k = 0;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f21460c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC4411g.a f21461d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC2209j f21462e;

        /* renamed from: f, reason: collision with root package name */
        public e.a f21463f;

        /* renamed from: g, reason: collision with root package name */
        public w f21464g;

        /* renamed from: h, reason: collision with root package name */
        public k f21465h;

        /* renamed from: i, reason: collision with root package name */
        public long f21466i;

        /* renamed from: j, reason: collision with root package name */
        public o.a f21467j;

        public Factory(InterfaceC4411g.a aVar) {
            this(new a.C0391a(aVar), aVar);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public SsMediaSource e(z zVar) {
            AbstractC4134a.e(zVar.f24655b);
            o.a aVar = this.f21467j;
            if (aVar == null) {
                aVar = new C6910b();
            }
            List list = zVar.f24655b.f24753e;
            o.a c6778b = !list.isEmpty() ? new C6778b(aVar, list) : aVar;
            e.a aVar2 = this.f21463f;
            return new SsMediaSource(zVar, null, this.f21461d, c6778b, this.f21460c, this.f21462e, aVar2 == null ? null : aVar2.a(zVar), this.f21464g.a(zVar), this.f21465h, this.f21466i);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f21460c.b(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory f(e.a aVar) {
            this.f21463f = (e.a) AbstractC4134a.e(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f21464g = (w) AbstractC4134a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory g(k kVar) {
            this.f21465h = (k) AbstractC4134a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f21460c.a((s.a) AbstractC4134a.e(aVar));
            return this;
        }

        public Factory(b.a aVar, InterfaceC4411g.a aVar2) {
            this.f21460c = (b.a) AbstractC4134a.e(aVar);
            this.f21461d = aVar2;
            this.f21464g = new C6103l();
            this.f21465h = new j();
            this.f21466i = 30000L;
            this.f21462e = new C2210k();
            b(true);
        }
    }

    static {
        AbstractC2332A.a("media3.exoplayer.smoothstreaming");
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        this.f21455w = interfaceC4403F;
        this.f21446n.a(Looper.myLooper(), B());
        this.f21446n.g();
        if (this.f21440h) {
            this.f21454v = new n.a();
            L();
            return;
        }
        this.f21452t = this.f21442j.a();
        m mVar = new m("SsMediaSource");
        this.f21453u = mVar;
        this.f21454v = mVar;
        this.f21458z = Z.z();
        N();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        this.f21457y = this.f21440h ? this.f21457y : null;
        this.f21452t = null;
        this.f21456x = 0L;
        m mVar = this.f21453u;
        if (mVar != null) {
            mVar.l();
            this.f21453u = null;
        }
        Handler handler = this.f21458z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f21458z = null;
        }
        this.f21446n.release();
    }

    @Override // D1.m.b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void l(o oVar, long j10, long j11, boolean z10) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f21447o.d(oVar.f2474a);
        this.f21449q.l(c2223y, oVar.f2476c);
    }

    @Override // D1.m.b
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void i(o oVar, long j10, long j11) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f21447o.d(oVar.f2474a);
        this.f21449q.o(c2223y, oVar.f2476c);
        this.f21457y = (C6909a) oVar.e();
        this.f21456x = j10 - j11;
        L();
        M();
    }

    @Override // D1.m.b
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long b10 = this.f21447o.b(new k.c(c2223y, new B(oVar.f2476c), iOException, i10));
        m.c h10 = b10 == -9223372036854775807L ? m.f2457g : m.h(false, b10);
        boolean c10 = h10.c();
        this.f21449q.s(c2223y, oVar.f2476c, iOException, !c10);
        if (!c10) {
            this.f21447o.d(oVar.f2474a);
        }
        return h10;
    }

    @Override // D1.m.b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void j(o oVar, long j10, long j11, int i10) {
        this.f21449q.u(i10 == 0 ? new C2223y(oVar.f2474a, oVar.f2475b, j10) : new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f2476c, i10);
    }

    public final void L() {
        f0 f0Var;
        for (int i10 = 0; i10 < this.f21451s.size(); i10++) {
            ((c) this.f21451s.get(i10)).x(this.f21457y);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (C6909a.b bVar : this.f21457y.streamElements) {
            if (bVar.f68488j > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f68488j - 1) + bVar.c(bVar.f68488j - 1));
            }
        }
        if (j11 == LongCompanionObject.MAX_VALUE) {
            long j12 = this.f21457y.f68474d ? -9223372036854775807L : 0L;
            C6909a c6909a = this.f21457y;
            boolean z10 = c6909a.f68474d;
            f0Var = new f0(j12, 0L, 0L, 0L, true, z10, z10, c6909a, d());
        } else {
            C6909a c6909a2 = this.f21457y;
            if (c6909a2.f68474d) {
                long j13 = c6909a2.f68477g;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long a12 = j15 - Z.a1(this.f21448p);
                if (a12 < 5000000) {
                    a12 = Math.min(5000000L, j15 / 2);
                }
                f0Var = new f0(-9223372036854775807L, j15, j14, a12, true, true, true, this.f21457y, d());
            } else {
                long j16 = c6909a2.f68476f;
                if (j16 == -9223372036854775807L) {
                    j16 = j10 - j11;
                }
                long j17 = j16;
                f0Var = new f0(j11 + j17, j17, j11, 0L, true, false, false, this.f21457y, d());
            }
        }
        E(f0Var);
    }

    public final void M() {
        if (this.f21457y.f68474d) {
            this.f21458z.postDelayed(new Runnable() { // from class: y1.b
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.N();
                }
            }, Math.max(0L, (this.f21456x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void N() {
        if (this.f21453u.i()) {
            return;
        }
        C4418n a10 = new C4418n.b().i(this.f21441i).b(1).a();
        if (this.f21445m != null) {
            f.C0047f l10 = new f.C0047f(this.f21445m, "s").l(X9.m.f13664a);
            C6909a c6909a = this.f21457y;
            if (c6909a != null) {
                l10.i(c6909a.f68474d);
            }
            a10 = l10.a().a(a10);
        }
        o oVar = new o(this.f21452t, a10, 4, this.f21450r);
        this.f21453u.n(oVar, this, this.f21447o.c(oVar.f2476c));
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        L.a y10 = y(bVar);
        c cVar = new c(this.f21457y, this.f21443k, this.f21455w, this.f21444l, this.f21445m, this.f21446n, w(bVar), this.f21447o, y10, this.f21454v, bVar2);
        this.f21451s.add(cVar);
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized z d() {
        return this.f21439A;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        ((c) c10).w();
        this.f21451s.remove(c10);
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized void n(z zVar) {
        this.f21439A = zVar;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
        this.f21454v.a();
    }

    public SsMediaSource(z zVar, C6909a c6909a, InterfaceC4411g.a aVar, o.a aVar2, b.a aVar3, InterfaceC2209j interfaceC2209j, e eVar, u uVar, k kVar, long j10) {
        AbstractC4134a.g(c6909a == null || !c6909a.f68474d);
        this.f21439A = zVar;
        z.h hVar = (z.h) AbstractC4134a.e(zVar.f24655b);
        this.f21457y = c6909a;
        this.f21441i = hVar.f24749a.equals(Uri.EMPTY) ? null : Z.F(hVar.f24749a);
        this.f21442j = aVar;
        this.f21450r = aVar2;
        this.f21443k = aVar3;
        this.f21444l = interfaceC2209j;
        this.f21445m = eVar;
        this.f21446n = uVar;
        this.f21447o = kVar;
        this.f21448p = j10;
        this.f21449q = y(null);
        this.f21440h = c6909a != null;
        this.f21451s = new ArrayList();
    }
}
