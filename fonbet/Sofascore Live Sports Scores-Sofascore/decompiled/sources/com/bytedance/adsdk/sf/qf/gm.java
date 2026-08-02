package com.bytedance.adsdk.sf.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private float pcc;
    private float sf;

    public gm(float f, float f2) {
        this.pcc = f;
        this.sf = f2;
    }

    public void pcc(float f, float f2) {
        this.pcc = f;
        this.sf = f2;
    }

    public boolean sf(float f, float f2) {
        return this.pcc == f && this.sf == f2;
    }

    public String toString() {
        return pcc() + "x" + sf();
    }

    public float pcc() {
        return this.pcc;
    }

    public gm() {
        this(1.0f, 1.0f);
    }

    public float sf() {
        return this.sf;
    }
}
