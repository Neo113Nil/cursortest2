package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends wh {
    public qf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.pcc pccVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.pcc(context);
        this.jr = pccVar;
        pccVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.oo.sf() || !"fillButton".equals(this.hc.ork().sf())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.jr).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.jr).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.tmg.lu() * 2;
        widgetLayoutParams.height -= this.tmg.lu() * 2;
        widgetLayoutParams.topMargin = this.tmg.lu() + widgetLayoutParams.topMargin;
        int lu = this.tmg.lu() + widgetLayoutParams.leftMargin;
        widgetLayoutParams.leftMargin = lu;
        widgetLayoutParams.setMarginStart(lu);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (TextUtils.equals("download-progress-button", this.hc.ork().sf()) && TextUtils.isEmpty(this.tmg.ork())) {
            this.jr.setVisibility(4);
            return true;
        }
        this.jr.setTextAlignment(this.tmg.kj());
        ((TextView) this.jr).setText(this.tmg.ork());
        ((TextView) this.jr).setTextColor(this.tmg.qf());
        ((TextView) this.jr).setTextSize(this.tmg.vj());
        ((TextView) this.jr).setGravity(17);
        ((TextView) this.jr).setIncludeFontPadding(false);
        boolean equals = "fillButton".equals(this.hc.ork().sf());
        View view = this.jr;
        if (equals) {
            view.setPadding(0, 0, 0, 0);
        } else {
            view.setPadding(this.tmg.gm(), this.tmg.sf(), this.tmg.oo(), this.tmg.pcc());
        }
        return true;
    }
}
