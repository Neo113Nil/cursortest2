package com.applovin.impl;

import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class v1 implements a.InterfaceC0108a {
    private final com.applovin.impl.sdk.l a;
    private final Map b = new HashMap();
    private final Object c = new Object();

    public v1(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
    }

    public void a(e3 e3Var) {
        if (y3.b(e3Var)) {
            if (!this.a.f().a(e3Var, this)) {
                this.a.Z().destroyAd(e3Var);
                return;
            }
            synchronized (this.c) {
                String adUnitId = e3Var.getAdUnitId();
                List list = (List) this.b.get(adUnitId);
                if (list == null) {
                    list = new ArrayList();
                    this.b.put(adUnitId, list);
                }
                double H = e3Var.H();
                int i = 0;
                while (i < list.size() && H <= ((e3) list.get(i)).H()) {
                    i++;
                }
                list.add(i, e3Var);
                if (list.size() > ((Integer) this.a.a(t3.R8)).intValue()) {
                    e3 e3Var2 = (e3) list.remove(list.size() - 1);
                    this.a.f().a(e3Var2);
                    this.a.Z().destroyAd(e3Var2);
                    this.a.R().a(f2.J0, e3Var2);
                }
            }
        }
    }

    public void b(e3 e3Var) {
        synchronized (this.c) {
            List list = (List) this.b.get(e3Var.getAdUnitId());
            if (CollectionUtils.isEmpty(list)) {
                return;
            }
            list.remove(e3Var);
            this.a.f().a(e3Var);
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0108a
    public void onAdExpired(u1 u1Var) {
        e3 e3Var = (e3) u1Var;
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("FailoverAdCacheManager", "Failover ad expired for ad unit: " + e3Var.getAdUnitId() + ". Removing from cache");
        }
        b(e3Var);
        this.a.Z().destroyAd(e3Var);
        this.a.R().a(f2.I0, e3Var);
    }

    public e3 a(String str) {
        synchronized (this.c) {
            List list = (List) this.b.get(str);
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            return (e3) list.get(0);
        }
    }
}
