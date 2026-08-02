package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.gm.kj;
import com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.C4324ta;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private com.bytedance.sdk.openadsdk.core.wh.oo gm;
    private sf oo;
    private ViewGroup pcc;
    private Context sf;

    public pcc(ViewGroup viewGroup, Context context) {
        this.pcc = viewGroup;
        this.sf = context;
        vj();
    }

    private void vj() {
        int sf = rj.sf(this.sf, 24.0f);
        this.gm = com.bytedance.sdk.openadsdk.core.widget.wh.sf(this.sf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = sf;
        layoutParams.rightMargin = sf;
        this.gm.setLayoutParams(layoutParams);
        this.gm.setVisibility(8);
        this.oo = new sf();
        int kj = kj.kj();
        this.oo.pcc(kj);
        this.oo.sf(kj);
    }

    public void gm() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.pcc();
        }
    }

    public void oo() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.sf();
        }
    }

    public void pcc(final of ofVar) {
        if (ofVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.oo.pcc("unify_web_close_backup", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                if (ofVar.uae() != null) {
                    jSONObject.put("tpl_id", ofVar.uae().pcc());
                }
                jSONObject.put(C4324ta.b, ofVar.esn());
                jSONObject.put(BidResponsedEx.KEY_CID, ofVar.hpk());
                jSONObject.put("req_id", ofVar.qxv());
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("unify_web_close_backup").sf(jSONObject.toString());
            }
        });
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.setVisibility(0);
        }
    }

    public void pcc(View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.setOnClickListener(onClickListener);
        }
    }

    public void pcc(sf.pcc pccVar) {
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.pcc(pccVar);
        }
    }

    public void pcc() {
        ViewGroup viewGroup;
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.gm;
        if (ooVar == null || (viewGroup = this.pcc) == null) {
            return;
        }
        viewGroup.addView(ooVar);
    }
}
