package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.jr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends pcc<PAGInterstitialAdLoadListener, TTClientBidding> {
    public qf(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void sf(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof gpj) {
            ((gpj) tTClientBidding).sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public int wh() {
        return 5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public TTClientBidding pcc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        return new gpj(context, pccVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public int sf() {
        return 8;
    }

    public static qf pcc(Context context) {
        return (qf) fum.pcc(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public jr pcc() {
        return jr.pcc(this.pcc, jr.pcc.FULL_SCREEN_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public Object pcc(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof gpj) {
            return ((gpj) tTClientBidding).pcc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i, String str) {
        pAGInterstitialAdLoadListener.onError(i, str);
    }
}
