package com.applovin.impl;

import com.applovin.impl.f6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m6 extends k5 {
    private final JSONObject g;
    private final JSONObject h;
    private final long i;
    private final AppLovinAdLoadListener j;

    public m6(JSONObject jSONObject, JSONObject jSONObject2, long j, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderAppLovinAd", lVar);
        this.g = jSONObject;
        this.h = jSONObject2;
        this.i = j;
        this.j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.g, this.h, this.a);
        Boolean bool = JsonUtils.getBoolean(this.g, "gs_load_immediately", Boolean.FALSE);
        Boolean bool2 = JsonUtils.getBoolean(this.g, "vs_load_immediately", Boolean.TRUE);
        o5 o5Var = new o5(aVar, this.i, this.a, this.j);
        o5Var.c(bool2.booleanValue());
        o5Var.b(bool.booleanValue());
        this.a.s0().a((k5) o5Var, f6.b.CACHING);
    }
}
