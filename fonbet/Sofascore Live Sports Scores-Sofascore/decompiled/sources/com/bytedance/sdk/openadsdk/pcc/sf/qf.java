package com.bytedance.sdk.openadsdk.pcc.sf;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements wh {
    private final PAGNativeAdInteractionListener pcc;

    public qf(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.pcc = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.qf.1
            @Override // java.lang.Runnable
            public void run() {
                if (qf.this.pcc != null) {
                    qf.this.pcc.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.wh
    public void pcc(PAGNativeAd pAGNativeAd) {
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.qf.2
            @Override // java.lang.Runnable
            public void run() {
                if (qf.this.pcc != null) {
                    qf.this.pcc.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.wh
    public boolean sf() {
        return this.pcc != null;
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.wh
    public void pcc() {
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.qf.3
            @Override // java.lang.Runnable
            public void run() {
                if (qf.this.pcc != null) {
                    qf.this.pcc.onAdDismissed();
                }
            }
        });
    }
}
