package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzje implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzjy zzc;

    zzje(zzjy zzjyVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjyVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzge zzgeVar;
        zzek zzekVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzjy zzjyVar = this.zzc;
                    zzekVar = zzjyVar.zzb;
                    if (zzekVar == null) {
                        zzjyVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                        zzgeVar = this.zzc.zzt;
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzekVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzt.zzq().zzO(str);
                            this.zzc.zzt.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        zzgeVar = this.zzc.zzt;
                    }
                } else {
                    this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                    zzgeVar = this.zzc.zzt;
                }
            } catch (RemoteException e) {
                this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e);
                zzgeVar = this.zzc.zzt;
            }
            zzgeVar.zzv().zzW(this.zzb, str);
        } catch (Throwable th) {
            this.zzc.zzt.zzv().zzW(this.zzb, null);
            throw th;
        }
    }
}
