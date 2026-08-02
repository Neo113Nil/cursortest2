package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j6 extends k5 {
    private final JSONObject g;
    private final AppLovinNativeAdLoadListener h;

    public j6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessNativeAdResponse", lVar);
        this.g = jSONObject;
        this.h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.g, com.safedk.android.analytics.brandsafety.m.S, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            this.a.s0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.g, this.h, this.a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.k(this.b, "No ads were returned from the server");
        }
        q7.a("native_native", MaxAdFormat.NATIVE, this.g, this.a);
        this.h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
