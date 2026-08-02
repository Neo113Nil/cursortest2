package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class u7a {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName(C.ASCII_NAME);
        a = Charset.forName(C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zz2(bArr, 0, 0, false).i(0);
        } catch (maa e) {
            ilg.k(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
