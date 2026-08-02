package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes9.dex */
final class zzjp implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzke zzd;

    zzjp(zzke zzkeVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzkeVar;
        this.zza = zzawVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgk zzgkVar;
        zzeq zzeqVar;
        byte[] bArr = null;
        try {
            try {
                zzke zzkeVar = this.zzd;
                zzeqVar = zzkeVar.zzb;
                if (zzeqVar == null) {
                    zzkeVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzgkVar = this.zzd.zzs;
                } else {
                    bArr = zzeqVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgkVar = this.zzd.zzs;
                }
            } catch (RemoteException e11) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e11);
                zzgkVar = this.zzd.zzs;
            }
            zzgkVar.zzv().zzS(this.zzc, bArr);
        } catch (Throwable th2) {
            this.zzd.zzs.zzv().zzS(this.zzc, bArr);
            throw th2;
        }
    }
}
