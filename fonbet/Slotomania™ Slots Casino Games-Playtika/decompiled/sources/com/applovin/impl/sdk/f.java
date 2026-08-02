package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class f {
    private final l a;
    private final p b;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Object c = new Object();

    f(l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        for (u uVar : u.a()) {
            this.d.put(uVar, new r());
            this.e.put(uVar, new r());
        }
    }

    private r c(u uVar) {
        synchronized (this.c) {
            r b = b(uVar);
            if (b.b() > 0) {
                return b;
            }
            return d(uVar);
        }
    }

    private r d(u uVar) {
        r rVar;
        synchronized (this.c) {
            rVar = (r) this.d.get(uVar);
            if (rVar == null) {
                rVar = new r();
                this.d.put(uVar, rVar);
            }
        }
        return rVar;
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (p.a()) {
                this.b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.c) {
            r d = d(uVar);
            if (d.b() > 0) {
                b(uVar).a(d.a());
                cVar = new com.applovin.impl.sdk.ad.c(uVar, this.a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (p.a()) {
                this.b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
                return cVar;
            }
        } else if (p.a()) {
            this.b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(u uVar) {
        AppLovinAdImpl d;
        synchronized (this.c) {
            d = c(uVar).d();
        }
        return d;
    }

    private r b(u uVar) {
        r rVar;
        synchronized (this.c) {
            rVar = (r) this.e.get(uVar);
            if (rVar == null) {
                rVar = new r();
                this.e.put(uVar, rVar);
            }
        }
        return rVar;
    }

    public AppLovinAdImpl a(u uVar) {
        AppLovinAdImpl a;
        synchronized (this.c) {
            a = c(uVar).a();
        }
        return a;
    }
}
