package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhxa {
    static {
        int i = zzhtd.zza;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhvx.zzc();
        zzhwb.zzc();
        zzhur.zza(true);
        zzhwn.zza(true);
        zzhwz.zza(true);
        if (zzhki.zza()) {
            return;
        }
        zzhuz.zza(true);
    }
}
