package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zziad implements zzhdw {
    private final RSAPublicKey zza;
    private final zzhzv zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    /* synthetic */ zziad(RSAPublicKey rSAPublicKey, zzhzv zzhzvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhki.zza()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        zziak.zzb(zzhzvVar);
        zziak.zzc(rSAPublicKey.getModulus().bitLength());
        zziak.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhzvVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza;
        int i;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] zzb = zzhkk.zzb(bigInteger.modPow(publicExponent, modulus), bitLength);
        zzhzv zzhzvVar = this.zzb;
        zziak.zzb(zzhzvVar);
        MessageDigest messageDigest = (MessageDigest) zzhzm.zzd.zzb(zziaj.zzb(zzhzvVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = zzhzvVar.ordinal();
        int i2 = 2;
        if (ordinal == 2) {
            zza = zzhzw.zza("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            zza = zzhzw.zza("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzhzvVar.toString()));
            }
            zza = zzhzw.zza("3051300d060960864801650304020305000440");
        }
        if (bitLength < zza.length + digest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (bitLength - r5) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = zza.length;
        System.arraycopy(zza, 0, bArr4, i, length);
        System.arraycopy(digest, 0, bArr4, i + length, digest.length);
        if (!MessageDigest.isEqual(zzb, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhnq.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
