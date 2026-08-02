package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziaj {
    public static String zza(zzhzv zzhzvVar) throws GeneralSecurityException {
        zziak.zzb(zzhzvVar);
        return zzhzvVar.toString().concat("withECDSA");
    }

    public static String zzb(zzhzv zzhzvVar) throws GeneralSecurityException {
        int ordinal = zzhzvVar.ordinal();
        if (ordinal == 0) {
            return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzhzvVar.toString()));
    }
}
