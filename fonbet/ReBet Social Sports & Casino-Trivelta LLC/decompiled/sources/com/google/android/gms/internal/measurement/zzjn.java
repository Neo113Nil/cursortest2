package com.google.android.gms.internal.measurement;

import Ra.t;
import android.content.Context;

/* loaded from: classes2.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final t zzb;

    public zzjn(Context context, t tVar) {
        this.zza = context;
        this.zzb = tVar;
    }

    public final boolean equals(Object obj) {
        t tVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((tVar = this.zzb) != null ? tVar.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        t tVar = this.zzb;
        return (hashCode * 1000003) ^ (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(obj);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final t zzb() {
        return this.zzb;
    }
}
