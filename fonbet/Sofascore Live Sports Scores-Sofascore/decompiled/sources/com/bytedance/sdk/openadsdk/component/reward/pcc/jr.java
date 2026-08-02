package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.yt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr extends com.bytedance.sdk.openadsdk.core.ork.pcc.pcc {
    public jr(ViewGroup viewGroup, of ofVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar) {
        super(viewGroup, ofVar, str, activity, context, sfVar);
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.setRewardControlListener(whVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.setAdInteractionListener(pccVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.vy vyVar) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.setVideoTrackListener(vyVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.oo ooVar) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.setHeartBeatListener(ooVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.setLandingPageListener(gmVar);
        }
    }

    public void pcc() {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.gbb();
        }
    }

    public void pcc(String str, int i, int i2) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.pcc(str, i, i2);
        }
    }

    public void pcc(com.bytedance.sdk.component.vy.vj vjVar) {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.setWebTouchProxy(vjVar);
        }
    }
}
