package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcpg implements zzfhz {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    private final zzcol zzh;

    zzcpg(zzcol zzcolVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcolVar;
        zzimi zza = zzimj.zza(context);
        this.zza = zza;
        zzimi zza2 = zzimj.zza(zzrVar);
        this.zzb = zza2;
        zzimi zza3 = zzimj.zza(str);
        this.zzc = zza3;
        zzimr zzimrVar = zzcolVar.zzp;
        zzimr zza4 = zzimh.zza(zzesr.zza(zzimrVar));
        this.zzd = zza4;
        zzimr zza5 = zzimh.zza(zzfiy.zza(zzcolVar.zzby));
        this.zze = zza5;
        zzimr zza6 = zzimh.zza(zzfhx.zza(zza, zzcolVar.zza, zzcolVar.zzaf, zza4, zza5, zzfko.zza()));
        this.zzf = zza6;
        this.zzg = zzimh.zza(zzesz.zza(zza, zza2, zza3, zza6, zza4, zza5, zzcolVar.zzi, zzcolVar.zzai, zzimrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final zzesy zza() {
        return (zzesy) this.zzg.zzb();
    }
}
