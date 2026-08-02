package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.ironsource.Wf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements com.bytedance.sdk.openadsdk.pcc.oo.sf {
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private final of pcc;
    private final PAGAppOpenAdInteractionListener sf;

    public vj(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener, of ofVar) {
        this.pcc = ofVar;
        this.sf = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.oo.sf
    public void gm() {
        boolean andSet = this.gm.getAndSet(true);
        AtomicBoolean atomicBoolean = this.gm;
        if (andSet) {
            ork.pcc("close_callback_repeat", atomicBoolean.get(), this.oo.get(), this.pcc);
            return;
        }
        ork.pcc("close_callback", atomicBoolean.get(), this.oo.get(), this.pcc);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        lo.pcc("BVA", Wf.f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.oo.sf
    public void pcc() {
        boolean compareAndSet = this.oo.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.gm;
        if (!compareAndSet) {
            ork.pcc("show_callback_repeat", atomicBoolean.get(), this.oo.get(), this.pcc);
            return;
        }
        ork.pcc("show_callback", atomicBoolean.get(), this.oo.get(), this.pcc);
        lo.pcc("BVA", "onAdShow");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.oo.sf
    public void sf() {
        lo.pcc("BVA", "onAdSkip");
        boolean andSet = this.gm.getAndSet(true);
        AtomicBoolean atomicBoolean = this.gm;
        if (andSet) {
            ork.pcc("close_callback_repeat", atomicBoolean.get(), this.oo.get(), this.pcc);
            return;
        }
        ork.pcc("close_callback", atomicBoolean.get(), this.oo.get(), this.pcc);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }
}
