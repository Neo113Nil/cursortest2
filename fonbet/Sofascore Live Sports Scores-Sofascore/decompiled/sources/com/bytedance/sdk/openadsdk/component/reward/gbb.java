package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.AdSlot;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb implements Runnable {
    boolean pcc;
    AdSlot sf;

    public gbb(boolean z, AdSlot adSlot) {
        this.pcc = z;
        this.sf = adSlot;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.pcc) {
            if (com.bytedance.sdk.openadsdk.utils.sf.oo()) {
                lu.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.sf);
                return;
            } else {
                nac.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.sf);
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.utils.sf.oo()) {
            qf.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.sf);
        } else {
            wh.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.sf);
        }
    }
}
