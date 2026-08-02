package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhga extends zzhek {
    private final zzhgf zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    private zzhga(zzhgf zzhgfVar, zziao zziaoVar, zziam zziamVar, @Nullable Integer num) {
        this.zza = zzhgfVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzc;
    }

    public final zziao zze() {
        return this.zzb;
    }

    public final zzhgf zzf() {
        return this.zza;
    }

    public static zzhga zzd(zzhge zzhgeVar, zziao zziaoVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zzb;
        zzhge zzhgeVar2 = zzhge.zzc;
        if (zzhgeVar != zzhgeVar2 && num == null) {
            String obj = zzhgeVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhgeVar == zzhgeVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziaoVar.zzd() != 32) {
            int zzd = zziaoVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhgf zzb2 = zzhgf.zzb(zzhgeVar);
        if (zzb2.zzc() == zzhgeVar2) {
            zzb = zzhmk.zza;
        } else if (zzb2.zzc() == zzhge.zzb) {
            zzb = zzhmk.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzhge.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzhmk.zzb(num.intValue());
        }
        return new zzhga(zzb2, zziaoVar, zzb, num);
    }
}
