package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.fum;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends nac<com.bytedance.sdk.component.adexpress.wh.qf> {
    public vj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        super(context, vjVar, qfVar);
        pcc(qfVar);
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.kj(this.sf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.pcc.setLayoutParams(layoutParams);
        fum fumVar = this.pcc;
        if (fumVar instanceof com.bytedance.sdk.component.adexpress.wh.kj) {
            ((com.bytedance.sdk.component.adexpress.wh.kj) fumVar).setButtonText(this.oo.erj());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac, com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac
    public void oo() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac, com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }
}
