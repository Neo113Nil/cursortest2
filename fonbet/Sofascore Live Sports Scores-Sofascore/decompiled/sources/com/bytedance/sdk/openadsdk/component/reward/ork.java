package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.hc;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.tsz;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class ork extends PAGRewardedAd {
    private com.bytedance.sdk.openadsdk.pcc.vj.pcc gm;
    private final String oo = tsz.pcc();
    private final com.bytedance.sdk.openadsdk.core.model.pcc pcc;
    private final AdSlot sf;
    private final hc vj;

    public ork(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        this.pcc = pccVar;
        this.sf = adSlot;
        this.vj = new hc(context, pccVar, "rewarded_video", new hc.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ork.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public void pcc(Intent intent, @Nullable Activity activity, of ofVar, boolean z) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(intent, activity, ork.this.vj.gm(), ork.this.pcc, ork.this.oo);
                intent.putExtra("media_extra", ork.this.sf.getMediaExtra());
                intent.putExtra("user_id", ork.this.sf.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public Intent pcc(Context context2, of ofVar, @Nullable Activity activity) {
                if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                    return new Intent(context2, (Class<?>) TTRewardWebActivity.class);
                }
                if (ofVar.xb()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return ofVar.wh() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public void pcc(boolean z) {
                if (ork.this.gm == null) {
                    return;
                }
                if (z) {
                    atb.pcc().pcc(ork.this.oo, (String) ork.this.gm);
                } else {
                    atb.pcc().pcc(ork.this.gm);
                }
                ork.this.gm = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public void pcc(of ofVar) {
                sf.pcc(ofVar, ork.this.vj.gm(), true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.vj.pcc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.vj.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.vj.pcc(d, str, str2);
    }

    public void pcc() {
        this.vj.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.gm = new vh(pAGRewardedAdInteractionCallback, this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.gm = new vh(pAGRewardedAdInteractionListener, this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        this.vj.pcc(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.vj.pcc(d);
    }
}
