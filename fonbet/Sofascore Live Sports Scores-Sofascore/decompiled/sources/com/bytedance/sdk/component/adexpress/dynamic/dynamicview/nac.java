package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac extends wh {
    private TextView fum;
    private TextView lo;
    private LinearLayout of;
    private TextView pcc;
    private TextView sf;
    private TextView tz;

    public nac(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.pcc = new TextView(this.vh);
        this.sf = new TextView(this.vh);
        this.lo = new TextView(this.vh);
        this.of = new LinearLayout(this.vh);
        this.fum = new TextView(this.vh);
        this.tz = new TextView(this.vh);
        this.pcc.setTag(9);
        this.sf.setTag(10);
        this.lo.setTag(12);
        this.of.addView(this.lo);
        this.of.addView(this.tz);
        this.of.addView(this.sf);
        this.of.addView(this.fum);
        this.of.addView(this.pcc);
        addView(this.of, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.qf, this.kj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public boolean oo() {
        this.pcc.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.pcc.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.sf.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.sf.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.lo.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.lo.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        this.lo.setText("Function");
        this.sf.setText("Permission list");
        this.fum.setText(" | ");
        this.tz.setText(" | ");
        this.pcc.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar = this.tmg;
        TextView textView = this.lo;
        if (qfVar != null) {
            textView.setTextColor(qfVar.qf());
            this.lo.setTextSize(this.tmg.vj());
            this.sf.setTextColor(this.tmg.qf());
            this.sf.setTextSize(this.tmg.vj());
            this.fum.setTextColor(this.tmg.qf());
            this.tz.setTextColor(this.tmg.qf());
            this.pcc.setTextColor(this.tmg.qf());
            this.pcc.setTextSize(this.tmg.vj());
            return false;
        }
        textView.setTextColor(-1);
        this.lo.setTextSize(12.0f);
        this.sf.setTextColor(-1);
        this.sf.setTextSize(12.0f);
        this.fum.setTextColor(-1);
        this.tz.setTextColor(-1);
        this.pcc.setTextColor(-1);
        this.pcc.setTextSize(12.0f);
        return false;
    }
}
