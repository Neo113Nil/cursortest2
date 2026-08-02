package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.a70;
import defpackage.hbo;
import defpackage.vp2;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڗ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0506 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final byte[] f1696;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final byte[] f1697;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final SecureRandom f1703 = new SecureRandom();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1702 = StringFog.decrypt("Q9Y=\n", "BpXMM9P0QGs=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1701 = StringFog.decrypt("7AT08Q==\n", "qUewuZvsNXo=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1700 = StringFog.decrypt("B/Oj0njZJAF6qA==\n", "T57CsSuRZTM=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1699 = StringFog.decrypt("iFaN34gsQPKHfI6Rqwtks64=\n", "yRPe8M9vDd0=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1698 = StringFog.decrypt("alZHCwCLAzMo\n", "GTMkezK+NUE=\n");

    static {
        String decrypt = StringFog.decrypt("Q+hNFJOBX/1X7EgB\n", "FqkJRb73btA=\n");
        Charset charset = StandardCharsets.US_ASCII;
        f1697 = decrypt.getBytes(charset);
        f1696 = StringFog.decrypt("tCUGbQq6iqSzIRFs\n", "4WRCPCfMu4k=\n").getBytes(charset);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0494 m334(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != 32) {
            hbo.l(bArr.length, StringFog.decrypt("vhVh5oxCBCaSJUGyx0UYJsxiEqSeUxh103BVqZMH\n", "/1AyxucnfQY=\n"));
            return null;
        }
        if (bArr2.length != 12) {
            hbo.l(bArr2.length, StringFog.decrypt("/QgYze9yO7zfaziY8ml1vd9rZN+hfyyr3zh5zeZyIf8=\n", "uktV7YEdVd8=\n"));
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(f1699);
            cipher.init(1, new SecretKeySpec(bArr, StringFog.decrypt("7w0d\n", "rkhORiK9Vak=\n")), new GCMParameterSpec(128, bArr2));
            cipher.updateAAD(bArr4);
            return new C0494(cipher.doFinal(bArr3));
        } catch (GeneralSecurityException e) {
            vp2.e(StringFog.decrypt("ukrU5BZCn12eYeS7KHGmFJRhp68waL4Ynw==\n", "+w+HyVEB0n0=\n"), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m336(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            hbo.l(bArr.length, StringFog.decrypt("DlHbYUmhEPU1Rss3RaAGoX5B1zcb51W3J1fXZAT1EroqAw==\n", "XiOyFyjVddU=\n"));
            return null;
        }
        if (bArr2.length != 65) {
            hbo.l(bArr2.length, StringFog.decrypt("IFEEn9WPaRMVXUaeyZ89WBJBRsWJzCsBBEEV05SZJxsfSRaB2Z86HRQNStPbgz1Y\n", "cCRm87zsSXg=\n"));
            return null;
        }
        if (bArr2[0] != 4) {
            a70.p(StringFog.decrypt("WpvVZzUvWrdvl5dmKT8O/Hma1nkobA21foaXOyR8Tg==\n", "Cu63C1xMetw=\n"));
            return null;
        }
        try {
            String str = f1702;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str);
            keyPairGenerator.initialize(new ECGenParameterSpec(f1698));
            ECParameterSpec params = ((ECPublicKey) keyPairGenerator.generateKeyPair().getPublic()).getParams();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) KeyFactory.getInstance(str).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), params));
            ECPublicKey m332 = m332(bArr2, params);
            KeyAgreement keyAgreement = KeyAgreement.getInstance(f1701);
            keyAgreement.init(eCPrivateKey);
            keyAgreement.doPhase(m332, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            if (generateSecret.length == 32) {
                return generateSecret;
            }
            if (generateSecret.length >= 32) {
                return (generateSecret.length == 65 && generateSecret[0] == 4) ? Arrays.copyOfRange(generateSecret, 1, 33) : Arrays.copyOfRange(generateSecret, generateSecret.length - 32, generateSecret.length);
            }
            byte[] bArr3 = new byte[32];
            System.arraycopy(generateSecret, 0, bArr3, 32 - generateSecret.length, generateSecret.length);
            return bArr3;
        } catch (GeneralSecurityException e) {
            vp2.e(StringFog.decrypt("Z0NDjjXrWhsCYWC0cOVSB0x0J6B06VMHRg==\n", "IgAHxhWAP2I=\n"), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0486 m335() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f1702);
            keyPairGenerator.initialize(new ECGenParameterSpec(f1698), this.f1703);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
            byte[] m333 = m333(eCPrivateKey.getS());
            ECPoint w = eCPublicKey.getW();
            byte[] m3332 = m333(w.getAffineX());
            byte[] m3333 = m333(w.getAffineY());
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            System.arraycopy(m3332, 0, bArr, 1, 32);
            System.arraycopy(m3333, 0, bArr, 33, 32);
            return new C0486(m333, bArr);
        } catch (GeneralSecurityException e) {
            vp2.e(StringFog.decrypt("bVW9HwpaPnlEFLMWAVtsbF9R9BYfVntgTka1H09Ve3QLRLUaHQ==\n", "KzTUc28+Hg0=\n"), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m338(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            if (bArr2.length == 12) {
                if (bArr3.length >= 16) {
                    try {
                        Cipher cipher = Cipher.getInstance(f1699);
                        cipher.init(2, new SecretKeySpec(bArr, StringFog.decrypt("bSYK\n", "LGNZOxS3n7k=\n")), new GCMParameterSpec(128, bArr2));
                        cipher.updateAAD(bArr4);
                        return cipher.doFinal(bArr3);
                    } catch (GeneralSecurityException e) {
                        vp2.e(StringFog.decrypt("cwKg1FaxaMlWIpCLaIJRgF0p059wm0mMVg==\n", "Mkfz+RHyJek=\n"), e);
                        return null;
                    }
                }
                a70.p(StringFog.decrypt("U2Ccjif9wdRofcyRK/vdkWRoi8Yv+sbFMGuJxiP7ld11aJ+SYr6DkXJwmIMx\n", "EAns5kKPtbE=\n"));
                return null;
            }
            hbo.l(bArr2.length, StringFog.decrypt("+YThIUSLEn/b58F0WZBcftvnnTMKhgVo27SAIU2LCDw=\n", "vsesASrkfBw=\n"));
            return null;
        }
        hbo.l(bArr.length, StringFog.decrypt("Pighh/4yi+wSGAHTtTWX7ExfUsXsI5e/U00VyOF3\n", "f21yp5VX8sw=\n"));
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m337(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            String str = f1700;
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(bArr2, str));
            byte[] doFinal = mac.doFinal(bArr);
            byte[] bArr4 = new byte[bArr3.length + 1];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[bArr3.length] = 1;
            Mac mac2 = Mac.getInstance(str);
            mac2.init(new SecretKeySpec(doFinal, str));
            return mac2.doFinal(bArr4);
        } catch (GeneralSecurityException e) {
            vp2.e(StringFog.decrypt("4iM8civAGGGKDB1GYt0cbMMHFhRtyhR0zww=\n", "qmh4NAurfRg=\n"), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ECPublicKey m332(byte[] bArr, ECParameterSpec eCParameterSpec) {
        if (bArr.length == 65 && bArr[0] == 4) {
            return (ECPublicKey) KeyFactory.getInstance(f1702).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, 33)), new BigInteger(1, Arrays.copyOfRange(bArr, 33, 65))), eCParameterSpec));
        }
        a70.p(StringFog.decrypt("vMsU3P/le3KAywHS/vxtN4bWB9mzyVxyhcoL0+c=\n", "9aVivZOMH1I=\n"));
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m333(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 32) {
            return byteArray;
        }
        if (byteArray.length > 32) {
            return Arrays.copyOfRange(byteArray, byteArray.length - 32, byteArray.length);
        }
        byte[] bArr = new byte[32];
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        return bArr;
    }
}
