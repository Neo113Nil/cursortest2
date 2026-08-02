package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class yt extends wh {
    private int pcc;

    public yt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.pcc = 0;
        com.bytedance.sdk.component.adexpress.wh.of ofVar = new com.bytedance.sdk.component.adexpress.wh.of(context, null);
        this.jr = ofVar;
        ofVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int pcc = (int) (com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.oo()) + this.tmg.gm()) + (com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.vj()) * 5.0f));
        if (this.qf > pcc && 4 == this.tmg.kj()) {
            this.pcc = (this.qf - pcc) / 2;
        }
        this.qf = pcc;
        return new FrameLayout.LayoutParams(this.qf, this.kj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        DynamicRootView dynamicRootView;
        super.vy();
        double hc = this.tmg.hc();
        if (com.bytedance.sdk.component.adexpress.oo.sf() && (hc < 0.0d || hc > 5.0d || ((dynamicRootView = this.gbb) != null && dynamicRootView.getRenderRequest() != null && this.gbb.getRenderRequest().ork() != 4))) {
            this.jr.setVisibility(8);
            return true;
        }
        double d = (hc < 0.0d || hc > 5.0d) ? 5.0d : hc;
        this.jr.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.wh.of) this.jr).pcc(d, this.tmg.qf(), (int) this.tmg.vj(), ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.sf())) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.pcc())) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.vj())));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
        layoutParams.topMargin = this.ork;
        int i = this.vy + this.pcc;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
