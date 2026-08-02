package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
@Deprecated
/* loaded from: classes8.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int i);

    void onAdFailedToLoad(AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
