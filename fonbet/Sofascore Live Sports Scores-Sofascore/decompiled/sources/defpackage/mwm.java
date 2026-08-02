package defpackage;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class mwm {
    public static final MessageDigest a;
    public static final char[] b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        a = messageDigest;
        b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String a(String str) {
        byte[] digest;
        MessageDigest messageDigest = a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName(C.UTF8_NAME));
        synchronized (mwm.class) {
            digest = messageDigest.digest(bytes);
        }
        if (digest == null || digest.length == 0) {
            return null;
        }
        char[] cArr = new char[digest.length << 1];
        int i = 0;
        for (byte b2 : digest) {
            int i2 = i + 1;
            char[] cArr2 = b;
            cArr[i] = cArr2[(b2 & 240) >> 4];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
