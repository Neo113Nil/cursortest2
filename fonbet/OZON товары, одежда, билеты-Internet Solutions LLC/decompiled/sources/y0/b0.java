package y0;

import B1.o0;
import B1.p0;
import E0.C2942q;
import S0.A1;
import S0.C3956f1;
import S0.C3987u0;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.lazy.layout.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import c1.AbstractC5715f;
import hd.C6915b;
import k1.C7459e;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import m0.C8004n;
import m0.InterfaceC8002m;
import m0.T0;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9110K;
import r0.EnumC9142v;
import r0.InterfaceC9108I;
import x0.C10583L;
import x0.C10598c;
import x0.C10606k;
import x0.InterfaceC10573B;
import y0.c0;

/* loaded from: classes8.dex */
public abstract class b0 implements InterfaceC9108I {

    /* renamed from: A, reason: collision with root package name */
    private long f105739A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final C10583L f105740B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<Unit> f105741C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<Unit> f105742D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final C3991w0 f105743E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final C3991w0 f105744F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final C3991w0 f105745G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final C3991w0 f105746H;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f105747a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final E f105748b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q f105749c;

    /* renamed from: d, reason: collision with root package name */
    private int f105750d;

    /* renamed from: e, reason: collision with root package name */
    private int f105751e;

    /* renamed from: f, reason: collision with root package name */
    private long f105752f;

    /* renamed from: g, reason: collision with root package name */
    private long f105753g;

    /* renamed from: h, reason: collision with root package name */
    private float f105754h;

    /* renamed from: i, reason: collision with root package name */
    private float f105755i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC9108I f105756j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f105757k;

    /* renamed from: l, reason: collision with root package name */
    private int f105758l;

    /* renamed from: m, reason: collision with root package name */
    private o.b f105759m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f105760n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private C3991w0 f105761o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private Z1.d f105762p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final t0.q f105763q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C3987u0 f105764r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C3987u0 f105765s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final A1 f105766t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final A1 f105767u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.o f105768v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final C10606k f105769w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C10598c f105770x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final C3991w0 f105771y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final V f105772z;

    public b0(int i11, float f7) {
        C3991w0 f11;
        c0.b bVar;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        C3991w0 f16;
        double d11 = f7;
        if (-0.5d > d11 || d11 > 0.5d) {
            throw new IllegalArgumentException(C2942q.b(f7, "currentPageOffsetFraction ", " is not within the range -0.5 to 0.5").toString());
        }
        f11 = n1.f(C7459e.a(0L), D1.f25195a);
        this.f105747a = f11;
        this.f105748b = new E(this);
        this.f105749c = new Q(i11, f7, this);
        this.f105750d = i11;
        this.f105752f = Long.MAX_VALUE;
        this.f105756j = C9110K.a(new Y(this));
        this.f105757k = true;
        this.f105758l = -1;
        this.f105761o = n1.f(c0.d(), n1.h());
        bVar = c0.f105776c;
        this.f105762p = bVar;
        this.f105763q = t0.p.a();
        this.f105764r = C3956f1.a(-1);
        this.f105765s = C3956f1.a(i11);
        this.f105766t = n1.d(n1.n(), new Z(this));
        this.f105767u = n1.d(n1.n(), new a0(this));
        this.f105768v = new androidx.compose.foundation.lazy.layout.o(null, null);
        this.f105769w = new C10606k();
        this.f105770x = new C10598c();
        f12 = n1.f(null, D1.f25195a);
        this.f105771y = f12;
        this.f105772z = new V(this);
        this.f105739A = Z1.c.b(0, 0, 15);
        this.f105740B = new C10583L();
        this.f105741C = x0.c0.a();
        this.f105742D = x0.c0.a();
        Boolean bool = Boolean.FALSE;
        f13 = n1.f(bool, D1.f25195a);
        this.f105743E = f13;
        f14 = n1.f(bool, D1.f25195a);
        this.f105744F = f14;
        f15 = n1.f(bool, D1.f25195a);
        this.f105745G = f15;
        f16 = n1.f(bool, D1.f25195a);
        this.f105746H = f16;
    }

