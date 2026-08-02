package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcpi implements zzegx {
    final zzimr zza;
    final zzimr zzb;
    private final zzcol zzc;
    private final zzcpi zzd = this;

    zzcpi(zzcol zzcolVar, Context context) {
        this.zzc = zzcolVar;
        zzeif zzc = zzeif.zzc(zzcolVar.zzaG);
        this.zza = zzc;
        this.zzb = zzehx.zza(zzcolVar.zzf, zzfno.zza(), zzcof.zza, zzcolVar.zzaF, zzc, zzcolVar.zzaH, zzcoc.zza, zzcolVar.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzegx
    public final zzehb zza() {
        zzcol zzcolVar = this.zzc;
        zzimr zzimrVar = zzcolVar.zzp;
        zzcmz zzI = zzcolVar.zzI();
        return zzehc.zza(zzcng.zzd(zzcolVar.zzI()), zzfnu.zzc(), zzfno.zzc(), zzimh.zzc(this.zzb), zzcnw.zzd(zzI), this, (zzdyz) zzimrVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzegx
    public final zzehd zzb() {
        return new zzcpj(this.zzc, this.zzd, null);
    }
}
