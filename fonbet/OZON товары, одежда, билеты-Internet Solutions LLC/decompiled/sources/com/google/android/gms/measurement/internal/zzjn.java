package com.google.android.gms.measurement.internal;

import N3.C3661l;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzke zzc;

    zzjn(zzke zzkeVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzkeVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeq zzeqVar;
        zzke zzkeVar = this.zzc;
        zzeqVar = zzkeVar.zzb;
        if (zzeqVar == null) {
            C3661l.b(zzkeVar.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeqVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e11) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e11);
        }
    }
}
