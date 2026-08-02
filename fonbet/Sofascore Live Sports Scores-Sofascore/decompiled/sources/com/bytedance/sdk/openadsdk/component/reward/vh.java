package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh implements com.bytedance.sdk.openadsdk.pcc.vj.pcc {
    private final AtomicBoolean gm;
    private final AtomicBoolean oo;
    private final PAGRewardedAdInteractionListener pcc;
    private final PAGRewardedAdInteractionCallback sf;
    private final AtomicBoolean vj;
    private final of wh;

    public vh(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.gm = new AtomicBoolean(false);
        this.oo = new AtomicBoolean(false);
        this.vj = new AtomicBoolean(false);
        this.pcc = pAGRewardedAdInteractionListener;
        this.sf = null;
        this.wh = pccVar != null ? pccVar.qf() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pcc;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.sf;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.vj.pcc
    public void pcc() {
        this.gm.get();
        boolean compareAndSet = this.gm.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.oo;
        if (!compareAndSet) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc("show_callback_repeat", atomicBoolean.get(), this.gm.get(), this.wh);
            return;
        }
        com.bytedance.sdk.openadsdk.oo.ork.pcc("show_callback", atomicBoolean.get(), this.gm.get(), this.wh);
        com.bytedance.sdk.component.utils.lo.pcc("BVA", "reward video onAdShow");
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pcc;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.sf;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.vj.pcc
    public void sf() {
        this.oo.get();
        boolean compareAndSet = this.oo.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.oo;
        if (!compareAndSet) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc("close_callback_repeat", atomicBoolean.get(), this.gm.get(), this.wh);
            return;
        }
        com.bytedance.sdk.openadsdk.oo.ork.pcc("close_callback", atomicBoolean.get(), this.gm.get(), this.wh);
        com.bytedance.sdk.component.utils.lo.pcc("BVA", "reward video onAdClose");
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pcc;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.sf;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    public vh(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.gm = new AtomicBoolean(false);
        this.oo = new AtomicBoolean(false);
        this.vj = new AtomicBoolean(false);
        this.sf = pAGRewardedAdInteractionCallback;
        this.pcc = null;
        this.wh = pccVar != null ? pccVar.qf() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.vj.pcc
    public void pcc(boolean z, int i, String str, int i2, String str2) {
        if (this.vj.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.lo.pcc("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pcc;
            if (pAGRewardedAdInteractionListener != null) {
                if (z) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.sf;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
                }
            }
        }
    }
}
