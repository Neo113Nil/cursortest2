package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class zzjw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    final /* synthetic */ zzke zze;

    zzjw(zzke zzkeVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzkeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgk zzgkVar;
        zzeq zzeqVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzke zzkeVar = this.zze;
                zzeqVar = zzkeVar.zzb;
                if (zzeqVar == null) {
                    zzkeVar.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzgkVar = this.zze.zzs;
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlt.zzH(zzeqVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                    zzgkVar = this.zze.zzs;
                }
            } catch (RemoteException e11) {
                this.zze.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e11);
                zzgkVar = this.zze.zzs;
            }
            zzgkVar.zzv().zzQ(this.zzd, arrayList);
        } catch (Throwable th2) {
            this.zze.zzs.zzv().zzQ(this.zzd, arrayList);
            throw th2;
        }
    }
}
