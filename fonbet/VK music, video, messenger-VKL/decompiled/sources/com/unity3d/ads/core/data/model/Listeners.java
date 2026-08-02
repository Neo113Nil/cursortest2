package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;

/* compiled from: Listeners.kt */
/* loaded from: classes14.dex */
public interface Listeners {
    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onRewarded(String str);

    void onStart(String str);

    /* compiled from: Listeners.kt */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String str) {
        }

        public static void onLeftApplication(Listeners listeners, String str) {
        }

        public static void onRewarded(Listeners listeners, String str) {
        }

        public static void onStart(Listeners listeners, String str) {
        }

        public static void onComplete(Listeners listeners, String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        }

        public static void onError(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        }
    }
}
