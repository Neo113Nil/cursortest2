package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzjd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzjy zzc;

    zzjd(zzjy zzjyVar, AtomicReference atomicReference, zzq zzqVar) {
        this.zzc = zzjyVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzek zzekVar;
        synchronized (this.zza) {
            try {
                try {
                } catch (RemoteException e) {
                    this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e);
                    atomicReference = this.zza;
                }
                if (this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzjy zzjyVar = this.zzc;
                    zzekVar = zzjyVar.zzb;
                    if (zzekVar != null) {
                        Preconditions.checkNotNull(this.zzb);
                        this.zza.set(zzekVar.zzd(this.zzb));
                        String str = (String) this.zza.get();
                        if (str != null) {
                            this.zzc.zzt.zzq().zzO(str);
                            this.zzc.zzt.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        atomicReference = this.zza;
                        atomicReference.notify();
                        return;
                    }
                    zzjyVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                    this.zza.notify();
                } else {
                    this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                    this.zza.set(null);
                }
            } finally {
                this.zza.notify();
            }
        }
    }
}
