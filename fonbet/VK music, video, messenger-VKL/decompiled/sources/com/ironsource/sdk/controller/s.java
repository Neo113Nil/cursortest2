package com.ironsource.sdk.controller;

import com.ironsource.C4452n4;
import com.ironsource.Ib;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: classes13.dex */
final class s {
    private static final String b = "MD5";
    private String a;

    public s(String str) {
        this.a = str;
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    private String a(String str) {
        try {
            return Ib.a(str);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public String b() {
        return this.a;
    }

    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
