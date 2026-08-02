package com.google.android.gms.internal.measurement;

import T7.E;

/* loaded from: classes.dex */
final class zzih implements zzif {
    volatile zzif zza;
    volatile boolean zzb;
    Object zzc;

    zzih(zzif zzifVar) {
        zzifVar.getClass();
        this.zza = zzifVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = E.c(this.zzc, ">", new StringBuilder("<supplier that returned "));
        }
        return E.c(obj, ")", sb2);
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzif zzifVar = this.zza;
                        zzifVar.getClass();
                        Object zza = zzifVar.zza();
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
