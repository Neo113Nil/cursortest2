package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(AdError adError);

    void onAdLeftApplication();
}
