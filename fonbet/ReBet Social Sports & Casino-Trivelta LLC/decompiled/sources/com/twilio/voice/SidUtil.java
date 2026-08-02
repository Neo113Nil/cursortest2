package com.twilio.voice;

import java.security.MessageDigest;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
class SidUtil {
    private static final SecureRandom srand;

    static {
        SecureRandom secureRandom = new SecureRandom();
        srand = secureRandom;
        secureRandom.nextBytes(new byte[64]);
    }

    public static String generateGUID(String str, String str2) {
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        return str + generateGuidHash(str2);
    }

    private static String generateGuidHash(String str) {
        byte[] bArr = new byte[64];
        srand.nextBytes(bArr);
        return md5(str + new String(bArr) + System.currentTimeMillis());
    }

    private static final String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return sb2.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }
}
