package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhwf extends zzhxb {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhwe zzd;
    private final zzhwd zze;

    /* synthetic */ zzhwf(int i, BigInteger bigInteger, zzhwe zzhweVar, zzhwd zzhwdVar, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhweVar;
        this.zze = zzhwdVar;
    }

    public static zzhwc zzb() {
        return new zzhwc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwf)) {
            return false;
        }
        zzhwf zzhwfVar = (zzhwf) obj;
        return zzhwfVar.zzb == this.zzb && Objects.equals(zzhwfVar.zzc, this.zzc) && zzhwfVar.zzd == this.zzd && zzhwfVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhwf.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwd zzhwdVar = this.zze;
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(zzhwdVar);
        String valueOf3 = String.valueOf(bigInteger);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        sb.append("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", publicExponent: ");
        sb.append(valueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhwe.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhwe zze() {
        return this.zzd;
    }

    public final zzhwd zzf() {
        return this.zze;
    }
}
