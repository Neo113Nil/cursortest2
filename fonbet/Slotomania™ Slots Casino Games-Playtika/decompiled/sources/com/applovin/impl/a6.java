package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class a6 extends t5 {
    private final long i;
    private final AppLovinAdLoadListener j;

    public a6(u uVar, long j, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        this(uVar, j, appLovinAdLoadListener, "TaskFetchNextAd", lVar);
    }

    @Override // com.applovin.impl.t5
    protected k5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.g, this.i, this.j, this.a);
    }

    @Override // com.applovin.impl.t5
    protected String e() {
        return s0.a(this.a);
    }

    @Override // com.applovin.impl.t5
    protected String f() {
        return s0.b(this.a);
    }

    public a6(u uVar, long j, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.i = j;
        this.j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.t5
    protected void a(int i, String str) {
        super.a(i, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (!(appLovinAdLoadListener instanceof o2)) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        } else {
            ((o2) this.j).failedToReceiveAdV2(new AppLovinError(i, str));
        }
    }
}
