package defpackage;

import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhly;
import com.google.android.gms.internal.ads.zzhma;
import com.google.android.gms.internal.ads.zzhpd;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzibr;
import com.google.android.gms.internal.ads.zzice;
import com.google.android.gms.internal.ads.zzicf;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class too implements zzhfo {
    public final RSAPublicKey a;
    public final zzibq b;
    public final byte[] c;
    public final byte[] d;

    public /* synthetic */ too(RSAPublicKey rSAPublicKey, zzibq zzibqVar, byte[] bArr, byte[] bArr2) {
        if (zzhly.a()) {
            zzl.x("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
            throw null;
        }
        zzicf.b(zzibqVar);
        zzicf.c(rSAPublicKey.getModulus().bitLength());
        zzicf.d(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = zzibqVar;
        this.c = bArr;
        this.d = bArr2;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] a;
        int i;
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            zzl.x("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            zzl.x("signature out of range");
            return;
        }
        byte[] b = zzhma.b(bigInteger.modPow(publicExponent, modulus), bitLength);
        zzibq zzibqVar = this.b;
        zzicf.b(zzibqVar);
        MessageDigest messageDigest = (MessageDigest) zzibh.e.a.zza(zzice.a(zzibqVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = zzibqVar.ordinal();
        int i2 = 2;
        if (ordinal == 2) {
            a = zzibr.a("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            a = zzibr.a("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzibqVar.toString()));
            }
            a = zzibr.a("3051300d060960864801650304020305000440");
        }
        if (bitLength < a.length + digest.length + 11) {
            zzl.x("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (bitLength - r3) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = a.length;
        System.arraycopy(a, 0, bArr4, i, length);
        System.arraycopy(digest, 0, bArr4, i + length, digest.length);
        if (MessageDigest.isEqual(b, bArr4)) {
            return;
        }
        zzl.x("invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.c;
        int length = bArr3.length;
        if (length == 0) {
            a(bArr, bArr2);
        } else if (zzhpd.c(bArr3, bArr)) {
            a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            zzl.x("Invalid signature (output prefix mismatch)");
        }
    }
}
