package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcng implements zzimi {
    private final zzcmz zza;

    private zzcng(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcng zzc(zzcmz zzcmzVar) {
        return new zzcng(zzcmzVar);
    }

    public static Context zzd(zzcmz zzcmzVar) {
        Context zza = zzcmzVar.zza();
        zzimq.zzb(zza);
        return zza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
