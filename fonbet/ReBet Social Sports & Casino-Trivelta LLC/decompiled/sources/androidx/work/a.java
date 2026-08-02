package androidx.work;

import Ph.AbstractC1481v0;
import Ph.C1452g0;
import Q2.AbstractC1492c;
import Q2.AbstractC1501l;
import Q2.C1495f;
import Q2.F;
import Q2.G;
import Q2.H;
import Q2.InterfaceC1491b;
import Q2.O;
import Q2.v;
import R2.C1529e;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: u, reason: collision with root package name */
    public static final b f23729u = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23730a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f23731b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f23732c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1491b f23733d;

    /* renamed from: e, reason: collision with root package name */
    public final O f23734e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1501l f23735f;

    /* renamed from: g, reason: collision with root package name */
    public final F f23736g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC6772a f23737h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC6772a f23738i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC6772a f23739j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC6772a f23740k;

    /* renamed from: l, reason: collision with root package name */
    public final String f23741l;

    /* renamed from: m, reason: collision with root package name */
    public final int f23742m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23743n;

    /* renamed from: o, reason: collision with root package name */
    public final int f23744o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23745p;

    /* renamed from: q, reason: collision with root package name */
    public final int f23746q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f23747r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f23748s;

    /* renamed from: t, reason: collision with root package name */
    public final H f23749t;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0414a {

        /* renamed from: a, reason: collision with root package name */
        public Executor f23750a;

        /* renamed from: b, reason: collision with root package name */
        public CoroutineContext f23751b;

        /* renamed from: c, reason: collision with root package name */
        public O f23752c;

        /* renamed from: d, reason: collision with root package name */
        public AbstractC1501l f23753d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f23754e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC1491b f23755f;

        /* renamed from: g, reason: collision with root package name */
        public F f23756g;

        /* renamed from: h, reason: collision with root package name */
        public InterfaceC6772a f23757h;

        /* renamed from: i, reason: collision with root package name */
        public InterfaceC6772a f23758i;

        /* renamed from: j, reason: collision with root package name */
        public InterfaceC6772a f23759j;

        /* renamed from: k, reason: collision with root package name */
        public InterfaceC6772a f23760k;

        /* renamed from: l, reason: collision with root package name */
        public String f23761l;

        /* renamed from: n, reason: collision with root package name */
        public int f23763n;

        /* renamed from: s, reason: collision with root package name */
        public H f23768s;

        /* renamed from: m, reason: collision with root package name */
        public int f23762m = 4;

        /* renamed from: o, reason: collision with root package name */
        public int f23764o = Integer.MAX_VALUE;

        /* renamed from: p, reason: collision with root package name */
        public int f23765p = 20;

        /* renamed from: q, reason: collision with root package name */
        public int f23766q = 8;

        /* renamed from: r, reason: collision with root package name */
        public boolean f23767r = true;

        public final a a() {
            return new a(this);
        }

        public final InterfaceC1491b b() {
            return this.f23755f;
        }

        public final int c() {
            return this.f23766q;
        }

        public final String d() {
            return this.f23761l;
        }

        public final Executor e() {
            return this.f23750a;
        }

        public final InterfaceC6772a f() {
            return this.f23757h;
        }

        public final AbstractC1501l g() {
            return this.f23753d;
        }

        public final int h() {
            return this.f23762m;
        }

        public final boolean i() {
            return this.f23767r;
        }

        public final int j() {
            return this.f23764o;
        }

        public final int k() {
            return this.f23765p;
        }

        public final int l() {
            return this.f23763n;
        }

        public final F m() {
            return this.f23756g;
        }

        public final InterfaceC6772a n() {
            return this.f23758i;
        }

        public final Executor o() {
            return this.f23754e;
        }

        public final H p() {
            return this.f23768s;
        }

        public final CoroutineContext q() {
            return this.f23751b;
        }

        public final InterfaceC6772a r() {
            return this.f23760k;
        }

        public final O s() {
            return this.f23752c;
        }

        public final InterfaceC6772a t() {
            return this.f23759j;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public a(C0414a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CoroutineContext q10 = builder.q();
        Executor e10 = builder.e();
        if (e10 == null) {
            e10 = q10 != null ? AbstractC1492c.d(q10) : null;
            if (e10 == null) {
                e10 = AbstractC1492c.e(false);
            }
        }
        this.f23730a = e10;
        this.f23731b = q10 == null ? builder.e() != null ? AbstractC1481v0.b(e10) : C1452g0.a() : q10;
        this.f23747r = builder.o() == null;
        Executor o10 = builder.o();
        this.f23732c = o10 == null ? AbstractC1492c.e(true) : o10;
        InterfaceC1491b b10 = builder.b();
        this.f23733d = b10 == null ? new G() : b10;
        O s10 = builder.s();
        this.f23734e = s10 == null ? C1495f.f9280a : s10;
        AbstractC1501l g10 = builder.g();
        this.f23735f = g10 == null ? v.f9315a : g10;
        F m10 = builder.m();
        this.f23736g = m10 == null ? new C1529e() : m10;
        this.f23742m = builder.h();
        this.f23743n = builder.l();
        this.f23744o = builder.j();
        this.f23746q = builder.k();
        this.f23737h = builder.f();
        this.f23738i = builder.n();
        this.f23739j = builder.t();
        this.f23740k = builder.r();
        this.f23741l = builder.d();
        this.f23745p = builder.c();
        this.f23748s = builder.i();
        H p10 = builder.p();
        this.f23749t = p10 == null ? AbstractC1492c.f() : p10;
    }

    public final InterfaceC1491b a() {
        return this.f23733d;
    }

    public final int b() {
        return this.f23745p;
    }

    public final String c() {
        return this.f23741l;
    }

    public final Executor d() {
        return this.f23730a;
    }

    public final InterfaceC6772a e() {
        return this.f23737h;
    }

    public final AbstractC1501l f() {
        return this.f23735f;
    }

    public final int g() {
        return this.f23744o;
    }

    public final int h() {
        return this.f23746q;
    }

    public final int i() {
        return this.f23743n;
    }

    public final int j() {
        return this.f23742m;
    }

    public final F k() {
        return this.f23736g;
    }

    public final InterfaceC6772a l() {
        return this.f23738i;
    }

    public final Executor m() {
        return this.f23732c;
    }

    public final H n() {
        return this.f23749t;
    }

    public final CoroutineContext o() {
        return this.f23731b;
    }

    public final InterfaceC6772a p() {
        return this.f23740k;
    }

    public final O q() {
        return this.f23734e;
    }

    public final InterfaceC6772a r() {
        return this.f23739j;
    }

    public final boolean s() {
        return this.f23748s;
    }
}
