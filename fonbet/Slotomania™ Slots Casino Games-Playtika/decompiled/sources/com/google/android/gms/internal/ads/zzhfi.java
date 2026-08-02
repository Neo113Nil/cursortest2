package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhfi {

    @Nullable
    private zzhfq zza = null;

    @Nullable
    private zziao zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhfi() {
    }

    /* synthetic */ zzhfi(byte[] bArr) {
    }

    public final zzhfi zza(zzhfq zzhfqVar) {
        this.zza = zzhfqVar;
        return this;
    }

    public final zzhfi zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhfi zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfj zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zzb;
        zzhfq zzhfqVar = this.zza;
        if (zzhfqVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfqVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfqVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhfp.zzc) {
            zzb = zzhmk.zza;
        } else if (this.zza.zzd() == zzhfp.zzb) {
            zzb = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhfp.zza) {
                String valueOf = String.valueOf(this.zza.zzd());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhfj(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
