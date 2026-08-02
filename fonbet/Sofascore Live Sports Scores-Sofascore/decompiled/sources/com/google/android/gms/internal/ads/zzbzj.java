package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzj extends zzboi {
    public final NativeAd.UnconfirmedClickListener a;

    public zzbzj(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.a = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zze(String str) {
        this.a.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzf() {
        this.a.onUnconfirmedClickCancelled();
    }
}
