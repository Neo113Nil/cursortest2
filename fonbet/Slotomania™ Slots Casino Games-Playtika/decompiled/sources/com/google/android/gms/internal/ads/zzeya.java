package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzeya implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzeya(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzeya zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzeya(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgwj zzh;
        zzeyy zzb = ((zzeza) this.zza).zzb();
        Context zza = ((zzcng) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(zza)) {
                zzh = zzgwj.zzi(zzb);
                zzimq.zzb(zzh);
                return zzh;
            }
        }
        zzh = zzgwj.zzh();
        zzimq.zzb(zzh);
        return zzh;
    }
}
