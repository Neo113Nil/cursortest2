package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhod {

    @Nullable
    private zzhon zza = null;

    @Nullable
    private zziao zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhod() {
    }

    /* synthetic */ zzhod(byte[] bArr) {
    }

    public final zzhod zza(zzhon zzhonVar) {
        this.zza = zzhonVar;
        return this;
    }

    public final zzhod zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhod zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhoe zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zza;
        zzhon zzhonVar = this.zza;
        if (zzhonVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhonVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhonVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhom.zzd) {
            zza = zzhmk.zza;
        } else if (this.zza.zzf() == zzhom.zzc || this.zza.zzf() == zzhom.zzb) {
            zza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhom.zza) {
                String valueOf = String.valueOf(this.zza.zzf());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhoe(this.zza, this.zzb, zza, this.zzc, null);
    }
}
