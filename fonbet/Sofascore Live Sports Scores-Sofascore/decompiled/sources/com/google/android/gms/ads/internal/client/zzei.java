package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzei extends zzaz {
    public final /* synthetic */ zzek c;

    public zzei(zzek zzekVar) {
        this.c = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzek zzekVar = this.c;
        zzekVar.d.zza(zzekVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzek zzekVar = this.c;
        zzekVar.d.zza(zzekVar.zzz());
        super.onAdLoaded();
    }
}
