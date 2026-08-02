package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax extends wh implements com.bytedance.sdk.component.adexpress.dynamic.sf {
    public dax(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        ImageView imageView = new ImageView(context);
        this.jr = imageView;
        imageView.setTag(5);
        addView(this.jr, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().jsj()) {
            return;
        }
        this.jr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sf
    public void setSoundMute(boolean z) {
        ((ImageView) this.jr).setImageResource(z ? com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.jr).getDrawable() != null) {
            ((ImageView) this.jr).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public boolean vj() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        boolean sf = com.bytedance.sdk.component.adexpress.oo.sf();
        View view = this.jr;
        if (sf) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.gbb.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
            ((ImageView) this.jr).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.oo.kj.pcc(0, Integer.valueOf(this.tmg.mk()), new int[]{this.kj / 2}, null, null, null));
            return true;
        }
        Drawable pcc = com.bytedance.sdk.component.adexpress.oo.gm.pcc(getContext(), this.tmg);
        if (pcc == null) {
            return true;
        }
        ((ImageView) this.jr).setBackground(pcc);
        return true;
    }
}
