package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j6 implements k1 {

    /* renamed from: b, reason: collision with root package name */
    public final m6 f16569b;

    /* renamed from: d, reason: collision with root package name */
    public final x3 f16571d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16572e;

    /* renamed from: g, reason: collision with root package name */
    public volatile h6 f16574g;

    /* renamed from: h, reason: collision with root package name */
    public volatile h6 f16575h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Timer f16576i;
    public final io.sentry.util.a j;

    /* renamed from: k, reason: collision with root package name */
    public final io.sentry.util.a f16577k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f16578l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f16579m;

    /* renamed from: n, reason: collision with root package name */
    public final io.sentry.protocol.h0 f16580n;

    /* renamed from: o, reason: collision with root package name */
    public final p1 f16581o;

    /* renamed from: p, reason: collision with root package name */
    public final io.sentry.protocol.c f16582p;
    public final k q;

    /* renamed from: r, reason: collision with root package name */
    public final w6 f16583r;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f16568a = new io.sentry.protocol.v();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f16570c = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public i6 f16573f = i6.f16491c;

    public j6(v6 v6Var, x3 x3Var, w6 w6Var, k kVar) {
        this.f16576i = null;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.f16577k = new io.sentry.util.a();
        this.f16578l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f16579m = atomicBoolean;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f16582p = cVar;
        m6 m6Var = new m6(v6Var, this, x3Var, w6Var);
        this.f16569b = m6Var;
        this.f16572e = v6Var.f17199p;
        this.f16581o = v6Var.f16677l;
        this.f16571d = x3Var;
        Boolean bool = Boolean.TRUE;
        kVar = bool.equals(F()) ? kVar : null;
        this.q = kVar;
        this.f16580n = v6Var.q;
        this.f16583r = w6Var;
        G(m6Var);
        io.sentry.protocol.v E = E();
        if (!E.equals(io.sentry.protocol.v.f16922b) && bool.equals(F())) {
            cVar.k(new h3(E), "profile");
        }
        if (kVar != null) {
            kVar.e(this);
        }
        if (w6Var.f17239g == null && w6Var.f17240h == null) {
            return;
        }
        boolean z5 = true;
        this.f16576i = new Timer(true);
        Long l6 = w6Var.f17240h;
        if (l6 != null) {
            r a7 = aVar.a();
            try {
                if (this.f16576i != null) {
                    A();
                    atomicBoolean.set(true);
                    this.f16575h = new h6(this, 1);
                    try {
                        this.f16576i.schedule(this.f16575h, l6.longValue());
                    } catch (Throwable th2) {
                        this.f16571d.m().getLogger().e(b5.WARNING, "Failed to schedule finish timer", th2);
                        q6 status = getStatus();
                        if (status == null) {
                            status = q6.DEADLINE_EXCEEDED;
                        }
                        if (this.f16583r.f17239g == null) {
                            z5 = false;
                        }
                        e(status, z5, null);
                        this.f16579m.set(false);
                    }
                }
                a7.close();
            } catch (Throwable th3) {
                try {
                    a7.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        t();
    }

    public final void A() {
        r a7 = this.j.a();
        try {
            if (this.f16575h != null) {
                this.f16575h.cancel();
                this.f16579m.set(false);
                this.f16575h = null;
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

    public final void B() {
        r a7 = this.j.a();
        try {
            if (this.f16574g != null) {
                this.f16574g.cancel();
                this.f16578l.set(false);
                this.f16574g = null;
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

    public final i1 C(n6 n6Var, com.android.billingclient.api.i iVar) {
        boolean z5 = this.f16569b.f16652g;
        w2 w2Var = w2.f17230a;
        if (!z5 && this.f16581o.equals(n6Var.f16677l)) {
            x3 x3Var = this.f16571d;
            if (!io.sentry.util.k.a((String) iVar.f4030d, x3Var.m().getIgnoredSpanOrigins())) {
                p6 p6Var = n6Var.f16669c;
                String str = n6Var.f16671e;
                String str2 = n6Var.f16672f;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f16570c;
                if (copyOnWriteArrayList.size() >= x3Var.m().getMaxSpans()) {
                    x3Var.m().getLogger().h(b5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return w2Var;
                }
                y4.a.C(p6Var, "parentSpanId is required");
                y4.a.C(str, "operation is required");
                B();
                m6 m6Var = new m6(this, this.f16571d, n6Var, iVar, new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(23, this));
                G(m6Var);
                copyOnWriteArrayList.add(m6Var);
                k kVar = this.q;
                if (kVar != null) {
                    kVar.d(m6Var);
                }
                return m6Var;
            }
        }
        return w2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(q6 q6Var, k4 k4Var, boolean z5, h0 h0Var) {
        j3 j3Var;
        x3 x3Var;
        k4 k4Var2 = this.f16569b.f16647b;
        if (k4Var == null) {
            k4Var = k4Var2;
        }
        if (k4Var == null) {
            k4Var = this.f16571d.m().getDateProvider().a();
        }
        Iterator it = this.f16570c.iterator();
        while (it.hasNext()) {
            ((m6) it.next()).f16654i.getClass();
        }
        this.f16573f = new i6(true, q6Var);
        if (this.f16569b.f16652g) {
            return;
        }
        if (this.f16583r.f17238f) {
            ListIterator listIterator = this.f16570c.listIterator();
            while (listIterator.hasNext()) {
                m6 m6Var = (m6) listIterator.next();
                if (!m6Var.f16652g && m6Var.f16647b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        m6 m6Var2 = this.f16569b;
        m6Var2.j = new androidx.transition.i(this, m6Var2.j, atomicReference, 5);
        m6Var2.x(this.f16573f.f16493b, k4Var);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(F())) {
            c4.d dVar = this.f16569b.f16648c.f16670d;
            if (bool.equals(dVar == null ? null : (Boolean) dVar.f3580e)) {
                j3Var = this.f16571d.m().getTransactionProfiler().g(this, (List) atomicReference.get(), this.f16571d.m());
                if (this.f16571d.m().isContinuousProfilingEnabled()) {
                    i3 profileLifecycle = this.f16571d.m().getProfileLifecycle();
                    i3 i3Var = i3.TRACE;
                    if (profileLifecycle == i3Var && this.f16569b.f16648c.f16680o.equals(io.sentry.protocol.v.f16922b)) {
                        this.f16571d.m().getContinuousProfiler().b(i3Var);
                    }
                }
                if (atomicReference.get() != null) {
                    ((List) atomicReference.get()).clear();
                }
                x3Var = this.f16571d;
                if (x3Var.isEnabled()) {
                    x3Var.m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                } else {
                    try {
                        z0 Q = x3Var.f17249e.Q(null);
                        Q.K(new com.google.firebase.messaging.g(7, this, Q));
                    } catch (Throwable th2) {
                        x3Var.m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th2);
                    }
                }
                io.sentry.protocol.e0 e0Var = new io.sentry.protocol.e0(this);
                if (this.f16576i != null) {
                    r a7 = this.j.a();
                    try {
                        if (this.f16576i != null) {
                            B();
                            A();
                            this.f16576i.cancel();
                            this.f16576i = null;
                        }
                        a7.close();
                    } catch (Throwable th3) {
                        try {
                            a7.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (!z5 && this.f16570c.isEmpty() && this.f16583r.f17239g != null) {
                    this.f16571d.m().getLogger().h(b5.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f16572e);
                    return;
                } else {
                    e0Var.f16773t.putAll(this.f16569b.f16656l);
                    this.f16571d.B(e0Var, b(), h0Var, j3Var);
                }
            }
        }
        j3Var = null;
        if (this.f16571d.m().isContinuousProfilingEnabled()) {
        }
        if (atomicReference.get() != null) {
        }
        x3Var = this.f16571d;
        if (x3Var.isEnabled()) {
        }
        io.sentry.protocol.e0 e0Var2 = new io.sentry.protocol.e0(this);
        if (this.f16576i != null) {
        }
        if (!z5) {
        }
        e0Var2.f16773t.putAll(this.f16569b.f16656l);
        this.f16571d.B(e0Var2, b(), h0Var, j3Var);
    }

    public final io.sentry.protocol.v E() {
        m6 m6Var = this.f16569b;
        return !m6Var.f16648c.f16680o.equals(io.sentry.protocol.v.f16922b) ? m6Var.f16648c.f16680o : this.f16571d.m().getContinuousProfiler().e();
    }

    public final Boolean F() {
        c4.d dVar = this.f16569b.f16648c.f16670d;
        if (dVar == null) {
            return null;
        }
        return (Boolean) dVar.f3577b;
    }

    public final void G(m6 m6Var) {
        io.sentry.util.thread.a threadChecker = this.f16571d.m().getThreadChecker();
        io.sentry.protocol.v E = E();
        if (!E.equals(io.sentry.protocol.v.f16922b)) {
            Boolean bool = Boolean.TRUE;
            c4.d dVar = m6Var.f16648c.f16670d;
            if (bool.equals(dVar == null ? null : (Boolean) dVar.f3577b)) {
                m6Var.m(E.toString(), "profiler_id");
            }
        }
        m6Var.m(String.valueOf(threadChecker.b()), "thread.id");
        m6Var.m(threadChecker.a(), "thread.name");
    }

    public final void H(c cVar) {
        m6 m6Var = this.f16569b;
        x3 x3Var = this.f16571d;
        r a7 = this.f16577k.a();
        try {
            if (cVar.f16223f) {
                AtomicReference atomicReference = new AtomicReference();
                if (x3Var.isEnabled()) {
                    try {
                        atomicReference.set(x3Var.f17249e.Q(null).k());
                    } catch (Throwable th2) {
                        x3Var.m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th2);
                    }
                } else {
                    x3Var.m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                cVar.e(m6Var.f16648c.f16667a, (io.sentry.protocol.v) atomicReference.get(), x3Var.m(), m6Var.f16648c.f16670d, this.f16572e, this.f16580n);
                cVar.f16223f = false;
            }
            a7.close();
        } finally {
        }
    }

    @Override // io.sentry.i1
    public final void a(q6 q6Var) {
        m6 m6Var = this.f16569b;
        if (m6Var.f16652g) {
            this.f16571d.m().getLogger().h(b5.DEBUG, "The transaction is already finished. Status %s cannot be set", q6Var == null ? "null" : q6Var.name());
        } else {
            m6Var.f16648c.f16673g = q6Var;
        }
    }

    @Override // io.sentry.i1
    public final t6 b() {
        c cVar;
        if (!this.f16571d.m().isTraceSampling() || (cVar = this.f16569b.f16648c.f16678m) == null) {
            return null;
        }
        H(cVar);
        return cVar.f();
    }

    @Override // io.sentry.i1
    public final g6 c() {
        return this.f16569b.c();
    }

    @Override // io.sentry.i1
    public final boolean d() {
        return this.f16569b.f16652g;
    }

    @Override // io.sentry.k1
    public final void e(q6 q6Var, boolean z5, h0 h0Var) {
        if (this.f16569b.f16652g) {
            return;
        }
        k4 a7 = this.f16571d.m().getDateProvider().a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f16570c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            m6 m6Var = (m6) listIterator.previous();
            m6Var.j = null;
            m6Var.x(q6Var, a7);
        }
        D(q6Var, a7, z5, h0Var);
    }

    @Override // io.sentry.i1
    public final void f(Number number, String str) {
        this.f16569b.f(number, str);
    }

    @Override // io.sentry.i1
    public final void g(Throwable th2) {
        m6 m6Var = this.f16569b;
        if (m6Var.f16652g) {
            this.f16571d.m().getLogger().h(b5.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            m6Var.f16650e = th2;
        }
    }

    @Override // io.sentry.i1
    public final String getDescription() {
        return this.f16569b.f16648c.f16672f;
    }

    @Override // io.sentry.k1
    public final String getName() {
        return this.f16572e;
    }

    @Override // io.sentry.i1
    public final q6 getStatus() {
        return this.f16569b.f16648c.f16673g;
    }

    @Override // io.sentry.i1
    public final void h(q6 q6Var) {
        x(q6Var, null);
    }

    @Override // io.sentry.i1
    public final com.android.billingclient.api.a i(List list) {
        c cVar;
        if (!this.f16571d.m().isTraceSampling() || (cVar = this.f16569b.f16648c.f16678m) == null) {
            return null;
        }
        H(cVar);
        return com.android.billingclient.api.a.d(cVar, list);
    }

    @Override // io.sentry.i1
    public final boolean j() {
        return false;
    }

    @Override // io.sentry.i1
    public final i1 k(String str, String str2, k4 k4Var, p1 p1Var) {
        return s(str, str2, k4Var, p1Var, new com.android.billingclient.api.i(4));
    }

    @Override // io.sentry.i1
    public final void l() {
        x(getStatus(), null);
    }

    @Override // io.sentry.i1
    public final void m(Object obj, String str) {
        m6 m6Var = this.f16569b;
        if (m6Var.f16652g) {
            this.f16571d.m().getLogger().h(b5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            m6Var.m(obj, str);
        }
    }

    @Override // io.sentry.i1
    public final void n() {
        x3 x3Var = this.f16571d;
        if (!x3Var.isEnabled()) {
            x3Var.m().getLogger().h(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            x3Var.f17249e.Q(null).M(this);
        } catch (Throwable th2) {
            x3Var.m().getLogger().e(b5.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.k1
    public final i1 o() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f16570c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            m6 m6Var = (m6) listIterator.previous();
            if (!m6Var.f16652g) {
                return m6Var;
            }
        }
        return null;
    }

    @Override // io.sentry.i1
    public final void p(String str) {
        m6 m6Var = this.f16569b;
        if (m6Var.f16652g) {
            this.f16571d.m().getLogger().h(b5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            m6Var.f16648c.f16672f = str;
        }
    }

    @Override // io.sentry.k1
    public final io.sentry.protocol.v q() {
        return this.f16568a;
    }

    @Override // io.sentry.i1
    public final i1 r(String str) {
        return y(str, null);
    }

    @Override // io.sentry.i1
    public final i1 s(String str, String str2, k4 k4Var, p1 p1Var, com.android.billingclient.api.i iVar) {
        boolean z5 = this.f16569b.f16652g;
        w2 w2Var = w2.f17230a;
        if (z5 || !this.f16581o.equals(p1Var)) {
            return w2Var;
        }
        int size = this.f16570c.size();
        x3 x3Var = this.f16571d;
        if (size < x3Var.m().getMaxSpans()) {
            return this.f16569b.s(str, str2, k4Var, p1Var, iVar);
        }
        x3Var.m().getLogger().h(b5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return w2Var;
    }

    @Override // io.sentry.k1
    public final void t() {
        Long l6;
        r a7 = this.j.a();
        try {
            if (this.f16576i != null && (l6 = this.f16583r.f17239g) != null) {
                B();
                this.f16578l.set(true);
                this.f16574g = new h6(this, 0);
                try {
                    this.f16576i.schedule(this.f16574g, l6.longValue());
                } catch (Throwable th2) {
                    this.f16571d.m().getLogger().e(b5.WARNING, "Failed to schedule finish timer", th2);
                    q6 status = getStatus();
                    if (status == null) {
                        status = q6.OK;
                    }
                    x(status, null);
                    this.f16578l.set(false);
                }
            }
            a7.close();
        } catch (Throwable th3) {
            try {
                a7.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.i1
    public final void u(String str, Long l6, g2 g2Var) {
        this.f16569b.u(str, l6, g2Var);
    }

    @Override // io.sentry.i1
    public final n6 v() {
        return this.f16569b.f16648c;
    }

    @Override // io.sentry.i1
    public final k4 w() {
        return this.f16569b.f16647b;
    }

    @Override // io.sentry.i1
    public final void x(q6 q6Var, k4 k4Var) {
        D(q6Var, k4Var, true, null);
    }

    @Override // io.sentry.i1
    public final i1 y(String str, String str2) {
        return s(str, str2, null, p1.SENTRY, new com.android.billingclient.api.i(4));
    }

    @Override // io.sentry.i1
    public final k4 z() {
        return this.f16569b.f16646a;
    }
}
