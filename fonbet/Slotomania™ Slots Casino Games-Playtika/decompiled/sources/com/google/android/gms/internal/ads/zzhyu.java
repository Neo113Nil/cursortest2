package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhyu implements zzhcu {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzhyu(byte[] bArr, zziam zziamVar) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzhin.zzb(bArr);
        this.zzb = zziamVar.zzc();
    }

    public static zzhcu zzb(zzhfj zzhfjVar) throws GeneralSecurityException {
        zzhfjVar.zzf();
        zzhfjVar.zzf();
        return new zzhyu(zzhfjVar.zze().zzc(zzhda.zza()), zzhfjVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhnq.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec zzc = zzhin.zzc(bArr, length2, 12);
        SecretKey secretKey = this.zza;
        Cipher zza = zzhin.zza();
        zza.init(2, secretKey, zzc);
        if (bArr2 != null && bArr2.length != 0) {
            zza.updateAAD(bArr2);
        }
        return zza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
