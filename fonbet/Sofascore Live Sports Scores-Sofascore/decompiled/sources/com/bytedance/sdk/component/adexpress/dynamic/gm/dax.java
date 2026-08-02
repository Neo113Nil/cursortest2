package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.lo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax implements qf {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj gm;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.qf oo;
    private lo pcc;
    private Context sf;

    public dax(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.sf = context;
        this.gm = vjVar;
        this.oo = qfVar;
        oo();
    }

    private void oo() {
        this.pcc = new lo(this.sf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, 120.0f));
        layoutParams.gravity = 17;
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setClipChildren(false);
        this.pcc.setGuideText(this.oo.erj());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar = this.gm;
        if (vjVar != null) {
            this.pcc.setOnClickListener((View.OnClickListener) vjVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public ViewGroup gm() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        lo loVar = this.pcc;
        if (loVar != null) {
            loVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        lo loVar = this.pcc;
        if (loVar != null) {
            loVar.sf();
        }
    }
}
