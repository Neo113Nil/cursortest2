package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgu extends zzbhb {
    public final AppOpenAd.AppOpenAdLoadCallback a;
    public final String b;

    public zzbgu(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.a = appOpenAdLoadCallback;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void X(zzbgz zzbgzVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new zzbgv(zzbgzVar, this.b));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzb(int i) {
    }
}
