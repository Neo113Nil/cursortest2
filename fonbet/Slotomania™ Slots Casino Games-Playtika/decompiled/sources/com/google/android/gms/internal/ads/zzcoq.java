package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcoq implements zzfev {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    private final zzcol zzg;

    zzcoq(zzcol zzcolVar, Context context, String str) {
        this.zzg = zzcolVar;
        zzimi zza = zzimj.zza(context);
        this.zza = zza;
        zzimi zza2 = zzimj.zza(str);
        this.zzb = zza2;
        zzimr zzimrVar = zzcolVar.zzby;
        zzfhm zzc = zzfhm.zzc(zza, zzimrVar, zzcolVar.zzbz);
        this.zzc = zzc;
        zzimr zza3 = zzimh.zza(zzfft.zza(zzimrVar));
        this.zzd = zza3;
        zzimr zzimrVar2 = zzcolVar.zza;
        zzimr zzimrVar3 = zzcolVar.zzaf;
        zzfko zza4 = zzfko.zza();
        zzimr zzimrVar4 = zzcolVar.zzi;
        zzimr zza5 = zzimh.zza(zzffv.zza(zza, zzimrVar2, zzimrVar3, zzc, zza3, zza4, zzimrVar4));
        this.zze = zza5;
        this.zzf = zzimh.zza(zzfgb.zza(zzimrVar3, zza, zza2, zza5, zza3, zzimrVar4, zzcolVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final zzfga zza() {
        return (zzfga) this.zzf.zzb();
    }
}
