package com.unity3d.ads.core.data.model;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.UnityAds;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/model/Listeners;", "", "onError", "", "placementId", "", "error", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", PglCryptUtils.KEY_MESSAGE, "onStart", "onClick", "onRewarded", "onComplete", "state", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "onLeftApplication", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Listeners {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onClick(@NotNull Listeners listeners, @NotNull String str) {
            str.getClass();
        }

        public static void onComplete(@NotNull Listeners listeners, @NotNull String str, @NotNull UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            str.getClass();
            unityAdsShowCompletionState.getClass();
        }

        public static void onError(@NotNull Listeners listeners, @NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2) {
            str.getClass();
            unityAdsShowError.getClass();
            str2.getClass();
        }

        public static void onLeftApplication(@NotNull Listeners listeners, @NotNull String str) {
            str.getClass();
        }

        public static void onRewarded(@NotNull Listeners listeners, @NotNull String str) {
            str.getClass();
        }

        public static void onStart(@NotNull Listeners listeners, @NotNull String str) {
            str.getClass();
        }
    }

    void onClick(@NotNull String placementId);

    void onComplete(@NotNull String placementId, @NotNull UnityAds.UnityAdsShowCompletionState state);

    void onError(@NotNull String placementId, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message);

    void onLeftApplication(@NotNull String placementId);

    void onRewarded(@NotNull String placementId);

    void onStart(@NotNull String placementId);
}
