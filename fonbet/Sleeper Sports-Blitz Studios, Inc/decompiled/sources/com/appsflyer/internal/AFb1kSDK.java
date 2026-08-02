package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFb1kSDK {
    public static String getMonetizationNetwork(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return getRevenue(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e);
            return null;
        }
    }

    private static String getRevenue(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static byte[] getRevenue(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e);
            return null;
        }
    }

    public static String getCurrencyIso4217Code(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return getRevenue(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static boolean getMediationNetwork(Map<String, Object> map, String[] strArr, AFd1rSDK aFd1rSDK) throws IllegalStateException {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String component2 = AFd1rSDK.component2();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(component2);
        return getCurrencyIso4217Code(sb.toString(), AFb1mSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork, aFd1rSDK.getRevenue)).equals(str2);
    }
}
