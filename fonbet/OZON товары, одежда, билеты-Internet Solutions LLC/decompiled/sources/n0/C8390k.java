package n0;

import D1.AbstractC2813m;
import i1.C6987g;
import i1.C6992l;
import i1.InterfaceC6986f;
import k1.C7460f;
import k1.C7463i;
import k1.C7464j;
import k1.C7465k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.AbstractC7839p0;
import l1.C7786D;
import l1.C7795M;
import l1.C7804W;
import l1.C7807Z;
import l1.C7809a0;
import l1.C7831l0;
import l1.C7844u;
import l1.C7848y;
import l1.InterfaceC7802U;
import l1.InterfaceC7829k0;
import l1.J0;
import l1.K0;
import l1.s0;
import n1.C8408a;
import n1.C8415h;
import n1.C8416i;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8390k extends AbstractC2813m {

    /* renamed from: c, reason: collision with root package name */
    private C8382c f76199c;

    /* renamed from: d, reason: collision with root package name */
    private float f76200d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private AbstractC7799Q f76201e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private J0 f76202f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6986f f76203g;

    /* renamed from: n0.k$a */
    static final class a extends AbstractC7737t implements Function1<C6987g, C6992l> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C6992l invoke(C6987g c6987g) {
            C6987g c6987g2 = c6987g;
            C8390k c8390k = C8390k.this;
            if (c6987g2.g() * c8390k.Q1() < 0.0f || C7464j.e(c6987g2.i()) <= 0.0f) {
                return c6987g2.t(C8383d.f76155b);
            }
            float f7 = 2;
            float min = Math.min(Z1.h.b(c8390k.Q1(), 0.0f) ? 1.0f : (float) Math.ceil(c6987g2.g() * c8390k.Q1()), (float) Math.ceil(C7464j.e(c6987g2.i()) / f7));
            float f11 = min / f7;
            long a11 = P9.a.a(f11, f11);
            long a12 = C7465k.a(C7464j.f(c6987g2.i()) - min, C7464j.d(c6987g2.i()) - min);
            boolean z11 = f7 * min > C7464j.e(c6987g2.i());
            AbstractC7839p0 mo1createOutlinePq9zytI = c8390k.getShape().mo1createOutlinePq9zytI(c6987g2.i(), c6987g2.getLayoutDirection(), c6987g2);
            if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.a) {
                return C8390k.N1(c8390k, c6987g2, c8390k.P1(), (AbstractC7839p0.a) mo1createOutlinePq9zytI, z11, min);
            }
            if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.c) {
                return C8390k.O1(c8390k, c6987g2, c8390k.P1(), (AbstractC7839p0.c) mo1createOutlinePq9zytI, a11, a12, z11, min);
            }
            boolean z12 = z11;
            if (!(mo1createOutlinePq9zytI instanceof AbstractC7839p0.b)) {
                throw new Sc.o();
            }
            AbstractC7799Q P12 = c8390k.P1();
            long j11 = z12 ? 0L : a11;
            if (z12) {
                a12 = c6987g2.i();
            }
            return c6987g2.t(new C8384e(P12, j11, a12, z12 ? C8415h.f76287a : new C8416i(min, 0.0f, 0, 0, null, 30)));
        }
    }

    public C8390k(float f7, AbstractC7799Q abstractC7799Q, J0 j02) {
        this.f76200d = f7;
        this.f76201e = abstractC7799Q;
        this.f76202f = j02;
        InterfaceC6986f a11 = androidx.compose.ui.draw.c.a(new a());
        I1(a11);
        this.f76203g = a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (r5 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
    
        if (l1.C7831l0.b(r3, r7 != null ? l1.C7831l0.a(((l1.C7848y) r7).b()) : null) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C6992l N1(C8390k c8390k, C6987g c6987g, AbstractC7799Q abstractC7799Q, AbstractC7839p0.a aVar, boolean z11, float f7) {
        int i11;
        C7795M c7795m;
        InterfaceC7829k0 interfaceC7829k0;
        InterfaceC7802U interfaceC7802U;
        InterfaceC7802U interfaceC7802U2;
        InterfaceC7829k0 interfaceC7829k02;
        C8408a c8408a;
        long j11;
        float f11;
        float f12;
        C8408a c8408a2;
        C8408a.b bVar;
        c8390k.getClass();
        if (z11) {
            return c6987g.t(new C8386g(aVar, abstractC7799Q));
        }
        boolean z12 = false;
        if (abstractC7799Q instanceof K0) {
            c7795m = C7809a0.a.a(5, ((K0) abstractC7799Q).a());
            i11 = 1;
        } else {
            i11 = 0;
            c7795m = null;
        }
        C7460f bounds = aVar.b().getBounds();
        if (c8390k.f76199c == null) {
            c8390k.f76199c = new C8382c(0);
        }
        C8382c c8382c = c8390k.f76199c;
        Intrinsics.f(c8382c);
        s0 g10 = c8382c.g();
        s0 s0Var = (C7786D) g10;
        s0Var.reset();
        s0Var.d(bounds, s0.a.CounterClockwise);
        s0Var.k(s0Var, aVar.b(), 0);
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        long a11 = Z1.r.a((int) Math.ceil(bounds.u()), (int) Math.ceil(bounds.m()));
        C8382c c8382c2 = c8390k.f76199c;
        Intrinsics.f(c8382c2);
        interfaceC7829k0 = c8382c2.f76150a;
        interfaceC7802U = c8382c2.f76151b;
        C7831l0 a12 = interfaceC7829k0 != null ? C7831l0.a(((C7848y) interfaceC7829k0).b()) : null;
        if (a12 == null || a12.c() != 0) {
        }
        z12 = true;
        if (interfaceC7829k0 != null && interfaceC7802U != null) {
            C7848y c7848y = (C7848y) interfaceC7829k0;
            if (C7464j.f(c6987g.i()) <= c7848y.getWidth()) {
                interfaceC7829k02 = interfaceC7829k0;
                interfaceC7802U2 = interfaceC7802U;
                if (C7464j.d(c6987g.i()) <= c7848y.getHeight()) {
                }
            }
        }
        C7848y b11 = S8.a.b((int) (a11 >> 32), (int) (4294967295L & a11), i11);
        c8382c2.f76150a = b11;
        C7844u a13 = C7804W.a(b11);
        c8382c2.f76151b = a13;
        interfaceC7829k02 = b11;
        interfaceC7802U2 = a13;
        T t2 = interfaceC7829k02;
        c8408a = c8382c2.f76152c;
        if (c8408a == null) {
            c8408a = new C8408a();
            c8382c2.f76152c = c8408a;
        }
        C8408a c8408a3 = c8408a;
        long b12 = Z1.r.b(a11);
        Z1.s layoutDirection = c6987g.getLayoutDirection();
        C8408a.C1285a t11 = c8408a3.t();
        Z1.d a14 = t11.a();
        Z1.s b13 = t11.b();
        InterfaceC7802U c11 = t11.c();
        long d11 = t11.d();
        C8408a.C1285a t12 = c8408a3.t();
        t12.j(c6987g);
        t12.k(layoutDirection);
        t12.i(interfaceC7802U2);
        t12.l(b12);
        C7844u c7844u = (C7844u) interfaceC7802U2;
        c7844u.save();
        j11 = C7807Z.f72248b;
        InterfaceC8412e.Q(c8408a3, j11, 0L, b12, 0.0f, null, 58);
        float f13 = -bounds.n();
        float f14 = -bounds.q();
        c8408a3.w0().f().g(f13, f14);
        try {
            C7795M c7795m2 = c7795m;
            f12 = f14;
            c8408a2 = c8408a3;
            f11 = f13;
            try {
                InterfaceC8412e.x1(c8408a2, aVar.b(), abstractC7799Q, 0.0f, new C8416i(f7 * 2, 0.0f, 0, 0, null, 30), 52);
                float f15 = 1;
                float f16 = (C7464j.f(c8408a2.i()) + f15) / C7464j.f(c8408a2.i());
                float d12 = (C7464j.d(c8408a2.i()) + f15) / C7464j.d(c8408a2.i());
                long A02 = c8408a2.A0();
                C8408a.b w02 = c8408a2.w0();
                long e11 = w02.e();
                w02.a().save();
                try {
                    w02.f().e(f16, d12, A02);
                    bVar = w02;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = w02;
                }
                try {
                    InterfaceC8412e.x1(c8408a2, g10, abstractC7799Q, 0.0f, null, 28);
                    bVar.a().p();
                    bVar.k(e11);
                    c8408a2.w0().f().g(-f11, -f12);
                    c7844u.p();
                    C8408a.C1285a t13 = c8408a2.t();
                    t13.j(a14);
                    t13.k(b13);
                    t13.i(c11);
                    t13.l(d11);
                    ((C7848y) t2).c();
                    m11.f71787a = t2;
                    return c6987g.t(new C8387h(bounds, m11, a11, c7795m2));
                } catch (Throwable th3) {
                    th = th3;
                    bVar.a().p();
                    bVar.k(e11);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                c8408a2.w0().f().g(-f11, -f12);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            f11 = f13;
            f12 = f14;
            c8408a2 = c8408a3;
        }
    }

    public static final C6992l O1(C8390k c8390k, C6987g c6987g, AbstractC7799Q abstractC7799Q, AbstractC7839p0.c cVar, long j11, long j12, boolean z11, float f7) {
        c8390k.getClass();
        if (C7463i.b(cVar.b())) {
            return c6987g.t(new C8388i(z11, abstractC7799Q, cVar.b().h(), f7 / 2, f7, j11, j12, new C8416i(f7, 0.0f, 0, 0, null, 30)));
        }
        if (c8390k.f76199c == null) {
            c8390k.f76199c = new C8382c(0);
        }
        C8382c c8382c = c8390k.f76199c;
        Intrinsics.f(c8382c);
        s0 g10 = c8382c.g();
        C8385f.a(g10, cVar.b(), f7, z11);
        return c6987g.t(new C8389j(g10, abstractC7799Q));
    }

    @NotNull
    public final AbstractC7799Q P1() {
        return this.f76201e;
    }

    public final float Q1() {
        return this.f76200d;
    }

    public final void R1(@NotNull AbstractC7799Q abstractC7799Q) {
        if (Intrinsics.d(this.f76201e, abstractC7799Q)) {
            return;
        }
        this.f76201e = abstractC7799Q;
        this.f76203g.c1();
    }

    public final void S1(float f7) {
        if (Z1.h.b(this.f76200d, f7)) {
            return;
        }
        this.f76200d = f7;
        this.f76203g.c1();
    }

    @NotNull
    public final J0 getShape() {
        return this.f76202f;
    }

    public final void setShape(@NotNull J0 j02) {
        if (Intrinsics.d(this.f76202f, j02)) {
            return;
        }
        this.f76202f = j02;
        this.f76203g.c1();
    }
}
