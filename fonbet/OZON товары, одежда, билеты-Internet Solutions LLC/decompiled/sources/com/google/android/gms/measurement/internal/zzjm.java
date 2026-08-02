package com.google.android.gms.measurement.internal;

import N3.C3661l;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzjm implements Runnable {
    final /* synthetic */ zziw zza;
    final /* synthetic */ zzke zzb;

    zzjm(zzke zzkeVar, zziw zziwVar) {
        this.zzb = zzkeVar;
        this.zza = zziwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeq zzeqVar;
        zzke zzkeVar = this.zzb;
        zzeqVar = zzkeVar.zzb;
        if (zzeqVar == null) {
            C3661l.b(zzkeVar.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zziw zziwVar = this.zza;
            if (zziwVar == null) {
                zzeqVar.zzq(0L, null, null, zzkeVar.zzs.zzau().getPackageName());
            } else {
                zzeqVar.zzq(zziwVar.zzc, zziwVar.zza, zziwVar.zzb, zzkeVar.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e11) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e11);
        }
    }
}
