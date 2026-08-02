package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhgz extends zzhel {
    private final zzhgy zza;
    private final String zzb;
    private final zzhgx zzc;
    private final zzhel zzd;

    /* synthetic */ zzhgz(zzhgy zzhgyVar, String str, zzhgx zzhgxVar, zzhel zzhelVar, byte[] bArr) {
        this.zza = zzhgyVar;
        this.zzb = str;
        this.zzc = zzhgxVar;
        this.zzd = zzhelVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgz)) {
            return false;
        }
        zzhgz zzhgzVar = (zzhgz) obj;
        return zzhgzVar.zzc.equals(this.zzc) && zzhgzVar.zzd.equals(this.zzd) && zzhgzVar.zzb.equals(this.zzb) && zzhgzVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhgz.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhgy zzhgyVar = this.zza;
        zzhel zzhelVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzhelVar);
        String valueOf3 = String.valueOf(zzhgyVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + String.valueOf(valueOf2).length() + 11 + String.valueOf(valueOf3).length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(valueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(valueOf2);
        sb.append(", variant: ");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhgy.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhgy zzc() {
        return this.zza;
    }

    public final zzhel zzd() {
        return this.zzd;
    }
}
