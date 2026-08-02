package com.huawei.hms.hatool;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import xsna.c2f0;
import xsna.kjp;
import xsna.zq70;

/* loaded from: classes13.dex */
public class n {
    public static final Charset a = Charset.forName(C.UTF8_NAME);

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, i);
        return new Pair<>(zq70.y(substring), str.substring(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bytes = str.getBytes(a);
        byte[] y = zq70.y(str2);
        byte[] b = kjp.b(16);
        if (bytes == null) {
            c2f0.b("CBC", "encrypt 6 content is null");
            bArr = new byte[0];
        } else if (bytes.length == 0) {
            c2f0.b("CBC", "encrypt 6 content length is 0");
            bArr = new byte[0];
        } else if (y.length < 16) {
            c2f0.b("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArr = new byte[0];
        } else if (b.length < 16) {
            c2f0.b("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArr = new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(y, "AES");
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(1, secretKeySpec, new IvParameterSpec(b));
                bArr = cipher.doFinal(bytes);
            } catch (NullPointerException e) {
                c2f0.b("CBC", "NullPointerException: " + e.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            } catch (InvalidAlgorithmParameterException e2) {
                c2f0.b("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            } catch (InvalidKeyException e3) {
                c2f0.b("CBC", "InvalidKeyException: " + e3.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            } catch (NoSuchAlgorithmException e4) {
                c2f0.b("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            } catch (BadPaddingException e5) {
                c2f0.b("CBC", "BadPaddingException: " + e5.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            } catch (IllegalBlockSizeException e6) {
                c2f0.b("CBC", "IllegalBlockSizeException: " + e6.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            } catch (NoSuchPaddingException e7) {
                c2f0.b("CBC", "NoSuchPaddingException: " + e7.getMessage());
                bArr = new byte[0];
                if (Arrays.equals(bArr, new byte[0])) {
                }
                return zq70.l(bArr2);
            }
        }
        if (Arrays.equals(bArr, new byte[0])) {
            byte[] bArr3 = new byte[b.length + bArr.length];
            System.arraycopy(b, 0, bArr3, 0, b.length);
            System.arraycopy(bArr, 0, bArr3, b.length, bArr.length);
            bArr2 = bArr3;
        } else {
            c2f0.b("CBC", "encrypt encryptContent is null");
            bArr2 = new byte[0];
        }
        return zq70.l(bArr2);
    }

    public static String a(String str, String str2) {
        byte[] bArr;
        Pair<byte[], String> a2 = a(str, 32);
        byte[] y = zq70.y((String) a2.second);
        byte[] y2 = zq70.y(str2);
        byte[] bArr2 = (byte[]) a2.first;
        if (y.length == 0) {
            c2f0.b("CBC", "decrypt 6 content length is 0");
            bArr = new byte[0];
        } else if (y2.length < 16) {
            c2f0.b("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            bArr = new byte[0];
        } else if (bArr2 == null) {
            c2f0.b("CBC", "decrypt 6 iv is null");
            bArr = new byte[0];
        } else if (bArr2.length < 16) {
            c2f0.b("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArr = new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(y2, "AES");
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArr = cipher.doFinal(y);
            } catch (NullPointerException e) {
                c2f0.b("CBC", "NullPointerException: " + e.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (InvalidAlgorithmParameterException e2) {
                c2f0.b("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (InvalidKeyException e3) {
                c2f0.b("CBC", "InvalidKeyException: " + e3.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (NoSuchAlgorithmException e4) {
                c2f0.b("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (BadPaddingException e5) {
                c2f0.b("CBC", "BadPaddingException: " + e5.getMessage());
                c2f0.b("CBC", "key is not right");
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (IllegalBlockSizeException e6) {
                c2f0.b("CBC", "IllegalBlockSizeException: " + e6.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (NoSuchPaddingException e7) {
                c2f0.b("CBC", "NoSuchPaddingException: " + e7.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            }
        }
        return new String(bArr, a);
    }

    public static String a(byte[] bArr, String str) {
        byte[] bArr2;
        if (bArr == null || bArr.length == 0 || str == null) {
            v.b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] y = zq70.y(str);
        if (y.length < 16) {
            v.b("AesCipher", "key length is not right");
            return "";
        }
        byte[] b = kjp.b(12);
        if (bArr.length == 0) {
            c2f0.b("GCM", "encrypt 6 content length is 0");
            bArr2 = new byte[0];
        } else if (y.length < 16) {
            c2f0.b("GCM", "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArr2 = new byte[0];
        } else if (b.length < 12) {
            c2f0.b("GCM", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArr2 = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(y, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(128, b));
                bArr2 = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                c2f0.b("GCM", "GCM encrypt data error" + e.getMessage());
                bArr2 = new byte[0];
                byte[] bArr3 = new byte[b.length + bArr2.length];
                System.arraycopy(b, 0, bArr3, 0, b.length);
                System.arraycopy(bArr2, 0, bArr3, b.length, bArr2.length);
                return zq70.l(bArr3);
            } catch (GeneralSecurityException e2) {
                c2f0.b("GCM", "GCM encrypt data error" + e2.getMessage());
                bArr2 = new byte[0];
                byte[] bArr32 = new byte[b.length + bArr2.length];
                System.arraycopy(b, 0, bArr32, 0, b.length);
                System.arraycopy(bArr2, 0, bArr32, b.length, bArr2.length);
                return zq70.l(bArr32);
            }
        }
        byte[] bArr322 = new byte[b.length + bArr2.length];
        System.arraycopy(b, 0, bArr322, 0, b.length);
        System.arraycopy(bArr2, 0, bArr322, b.length, bArr2.length);
        return zq70.l(bArr322);
    }
}
