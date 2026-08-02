package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes7.dex */
final class zzde implements Runnable {
    zzdh zza;

    zzde(zzdh zzdhVar) {
        this.zza = zzdhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.zzd;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzdc zzdcVar;
        ScheduledFuture scheduledFuture;
        zzdh zzdhVar = this.zza;
        if (zzdhVar == null || zzdcVar == null) {
            return;
        }
        this.zza = null;
        if (zzdcVar.isDone()) {
            zzdhVar.zzj(zzdcVar);
            return;
        }
        try {
            scheduledFuture = zzdhVar.zze;
            zzdhVar.zze = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzdhVar.zzi(new zzdf(str, null));
                    throw th;
                }
            }
            zzdhVar.zzi(new zzdf(str + ": " + zzdcVar.toString(), null));
        } finally {
            zzdcVar.cancel(true);
        }
    }
}
