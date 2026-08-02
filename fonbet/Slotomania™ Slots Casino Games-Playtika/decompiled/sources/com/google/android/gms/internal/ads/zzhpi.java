package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhpi implements zzhoa {
    public zzhpi(zzhns zzhnsVar) {
    }

    public static zzhoa zza(zzhns zzhnsVar) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza = zzhkl.zza();
        if (zza != null) {
            try {
                return zzhph.zza(zzhnsVar, zza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhpi(zzhnsVar);
    }
}
