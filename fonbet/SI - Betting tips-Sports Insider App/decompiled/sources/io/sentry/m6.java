package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m6 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final k4 f16646a;

    /* renamed from: b, reason: collision with root package name */
    public k4 f16647b;

    /* renamed from: c, reason: collision with root package name */
    public final n6 f16648c;

    /* renamed from: d, reason: collision with root package name */
    public final j6 f16649d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f16650e;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f16651f;

    /* renamed from: i, reason: collision with root package name */
    public final com.android.billingclient.api.i f16654i;
    public o6 j;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16652g = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f16653h = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f16655k = new ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f16656l = new ConcurrentHashMap();

    public m6(j6 j6Var, x3 x3Var, n6 n6Var, com.android.billingclient.api.i iVar, androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.f16648c = n6Var;
        n6Var.f16675i = (String) iVar.f4030d;
        this.f16649d = j6Var;
        y4.a.C(x3Var, "Scopes are required");
        this.f16651f = x3Var;
        this.f16654i = iVar;
        this.j = aVar;
        k4 k4Var = (k4) iVar.f4028b;
        if (k4Var != null) {
            this.f16646a = k4Var;
        } else {
            this.f16646a = x3Var.m().getDateProvider().a();
        }
    }

    @Override // io.sentry.i1
    public final void a(q6 q6Var) {
        this.f16648c.f16673g = q6Var;
    }

    @Override // io.sentry.i1
    public final g6 c() {
        n6 n6Var = this.f16648c;
        io.sentry.protocol.v vVar = n6Var.f16667a;
        p6 p6Var = n6Var.f16668b;
        c4.d dVar = n6Var.f16670d;
        return new g6(vVar, p6Var, dVar == null ? null : (Boolean) dVar.f3577b);
    }

    @Override // io.sentry.i1
    public final boolean d() {
        return this.f16652g;
    }

    @Override // io.sentry.i1
    public final void f(Number number, String str) {
        if (this.f16652g) {
            this.f16651f.m().getLogger().h(b5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f16656l.put(str, new io.sentry.protocol.l(number, (String) null));
        j6 j6Var = this.f16649d;
        m6 m6Var = j6Var.f16569b;
        if (m6Var == this || m6Var.f16656l.containsKey(str)) {
            return;
        }
        j6Var.f(number, str);
    }

    @Override // io.sentry.i1
    public final void g(Throwable th2) {
        this.f16650e = th2;
    }

    @Override // io.sentry.i1
    public final String getDescription() {
        return this.f16648c.f16672f;
    }

    @Override // io.sentry.i1
    public final q6 getStatus() {
        return this.f16648c.f16673g;
    }

    @Override // io.sentry.i1
    public final void h(q6 q6Var) {
        x(q6Var, this.f16651f.m().getDateProvider().a());
    }

    @Override // io.sentry.i1
    public final com.android.billingclient.api.a i(List list) {
        return this.f16649d.i(list);
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
        h(this.f16648c.f16673g);
    }

    @Override // io.sentry.i1
    public final void m(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.f16655k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.i1
    public final void p(String str) {
        this.f16648c.f16672f = str;
    }

    @Override // io.sentry.i1
    public final i1 r(String str) {
        return y(str, null);
    }

    @Override // io.sentry.i1
    public final i1 s(String str, String str2, k4 k4Var, p1 p1Var, com.android.billingclient.api.i iVar) {
        if (this.f16652g) {
            return w2.f17230a;
        }
        p6 p6Var = this.f16648c.f16668b;
        j6 j6Var = this.f16649d;
        n6 n6Var = j6Var.f16569b.f16648c;
        n6 n6Var2 = new n6(n6Var.f16667a, new p6(), p6Var, str, null, n6Var.f16670d, null, "manual");
        n6Var2.f16672f = str2;
        n6Var2.f16677l = p1Var;
        iVar.f4028b = k4Var;
        return j6Var.C(n6Var2, iVar);
    }

    @Override // io.sentry.i1
    public final void u(String str, Long l6, g2 g2Var) {
        if (this.f16652g) {
            this.f16651f.m().getLogger().h(b5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f16656l.put(str, new io.sentry.protocol.l((Number) l6, g2Var.apiName()));
        j6 j6Var = this.f16649d;
        m6 m6Var = j6Var.f16569b;
        if (m6Var == this || m6Var.f16656l.containsKey(str)) {
            return;
        }
        j6Var.u(str, l6, g2Var);
    }

    @Override // io.sentry.i1
    public final n6 v() {
        return this.f16648c;
    }

    @Override // io.sentry.i1
    public final k4 w() {
        return this.f16647b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.i1
    public final void x(q6 q6Var, k4 k4Var) {
        k4 k4Var2;
        k4 k4Var3;
        if (this.f16652g || !this.f16653h.compareAndSet(false, true)) {
            return;
        }
        n6 n6Var = this.f16648c;
        n6Var.f16673g = q6Var;
        p6 p6Var = n6Var.f16668b;
        b1 b1Var = this.f16651f;
        if (k4Var == null) {
            k4Var = b1Var.m().getDateProvider().a();
        }
        this.f16647b = k4Var;
        com.android.billingclient.api.i iVar = this.f16654i;
        iVar.getClass();
        boolean z5 = iVar.f4027a;
        j6 j6Var = this.f16649d;
        if (z5) {
            m6 m6Var = j6Var.f16569b;
            CopyOnWriteArrayList<m6> copyOnWriteArrayList = j6Var.f16570c;
            if (!m6Var.f16648c.f16668b.equals(p6Var)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    m6 m6Var2 = (m6) it.next();
                    p6 p6Var2 = m6Var2.f16648c.f16669c;
                    if (p6Var2 != null && p6Var2.equals(p6Var)) {
                        arrayList.add(m6Var2);
                    }
                }
                copyOnWriteArrayList = arrayList;
            }
            k4 k4Var4 = null;
            k4 k4Var5 = null;
            for (m6 m6Var3 : copyOnWriteArrayList) {
                if (k4Var4 == null || m6Var3.f16646a.b(k4Var4) < 0) {
                    k4Var4 = m6Var3.f16646a;
                }
                if (k4Var5 == null || ((k4Var3 = m6Var3.f16647b) != null && k4Var3.b(k4Var5) > 0)) {
                    k4Var5 = m6Var3.f16647b;
                }
            }
            if (iVar.f4027a && k4Var5 != null && (((k4Var2 = this.f16647b) == null || k4Var2.b(k4Var5) > 0) && this.f16647b != null)) {
                this.f16647b = k4Var5;
            }
        }
        Throwable th2 = this.f16650e;
        if (th2 != null) {
            b1Var.g(th2, this, j6Var.f16572e);
        }
        o6 o6Var = this.j;
        if (o6Var != null) {
            o6Var.c(this);
        }
        this.f16652g = true;
    }

    @Override // io.sentry.i1
    public final i1 y(String str, String str2) {
        if (this.f16652g) {
            return w2.f17230a;
        }
        p6 p6Var = this.f16648c.f16668b;
        j6 j6Var = this.f16649d;
        j6Var.getClass();
        com.android.billingclient.api.i iVar = new com.android.billingclient.api.i(4);
        n6 n6Var = j6Var.f16569b.f16648c;
        n6 n6Var2 = new n6(n6Var.f16667a, new p6(), p6Var, str, null, n6Var.f16670d, null, "manual");
        n6Var2.f16672f = str2;
        n6Var2.f16677l = p1.SENTRY;
        return j6Var.C(n6Var2, iVar);
    }

    @Override // io.sentry.i1
    public final k4 z() {
        return this.f16646a;
    }

    public m6(v6 v6Var, j6 j6Var, x3 x3Var, w6 w6Var) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.f16648c = v6Var;
        v6Var.f16675i = (String) w6Var.f4030d;
        this.f16649d = j6Var;
        this.f16651f = x3Var;
        this.j = null;
        k4 k4Var = (k4) w6Var.f4028b;
        if (k4Var != null) {
            this.f16646a = k4Var;
        } else {
            this.f16646a = x3Var.m().getDateProvider().a();
        }
        this.f16654i = w6Var;
    }
}
