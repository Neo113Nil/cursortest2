package com.ironsource.mediationsdk;

import com.ironsource.C3959aa;
import com.ironsource.C4227o2;
import com.ironsource.C4295s;
import com.ironsource.C4415yb;
import com.ironsource.V8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class k {
    private HashSet<ImpressionDataListener> a;
    protected C4295s b;
    protected C3959aa c;
    protected AdInfo d;

    public k(HashSet<ImpressionDataListener> hashSet, C3959aa c3959aa) {
        new HashSet();
        this.a = hashSet;
        this.b = new C4295s();
        this.c = c3959aa;
    }

    public void a(C4227o2 c4227o2, String str) {
        HashSet hashSet;
        if (c4227o2 == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        V8 a = c4227o2.a(str);
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
        }
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.d = null;
    }

    public void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(C3959aa c3959aa) {
        this.c = c3959aa;
    }

    public void a(V8 v8, C4415yb c4415yb) {
        if (v8 != null) {
            this.d = new AdInfo(v8, c4415yb);
        }
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
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
