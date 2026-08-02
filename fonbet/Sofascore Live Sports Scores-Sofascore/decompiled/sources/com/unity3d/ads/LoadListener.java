package com.unity3d.ads;

import com.ironsource.Wf;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/LoadListener;", "UnityAd", "", Wf.j, "", "unityAd", "error", "Lcom/unity3d/ads/UnityAdsError;", "(Ljava/lang/Object;Lcom/unity3d/ads/UnityAdsError;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LoadListener<UnityAd> {
    void onAdLoaded(@Nullable UnityAd unityAd, @Nullable UnityAdsError error);
}
