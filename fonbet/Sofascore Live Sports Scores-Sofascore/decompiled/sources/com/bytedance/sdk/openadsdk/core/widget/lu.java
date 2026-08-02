package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.hc.gm.oo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.core.tsz;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu implements oo.pcc, com.bytedance.sdk.openadsdk.core.hc.gm.pcc, com.bytedance.sdk.openadsdk.core.ork.dax, tsz {
    private final com.bytedance.sdk.openadsdk.core.hc.gm.sf gm;
    private int kj;
    private final com.bytedance.sdk.openadsdk.core.wh.gm oo;
    private boolean ork;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
    private final pcc sf;
    private boolean vh;
    private final com.bytedance.sdk.openadsdk.core.gm.pcc vj;
    private mu wh;
    private int qf = 0;
    private int vy = 1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void gm();

        int oo();

        void pcc();

        void sf();

        void vj();

        void wh();
    }

    public lu(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, pcc pccVar) {
        this.pcc = sfVar;
        this.sf = pccVar;
        this.oo = new com.bytedance.sdk.openadsdk.core.wh.gm(sfVar.rnn) { // from class: com.bytedance.sdk.openadsdk.core.widget.lu.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                lu.this.pcc(z);
            }
        };
        com.bytedance.sdk.openadsdk.core.hc.gm.sf sfVar2 = new com.bytedance.sdk.openadsdk.core.hc.gm.sf(sfVar.kun, sfVar.sf, true);
        this.gm = sfVar2;
        sfVar2.pcc((com.bytedance.sdk.openadsdk.core.ork.dax) this);
        sfVar2.pcc((com.bytedance.sdk.openadsdk.core.hc.gm.pcc) this);
        com.bytedance.sdk.openadsdk.core.hc.gm.gm pcc2 = sfVar2.pcc();
        if (pcc2 instanceof com.bytedance.sdk.openadsdk.core.hc.gm.oo) {
            com.bytedance.sdk.openadsdk.core.hc.gm.oo ooVar = (com.bytedance.sdk.openadsdk.core.hc.gm.oo) pcc2;
            ooVar.pcc((oo.pcc) this);
            mu vj = ooVar.vj();
            this.wh = vj;
            if (vj != null) {
                vj.pcc((tsz) this);
                this.wh.sf(sfVar.sf.vj());
            }
        }
        Context context = sfVar.kun;
        of ofVar = sfVar.sf;
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = new com.bytedance.sdk.openadsdk.core.gm.pcc(context, ofVar, ofVar.vj(), kun.sf(sfVar.sf));
        this.vj = pccVar2;
        pccVar2.pcc(com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), sfVar.sf.vj()));
        HashMap hashMap = new HashMap();
        if (atb.sf(sfVar.sf)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        pccVar2.pcc(hashMap);
    }

    private void ork() {
        this.qf++;
        pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.gm();
        }
        pcc(true);
        mu muVar = this.wh;
        if (muVar != null) {
            muVar.pcc("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            pcc pccVar2 = this.sf;
            if (pccVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(pccVar2.oo(), 0));
            }
            jSONObject2.put("popup_sequence", this.qf);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("UserIdleAskDialog", e.getMessage());
        }
        of ofVar = this.pcc.sf;
        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, ofVar.vj(), "show_popup", jSONObject);
    }

    private boolean sf(Activity activity) {
        if (!this.oo.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.vh = false;
                return false;
            }
            this.vh = true;
            window.addContentView(this.oo, new WindowManager.LayoutParams(-1, -1));
        }
        this.oo.setVisibility(0);
        return true;
    }

    private void tmg() {
        this.oo.setVisibility(8);
    }

    private boolean vh() {
        return this.oo.isAttachedToWindow() && this.oo.getVisibility() == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public long gm() {
        return 0L;
    }

    public void kj() {
        this.ork = true;
        ViewParent parent = this.oo.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.oo);
        }
        com.bytedance.sdk.openadsdk.core.hc.gm.sf sfVar = this.gm;
        if (sfVar != null) {
            sfVar.oo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tsz
    public void n_() {
        if (this.ork || !vh()) {
            return;
        }
        tmg();
        pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.sf();
        }
        pcc(false);
        mu muVar = this.wh;
        if (muVar != null) {
            muVar.pcc("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tsz
    public int o_() {
        pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.oo();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public long oo() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tsz
    public void p_() {
        pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.vj();
        }
    }

    public boolean pcc(Activity activity) {
        if (!this.ork && activity != null && !activity.isFinishing()) {
            if (this.kj == 3 && this.vy == 2) {
                if (this.oo.isAttachedToWindow() && this.oo.getVisibility() == 0) {
                    return true;
                }
                if (sf(activity)) {
                    ork();
                    return true;
                }
            }
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.kj);
                jSONObject.put("js_finish", this.vy);
                jSONObject.put("has_window", this.vh ? 1 : 0);
                hashMap.put("pag_json_data", jSONObject.toString());
                of ofVar = this.pcc.sf;
                com.bytedance.sdk.openadsdk.oo.gm.pcc("show_popup_fail", ofVar, ofVar.vj(), hashMap);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tsz
    public void q_() {
        pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.wh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.oo.pcc
    public void qf() {
        if (this.kj != 1) {
            return;
        }
        this.kj = 3;
        View gm = this.gm.gm();
        if (gm != null) {
            ViewGroup viewGroup = (ViewGroup) gm.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.oo) {
                    return;
                } else {
                    viewGroup.removeView(gm);
                }
            }
            if (this.oo != null) {
                gm.setVisibility(0);
                this.oo.addView(gm, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tsz
    public void r_() {
        this.vy = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public int vj() {
        return 0;
    }

    public boolean vy() {
        if (this.ork || !vh()) {
            return false;
        }
        n_();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tsz
    public void m_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void wh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void sf(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public boolean sf(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void sf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(boolean z, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public boolean pcc(JSONObject jSONObject) {
        return false;
    }

    public void pcc(ViewGroup viewGroup) {
        View gm = this.gm.gm();
        if (gm == null) {
            return;
        }
        gm.setVisibility(4);
        viewGroup.addView(gm, new ViewGroup.LayoutParams(-1, -1));
        this.gm.sf();
        this.kj = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z) {
        com.bytedance.sdk.openadsdk.core.hc.gm.gm pcc2 = this.gm.pcc();
        if (pcc2 instanceof com.bytedance.sdk.openadsdk.core.hc.gm.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.gm.oo) pcc2).pcc(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(String str, JSONObject jSONObject) {
        pcc pccVar;
        if (!"skipToNextAd".equals(str) || (pccVar = this.sf) == null) {
            return;
        }
        pccVar.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.pcc
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        if (i == 2) {
            com.bytedance.sdk.openadsdk.core.model.dax daxVar = (com.bytedance.sdk.openadsdk.core.model.dax) gmVar;
            String str = daxVar.qf;
            if (daxVar.tmg > 0) {
                rnn.pcc(true);
            }
            this.vj.pcc(str);
            this.vj.pcc(view, daxVar.pcc, daxVar.sf, daxVar.gm, daxVar.oo, daxVar.ork, daxVar.vh);
            this.pcc.tsx.qcw();
            rnn.pcc(false);
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.pcc.sf, 9);
        }
    }
}
