package com.google.android.gms.measurement.internal;

import N3.C3661l;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzjs implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzke zzb;

    zzjs(zzke zzkeVar, zzq zzqVar) {
        this.zzb = zzkeVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeq zzeqVar;
        zzke zzkeVar = this.zzb;
        zzeqVar = zzkeVar.zzb;
        if (zzeqVar == null) {
            C3661l.b(zzkeVar.zzs, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeqVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e11) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e11);
        }
    }
}
