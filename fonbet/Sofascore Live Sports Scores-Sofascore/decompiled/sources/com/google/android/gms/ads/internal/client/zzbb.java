package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbb extends zzcr {
    public final FullScreenContentCallback a;

    public zzbb(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zza(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }
}
