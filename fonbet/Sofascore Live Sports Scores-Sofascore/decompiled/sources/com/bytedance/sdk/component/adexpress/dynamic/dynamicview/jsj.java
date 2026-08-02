package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jsj extends qf implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private boolean lo;
    private boolean pcc;
    private boolean sf;

    public jsj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(kjVar.ork().sf())) {
            dynamicRootView.setTimedown(this.kj);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.jr).getText())) {
            setMeasuredDimension(0, this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 || this.lo) {
            ((TextView) this.jr).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z && this.gbb.getRenderRequest().pcc() && com.bytedance.sdk.component.adexpress.oo.wh.sf(this.gbb.getRenderRequest().oo())) {
            boolean sf = com.bytedance.sdk.component.adexpress.oo.sf();
            View view = this.jr;
            if (sf) {
                ((TextView) view).setText(i + "s");
            } else {
                ((TextView) view).setText(String.format(com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip"), Integer.valueOf(i)));
            }
            this.pcc = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.oo.sf() && !"open_ad".equals(this.gbb.getRenderRequest().oo()) && this.gbb.getRenderRequest().pcc()) {
            this.lo = true;
            setVisibility(8);
            return;
        }
        boolean equals = "timedown".equals(this.hc.ork().sf());
        View view2 = this.jr;
        if (equals) {
            ((TextView) view2).setText(charSequence);
            return;
        }
        ((TextView) view2).setText(((Object) charSequence) + "s");
        this.sf = true;
        if (this.pcc) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.oo() + this.tmg.gm()) + com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf(((TextView) this.jr).getText() != null ? r5.toString() : "", this.tmg.vj(), true)[0]), this.kj);
            layoutParams.gravity = 8388629;
            this.jr.setLayoutParams(layoutParams);
            this.pcc = false;
            requestLayout();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qf, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (com.bytedance.sdk.component.adexpress.oo.wh.sf(this.gbb.getRenderRequest().oo())) {
            setVisibility(8);
        }
        boolean equals = "timedown".equals(this.hc.ork().sf());
        View view = this.jr;
        if (equals) {
            ((TextView) view).setText(String.valueOf((int) Double.parseDouble(this.tmg.ork())));
            return true;
        }
        ((TextView) view).setText(((int) Double.parseDouble(this.tmg.ork())) + "s");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.hc.ork().sf()) && !TextUtils.equals("skip-with-time-countdown", this.hc.ork().sf())) {
            super.wh();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            layoutParams.leftMargin = this.vy;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
