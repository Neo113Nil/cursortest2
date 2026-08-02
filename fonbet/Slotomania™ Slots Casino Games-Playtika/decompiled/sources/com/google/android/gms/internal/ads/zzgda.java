package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzgda implements zzgfw {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    private final zzgcu zzf;
    private final zzgda zzg = this;

    zzgda(zzgcu zzgcuVar) {
        this.zzf = zzgcuVar;
        zzimr zza = zzimh.zza(zzgfz.zza());
        this.zza = zza;
        zzimr zza2 = zzimh.zza(zzghj.zza(zzgcuVar.zza, zzgcuVar.zzc, zzgcuVar.zzG, zza, zzgcuVar.zzJ, zzgcuVar.zzu, zzgcuVar.zzj, zzghm.zza()));
        this.zzb = zza2;
        zzimr zza3 = zzimh.zza(zzgge.zza());
        this.zzc = zza3;
        zzgcz zzgczVar = new zzgcz(this);
        this.zzd = zzgczVar;
        this.zze = zzimh.zza(zzgfx.zza(zzgcuVar.zzc, zza2, zzgcuVar.zzG, zzgcuVar.zzF, zza3, zzgczVar, zzgcuVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfe zza() {
        return (zzgfe) this.zze.zzb();
    }

    final /* synthetic */ zzgcu zzb() {
        return this.zzf;
    }

    final /* synthetic */ zzgda zzc() {
        return this.zzg;
    }
}
