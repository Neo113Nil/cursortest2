package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzi extends zzbof {
    public final NativeAd.OnNativeAdLoadedListener a;

    public zzbzi(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.a = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void v4(zzbom zzbomVar) {
        this.a.onNativeAdLoaded(new zzbzd(zzbomVar));
    }
}
