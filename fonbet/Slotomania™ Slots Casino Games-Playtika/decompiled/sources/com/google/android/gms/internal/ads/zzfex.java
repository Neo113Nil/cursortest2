package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfex implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzfey zzd;
    final /* synthetic */ zzffb zze;

    zzfex(zzffb zzffbVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzfey zzfeyVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzfeyVar;
        Objects.requireNonNull(zzffbVar);
        this.zze = zzffbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzffb zzffbVar = this.zze;
        zzcuj zzcujVar = (zzcuj) zzffbVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcujVar == null ? zzflo.zzb(th, null) : zzcujVar.zza().zzg(th);
        synchronized (zzffbVar) {
            zzffbVar.zzl(null);
            if (zzcujVar != null) {
                zzcujVar.zze().zzdJ(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjt)).booleanValue()) {
                    zzffbVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfew
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfex.this.zze.zzi().zzdJ(zzb);
                        }
                    });
                }
            } else {
                zzffbVar.zzi().zzdJ(zzb);
                ((zzcuj) zzffbVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzflj.zza(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzk = zzffbVar.zzk();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzh(zzb);
                zzfpiVar.zzj(th);
                zzfpiVar.zzd(false);
                zzk.zzb(zzfpiVar.zzm());
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
        zzffb zzffbVar = this.zze;
        zzcxh zzcxhVar = (zzcxh) obj;
        synchronized (zzffbVar) {
            if (zzcxhVar != null) {
                zzcxhVar.zzt();
            }
            zzffbVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjt)).booleanValue()) {
                zzcxhVar.zzq().zzc(zzffbVar.zzi());
            }
            this.zza.zzb(zzcxhVar);
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzk = zzffbVar.zzk();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzg(zzcxhVar.zzr().zzb);
                zzfpiVar.zzi(zzcxhVar.zzn().zze());
                zzfpiVar.zzd(true);
                zzk.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zze(zzcxhVar.zzr().zzb);
                zzfpsVar.zzg(zzcxhVar.zzn().zze());
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzd(true);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }
}
