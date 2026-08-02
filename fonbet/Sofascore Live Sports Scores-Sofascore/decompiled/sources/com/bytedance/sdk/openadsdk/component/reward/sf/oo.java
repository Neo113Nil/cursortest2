package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.component.reward.view.vh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.fum;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends sf {
    public oo(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
    }

    private static ImageView gm(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setScaleType(ImageView.ScaleType.FIT_XY);
        ooVar.setImageResource(tz.oo(context, "tt_up_slide"));
        ooVar.setId(nac.yt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rj.sf(context, 18.0f), rj.sf(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = rj.sf(context, 45.0f);
        ooVar.setLayoutParams(layoutParams);
        return ooVar;
    }

    public static void pcc(FrameLayout frameLayout, of ofVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(1);
        frameLayout.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setId(nac.mu);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        vjVar.addView(gmVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar2.setId(nac.tmg);
        gmVar.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
        gmVar2.addView(sf.pcc(context));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar3.setId(nac.gpj);
        gmVar3.setVisibility(8);
        gmVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        gmVar2.addView(gmVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(nac.lo);
        ooVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        gmVar3.addView(ooVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.vj.pcc(gmVar);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar4 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar4.setId(nac.fum);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        vjVar.addView(gmVar4, layoutParams3);
        gmVar4.addView(pcc(context, ofVar));
        LinearLayout sf = sf(context);
        sf.setBackgroundColor(Color.parseColor("#70161823"));
        gmVar4.addView(sf);
        sf.addView(gm(context));
        com.bytedance.sdk.openadsdk.component.reward.view.vj.pcc(gmVar4, ofVar);
    }

    public static void sf(FrameLayout frameLayout, of ofVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setId(nac.fum);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = rj.sf(lu.pcc(), 58.0f);
        frameLayout.addView(gmVar, layoutParams);
        gmVar.addView(pcc(context, ofVar));
        LinearLayout sf = sf(context);
        sf.setBackgroundColor(Color.parseColor("#99161823"));
        gmVar.addView(sf);
        sf.addView(gm(context));
        com.bytedance.sdk.openadsdk.component.reward.view.vj.pcc(gmVar, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar2.setId(nac.mu);
        frameLayout.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar3.setId(nac.tmg);
        gmVar2.addView(gmVar3, new FrameLayout.LayoutParams(-1, -1));
        gmVar3.addView(sf.pcc(context));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar4 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar4.setId(nac.gpj);
        gmVar4.setVisibility(8);
        gmVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        gmVar3.addView(gmVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(nac.lo);
        ooVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        gmVar4.addView(ooVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.vj.pcc(gmVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean oo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public RFEndCardBackUpLayout qf() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void vh() {
        vh vhVar;
        lo loVar;
        if (lo.sf(this.pcc.sf) && (vhVar = this.pcc.mu) != null && (loVar = vhVar.dax) != null) {
            boolean oo = loVar.oo();
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            if (oo) {
                sfVar.mu.sf(0);
                this.pcc.hc.set(true);
            } else {
                sfVar.gbb.set(true);
                pcc(true, false, true, 80);
            }
        }
        if (lo.oo(this.pcc.sf) || lo.kj(this.pcc.sf)) {
            pcc(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean vj() {
        if (lo.sf(this.pcc.sf)) {
            return true;
        }
        return (lo.oo(this.pcc.sf) || lo.kj(this.pcc.sf)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void wh() {
    }

    private static LinearLayout sf(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setId(nac.of);
        vjVar.setOrientation(1);
        vjVar.setVisibility(8);
        vjVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return vjVar;
    }

    public static void pcc(of ofVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (lo.sf(ofVar)) {
            pcc(frameLayout, ofVar);
        } else if (!lo.oo(ofVar) && !lo.kj(ofVar)) {
            sf.pcc(frameLayout, sfVar);
        } else {
            sf(frameLayout, ofVar);
        }
    }

    public static boolean pcc(of ofVar) {
        return lo.sf(ofVar) || lo.oo(ofVar) || lo.kj(ofVar);
    }

    public static com.bytedance.sdk.component.vy.qf pcc(Context context, of ofVar) {
        com.bytedance.sdk.component.vy.qf sf = com.bytedance.sdk.openadsdk.gbb.gm.pcc().sf(ofVar);
        if (sf != null) {
            sf.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) sf.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(sf);
            }
        } else {
            sf = new com.bytedance.sdk.component.vy.qf(context, true, qf.gm.LANDING_PAGE_LOADING);
            sf.setLayerType(2, null);
        }
        rj.pcc((View) sf, 0);
        sf.setId(nac.tz);
        sf.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return sf;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(kj kjVar) {
        pcc(this.sf, kjVar, this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(FrameLayout frameLayout) {
        if (!lo.oo(this.pcc.sf) || this.pcc.sf.xb()) {
            return;
        }
        fum yt = this.pcc.sf.yt();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        gbb gbbVar = sfVar.gh;
        if (gbbVar == null || yt == null) {
            return;
        }
        gbbVar.pcc(sfVar, yt.sf() * 1000);
    }
}
