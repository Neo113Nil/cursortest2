package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc extends wh {
    public hc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        TextView textView = new TextView(context);
        this.jr = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
    }

    private boolean pcc() {
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.tmg.sf) && this.tmg.sf.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        com.bytedance.sdk.component.adexpress.sf.hc renderRequest;
        super.vy();
        this.jr.setTextAlignment(this.tmg.kj());
        ((TextView) this.jr).setTextColor(this.tmg.qf());
        ((TextView) this.jr).setTextSize(this.tmg.vj());
        if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
            if (!pcc()) {
                ((TextView) this.jr).setText(com.bytedance.sdk.component.utils.tz.sf(getContext(), "tt_logo_cn"));
                return true;
            }
            boolean sf = com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf();
            View view = this.jr;
            if (sf) {
                ((TextView) view).setText(com.bytedance.sdk.component.adexpress.dynamic.vj.vh.pcc());
                return true;
            }
            ((TextView) view).setText(com.bytedance.sdk.component.adexpress.dynamic.vj.vh.pcc(this.tmg.sf));
            return true;
        }
        int i = 0;
        ((TextView) this.jr).setIncludeFontPadding(false);
        ((TextView) this.jr).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), this.kj) - this.tmg.sf()) - this.tmg.pcc()) - 0.5f, this.tmg.vj()));
        DynamicRootView dynamicRootView = this.gbb;
        if (dynamicRootView != null && (renderRequest = dynamicRootView.getRenderRequest()) != null) {
            String mk = renderRequest.mk();
            if (!TextUtils.isEmpty(mk)) {
                ((TextView) this.jr).setText(mk);
                ((TextView) this.jr).setVisibility(i);
                return true;
            }
        }
        i = 8;
        ((TextView) this.jr).setVisibility(i);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        com.bytedance.sdk.component.adexpress.sf.hc renderRequest = this.gbb.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.tsz())) {
            super.wh();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }
}
