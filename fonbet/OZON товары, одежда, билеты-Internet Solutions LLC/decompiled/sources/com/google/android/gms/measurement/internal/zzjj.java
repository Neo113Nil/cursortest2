package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzjj implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzke zzc;

    zzjj(zzke zzkeVar, AtomicReference atomicReference, zzq zzqVar) {
        this.zzc = zzkeVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzeq zzeqVar;
        synchronized (this.zza) {
            try {
                try {
                } catch (RemoteException e11) {
                    this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e11);
                    atomicReference = this.zza;
                }
                if (this.zzc.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzke zzkeVar = this.zzc;
                    zzeqVar = zzkeVar.zzb;
                    if (zzeqVar != null) {
                        Preconditions.checkNotNull(this.zzb);
                        this.zza.set(zzeqVar.zzd(this.zzb));
                        String str = (String) this.zza.get();
                        if (str != null) {
                            this.zzc.zzs.zzq().zzP(str);
                            this.zzc.zzs.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        atomicReference = this.zza;
                        atomicReference.notify();
                        return;
                    }
                    zzkeVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                    this.zza.notify();
                } else {
                    this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzq().zzP(null);
                    this.zzc.zzs.zzm().zze.zzb(null);
                    this.zza.set(null);
                }
            } finally {
                this.zza.notify();
            }
        }
    }
}
