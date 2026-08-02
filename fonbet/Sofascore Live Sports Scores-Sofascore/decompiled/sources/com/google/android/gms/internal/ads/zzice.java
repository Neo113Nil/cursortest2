package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzice {
    public static String a(zzibq zzibqVar) {
        int ordinal = zzibqVar.ordinal();
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
        throw new GeneralSecurityException("Unsupported hash ".concat(zzibqVar.toString()));
    }
}
