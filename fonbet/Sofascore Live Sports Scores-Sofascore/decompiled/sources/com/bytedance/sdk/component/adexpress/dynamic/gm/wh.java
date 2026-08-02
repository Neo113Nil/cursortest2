package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.fum;
import com.bytedance.sdk.component.adexpress.wh.lu;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends nac<com.bytedance.sdk.component.adexpress.wh.wh> {
    public wh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, vjVar, qfVar);
        this.sf = context;
        this.oo = qfVar;
        this.gm = vjVar;
        pcc(i, i2, i3, jSONObject, qfVar);
    }

    private void pcc(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.wh(this.sf, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, 300.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, qfVar.hpk() > 0 ? qfVar.hpk() : com.bytedance.sdk.component.adexpress.oo.sf() ? 0 : 120);
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setClipChildren(false);
        this.pcc.setSlideText(this.oo.erj());
        fum fumVar = this.pcc;
        if (fumVar instanceof com.bytedance.sdk.component.adexpress.wh.wh) {
            ((com.bytedance.sdk.component.adexpress.wh.wh) fumVar).setShakeText(this.oo.ptr());
            final com.bytedance.sdk.component.adexpress.wh.gpj shakeView = ((com.bytedance.sdk.component.adexpress.wh.wh) this.pcc).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new lu.pcc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.wh.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.gm.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac
    public void oo() {
    }
}
