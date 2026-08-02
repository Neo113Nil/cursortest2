package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface b {
    void onAdClick(String str);

    void onAdEnd(String str);

    void onAdImpression(String str);

    void onAdLeftApplication(String str);

    void onAdRewarded(String str);

    void onAdStart(String str);

    void onFailure(VungleError vungleError);
}
