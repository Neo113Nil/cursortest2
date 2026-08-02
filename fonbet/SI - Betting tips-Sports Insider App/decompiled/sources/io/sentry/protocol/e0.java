package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import io.sentry.h4;
import io.sentry.j6;
import io.sentry.m6;
import io.sentry.n6;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends h4 implements c2 {

    /* renamed from: p, reason: collision with root package name */
    public String f16770p;
    public Double q;

    /* renamed from: r, reason: collision with root package name */
    public Double f16771r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f16772s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f16773t;

    /* renamed from: u, reason: collision with root package name */
    public g0 f16774u;

    /* renamed from: v, reason: collision with root package name */
    public ConcurrentHashMap f16775v;

    public e0(ArrayList arrayList, HashMap hashMap, g0 g0Var) {
        Double valueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f16772s = arrayList2;
        HashMap hashMap2 = new HashMap();
        this.f16773t = hashMap2;
        this.f16770p = "";
        this.q = valueOf;
        this.f16771r = null;
        arrayList2.addAll(arrayList);
        hashMap2.putAll(hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f16773t.putAll(((y) it.next()).f16941l);
        }
        this.f16774u = g0Var;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16770p != null) {
            aVar.u("transaction");
            aVar.K(this.f16770p);
        }
        aVar.u("start_timestamp");
        aVar.H(iLogger, com.google.android.play.core.appupdate.b.k(this.q));
        if (this.f16771r != null) {
            aVar.u("timestamp");
            aVar.H(iLogger, com.google.android.play.core.appupdate.b.k(this.f16771r));
        }
        ArrayList arrayList = this.f16772s;
        if (!arrayList.isEmpty()) {
            aVar.u("spans");
            aVar.H(iLogger, arrayList);
        }
        aVar.u("type");
        aVar.K("transaction");
        HashMap hashMap = this.f16773t;
        if (!hashMap.isEmpty()) {
            aVar.u("measurements");
            aVar.H(iLogger, hashMap);
        }
        aVar.u("transaction_info");
        aVar.H(iLogger, this.f16774u);
        h8.b.z(this, aVar, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f16775v;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16775v, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }

    public e0(j6 j6Var) {
        super(j6Var.f16568a);
        this.f16772s = new ArrayList();
        this.f16773t = new HashMap();
        m6 m6Var = j6Var.f16569b;
        this.q = Double.valueOf(m6Var.f16646a.d() / 1.0E9d);
        this.f16771r = Double.valueOf(m6Var.f16646a.c(m6Var.f16647b) / 1.0E9d);
        this.f16770p = j6Var.f16572e;
        Iterator it = j6Var.f16570c.iterator();
        while (it.hasNext()) {
            m6 m6Var2 = (m6) it.next();
            Boolean bool = Boolean.TRUE;
            c4.d dVar = m6Var2.f16648c.f16670d;
            if (bool.equals(dVar == null ? null : (Boolean) dVar.f3577b)) {
                this.f16772s.add(new y(m6Var2));
            }
        }
        c cVar = this.f16456b;
        cVar.l(j6Var.f16582p);
        n6 n6Var = m6Var.f16648c;
        ConcurrentHashMap concurrentHashMap = m6Var.f16655k;
        n6 n6Var2 = new n6(n6Var.f16667a, n6Var.f16668b, n6Var.f16669c, n6Var.f16671e, n6Var.f16672f, n6Var.f16670d, n6Var.f16673g, n6Var.f16675i);
        Iterator it2 = n6Var.f16674h.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            b((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        n6Var2.j.remove(str);
                    } else {
                        n6Var2.j.put(str, value);
                    }
                }
            }
        }
        n6Var.f16679n.j();
        cVar.v(n6Var2);
        this.f16774u = new g0(j6Var.f16580n.apiName());
    }
}
