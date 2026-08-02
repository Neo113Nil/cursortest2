package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhfr {

    @Nullable
    private zzhfz zza = null;

    @Nullable
    private zziao zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhfr() {
    }

    /* synthetic */ zzhfr(byte[] bArr) {
    }

    public final zzhfr zza(zzhfz zzhfzVar) {
        this.zza = zzhfzVar;
        return this;
    }

    public final zzhfr zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhfr zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfs zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zzb;
        zzhfz zzhfzVar = this.zza;
        if (zzhfzVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfzVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhfy.zzc) {
            zzb = zzhmk.zza;
        } else if (this.zza.zzd() == zzhfy.zzb) {
            zzb = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhfy.zza) {
                String valueOf = String.valueOf(this.zza.zzd());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhfs(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
