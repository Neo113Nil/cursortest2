package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhwu {

    @Nullable
    private zzhwr zza = null;

    @Nullable
    private BigInteger zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhwu() {
    }

    /* synthetic */ zzhwu(byte[] bArr) {
    }

    public final zzhwu zza(zzhwr zzhwrVar) {
        this.zza = zzhwrVar;
        return this;
    }

    public final zzhwu zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwu zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhwv zzd() throws GeneralSecurityException {
        zziam zza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        int zzc = this.zza.zzc();
        if (bitLength != zzc) {
            StringBuilder sb = new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(zzc).length());
            sb.append("Got modulus size ");
            sb.append(bitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(zzc);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhwq.zzd) {
            zza = zzhmk.zza;
        } else if (this.zza.zze() == zzhwq.zzc || this.zza.zze() == zzhwq.zzb) {
            zza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhwq.zza) {
                String valueOf = String.valueOf(this.zza.zze());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhwv(this.zza, this.zzb, zza, this.zzc, null);
    }
}
