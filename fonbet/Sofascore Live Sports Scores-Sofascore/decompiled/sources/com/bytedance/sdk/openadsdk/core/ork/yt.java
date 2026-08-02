package com.bytedance.sdk.openadsdk.core.ork;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.openadsdk.AdSlot;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class yt extends fum {
    private String gm;
    private boolean oo;
    public int pcc;
    private vj sf;

    public yt(Activity activity, Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str) {
        super(activity, context, ofVar, adSlot, str);
        this.pcc = 1;
        this.oo = true;
    }

    public void gbb() {
        if (getJsObject() != null) {
            getJsObject().lo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void kj() {
        this.nac = new com.bytedance.sdk.openadsdk.oo.gpj(11, this.ork, this.tmg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public boolean lo() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.kj
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        if (i == -1 || gmVar == null || i != 3) {
            super.pcc(view, i, gmVar);
            return;
        }
        if (gmVar instanceof com.bytedance.sdk.openadsdk.core.model.dax) {
            this.gm = ((com.bytedance.sdk.openadsdk.core.model.dax) gmVar).dax;
        }
        wh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void qf() {
        this.jr = true;
        super.qf();
        com.bytedance.sdk.component.vy.qf webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(pccVar);
        }
    }

    public void setDislikeClickListener(vj vjVar) {
        this.sf = vjVar;
    }

    public void setHeartBeatListener(com.bytedance.sdk.openadsdk.component.reward.gm.oo ooVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(ooVar);
        }
    }

    public void setLandingPageListener(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(gmVar);
        }
    }

    public void setRewardControlListener(com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(whVar);
        }
    }

    public void setShouldNotifyAdVisibility(boolean z) {
        this.oo = z;
    }

    public void setVideoTrackListener(com.bytedance.sdk.openadsdk.component.reward.gm.vy vyVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(vyVar);
        }
    }

    public void setWebTouchProxy(com.bytedance.sdk.component.vy.vj vjVar) {
        if (getWebView() != null) {
            getWebView().setWebTouchProxy(vjVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void wh() {
        vj vjVar = this.sf;
        if (vjVar != null) {
            vjVar.pcc(this.gm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.jr
    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        this.atb = ooVar;
        super.pcc(ooVar, gbbVar);
    }

    public void pcc(String str, int i, int i2) {
        if (getJsObject() != null) {
            getJsObject().pcc(str, i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void pcc(hc.pcc pccVar) {
        super.pcc(pccVar);
        pccVar.wh(com.bytedance.sdk.openadsdk.core.model.lo.vj(this.tmg));
    }
}
