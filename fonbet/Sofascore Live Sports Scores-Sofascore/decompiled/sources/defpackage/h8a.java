package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.BitSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class h8a {
    public static final Charset a = Charset.forName(C.ASCII_NAME);
    public static final o21 b = qic.e;

    public static nic a(String str, g8a g8aVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = mic.d;
        return new nic(str, z, g8aVar);
    }
}
