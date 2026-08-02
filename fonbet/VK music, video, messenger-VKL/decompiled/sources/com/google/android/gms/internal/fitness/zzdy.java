package com.google.android.gms.internal.fitness;

import com.google.android.gms.fitness.result.DataReadResult;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdy extends zzbs {
    private final ue6 zza;
    private int zzb = 0;
    private DataReadResult zzc;

    public /* synthetic */ zzdy(ue6 ue6Var, zzdx zzdxVar) {
        this.zza = ue6Var;
    }

    @Override // com.google.android.gms.internal.fitness.zzbt
    public final void zzb(DataReadResult dataReadResult) {
        synchronized (this) {
            try {
                DataReadResult dataReadResult2 = this.zzc;
                if (dataReadResult2 == null) {
                    this.zzc = dataReadResult;
                } else {
                    dataReadResult2.b(dataReadResult);
                }
                int i = this.zzb + 1;
                this.zzb = i;
                DataReadResult dataReadResult3 = this.zzc;
                if (i == dataReadResult3.e) {
                    this.zza.setResult(dataReadResult3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
