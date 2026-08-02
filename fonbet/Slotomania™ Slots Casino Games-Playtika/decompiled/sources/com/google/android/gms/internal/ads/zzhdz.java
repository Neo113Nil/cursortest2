package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhdz {
    public static byte[] zza(zzhdt zzhdtVar) throws GeneralSecurityException {
        return ((zzhnf) zzhmj.zza().zzk(zzhdtVar, zzhnf.class)).zzc().zzaN();
    }

    public static zzhdt zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhsi zzd = zzhsi.zzd(bArr, zzidb.zza());
            zzhmj zza = zzhmj.zza();
            zzhnf zzb = zzhnf.zzb(zzd);
            return !zza.zzi(zzb) ? new zzhls(zzb) : zza.zzj(zzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
