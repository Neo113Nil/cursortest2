package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum extends qf implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private int lo;
    private int[] pcc;
    private int sf;

    public fum(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.jr).getText())) {
            setMeasuredDimension(0, this.kj);
        } else {
            setMeasuredDimension(this.qf, this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        String pcc = com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.jr.setVisibility(0);
            ((TextView) this.jr).setText("| ".concat(String.valueOf(pcc)));
            this.jr.measure(-2, -2);
            this.pcc = new int[]{this.jr.getMeasuredWidth() + 1, this.jr.getMeasuredHeight()};
            View view = this.jr;
            int[] iArr = this.pcc;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.jr).setGravity(17);
            ((TextView) this.jr).setIncludeFontPadding(false);
            pcc();
            this.jr.setPadding(this.tmg.gm(), this.sf, this.tmg.oo(), this.lo);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qf, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        ((TextView) this.jr).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    private void pcc() {
        int pcc = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.vj());
        this.sf = ((this.kj - pcc) / 2) - this.tmg.pcc();
        this.lo = 0;
    }
}
