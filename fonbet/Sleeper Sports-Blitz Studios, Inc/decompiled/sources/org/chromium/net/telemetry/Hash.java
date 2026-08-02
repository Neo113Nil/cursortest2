package org.chromium.net.telemetry;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes10.dex */
public final class Hash {
    private static final String TAG = "CronetLoggerImpl";
    private static final MessageDigest MD5_MESSAGE_DIGEST = getMd5MessageDigest();

    private static MessageDigest getMd5MessageDigest() {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException e) {
            String str = TAG;
            if (!Log.isLoggable(str, 3)) {
                return null;
            }
            Log.d(str, "Error while instantiating messageDigest", e);
            return null;
        }
    }

    public static long hash(byte[] bytes) {
        MessageDigest messageDigest = MD5_MESSAGE_DIGEST;
        if (messageDigest == null || bytes == null || bytes.length == 0) {
            return 0L;
        }
        return ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
    }

    public static long hash(String string) {
        if (MD5_MESSAGE_DIGEST == null || string == null || string.isEmpty()) {
            return 0L;
        }
        return hash(string.getBytes(StandardCharsets.UTF_8));
    }
}
