package com.bytedance.sdk.openadsdk.pcc.gm;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener pcc;

    public pcc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.pcc = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.gm.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.pcc != null) {
                    pcc.this.pcc.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.pcc == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.gm.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.pcc != null) {
                    pcc.this.pcc.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
