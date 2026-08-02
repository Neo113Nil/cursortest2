package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhpx implements zzhps {
    private final Key zza;
    private final Provider zzb;

    private zzhpx(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.zza = new SecretKeySpec(bArr, "AES");
        this.zzb = provider;
    }

    public static zzhps zzb(zzhpq zzhpqVar) throws GeneralSecurityException {
        Provider zza = zzhkl.zza();
        if (zza == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", zza);
        return new zzhpx(zzhpqVar.zzd().zzc(zzhda.zza()), zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhps
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.zzb;
        Key key = this.zza;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
    }
}
