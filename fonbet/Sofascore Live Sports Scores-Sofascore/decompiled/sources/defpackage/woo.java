package defpackage;

import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhly;
import com.google.android.gms.internal.ads.zzhma;
import com.google.android.gms.internal.ads.zzhpd;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzice;
import com.google.android.gms.internal.ads.zzicf;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class woo implements zzhfo {
    public final RSAPublicKey a;
    public final zzibq b;
    public final zzibq c;
    public final int d;
    public final byte[] e;
    public final byte[] f;

    public /* synthetic */ woo(RSAPublicKey rSAPublicKey, zzibq zzibqVar, zzibq zzibqVar2, int i, byte[] bArr, byte[] bArr2) {
        if (zzhly.a()) {
            zzl.x("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        zzicf.b(zzibqVar);
        if (!zzibqVar.equals(zzibqVar2)) {
            zzl.x("sigHash and mgf1Hash must be the same");
            throw null;
        }
        zzicf.c(rSAPublicKey.getModulus().bitLength());
        zzicf.d(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = zzibqVar;
        this.c = zzibqVar2;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            zzl.x("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            zzl.x("signature out of range");
            return;
        }
        byte[] b = zzhma.b(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        zzibq zzibqVar = this.b;
        zzicf.b(zzibqVar);
        zzibh zzibhVar = zzibh.e;
        MessageDigest messageDigest = (MessageDigest) zzibhVar.a.zza(zzice.a(zzibqVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = b.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            zzl.x("inconsistent");
            return;
        }
        if (b[length - 1] != -68) {
            zzl.x("inconsistent");
            return;
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] copyOf = Arrays.copyOf(b, i3);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(b, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            long j = (length * 8) - bitLength3;
            if (i4 < j) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    zzl.x("inconsistent");
                    return;
                }
                i4++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzibhVar.a.zza(zzice.a(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 <= (i2 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    messageDigest2.update(zzhma.b(BigInteger.valueOf(i5), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i6, Math.min(length3, i3 - i6));
                    i6 += length3;
                    i5++;
                    messageDigest2 = messageDigest2;
                }
                byte[] bArr5 = new byte[i3];
                for (int i7 = 0; i7 < i3; i7++) {
                    bArr5[i7] = (byte) (bArr4[i7] ^ copyOf[i7]);
                }
                for (int i8 = 0; i8 <= j; i8++) {
                    int i9 = i8 / 8;
                    bArr5[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr5[i9]);
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr5[i11] != 1) {
                            zzl.x("inconsistent");
                            return;
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i3 - i, i3);
                        int i12 = digestLength + 8;
                        byte[] bArr6 = new byte[i + i12];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i12, copyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            return;
                        }
                        zzl.x("inconsistent");
                        return;
                    }
                    if (bArr5[i10] != 0) {
                        zzl.x("inconsistent");
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.e;
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
