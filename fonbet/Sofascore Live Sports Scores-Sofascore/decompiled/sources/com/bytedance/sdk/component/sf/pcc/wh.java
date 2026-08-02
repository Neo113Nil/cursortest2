package com.bytedance.sdk.component.sf.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wh {
    private final String[] pcc;

    public wh(String[] strArr) {
        this.pcc = strArr;
    }

    public String pcc(int i) {
        return this.pcc[i * 2];
    }

    public String sf(int i) {
        return this.pcc[(i * 2) + 1];
    }

    public int pcc() {
        return this.pcc.length / 2;
    }
}
