package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzja implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjy zzd;

    zzja(zzjy zzjyVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.zzd = zzjyVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjy zzjyVar;
        zzek zzekVar;
        synchronized (this.zza) {
            try {
                try {
                    zzjyVar = this.zzd;
                    zzekVar = zzjyVar.zzb;
                } catch (RemoteException e) {
                    this.zzd.zzt.zzaA().zzd().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.zza;
                }
                if (zzekVar == null) {
                    zzjyVar.zzt.zzaA().zzd().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzekVar.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
