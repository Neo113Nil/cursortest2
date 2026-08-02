package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1xSDK {
    public static boolean AFLogger(Map<String, Object> map, String[] strArr, AFc1hSDK aFc1hSDK) throws IllegalStateException {
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
        String AFLogger = AFc1hSDK.AFLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(AFLogger);
        return d(sb.toString(), AFb1mSDK.unregisterClient(aFc1hSDK.AFKeystoreWrapper)).equals(str2);
    }

    public static String d(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return d(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.ROOT);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, e.getMessage() != null ? e.getMessage() : "Error computing HMAC SHA-256", e);
            return e.getMessage();
        }
    }

    public static long unregisterClient(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(bArr);
        allocate.flip();
        return allocate.getLong();
    }

    @Nullable
    public static byte[] d(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Error turning string to SHA-256 byte array", e);
            return null;
        }
    }

    private static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + NotificationCompat.FLAG_LOCAL_ONLY, 16).substring(1));
        }
        return sb.toString();
    }

    public static String AFLogger(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return d(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Error turning data to SHA-256 string", e);
            return null;
        }
    }
}
