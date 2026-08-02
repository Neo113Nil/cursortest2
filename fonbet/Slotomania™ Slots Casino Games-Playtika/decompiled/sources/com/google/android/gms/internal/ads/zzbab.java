package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbab implements Runnable {
    final /* synthetic */ zzbac zza;

    zzbab(zzbac zzbacVar) {
        Objects.requireNonNull(zzbacVar);
        this.zza = zzbacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        ConditionVariable conditionVariable2;
        zzbac zzbacVar = this.zza;
        if (zzbacVar.zzb != null) {
            return;
        }
        conditionVariable = zzbac.zzd;
        synchronized (conditionVariable) {
            if (zzbacVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbie.zzdu.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzbac.zza = zzfym.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzbac.zzd;
            conditionVariable2.open();
        }
    }
}
