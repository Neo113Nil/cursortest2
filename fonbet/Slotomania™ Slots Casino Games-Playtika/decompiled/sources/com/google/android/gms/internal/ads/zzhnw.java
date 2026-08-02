package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhnw {
    private static final zzhlf zza = zzhnv.zza;
    private static final zzhmx zzb = zzhmx.zzd(zzhnt.zza, zzhns.class, zzhoa.class);
    private static final zzhmx zzc = zzhmx.zzd(zzhnu.zza, zzhns.class, zzhds.class);
    private static final zzhdd zzd = zzhlo.zze("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhds.class, zzhse.SYMMETRIC, zzhpz.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzhpf.zza;
        zzhpf.zza(zzhmj.zza());
        zzhma.zza().zzb(zza, zzhnz.class);
        zzhmg.zza().zzb(zzb);
        zzhmg.zza().zzb(zzc);
        zzhmf zza2 = zzhmf.zza();
        HashMap hashMap = new HashMap();
        zzhnz zzhnzVar = zzhpa.zzc;
        hashMap.put("AES_CMAC", zzhnzVar);
        hashMap.put("AES256_CMAC", zzhnzVar);
        zzhnx zzhnxVar = new zzhnx(null);
        zzhnxVar.zza(32);
        zzhnxVar.zzb(16);
        zzhnxVar.zzc(zzhny.zzd);
        hashMap.put("AES256_CMAC_RAW", zzhnxVar.zzd());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhlg.zza().zzb(zzd, true);
    }

    static /* synthetic */ zzhns zzb(zzhnz zzhnzVar, Integer num) {
        zze(zzhnzVar);
        zzhnr zzhnrVar = new zzhnr(null);
        zzhnrVar.zza(zzhnzVar);
        zzhnrVar.zzb(zziao.zzb(zzhnzVar.zzc()));
        zzhnrVar.zzc(num);
        return zzhnrVar.zzd();
    }

    static /* synthetic */ zzhoa zzc(zzhns zzhnsVar) {
        zze(zzhnsVar.zzf());
        return zzhpi.zza(zzhnsVar);
    }

    static /* synthetic */ zzhds zzd(zzhns zzhnsVar) {
        zze(zzhnsVar.zzf());
        return zziac.zza(zzhnsVar);
    }

    private static void zze(zzhnz zzhnzVar) throws GeneralSecurityException {
        if (zzhnzVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
