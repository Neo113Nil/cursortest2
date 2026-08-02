package com.inmobi.ads.listeners;

import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class InterstitialAdEventListener extends AdEventListener<InMobiInterstitial> {
    public void onAdDismissed(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdWillDisplay(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onUserLeftApplication(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onRewardsUnlocked(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }
}
