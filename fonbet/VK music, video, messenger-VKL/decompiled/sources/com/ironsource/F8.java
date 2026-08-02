package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public interface F8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(D8 d8);

        void onNativeAdShown();
    }

    void a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(G8 g8);

    a b();

    D8 c();
}
