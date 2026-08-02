package com.bytedance.sdk.openadsdk.api.init;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class PAGBidError {
    private int pcc;
    private String sf;

    public PAGBidError(int i, String str) {
        this.pcc = i;
        this.sf = str;
    }

    public int getCode() {
        return this.pcc;
    }

    public String getMessage() {
        return this.sf;
    }
}
