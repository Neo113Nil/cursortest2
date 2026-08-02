package com.bytedance.sdk.openadsdk.api.reward;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class PAGRewardItem {
    private final int pcc;
    private final String sf;

    public PAGRewardItem(int i, String str) {
        this.pcc = i;
        this.sf = str;
    }

    public int getRewardAmount() {
        return this.pcc;
    }

    public String getRewardName() {
        return this.sf;
    }
}
