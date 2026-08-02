package androidx.media3.exoplayer.source;

import A1.a;
import D1.e;
import H1.C1180m;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import android.content.Context;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.C2205f;
import androidx.media3.exoplayer.source.C2220v;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.X;
import androidx.media3.exoplayer.source.h0;
import androidx.media3.exoplayer.source.r;
import b1.InterfaceC2349c;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e2.C4166h;
import e2.s;
import h1.C4419o;
import h1.InterfaceC4411g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r implements M {

    /* renamed from: c, reason: collision with root package name */
    public final a f21846c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4411g.a f21847d;

    /* renamed from: e, reason: collision with root package name */
    public s.a f21848e;

    /* renamed from: f, reason: collision with root package name */
    public D.a f21849f;

    /* renamed from: g, reason: collision with root package name */
    public a.InterfaceC0001a f21850g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2349c f21851h;

    /* renamed from: i, reason: collision with root package name */
    public D1.k f21852i;

    /* renamed from: j, reason: collision with root package name */
    public long f21853j;

    /* renamed from: k, reason: collision with root package name */
    public long f21854k;

    /* renamed from: l, reason: collision with root package name */
    public long f21855l;

    /* renamed from: m, reason: collision with root package name */
    public float f21856m;

    /* renamed from: n, reason: collision with root package name */
    public float f21857n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21858o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final H1.u f21859a;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC4411g.a f21862d;

        /* renamed from: f, reason: collision with root package name */
        public s.a f21864f;

        /* renamed from: g, reason: collision with root package name */
        public int f21865g;

        /* renamed from: h, reason: collision with root package name */
        public e.a f21866h;

        /* renamed from: i, reason: collision with root package name */
        public q1.w f21867i;

        /* renamed from: j, reason: collision with root package name */
        public D1.k f21868j;

        /* renamed from: b, reason: collision with root package name */
        public final Map f21860b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map f21861c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public boolean f21863e = true;

        public a(H1.u uVar, s.a aVar) {
            this.f21859a = uVar;
            this.f21864f = aVar;
        }

        public static /* synthetic */ D.a c(a aVar, InterfaceC4411g.a aVar2) {
            aVar.getClass();
            return new X.b(aVar2, aVar.f21859a);
        }

        public D.a f(int i10) {
            D.a aVar = (D.a) this.f21861c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            D.a aVar2 = (D.a) g(i10).get();
            e.a aVar3 = this.f21866h;
            if (aVar3 != null) {
                aVar2.f(aVar3);
            }
            q1.w wVar = this.f21867i;
            if (wVar != null) {
                aVar2.d(wVar);
            }
            D1.k kVar = this.f21868j;
            if (kVar != null) {
                aVar2.g(kVar);
            }
            aVar2.a(this.f21864f);
            aVar2.b(this.f21863e);
            aVar2.c(this.f21865g);
            this.f21861c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public final Ra.t g(int i10) {
            Ra.t tVar;
            Ra.t tVar2;
            Ra.t tVar3 = (Ra.t) this.f21860b.get(Integer.valueOf(i10));
            if (tVar3 != null) {
                return tVar3;
            }
            final InterfaceC4411g.a aVar = (InterfaceC4411g.a) AbstractC4134a.e(this.f21862d);
            if (i10 == 0) {
                int i11 = DashMediaSource.Factory.f20987l;
                final Class asSubclass = DashMediaSource.Factory.class.asSubclass(D.a.class);
                tVar = new Ra.t() { // from class: androidx.media3.exoplayer.source.m
                    @Override // Ra.t
                    public final Object get() {
                        D.a p10;
                        p10 = r.p(asSubclass, aVar);
                        return p10;
                    }
                };
            } else if (i10 == 1) {
                int i12 = SsMediaSource.Factory.f21459k;
                final Class asSubclass2 = SsMediaSource.Factory.class.asSubclass(D.a.class);
                tVar = new Ra.t() { // from class: androidx.media3.exoplayer.source.n
                    @Override // Ra.t
                    public final Object get() {
                        D.a p10;
                        p10 = r.p(asSubclass2, aVar);
                        return p10;
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int i13 = RtspMediaSource$Factory.f21438c;
                        final Class asSubclass3 = RtspMediaSource$Factory.class.asSubclass(D.a.class);
                        tVar2 = new Ra.t() { // from class: androidx.media3.exoplayer.source.p
                            @Override // Ra.t
                            public final Object get() {
                                D.a o10;
                                o10 = r.o(asSubclass3);
                                return o10;
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        tVar2 = new Ra.t() { // from class: androidx.media3.exoplayer.source.q
                            @Override // Ra.t
                            public final Object get() {
                                return r.a.c(r.a.this, aVar);
                            }
                        };
                    }
                    this.f21860b.put(Integer.valueOf(i10), tVar2);
                    return tVar2;
                }
                int i14 = HlsMediaSource.Factory.f21242s;
                final Class asSubclass4 = HlsMediaSource.Factory.class.asSubclass(D.a.class);
                tVar = new Ra.t() { // from class: androidx.media3.exoplayer.source.o
                    @Override // Ra.t
                    public final Object get() {
                        D.a p10;
                        p10 = r.p(asSubclass4, aVar);
                        return p10;
                    }
                };
            }
            tVar2 = tVar;
            this.f21860b.put(Integer.valueOf(i10), tVar2);
            return tVar2;
        }

        public void h(e.a aVar) {
            this.f21866h = aVar;
            Iterator it = this.f21861c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).f(aVar);
            }
        }

        public void i(int i10) {
            this.f21865g = i10;
            this.f21859a.c(i10);
        }

        public void j(InterfaceC4411g.a aVar) {
            if (aVar != this.f21862d) {
                this.f21862d = aVar;
                this.f21860b.clear();
                this.f21861c.clear();
            }
        }

        public void k(q1.w wVar) {
            this.f21867i = wVar;
            Iterator it = this.f21861c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).d(wVar);
            }
        }

        public void l(int i10) {
            H1.u uVar = this.f21859a;
            if (uVar instanceof C1180m) {
                ((C1180m) uVar).n(i10);
            }
        }

        public void m(D1.k kVar) {
            this.f21868j = kVar;
            Iterator it = this.f21861c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).g(kVar);
            }
        }

        public void n(boolean z10) {
            this.f21863e = z10;
            this.f21859a.b(z10);
            Iterator it = this.f21861c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).b(z10);
            }
        }

        public void o(s.a aVar) {
            this.f21864f = aVar;
            this.f21859a.a(aVar);
            Iterator it = this.f21861c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).a(aVar);
            }
        }
    }

    public static final class b implements InterfaceC1183p {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f21869a;

        public b(androidx.media3.common.a aVar) {
            this.f21869a = aVar;
        }

        @Override // H1.InterfaceC1183p
        public void a(long j10, long j11) {
        }

        @Override // H1.InterfaceC1183p
        public void c(H1.r rVar) {
            H1.O c10 = rVar.c(0, 3);
            rVar.q(new J.b(-9223372036854775807L));
            rVar.s();
            c10.c(this.f21869a.b().y0("text/x-unknown").U(this.f21869a.f20543o).P());
        }

        @Override // H1.InterfaceC1183p
        public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
            return interfaceC1184q.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // H1.InterfaceC1183p
        public boolean j(InterfaceC1184q interfaceC1184q) {
            return true;
        }

        @Override // H1.InterfaceC1183p
        public void release() {
        }
    }

    public r(Context context, H1.u uVar) {
        this(new C4419o.a(context), uVar);
    }

    public static /* synthetic */ InterfaceC1183p[] h(r rVar, androidx.media3.common.a aVar) {
        return new InterfaceC1183p[]{rVar.f21848e.a(aVar) ? new e2.o(rVar.f21848e.c(aVar), null) : new b(aVar)};
    }

    public static D m(b1.z zVar, D d10) {
        z.d dVar = zVar.f24659f;
        return (dVar.f24686b == 0 && dVar.f24688d == Long.MIN_VALUE && !dVar.f24690f) ? d10 : new C2205f.b(d10).n(zVar.f24659f.f24686b).l(zVar.f24659f.f24688d).k(!zVar.f24659f.f24691g).i(zVar.f24659f.f24689e).m(zVar.f24659f.f24690f).j(zVar.f24659f.f24692h).h();
    }

    public static D.a o(Class cls) {
        try {
            return (D.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static D.a p(Class cls, InterfaceC4411g.a aVar) {
        try {
            return (D.a) cls.getConstructor(InterfaceC4411g.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.D.a
    public D e(b1.z zVar) {
        AbstractC4134a.e(zVar.f24655b);
        String scheme = zVar.f24655b.f24749a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((D.a) AbstractC4134a.e(this.f21849f)).e(zVar);
        }
        if (Objects.equals(zVar.f24655b.f24750b, "application/x-image-uri")) {
            long a12 = e1.Z.a1(zVar.f24655b.f24758j);
            android.support.v4.media.session.b.a(AbstractC4134a.e(null));
            return new C2220v.b(a12, null).e(zVar);
        }
        z.h hVar = zVar.f24655b;
        int I02 = e1.Z.I0(hVar.f24749a, hVar.f24750b);
        if (zVar.f24655b.f24758j != -9223372036854775807L) {
            this.f21846c.l(1);
        }
        try {
            D.a f10 = this.f21846c.f(I02);
            z.g.a a10 = zVar.f24657d.a();
            if (zVar.f24657d.f24731a == -9223372036854775807L) {
                a10.k(this.f21853j);
            }
            if (zVar.f24657d.f24734d == -3.4028235E38f) {
                a10.j(this.f21856m);
            }
            if (zVar.f24657d.f24735e == -3.4028235E38f) {
                a10.h(this.f21857n);
            }
            if (zVar.f24657d.f24732b == -9223372036854775807L) {
                a10.i(this.f21854k);
            }
            if (zVar.f24657d.f24733c == -9223372036854775807L) {
                a10.g(this.f21855l);
            }
            z.g f11 = a10.f();
            if (!f11.equals(zVar.f24657d)) {
                zVar = zVar.a().c(f11).a();
            }
            D e10 = f10.e(zVar);
            AbstractC3445z abstractC3445z = ((z.h) e1.Z.i(zVar.f24655b)).f24755g;
            if (!abstractC3445z.isEmpty()) {
                D[] dArr = new D[abstractC3445z.size() + 1];
                dArr[0] = e10;
                for (int i10 = 0; i10 < abstractC3445z.size(); i10++) {
                    if (this.f21858o) {
                        final androidx.media3.common.a P10 = new a.b().y0(((z.k) abstractC3445z.get(i10)).f24777b).n0(((z.k) abstractC3445z.get(i10)).f24778c).A0(((z.k) abstractC3445z.get(i10)).f24779d).w0(((z.k) abstractC3445z.get(i10)).f24780e).l0(((z.k) abstractC3445z.get(i10)).f24781f).j0(((z.k) abstractC3445z.get(i10)).f24782g).P();
                        X.b bVar = new X.b(this.f21847d, new H1.u() { // from class: androidx.media3.exoplayer.source.l
                            @Override // H1.u
                            public final InterfaceC1183p[] f() {
                                return r.h(r.this, P10);
                            }
                        });
                        if (this.f21848e.a(P10)) {
                            P10 = P10.b().y0("application/x-media3-cues").U(P10.f20543o).Y(this.f21848e.b(P10)).P();
                        }
                        X.b j10 = bVar.j(0, P10);
                        D1.k kVar = this.f21852i;
                        if (kVar != null) {
                            j10.g(kVar);
                        }
                        dArr[i10 + 1] = j10.e(b1.z.c(((z.k) abstractC3445z.get(i10)).f24776a.toString()));
                    } else {
                        h0.b bVar2 = new h0.b(this.f21847d);
                        D1.k kVar2 = this.f21852i;
                        if (kVar2 != null) {
                            bVar2.b(kVar2);
                        }
                        dArr[i10 + 1] = bVar2.a((z.k) abstractC3445z.get(i10), -9223372036854775807L);
                    }
                }
                e10 = new P(dArr);
            }
            return n(zVar, m(zVar, e10));
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // androidx.media3.exoplayer.source.D.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public r b(boolean z10) {
        this.f21858o = z10;
        this.f21846c.n(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.D.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public r c(int i10) {
        this.f21846c.i(i10);
        return this;
    }

    public final D n(b1.z zVar, D d10) {
        AbstractC4134a.e(zVar.f24655b);
        z.b bVar = zVar.f24655b.f24752d;
        return d10;
    }

    @Override // androidx.media3.exoplayer.source.D.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public r f(e.a aVar) {
        this.f21846c.h((e.a) AbstractC4134a.e(aVar));
        return this;
    }

    public r r(InterfaceC4411g.a aVar) {
        this.f21847d = aVar;
        this.f21846c.j(aVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.D.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public r d(q1.w wVar) {
        this.f21846c.k((q1.w) AbstractC4134a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.D.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public r g(D1.k kVar) {
        this.f21852i = (D1.k) AbstractC4134a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f21846c.m(kVar);
        return this;
    }

    public r u(a.InterfaceC0001a interfaceC0001a, InterfaceC2349c interfaceC2349c) {
        this.f21850g = (a.InterfaceC0001a) AbstractC4134a.e(interfaceC0001a);
        this.f21851h = (InterfaceC2349c) AbstractC4134a.e(interfaceC2349c);
        return this;
    }

    public r v(D.a aVar) {
        this.f21849f = aVar;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.D.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public r a(s.a aVar) {
        this.f21848e = (s.a) AbstractC4134a.e(aVar);
        this.f21846c.o(aVar);
        return this;
    }

    public r(InterfaceC4411g.a aVar) {
        this(aVar, new C1180m());
    }

    public r(InterfaceC4411g.a aVar, H1.u uVar) {
        this.f21847d = aVar;
        C4166h c4166h = new C4166h();
        this.f21848e = c4166h;
        a aVar2 = new a(uVar, c4166h);
        this.f21846c = aVar2;
        aVar2.j(aVar);
        this.f21853j = -9223372036854775807L;
        this.f21854k = -9223372036854775807L;
        this.f21855l = -9223372036854775807L;
        this.f21856m = -3.4028235E38f;
        this.f21857n = -3.4028235E38f;
        this.f21858o = true;
    }
}
