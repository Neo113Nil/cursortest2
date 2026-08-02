package com.google.android.gms.internal.measurement;

import V.e;
import android.content.Context;

/* loaded from: classes.dex */
final class zzhb extends zzhw {
    private final Context zza;
    private final zzif zzb;

    zzhb(Context context, zzif zzifVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzifVar;
    }

    public final boolean equals(Object obj) {
        zzif zzifVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhw) {
            zzhw zzhwVar = (zzhw) obj;
            if (this.zza.equals(zzhwVar.zza()) && ((zzifVar = this.zzb) != null ? zzifVar.equals(zzhwVar.zzb()) : zzhwVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzif zzifVar = this.zzb;
        return hashCode ^ (zzifVar == null ? 0 : zzifVar.hashCode());
    }

    public final String toString() {
        return e.a("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhw
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhw
    final zzif zzb() {
        return this.zzb;
    }
}
