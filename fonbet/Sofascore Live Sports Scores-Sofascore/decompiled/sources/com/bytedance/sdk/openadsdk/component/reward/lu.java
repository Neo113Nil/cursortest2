package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.jr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu extends pcc<PAGRewardedAdLoadListener, TTClientBidding> {
    public lu(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void sf(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof lo) {
            ((lo) tTClientBidding).sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public int wh() {
        return 6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public TTClientBidding pcc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        return new lo(context, pccVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public int sf() {
        return 7;
    }

    public static lu pcc(Context context) {
        return (lu) fum.pcc(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public jr pcc() {
        return jr.pcc(this.pcc, jr.pcc.REWARD_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public Object pcc(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof lo) {
            return ((lo) tTClientBidding).pcc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i, String str) {
        pAGRewardedAdLoadListener.onError(i, str);
    }
}
