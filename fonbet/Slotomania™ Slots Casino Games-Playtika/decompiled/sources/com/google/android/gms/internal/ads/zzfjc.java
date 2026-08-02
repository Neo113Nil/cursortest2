package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfjc implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzfjf zzd;
    final /* synthetic */ zzfjg zze;

    zzfjc(zzfjg zzfjgVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzfjf zzfjfVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzfjfVar;
        Objects.requireNonNull(zzfjgVar);
        this.zze = zzfjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfjg zzfjgVar = this.zze;
        zzdvf zzdvfVar = (zzdvf) zzfjgVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdvfVar == null ? zzflo.zzb(th, null) : zzdvfVar.zza().zzg(th);
        synchronized (zzfjgVar) {
            if (zzdvfVar != null) {
                zzdvfVar.zze().zzdJ(zzb);
                zzfjgVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfjc.this.zze.zzg().zzdJ(zzb);
                    }
                });
            } else {
                zzfjgVar.zzg().zzdJ(zzb);
                zzfjgVar.zze(this.zzd).zzh().zza().zzd().zzo();
            }
            zzflj.zza(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzi = zzfjgVar.zzi();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzh(zzb);
                zzfpiVar.zzj(th);
                zzfpiVar.zzd(false);
                zzi.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zzf(zzb);
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzj(th);
                zzfpiVar2.zzd(false);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzfjg zzfjgVar = this.zze;
        zzdva zzdvaVar = (zzdva) obj;
        synchronized (zzfjgVar) {
            if (zzdvaVar != null) {
                zzdvaVar.zzt();
            }
            zzdvaVar.zzq().zzd(zzfjgVar.zzg());
            this.zza.zzb(zzdvaVar);
            Executor zzf = zzfjgVar.zzf();
            final zzfix zzg = zzfjgVar.zzg();
            Objects.requireNonNull(zzg);
            zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfja
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfix.this.zzg();
                }
            });
            zzfjgVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzi = zzfjgVar.zzi();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzg(zzdvaVar.zzr().zzb);
                zzfpiVar.zzi(zzdvaVar.zzn().zze());
                zzfpiVar.zzd(true);
                zzi.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zze(zzdvaVar.zzr().zzb);
                zzfpsVar.zzg(zzdvaVar.zzn().zze());
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzd(true);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }
}
