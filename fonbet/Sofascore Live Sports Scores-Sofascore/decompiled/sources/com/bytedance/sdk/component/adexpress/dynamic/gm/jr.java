package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.lu;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr implements qf<com.bytedance.sdk.component.adexpress.wh.lu> {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj gm;
    private int kj;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.qf oo;
    private com.bytedance.sdk.component.adexpress.wh.lu pcc;
    private int qf;
    private Context sf;
    private String vj;
    private JSONObject vy;
    private int wh;

    public jr(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.sf = context;
        this.gm = vjVar;
        this.oo = qfVar;
        this.vj = str;
        this.wh = i;
        this.qf = i2;
        this.kj = i3;
        this.vy = jSONObject;
        vj();
    }

    private void vj() {
        final com.bytedance.sdk.component.adexpress.dynamic.wh.pcc dynamicClickListener = this.gm.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.vj)) {
            Context context = this.sf;
            com.bytedance.sdk.component.adexpress.wh.lu luVar = new com.bytedance.sdk.component.adexpress.wh.lu(context, com.bytedance.sdk.component.adexpress.gm.pcc.kj(context), this.wh, this.qf, this.kj, this.vy);
            this.pcc = luVar;
            if (luVar.getShakeLayout() != null) {
                this.pcc.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.sf;
            this.pcc = new com.bytedance.sdk.component.adexpress.wh.lu(context2, com.bytedance.sdk.component.adexpress.gm.pcc.qf(context2), this.wh, this.qf, this.kj, this.vy);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.pcc.setGravity(17);
        layoutParams.gravity = 17;
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setTranslationY(com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, this.oo.gh()));
        this.pcc.setShakeText(this.oo.erj());
        this.pcc.setClipChildren(false);
        this.pcc.setOnShakeViewListener(new lu.pcc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.jr.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.wh.lu gm() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.clearAnimation();
    }
}
