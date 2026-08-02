package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzguu extends zzgxt implements Serializable {
    final zzgsn zza;
    final zzgxt zzb;

    zzguu(zzgsn zzgsnVar, zzgxt zzgxtVar) {
        this.zza = zzgsnVar;
        this.zzb = zzgxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgsn zzgsnVar = this.zza;
        return this.zzb.compare(zzgsnVar.apply(obj), zzgsnVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzguu) {
            zzguu zzguuVar = (zzguu) obj;
            if (this.zza.equals(zzguuVar.zza) && this.zzb.equals(zzguuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        int length = obj.length();
        String obj2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + obj2.length() + 1);
        sb.append(obj);
        sb.append(".onResultOf(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
