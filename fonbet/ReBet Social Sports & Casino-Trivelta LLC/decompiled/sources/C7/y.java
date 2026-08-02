package C7;

import android.content.Context;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import java.util.Set;
import w7.C6717b;
import w7.InterfaceC6716a;
import z7.AbstractC6940d;
import z7.C6941e;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: p, reason: collision with root package name */
    public static final Class f1479p = y.class;

    /* renamed from: q, reason: collision with root package name */
    public static y f1480q;

    /* renamed from: r, reason: collision with root package name */
    public static C1055t f1481r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f1482s;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f1483a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1057v f1484b;

    /* renamed from: c, reason: collision with root package name */
    public final C1037a f1485c;

    /* renamed from: d, reason: collision with root package name */
    public final D6.n f1486d;

    /* renamed from: e, reason: collision with root package name */
    public A7.n f1487e;

    /* renamed from: f, reason: collision with root package name */
    public A7.u f1488f;

    /* renamed from: g, reason: collision with root package name */
    public A7.n f1489g;

    /* renamed from: h, reason: collision with root package name */
    public A7.u f1490h;

    /* renamed from: i, reason: collision with root package name */
    public F7.c f1491i;

    /* renamed from: j, reason: collision with root package name */
    public O7.d f1492j;

    /* renamed from: k, reason: collision with root package name */
    public C f1493k;

    /* renamed from: l, reason: collision with root package name */
    public W f1494l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC6940d f1495m;

    /* renamed from: n, reason: collision with root package name */
    public L7.d f1496n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC6716a f1497o;

    public y(InterfaceC1057v interfaceC1057v) {
        if (N7.b.d()) {
            N7.b.a("ImagePipelineConfig()");
        }
        InterfaceC1057v interfaceC1057v2 = (InterfaceC1057v) D6.k.g(interfaceC1057v);
        this.f1484b = interfaceC1057v2;
        this.f1483a = interfaceC1057v2.G().G() ? new com.facebook.imagepipeline.producers.B(interfaceC1057v.H().a()) : new q0(interfaceC1057v.H().a());
        this.f1485c = new C1037a(interfaceC1057v.w());
        if (N7.b.d()) {
            N7.b.b();
        }
        this.f1486d = interfaceC1057v2.v();
        if (interfaceC1057v2.G().A()) {
            u7.e.e().g(true);
        }
    }

    public static y l() {
        return (y) D6.k.h(f1480q, "ImagePipelineFactory was not initialized!");
    }

    public static synchronized void s(InterfaceC1057v interfaceC1057v) {
        synchronized (y.class) {
            if (f1480q != null) {
                E6.a.G(f1479p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                if (f1482s) {
                    return;
                }
            }
            f1480q = new y(interfaceC1057v);
        }
    }

    public static synchronized void t(Context context) {
        synchronized (y.class) {
            try {
                if (N7.b.d()) {
                    N7.b.a("ImagePipelineFactory#initialize");
                }
                s(C1056u.K(context).a());
                if (N7.b.d()) {
                    N7.b.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C1055t a() {
        W p10 = p();
        Set e10 = this.f1484b.e();
        Set a10 = this.f1484b.a();
        D6.n C10 = this.f1484b.C();
        A7.u e11 = e();
        A7.u h10 = h();
        D6.n nVar = this.f1486d;
        A7.k y10 = this.f1484b.y();
        p0 p0Var = this.f1483a;
        D6.n t10 = this.f1484b.G().t();
        D6.n I10 = this.f1484b.G().I();
        this.f1484b.F();
        return new C1055t(p10, e10, a10, C10, e11, h10, nVar, y10, p0Var, t10, I10, null, this.f1484b);
    }

    public G7.a b(Context context) {
        InterfaceC6716a c10 = c();
        if (c10 == null) {
            return null;
        }
        return c10.a(context);
    }

    public final InterfaceC6716a c() {
        if (this.f1497o == null) {
            this.f1497o = C6717b.a(m(), this.f1484b.H(), d(), this.f1484b.G().j(), this.f1484b.G().v(), this.f1484b.G().c(), this.f1484b.G().d(), this.f1484b.l());
        }
        return this.f1497o;
    }

    public A7.n d() {
        if (this.f1487e == null) {
            this.f1487e = this.f1484b.x().a(this.f1484b.q(), this.f1484b.D(), this.f1484b.g(), this.f1484b.G().r(), this.f1484b.G().q(), this.f1484b.k());
        }
        return this.f1487e;
    }

    public A7.u e() {
        if (this.f1488f == null) {
            this.f1488f = A7.v.a(d(), this.f1484b.B());
        }
        return this.f1488f;
    }

    public C1037a f() {
        return this.f1485c;
    }

    public A7.n g() {
        if (this.f1489g == null) {
            this.f1489g = A7.r.a(this.f1484b.s(), this.f1484b.D(), this.f1484b.f());
        }
        return this.f1489g;
    }

    public A7.u h() {
        if (this.f1490h == null) {
            this.f1490h = A7.s.a(this.f1484b.c() != null ? this.f1484b.c() : g(), this.f1484b.B());
        }
        return this.f1490h;
    }

    public final F7.c i() {
        F7.c cVar;
        F7.c cVar2;
        if (this.f1491i == null) {
            if (this.f1484b.r() != null) {
                this.f1491i = this.f1484b.r();
            } else {
                InterfaceC6716a c10 = c();
                if (c10 != null) {
                    cVar = c10.c();
                    cVar2 = c10.b();
                } else {
                    cVar = null;
                    cVar2 = null;
                }
                F7.c r10 = r();
                this.f1484b.o();
                this.f1491i = new F7.b(cVar, cVar2, r10, n());
            }
        }
        return this.f1491i;
    }

    public C1055t j() {
        if (f1481r == null) {
            f1481r = a();
        }
        return f1481r;
    }

    public final O7.d k() {
        if (this.f1492j == null) {
            if (this.f1484b.n() == null && this.f1484b.m() == null && this.f1484b.G().J()) {
                this.f1492j = new O7.h(this.f1484b.G().m());
            } else {
                this.f1492j = new O7.f(this.f1484b.G().m(), this.f1484b.G().x(), this.f1484b.n(), this.f1484b.m(), this.f1484b.G().F());
            }
        }
        return this.f1492j;
    }

    public AbstractC6940d m() {
        if (this.f1495m == null) {
            this.f1495m = C6941e.a(this.f1484b.t(), n(), f());
        }
        return this.f1495m;
    }

    public L7.d n() {
        if (this.f1496n == null) {
            this.f1496n = L7.e.a(this.f1484b.t(), this.f1484b.G().H(), this.f1484b.G().s(), this.f1484b.G().o());
        }
        return this.f1496n;
    }

    public final C o() {
        if (this.f1493k == null) {
            this.f1493k = this.f1484b.G().p().a(this.f1484b.getContext(), this.f1484b.t().k(), i(), this.f1484b.h(), this.f1484b.E(), this.f1484b.z(), this.f1484b.G().B(), this.f1484b.H(), this.f1484b.t().i(this.f1484b.u()), this.f1484b.t().j(), e(), h(), this.f1486d, this.f1484b.y(), m(), this.f1484b.G().g(), this.f1484b.G().f(), this.f1484b.G().e(), this.f1484b.G().m(), f(), this.f1484b.G().l(), this.f1484b.G().u());
        }
        return this.f1493k;
    }

    public final W p() {
        boolean w10 = this.f1484b.G().w();
        if (this.f1494l == null) {
            this.f1494l = new W(this.f1484b.getContext().getApplicationContext().getContentResolver(), o(), this.f1484b.b(), this.f1484b.z(), this.f1484b.G().L(), this.f1483a, this.f1484b.E(), w10, this.f1484b.G().K(), this.f1484b.p(), k(), this.f1484b.G().E(), this.f1484b.G().C(), this.f1484b.G().a(), this.f1484b.A());
        }
        return this.f1494l;
    }

    public G7.a q() {
        if (this.f1484b.G().A()) {
            return new Q7.a();
        }
        return null;
    }

    public F7.c r() {
        if (this.f1484b.G().A()) {
            return new Q7.b(this.f1484b.getContext().getApplicationContext().getResources());
        }
        return null;
    }
}
