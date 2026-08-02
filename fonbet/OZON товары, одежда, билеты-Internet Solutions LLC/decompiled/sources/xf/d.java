package xf;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f105549a = C10769a.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private static final MessageDigest f105550b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e11) {
            String str = f105549a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Error while instantiating messageDigest", e11);
            }
            messageDigest = null;
        }
        f105550b = messageDigest;
    }

    public static long a(String str) {
        MessageDigest messageDigest = f105550b;
        if (messageDigest == null || str == null || str.isEmpty()) {
            return 0L;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (messageDigest == null || bytes == null || bytes.length == 0) {
            return 0L;
        }
        return ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
    }
}
