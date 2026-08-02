package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzlq implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzlb zzb;

    zzlq(zzlb zzlbVar, zzn zznVar) {
        this.zza = zznVar;
        this.zzb = zzlbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfp zzfpVar;
        zzfpVar = this.zzb.zzb;
        if (zzfpVar == null) {
            this.zzb.zzj().zzg().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzfpVar.zze(this.zza);
            this.zzb.zzaq();
        } catch (RemoteException e) {
            this.zzb.zzj().zzg().zza("Failed to send consent settings to the service", e);
        }
    }
}
