package u3;

import Ak.C2436a;
import Am.C2438a;
import B0.A0;
import B0.C2454a;
import B4.V;
import B90.C2618u;
import Bk.C2638a;
import C.C2702w;
import El.C2971a;
import F3.C3013s;
import F3.C3016v;
import F3.InterfaceC3018x;
import I0.C3173b;
import Ij.C3261b;
import J0.C3349u1;
import J0.C3354v2;
import N3.C3660k;
import N3.C3661l;
import T7.Q;
import Tz.C4055a;
import U7.C4056a;
import Ve.C4636t5;
import Ve.Om;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.C5449k;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.AbstractC5881z;
import com.google.firebase.messaging.C5939u;
import io.sentry.d3;
import j3.AbstractC7252H;
import j3.C7255K;
import j3.C7256L;
import j3.C7271m;
import j3.C7272n;
import j3.C7275q;
import j3.y;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Objects;
import l3.C7855a;
import l3.C7856b;
import m3.InterfaceC8064f;
import m3.InterfaceC8073o;
import m3.r;
import t3.C9737c;
import t3.C9738d;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public final class t implements InterfaceC9927a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8064f f99862a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7252H.b f99863b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7252H.c f99864c;

    /* renamed from: d, reason: collision with root package name */
    private final a f99865d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<InterfaceC9928b.a> f99866e;

    /* renamed from: f, reason: collision with root package name */
    private m3.r<InterfaceC9928b> f99867f;

    /* renamed from: g, reason: collision with root package name */
    private j3.y f99868g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC8073o f99869h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f99870i;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7252H.b f99871a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5880y<InterfaceC3018x.b> f99872b = AbstractC5880y.v();

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5881z<InterfaceC3018x.b, AbstractC7252H> f99873c = AbstractC5881z.p();

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3018x.b f99874d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC3018x.b f99875e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC3018x.b f99876f;

        public a(AbstractC7252H.b bVar) {
            this.f99871a = bVar;
        }

        private void b(AbstractC5881z.a<InterfaceC3018x.b, AbstractC7252H> aVar, InterfaceC3018x.b bVar, AbstractC7252H abstractC7252H) {
            if (bVar == null) {
                return;
            }
            if (abstractC7252H.getIndexOfPeriod(bVar.f8751a) != -1) {
                aVar.b(bVar, abstractC7252H);
                return;
            }
            AbstractC7252H abstractC7252H2 = this.f99873c.get(bVar);
            if (abstractC7252H2 != null) {
                aVar.b(bVar, abstractC7252H2);
            }
        }

        private static InterfaceC3018x.b c(j3.y yVar, AbstractC5880y<InterfaceC3018x.b> abstractC5880y, InterfaceC3018x.b bVar, AbstractC7252H.b bVar2) {
            AbstractC7252H G11 = yVar.G();
            int r11 = yVar.r();
            Object uidOfPeriod = G11.isEmpty() ? null : G11.getUidOfPeriod(r11);
            int b11 = (yVar.e() || G11.isEmpty()) ? -1 : G11.getPeriod(r11, bVar2).b(m3.N.Q(yVar.getCurrentPosition()) - bVar2.f68941e);
            for (int i11 = 0; i11 < abstractC5880y.size(); i11++) {
                InterfaceC3018x.b bVar3 = abstractC5880y.get(i11);
                if (i(bVar3, uidOfPeriod, yVar.e(), yVar.k(), yVar.u(), b11)) {
                    return bVar3;
                }
            }
            if (abstractC5880y.isEmpty() && bVar != null && i(bVar, uidOfPeriod, yVar.e(), yVar.k(), yVar.u(), b11)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(InterfaceC3018x.b bVar, Object obj, boolean z11, int i11, int i12, int i13) {
            if (!bVar.f8751a.equals(obj)) {
                return false;
            }
            int i14 = bVar.f8752b;
            if (z11 && i14 == i11 && bVar.f8753c == i12) {
                return true;
            }
            return !z11 && i14 == -1 && bVar.f8755e == i13;
        }

        private void m(AbstractC7252H abstractC7252H) {
            AbstractC5881z.a<InterfaceC3018x.b, AbstractC7252H> b11 = AbstractC5881z.b();
            if (this.f99872b.isEmpty()) {
                b(b11, this.f99875e, abstractC7252H);
                if (!Objects.equals(this.f99876f, this.f99875e)) {
                    b(b11, this.f99876f, abstractC7252H);
                }
                if (!Objects.equals(this.f99874d, this.f99875e) && !Objects.equals(this.f99874d, this.f99876f)) {
                    b(b11, this.f99874d, abstractC7252H);
                }
            } else {
                for (int i11 = 0; i11 < this.f99872b.size(); i11++) {
                    b(b11, this.f99872b.get(i11), abstractC7252H);
                }
                if (!this.f99872b.contains(this.f99874d)) {
                    b(b11, this.f99874d, abstractC7252H);
                }
            }
            this.f99873c = b11.a();
        }

        public final InterfaceC3018x.b d() {
            return this.f99874d;
        }

        public final InterfaceC3018x.b e() {
            if (this.f99872b.isEmpty()) {
                return null;
            }
            return (InterfaceC3018x.b) com.google.common.collect.B.b(this.f99872b);
        }

        public final AbstractC7252H f(InterfaceC3018x.b bVar) {
            return this.f99873c.get(bVar);
        }

        public final InterfaceC3018x.b g() {
            return this.f99875e;
        }

        public final InterfaceC3018x.b h() {
            return this.f99876f;
        }

        public final void j(j3.y yVar) {
            this.f99874d = c(yVar, this.f99872b, this.f99875e, this.f99871a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void k(List<InterfaceC3018x.b> list, InterfaceC3018x.b bVar, j3.y yVar) {
            this.f99872b = AbstractC5880y.n(list);
            if (!((AbstractCollection) list).isEmpty()) {
                this.f99875e = (InterfaceC3018x.b) list.get(0);
                bVar.getClass();
                this.f99876f = bVar;
            }
            if (this.f99874d == null) {
                this.f99874d = c(yVar, this.f99872b, this.f99875e, this.f99871a);
            }
            m(yVar.G());
        }

        public final void l(j3.y yVar) {
            this.f99874d = c(yVar, this.f99872b, this.f99875e, this.f99871a);
            m(yVar.G());
        }
    }

    public t(InterfaceC8064f interfaceC8064f) {
        interfaceC8064f.getClass();
        this.f99862a = interfaceC8064f;
        int i11 = m3.N.f74289a;
        Looper myLooper = Looper.myLooper();
        this.f99867f = new m3.r<>(myLooper == null ? Looper.getMainLooper() : myLooper, interfaceC8064f, new K00.b());
        AbstractC7252H.b bVar = new AbstractC7252H.b();
        this.f99863b = bVar;
        this.f99864c = new AbstractC7252H.c();
        this.f99865d = new a(bVar);
        this.f99866e = new SparseArray<>();
    }

    public static void h0(t tVar) {
        InterfaceC9928b.a i02 = tVar.i0();
        tVar.n0(i02, 1028, new Gk0.b(i02));
        tVar.f99867f.f();
    }

    private InterfaceC9928b.a j0(InterfaceC3018x.b bVar) {
        this.f99868g.getClass();
        AbstractC7252H f7 = bVar == null ? null : this.f99865d.f(bVar);
        if (bVar != null && f7 != null) {
            return k0(f7, f7.getPeriodByUid(bVar.f8751a, this.f99863b).f68939c, bVar);
        }
        int R11 = this.f99868g.R();
        AbstractC7252H G11 = this.f99868g.G();
        if (R11 >= G11.getWindowCount()) {
            G11 = AbstractC7252H.EMPTY;
        }
        return k0(G11, R11, null);
    }

    private InterfaceC9928b.a l0(int i11, InterfaceC3018x.b bVar) {
        this.f99868g.getClass();
        if (bVar != null) {
            return this.f99865d.f(bVar) != null ? j0(bVar) : k0(AbstractC7252H.EMPTY, i11, bVar);
        }
        AbstractC7252H G11 = this.f99868g.G();
        if (i11 >= G11.getWindowCount()) {
            G11 = AbstractC7252H.EMPTY;
        }
        return k0(G11, i11, null);
    }

    private InterfaceC9928b.a m0() {
        return j0(this.f99865d.h());
    }

    @Override // w3.i
    public final void A(int i11, InterfaceC3018x.b bVar, int i12) {
        InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1022, new Tl.b(l02, i12));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u3.c] */
    @Override // u3.InterfaceC9927a
    public final void B(final j3.y yVar, Looper looper) {
        G10.a.h(this.f99868g == null || this.f99865d.f99872b.isEmpty());
        yVar.getClass();
        this.f99868g = yVar;
        this.f99869h = this.f99862a.a(looper, null);
        this.f99867f = this.f99867f.c(looper, new r.b() { // from class: u3.c
            @Override // m3.r.b
            public final void d(Object obj, C7271m c7271m) {
                ((InterfaceC9928b) obj).onEvents(yVar, new InterfaceC9928b.C2198b(c7271m, t.this.f99866e));
            }
        });
    }

    @Override // J3.d.a
    public final void C(final int i11, final long j11, final long j12) {
        final InterfaceC9928b.a j02 = j0(this.f99865d.e());
        n0(j02, 1006, new r.a() { // from class: u3.p
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onBandwidthEstimate(InterfaceC9928b.a.this, i11, j11, j12);
            }
        });
    }

    @Override // j3.y.c
    public final void D(boolean z11) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 9, new Fj.c(i02, z11));
    }

    @Override // j3.y.c
    public final void E(int i11) {
        j3.y yVar = this.f99868g;
        yVar.getClass();
        this.f99865d.l(yVar);
        n0(i0(), 0, new T7.E());
    }

    @Override // w3.i
    public final void F(int i11, InterfaceC3018x.b bVar) {
        InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1025, new TY.a(l02));
    }

    @Override // u3.InterfaceC9927a
    public final void G(InterfaceC9928b interfaceC9928b) {
        interfaceC9928b.getClass();
        this.f99867f.b(interfaceC9928b);
    }

    @Override // F3.F
    public final void H(int i11, InterfaceC3018x.b bVar, final C3016v c3016v) {
        final InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new r.a() { // from class: u3.h
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onDownstreamFormatChanged(InterfaceC9928b.a.this, c3016v);
            }
        });
    }

    @Override // F3.F
    public final void I(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v) {
        n0(l0(i11, bVar), 1001, new C2638a());
    }

    @Override // u3.InterfaceC9927a
    public final void J(InterfaceC9928b interfaceC9928b) {
        this.f99867f.g(interfaceC9928b);
    }

    @Override // u3.InterfaceC9927a
    public final void K(List<InterfaceC3018x.b> list, InterfaceC3018x.b bVar) {
        j3.y yVar = this.f99868g;
        yVar.getClass();
        this.f99865d.k(list, bVar, yVar);
    }

    @Override // j3.y.c
    public final void L(int i11, boolean z11) {
        n0(i0(), -1, new C3661l());
    }

    @Override // F3.F
    public final void M(int i11, InterfaceC3018x.b bVar, C3016v c3016v) {
        InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, new Lc.a(l02, c3016v));
    }

    @Override // j3.y.c
    public final void N(final boolean z11) {
        final InterfaceC9928b.a i02 = i0();
        n0(i02, 7, new r.a() { // from class: u3.d
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onIsPlayingChanged(InterfaceC9928b.a.this, z11);
            }
        });
    }

    @Override // j3.y.c
    public final void O(int i11) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 6, new D40.c(i02, i11));
    }

    @Override // w3.i
    public final void P(int i11, InterfaceC3018x.b bVar) {
        InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1023, new F3.G(l02));
    }

    @Override // j3.y.c
    public final void Q(j3.y yVar, y.b bVar) {
    }

    @Override // j3.y.c
    public final void R(j3.x xVar) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 12, new C2618u(i02, xVar));
    }

    @Override // u3.InterfaceC9927a
    public final void S() {
        if (this.f99870i) {
            return;
        }
        InterfaceC9928b.a i02 = i0();
        this.f99870i = true;
        n0(i02, -1, new Kk.c(i02));
    }

    @Override // j3.y.c
    public final void T(y.a aVar) {
        n0(i0(), 13, new C4056a());
    }

    @Override // F3.F
    public final void U(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v, final IOException iOException, final boolean z11) {
        final InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1003, new r.a() { // from class: u3.j
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onLoadError(InterfaceC9928b.a.this, c3013s, c3016v, iOException, z11);
            }
        });
    }

    @Override // w3.i
    public final void V(int i11, InterfaceC3018x.b bVar) {
        InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1027, new C2971a(l02));
    }

    @Override // j3.y.c
    public final void W(int i11, int i12) {
        InterfaceC9928b.a m02 = m0();
        n0(m02, 24, new Pk0.e(m02, i11, i12));
    }

    @Override // F3.F
    public final void X(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v) {
        final InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1002, new r.a() { // from class: u3.l
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onLoadCanceled(InterfaceC9928b.a.this, c3013s, c3016v);
            }
        });
    }

    @Override // j3.y.c
    public final void Y(j3.w wVar) {
        InterfaceC3018x.b bVar;
        InterfaceC9928b.a i02 = (!(wVar instanceof C5449k) || (bVar = ((C5449k) wVar).f44081h) == null) ? i0() : j0(bVar);
        n0(i02, 10, new Ns.b(i02, wVar));
    }

    @Override // j3.y.c
    public final void Z(boolean z11) {
        n0(i0(), 3, new C2454a());
    }

    @Override // u3.InterfaceC9927a
    public final void a(C9737c c9737c) {
        InterfaceC9928b.a j02 = j0(this.f99865d.g());
        n0(j02, 1020, new m1.o(j02, c9737c));
    }

    @Override // j3.y.c
    public final void a0(final int i11, final y.d dVar, final y.d dVar2) {
        if (i11 == 1) {
            this.f99870i = false;
        }
        j3.y yVar = this.f99868g;
        yVar.getClass();
        this.f99865d.j(yVar);
        final InterfaceC9928b.a i02 = i0();
        n0(i02, 11, new r.a() { // from class: u3.f
            @Override // m3.r.a
            public final void invoke(Object obj) {
                InterfaceC9928b interfaceC9928b = (InterfaceC9928b) obj;
                InterfaceC9928b.a aVar = InterfaceC9928b.a.this;
                interfaceC9928b.getClass();
                interfaceC9928b.onPositionDiscontinuity(aVar, dVar, dVar2, i11);
            }
        });
    }

    @Override // u3.InterfaceC9927a
    public final void b(String str) {
        n0(m0(), 1019, new C2438a());
    }

    @Override // u3.InterfaceC9927a
    public final void b0(int i11, int i12, boolean z11) {
        InterfaceC9928b.a m02 = m0();
        n0(m02, 1033, new Q(m02, i11, i12, z11));
    }

    @Override // j3.y.c
    public final void c(int i11) {
        n0(m0(), 21, new C3354v2());
    }

    @Override // F3.F
    public final void c0(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v, final int i12) {
        final InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, 1000, new r.a(c3013s, c3016v, i12) { // from class: u3.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3013s f99832b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C3016v f99833c;

            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onLoadStarted(InterfaceC9928b.a.this, this.f99832b, this.f99833c);
            }
        });
    }

    @Override // u3.InterfaceC9927a
    public final void d(String str) {
        n0(m0(), 1012, new Fr.g());
    }

    @Override // j3.y.c
    public final void d0(int i11) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 8, new C4055a(i02, i11));
    }

    @Override // u3.InterfaceC9927a
    public final void e(String str, long j11, long j12) {
        n0(m0(), 1008, new C2702w());
    }

    @Override // j3.y.c
    public final void e0(j3.s sVar) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 14, new V(i02, sVar));
    }

    @Override // u3.InterfaceC9927a
    public final void f(C9737c c9737c) {
        n0(m0(), 1015, new P4.f());
    }

    @Override // j3.y.c
    public final void f0(C7255K c7255k) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 19, new Bi.a(i02, c7255k));
    }

    @Override // u3.InterfaceC9927a
    public final void g(C7272n c7272n, C9738d c9738d) {
        n0(m0(), 1017, new C3261b());
    }

    @Override // u3.InterfaceC9927a
    public final void h(C9737c c9737c) {
        n0(m0(), 1007, new G.g());
    }

    @Override // u3.InterfaceC9927a
    public final void i(long j11, Object obj) {
        InterfaceC9928b.a m02 = m0();
        n0(m02, 26, new C5939u(m02, obj, j11));
    }

    protected final InterfaceC9928b.a i0() {
        return j0(this.f99865d.d());
    }

    @Override // u3.InterfaceC9927a
    public final void j(int i11, long j11) {
        n0(j0(this.f99865d.g()), 1021, new Ej.b());
    }

    @Override // u3.InterfaceC9927a
    public final void k(final int i11, final long j11) {
        final InterfaceC9928b.a j02 = j0(this.f99865d.g());
        n0(j02, 1018, new r.a() { // from class: u3.k
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onDroppedVideoFrames(InterfaceC9928b.a.this, i11, j11);
            }
        });
    }

    protected final InterfaceC9928b.a k0(AbstractC7252H abstractC7252H, int i11, InterfaceC3018x.b bVar) {
        InterfaceC3018x.b bVar2 = abstractC7252H.isEmpty() ? null : bVar;
        long elapsedRealtime = this.f99862a.elapsedRealtime();
        boolean z11 = abstractC7252H.equals(this.f99868g.G()) && i11 == this.f99868g.R();
        long j11 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z11) {
                j11 = this.f99868g.O();
            } else if (!abstractC7252H.isEmpty()) {
                j11 = m3.N.g0(abstractC7252H.getWindow(i11, this.f99864c).f68957l);
            }
        } else if (z11 && this.f99868g.k() == bVar2.f8752b && this.f99868g.u() == bVar2.f8753c) {
            j11 = this.f99868g.getCurrentPosition();
        }
        return new InterfaceC9928b.a(elapsedRealtime, abstractC7252H, i11, bVar2, j11, this.f99868g.G(), this.f99868g.R(), this.f99865d.d(), this.f99868g.getCurrentPosition(), this.f99868g.f());
    }

    @Override // u3.InterfaceC9927a
    public final void l(v3.p pVar) {
        n0(m0(), 1031, new C3660k());
    }

    @Override // j3.y.c
    public final void m(j3.t tVar) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 28, new C2436a(i02, tVar));
    }

    @Override // u3.InterfaceC9927a
    public final void n(final Exception exc) {
        final InterfaceC9928b.a m02 = m0();
        n0(m02, 1029, new r.a() { // from class: u3.g
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onAudioCodecError(InterfaceC9928b.a.this, exc);
            }
        });
    }

    protected final void n0(InterfaceC9928b.a aVar, int i11, r.a<InterfaceC9928b> aVar2) {
        this.f99866e.put(i11, aVar);
        this.f99867f.h(i11, aVar2);
    }

    @Override // u3.InterfaceC9927a
    public final void o(C7272n c7272n, C9738d c9738d) {
        n0(m0(), 1009, new C5766e());
    }

    @Override // j3.y.c
    public final void onMediaItemTransition(final C7275q c7275q, final int i11) {
        final InterfaceC9928b.a i02 = i0();
        n0(i02, 1, new r.a() { // from class: u3.r
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onMediaItemTransition(InterfaceC9928b.a.this, c7275q, i11);
            }
        });
    }

    @Override // j3.y.c
    public final void onPlayWhenReadyChanged(final boolean z11, final int i11) {
        final InterfaceC9928b.a i02 = i0();
        n0(i02, 5, new r.a() { // from class: u3.e
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onPlayWhenReadyChanged(InterfaceC9928b.a.this, z11, i11);
            }
        });
    }

    @Override // j3.y.c
    public final void onPlaybackStateChanged(int i11) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 4, new t3.w(i11, 1, i02));
    }

    @Override // j3.y.c
    public final void onPlayerError(j3.w wVar) {
        InterfaceC3018x.b bVar;
        InterfaceC9928b.a i02 = (!(wVar instanceof C5449k) || (bVar = ((C5449k) wVar).f44081h) == null) ? i0() : j0(bVar);
        n0(i02, 10, new d3(i02, wVar));
    }

    @Override // j3.y.c
    public final void onRenderedFirstFrame() {
    }

    @Override // j3.y.c
    public final void onTracksChanged(C7256L c7256l) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 2, new C3349u1(i02, c7256l));
    }

    @Override // j3.y.c
    public final void onVideoSizeChanged(final j3.Q q11) {
        final InterfaceC9928b.a m02 = m0();
        n0(m02, 25, new r.a() { // from class: u3.n
            @Override // m3.r.a
            public final void invoke(Object obj) {
                InterfaceC9928b.a aVar = InterfaceC9928b.a.this;
                j3.Q q12 = q11;
                ((InterfaceC9928b) obj).onVideoSizeChanged(aVar, q12);
                int i11 = q12.f69043a;
            }
        });
    }

    @Override // j3.y.c
    public final void onVolumeChanged(final float f7) {
        final InterfaceC9928b.a m02 = m0();
        n0(m02, 22, new r.a() { // from class: u3.q
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onVolumeChanged(InterfaceC9928b.a.this, f7);
            }
        });
    }

    @Override // u3.InterfaceC9927a
    public final void p(String str, long j11, long j12) {
        InterfaceC9928b.a m02 = m0();
        n0(m02, 1016, new Pk0.b(m02, str, j12, j11));
    }

    @Override // w3.i
    public final void q(int i11, InterfaceC3018x.b bVar, final Exception exc) {
        final InterfaceC9928b.a l02 = l0(i11, bVar);
        n0(l02, UserVerificationMethods.USER_VERIFY_ALL, new r.a() { // from class: u3.m
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onDrmSessionManagerError(InterfaceC9928b.a.this, exc);
            }
        });
    }

    @Override // j3.y.c
    public final void r(boolean z11) {
        InterfaceC9928b.a m02 = m0();
        n0(m02, 23, new C2618u(m02, z11));
    }

    @Override // u3.InterfaceC9927a
    public final void release() {
        InterfaceC8073o interfaceC8073o = this.f99869h;
        G10.a.i(interfaceC8073o);
        interfaceC8073o.i(new YJ.e(this, 5));
    }

    @Override // u3.InterfaceC9927a
    public final void s(final Exception exc) {
        final InterfaceC9928b.a m02 = m0();
        n0(m02, 1014, new r.a() { // from class: u3.o
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onAudioSinkError(InterfaceC9928b.a.this, exc);
            }
        });
    }

    @Override // j3.y.c
    public final void t(List<C7855a> list) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 27, new B90.F(i02, list));
    }

    @Override // u3.InterfaceC9927a
    public final void u(long j11) {
        n0(m0(), 1010, new C3173b());
    }

    @Override // u3.InterfaceC9927a
    public final void v(final Exception exc) {
        final InterfaceC9928b.a m02 = m0();
        n0(m02, 1030, new r.a() { // from class: u3.s
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((InterfaceC9928b) obj).onVideoCodecError(InterfaceC9928b.a.this, exc);
            }
        });
    }

    @Override // u3.InterfaceC9927a
    public final void w(v3.p pVar) {
        n0(m0(), 1032, new Ep.a());
    }

    @Override // j3.y.c
    public final void x(C7856b c7856b) {
        InterfaceC9928b.a i02 = i0();
        n0(i02, 27, new Om(i02, c7856b));
    }

    @Override // u3.InterfaceC9927a
    public final void y(C9737c c9737c) {
        InterfaceC9928b.a j02 = j0(this.f99865d.g());
        n0(j02, 1013, new A0(j02, c9737c));
    }

    @Override // u3.InterfaceC9927a
    public final void z(int i11, long j11, long j12) {
        InterfaceC9928b.a m02 = m0();
        n0(m02, 1011, new C4636t5(m02, i11, j11, j12));
    }
}
