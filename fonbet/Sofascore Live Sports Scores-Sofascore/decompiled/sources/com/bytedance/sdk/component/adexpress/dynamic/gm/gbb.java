package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb implements qf<com.bytedance.sdk.component.adexpress.wh.jr> {
    private com.bytedance.sdk.component.adexpress.wh.jr pcc;

    public gbb(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.jr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 20.0f);
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setGuideText(qfVar.erj());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.wh.jr gm() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.sf();
    }
}
