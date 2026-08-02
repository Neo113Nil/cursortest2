package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcov implements zzfgj {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcol zzj;

    zzcov(zzcol zzcolVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcolVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzimi zza = zzimj.zza(context);
        this.zza = zza;
        zzimi zza2 = zzimj.zza(zzrVar);
        this.zzb = zza2;
        zzimr zza3 = zzimh.zza(zzesr.zza(zzcolVar.zzp));
        this.zzc = zza3;
        zzimr zza4 = zzimh.zza(zzesw.zza());
        this.zzd = zza4;
        zzimr zza5 = zzimh.zza(zzdhn.zza());
        this.zze = zza5;
        this.zzf = zzimh.zza(zzfgh.zza(zza, zzcolVar.zza, zza2, zzcolVar.zzaf, zza3, zza4, zzfko.zza(), zza5));
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final zzeru zza() {
        zzfgg zzfggVar = (zzfgg) this.zzf.zzb();
        zzesq zzesqVar = (zzesq) this.zzc.zzb();
        zzcol zzcolVar = this.zzj;
        zzimr zzimrVar = zzcolVar.zzp;
        return new zzeru(this.zzg, this.zzh, this.zzi, zzfggVar, zzesqVar, zzcnw.zzd(zzcolVar.zzI()), (zzdyz) zzimrVar.zzb());
    }
}
