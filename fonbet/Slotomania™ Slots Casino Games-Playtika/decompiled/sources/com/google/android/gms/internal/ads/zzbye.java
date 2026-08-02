package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbye extends zzbnc {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbye(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zze(zzbnj zzbnjVar) {
        this.zza.onNativeAdLoaded(new zzbxz(zzbnjVar));
    }
}
