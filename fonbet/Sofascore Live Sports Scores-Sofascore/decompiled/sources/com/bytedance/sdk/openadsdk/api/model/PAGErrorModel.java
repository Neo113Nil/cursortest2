package com.bytedance.sdk.openadsdk.api.model;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGErrorModel {
    private final int pcc;
    private final String sf;

    public PAGErrorModel(int i, String str) {
        this.pcc = i;
        this.sf = str;
    }

    public int getErrorCode() {
        return this.pcc;
    }

    public String getErrorMessage() {
        return this.sf;
    }
}
