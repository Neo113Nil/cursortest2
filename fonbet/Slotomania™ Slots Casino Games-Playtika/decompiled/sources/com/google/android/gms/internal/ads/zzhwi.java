package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhwi {

    @Nullable
    private zzhwf zza = null;

    @Nullable
    private BigInteger zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhwi() {
    }

    /* synthetic */ zzhwi(byte[] bArr) {
    }

    public final zzhwi zza(zzhwf zzhwfVar) {
        this.zza = zzhwfVar;
        return this;
    }

    public final zzhwi zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwi zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhwj zzd() throws GeneralSecurityException {
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
        if (this.zza.zze() == zzhwe.zzd) {
            zza = zzhmk.zza;
        } else if (this.zza.zze() == zzhwe.zzc || this.zza.zze() == zzhwe.zzb) {
            zza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhwe.zza) {
                String valueOf = String.valueOf(this.zza.zze());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhwj(this.zza, this.zzb, zza, this.zzc, null);
    }
}
