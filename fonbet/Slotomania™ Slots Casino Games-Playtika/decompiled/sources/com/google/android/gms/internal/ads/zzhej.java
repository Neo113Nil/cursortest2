package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhej {
    public static final /* synthetic */ int zza = 0;
    private static final zzhlb zzb = zzb();

    public static zzhcz zza() throws GeneralSecurityException {
        if (zzhki.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzhlb zzb() {
        try {
            zzhmy zza2 = zzhnb.zza();
            zzhep.zzd(zza2);
            zza2.zza(zzhmx.zzd(zzheh.zza, zzher.class, zzhcu.class));
            zza2.zza(zzhmx.zzd(zzhef.zza, zzhfj.class, zzhcu.class));
            zza2.zza(zzhmx.zzd(zzheg.zza, zzhfs.class, zzhcu.class));
            zza2.zza(zzhmx.zzd(zzhee.zza, zzhfb.class, zzhcu.class));
            zza2.zza(zzhmx.zzd(zzhed.zza, zzhga.class, zzhcu.class));
            zza2.zza(zzhmx.zzd(zzhec.zza, zzhhv.class, zzhcu.class));
            zza2.zza(zzhmx.zzd(zzhei.zza, zzhhp.class, zzhcu.class));
            return zzhlb.zzb(zza2.zzc());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
