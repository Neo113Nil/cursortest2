package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzg extends zzbg {
    public final AdListener a;

    public zzg(AdListener adListener) {
        this.a = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zza() {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(zze zzeVar) {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        AdListener adListener = this.a;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final AdListener zzj() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb(int i) {
    }
}
