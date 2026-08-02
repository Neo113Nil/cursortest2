package com.bytedance.adsdk.sf.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private final String gm;
    public final float pcc;
    public final float sf;

    public wh(String str, float f, float f2) {
        this.gm = str;
        this.sf = f2;
        this.pcc = f;
    }

    public boolean pcc(String str) {
        if (this.gm.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.gm.endsWith("\r")) {
            String str2 = this.gm;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
