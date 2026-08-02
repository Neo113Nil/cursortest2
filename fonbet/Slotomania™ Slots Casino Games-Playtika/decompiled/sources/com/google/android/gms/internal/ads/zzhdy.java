package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhdy {
    public static zzhdn zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhso zze = zzhso.zze(zzhdb.zza(str).zzb().zzaN(), zzidb.zza());
                    for (zzhsn zzhsnVar : zze.zzb()) {
                        if (zzhsnVar.zzb().zzc() == zzhse.UNKNOWN_KEYMATERIAL || zzhsnVar.zzb().zzc() == zzhse.SYMMETRIC || zzhsnVar.zzb().zzc() == zzhse.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzhsnVar.zzb().zzc().name(), zzhsnVar.zzb().zza()));
                        }
                    }
                    return zzhdn.zza(zze);
                } catch (zzieg unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzieg unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
