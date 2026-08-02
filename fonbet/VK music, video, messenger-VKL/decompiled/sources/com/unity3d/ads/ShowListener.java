package com.unity3d.ads;

/* compiled from: ShowListener.kt */
/* loaded from: classes14.dex */
public interface ShowListener<UnityAd> {
    void onClicked(UnityAd unityad);

    void onCompleted(UnityAd unityad, ShowFinishState showFinishState);

    void onFailed(UnityAd unityad, UnityAdsError unityAdsError);

    void onStarted(UnityAd unityad);
}
