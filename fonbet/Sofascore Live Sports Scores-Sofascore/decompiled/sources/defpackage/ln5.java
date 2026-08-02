package defpackage;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ln5 {
    public static final int[] a;

    static {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        a = iArr;
        Arrays.fill(iArr, 255);
        for (int i = 0; i < 32; i++) {
            a["ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".charAt(i) - '0'] = i;
        }
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str.replace("+", "%2B"), C.UTF8_NAME);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }
}
