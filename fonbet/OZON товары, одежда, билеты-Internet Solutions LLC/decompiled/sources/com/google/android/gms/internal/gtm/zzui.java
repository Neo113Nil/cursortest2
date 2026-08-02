package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzui {
    private final Object zza;
    private final int zzb;

    zzui(Object obj, int i11) {
        this.zza = obj;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzui)) {
            return false;
        }
        zzui zzuiVar = (zzui) obj;
        return this.zza == zzuiVar.zza && this.zzb == zzuiVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
