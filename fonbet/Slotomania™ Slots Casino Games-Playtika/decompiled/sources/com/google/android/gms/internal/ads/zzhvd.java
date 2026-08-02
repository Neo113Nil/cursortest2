package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhvd extends zzhxb {
    private final zzhvb zza;
    private final zzhvc zzb;

    private zzhvd(zzhvb zzhvbVar, zzhvc zzhvcVar) {
        this.zza = zzhvbVar;
        this.zzb = zzhvcVar;
    }

    public static zzhvd zzb(zzhvb zzhvbVar, zzhvc zzhvcVar) {
        return new zzhvd(zzhvbVar, zzhvcVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvd)) {
            return false;
        }
        zzhvd zzhvdVar = (zzhvd) obj;
        return zzhvdVar.zza == this.zza && zzhvdVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhvd.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 1);
        sb.append("ML-DSA Parameters (ML-DSA instance: ");
        sb.append(obj);
        sb.append(", variant: ");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhvc.zzb;
    }
}
