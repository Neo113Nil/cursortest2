package com.google.android.gms.internal.measurement;

import T7.E;
import java.io.Serializable;

/* loaded from: classes.dex */
final class zzig implements Serializable, zzif {
    final zzif zza;
    volatile transient boolean zzb;
    transient Object zzc;

    zzig(zzif zzifVar) {
        zzifVar.getClass();
        this.zza = zzifVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.zzb) {
            obj = E.c(this.zzc, ">", new StringBuilder("<supplier that returned "));
        } else {
            obj = this.zza;
        }
        return E.c(obj, ")", sb2);
    }

    @Override // com.google.android.gms.internal.measurement.zzif
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
