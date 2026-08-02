package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdn extends zzcdg {
    public final RewardedAdLoadCallback a;
    public final zzcdj b;

    public zzcdn(RewardedAdLoadCallback rewardedAdLoadCallback, zzcdj zzcdjVar) {
        this.a = rewardedAdLoadCallback;
        this.b = zzcdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) {
    }
}
