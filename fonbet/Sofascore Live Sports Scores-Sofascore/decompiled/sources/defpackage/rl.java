package defpackage;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class rl {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static String a(ol olVar, ql qlVar) {
        byte[] bArr = olVar.b;
        byte[] bArr2 = olVar.a;
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        SecretKeySpec secretKeySpec = qlVar.b;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] doFinal = mac.doFinal(bArr3);
        byte[] bArr4 = olVar.c;
        if (doFinal.length == bArr4.length) {
            int i = 0;
            for (int i2 = 0; i2 < doFinal.length; i2++) {
                i |= doFinal[i2] ^ bArr4[i2];
            }
            if (i == 0) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, qlVar.a, new IvParameterSpec(bArr));
                return new String(cipher.doFinal(bArr2), C.UTF8_NAME);
            }
        }
        zzl.x("MAC stored in civ does not match computed MAC.");
        return null;
    }

    public static ol b(String str, ql qlVar) {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        c();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, qlVar.a, new IvParameterSpec(bArr));
        byte[] iv = cipher.getIV();
        byte[] doFinal = cipher.doFinal(bytes);
        byte[] bArr2 = new byte[iv.length + doFinal.length];
        System.arraycopy(iv, 0, bArr2, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr2, iv.length, doFinal.length);
        SecretKeySpec secretKeySpec = qlVar.b;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return new ol(doFinal, iv, mac.doFinal(bArr2));
    }

    public static void c() {
        AtomicBoolean atomicBoolean = a;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (pl.class) {
            try {
                if (!atomicBoolean.get()) {
                    int i = pl.a;
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ql d(String str, byte[] bArr) {
        c();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 10000, 384)).getEncoded();
        byte[] bArr2 = new byte[16];
        System.arraycopy(encoded, 0, bArr2, 0, 16);
        byte[] bArr3 = new byte[32];
        System.arraycopy(encoded, 16, bArr3, 0, 32);
        return new ql(new SecretKeySpec(bArr2, "AES"), new SecretKeySpec(bArr3, "HmacSHA256"));
    }

    public static ql e(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            a70.p("Cannot parse aesKey:hmacKey");
            return null;
        }
        byte[] decode = Base64.decode(split[0], 2);
        if (decode.length != 16) {
            throw new InvalidKeyException("Base64 decoded key is not 128 bytes");
        }
        byte[] decode2 = Base64.decode(split[1], 2);
        if (decode2.length == 32) {
            return new ql(new SecretKeySpec(decode, 0, decode.length, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
        }
        throw new InvalidKeyException("Base64 decoded key is not 256 bytes");
    }
}
