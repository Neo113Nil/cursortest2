package com.bytedance.sdk.component.wh.pcc.oo.sf;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private int pcc;
    private int sf;

    public pcc(int i, int i2, long j) {
        if (i2 < i) {
            a70.r("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
            throw null;
        }
        this.pcc = i;
        this.sf = i2;
    }

    public static pcc gm() {
        return new pcc(1, 100, 172800000L);
    }

    public static pcc pcc(int i, int i2) {
        return new pcc(i, i2, 172800000L);
    }

    public int sf() {
        return this.sf;
    }

    public int pcc() {
        return this.pcc;
    }
}
