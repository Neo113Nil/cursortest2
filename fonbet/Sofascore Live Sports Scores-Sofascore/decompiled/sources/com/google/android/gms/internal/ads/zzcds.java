package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcds extends zzcdc {
    public FullScreenContentCallback a;
    public OnUserEarnedRewardListener b;

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void N2(zzccx zzccxVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.b;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzcdk(zzccxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void z1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void g(int i) {
    }
}
