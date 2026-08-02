package com.bytedance.sdk.component.sf.pcc;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vy {
    private String pcc;
    private String sf;

    private vy(String str) {
        this.pcc = str;
    }

    public Charset pcc(Charset charset) {
        try {
            String str = this.sf;
            if (str != null) {
                return Charset.forName(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return charset;
    }

    public String pcc() {
        return this.pcc;
    }

    public static vy pcc(String str) {
        return new vy(str);
    }
}
