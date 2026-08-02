package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhzz implements zzhps {
    public static zzhps zzb(zzhpq zzhpqVar) throws GeneralSecurityException {
        zzhps zzb = zzhpw.zzb(zzhpqVar);
        try {
            return new zzhzy(zzb, zzhpx.zzb(zzhpqVar), null);
        } catch (GeneralSecurityException unused) {
            return zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhps
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
