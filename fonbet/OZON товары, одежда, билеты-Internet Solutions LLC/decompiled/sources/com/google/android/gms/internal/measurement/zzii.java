package com.google.android.gms.internal.measurement;

import T7.E;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzii implements Serializable, zzif {
    final Object zza;

    zzii(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzii)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((zzii) obj).zza;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return E.c(this.zza, ")", new StringBuilder("Suppliers.ofInstance("));
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object zza() {
        return this.zza;
    }
}
