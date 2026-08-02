package com.bytedance.sdk.openadsdk.of;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum oo {
    UTF8(26, C.UTF8_NAME);

    private final int[] oo;
    private final String[] vj;
    private static final Map<Integer, oo> sf = new HashMap();
    private static final Map<String, oo> gm = new HashMap();

    static {
        for (oo ooVar : values()) {
            if (Charset.isSupported(ooVar.name())) {
                for (int i : ooVar.oo) {
                    sf.put(Integer.valueOf(i), ooVar);
                }
                gm.put(ooVar.name(), ooVar);
                for (String str : ooVar.vj) {
                    gm.put(str, ooVar);
                }
            }
        }
    }

    oo(int i, String... strArr) {
        this.oo = new int[]{i};
        this.vj = strArr;
    }

    public static oo pcc(Charset charset) {
        return gm.get(charset.name());
    }

    public int pcc() {
        return this.oo[0];
    }
}
