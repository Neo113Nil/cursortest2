package com.bytedance.sdk.openadsdk.jr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.wh.qf;
import com.bytedance.sdk.openadsdk.core.wh.wh;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends qf {
    public oo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pcc(context);
    }

    private void pcc(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int sf = rj.sf(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setId(nac.pzh);
        gmVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        gmVar.setBackgroundColor(0);
        addView(gmVar);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(nac.gmh);
        ooVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ooVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gmVar.addView(ooVar);
        wh whVar = new wh(context);
        whVar.setId(nac.lc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sf, sf);
        layoutParams.gravity = 17;
        whVar.setLayoutParams(layoutParams);
        whVar.setIndeterminateDrawable(vh.pcc(context, "tt_video_loading_progress_bar"));
        gmVar.addView(whVar);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar2.setId(nac.bgf);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        ooVar2.setLayoutParams(layoutParams2);
        ooVar2.setScaleType(ImageView.ScaleType.CENTER);
        ooVar2.setImageDrawable(vh.pcc(context, "tt_play_movebar_textpage"));
        ooVar2.setVisibility(8);
        addView(ooVar2);
        View sfVar = new sf(context);
        sfVar.setId(nac.ln);
        sfVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(sfVar);
    }

    public oo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oo(Context context) {
        this(context, null);
    }
}
