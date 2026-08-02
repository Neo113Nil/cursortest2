package com.unity3d.ads;

/* compiled from: BannerShowListener.kt */
/* loaded from: classes14.dex */
public interface BannerShowListener {
    void onClicked(BannerAd bannerAd);

    void onFailedToShow(BannerAd bannerAd, UnityAdsError unityAdsError);

    void onImpression(BannerAd bannerAd);
}
