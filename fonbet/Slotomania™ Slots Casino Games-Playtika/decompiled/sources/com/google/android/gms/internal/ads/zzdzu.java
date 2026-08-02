package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdzu implements zzimi {
    private final zzimr zza;

    private zzdzu(zzdzo zzdzoVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzdzu zza(zzdzo zzdzoVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdzu(zzdzoVar, zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = zzdzo.zzf((zzdzy) this.zza.zzb(), zzfno.zzc());
        zzimq.zzb(zzf);
        return zzf;
    }
}
