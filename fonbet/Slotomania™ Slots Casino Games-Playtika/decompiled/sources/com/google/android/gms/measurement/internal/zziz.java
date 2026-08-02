package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zziz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjy zzf;

    zziz(zzjy zzjyVar, String str, String str2, zzq zzqVar, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjyVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        zzek zzekVar;
        Bundle bundle2 = new Bundle();
        try {
            zzjy zzjyVar = this.zzf;
            zzekVar = zzjyVar.zzb;
            if (zzekVar == null) {
                zzjyVar.zzt.zzaA().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzt.zzv().zzS(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzlj> zzh = zzekVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh != null) {
                for (zzlj zzljVar : zzh) {
                    String str = zzljVar.zze;
                    if (str != null) {
                        bundle.putString(zzljVar.zzb, str);
                    } else {
                        Long l = zzljVar.zzd;
                        if (l != null) {
                            bundle.putLong(zzljVar.zzb, l.longValue());
                        } else {
                            Double d = zzljVar.zzg;
                            if (d != null) {
                                bundle.putDouble(zzljVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.zzf.zzt.zzaA().zzd().zzc("Failed to get user properties; remote exception", this.zza, e);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.zzf.zzt.zzv().zzS(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzt.zzv().zzS(this.zze, bundle2);
            throw th;
        }
    }
}
