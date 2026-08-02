package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzen extends zzca {
    public final /* synthetic */ PreloadCallback a;

    public zzen(zzeu zzeuVar, PreloadCallback preloadCallback) {
        this.a = preloadCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(zzfp zzfpVar) {
        PreloadConfiguration zzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (zzt != null) {
            this.a.onAdsAvailable(zzt);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(zzfp zzfpVar) {
        PreloadConfiguration zzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (zzt != null) {
            this.a.onAdsExhausted(zzt);
        }
    }
}
