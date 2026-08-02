package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhhs {
    private static final zzhlf zza = zzhhr.zza;
    private static final zzhmx zzb = zzhmx.zzd(zzhhq.zza, zzhhp.class, zzhcu.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzhju.zza;
        zzhju.zza(zzhmj.zza());
        zzhmf zza2 = zzhmf.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzhho.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhho.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhho.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhho.zzj);
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhmg.zza().zzb(zzb);
        zzhma.zza().zzb(zza, zzhhu.class);
    }
}
