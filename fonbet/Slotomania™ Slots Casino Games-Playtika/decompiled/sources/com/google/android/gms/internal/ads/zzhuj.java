package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhuj extends zzhxb {
    private final zzhuh zza;
    private final zzhuf zzb;
    private final zzhug zzc;
    private final zzhui zzd;

    /* synthetic */ zzhuj(zzhuh zzhuhVar, zzhuf zzhufVar, zzhug zzhugVar, zzhui zzhuiVar, byte[] bArr) {
        this.zza = zzhuhVar;
        this.zzb = zzhufVar;
        this.zzc = zzhugVar;
        this.zzd = zzhuiVar;
    }

    public static zzhue zzb() {
        return new zzhue(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhuj)) {
            return false;
        }
        zzhuj zzhujVar = (zzhuj) obj;
        return zzhujVar.zza == this.zza && zzhujVar.zzb == this.zzb && zzhujVar.zzc == this.zzc && zzhujVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhuj.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        int length = obj.length();
        String obj2 = this.zzc.toString();
        int length2 = obj2.length();
        String obj3 = this.zza.toString();
        int length3 = obj3.length();
        String obj4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + obj4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(obj);
        sb.append(", hashType: ");
        sb.append(obj2);
        sb.append(", encoding: ");
        sb.append(obj3);
        sb.append(", curve: ");
        sb.append(obj4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhui.zzd;
    }

    public final zzhuh zzc() {
        return this.zza;
    }

    public final zzhuf zzd() {
        return this.zzb;
    }

    public final zzhug zze() {
        return this.zzc;
    }

    public final zzhui zzf() {
        return this.zzd;
    }
}
