package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class b6 extends t5 {
    private final AppLovinNativeAdLoadListener i;

    public b6(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.t5
    protected k5 a(JSONObject jSONObject) {
        return new j6(jSONObject, this.i, this.a);
    }

    @Override // com.applovin.impl.t5
    protected String e() {
        return s0.d(this.a);
    }

    @Override // com.applovin.impl.t5
    protected String f() {
        return s0.e(this.a);
    }

    @Override // com.applovin.impl.t5
    protected void a(int i, String str) {
        super.a(i, str);
        this.i.onNativeAdLoadFailed(new AppLovinError(i, str));
    }
}
