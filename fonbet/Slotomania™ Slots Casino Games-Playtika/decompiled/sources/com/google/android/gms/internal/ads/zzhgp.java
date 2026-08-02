package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhgp extends zzhel {
    private final String zza;
    private final zzhgo zzb;

    private zzhgp(String str, zzhgo zzhgoVar) {
        this.zza = str;
        this.zzb = zzhgoVar;
    }

    public static zzhgp zzb(String str, zzhgo zzhgoVar) {
        return new zzhgp(str, zzhgoVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgp)) {
            return false;
        }
        zzhgp zzhgpVar = (zzhgp) obj;
        return zzhgpVar.zza.equals(this.zza) && zzhgpVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhgp.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + obj.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhgo.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhgo zzd() {
        return this.zzb;
    }
}
