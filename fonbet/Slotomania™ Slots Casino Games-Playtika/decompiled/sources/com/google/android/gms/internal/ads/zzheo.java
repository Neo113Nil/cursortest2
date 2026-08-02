package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzheo implements zzhcu {
    private final zzhmu zza;

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzhem zzhemVar : this.zza.zza(bArr)) {
            try {
                byte[] zza = zzhemVar.zza.zza(bArr, bArr2);
                int i = zzhemVar.zzb;
                int length = bArr.length;
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
