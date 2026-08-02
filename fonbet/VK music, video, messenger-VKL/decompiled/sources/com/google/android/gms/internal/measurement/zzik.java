package com.google.android.gms.internal.measurement;

import xsna.tk5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
final class zzik implements zzii {
    volatile zzii zza;
    volatile boolean zzb;
    Object zzc;

    public zzik(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = tk5.c(new StringBuilder("<supplier that returned "), this.zzc, ">");
        }
        return tk5.c(sb, obj, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzii zziiVar = this.zza;
                        zziiVar.getClass();
                        Object zza = zziiVar.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        this.zza = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
