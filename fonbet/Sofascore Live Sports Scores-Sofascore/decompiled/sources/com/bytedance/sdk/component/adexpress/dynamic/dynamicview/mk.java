package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mk extends wh implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private boolean pcc;

    public mk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.pcc = dynamicRootView.getRenderRequest().hc();
        }
        this.qf = this.kj;
        ImageView imageView = new ImageView(context);
        this.jr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().jsj()) {
            return;
        }
        this.jr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        Drawable gm;
        super.vy();
        ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable pcc = com.bytedance.sdk.component.adexpress.oo.gm.pcc(getContext(), this.tmg);
        if (pcc != null) {
            ((ImageView) this.jr).setBackground(pcc);
        }
        if (this.pcc) {
            gm = com.bytedance.sdk.component.utils.tz.gm(getContext(), "tt_close_btn");
        } else {
            gm = com.bytedance.sdk.component.utils.tz.gm(getContext(), "tt_skip_btn");
            if (gm != null) {
                gm.setAutoMirrored(true);
            }
        }
        if (gm != null) {
            ((ImageView) this.jr).setImageDrawable(gm);
        }
        setVisibility(8);
        return true;
    }
}
