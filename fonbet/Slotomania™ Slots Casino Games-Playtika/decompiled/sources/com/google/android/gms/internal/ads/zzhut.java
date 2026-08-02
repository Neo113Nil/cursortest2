package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhut extends zzhxb {
    private final zzhus zza;

    private zzhut(zzhus zzhusVar) {
        this.zza = zzhusVar;
    }

    public static zzhut zzb(zzhus zzhusVar) {
        return new zzhut(zzhusVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhut) && ((zzhut) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhut.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhus.zzd;
    }

    public final zzhus zzc() {
        return this.zza;
    }
}
