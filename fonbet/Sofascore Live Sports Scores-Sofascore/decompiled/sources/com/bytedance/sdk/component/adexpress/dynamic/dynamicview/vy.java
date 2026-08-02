package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends wh {
    public vy(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            this.jr = new ImageView(context);
        } else {
            this.jr = new com.bytedance.sdk.component.adexpress.wh.vy(context);
        }
        this.jr.setTag(3);
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            Drawable pcc = com.bytedance.sdk.component.adexpress.oo.gm.pcc(getContext(), this.tmg);
            if (pcc != null) {
                this.jr.setBackground(pcc);
            }
            int oo = com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_close_btn");
            if (oo > 0) {
                ((ImageView) this.jr).setImageResource(oo);
            }
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int pcc2 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.nac());
        View view = this.jr;
        if (view instanceof com.bytedance.sdk.component.adexpress.wh.vy) {
            ((com.bytedance.sdk.component.adexpress.wh.vy) view).setRadius((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.jr()));
            ((com.bytedance.sdk.component.adexpress.wh.vy) this.jr).setStrokeWidth(pcc2);
            ((com.bytedance.sdk.component.adexpress.wh.vy) this.jr).setStrokeColor(this.tmg.dax());
            ((com.bytedance.sdk.component.adexpress.wh.vy) this.jr).setBgColor(this.tmg.mk());
            ((com.bytedance.sdk.component.adexpress.wh.vy) this.jr).setDislikeColor(this.tmg.qf());
            ((com.bytedance.sdk.component.adexpress.wh.vy) this.jr).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, 1.0f));
        }
        return true;
    }
}
