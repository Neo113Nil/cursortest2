package com.ironsource.mediationsdk;

import com.ironsource.Ab;
import com.ironsource.C4243ba;
import com.ironsource.C4504q2;
import com.ironsource.C4536s;
import com.ironsource.W8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class k {
    private HashSet<ImpressionDataListener> a;
    protected C4536s b;
    protected C4243ba c;
    protected AdInfo d;

    public k(HashSet<ImpressionDataListener> hashSet, C4243ba c4243ba) {
        new HashSet();
        this.a = hashSet;
        this.b = new C4536s();
        this.c = c4243ba;
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

    public void a(C4243ba c4243ba) {
        this.c = c4243ba;
    }

    public void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(W8 w8, Ab ab) {
        if (w8 != null) {
            this.d = new AdInfo(w8, ab);
        }
    }

    public void a(C4504q2 c4504q2, String str) {
        HashSet hashSet;
        if (c4504q2 != null) {
            W8 a = c4504q2.a(str);
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

    public String a() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void a(JSONObject jSONObject, IronSource.a aVar) {
        this.b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    public void a(IronSource.a aVar) {
        this.b.a(aVar, false);
    }
}
