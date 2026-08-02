package com.bytedance.adsdk.sf.wh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private float pcc;
    private int sf;

    public void pcc(float f) {
        float f2 = this.pcc + f;
        this.pcc = f2;
        int i = this.sf + 1;
        this.sf = i;
        if (i == Integer.MAX_VALUE) {
            this.pcc = f2 / 2.0f;
            this.sf = i / 2;
        }
    }
}
