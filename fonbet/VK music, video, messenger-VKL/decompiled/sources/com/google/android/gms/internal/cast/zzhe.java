package com.google.android.gms.internal.cast;

import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzhe extends zzhc {
    private final Object zza;

    public zzhe(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhe) {
            return this.zza.equals(((zzhe) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return tdj.a(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }

    @Override // com.google.android.gms.internal.cast.zzhc
    public final Object zza(Object obj) {
        zzhd.zza(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.zza;
    }
}
