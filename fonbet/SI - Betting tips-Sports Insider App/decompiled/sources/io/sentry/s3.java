package io.sentry;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s3 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public b5 f17053a;

    /* renamed from: b, reason: collision with root package name */
    public k1 f17054b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f17055c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.i0 f17056d;

    /* renamed from: e, reason: collision with root package name */
    public String f17057e;

    /* renamed from: f, reason: collision with root package name */
    public io.sentry.protocol.p f17058f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17059g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Object f17060h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f17061i;
    public final ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f17062k;

    /* renamed from: l, reason: collision with root package name */
    public volatile b6 f17063l;

    /* renamed from: m, reason: collision with root package name */
    public volatile l6 f17064m;

    /* renamed from: n, reason: collision with root package name */
    public final io.sentry.util.a f17065n;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f17066o;

    /* renamed from: p, reason: collision with root package name */
    public final io.sentry.util.a f17067p;
    public final io.sentry.protocol.c q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f17068r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.appcompat.app.v0 f17069s;

    /* renamed from: t, reason: collision with root package name */
    public io.sentry.protocol.v f17070t;

    /* renamed from: u, reason: collision with root package name */
    public d1 f17071u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f17072v;

    /* renamed from: w, reason: collision with root package name */
    public final io.sentry.featureflags.b f17073w;

    /* JADX WARN: Multi-variable type inference failed */
    public s3(b6 b6Var) {
        io.sentry.featureflags.c cVar;
        this.f17055c = new WeakReference(null);
        this.f17059g = new ArrayList();
        this.f17061i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.f17062k = new CopyOnWriteArrayList();
        this.f17065n = new io.sentry.util.a();
        this.f17066o = new io.sentry.util.a();
        this.f17067p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.c();
        this.f17068r = new CopyOnWriteArrayList();
        this.f17070t = io.sentry.protocol.v.f16922b;
        this.f17071u = t2.f17091a;
        this.f17072v = DesugarCollections.synchronizedMap(new WeakHashMap());
        y4.a.C(b6Var, "SentryOptions is required.");
        this.f17063l = b6Var;
        this.f17060h = a(this.f17063l.getMaxBreadcrumbs());
        if (b6Var.getMaxFeatureFlags() > 0) {
            io.sentry.featureflags.a aVar = new io.sentry.featureflags.a();
            new io.sentry.util.a();
            aVar.f16416a = new CopyOnWriteArrayList();
            cVar = aVar;
        } else {
            cVar = io.sentry.featureflags.c.f16417a;
        }
        this.f17073w = cVar;
        this.f17069s = new androidx.appcompat.app.v0(17);
    }

    public static Queue a(int i5) {
        return i5 > 0 ? new s6(new g(i5)) : new y();
    }

    @Override // io.sentry.z0
    public final void A(String str) {
        this.f17057e = str;
        io.sentry.protocol.c cVar = this.q;
        io.sentry.protocol.a d10 = cVar.d();
        if (d10 == null) {
            d10 = new io.sentry.protocol.a();
            cVar.m(d10);
        }
        if (str == null) {
            d10.f16741i = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            d10.f16741i = arrayList;
        }
        Iterator<a1> it = this.f17063l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(cVar);
        }
    }

    @Override // io.sentry.z0
    public final void B(androidx.appcompat.app.v0 v0Var) {
        this.f17069s = v0Var;
        n6 n6Var = new n6((io.sentry.protocol.v) v0Var.f364b, (p6) v0Var.f365c, "default", null);
        n6Var.f16675i = "auto";
        Iterator<a1> it = this.f17063l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().d(n6Var, this);
        }
    }

    @Override // io.sentry.z0
    public final d1 C() {
        return this.f17071u;
    }

    @Override // io.sentry.z0
    public final Map D() {
        return com.google.android.play.core.appupdate.b.A(this.f17061i);
    }

    @Override // io.sentry.z0
    public final List E() {
        return this.f17062k;
    }

    @Override // io.sentry.z0
    public final List F() {
        return new CopyOnWriteArrayList(this.f17068r);
    }

    @Override // io.sentry.z0
    public final void G(t4 t4Var) {
        i1 i1Var;
        if (!this.f17063l.isTracingEnabled() || t4Var.a() == null) {
            return;
        }
        Map map = this.f17072v;
        Throwable a7 = t4Var.a();
        y4.a.C(a7, "throwable cannot be null");
        while (a7.getCause() != null && a7.getCause() != a7) {
            a7 = a7.getCause();
        }
        io.sentry.util.g gVar = (io.sentry.util.g) map.get(a7);
        if (gVar != null) {
            WeakReference weakReference = gVar.f17162a;
            if (t4Var.f16456b.i() == null && (i1Var = (i1) weakReference.get()) != null) {
                t4Var.f16456b.v(i1Var.v());
            }
            String str = (String) gVar.f17163b;
            if (t4Var.f17097v != null || str == null) {
                return;
            }
            t4Var.f17097v = str;
        }
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.c H() {
        return this.q;
    }

    @Override // io.sentry.z0
    public final androidx.appcompat.app.v0 I(p3 p3Var) {
        r a7 = this.f17067p.a();
        try {
            p3Var.d(this.f17069s);
            androidx.appcompat.app.v0 v0Var = new androidx.appcompat.app.v0(this.f17069s);
            a7.close();
            return v0Var;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final String J() {
        return this.f17057e;
    }

    @Override // io.sentry.z0
    public final void K(r3 r3Var) {
        r a7 = this.f17066o.a();
        try {
            r3Var.b(this.f17054b);
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final void M(k1 k1Var) {
        r a7 = this.f17066o.a();
        try {
            this.f17054b = k1Var;
            for (a1 a1Var : this.f17063l.getScopeObservers()) {
                if (k1Var != null) {
                    a1Var.h(k1Var.getName());
                    a1Var.d(k1Var.v(), this);
                } else {
                    a1Var.h(null);
                    a1Var.d(null, this);
                }
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final List N() {
        return this.f17059g;
    }

    @Override // io.sentry.z0
    public final List O() {
        return f3.x.D0(this.f17062k);
    }

    @Override // io.sentry.z0
    public final String P() {
        k1 k1Var = this.f17054b;
        if (k1Var != null) {
            return k1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.z0
    public final void c(e eVar) {
        h(eVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.z0
    public final void clear() {
        this.f17053a = null;
        this.f17056d = null;
        this.f17058f = null;
        this.f17057e = null;
        this.f17059g.clear();
        this.f17060h.clear();
        Iterator<a1> it = this.f17063l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().a(this.f17060h);
        }
        this.f17061i.clear();
        this.j.clear();
        this.f17062k.clear();
        t();
        this.f17068r.clear();
    }

    @Override // io.sentry.z0
    public final z0 clone() {
        return new s3(this);
    }

    @Override // io.sentry.z0
    public final void f(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.f17061i.remove(str);
            for (a1 a1Var : this.f17063l.getScopeObservers()) {
                a1Var.i(str);
                a1Var.b(this.f17061i);
            }
            return;
        }
        this.f17061i.put(str, str2);
        for (a1 a1Var2 : this.f17063l.getScopeObservers()) {
            a1Var2.f(str, str2);
            a1Var2.b(this.f17061i);
        }
    }

    @Override // io.sentry.z0
    public final void g(Throwable th2, m6 m6Var, String str) {
        y4.a.C(th2, "throwable is required");
        y4.a.C(str, "transactionName is required");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        Map map = this.f17072v;
        if (map.containsKey(th2)) {
            return;
        }
        map.put(th2, new io.sentry.util.g(str, new WeakReference(m6Var)));
    }

    @Override // io.sentry.z0
    public final Map getExtras() {
        return this.j;
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.i0 getUser() {
        return this.f17056d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.z0
    public final void h(e eVar, h0 h0Var) {
        if (eVar == null || (this.f17060h instanceof y)) {
            return;
        }
        if (h0Var == null) {
            h0Var = new h0();
        }
        m5 beforeBreadcrumb = this.f17063l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                eVar = ((io.sentry.internal.debugmeta.c) beforeBreadcrumb).h(eVar, h0Var);
            } catch (Throwable th2) {
                this.f17063l.getLogger().e(b5.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
                if (th2.getMessage() != null) {
                    eVar.c(th2.getMessage(), "sentry:message");
                }
            }
        }
        if (eVar == null) {
            this.f17063l.getLogger().h(b5.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f17060h.add(eVar);
        for (a1 a1Var : this.f17063l.getScopeObservers()) {
            a1Var.c(eVar);
            a1Var.a(this.f17060h);
        }
    }

    @Override // io.sentry.z0
    public final i1 i() {
        i1 o3;
        i1 i1Var = (i1) this.f17055c.get();
        if (i1Var != null) {
            return i1Var;
        }
        k1 k1Var = this.f17054b;
        return (k1Var == null || (o3 = k1Var.o()) == null) ? k1Var : o3;
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.h j() {
        return this.f17073w.j();
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.v k() {
        return this.f17070t;
    }

    @Override // io.sentry.z0
    public final void l(io.sentry.protocol.v vVar) {
        this.f17070t = vVar;
        Iterator<a1> it = this.f17063l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(vVar);
        }
    }

    @Override // io.sentry.z0
    public final b6 m() {
        return this.f17063l;
    }

    @Override // io.sentry.z0
    public final k1 n() {
        return this.f17054b;
    }

    @Override // io.sentry.z0
    public final void o(String str) {
        if (str == null) {
            this.j.remove("sessionURL");
            for (a1 a1Var : this.f17063l.getScopeObservers()) {
                a1Var.j();
                a1Var.g(this.j);
            }
            return;
        }
        this.j.put("sessionURL", str);
        for (a1 a1Var2 : this.f17063l.getScopeObservers()) {
            a1Var2.o(str);
            a1Var2.g(this.j);
        }
    }

    @Override // io.sentry.z0
    public final l6 p() {
        r a7 = this.f17065n.a();
        try {
            l6 l6Var = null;
            if (this.f17064m != null) {
                l6 l6Var2 = this.f17064m;
                l6Var2.getClass();
                l6Var2.b(com.google.android.play.core.appupdate.b.n());
                this.f17063l.getContinuousProfiler().d();
                l6 clone = this.f17064m.clone();
                this.f17064m = null;
                l6Var = clone;
            }
            a7.close();
            return l6Var;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final x5.h q() {
        r a7 = this.f17065n.a();
        try {
            if (this.f17064m != null) {
                l6 l6Var = this.f17064m;
                l6Var.getClass();
                l6Var.b(com.google.android.play.core.appupdate.b.n());
                this.f17063l.getContinuousProfiler().d();
            }
            l6 l6Var2 = this.f17064m;
            x5.h hVar = null;
            if (this.f17063l.getRelease() != null) {
                String distinctId = this.f17063l.getDistinctId();
                io.sentry.protocol.i0 i0Var = this.f17056d;
                this.f17064m = new l6(k6.Ok, com.google.android.play.core.appupdate.b.n(), com.google.android.play.core.appupdate.b.n(), 0, distinctId, io.sentry.config.a.n(), Boolean.TRUE, null, null, i0Var != null ? i0Var.f16819d : null, null, this.f17063l.getEnvironment(), this.f17063l.getRelease(), null);
                hVar = new x5.h(this.f17064m.clone(), l6Var2 != null ? l6Var2.clone() : null);
            } else {
                this.f17063l.getLogger().h(b5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            a7.close();
            return hVar;
        } catch (Throwable th2) {
            try {
                a7.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.z0
    public final void r(b5 b5Var) {
        this.f17053a = b5Var;
        Iterator<a1> it = this.f17063l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().r(b5Var);
        }
    }

    @Override // io.sentry.z0
    public final io.sentry.protocol.p s() {
        return this.f17058f;
    }

    @Override // io.sentry.z0
    public final void t() {
        r a7 = this.f17066o.a();
        try {
            this.f17054b = null;
            a7.close();
            for (a1 a1Var : this.f17063l.getScopeObservers()) {
                a1Var.h(null);
                a1Var.d(null, this);
            }
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.z0
    public final io.sentry.featureflags.b u() {
        return this.f17073w;
    }

    @Override // io.sentry.z0
    public final l6 v() {
        return this.f17064m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.z0
    public final Queue w() {
        return this.f17060h;
    }

    @Override // io.sentry.z0
    public final b5 x() {
        return this.f17053a;
    }

    @Override // io.sentry.z0
    public final androidx.appcompat.app.v0 y() {
        return this.f17069s;
    }

    @Override // io.sentry.z0
    public final l6 z(q3 q3Var) {
        r a7 = this.f17065n.a();
        try {
            q3Var.a(this.f17064m);
            l6 clone = this.f17064m != null ? this.f17064m.clone() : null;
            a7.close();
            return clone;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m109clone() {
        return new s3(this);
    }

    @Override // io.sentry.z0
    public final void L(io.sentry.protocol.v vVar) {
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection] */
    public s3(s3 s3Var) {
        io.sentry.protocol.i0 i0Var;
        io.sentry.protocol.p pVar = null;
        this.f17055c = new WeakReference(null);
        this.f17059g = new ArrayList();
        this.f17061i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.f17062k = new CopyOnWriteArrayList();
        this.f17065n = new io.sentry.util.a();
        this.f17066o = new io.sentry.util.a();
        this.f17067p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.c();
        this.f17068r = new CopyOnWriteArrayList();
        this.f17070t = io.sentry.protocol.v.f16922b;
        this.f17071u = t2.f17091a;
        this.f17072v = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f17054b = s3Var.f17054b;
        this.f17055c = s3Var.f17055c;
        this.f17064m = s3Var.f17064m;
        this.f17063l = s3Var.f17063l;
        this.f17053a = s3Var.f17053a;
        this.f17071u = s3Var.f17071u;
        io.sentry.protocol.i0 i0Var2 = s3Var.f17056d;
        if (i0Var2 != null) {
            i0Var = new io.sentry.protocol.i0();
            i0Var.f16816a = i0Var2.f16816a;
            i0Var.f16818c = i0Var2.f16818c;
            i0Var.f16817b = i0Var2.f16817b;
            i0Var.f16819d = i0Var2.f16819d;
            i0Var.f16820e = i0Var2.f16820e;
            i0Var.f16821f = i0Var2.f16821f;
            i0Var.f16822g = com.google.android.play.core.appupdate.b.A(i0Var2.f16822g);
            i0Var.f16823h = com.google.android.play.core.appupdate.b.A(i0Var2.f16823h);
        } else {
            i0Var = null;
        }
        this.f17056d = i0Var;
        this.f17057e = s3Var.f17057e;
        this.f17070t = s3Var.f17070t;
        io.sentry.protocol.p pVar2 = s3Var.f17058f;
        if (pVar2 != null) {
            pVar = new io.sentry.protocol.p();
            pVar.f16876a = pVar2.f16876a;
            pVar.f16880e = pVar2.f16880e;
            pVar.f16877b = pVar2.f16877b;
            pVar.f16878c = pVar2.f16878c;
            pVar.f16881f = com.google.android.play.core.appupdate.b.A(pVar2.f16881f);
            pVar.f16882g = com.google.android.play.core.appupdate.b.A(pVar2.f16882g);
            pVar.f16884i = com.google.android.play.core.appupdate.b.A(pVar2.f16884i);
            pVar.f16886l = com.google.android.play.core.appupdate.b.A(pVar2.f16886l);
            pVar.f16879d = pVar2.f16879d;
            pVar.j = pVar2.j;
            pVar.f16883h = pVar2.f16883h;
            pVar.f16885k = pVar2.f16885k;
        }
        this.f17058f = pVar;
        this.f17059g = new ArrayList(s3Var.f17059g);
        this.f17062k = new CopyOnWriteArrayList(s3Var.f17062k);
        e[] eVarArr = (e[]) s3Var.f17060h.toArray(new e[0]);
        Queue a7 = a(s3Var.f17063l.getMaxBreadcrumbs());
        for (e eVar : eVarArr) {
            a7.add(new e(eVar));
        }
        this.f17060h = a7;
        ConcurrentHashMap concurrentHashMap = s3Var.f17061i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f17061i = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = s3Var.j;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.j = concurrentHashMap4;
        this.q = new io.sentry.protocol.c(s3Var.q);
        this.f17068r = new CopyOnWriteArrayList(s3Var.f17068r);
        this.f17073w = s3Var.f17073w.m104clone();
        this.f17069s = new androidx.appcompat.app.v0(s3Var.f17069s);
    }
}
