package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface pia {
    public static final Charset a = Charset.forName(C.UTF8_NAME);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
