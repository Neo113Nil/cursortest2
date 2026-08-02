package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends sf {
    public gm(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
    }

    public static boolean pcc(of ofVar) {
        lo.gm(ofVar);
        return lo.gm(ofVar);
    }

    private void sf(kj kjVar) {
        if (kjVar == null) {
            return;
        }
        Context context = kjVar.getContext();
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(1);
        kjVar.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setId(nac.mu);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        vjVar.addView(gmVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar2.setId(nac.tmg);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        gmVar.addView(gmVar2, layoutParams2);
        gmVar2.addView(sf.pcc(context));
        if (this.sf.ct() != 3 && this.sf.ct() != 5) {
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
            ooVar.setId(nac.vck);
            ooVar.setVisibility(8);
            ooVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(rj.sf(context, 28.0f), rj.sf(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = rj.sf(context, 20.0f);
            layoutParams3.bottomMargin = rj.sf(context, 10.0f);
            gmVar.addView(ooVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar3.setId(nac.fum);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        vjVar.addView(gmVar3, layoutParams4);
        gmVar3.addView(oo.pcc(context, this.pcc.sf));
        com.bytedance.sdk.openadsdk.component.reward.view.vj.pcc(gmVar3, this.sf);
        com.bytedance.sdk.openadsdk.component.reward.view.vj.pcc(gmVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean oo() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean vj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(kj kjVar) {
        sf(kjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void wh() {
    }
}
