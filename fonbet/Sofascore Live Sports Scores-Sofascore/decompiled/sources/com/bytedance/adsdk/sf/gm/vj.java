package com.bytedance.adsdk.sf.gm;

import com.bytedance.adsdk.sf.gbb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static final vj pcc = new vj();
    private final gbb<String, com.bytedance.adsdk.sf.qf> sf = new gbb<>(20);

    public com.bytedance.adsdk.sf.qf pcc(String str) {
        if (str == null) {
            return null;
        }
        return this.sf.pcc((gbb<String, com.bytedance.adsdk.sf.qf>) str);
    }

    public static vj pcc() {
        return pcc;
    }

    public void pcc(String str, com.bytedance.adsdk.sf.qf qfVar) {
        if (str == null) {
            return;
        }
        this.sf.pcc(str, qfVar);
    }
}
