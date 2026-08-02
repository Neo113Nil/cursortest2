package com.google.android.gms.internal.measurement;

import T7.E;

/* loaded from: classes.dex */
final class zzie extends zzid {
    private final Object zza;

    zzie(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzie) {
            return this.zza.equals(((zzie) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return E.c(this.zza, ")", new StringBuilder("Optional.of("));
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final boolean zzb() {
        return true;
    }
}
