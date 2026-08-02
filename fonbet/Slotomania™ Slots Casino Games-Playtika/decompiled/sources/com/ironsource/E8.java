package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface E8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(C8 c8);

        void onNativeAdShown();
    }

    void a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(F8 f8);

    a b();

    C8 c();
}
