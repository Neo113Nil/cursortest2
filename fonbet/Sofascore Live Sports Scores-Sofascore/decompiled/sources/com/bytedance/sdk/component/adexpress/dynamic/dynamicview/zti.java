package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.ljg;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class zti extends wh implements com.bytedance.sdk.component.adexpress.dynamic.vj {
    boolean lo;
    TextView pcc;
    FrameLayout sf;

    public zti(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.lo = false;
        View view = new View(context);
        this.jr = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.pcc = new TextView(context);
        this.sf = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.pcc.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.pcc.setBackground(gradientDrawable);
        this.pcc.setTextSize(10.0f);
        this.pcc.setGravity(17);
        this.pcc.setTextColor(-1);
        this.pcc.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            addView(this.sf, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.pcc);
        addView(this.jr, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
            addView(this.sf, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.sf;
        dynamicRootView.setVideoListener(this);
    }

    private void gm(View view) {
        if (view == this.pcc || view == ((wh) this).gpj) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.wh)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            gm(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vj
    public void pcc() {
        this.pcc.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vj
    public void setTimeUpdate(int i) {
        if (!this.hc.ork().vj().zpi() || i <= 0 || this.lo) {
            this.lo = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                gm(getChildAt(i2));
            }
            this.pcc.setVisibility(8);
            return;
        }
        String concat = (i >= 60 ? "0" + (i / 60) : "00").concat(":");
        int i3 = i % 60;
        this.pcc.setText(i3 > 9 ? ljg.j(i3, concat) : mz1.j(i3, concat, "0"));
        this.pcc.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public boolean vj() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        double d = 0.0d;
        double d2 = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = this.hc; kjVar != null; kjVar = kjVar.tmg()) {
            d2 = (d2 + kjVar.wh()) - kjVar.oo();
            d = (d + kjVar.qf()) - kjVar.vj();
        }
        try {
            float f = (float) d2;
            int pcc = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), f);
            int pcc2 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), f + this.vj);
            if (com.bytedance.sdk.component.adexpress.oo.sf.pcc(getContext())) {
                int dynamicWidth = ((lu) this.gbb.getChildAt(0)).getDynamicWidth();
                int i = dynamicWidth - pcc2;
                pcc2 = dynamicWidth - pcc;
                pcc = i;
            }
            boolean equals = "open_ad".equals(this.gbb.getRenderRequest().oo());
            DynamicRootView dynamicRootView = this.gbb;
            if (equals) {
                dynamicRootView.videoView = this.sf;
            } else {
                sf sfVar = ((lu) dynamicRootView.getChildAt(0)).pcc;
                float f2 = (float) d;
                sfVar.pcc(pcc, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), f2), pcc2, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), f2 + this.wh));
            }
        } catch (Exception unused) {
        }
        this.gbb.updateRenderInfoForVideo(d2, d, this.vj, this.wh, this.tmg.jr());
        return true;
    }
}
