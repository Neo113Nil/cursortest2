package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1mSDK {
    private static String AFInAppEventType(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            sb2.append(Integer.toString((b11 & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    public static byte[] AFKeystoreWrapper(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e11) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e11);
            return null;
        }
    }

    public static String valueOf(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFInAppEventType(messageDigest.digest());
        } catch (Exception e11) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e11);
            return null;
        }
    }

    public static String AFInAppEventType(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFInAppEventType(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11, true);
            return e11.getMessage();
        }
    }

    public static boolean AFInAppEventType(Map<String, Object> map, String[] strArr, AFd1sSDK aFd1sSDK) throws IllegalStateException {
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
        String e11 = AFd1sSDK.e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append(e11);
        return AFInAppEventType(sb2.toString(), AFb1kSDK.AFInAppEventType(aFd1sSDK.AFInAppEventParameterName, aFd1sSDK.AFKeystoreWrapper)).equals(str2);
    }
}
