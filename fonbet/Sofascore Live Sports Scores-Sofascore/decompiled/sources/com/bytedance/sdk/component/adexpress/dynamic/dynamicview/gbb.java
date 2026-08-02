package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends wh {
    public gbb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        ImageView imageView = new ImageView(context);
        this.jr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            this.kj = Math.max(dynamicRootView.getLogoUnionHeight(), this.kj);
        }
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.gbb;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.gbb.getRenderRequest().tsz())) {
            setVisibility(8);
        } else {
            String tsz = this.gbb.getRenderRequest().tsz();
            if (tsz.equals("logo")) {
                ((ImageView) this.jr).setImageResource(com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.vj.ork vj = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().vj().pcc(tsz).pcc(this.qf).sf(this.kj).oo(this.qf).vj(this.kj);
                String gbb = this.gbb.getRenderRequest().gbb();
                if (!TextUtils.isEmpty(gbb)) {
                    vj.sf(gbb);
                }
                vj.pcc((ImageView) this.jr);
            }
        }
        ((ImageView) this.jr).setColorFilter(this.tmg.qf(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
