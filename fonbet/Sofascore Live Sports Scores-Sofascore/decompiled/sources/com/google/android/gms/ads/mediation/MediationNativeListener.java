package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzbnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public interface MediationNativeListener {
    void onAdClicked(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(@NonNull MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationNativeAdapter mediationNativeAdapter, int i);

    void onAdFailedToLoad(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull AdError adError);

    void onAdImpression(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void zzc(MediationNativeAdapter mediationNativeAdapter, zzbnn zzbnnVar);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbnn zzbnnVar, String str);
}
