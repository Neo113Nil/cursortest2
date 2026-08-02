package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tz extends wh implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private int lo;
    private int pcc;
    private int sf;

    public tz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        pcc();
    }

    private void pcc() {
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh = this.hc.vh();
        if (vh == null || vh.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar : vh) {
            if (kjVar.ork().pcc() == 21) {
                this.pcc = (int) (this.qf - com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, kjVar.kj()));
            }
            if (kjVar.ork().pcc() == 20) {
                this.sf = (int) (this.qf - com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, kjVar.kj()));
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.lo == 0) {
            setMeasuredDimension(this.sf, this.kj);
        } else {
            setMeasuredDimension(this.pcc, this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.gm()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.sf()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.oo()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.pcc()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = this.vy;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = this.ork;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.lo = i;
    }
}
