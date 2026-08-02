package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrf extends zzbrh {
    public final OnH5AdsEventListener a;

    public zzbrf(OnH5AdsEventListener onH5AdsEventListener) {
        this.a = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zza(String str) {
        this.a.onH5AdsEvent(str);
    }
}
