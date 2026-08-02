package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.is8;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Z9 {
    public static final int a = 1024;
    public static final String b = "RSA/ECB/PKCS1Padding";

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(a(str.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME), a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("exception on string encryption error: " + e.getMessage());
            return "";
        }
    }

    private static RSAPublicKey a(String str) throws NoSuchAlgorithmException, InvalidKeySpecException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("exception on encryption error: " + e.getMessage());
            is8.h(e);
            return null;
        }
    }

    public static KeyPair a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("exception on key generation error: " + e.getMessage());
            is8.h(e);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            is8.h(e);
            return null;
        }
    }
}
