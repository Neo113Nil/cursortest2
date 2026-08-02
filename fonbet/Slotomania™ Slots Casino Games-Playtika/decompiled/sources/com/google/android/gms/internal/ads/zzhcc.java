package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhcc implements Runnable {
    zzhce zza;

    zzhcc(zzhce zzhceVar) {
        this.zza = zzhceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture zzf;
        zzhce zzhceVar = this.zza;
        if (zzhceVar == null || (zzf = zzhceVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (zzf.isDone()) {
            zzhceVar.zzk(zzf);
            return;
        }
        try {
            ScheduledFuture zzx = zzhceVar.zzx();
            zzhceVar.zzy(null);
            String str = "Timed out";
            if (zzx != null) {
                try {
                    long abs = Math.abs(zzx.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(abs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    zzhceVar.zzb(new zzhcd(str, null));
                    throw th;
                }
            }
            String obj = zzf.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            zzhceVar.zzb(new zzhcd(sb2.toString(), null));
        } finally {
            zzf.cancel(true);
        }
    }
}
