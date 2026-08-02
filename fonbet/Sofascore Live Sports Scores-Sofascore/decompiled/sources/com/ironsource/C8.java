package com.ironsource;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface C8 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(@NotNull String str);

        void onNativeAdLoadSuccess(@NotNull A8 a8);

        void onNativeAdShown();
    }

    void a();

    void a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    void a(@Nullable a aVar);

    void a(@NotNull D8 d8);

    @Nullable
    a b();

    @Nullable
    A8 c();
}
