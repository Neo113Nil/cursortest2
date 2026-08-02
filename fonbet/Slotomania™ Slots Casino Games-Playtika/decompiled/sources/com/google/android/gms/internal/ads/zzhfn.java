package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhfn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhfk.zza, zzhfj.class, zzhcu.class);
    private static final zzhdd zzc = zzhlo.zze("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhcu.class, zzhse.SYMMETRIC, zzhqv.zze());
    private static final zzhmb zzd = zzhfm.zza;
    private static final zzhlf zze = zzhfl.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhis.zza;
        zzhis.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhmf zza2 = zzhmf.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzhho.zza);
        zzhfo zzhfoVar = new zzhfo(null);
        zzhfoVar.zzb(12);
        zzhfoVar.zza(16);
        zzhfoVar.zzc(16);
        zzhfp zzhfpVar = zzhfp.zzc;
        zzhfoVar.zzd(zzhfpVar);
        hashMap.put("AES128_GCM_RAW", zzhfoVar.zze());
        hashMap.put("AES256_GCM", zzhho.zzb);
        zzhfo zzhfoVar2 = new zzhfo(null);
        zzhfoVar2.zzb(12);
        zzhfoVar2.zza(32);
        zzhfoVar2.zzc(16);
        zzhfoVar2.zzd(zzhfpVar);
        hashMap.put("AES256_GCM_RAW", zzhfoVar2.zze());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhmc.zza().zzb(zzd, zzhfq.class);
        zzhma.zza().zzb(zze, zzhfq.class);
        zzhlg.zza().zzf(zzc, i, true);
    }
}
