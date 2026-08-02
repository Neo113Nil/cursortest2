package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class lo implements TTClientBidding {
    private final ork pcc;

    public lo(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        this.pcc = new ork(context, pccVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.pcc.loss(d, str, str2);
    }

    public ork pcc() {
        return this.pcc;
    }

    public void sf() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.pcc.win(d);
    }
}
