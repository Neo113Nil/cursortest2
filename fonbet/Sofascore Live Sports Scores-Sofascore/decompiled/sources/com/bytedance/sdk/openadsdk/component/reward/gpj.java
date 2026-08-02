package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class gpj implements TTClientBidding {
    private final kj pcc;

    public gpj(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.pcc = new kj(context, pccVar);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.pcc.loss(d, str, str2);
    }

    public kj pcc() {
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
