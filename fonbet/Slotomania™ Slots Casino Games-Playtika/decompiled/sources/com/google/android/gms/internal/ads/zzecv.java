package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzecv extends RewardedInterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzedc zzb;

    zzecv(zzedc zzedcVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzedcVar);
        this.zzb = zzedcVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzedc zzedcVar = this.zzb;
        zzm = zzedc.zzm(loadAdError);
        zzedcVar.zzg(zzm);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.zzb.zzf(this.zza, rewardedInterstitialAd);
    }
}
