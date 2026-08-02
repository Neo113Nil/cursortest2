package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
final class zzjh implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzke zzd;

    zzjh(zzke zzkeVar, AtomicReference atomicReference, zzq zzqVar, boolean z11) {
        this.zzd = zzkeVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzke zzkeVar;
        zzeq zzeqVar;
        synchronized (this.zza) {
            try {
                try {
                    zzkeVar = this.zzd;
                    zzeqVar = zzkeVar.zzb;
                } catch (RemoteException e11) {
                    this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e11);
                    atomicReference = this.zza;
                }
                if (zzeqVar == null) {
                    zzkeVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzeqVar.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
