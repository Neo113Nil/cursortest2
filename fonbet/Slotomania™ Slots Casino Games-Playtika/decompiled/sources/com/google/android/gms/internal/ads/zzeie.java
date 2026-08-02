package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeie {
    private final zzcak zza;

    zzeie(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    public final void zza() {
        ListenableFuture zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziG)).booleanValue()) {
            zzcfi.zzb(zza, "persistFlags");
        } else {
            zzcfi.zza(zza, "persistFlags", zzcff.zzh);
        }
    }
}
