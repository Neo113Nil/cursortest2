package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhls extends zzhdt {
    private final zzhnf zza;

    public zzhls(zzhnf zzhnfVar) {
        this.zza = zzhnfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhls)) {
            return false;
        }
        zzhnf zzhnfVar = ((zzhls) obj).zza;
        zzhnf zzhnfVar2 = this.zza;
        return zzhnfVar2.zzc().zzc().equals(zzhnfVar.zzc().zzc()) && zzhnfVar2.zzc().zza().equals(zzhnfVar.zzc().zza()) && zzhnfVar2.zzc().zzb().equals(zzhnfVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhnf zzhnfVar = this.zza;
        return Objects.hash(zzhnfVar.zzc(), zzhnfVar.zzf());
    }

    public final String toString() {
        zzhnf zzhnfVar = this.zza;
        String zza = zzhnfVar.zzc().zza();
        int ordinal = zzhnfVar.zzc().zzc().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zza, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhtb.RAW;
    }

    public final zzhnf zzb() {
        return this.zza;
    }
}
