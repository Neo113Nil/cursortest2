package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import xsna.tk5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
final class zzij implements Serializable, zzii {
    final zzii zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzij(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        return tk5.c(new StringBuilder("Suppliers.memoize("), this.zzb ? tk5.c(new StringBuilder("<supplier that returned "), this.zzc, ">") : this.zza, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
