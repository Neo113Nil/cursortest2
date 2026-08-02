package io.sentry;

import io.sentry.F3;
import io.sentry.protocol.C4799a;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4806h;
import io.sentry.util.AbstractC4845c;
import io.sentry.util.AbstractC4848f;
import io.sentry.util.AbstractC4850h;
import io.sentry.util.C4843a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class L1 implements InterfaceC4730c0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile io.sentry.protocol.u f50413a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC4788n3 f50414b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4790o0 f50415c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f50416d;

    /* renamed from: e, reason: collision with root package name */
    public String f50417e;

    /* renamed from: f, reason: collision with root package name */
    public io.sentry.protocol.F f50418f;

    /* renamed from: g, reason: collision with root package name */
    public String f50419g;

    /* renamed from: h, reason: collision with root package name */
    public io.sentry.protocol.p f50420h;

    /* renamed from: i, reason: collision with root package name */
    public List f50421i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Queue f50422j;

    /* renamed from: k, reason: collision with root package name */
    public Map f50423k;

    /* renamed from: l, reason: collision with root package name */
    public Map f50424l;

    /* renamed from: m, reason: collision with root package name */
    public Map f50425m;

    /* renamed from: n, reason: collision with root package name */
    public List f50426n;

    /* renamed from: o, reason: collision with root package name */
    public volatile F3 f50427o;

    /* renamed from: p, reason: collision with root package name */
    public volatile V3 f50428p;

    /* renamed from: q, reason: collision with root package name */
    public final C4843a f50429q;

    /* renamed from: r, reason: collision with root package name */
    public final C4843a f50430r;

    /* renamed from: s, reason: collision with root package name */
    public final C4843a f50431s;

    /* renamed from: t, reason: collision with root package name */
    public C4802d f50432t;

    /* renamed from: u, reason: collision with root package name */
    public List f50433u;

    /* renamed from: v, reason: collision with root package name */
    public E1 f50434v;

    /* renamed from: w, reason: collision with root package name */
    public io.sentry.protocol.u f50435w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4755h0 f50436x;

    /* renamed from: y, reason: collision with root package name */
    public final Map f50437y;

    /* renamed from: z, reason: collision with root package name */
    public final io.sentry.featureflags.b f50438z;

    public interface a {
        void a(E1 e12);
    }

    public interface b {
        void a(V3 v32);
    }

    public interface c {
        void a(InterfaceC4790o0 interfaceC4790o0);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final V3 f50439a;

        /* renamed from: b, reason: collision with root package name */
        public final V3 f50440b;

        public d(V3 v32, V3 v33) {
            this.f50440b = v32;
            this.f50439a = v33;
        }

        public V3 a() {
            return this.f50440b;
        }

        public V3 b() {
            return this.f50439a;
        }
    }

    public L1(F3 f32) {
        this.f50416d = new WeakReference(null);
        this.f50421i = new ArrayList();
        this.f50423k = new ConcurrentHashMap();
        this.f50424l = new ConcurrentHashMap();
        this.f50425m = new ConcurrentHashMap();
        this.f50426n = new CopyOnWriteArrayList();
        this.f50429q = new C4843a();
        this.f50430r = new C4843a();
        this.f50431s = new C4843a();
        this.f50432t = new C4802d();
        this.f50433u = new CopyOnWriteArrayList();
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        this.f50435w = uVar;
        this.f50436x = C4741e1.n();
        this.f50437y = Collections.synchronizedMap(new WeakHashMap());
        this.f50427o = (F3) io.sentry.util.w.c(f32, "SentryOptions is required.");
        this.f50422j = n(this.f50427o.getMaxBreadcrumbs());
        this.f50438z = io.sentry.featureflags.a.a(f32);
        this.f50434v = new E1();
        this.f50413a = uVar;
    }

    public static Queue n(int i10) {
        return i10 > 0 ? h4.c(new C4749g(i10)) : new C4853v();
    }

    @Override // io.sentry.InterfaceC4730c0
    public List A() {
        return this.f50426n;
    }

    @Override // io.sentry.InterfaceC4730c0
    public C4802d B() {
        return this.f50432t;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void C(String str, Object obj) {
        if (str == null) {
            return;
        }
        this.f50432t.l(str, obj);
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(this.f50432t);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void D(InterfaceC4790o0 interfaceC4790o0) {
        InterfaceC4765j0 d10 = this.f50430r.d();
        try {
            this.f50415c = interfaceC4790o0;
            for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
                if (interfaceC4790o0 != null) {
                    interfaceC4735d0.m(interfaceC4790o0.getName());
                    interfaceC4735d0.i(interfaceC4790o0.a(), this);
                } else {
                    interfaceC4735d0.m(null);
                    interfaceC4735d0.i(null, this);
                }
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public List E() {
        return this.f50421i;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void F(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            I(str);
        } else {
            this.f50424l.put(str, C4782m2.b(str, obj));
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public String G() {
        InterfaceC4790o0 interfaceC4790o0 = this.f50415c;
        return interfaceC4790o0 != null ? interfaceC4790o0.getName() : this.f50417e;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void H() {
        InterfaceC4765j0 d10 = this.f50430r.d();
        try {
            this.f50415c = null;
            if (d10 != null) {
                d10.close();
            }
            this.f50417e = null;
            for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
                interfaceC4735d0.m(null);
                interfaceC4735d0.i(null, this);
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void I(String str) {
        if (str == null) {
            return;
        }
        this.f50424l.remove(str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.featureflags.b J() {
        return this.f50438z;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void K(InterfaceC4755h0 interfaceC4755h0) {
        this.f50436x = interfaceC4755h0;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void L(String str) {
        if (str == null) {
            return;
        }
        this.f50432t.n(str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 M() {
        return this.f50428p;
    }

    @Override // io.sentry.InterfaceC4730c0
    public EnumC4788n3 N() {
        return this.f50414b;
    }

    @Override // io.sentry.InterfaceC4730c0
    public E1 O() {
        return this.f50434v;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void P(String str) {
        this.f50419g = str;
        C4802d B10 = B();
        C4799a d10 = B10.d();
        if (d10 == null) {
            d10 = new C4799a();
            B10.o(d10);
        }
        if (str == null) {
            d10.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            d10.x(arrayList);
        }
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(B10);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4755h0 Q() {
        return this.f50436x;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void R(C4792o2 c4792o2) {
        if (c4792o2 == null) {
            return;
        }
        for (C4782m2 c4782m2 : c4792o2.c().values()) {
            this.f50424l.put(c4782m2.a(), c4782m2);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public List S() {
        return new CopyOnWriteArrayList(this.f50433u);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void T(C4733c3 c4733c3) {
        io.sentry.util.x xVar;
        InterfaceC4780m0 interfaceC4780m0;
        if (!this.f50427o.isTracingEnabled() || c4733c3.O() == null || (xVar = (io.sentry.util.x) this.f50437y.get(AbstractC4850h.a(c4733c3.O()))) == null) {
            return;
        }
        WeakReference weakReference = (WeakReference) xVar.a();
        if (c4733c3.C().j() == null && weakReference != null && (interfaceC4780m0 = (InterfaceC4780m0) weakReference.get()) != null) {
            c4733c3.C().A(interfaceC4780m0.a());
        }
        String str = (String) xVar.b();
        if (c4733c3.w0() != null || str == null) {
            return;
        }
        c4733c3.H0(str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void U() {
        InterfaceC4765j0 d10 = this.f50429q.d();
        try {
            this.f50428p = null;
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public E1 V(a aVar) {
        InterfaceC4765j0 d10 = this.f50431s.d();
        try {
            aVar.a(this.f50434v);
            E1 e12 = new E1(this.f50434v);
            if (d10 != null) {
                d10.close();
            }
            return e12;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void W(c cVar) {
        InterfaceC4765j0 d10 = this.f50430r.d();
        try {
            cVar.a(this.f50415c);
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void X(io.sentry.protocol.u uVar) {
        this.f50413a = uVar;
    }

    @Override // io.sentry.InterfaceC4730c0
    public List Y() {
        return AbstractC4848f.a(this.f50426n);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void Z(E1 e12) {
        this.f50434v = e12;
        a4 i10 = e12.i();
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().i(i10, this);
        }
    }

    public void a() {
        this.f50433u.clear();
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    public void a0(String str) {
        if (str == null) {
            return;
        }
        this.f50423k.remove(str);
        for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
            interfaceC4735d0.c(str);
            interfaceC4735d0.b(this.f50423k);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public String b() {
        return this.f50419g;
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.p c() {
        return this.f50420h;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void clear() {
        this.f50414b = null;
        this.f50418f = null;
        this.f50420h = null;
        this.f50419g = null;
        this.f50421i.clear();
        z();
        this.f50423k.clear();
        this.f50424l.clear();
        this.f50425m.clear();
        this.f50426n.clear();
        H();
        a();
        m();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void d(C4744f c4744f) {
        g(c4744f, null);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void e(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            a0(str);
            return;
        }
        this.f50423k.put(str, str2);
        for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
            interfaceC4735d0.e(str, str2);
            interfaceC4735d0.b(this.f50423k);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 endSession() {
        InterfaceC4765j0 d10 = this.f50429q.d();
        try {
            V3 v32 = null;
            if (this.f50428p != null) {
                this.f50428p.c();
                this.f50427o.getContinuousProfiler().c();
                V3 clone = this.f50428p.clone();
                this.f50428p = null;
                v32 = clone;
            }
            if (d10 != null) {
                d10.close();
            }
            return v32;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void f(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            q(str);
            return;
        }
        this.f50425m.put(str, str2);
        for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
            interfaceC4735d0.f(str, str2);
            interfaceC4735d0.l(this.f50425m);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void g(C4744f c4744f, J j10) {
        if (c4744f == null || (this.f50422j instanceof C4853v)) {
            return;
        }
        F3.a beforeBreadcrumb = this.f50427o.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            if (j10 == null) {
                j10 = new J();
            }
            c4744f = o(beforeBreadcrumb, c4744f, j10);
        }
        if (c4744f == null) {
            this.f50427o.getLogger().c(EnumC4788n3.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f50422j.add(c4744f);
        for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
            interfaceC4735d0.d(c4744f);
            interfaceC4735d0.h(this.f50422j);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public Map getExtras() {
        return this.f50425m;
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.F getUser() {
        return this.f50418f;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
        io.sentry.util.w.c(th2, "throwable is required");
        io.sentry.util.w.c(interfaceC4780m0, "span is required");
        io.sentry.util.w.c(str, "transactionName is required");
        Throwable a10 = AbstractC4850h.a(th2);
        if (this.f50437y.containsKey(a10)) {
            return;
        }
        this.f50437y.put(a10, new io.sentry.util.x(new WeakReference(interfaceC4780m0), str));
    }

    @Override // io.sentry.InterfaceC4730c0
    public F3 i() {
        return this.f50427o;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void j(io.sentry.protocol.F f10) {
        this.f50418f = f10;
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(f10);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4790o0 k() {
        return this.f50415c;
    }

    @Override // io.sentry.InterfaceC4730c0
    public C4806h l() {
        return this.f50438z.l();
    }

    public void m() {
        this.f50438z.clear();
    }

    public final C4744f o(F3.a aVar, C4744f c4744f, J j10) {
        try {
            return aVar.a(c4744f, j10);
        } catch (Throwable th2) {
            this.f50427o.getLogger().b(EnumC4788n3.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
            if (th2.getMessage() != null) {
                c4744f.w("sentry:message", th2.getMessage());
            }
            return c4744f;
        }
    }

    public io.sentry.protocol.u p() {
        return this.f50413a;
    }

    public void q(String str) {
        if (str == null) {
            return;
        }
        this.f50425m.remove(str);
        for (InterfaceC4735d0 interfaceC4735d0 : this.f50427o.getScopeObservers()) {
            interfaceC4735d0.a(str);
            interfaceC4735d0.l(this.f50425m);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.u r() {
        return this.f50435w;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void s(io.sentry.protocol.u uVar) {
        this.f50435w = uVar;
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().s(uVar);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public d t() {
        InterfaceC4765j0 d10 = this.f50429q.d();
        try {
            if (this.f50428p != null) {
                this.f50428p.c();
                this.f50427o.getContinuousProfiler().c();
            }
            V3 v32 = this.f50428p;
            d dVar = null;
            if (this.f50427o.getRelease() != null) {
                this.f50428p = new V3(this.f50427o.getDistinctId(), this.f50418f, this.f50427o.getEnvironment(), this.f50427o.getRelease());
                dVar = new d(this.f50428p.clone(), v32 != null ? v32.clone() : null);
            } else {
                this.f50427o.getLogger().c(EnumC4788n3.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (d10 != null) {
                d10.close();
            }
            return dVar;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public void u(F3 f32) {
        this.f50427o = f32;
        Queue queue = this.f50422j;
        this.f50422j = n(f32.getMaxBreadcrumbs());
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            d((C4744f) it.next());
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4780m0 v() {
        InterfaceC4780m0 p10;
        InterfaceC4780m0 interfaceC4780m0 = (InterfaceC4780m0) this.f50416d.get();
        if (interfaceC4780m0 != null) {
            return interfaceC4780m0;
        }
        InterfaceC4790o0 interfaceC4790o0 = this.f50415c;
        return (interfaceC4790o0 == null || (p10 = interfaceC4790o0.p()) == null) ? interfaceC4790o0 : p10;
    }

    @Override // io.sentry.InterfaceC4730c0
    public Queue w() {
        return this.f50422j;
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 x(b bVar) {
        InterfaceC4765j0 d10 = this.f50429q.d();
        try {
            bVar.a(this.f50428p);
            V3 clone = this.f50428p != null ? this.f50428p.clone() : null;
            if (d10 != null) {
                d10.close();
            }
            return clone;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    public Map y() {
        return AbstractC4845c.b(this.f50423k);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void z() {
        this.f50422j.clear();
        Iterator<InterfaceC4735d0> it = this.f50427o.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(this.f50422j);
        }
    }

    @Override // io.sentry.InterfaceC4730c0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC4730c0 m125clone() {
        return new L1(this);
    }

    public L1(L1 l12) {
        this.f50416d = new WeakReference(null);
        this.f50421i = new ArrayList();
        this.f50423k = new ConcurrentHashMap();
        this.f50424l = new ConcurrentHashMap();
        this.f50425m = new ConcurrentHashMap();
        this.f50426n = new CopyOnWriteArrayList();
        this.f50429q = new C4843a();
        this.f50430r = new C4843a();
        this.f50431s = new C4843a();
        this.f50432t = new C4802d();
        this.f50433u = new CopyOnWriteArrayList();
        this.f50435w = io.sentry.protocol.u.f52477c;
        this.f50436x = C4741e1.n();
        this.f50437y = Collections.synchronizedMap(new WeakHashMap());
        this.f50415c = l12.f50415c;
        this.f50417e = l12.f50417e;
        this.f50416d = l12.f50416d;
        this.f50428p = l12.f50428p;
        this.f50427o = l12.f50427o;
        this.f50414b = l12.f50414b;
        this.f50436x = l12.f50436x;
        this.f50413a = l12.p();
        io.sentry.protocol.F f10 = l12.f50418f;
        this.f50418f = f10 != null ? new io.sentry.protocol.F(f10) : null;
        this.f50419g = l12.f50419g;
        this.f50435w = l12.f50435w;
        io.sentry.protocol.p pVar = l12.f50420h;
        this.f50420h = pVar != null ? new io.sentry.protocol.p(pVar) : null;
        this.f50421i = new ArrayList(l12.f50421i);
        this.f50426n = new CopyOnWriteArrayList(l12.f50426n);
        C4744f[] c4744fArr = (C4744f[]) l12.f50422j.toArray(new C4744f[0]);
        Queue n10 = n(l12.f50427o.getMaxBreadcrumbs());
        for (C4744f c4744f : c4744fArr) {
            n10.add(new C4744f(c4744f));
        }
        this.f50422j = n10;
        Map map = l12.f50423k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f50423k = concurrentHashMap;
        Map map2 = l12.f50424l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put((String) entry2.getKey(), (C4782m2) entry2.getValue());
            }
        }
        this.f50424l = concurrentHashMap2;
        Map map3 = l12.f50425m;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap3.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.f50425m = concurrentHashMap3;
        this.f50432t = new C4802d(l12.f50432t);
        this.f50433u = new CopyOnWriteArrayList(l12.f50433u);
        this.f50438z = l12.f50438z.m139clone();
        this.f50434v = new E1(l12.f50434v);
    }
}
