package com.bytedance.sdk.openadsdk.component.gm;

import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements com.bytedance.sdk.openadsdk.pcc.gm.sf {
    private final of oo;
    private final PAGInterstitialAdInteractionListener pcc;
    private final AtomicBoolean sf = new AtomicBoolean(false);
    private final AtomicBoolean gm = new AtomicBoolean(false);

    public pcc(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.pcc = pAGInterstitialAdInteractionListener;
        this.oo = pccVar != null ? pccVar.qf() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pcc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.gm.sf
    public void pcc() {
        boolean compareAndSet = this.sf.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.gm;
        if (!compareAndSet) {
            ork.pcc("show_callback_repeat", atomicBoolean.get(), this.sf.get(), this.oo);
            return;
        }
        ork.pcc("show_callback", atomicBoolean.get(), this.sf.get(), this.oo);
        lo.pcc("BVA", "full video onAdShow");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pcc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.gm.sf
    public void sf() {
        boolean compareAndSet = this.gm.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.gm;
        if (!compareAndSet) {
            ork.pcc("close_callback_repeat", atomicBoolean.get(), this.sf.get(), this.oo);
            return;
        }
        ork.pcc("close_callback", atomicBoolean.get(), this.sf.get(), this.oo);
        lo.pcc("BVA", "full video onAdClose");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pcc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }
}
