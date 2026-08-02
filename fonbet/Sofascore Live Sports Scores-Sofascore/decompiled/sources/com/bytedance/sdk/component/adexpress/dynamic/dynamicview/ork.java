package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends wh {
    public ork(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            ImageView imageView = new ImageView(context);
            this.jr = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.qf = this.kj;
        } else {
            this.jr = new TextView(context);
        }
        this.jr.setTag(3);
        addView(this.jr, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().kj() && dynamicRootView.getRenderRequest().jsj()) {
                return;
            }
            this.jr.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            Drawable pcc = com.bytedance.sdk.component.adexpress.oo.gm.pcc(getContext(), this.tmg);
            if (pcc != null) {
                ((ImageView) this.jr).setBackground(pcc);
            }
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int oo = com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_reward_full_feedback");
            if (oo > 0) {
                ((ImageView) this.jr).setImageResource(oo);
            }
        }
        return true;
    }
}
