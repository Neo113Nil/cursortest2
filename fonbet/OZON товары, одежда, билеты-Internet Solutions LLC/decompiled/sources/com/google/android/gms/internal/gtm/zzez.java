package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzez {
    private long zzb;
    private final Clock zze;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final String zzd = "tracking";

    public zzez(int i11, long j11, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long currentTimeMillis = this.zze.currentTimeMillis();
                double d11 = this.zza;
                if (d11 < 60.0d) {
                    double d12 = (currentTimeMillis - this.zzb) / 2000.0d;
                    if (d12 > 0.0d) {
                        d11 = Math.min(60.0d, d11 + d12);
                        this.zza = d11;
                    }
                }
                this.zzb = currentTimeMillis;
                if (d11 >= 1.0d) {
                    this.zza = d11 - 1.0d;
                    return true;
                }
                String str = this.zzd;
                StringBuilder sb2 = new StringBuilder(str.length() + 34);
                sb2.append("Excessive ");
                sb2.append(str);
                sb2.append(" detected; call ignored.");
                zzfa.zze(sb2.toString());
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
