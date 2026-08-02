package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.pcc.gpj;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private boolean gm;
    private gpj oo;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;

    @Nullable
    private RFEndCardBackUpLayout sf;
    private boolean vj;

    public qf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.pcc = sfVar;
    }

    public void gm() {
        gpj gpjVar = this.oo;
        if (gpjVar != null) {
            gpjVar.pcc();
        }
    }

    public void oo() {
        gpj gpjVar = this.oo;
        if (gpjVar != null) {
            gpjVar.sf();
        }
    }

    public void pcc() {
        if (this.gm) {
            return;
        }
        this.gm = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.pcc.nn.findViewById(nac.xf);
        this.sf = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.pcc);
        }
        if (this.pcc.sf.on()) {
            this.oo = new gpj(this.pcc);
        }
    }

    public void sf() {
        this.vj = true;
        rj.pcc((View) this.sf, 0);
    }

    public boolean vj() {
        return this.vj;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.sf;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rj.pcc(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.qf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        gpj gpjVar = this.oo;
        if (gpjVar != null) {
            gpjVar.pcc(vjVar);
        }
    }

    public boolean pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.nac nacVar) {
        this.vj = true;
        gpj gpjVar = this.oo;
        if (gpjVar == null || !gpjVar.pcc(nacVar)) {
            return false;
        }
        rj.pcc((View) this.sf, 0);
        return true;
    }

    public void pcc(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.sf;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }
}