    private final boolean O(float f7) {
        if (z().getOrientation() == EnumC9142v.Vertical) {
            if (Math.signum(f7) == Math.signum(-C7459e.h(N()))) {
                return true;
            }
        } else if (Math.signum(f7) == Math.signum(-C7459e.g(N()))) {
            return true;
        }
        return ((int) C7459e.g(N())) == 0 && ((int) C7459e.h(N())) == 0;
    }

    private final void Q(float f7, N n11) {
        o.b bVar;
        o.b bVar2;
        o.b bVar3;
        if (this.f105757k && !n11.f().isEmpty()) {
            boolean z11 = f7 > 0.0f;
            int h11 = z11 ? n11.h() + ((InterfaceC10807n) C7714v.X(n11.f())).getIndex() + 1 : (((InterfaceC10807n) C7714v.K(n11.f())).getIndex() - n11.h()) - 1;
            if (h11 < 0 || h11 >= C()) {
                return;
            }
            if (h11 != this.f105758l) {
                if (this.f105760n != z11 && (bVar3 = this.f105759m) != null) {
                    bVar3.cancel();
                }
                this.f105760n = z11;
                this.f105758l = h11;
                this.f105759m = this.f105768v.e(h11, this.f105739A);
            }
            if (z11) {
                if ((((InterfaceC10807n) C7714v.X(n11.f())).getOffset() + (n11.g() + n11.getPageSize())) - n11.o() >= f7 || (bVar2 = this.f105759m) == null) {
                    return;
                }
                bVar2.a();
                return;
            }
            if (n11.p() - ((InterfaceC10807n) C7714v.K(n11.f())).getOffset() >= (-f7) || (bVar = this.f105759m) == null) {
                return;
            }
            bVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r8.d(r6, r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object R(b0 b0Var, EnumC8372M enumC8372M, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        W w11;
        int i11;
        if (cVar instanceof W) {
            w11 = (W) cVar;
            int i12 = w11.f105726i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                w11.f105726i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = w11.f105724g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = w11.f105726i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    w11.f105721d = b0Var;
                    w11.f105722e = enumC8372M;
                    w11.f105723f = function2;
                    w11.f105726i = 1;
                    Object a11 = b0Var.f105770x.a(w11);
                    if (a11 != aVar) {
                        a11 = Unit.f71690a;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b0Var = w11.f105721d;
                        Sc.s.b(obj);
                        b0Var.f105764r.d(-1);
                        return Unit.f71690a;
                    }
                    function2 = w11.f105723f;
                    enumC8372M = w11.f105722e;
                    b0Var = w11.f105721d;
                    Sc.s.b(obj);
                }
                if (!b0Var.f105756j.a()) {
                    b0Var.f105765s.d(b0Var.f105749c.b());
                }
                InterfaceC9108I interfaceC9108I = b0Var.f105756j;
                w11.f105721d = b0Var;
                w11.f105722e = null;
                w11.f105723f = null;
                w11.f105726i = 2;
            }
        }
        w11 = new W(b0Var, cVar);
        Object obj2 = w11.f105724g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = w11.f105726i;
        if (i11 != 0) {
        }
        if (!b0Var.f105756j.a()) {
        }
        InterfaceC9108I interfaceC9108I2 = b0Var.f105756j;
        w11.f105721d = b0Var;
        w11.f105722e = null;
        w11.f105723f = null;
        w11.f105726i = 2;
    }

    public static final Object f(b0 b0Var, kotlin.coroutines.d dVar) {
        Object a11 = b0Var.f105770x.a((kotlin.coroutines.jvm.internal.c) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public static final int h(b0 b0Var) {
        return b0Var.f105764r.getIntValue();
    }

    public static final int i(b0 b0Var) {
        return b0Var.f105765s.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float j(b0 b0Var, float f7) {
        b0Var.getClass();
        long d11 = C6915b.d(b0Var.s() * b0Var.E()) + (b0Var.r() * b0Var.E());
        float f11 = b0Var.f105754h + f7;
        long d12 = C6915b.d(f11);
        b0Var.f105754h = f11 - d12;
        if (Math.abs(f7) < 1.0E-4f) {
            return f7;
        }
        long j11 = d11 + d12;
        long g10 = kotlin.ranges.h.g(j11, b0Var.f105753g, b0Var.f105752f);
        boolean z11 = j11 != g10;
        long j12 = g10 - d11;
        float f12 = j12;
        b0Var.f105755i = f12;
        if (Math.abs(j12) != 0) {
            b0Var.f105745G.setValue(Boolean.valueOf(f12 > 0.0f));
            b0Var.f105746H.setValue(Boolean.valueOf(f12 < 0.0f));
        }
        N n11 = (N) b0Var.f105761o.getValue();
        int i11 = (int) j12;
        if (n11.q(-i11)) {
            b0Var.n(n11, true);
            x0.c0.b(b0Var.f105741C);
        } else {
            b0Var.f105749c.a(i11);
            o0 K11 = b0Var.K();
            if (K11 != null) {
                K11.b();
            }
        }
        return (z11 ? Long.valueOf(j12) : Float.valueOf(f7)).floatValue();
    }

    public static final void k(b0 b0Var, D1.H h11) {
        b0Var.f105771y.setValue(h11);
    }

    public static /* synthetic */ Object m(b0 b0Var, int i11, T0 t02, kotlin.coroutines.jvm.internal.j jVar, int i12) {
        InterfaceC8002m interfaceC8002m = t02;
        if ((i12 & 4) != 0) {
            interfaceC8002m = C8004n.c(0.0f, null, 7);
        }
        return b0Var.l(i11, interfaceC8002m, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(int i11) {
        if (C() > 0) {
            return kotlin.ranges.h.e(i11, 0, C() - 1);
        }
        return 0;
    }

    @NotNull
    public final InterfaceC3978p0<Unit> A() {
        return this.f105742D;
    }

    @NotNull
    public final IntRange B() {
        return (IntRange) this.f105749c.d().getValue();
    }

    public abstract int C();

    /* JADX WARN: Multi-variable type inference failed */
    public final int D() {
        return ((N) this.f105761o.getValue()).getPageSize();
    }

    public final int E() {
        return F() + D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int F() {
        return ((N) this.f105761o.getValue()).g();
    }

    @NotNull
    public final C10583L G() {
        return this.f105740B;
    }

    @NotNull
    public final InterfaceC3978p0<Unit> H() {
        return this.f105741C;
    }

    public final float I() {
        return Math.min(this.f105762p.v1(c0.c()), D() / 2.0f) / D();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o J() {
        return this.f105768v;
    }

    public final o0 K() {
        return (o0) this.f105771y.getValue();
    }

    @NotNull
    public final p0 L() {
        return this.f105772z;
    }

    public final int M() {
        return ((Number) this.f105766t.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long N() {
        return ((C7459e) this.f105747a.getValue()).n();
    }

    public final int P(@NotNull F f7, int i11) {
        return this.f105749c.e(f7, i11);
    }

    public final void S(@NotNull InterfaceC10573B interfaceC10573B) {
        this.f105762p = interfaceC10573B;
    }

    public final void T(long j11) {
        this.f105739A = j11;
    }

    public final void U(long j11) {
        this.f105747a.setValue(C7459e.a(j11));
    }

    public final void V(float f7, int i11) {
        this.f105749c.f(f7, i11);
        o0 K11 = K();
        if (K11 != null) {
            K11.b();
        }
    }

    public final void W(int i11) {
        this.f105764r.d(o(i11));
    }

    @Override // r0.InterfaceC9108I
    public final boolean a() {
        return this.f105756j.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean b() {
        return ((Boolean) this.f105743E.getValue()).booleanValue();
    }

    @Override // r0.InterfaceC9108I
    public final float c(float f7) {
        return this.f105756j.c(f7);
    }

    @Override // r0.InterfaceC9108I
    public final Object d(@NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return R(this, enumC8372M, function2, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean e() {
        return ((Boolean) this.f105744F.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r13 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i11, @NotNull InterfaceC8002m interfaceC8002m, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        T t2;
        int i12;
        b0 b0Var;
        double d11;
        if (cVar instanceof T) {
            t2 = (T) cVar;
            int i13 = t2.f105718i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                t2.f105718i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = t2.f105716g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = t2.f105718i;
                if (i12 != 0) {
                    Sc.s.b(obj);
                    Q q11 = this.f105749c;
                    if ((i11 == q11.b() && q11.c() == 0.0f) || C() == 0) {
                        return Unit.f71690a;
                    }
                    t2.f105713d = this;
                    t2.f105714e = interfaceC8002m;
                    t2.f105715f = i11;
                    t2.f105718i = 1;
                    Object a11 = this.f105770x.a(t2);
                    if (a11 != aVar) {
                        a11 = Unit.f71690a;
                    }
                    if (a11 != aVar) {
                        b0Var = this;
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                i11 = t2.f105715f;
                interfaceC8002m = t2.f105714e;
                b0Var = t2.f105713d;
                Sc.s.b(obj);
                InterfaceC8002m interfaceC8002m2 = interfaceC8002m;
                d11 = 0.0f;
                if (-0.5d <= d11 || d11 > 0.5d) {
                    throw new IllegalArgumentException(C2942q.b(0.0f, "pageOffsetFraction ", " is not within the range -0.5 to 0.5").toString());
                }
                U u11 = new U(b0Var);
                t2.f105713d = null;
                t2.f105714e = null;
                t2.f105718i = 2;
                int i14 = c0.f105777d;
                E e11 = b0Var.f105748b;
                Object e12 = e11.e(new d0(u11, b0Var.o(i11), e11, 0.0f * b0Var.E(), interfaceC8002m2, null), t2);
                if (e12 != aVar) {
                    e12 = Unit.f71690a;
                }
            }
        }
        t2 = new T(this, cVar);
        Object obj2 = t2.f105716g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = t2.f105718i;
        if (i12 != 0) {
        }
        InterfaceC8002m interfaceC8002m22 = interfaceC8002m;
        d11 = 0.0f;
        if (-0.5d <= d11) {
        }
        throw new IllegalArgumentException(C2942q.b(0.0f, "pageOffsetFraction ", " is not within the range -0.5 to 0.5").toString());
    }

    public final void n(@NotNull N n11, boolean z11) {
        Q q11 = this.f105749c;
        if (z11) {
            q11.g(n11.l());
        } else {
            q11.h(n11);
            if (this.f105758l != -1 && !n11.f().isEmpty()) {
                if (this.f105758l != (this.f105760n ? n11.h() + ((InterfaceC10807n) C7714v.X(n11.f())).getIndex() + 1 : (((InterfaceC10807n) C7714v.K(n11.f())).getIndex() - n11.h()) - 1)) {
                    this.f105758l = -1;
                    o.b bVar = this.f105759m;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    this.f105759m = null;
                }
            }
        }
        this.f105761o.setValue(n11);
        this.f105743E.setValue(Boolean.valueOf(n11.j()));
        this.f105744F.setValue(Boolean.valueOf(n11.i()));
        C10806m m11 = n11.m();
        if (m11 != null) {
            this.f105750d = m11.getIndex();
        }
        this.f105751e = n11.n();
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            if (Math.abs(this.f105755i) > 0.5f && this.f105757k && O(this.f105755i)) {
                Q(this.f105755i, n11);
            }
            Unit unit = Unit.f71690a;
            AbstractC5715f.a.d(a11, b11, h11);
            this.f105752f = c0.b(n11, C());
            C();
            int a12 = (int) (n11.getOrientation() == EnumC9142v.Horizontal ? n11.a() >> 32 : n11.a() & 4294967295L);
            n11.d().getClass();
            this.f105753g = kotlin.ranges.h.e(0, 0, a12);
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a11, b11, h11);
            throw th2;
        }
    }

    @NotNull
    public final C10598c p() {
        return this.f105770x;
    }

    @NotNull
    public final C10606k q() {
        return this.f105769w;
    }

    public final int r() {
        return this.f105749c.b();
    }

    public final float s() {
        return this.f105749c.c();
    }

    @NotNull
    public final Z1.d t() {
        return this.f105762p;
    }

    public final int u() {
        return this.f105750d;
    }

    public final int v() {
        return this.f105751e;
    }

    @NotNull
    public final t0.o w() {
        return this.f105763q;
    }

    @NotNull
    public final t0.q x() {
        return this.f105763q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.f105745G.getValue()).booleanValue();
    }

    @NotNull
    public final InterfaceC10793C z() {
        return (InterfaceC10793C) this.f105761o.getValue();
    }
}
