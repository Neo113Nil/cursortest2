package com.google.android.gms.internal.measurement;

import xsna.tk5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
final class zzih extends zzig {
    private final Object zza;

    public zzih(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzih) {
            return this.zza.equals(((zzih) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return tk5.c(new StringBuilder("Optional.of("), this.zza, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final boolean zzb() {
        return true;
    }
}
