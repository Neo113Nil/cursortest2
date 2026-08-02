package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzke zzc;

    zzjk(zzke zzkeVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzkeVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgk zzgkVar;
        zzeq zzeqVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzke zzkeVar = this.zzc;
                    zzeqVar = zzkeVar.zzb;
                    if (zzeqVar == null) {
                        zzkeVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        zzgkVar = this.zzc.zzs;
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzeqVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzs.zzq().zzP(str);
                            this.zzc.zzs.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        zzgkVar = this.zzc.zzs;
                    }
                } else {
                    this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzq().zzP(null);
                    this.zzc.zzs.zzm().zze.zzb(null);
                    zzgkVar = this.zzc.zzs;
                }
            } catch (RemoteException e11) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e11);
                zzgkVar = this.zzc.zzs;
            }
            zzgkVar.zzv().zzV(this.zzb, str);
        } catch (Throwable th2) {
            this.zzc.zzs.zzv().zzV(this.zzb, null);
            throw th2;
        }
    }
}
