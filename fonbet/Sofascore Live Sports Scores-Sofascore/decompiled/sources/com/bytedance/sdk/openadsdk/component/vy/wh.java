package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends gm {
    private final dax gbb;
    private final com.bytedance.sdk.openadsdk.core.wh.vj hc;

    public wh(Context context, of ofVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        this.hc = vjVar;
        vjVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = rj.sf(context, 24.0f);
        layoutParams.topMargin = rj.sf(context, 56.0f);
        vjVar.setLayoutParams(layoutParams);
        vjVar.setClickable(false);
        vjVar.setGravity(16);
        vjVar.setOrientation(0);
        nac nacVar = new nac(context);
        this.wh = nacVar;
        nacVar.setId(520093759);
        this.wh.setLayoutParams(new LinearLayout.LayoutParams(rj.sf(context, 24.0f), rj.sf(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.qf = kjVar;
        kjVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = rj.sf(context, 8.0f);
        this.qf.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = this.qf;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar2.setEllipsize(truncateAt);
        this.qf.setMaxLines(2);
        this.qf.setTextColor(Color.parseColor("#161823"));
        this.qf.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(rj.sf(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = rj.sf(context, 24.0f);
        layoutParams3.rightMargin = rj.sf(context, 24.0f);
        qfVar.setLayoutParams(layoutParams3);
        nac nacVar2 = new nac(context);
        this.vy = nacVar2;
        int i = com.bytedance.sdk.openadsdk.utils.nac.ef;
        nacVar2.setId(i);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(rj.sf(context, 80.0f), rj.sf(context, 80.0f));
        layoutParams4.addRule(14);
        this.vy.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.ork = kjVar3;
        int i2 = com.bytedance.sdk.openadsdk.utils.nac.mbt;
        kjVar3.setId(i2);
        this.ork.setTextSize(24.0f);
        this.ork.setTextColor(Color.parseColor("#161823"));
        this.ork.setGravity(17);
        this.ork.setMaxLines(1);
        this.ork.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i);
        layoutParams5.topMargin = rj.sf(context, 12.0f);
        layoutParams5.addRule(14);
        this.ork.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vh = kjVar4;
        int i3 = com.bytedance.sdk.openadsdk.utils.nac.apl;
        kjVar4.setId(i3);
        this.vh.setTextSize(16.0f);
        this.vh.setTextColor(Color.parseColor("#80161823"));
        this.vh.setGravity(17);
        this.vh.setMaxLines(2);
        this.vh.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i2);
        layoutParams6.topMargin = rj.sf(context, 4.0f);
        layoutParams6.addRule(14);
        this.vh.setLayoutParams(layoutParams6);
        dax daxVar = new dax(context);
        this.gbb = daxVar;
        RelativeLayout.LayoutParams c = w1l.c(-2, -2, 14);
        c.topMargin = rj.sf(context, 12.0f);
        daxVar.setLayoutParams(c);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar5 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj = kjVar5;
        kjVar5.setId(520093717);
        this.vj.setBackground(vh.pcc(context, "tt_reward_full_video_backup_btn_bg"));
        this.vj.setEllipsize(truncateAt);
        this.vj.setLines(1);
        this.vj.setGravity(17);
        this.vj.setTextColor(-1);
        this.vj.setTextSize(16.0f);
        this.vj.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, rj.sf(context, 44.0f));
        layoutParams7.addRule(3, i3);
        layoutParams7.topMargin = rj.sf(context, 54.0f);
        layoutParams7.addRule(14);
        this.vj.setLayoutParams(layoutParams7);
        PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, ofVar);
        this.oo = createPAGLogoViewByMaterial;
        createPAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams8.leftMargin = rj.sf(context, 16.0f);
        layoutParams8.bottomMargin = rj.sf(context, 24.0f);
        layoutParams8.addRule(12);
        this.oo.setLayoutParams(layoutParams8);
        addView(this.kj);
        vjVar.addView(this.wh);
        vjVar.addView(this.qf);
        addView(vjVar);
        qfVar.addView(this.vy);
        qfVar.addView(this.ork);
        qfVar.addView(this.vh);
        qfVar.addView(daxVar);
        qfVar.addView(this.vj);
        addView(qfVar);
        addView(this.oo);
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.oo getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.kj getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public dax getScoreBar() {
        return this.gbb;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public View getUserInfo() {
        return this.hc;
    }
}
