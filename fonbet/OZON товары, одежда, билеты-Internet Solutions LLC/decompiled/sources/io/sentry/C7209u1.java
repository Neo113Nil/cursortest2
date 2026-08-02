package io.sentry;

import io.sentry.W2;
import io.sentry.h3;
import io.sentry.protocol.C7185a;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7191g;
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
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7209u1 implements U {

    /* renamed from: a, reason: collision with root package name */
    private I2 f68552a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC7142f0 f68553b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC7134d0> f68554c;

    /* renamed from: d, reason: collision with root package name */
    private String f68555d;

    /* renamed from: e, reason: collision with root package name */
    private io.sentry.protocol.E f68556e;

    /* renamed from: f, reason: collision with root package name */
    private String f68557f;

    /* renamed from: g, reason: collision with root package name */
    private io.sentry.protocol.o f68558g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private ArrayList f68559h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private volatile Object f68560i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap f68561j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap f68562k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap f68563l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private CopyOnWriteArrayList f68564m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private volatile W2 f68565n;

    /* renamed from: o, reason: collision with root package name */
    private volatile h3 f68566o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68567p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68568q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68569r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private C7187c f68570s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private CopyOnWriteArrayList f68571t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private C7175n1 f68572u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f68573v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private Y f68574w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final Map<Throwable, io.sentry.util.q<WeakReference<InterfaceC7134d0>, String>> f68575x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final io.sentry.featureflags.b f68576y;

    /* renamed from: io.sentry.u1$a */
    public interface a {
        void a(@NotNull C7175n1 c7175n1);
    }

    /* renamed from: io.sentry.u1$b */
    /* loaded from: classes10.dex */
    interface b {
        void a(h3 h3Var);
    }

    /* renamed from: io.sentry.u1$c */
    public interface c {
        void a(InterfaceC7142f0 interfaceC7142f0);
    }

    /* renamed from: io.sentry.u1$d */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final h3 f68577a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final h3 f68578b;

        public d(@NotNull h3 h3Var, h3 h3Var2) {
            this.f68578b = h3Var;
            this.f68577a = h3Var2;
        }

        @NotNull
        public final h3 a() {
            return this.f68578b;
        }

        public final h3 b() {
            return this.f68577a;
        }
    }

    public C7209u1(@NotNull W2 w22) {
        this.f68554c = new WeakReference<>(null);
        this.f68559h = new ArrayList();
        this.f68561j = new ConcurrentHashMap();
        this.f68562k = new ConcurrentHashMap();
        this.f68563l = new ConcurrentHashMap();
        this.f68564m = new CopyOnWriteArrayList();
        this.f68567p = new io.sentry.util.a();
        this.f68568q = new io.sentry.util.a();
        this.f68569r = new io.sentry.util.a();
        this.f68570s = new C7187c();
        this.f68571t = new CopyOnWriteArrayList();
        this.f68573v = io.sentry.protocol.t.f68325b;
        this.f68574w = R0.i();
        this.f68575x = Collections.synchronizedMap(new WeakHashMap());
        io.sentry.util.p.b(w22, "SentryOptions is required.");
        this.f68565n = w22;
        this.f68560i = h(this.f68565n.getMaxBreadcrumbs());
        this.f68576y = io.sentry.featureflags.a.a(w22);
        this.f68572u = new C7175n1();
    }

    @NotNull
    static Queue<C7141f> h(int i11) {
        return i11 > 0 ? o3.a(new C7145g(i11)) : new C7207u();
    }

    @Override // io.sentry.U
    @NotNull
    public final Y A() {
        return this.f68574w;
    }

    @Override // io.sentry.U
    @NotNull
    public final List<InterfaceC7227z> B() {
        return com.google.common.primitives.f.b(this.f68564m);
    }

    @Override // io.sentry.U
    public final void C(@NotNull C7175n1 c7175n1) {
        this.f68572u = c7175n1;
        j3 e11 = c7175n1.e();
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().i(e11, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.U
    public final void D(@NotNull W2 w22) {
        this.f68565n = w22;
        ?? r02 = this.f68560i;
        this.f68560i = h(w22.getMaxBreadcrumbs());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            g((C7141f) it.next(), null);
        }
    }

    @Override // io.sentry.U
    @NotNull
    public final List<io.sentry.internal.eventprocessor.a> E() {
        return this.f68564m;
    }

    @Override // io.sentry.U
    @NotNull
    public final List<String> F() {
        return this.f68559h;
    }

    @Override // io.sentry.U
    public final String G() {
        InterfaceC7142f0 interfaceC7142f0 = this.f68553b;
        return interfaceC7142f0 != null ? interfaceC7142f0.getName() : this.f68555d;
    }

    @Override // io.sentry.U
    @NotNull
    public final C7175n1 H() {
        return this.f68572u;
    }

    @Override // io.sentry.U
    public final void I(@NotNull C7125b c7125b) {
        this.f68571t.add(c7125b);
    }

    @Override // io.sentry.U
    @NotNull
    public final List<C7125b> J() {
        return new CopyOnWriteArrayList(this.f68571t);
    }

    @Override // io.sentry.U
    @NotNull
    public final C7175n1 K(@NotNull a aVar) {
        InterfaceC7097a0 a11 = this.f68569r.a();
        try {
            aVar.a(this.f68572u);
            C7175n1 c7175n1 = new C7175n1(this.f68572u);
            a11.close();
            return c7175n1;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.U
    public final void L(@NotNull c cVar) {
        InterfaceC7097a0 a11 = this.f68568q.a();
        try {
            cVar.a(this.f68553b);
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.U
    public final void M(@NotNull io.sentry.protocol.t tVar) {
    }

    @Override // io.sentry.U
    public final String a() {
        return this.f68557f;
    }

    public final void b(@NotNull C7230z2 c7230z2) {
        io.sentry.util.q<WeakReference<InterfaceC7134d0>, String> qVar;
        InterfaceC7134d0 interfaceC7134d0;
        if (!this.f68565n.isTracingEnabled() || c7230z2.O() == null || (qVar = this.f68575x.get(io.sentry.util.f.a(c7230z2.O()))) == null) {
            return;
        }
        WeakReference<InterfaceC7134d0> a11 = qVar.a();
        if (c7230z2.C().j() == null && (interfaceC7134d0 = a11.get()) != null) {
            c7230z2.C().x(interfaceC7134d0.e());
        }
        String b11 = qVar.b();
        if (c7230z2.u0() != null || b11 == null) {
            return;
        }
        c7230z2.F0(b11);
    }

    @Override // io.sentry.U
    public final void c(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.f68563l.remove(str);
            for (V v11 : this.f68565n.getScopeObservers()) {
                v11.b(str);
                v11.g(this.f68563l);
            }
            return;
        }
        this.f68563l.put(str, str2);
        for (V v12 : this.f68565n.getScopeObservers()) {
            v12.c(str, str2);
            v12.g(this.f68563l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.U
    public final void clear() {
        this.f68552a = null;
        this.f68556e = null;
        this.f68558g = null;
        this.f68557f = null;
        this.f68559h.clear();
        this.f68560i.clear();
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().a(this.f68560i);
        }
        this.f68561j.clear();
        this.f68562k.clear();
        this.f68563l.clear();
        this.f68564m.clear();
        v();
        this.f68571t.clear();
    }

    @Override // io.sentry.U
    @NotNull
    public final U clone() {
        return new C7209u1(this);
    }

    @Override // io.sentry.U
    public final void d(io.sentry.protocol.E e11) {
        this.f68556e = e11;
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().d(e11);
        }
    }

    public final void e(@NotNull Y y11) {
        this.f68574w = y11;
    }

    @Override // io.sentry.U
    public final void f(@NotNull C7141f c7141f) {
        g(c7141f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.U
    public final void g(@NotNull C7141f c7141f, E e11) {
        if (c7141f == null || (this.f68560i instanceof C7207u)) {
            return;
        }
        if (e11 == null) {
            e11 = new E();
        }
        W2.a beforeBreadcrumb = this.f68565n.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                c7141f = beforeBreadcrumb.a(c7141f, e11);
            } catch (Throwable th2) {
                this.f68565n.getLogger().a(I2.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
                if (th2.getMessage() != null) {
                    c7141f.o(th2.getMessage(), "sentry:message");
                }
            }
        }
        if (c7141f == null) {
            this.f68565n.getLogger().c(I2.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f68560i.add(c7141f);
        for (V v11 : this.f68565n.getScopeObservers()) {
            v11.f(c7141f);
            v11.a(this.f68560i);
        }
    }

    @Override // io.sentry.U
    @NotNull
    public final Map<String, Object> getExtras() {
        return this.f68563l;
    }

    @Override // io.sentry.U
    public final C7191g getFeatureFlags() {
        return this.f68576y.getFeatureFlags();
    }

    @Override // io.sentry.U
    public final I2 getLevel() {
        return this.f68552a;
    }

    @Override // io.sentry.U
    @NotNull
    public final W2 getOptions() {
        return this.f68565n;
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.o getRequest() {
        return this.f68558g;
    }

    @Override // io.sentry.U
    @NotNull
    public final Map<String, String> getTags() {
        return io.sentry.util.c.a(this.f68561j);
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.E getUser() {
        return this.f68556e;
    }

    @Override // io.sentry.U
    public final InterfaceC7142f0 i() {
        return this.f68553b;
    }

    @Override // io.sentry.U
    public final void j(io.sentry.protocol.o oVar) {
        this.f68558g = oVar;
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(oVar);
        }
    }

    @Override // io.sentry.U
    public final void k(I2 i22) {
        this.f68552a = i22;
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(i22);
        }
    }

    @Override // io.sentry.U
    public final d l() {
        InterfaceC7097a0 a11 = this.f68567p.a();
        try {
            if (this.f68566o != null) {
                h3 h3Var = this.f68566o;
                h3Var.getClass();
                h3Var.b(C7165l.b());
                this.f68565n.getContinuousProfiler().c();
            }
            h3 h3Var2 = this.f68566o;
            d dVar = null;
            if (this.f68565n.getRelease() != null) {
                String distinctId = this.f68565n.getDistinctId();
                io.sentry.protocol.E e11 = this.f68556e;
                this.f68566o = new h3(h3.b.Ok, C7165l.b(), C7165l.b(), 0, distinctId, Z0.c(), Boolean.TRUE, null, null, e11 != null ? e11.k() : null, null, this.f68565n.getEnvironment(), this.f68565n.getRelease(), null);
                dVar = new d(this.f68566o.clone(), h3Var2 != null ? h3Var2.clone() : null);
            } else {
                this.f68565n.getLogger().c(I2.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            a11.close();
            return dVar;
        } catch (Throwable th2) {
            try {
                a11.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.U
    public final InterfaceC7134d0 m() {
        InterfaceC7134d0 p11;
        InterfaceC7134d0 interfaceC7134d0 = this.f68554c.get();
        if (interfaceC7134d0 != null) {
            return interfaceC7134d0;
        }
        InterfaceC7142f0 interfaceC7142f0 = this.f68553b;
        return (interfaceC7142f0 == null || (p11 = interfaceC7142f0.p()) == null) ? interfaceC7142f0 : p11;
    }

    @Override // io.sentry.U
    public final h3 n() {
        InterfaceC7097a0 a11 = this.f68567p.a();
        try {
            h3 h3Var = null;
            if (this.f68566o != null) {
                h3 h3Var2 = this.f68566o;
                h3Var2.getClass();
                h3Var2.b(C7165l.b());
                this.f68565n.getContinuousProfiler().c();
                h3 clone = this.f68566o.clone();
                this.f68566o = null;
                h3Var = clone;
            }
            a11.close();
            return h3Var;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.U
    public final void o(@NotNull io.sentry.protocol.t tVar) {
        this.f68573v = tVar;
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().o(tVar);
        }
    }

    @Override // io.sentry.U
    public final void p(@NotNull String str) {
        if (str == null) {
            this.f68565n.getLogger().c(I2.WARNING, "Transaction cannot be null", new Object[0]);
            return;
        }
        InterfaceC7142f0 interfaceC7142f0 = this.f68553b;
        if (interfaceC7142f0 != null) {
            interfaceC7142f0.i(str, io.sentry.protocol.D.CUSTOM);
        }
        this.f68555d = str;
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().p(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue<io.sentry.f>] */
    @Override // io.sentry.U
    @NotNull
    public final Queue<C7141f> q() {
        return this.f68560i;
    }

    @Override // io.sentry.U
    public final h3 r(@NotNull b bVar) {
        InterfaceC7097a0 a11 = this.f68567p.a();
        try {
            bVar.a(this.f68566o);
            h3 clone = this.f68566o != null ? this.f68566o.clone() : null;
            a11.close();
            return clone;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.U
    @NotNull
    public final C7187c s() {
        return this.f68570s;
    }

    @Override // io.sentry.U
    public final void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.f68561j.remove(str);
            for (V v11 : this.f68565n.getScopeObservers()) {
                v11.l(str);
                v11.m(this.f68561j);
            }
            return;
        }
        this.f68561j.put(str, str2);
        for (V v12 : this.f68565n.getScopeObservers()) {
            v12.setTag(str, str2);
            v12.m(this.f68561j);
        }
    }

    @Override // io.sentry.U
    public final void t(InterfaceC7142f0 interfaceC7142f0) {
        InterfaceC7097a0 a11 = this.f68568q.a();
        try {
            this.f68553b = interfaceC7142f0;
            for (V v11 : this.f68565n.getScopeObservers()) {
                if (interfaceC7142f0 != null) {
                    v11.p(interfaceC7142f0.getName());
                    v11.i(interfaceC7142f0.e(), this);
                } else {
                    v11.p(null);
                    v11.i(null, this);
                }
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.U
    public final void u(@NotNull ArrayList arrayList) {
        this.f68559h = new ArrayList(arrayList);
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(arrayList);
        }
    }

    @Override // io.sentry.U
    public final void v() {
        InterfaceC7097a0 a11 = this.f68568q.a();
        try {
            this.f68553b = null;
            a11.close();
            this.f68555d = null;
            for (V v11 : this.f68565n.getScopeObservers()) {
                v11.p(null);
                v11.i(null, this);
            }
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.U
    @NotNull
    public final io.sentry.featureflags.b w() {
        return this.f68576y;
    }

    @Override // io.sentry.U
    public final h3 x() {
        return this.f68566o;
    }

    @Override // io.sentry.U
    @NotNull
    public final io.sentry.protocol.t y() {
        return this.f68573v;
    }

    @Override // io.sentry.U
    public final void z(String str) {
        this.f68557f = str;
        C7187c c7187c = this.f68570s;
        C7185a d11 = c7187c.d();
        if (d11 == null) {
            d11 = new C7185a();
            c7187c.o(d11);
        }
        if (str == null) {
            d11.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            d11.x(arrayList);
        }
        Iterator<V> it = this.f68565n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(c7187c);
        }
    }

    @NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public final Object m66clone() throws CloneNotSupportedException {
        return new C7209u1(this);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.Collection] */
    private C7209u1(@NotNull C7209u1 c7209u1) {
        this.f68554c = new WeakReference<>(null);
        this.f68559h = new ArrayList();
        this.f68561j = new ConcurrentHashMap();
        this.f68562k = new ConcurrentHashMap();
        this.f68563l = new ConcurrentHashMap();
        this.f68564m = new CopyOnWriteArrayList();
        this.f68567p = new io.sentry.util.a();
        this.f68568q = new io.sentry.util.a();
        this.f68569r = new io.sentry.util.a();
        this.f68570s = new C7187c();
        this.f68571t = new CopyOnWriteArrayList();
        this.f68573v = io.sentry.protocol.t.f68325b;
        this.f68574w = R0.i();
        this.f68575x = Collections.synchronizedMap(new WeakHashMap());
        this.f68553b = c7209u1.f68553b;
        this.f68555d = c7209u1.f68555d;
        this.f68554c = c7209u1.f68554c;
        this.f68566o = c7209u1.f68566o;
        this.f68565n = c7209u1.f68565n;
        this.f68552a = c7209u1.f68552a;
        this.f68574w = c7209u1.f68574w;
        io.sentry.protocol.E e11 = c7209u1.f68556e;
        this.f68556e = e11 != null ? new io.sentry.protocol.E(e11) : null;
        this.f68557f = c7209u1.f68557f;
        this.f68573v = c7209u1.f68573v;
        io.sentry.protocol.o oVar = c7209u1.f68558g;
        this.f68558g = oVar != null ? new io.sentry.protocol.o(oVar) : null;
        this.f68559h = new ArrayList(c7209u1.f68559h);
        this.f68564m = new CopyOnWriteArrayList(c7209u1.f68564m);
        C7141f[] c7141fArr = (C7141f[]) c7209u1.f68560i.toArray(new C7141f[0]);
        Queue<C7141f> h11 = h(c7209u1.f68565n.getMaxBreadcrumbs());
        for (C7141f c7141f : c7141fArr) {
            h11.add(new C7141f(c7141f));
        }
        this.f68560i = h11;
        ConcurrentHashMap concurrentHashMap = c7209u1.f68561j;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f68561j = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = c7209u1.f68562k;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), (M1) entry2.getValue());
            }
        }
        this.f68562k = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = c7209u1.f68563l;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.f68563l = concurrentHashMap6;
        this.f68570s = new C7187c(c7209u1.f68570s);
        this.f68571t = new CopyOnWriteArrayList(c7209u1.f68571t);
        this.f68576y = c7209u1.f68576y.m62clone();
        this.f68572u = new C7175n1(c7209u1.f68572u);
    }
}
