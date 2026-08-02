package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhhz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhhy.zza, zzhhv.class, zzhcu.class);
    private static final zzhdd zzc = zzhlo.zze("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhcu.class, zzhse.SYMMETRIC, zzhub.zze());
    private static final zzhmb zzd = zzhhw.zza;
    private static final zzhlf zze = zzhhx.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzhka.zza;
        zzhka.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhmf zza2 = zzhmf.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzhib.zzb(zzhia.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzhib.zzb(zzhia.zzc));
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhma.zza().zzb(zze, zzhib.class);
        zzhmc.zza().zzb(zzd, zzhib.class);
        zzhlg.zza().zzb(zzc, true);
    }
}
