package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzh extends zzbj {
    public final AdLoadCallback a;
    public final Object b;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.a = adLoadCallback;
        this.b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zza() {
        Object obj;
        AdLoadCallback adLoadCallback = this.a;
        if (adLoadCallback == null || (obj = this.b) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
