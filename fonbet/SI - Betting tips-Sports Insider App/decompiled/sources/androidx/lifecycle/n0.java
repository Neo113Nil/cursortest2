package androidx.lifecycle;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2209k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2210a;

    /* renamed from: b, reason: collision with root package name */
    public final p.f f2211b;

    /* renamed from: c, reason: collision with root package name */
    public int f2212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2213d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2214e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2215f;

    /* renamed from: g, reason: collision with root package name */
    public int f2216g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2217h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2218i;
    public final j0 j;

    public n0(Object obj) {
        this.f2210a = new Object();
        this.f2211b = new p.f();
        this.f2212c = 0;
        this.f2215f = f2209k;
        this.j = new j0(this);
        this.f2214e = obj;
        this.f2216g = 0;
    }

    public static void a(String str) {
        if (!o.b.K0().L0()) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.n("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(m0 m0Var) {
        if (m0Var.f2204b) {
            if (!m0Var.e()) {
                m0Var.a(false);
                return;
            }
            int i5 = m0Var.f2205c;
            int i10 = this.f2216g;
            if (i5 >= i10) {
                return;
            }
            m0Var.f2205c = i10;
            m0Var.f2203a.a(this.f2214e);
        }
    }

    public final void c(m0 m0Var) {
        if (this.f2217h) {
            this.f2218i = true;
            return;
        }
        this.f2217h = true;
        do {
            this.f2218i = false;
            if (m0Var != null) {
                b(m0Var);
                m0Var = null;
            } else {
                p.f fVar = this.f2211b;
                fVar.getClass();
                p.d dVar = new p.d(fVar);
                fVar.f21396c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((m0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2218i) {
                        break;
                    }
                }
            }
        } while (this.f2218i);
        this.f2217h = false;
    }

    public final Object d() {
        Object obj = this.f2214e;
        if (obj != f2209k) {
            return obj;
        }
        return null;
    }

    public final void e(e0 e0Var, q0 q0Var) {
        Object obj;
        a("observe");
        if (((g0) e0Var.getLifecycle()).f2169d == x.f2253a) {
            return;
        }
        l0 l0Var = new l0(this, e0Var, q0Var);
        p.f fVar = this.f2211b;
        p.c a7 = fVar.a(q0Var);
        if (a7 != null) {
            obj = a7.f21388b;
        } else {
            p.c cVar = new p.c(q0Var, l0Var);
            fVar.f21397d++;
            p.c cVar2 = fVar.f21395b;
            if (cVar2 == null) {
                fVar.f21394a = cVar;
                fVar.f21395b = cVar;
            } else {
                cVar2.f21389c = cVar;
                cVar.f21390d = cVar2;
                fVar.f21395b = cVar;
            }
            obj = null;
        }
        m0 m0Var = (m0) obj;
        if (m0Var != null && !m0Var.d(e0Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (m0Var != null) {
            return;
        }
        e0Var.getLifecycle().a(l0Var);
    }

    public void h(Object obj) {
        boolean z5;
        synchronized (this.f2210a) {
            z5 = this.f2215f == f2209k;
            this.f2215f = obj;
        }
        if (z5) {
            o.b.K0().M0(this.j);
        }
    }

    public void i(q0 q0Var) {
        a("removeObserver");
        m0 m0Var = (m0) this.f2211b.b(q0Var);
        if (m0Var == null) {
            return;
        }
        m0Var.b();
        m0Var.a(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f2216g++;
        this.f2214e = obj;
        c(null);
    }

    public n0() {
        this.f2210a = new Object();
        this.f2211b = new p.f();
        this.f2212c = 0;
        Object obj = f2209k;
        this.f2215f = obj;
        this.j = new j0(this);
        this.f2214e = obj;
        this.f2216g = -1;
    }

    public void f() {
    }

    public void g() {
    }
}
