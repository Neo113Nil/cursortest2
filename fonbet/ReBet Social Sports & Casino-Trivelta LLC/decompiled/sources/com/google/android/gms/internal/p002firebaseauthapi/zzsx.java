package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzsx implements zzsq {
    private static final zziv.zza zza = zziv.zza.zza;
    private final Key zzb;
    private final Provider zzc;

    private zzsx(byte[] bArr, Provider provider) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.zzb = new SecretKeySpec(bArr, "AES");
        this.zzc = provider;
    }

    public static zzsq zza(zzso zzsoVar) {
        Provider zza2 = zznh.zza();
        if (zza2 == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", zza2);
        return new zzsx(zzsoVar.zzd().zza(zzbf.zza()), zza2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Mac mac = Mac.getInstance("AESCMAC", this.zzc);
            mac.init(this.zzb);
            byte[] doFinal = mac.doFinal(bArr);
            return i10 == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
    }
}
