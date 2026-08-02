package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class I9 {
    public static synchronized String a(String str, byte[] bArr) {
        synchronized (I9.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (bArr == null) {
                return "";
            }
            try {
                SecretKeySpec d = d(str);
                byte[] bArr2 = new byte[16];
                Arrays.fill(bArr2, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, d, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
    }

    public static synchronized String b(String str, String str2) {
        synchronized (I9.class) {
            byte[] c = c(str, str2);
            if (c == null) {
                return "";
            }
            return new String(c);
        }
    }

    public static synchronized byte[] c(String str, String str2) {
        synchronized (I9.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                SecretKeySpec d = d(str);
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                byte[] decode = Base64.decode(str2, 0);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, d, ivParameterSpec);
                return cipher.doFinal(decode);
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
                return null;
            }
        }
    }

    public static synchronized String d(String str, String str2) {
        synchronized (I9.class) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] c = c(str, str2);
                if (c != null) {
                    return Q9.a(c);
                }
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return "";
        }
    }

    public static synchronized String e(String str, String str2) {
        synchronized (I9.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                return a(str, str2.getBytes("UTF8"));
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
    }

    public static synchronized String b(String str) {
        String d;
        synchronized (I9.class) {
            d = d(C4123i5.b().c(), str);
        }
        return d;
    }

    private static SecretKeySpec d(String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length < 32 ? bytes.length : 32);
        return new SecretKeySpec(bArr, "AES");
    }

    public static synchronized String a(String str, String str2) {
        synchronized (I9.class) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] a = Q9.a(str2);
                if (a != null) {
                    return a(str, a);
                }
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return "";
        }
    }

    public static synchronized String c(String str) {
        String e;
        synchronized (I9.class) {
            e = e(C4123i5.b().c(), str);
        }
        return e;
    }

    public static synchronized String a(String str) {
        String a;
        synchronized (I9.class) {
            a = a(C4123i5.b().c(), str);
        }
        return a;
    }
}
