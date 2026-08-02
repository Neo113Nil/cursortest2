package com.applovin.impl.adview;

import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* loaded from: classes8.dex */
public class AppLovinAppOpenAd {
    private final AppLovinInterstitialAdDialog a = AppLovinInterstitialAd.create();

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(AppLovinAd appLovinAd) {
        this.a.showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}
