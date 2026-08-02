package n1;

import Sc.o;
import Z1.s;
import k1.C7455a;
import k1.C7459e;
import k1.C7464j;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7784B;
import l1.C7785C;
import l1.C7795M;
import l1.C7807Z;
import l1.C7809a0;
import l1.InterfaceC7802U;
import l1.InterfaceC7829k0;
import l1.r0;
import l1.s0;
import l1.t0;
import l1.w0;
import org.jetbrains.annotations.NotNull;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8408a implements InterfaceC8412e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1285a f76274a = new C1285a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f76275b = new b();

    /* renamed from: c, reason: collision with root package name */
    private C7784B f76276c;

    /* renamed from: d, reason: collision with root package name */
    private C7784B f76277d;

    /* renamed from: n1.a$a, reason: collision with other inner class name */
    public static final class C1285a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private Z1.d f76278a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private s f76279b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private InterfaceC7802U f76280c;

        /* renamed from: d, reason: collision with root package name */
        private long f76281d;

        public C1285a() {
            Z1.d a11 = C8411d.a();
            s sVar = s.Ltr;
            C8414g c8414g = new C8414g();
            this.f76278a = a11;
            this.f76279b = sVar;
            this.f76280c = c8414g;
            this.f76281d = 0L;
        }

        @NotNull
        public final Z1.d a() {
            return this.f76278a;
        }

        @NotNull
        public final s b() {
            return this.f76279b;
        }

        @NotNull
        public final InterfaceC7802U c() {
            return this.f76280c;
        }

        public final long d() {
            return this.f76281d;
        }

        @NotNull
        public final InterfaceC7802U e() {
            return this.f76280c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1285a)) {
                return false;
            }
            C1285a c1285a = (C1285a) obj;
            return Intrinsics.d(this.f76278a, c1285a.f76278a) && this.f76279b == c1285a.f76279b && Intrinsics.d(this.f76280c, c1285a.f76280c) && C7464j.c(this.f76281d, c1285a.f76281d);
        }

        @NotNull
        public final Z1.d f() {
            return this.f76278a;
        }

        @NotNull
        public final s g() {
            return this.f76279b;
        }

        public final long h() {
            return this.f76281d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f76281d) + ((this.f76280c.hashCode() + ((this.f76279b.hashCode() + (this.f76278a.hashCode() * 31)) * 31)) * 31);
        }

        public final void i(@NotNull InterfaceC7802U interfaceC7802U) {
            this.f76280c = interfaceC7802U;
        }

        public final void j(@NotNull Z1.d dVar) {
            this.f76278a = dVar;
        }

        public final void k(@NotNull s sVar) {
            this.f76279b = sVar;
        }

        public final void l(long j11) {
            this.f76281d = j11;
        }

        @NotNull
        public final String toString() {
            return "DrawParams(density=" + this.f76278a + ", layoutDirection=" + this.f76279b + ", canvas=" + this.f76280c + ", size=" + ((Object) C7464j.h(this.f76281d)) + ')';
        }
    }

    /* renamed from: n1.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C8409b f76282a = new C8409b(this);

        /* renamed from: b, reason: collision with root package name */
        private o1.d f76283b;

        b() {
        }

        @NotNull
        public final InterfaceC7802U a() {
            return C8408a.this.t().e();
        }

        @NotNull
        public final Z1.d b() {
            return C8408a.this.t().f();
        }

        public final o1.d c() {
            return this.f76283b;
        }

        @NotNull
        public final s d() {
            return C8408a.this.t().g();
        }

        public final long e() {
            return C8408a.this.t().h();
        }

        @NotNull
        public final C8409b f() {
            return this.f76282a;
        }

        public final void g(@NotNull InterfaceC7802U interfaceC7802U) {
            C8408a.this.t().i(interfaceC7802U);
        }

        public final void h(@NotNull Z1.d dVar) {
            C8408a.this.t().j(dVar);
        }

        public final void i(o1.d dVar) {
            this.f76283b = dVar;
        }

        public final void j(@NotNull s sVar) {
            C8408a.this.t().k(sVar);
        }

        public final void k(long j11) {
            C8408a.this.t().l(j11);
        }
    }

    static r0 m(C8408a c8408a, long j11, AbstractC8413f abstractC8413f, float f7, C7809a0 c7809a0, int i11) {
        r0 u11 = c8408a.u(abstractC8413f);
        if (f7 != 1.0f) {
            j11 = C7807Z.o(C7807Z.q(j11) * f7, j11);
        }
        C7784B c7784b = (C7784B) u11;
        if (!C7807Z.p(c7784b.a(), j11)) {
            c7784b.b(j11);
        }
        if (c7784b.e() != null) {
            c7784b.f(null);
        }
        if (!Intrinsics.d(c7784b.h(), c7809a0)) {
            c7784b.c(c7809a0);
        }
        if (c7784b.g() != i11) {
            c7784b.o(i11);
        }
        if (c7784b.i() == 1) {
            return u11;
        }
        c7784b.p(1);
        return u11;
    }

    private final r0 s(AbstractC7799Q abstractC7799Q, AbstractC8413f abstractC8413f, float f7, C7809a0 c7809a0, int i11, int i12) {
        long j11;
        long j12;
        r0 u11 = u(abstractC8413f);
        if (abstractC7799Q != null) {
            abstractC7799Q.mo69applyToPq9zytI(i(), u11, f7);
        } else {
            C7784B c7784b = (C7784B) u11;
            if (c7784b.e() != null) {
                c7784b.f(null);
            }
            long a11 = c7784b.a();
            j11 = C7807Z.f72248b;
            if (!C7807Z.p(a11, j11)) {
                j12 = C7807Z.f72248b;
                c7784b.b(j12);
            }
            if (c7784b.getAlpha() != f7) {
                c7784b.setAlpha(f7);
            }
        }
        C7784B c7784b2 = (C7784B) u11;
        if (!Intrinsics.d(c7784b2.h(), c7809a0)) {
            c7784b2.c(c7809a0);
        }
        if (c7784b2.g() != i11) {
            c7784b2.o(i11);
        }
        if (c7784b2.i() == i12) {
            return u11;
        }
        c7784b2.p(i12);
        return u11;
    }

    private final r0 u(AbstractC8413f abstractC8413f) {
        if (Intrinsics.d(abstractC8413f, C8415h.f76287a)) {
            C7784B c7784b = this.f76276c;
            if (c7784b != null) {
                return c7784b;
            }
            C7784B a11 = C7785C.a();
            a11.v(0);
            this.f76276c = a11;
            return a11;
        }
        if (!(abstractC8413f instanceof C8416i)) {
            throw new o();
        }
        C7784B c7784b2 = this.f76277d;
        if (c7784b2 == null) {
            c7784b2 = C7785C.a();
            c7784b2.v(1);
            this.f76277d = c7784b2;
        }
        C8416i c8416i = (C8416i) abstractC8413f;
        if (c7784b2.n() != c8416i.e()) {
            c7784b2.u(c8416i.e());
        }
        if (c7784b2.k() != c8416i.a()) {
            c7784b2.r(c8416i.a());
        }
        if (c7784b2.m() != c8416i.c()) {
            c7784b2.t(c8416i.c());
        }
        if (c7784b2.l() != c8416i.b()) {
            c7784b2.s(c8416i.b());
        }
        if (!Intrinsics.d(c7784b2.j(), c8416i.d())) {
            c7784b2.q(c8416i.d());
        }
        return c7784b2;
    }

    @Override // n1.InterfaceC8412e
    public final void C0(long j11, long j12, long j13, float f7, @NotNull AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11) {
        this.f76274a.e().m(C7459e.g(j12), C7459e.h(j12), C7464j.f(j13) + C7459e.g(j12), C7464j.d(j13) + C7459e.h(j12), m(this, j11, abstractC8413f, f7, c7809a0, i11));
    }

    @Override // n1.InterfaceC8412e
    public final void E1(long j11, float f7, float f11, long j12, long j13, @NotNull AbstractC8413f abstractC8413f) {
        this.f76274a.e().d(C7459e.g(j12), C7459e.h(j12), C7464j.f(j13) + C7459e.g(j12), C7464j.d(j13) + C7459e.h(j12), f7, f11, m(this, j11, abstractC8413f, 1.0f, null, 3));
    }

    @Override // n1.InterfaceC8412e
    public final void H0(long j11, long j12, long j13, long j14, @NotNull AbstractC8413f abstractC8413f) {
        this.f76274a.e().l(C7459e.g(j12), C7459e.h(j12), C7464j.f(j13) + C7459e.g(j12), C7464j.d(j13) + C7459e.h(j12), C7455a.d(j14), C7455a.e(j14), m(this, j11, abstractC8413f, 1.0f, null, 3));
    }

    @Override // n1.InterfaceC8412e
    public final void H1(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, long j13, float f7, @NotNull AbstractC8413f abstractC8413f) {
        this.f76274a.e().l(C7459e.g(j11), C7459e.h(j11), C7464j.f(j12) + C7459e.g(j11), C7464j.d(j12) + C7459e.h(j11), C7455a.d(j13), C7455a.e(j13), s(abstractC7799Q, abstractC8413f, f7, null, 3, 1));
    }

    @Override // n1.InterfaceC8412e
    public final void R(long j11, float f7, long j12, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f76274a.e().n(j12, m(this, j11, abstractC8413f, 1.0f, null, i11), f7);
    }

    @Override // n1.InterfaceC8412e
    public final void S0(@NotNull s0 s0Var, @NotNull AbstractC7799Q abstractC7799Q, float f7, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f76274a.e().c(s0Var, s(abstractC7799Q, abstractC8413f, f7, null, i11, 1));
    }

    @Override // n1.InterfaceC8412e
    public final void T0(@NotNull s0 s0Var, long j11, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f76274a.e().c(s0Var, m(this, j11, abstractC8413f, 1.0f, null, i11));
    }

    @Override // n1.InterfaceC8412e
    public final void U(long j11, long j12, long j13, float f7, int i11, t0 t0Var) {
        InterfaceC7802U e11 = this.f76274a.e();
        C7784B c7784b = this.f76277d;
        if (c7784b == null) {
            c7784b = C7785C.a();
            c7784b.v(1);
            this.f76277d = c7784b;
        }
        if (!C7807Z.p(c7784b.a(), j11)) {
            c7784b.b(j11);
        }
        if (c7784b.e() != null) {
            c7784b.f(null);
        }
        if (!Intrinsics.d(c7784b.h(), null)) {
            c7784b.c(null);
        }
        if (c7784b.g() != 3) {
            c7784b.o(3);
        }
        if (c7784b.n() != f7) {
            c7784b.u(f7);
        }
        if (c7784b.m() != 4.0f) {
            c7784b.t(4.0f);
        }
        if (c7784b.k() != i11) {
            c7784b.r(i11);
        }
        if (c7784b.l() != 0) {
            c7784b.s(0);
        }
        if (!Intrinsics.d(c7784b.j(), t0Var)) {
            c7784b.q(t0Var);
        }
        if (c7784b.i() != 1) {
            c7784b.p(1);
        }
        e11.k(j12, j13, c7784b);
    }

    @Override // n1.InterfaceC8412e
    public final void V0(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f76274a.e().m(C7459e.g(j11), C7459e.h(j11), C7464j.f(j12) + C7459e.g(j11), C7464j.d(j12) + C7459e.h(j11), s(abstractC7799Q, abstractC8413f, f7, null, i11, 1));
    }

    @Override // n1.InterfaceC8412e
    public final void d0(@NotNull AbstractC7799Q abstractC7799Q, float f7, long j11, @NotNull C8416i c8416i) {
        this.f76274a.e().n(j11, s(abstractC7799Q, c8416i, 1.0f, null, 3, 1), f7);
    }

    @Override // Z1.d
    public final float g() {
        return this.f76274a.f().g();
    }

    @Override // n1.InterfaceC8412e
    @NotNull
    public final s getLayoutDirection() {
        return this.f76274a.g();
    }

    @Override // n1.InterfaceC8412e
    public final void h0(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, float f11) {
        InterfaceC7802U e11 = this.f76274a.e();
        C7784B c7784b = this.f76277d;
        if (c7784b == null) {
            c7784b = C7785C.a();
            c7784b.v(1);
            this.f76277d = c7784b;
        }
        if (abstractC7799Q != null) {
            abstractC7799Q.mo69applyToPq9zytI(i(), c7784b, f11);
        } else if (c7784b.getAlpha() != f11) {
            c7784b.setAlpha(f11);
        }
        if (!Intrinsics.d(c7784b.h(), null)) {
            c7784b.c(null);
        }
        if (c7784b.g() != 3) {
            c7784b.o(3);
        }
        if (c7784b.n() != f7) {
            c7784b.u(f7);
        }
        if (c7784b.m() != 4.0f) {
            c7784b.t(4.0f);
        }
        if (c7784b.k() != 0) {
            c7784b.r(0);
        }
        if (c7784b.l() != 0) {
            c7784b.s(0);
        }
        if (!Intrinsics.d(c7784b.j(), null)) {
            c7784b.q(null);
        }
        if (c7784b.i() != 1) {
            c7784b.p(1);
        }
        e11.k(j11, j12, c7784b);
    }

    @Override // n1.InterfaceC8412e
    public final void j1(@NotNull InterfaceC7829k0 interfaceC7829k0, @NotNull AbstractC8413f abstractC8413f, C7795M c7795m) {
        this.f76274a.e().g(interfaceC7829k0, s(null, abstractC8413f, 1.0f, c7795m, 3, 1));
    }

    @NotNull
    public final C1285a t() {
        return this.f76274a;
    }

    @Override // n1.InterfaceC8412e
    public final void t0(@NotNull InterfaceC7829k0 interfaceC7829k0, long j11, long j12, long j13, long j14, float f7, @NotNull AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11, int i12) {
        this.f76274a.e().a(interfaceC7829k0, j11, j12, j13, j14, s(null, abstractC8413f, f7, c7809a0, i11, i12));
    }

    @Override // n1.InterfaceC8412e
    public final void t1(@NotNull w0 w0Var, long j11, long j12, float f7, @NotNull AbstractC8413f abstractC8413f) {
        this.f76274a.e().h(C7459e.g(j11), C7459e.h(j11), C7464j.f(j12) + C7459e.g(j11), C7464j.d(j12) + C7459e.h(j11), s(w0Var, abstractC8413f, f7, null, 3, 1));
    }

    @Override // Z1.k
    public final float u1() {
        return this.f76274a.f().u1();
    }

    @Override // n1.InterfaceC8412e
    @NotNull
    public final b w0() {
        return this.f76275b;
    }
}
