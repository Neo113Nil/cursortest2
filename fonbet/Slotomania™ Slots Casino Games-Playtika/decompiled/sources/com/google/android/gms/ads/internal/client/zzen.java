package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes4.dex */
final class zzen extends zzca {
    final /* synthetic */ PreloadCallback zza;

    zzen(zzeu zzeuVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        Objects.requireNonNull(zzeuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(zzfp zzfpVar) {
        PreloadConfiguration zzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (zzt != null) {
            this.zza.onAdsAvailable(zzt);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(zzfp zzfpVar) {
        PreloadConfiguration zzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (zzt != null) {
            this.zza.onAdsExhausted(zzt);
        }
    }
}
