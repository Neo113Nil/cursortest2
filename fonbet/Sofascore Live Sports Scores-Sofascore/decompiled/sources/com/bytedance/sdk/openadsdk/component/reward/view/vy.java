package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.dax;
import com.bytedance.sdk.openadsdk.utils.rj;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {
    private final String kj;

    @NonNull
    private com.bytedance.sdk.openadsdk.component.reward.pcc.sf ork;
    com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm pcc;
    private final of qf;
    Handler sf;
    private boolean vh;
    private gm vy;
    private final Activity wh;
    boolean gm = false;
    boolean oo = false;
    boolean vj = false;

    public vy(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.ork = sfVar;
        this.wh = sfVar.rnn;
        this.qf = sfVar.sf;
        this.kj = sfVar.vj;
    }

    public void gbb() {
        gm gmVar = this.vy;
        if (gmVar == null) {
            return;
        }
        gmVar.fum();
        this.vy.vh();
    }

    public boolean gm() {
        return this.gm;
    }

    public void hc() {
        gm gmVar = this.vy;
        if (gmVar == null) {
            return;
        }
        gmVar.gpj();
    }

    public void jr() {
        if (of.vj(this.qf) && this.qf.bbd() == 3 && this.qf.pv() == 0) {
            try {
                if (this.qf.ial() == 1) {
                    int sf = rj.sf(lu.pcc(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.vy.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = sf;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void kj() {
        gm gmVar = this.vy;
        if (gmVar != null) {
            gmVar.tmg();
        }
    }

    public boolean oo() {
        return this.oo;
    }

    public boolean ork() {
        gm gmVar = this.vy;
        return gmVar != null && gmVar.qy();
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.ork.ork orkVar, com.bytedance.sdk.openadsdk.core.ork.vy vyVar) {
        of ofVar;
        if (this.vy == null || (ofVar = this.qf) == null) {
            return;
        }
        this.pcc = sf(ofVar);
        orkVar.sf(this.vy);
        orkVar.pcc(this.pcc);
        this.vy.setClickListener(orkVar);
        vyVar.sf(this.vy);
        vyVar.pcc(this.pcc);
        this.vy.setClickCreativeListener(vyVar);
    }

    public void qf() {
        gm gmVar = this.vy;
        if (gmVar != null) {
            gmVar.vh();
        }
    }

    public FrameLayout sf() {
        gm gmVar = this.vy;
        if (gmVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = gmVar.getVideoFrameLayout();
        if (this.vy.of()) {
            jr();
        }
        return videoFrameLayout;
    }

    public boolean tmg() {
        gm gmVar = this.vy;
        if (gmVar != null) {
            return gmVar.atb instanceof com.bytedance.sdk.component.adexpress.vj.pcc;
        }
        return false;
    }

    public int vh() {
        gm gmVar = this.vy;
        if (gmVar != null) {
            return gmVar.getDynamicShowType();
        }
        return 0;
    }

    public Handler vj() {
        Handler handler = this.sf;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.sf = handler2;
        return handler2;
    }

    public boolean vy() {
        gm gmVar = this.vy;
        if (gmVar == null) {
            return false;
        }
        return gmVar.of();
    }

    public void wh() {
        if (this.vh) {
            return;
        }
        this.vh = true;
        gm gmVar = this.vy;
        if (gmVar != null) {
            gmVar.hc();
        }
        Handler handler = this.sf;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void sf(boolean z) {
        this.oo = z;
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm sf(of ofVar) {
        if (ofVar.az() == 4) {
            return com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.wh, this.kj);
        }
        return null;
    }

    public gm pcc() {
        return this.vy;
    }

    public void pcc(boolean z) {
        this.gm = z;
    }

    public void pcc(AdSlot adSlot, lo loVar) {
        if (this.vj) {
            return;
        }
        this.vj = true;
        gm gmVar = new gm(this.ork, adSlot, this.kj);
        this.vy = gmVar;
        if (loVar != null) {
            loVar.pcc(gmVar, gmVar.getVideoFrameLayout());
        }
    }

    public void pcc(dax daxVar) {
        gm gmVar = this.vy;
        if (gmVar == null) {
            return;
        }
        gmVar.setExpressVideoListenerProxy(daxVar);
    }

    public void pcc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.vy == null) {
            return;
        }
        this.vy.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    public JSONObject pcc(JSONObject jSONObject) {
        gm gmVar = this.vy;
        if (gmVar != null) {
            return gmVar.pcc(jSONObject, this.ork.sf);
        }
        return null;
    }

    public void pcc(int i, boolean z) {
        gm gmVar = this.vy;
        if (gmVar != null) {
            gmVar.pcc(i, z, false);
        }
    }

    public void pcc(int i, String str) {
        gm gmVar = this.vy;
        if (gmVar != null) {
            gmVar.sf(i, str);
        }
    }

    public void pcc(of ofVar) {
        gm gmVar = this.vy;
        if (gmVar != null) {
            gmVar.pcc(ofVar, ofVar.gqd(), ofVar.vj(), this.ork.xb, !r6.gdh);
        }
    }

    public void pcc(@NonNull com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.ork = sfVar;
    }
}
