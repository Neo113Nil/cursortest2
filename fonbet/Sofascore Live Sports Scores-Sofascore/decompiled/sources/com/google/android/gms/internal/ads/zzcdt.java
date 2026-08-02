package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdt extends zzcdg {
    public final RewardedInterstitialAdLoadCallback a;
    public final zzcdu b;

    public zzcdt(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdu zzcduVar) {
        this.a = rewardedInterstitialAdLoadCallback;
        this.b = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.a;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() {
        zzcdu zzcduVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.a;
        if (rewardedInterstitialAdLoadCallback == null || (zzcduVar = this.b) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) {
    }
}
