package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzagq {
    public final zzagt zza;
    public final zzagt zzb;

    public zzagq(zzagt zzagtVar, zzagt zzagtVar2) {
        this.zza = zzagtVar;
        this.zzb = zzagtVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zza.equals(zzagqVar.zza) && this.zzb.equals(zzagqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzagt zzagtVar = this.zza;
        zzagt zzagtVar2 = this.zzb;
        String obj = zzagtVar.toString();
        String concat = zzagtVar.equals(zzagtVar2) ? "" : ", ".concat(zzagtVar2.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 1 + concat.length() + 1);
        sb.append(X3.j.d);
        sb.append(obj);
        sb.append(concat);
        sb.append(X3.j.e);
        return sb.toString();
    }
}
