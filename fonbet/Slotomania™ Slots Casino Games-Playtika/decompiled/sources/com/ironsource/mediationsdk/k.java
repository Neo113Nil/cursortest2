package com.ironsource.mediationsdk;

import com.ironsource.C2329aa;
import com.ironsource.C2608q2;
import com.ironsource.C2640s;
import com.ironsource.C2778zb;
import com.ironsource.V8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class k {
    private HashSet<ImpressionDataListener> a;
    protected C2640s b;
    protected C2329aa c;
    protected AdInfo d;

    public k(HashSet<ImpressionDataListener> hashSet, C2329aa c2329aa) {
        new HashSet();
        this.a = hashSet;
        this.b = new C2640s();
        this.c = c2329aa;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.d = null;
    }

    public void a(C2329aa c2329aa) {
        this.c = c2329aa;
    }

    public void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(V8 v8, C2778zb c2778zb) {
        if (v8 != null) {
            this.d = new AdInfo(v8, c2778zb);
        }
    }

    protected void a(C2608q2 c2608q2, String str) {
        HashSet hashSet;
        if (c2608q2 != null) {
            V8 a = c2608q2.a(str);
            if (a != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.a.clone();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a);
                    impressionDataListener.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    protected String a() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected void a(JSONObject jSONObject, IronSource.a aVar) {
        this.b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    protected void a(IronSource.a aVar) {
        this.b.a(aVar, false);
    }
}
