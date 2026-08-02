package r3;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import o3.C5796a;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6202b {

    /* renamed from: a, reason: collision with root package name */
    public static String f63928a = "RSA";

    /* renamed from: b, reason: collision with root package name */
    public static String f63929b = "RSA/ECB/PKCS1Padding";

    public static String a(String str) {
        return new String(Base64.encode(b(str, c("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBANIsL+RHqfkBiKGn/D1y1QnNrMkKzxWP2wkeSokw2OJrCI+d6YGJPrHHx+nmb/Qn885/R01Gw6d7M824qofmCvkCAwEAAQ==")), 2));
    }

    public static byte[] b(String str, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(f63929b);
            cipher.init(1, publicKey);
            return cipher.doFinal(str.getBytes());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static PublicKey c(String str) {
        try {
            return KeyFactory.getInstance(f63928a).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            throw new C5796a("Invalid public key: " + e10.getMessage());
        }
    }
}
