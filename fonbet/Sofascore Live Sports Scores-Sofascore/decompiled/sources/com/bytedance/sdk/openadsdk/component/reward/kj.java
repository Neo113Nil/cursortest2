package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.hc;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.tsz;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class kj extends PAGInterstitialAd {
    private final String gm = tsz.pcc();
    private final hc oo;
    private final com.bytedance.sdk.openadsdk.core.model.pcc pcc;
    private com.bytedance.sdk.openadsdk.pcc.gm.sf sf;

    public kj(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.pcc = pccVar;
        this.oo = new hc(context, pccVar, "fullscreen_interstitial_ad", new hc.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public void pcc(boolean z) {
                if (kj.this.sf == null) {
                    return;
                }
                if (z) {
                    atb.pcc().pcc(kj.this.gm, (String) kj.this.sf);
                } else {
                    atb.pcc().pcc(kj.this.sf);
                }
                kj.this.sf = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public void pcc(Intent intent, @Nullable Activity activity, of ofVar, boolean z) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(intent, activity, kj.this.oo.gm(), kj.this.pcc, kj.this.gm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public Intent pcc(Context context2, of ofVar, @Nullable Activity activity) {
                if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                    return new Intent(context2, (Class<?>) TTFullWebActivity.class);
                }
                if (ofVar.xb()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                if (ofVar.wh()) {
                    return new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class);
                }
                return new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.hc.pcc
            public void pcc(of ofVar) {
                sf.pcc(ofVar, kj.this.oo.gm(), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.oo.pcc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.oo.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.oo.pcc(d, str, str2);
    }

    public void pcc() {
        this.oo.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.sf = new com.bytedance.sdk.openadsdk.component.gm.pcc(pAGInterstitialAdInteractionCallback, this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.sf = new com.bytedance.sdk.openadsdk.component.gm.pcc(pAGInterstitialAdInteractionListener, this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.oo.pcc(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.oo.pcc(d);
    }
}
