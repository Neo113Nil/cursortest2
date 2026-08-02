package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcpm implements zzfjn {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    final zzimr zzh;
    private final zzcol zzi;

    zzcpm(zzcol zzcolVar, Context context, String str) {
        this.zzi = zzcolVar;
        zzimi zza = zzimj.zza(context);
        this.zza = zza;
        zzimr zzimrVar = zzcolVar.zzby;
        zzfhn zzc = zzfhn.zzc(zza, zzimrVar, zzcolVar.zzbz);
        this.zzb = zzc;
        zzimr zza2 = zzimh.zza(zzfiy.zza(zzimrVar));
        this.zzc = zza2;
        zzimr zza3 = zzimh.zza(zzfkk.zza());
        this.zzd = zza3;
        zzimr zza4 = zzimh.zza(zzfjh.zza(zza, zzcolVar.zza, zzcolVar.zzaf, zzc, zza2, zzfko.zza(), zza3));
        this.zze = zza4;
        this.zzf = zzimh.zza(zzfjr.zza(zza4, zza2, zza3));
        zzimi zzc2 = zzimj.zzc(str);
        this.zzg = zzc2;
        this.zzh = zzimh.zza(zzfjl.zza(zzc2, zza4, zza, zza2, zza3, zzcolVar.zzi, zzcolVar.zzai, zzcolVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final zzfjq zza() {
        return (zzfjq) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final zzfjk zzb() {
        return (zzfjk) this.zzh.zzb();
    }
}
