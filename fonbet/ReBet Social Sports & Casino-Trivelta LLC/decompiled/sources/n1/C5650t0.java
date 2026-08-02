package n1;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2339H;
import b1.AbstractC2346O;
import b1.C2333B;
import b1.C2334C;
import b1.C2340I;
import b1.C2350d;
import b1.C2361o;
import b1.C2364s;
import b1.InterfaceC2341J;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import d1.C3987c;
import e1.AbstractC4134a;
import e1.C4155w;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;
import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import m1.C5507g;
import m1.C5509h;
import n1.InterfaceC5608b;
import o1.InterfaceC5773z;

/* renamed from: n1.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5650t0 implements InterfaceC5605a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4143j f56899a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2346O.b f56900b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2346O.c f56901c;

    /* renamed from: d, reason: collision with root package name */
    public final a f56902d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f56903e;

    /* renamed from: f, reason: collision with root package name */
    public C4155w f56904f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2341J f56905g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4152t f56906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f56907i;

    /* renamed from: n1.t0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2346O.b f56908a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC3445z f56909b = AbstractC3445z.t();

        /* renamed from: c, reason: collision with root package name */
        public com.google.common.collect.B f56910c = com.google.common.collect.B.m();

        /* renamed from: d, reason: collision with root package name */
        public D.b f56911d;

        /* renamed from: e, reason: collision with root package name */
        public D.b f56912e;

        /* renamed from: f, reason: collision with root package name */
        public D.b f56913f;

        public a(AbstractC2346O.b bVar) {
            this.f56908a = bVar;
        }

        public static D.b c(InterfaceC2341J interfaceC2341J, AbstractC3445z abstractC3445z, D.b bVar, AbstractC2346O.b bVar2) {
            AbstractC2346O I10 = interfaceC2341J.I();
            int X10 = interfaceC2341J.X();
            Object m10 = I10.q() ? null : I10.m(X10);
            int d10 = (interfaceC2341J.j() || I10.q()) ? -1 : I10.f(X10, bVar2).d(e1.Z.a1(interfaceC2341J.getCurrentPosition()) - bVar2.o());
            for (int i10 = 0; i10 < abstractC3445z.size(); i10++) {
                D.b bVar3 = (D.b) abstractC3445z.get(i10);
                if (i(bVar3, m10, interfaceC2341J.j(), interfaceC2341J.D(), interfaceC2341J.b0(), d10)) {
                    return bVar3;
                }
            }
            if (abstractC3445z.isEmpty() && bVar != null && i(bVar, m10, interfaceC2341J.j(), interfaceC2341J.D(), interfaceC2341J.b0(), d10)) {
                return bVar;
            }
            return null;
        }

        public static boolean i(D.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f21516a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f21517b == i10 && bVar.f21518c == i11) {
                return true;
            }
            return !z10 && bVar.f21517b == -1 && bVar.f21520e == i12;
        }

        public final void b(B.a aVar, D.b bVar, AbstractC2346O abstractC2346O) {
            if (bVar == null) {
                return;
            }
            if (abstractC2346O.b(bVar.f21516a) != -1) {
                aVar.f(bVar, abstractC2346O);
                return;
            }
            AbstractC2346O abstractC2346O2 = (AbstractC2346O) this.f56910c.get(bVar);
            if (abstractC2346O2 != null) {
                aVar.f(bVar, abstractC2346O2);
            }
        }

        public D.b d() {
            return this.f56911d;
        }

        public D.b e() {
            if (this.f56909b.isEmpty()) {
                return null;
            }
            return (D.b) com.google.common.collect.I.f(this.f56909b);
        }

        public AbstractC2346O f(D.b bVar) {
            return (AbstractC2346O) this.f56910c.get(bVar);
        }

        public D.b g() {
            return this.f56912e;
        }

        public D.b h() {
            return this.f56913f;
        }

        public void j(InterfaceC2341J interfaceC2341J) {
            this.f56911d = c(interfaceC2341J, this.f56909b, this.f56912e, this.f56908a);
        }

        public void k(List list, D.b bVar, InterfaceC2341J interfaceC2341J) {
            this.f56909b = AbstractC3445z.o(list);
            if (!list.isEmpty()) {
                this.f56912e = (D.b) list.get(0);
                this.f56913f = (D.b) AbstractC4134a.e(bVar);
            }
            if (this.f56911d == null) {
                this.f56911d = c(interfaceC2341J, this.f56909b, this.f56912e, this.f56908a);
            }
            m(interfaceC2341J.I());
        }

        public void l(InterfaceC2341J interfaceC2341J) {
            this.f56911d = c(interfaceC2341J, this.f56909b, this.f56912e, this.f56908a);
            m(interfaceC2341J.I());
        }

        public final void m(AbstractC2346O abstractC2346O) {
            B.a a10 = com.google.common.collect.B.a();
            if (this.f56909b.isEmpty()) {
                b(a10, this.f56912e, abstractC2346O);
                if (!Objects.equals(this.f56913f, this.f56912e)) {
                    b(a10, this.f56913f, abstractC2346O);
                }
                if (!Objects.equals(this.f56911d, this.f56912e) && !Objects.equals(this.f56911d, this.f56913f)) {
                    b(a10, this.f56911d, abstractC2346O);
                }
            } else {
                for (int i10 = 0; i10 < this.f56909b.size(); i10++) {
                    b(a10, (D.b) this.f56909b.get(i10), abstractC2346O);
                }
                if (!this.f56909b.contains(this.f56911d)) {
                    b(a10, this.f56911d, abstractC2346O);
                }
            }
            this.f56910c = a10.c();
        }
    }

    public C5650t0(InterfaceC4143j interfaceC4143j) {
        this.f56899a = (InterfaceC4143j) AbstractC4134a.e(interfaceC4143j);
        this.f56904f = new C4155w(e1.Z.a0(), interfaceC4143j, new C4155w.b() { // from class: n1.u
            @Override // e1.C4155w.b
            public final void a(Object obj, C2364s c2364s) {
                C5650t0.F1((InterfaceC5608b) obj, c2364s);
            }
        });
        AbstractC2346O.b bVar = new AbstractC2346O.b();
        this.f56900b = bVar;
        this.f56901c = new AbstractC2346O.c();
        this.f56902d = new a(bVar);
        this.f56903e = new SparseArray();
    }

    public static /* synthetic */ void F1(InterfaceC5608b interfaceC5608b, C2364s c2364s) {
    }

    public static /* synthetic */ void G0(InterfaceC5608b.a aVar, b1.Y y10, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.B(aVar, y10);
        interfaceC5608b.H(aVar, y10.f24529a, y10.f24530b, 0, y10.f24532d);
    }

    public static /* synthetic */ void H0(InterfaceC5608b.a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10, int i10, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.Q(aVar, c2223y, b10);
        interfaceC5608b.c(aVar, c2223y, b10, i10);
    }

    public static /* synthetic */ void R0(InterfaceC5608b.a aVar, String str, long j10, long j11, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.U(aVar, str, j10);
        interfaceC5608b.S(aVar, str, j11, j10);
    }

    public static /* synthetic */ void X0(InterfaceC5608b.a aVar, boolean z10, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.y(aVar, z10);
        interfaceC5608b.w(aVar, z10);
    }

    public static /* synthetic */ void g1(InterfaceC5608b.a aVar, int i10, InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.j0(aVar, i10);
        interfaceC5608b.a0(aVar, eVar, eVar2, i10);
    }

    public static /* synthetic */ void x0(InterfaceC5608b.a aVar, int i10, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.w0(aVar);
        interfaceC5608b.j(aVar, i10);
    }

    public static /* synthetic */ void z0(InterfaceC5608b.a aVar, String str, long j10, long j11, InterfaceC5608b interfaceC5608b) {
        interfaceC5608b.J(aVar, str, j10);
        interfaceC5608b.D(aVar, str, j11, j10);
    }

    @Override // n1.InterfaceC5605a
    public final void A(final int i10, final long j10, final long j11) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1011, new C4155w.a() { // from class: n1.k0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).s(InterfaceC5608b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void B(final long j10, final int i10) {
        final InterfaceC5608b.a P12 = P1();
        T1(P12, 1021, new C4155w.a() { // from class: n1.S
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).A(InterfaceC5608b.a.this, j10, i10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void C(final int i10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 6, new C4155w.a() { // from class: n1.o
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).t(InterfaceC5608b.a.this, i10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void E(List list, D.b bVar) {
        this.f56902d.k(list, bVar, (InterfaceC2341J) AbstractC4134a.e(this.f56905g));
    }

    @Override // b1.InterfaceC2341J.d
    public final void F(final int i10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 4, new C4155w.a() { // from class: n1.w
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).Z(InterfaceC5608b.a.this, i10);
            }
        });
    }

    @Override // D1.d.a
    public final void G(final int i10, final long j10, final long j11) {
        final InterfaceC5608b.a N12 = N1();
        T1(N12, RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_START_CALL_SUCCESS, new C4155w.a() { // from class: n1.J
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).v0(InterfaceC5608b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void H() {
        if (this.f56907i) {
            return;
        }
        final InterfaceC5608b.a K12 = K1();
        this.f56907i = true;
        T1(K12, -1, new C4155w.a() { // from class: n1.x
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).x0(InterfaceC5608b.a.this);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void I(final boolean z10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 9, new C4155w.a() { // from class: n1.E
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).e0(InterfaceC5608b.a.this, z10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void J(final AbstractC2339H abstractC2339H) {
        final InterfaceC5608b.a R12 = R1(abstractC2339H);
        T1(R12, 10, new C4155w.a() { // from class: n1.v
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).e(InterfaceC5608b.a.this, abstractC2339H);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public void K(final int i10, final boolean z10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 30, new C4155w.a() { // from class: n1.Q
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).o(InterfaceC5608b.a.this, i10, z10);
            }
        });
    }

    public final InterfaceC5608b.a K1() {
        return L1(this.f56902d.d());
    }

    @Override // b1.InterfaceC2341J.d
    public void L(final b1.S s10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 19, new C4155w.a() { // from class: n1.K
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).d(InterfaceC5608b.a.this, s10);
            }
        });
    }

    public final InterfaceC5608b.a L1(D.b bVar) {
        AbstractC4134a.e(this.f56905g);
        AbstractC2346O f10 = bVar == null ? null : this.f56902d.f(bVar);
        if (bVar != null && f10 != null) {
            return M1(f10, f10.h(bVar.f21516a, this.f56900b).f24356c, bVar);
        }
        int h02 = this.f56905g.h0();
        AbstractC2346O I10 = this.f56905g.I();
        if (h02 >= I10.p()) {
            I10 = AbstractC2346O.f24345a;
        }
        return M1(I10, h02, null);
    }

    @Override // b1.InterfaceC2341J.d
    public void M(final C2333B c2333b) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 14, new C4155w.a() { // from class: n1.p0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).N(InterfaceC5608b.a.this, c2333b);
            }
        });
    }

    public final InterfaceC5608b.a M1(AbstractC2346O abstractC2346O, int i10, D.b bVar) {
        D.b bVar2 = abstractC2346O.q() ? null : bVar;
        long b10 = this.f56899a.b();
        boolean z10 = abstractC2346O.equals(this.f56905g.I()) && i10 == this.f56905g.h0();
        long j10 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                j10 = this.f56905g.d0();
            } else if (!abstractC2346O.q()) {
                j10 = abstractC2346O.n(i10, this.f56901c).b();
            }
        } else if (z10 && this.f56905g.D() == bVar2.f21517b && this.f56905g.b0() == bVar2.f21518c) {
            j10 = this.f56905g.getCurrentPosition();
        }
        return new InterfaceC5608b.a(b10, abstractC2346O, i10, bVar2, j10, this.f56905g.I(), this.f56905g.h0(), this.f56902d.d(), this.f56905g.getCurrentPosition(), this.f56905g.k());
    }

    @Override // b1.InterfaceC2341J.d
    public void N(final AbstractC2339H abstractC2339H) {
        final InterfaceC5608b.a R12 = R1(abstractC2339H);
        T1(R12, 10, new C4155w.a() { // from class: n1.q
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).O(InterfaceC5608b.a.this, abstractC2339H);
            }
        });
    }

    public final InterfaceC5608b.a N1() {
        return L1(this.f56902d.e());
    }

    @Override // q1.t
    public final void O(int i10, D.b bVar) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1023, new C4155w.a() { // from class: n1.n0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).d0(InterfaceC5608b.a.this);
            }
        });
    }

    public final InterfaceC5608b.a O1(int i10, D.b bVar) {
        AbstractC4134a.e(this.f56905g);
        if (bVar != null) {
            return this.f56902d.f(bVar) != null ? L1(bVar) : M1(AbstractC2346O.f24345a, i10, bVar);
        }
        AbstractC2346O I10 = this.f56905g.I();
        if (i10 >= I10.p()) {
            I10 = AbstractC2346O.f24345a;
        }
        return M1(I10, i10, null);
    }

    @Override // b1.InterfaceC2341J.d
    public void P(final C2361o c2361o) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 29, new C4155w.a() { // from class: n1.X
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).K(InterfaceC5608b.a.this, c2361o);
            }
        });
    }

    public final InterfaceC5608b.a P1() {
        return L1(this.f56902d.g());
    }

    public final InterfaceC5608b.a Q1() {
        return L1(this.f56902d.h());
    }

    @Override // androidx.media3.exoplayer.source.L
    public final void R(int i10, D.b bVar, final C2223y c2223y, final androidx.media3.exoplayer.source.B b10, final int i11) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1000, new C4155w.a() { // from class: n1.I
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.H0(InterfaceC5608b.a.this, c2223y, b10, i11, (InterfaceC5608b) obj);
            }
        });
    }

    public final InterfaceC5608b.a R1(AbstractC2339H abstractC2339H) {
        D.b bVar;
        return (!(abstractC2339H instanceof m1.I) || (bVar = ((m1.I) abstractC2339H).f56103o) == null) ? K1() : L1(bVar);
    }

    @Override // b1.InterfaceC2341J.d
    public void S(final InterfaceC2341J.b bVar) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 13, new C4155w.a() { // from class: n1.s0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).t0(InterfaceC5608b.a.this, bVar);
            }
        });
    }

    public final void S1() {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 1028, new C4155w.a() { // from class: n1.L
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).h0(InterfaceC5608b.a.this);
            }
        });
        this.f56904f.i();
    }

    @Override // q1.t
    public final void T(int i10, D.b bVar, final int i11) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1022, new C4155w.a() { // from class: n1.W
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.x0(InterfaceC5608b.a.this, i11, (InterfaceC5608b) obj);
            }
        });
    }

    public final void T1(InterfaceC5608b.a aVar, int i10, C4155w.a aVar2) {
        this.f56903e.put(i10, aVar);
        this.f56904f.k(i10, aVar2);
    }

    @Override // androidx.media3.exoplayer.source.L
    public final void U(int i10, D.b bVar, final C2223y c2223y, final androidx.media3.exoplayer.source.B b10, final IOException iOException, final boolean z10) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1003, new C4155w.a() { // from class: n1.N
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).q(InterfaceC5608b.a.this, c2223y, b10, iOException, z10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void V(final C2350d c2350d) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 20, new C4155w.a() { // from class: n1.j
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).i(InterfaceC5608b.a.this, c2350d);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void W(final int i10, final int i11) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 24, new C4155w.a() { // from class: n1.F
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).o0(InterfaceC5608b.a.this, i10, i11);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void X(final InterfaceC2341J.e eVar, final InterfaceC2341J.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f56907i = false;
        }
        this.f56902d.j((InterfaceC2341J) AbstractC4134a.e(this.f56905g));
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 11, new C4155w.a() { // from class: n1.z
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.g1(InterfaceC5608b.a.this, i10, eVar, eVar2, (InterfaceC5608b) obj);
            }
        });
    }

    @Override // q1.t
    public final void Y(int i10, D.b bVar) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1026, new C4155w.a() { // from class: n1.l0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).n0(InterfaceC5608b.a.this);
            }
        });
    }

    @Override // q1.t
    public final void Z(int i10, D.b bVar, final Exception exc) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1024, new C4155w.a() { // from class: n1.Y
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).k(InterfaceC5608b.a.this, exc);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void a(final int i10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 21, new C4155w.a() { // from class: n1.b0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).m0(InterfaceC5608b.a.this, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.L
    public final void a0(int i10, D.b bVar, final C2223y c2223y, final androidx.media3.exoplayer.source.B b10) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS, new C4155w.a() { // from class: n1.T
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).x(InterfaceC5608b.a.this, c2223y, b10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void b(final boolean z10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 23, new C4155w.a() { // from class: n1.c
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).r0(InterfaceC5608b.a.this, z10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void c(final b1.Y y10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 25, new C4155w.a() { // from class: n1.c0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.G0(InterfaceC5608b.a.this, y10, (InterfaceC5608b) obj);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void c0(final boolean z10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 3, new C4155w.a() { // from class: n1.q0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.X0(InterfaceC5608b.a.this, z10, (InterfaceC5608b) obj);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void d(final Exception exc) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1014, new C4155w.a() { // from class: n1.j0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).n(InterfaceC5608b.a.this, exc);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void d0(AbstractC2346O abstractC2346O, final int i10) {
        this.f56902d.l((InterfaceC2341J) AbstractC4134a.e(this.f56905g));
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 0, new C4155w.a() { // from class: n1.d
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).P(InterfaceC5608b.a.this, i10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void e(final InterfaceC5773z.a aVar) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, Constants.WARN_ADM_RECORD_AUDIO_LOWLEVEL, new C4155w.a() { // from class: n1.n
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).L(InterfaceC5608b.a.this, aVar);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void e0(final b1.z zVar, final int i10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 1, new C4155w.a() { // from class: n1.e
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).p0(InterfaceC5608b.a.this, zVar, i10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void f(final InterfaceC5773z.a aVar) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, Constants.WARN_ADM_PLAYOUT_AUDIO_LOWLEVEL, new C4155w.a() { // from class: n1.o0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).b0(InterfaceC5608b.a.this, aVar);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void f0(final float f10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 22, new C4155w.a() { // from class: n1.f
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).g0(InterfaceC5608b.a.this, f10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void g(final String str) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1019, new C4155w.a() { // from class: n1.p
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).v(InterfaceC5608b.a.this, str);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public void g0(final b1.T t10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 2, new C4155w.a() { // from class: n1.V
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).k0(InterfaceC5608b.a.this, t10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void h(final String str, final long j10, final long j11) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1016, new C4155w.a() { // from class: n1.D
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.R0(InterfaceC5608b.a.this, str, j11, j10, (InterfaceC5608b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.L
    public final void h0(int i10, D.b bVar, final C2223y c2223y, final androidx.media3.exoplayer.source.B b10) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1001, new C4155w.a() { // from class: n1.Z
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).i0(InterfaceC5608b.a.this, c2223y, b10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void i(final C5507g c5507g) {
        final InterfaceC5608b.a P12 = P1();
        T1(P12, 1013, new C4155w.a() { // from class: n1.U
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).F(InterfaceC5608b.a.this, c5507g);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void i0(final InterfaceC2341J interfaceC2341J, Looper looper) {
        AbstractC4134a.g(this.f56905g == null || this.f56902d.f56909b.isEmpty());
        this.f56905g = (InterfaceC2341J) AbstractC4134a.e(interfaceC2341J);
        this.f56906h = this.f56899a.d(looper, null);
        this.f56904f = this.f56904f.e(looper, new C4155w.b() { // from class: n1.h
            @Override // e1.C4155w.b
            public final void a(Object obj, C2364s c2364s) {
                InterfaceC5608b interfaceC5608b = (InterfaceC5608b) obj;
                interfaceC5608b.Y(interfaceC2341J, new InterfaceC5608b.C0829b(c2364s, C5650t0.this.f56903e));
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void j(final String str) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1012, new C4155w.a() { // from class: n1.r0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).W(InterfaceC5608b.a.this, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.L
    public final void j0(int i10, D.b bVar, final androidx.media3.exoplayer.source.B b10) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1004, new C4155w.a() { // from class: n1.G
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).c0(InterfaceC5608b.a.this, b10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void k(final String str, final long j10, final long j11) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1008, new C4155w.a() { // from class: n1.m
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                C5650t0.z0(InterfaceC5608b.a.this, str, j11, j10, (InterfaceC5608b) obj);
            }
        });
    }

    @Override // q1.t
    public final void k0(int i10, D.b bVar) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1025, new C4155w.a() { // from class: n1.m0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).z(InterfaceC5608b.a.this);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void l(final C5507g c5507g) {
        final InterfaceC5608b.a P12 = P1();
        T1(P12, 1020, new C4155w.a() { // from class: n1.H
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).q0(InterfaceC5608b.a.this, c5507g);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void l0(final int i10, final int i11, final boolean z10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1033, new C4155w.a() { // from class: n1.s
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).y0(InterfaceC5608b.a.this, i10, i11, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.L
    public final void m(int i10, D.b bVar, final androidx.media3.exoplayer.source.B b10) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1005, new C4155w.a() { // from class: n1.h0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).u0(InterfaceC5608b.a.this, b10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void m0(final boolean z10, final int i10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, -1, new C4155w.a() { // from class: n1.i
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).T(InterfaceC5608b.a.this, z10, i10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public void n(final List list) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 27, new C4155w.a() { // from class: n1.t
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).s0(InterfaceC5608b.a.this, list);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void n0(final int i10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 8, new C4155w.a() { // from class: n1.B
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).M(InterfaceC5608b.a.this, i10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void o(final long j10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1010, new C4155w.a() { // from class: n1.O
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).b(InterfaceC5608b.a.this, j10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void o0(final boolean z10, final int i10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 5, new C4155w.a() { // from class: n1.r
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).C(InterfaceC5608b.a.this, z10, i10);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void p(final Exception exc) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, Constants.ERR_AUDIO_BT_SCO_FAILED, new C4155w.a() { // from class: n1.g
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).X(InterfaceC5608b.a.this, exc);
            }
        });
    }

    @Override // q1.t
    public final void p0(int i10, D.b bVar) {
        final InterfaceC5608b.a O12 = O1(i10, bVar);
        T1(O12, 1027, new C4155w.a() { // from class: n1.i0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).G(InterfaceC5608b.a.this);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void q(final C5507g c5507g) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, RtcEngineEvent.EvtType.EVT_VIDEO_STOPPED, new C4155w.a() { // from class: n1.M
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).l0(InterfaceC5608b.a.this, c5507g);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void q0(InterfaceC5608b interfaceC5608b) {
        AbstractC4134a.e(interfaceC5608b);
        this.f56904f.c(interfaceC5608b);
    }

    @Override // n1.InterfaceC5605a
    public final void r(final androidx.media3.common.a aVar, final C5509h c5509h) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1009, new C4155w.a() { // from class: n1.d0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).f0(InterfaceC5608b.a.this, aVar, c5509h);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void release() {
        ((InterfaceC4152t) AbstractC4134a.i(this.f56906h)).j(new Runnable() { // from class: n1.A
            @Override // java.lang.Runnable
            public final void run() {
                C5650t0.this.S1();
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void s(final androidx.media3.common.a aVar, final C5509h c5509h) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1017, new C4155w.a() { // from class: n1.a0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).V(InterfaceC5608b.a.this, aVar, c5509h);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public void s0(InterfaceC5608b interfaceC5608b) {
        this.f56904f.j(interfaceC5608b);
    }

    @Override // n1.InterfaceC5605a
    public final void t(final int i10, final long j10) {
        final InterfaceC5608b.a P12 = P1();
        T1(P12, 1018, new C4155w.a() { // from class: n1.P
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).E(InterfaceC5608b.a.this, i10, j10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public void t0(final boolean z10) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 7, new C4155w.a() { // from class: n1.l
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).g(InterfaceC5608b.a.this, z10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void u(final C2340I c2340i) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 12, new C4155w.a() { // from class: n1.y
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).l(InterfaceC5608b.a.this, c2340i);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void v(final Object obj, final long j10) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 26, new C4155w.a() { // from class: n1.f0
            @Override // e1.C4155w.a
            public final void invoke(Object obj2) {
                ((InterfaceC5608b) obj2).a(InterfaceC5608b.a.this, obj, j10);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public final void w(final C2334C c2334c) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 28, new C4155w.a() { // from class: n1.k
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).f(InterfaceC5608b.a.this, c2334c);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void x(final Exception exc) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1029, new C4155w.a() { // from class: n1.C
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).I(InterfaceC5608b.a.this, exc);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public void y(final C3987c c3987c) {
        final InterfaceC5608b.a K12 = K1();
        T1(K12, 27, new C4155w.a() { // from class: n1.g0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).m(InterfaceC5608b.a.this, c3987c);
            }
        });
    }

    @Override // n1.InterfaceC5605a
    public final void z(final C5507g c5507g) {
        final InterfaceC5608b.a Q12 = Q1();
        T1(Q12, 1015, new C4155w.a() { // from class: n1.e0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC5608b) obj).h(InterfaceC5608b.a.this, c5507g);
            }
        });
    }

    @Override // b1.InterfaceC2341J.d
    public void Q() {
    }

    @Override // b1.InterfaceC2341J.d
    public void D(boolean z10) {
    }

    @Override // b1.InterfaceC2341J.d
    public void b0(int i10) {
    }

    @Override // b1.InterfaceC2341J.d
    public void r0(InterfaceC2341J interfaceC2341J, InterfaceC2341J.c cVar) {
    }
}
