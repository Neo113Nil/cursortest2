package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
final class zzjf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzke zzf;

    zzjf(zzke zzkeVar, String str, String str2, zzq zzqVar, boolean z11, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzkeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z11;
        this.zze = zzcfVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e11;
        Bundle bundle2;
        zzeq zzeqVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                zzke zzkeVar = this.zzf;
                zzeqVar = zzkeVar.zzb;
                if (zzeqVar == null) {
                    zzkeVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzs.zzv().zzR(this.zze, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzlo> zzh = zzeqVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (zzh != null) {
                    for (zzlo zzloVar : zzh) {
                        String str = zzloVar.zze;
                        if (str != null) {
                            bundle.putString(zzloVar.zzb, str);
                        } else {
                            Long l11 = zzloVar.zzd;
                            if (l11 != null) {
                                bundle.putLong(zzloVar.zzb, l11.longValue());
                            } else {
                                Double d11 = zzloVar.zzg;
                                if (d11 != null) {
                                    bundle.putDouble(zzloVar.zzb, d11.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                } catch (RemoteException e12) {
                    e11 = e12;
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e11);
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle3 = bundle2;
                this.zzf.zzs.zzv().zzR(this.zze, bundle3);
                throw th;
            }
        } catch (RemoteException e13) {
            bundle = bundle3;
            e11 = e13;
        } catch (Throwable th3) {
            th = th3;
            this.zzf.zzs.zzv().zzR(this.zze, bundle3);
            throw th;
        }
    }
}
