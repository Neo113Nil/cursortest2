package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.component.reward.pcc.hc;
import com.bytedance.sdk.openadsdk.component.reward.pcc.lu;
import com.bytedance.sdk.openadsdk.component.reward.pcc.nac;
import com.bytedance.sdk.openadsdk.component.reward.view.vh;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    protected int gm;
    protected final hc kj;
    protected int oo;
    protected tsz ork;
    protected com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
    protected final lu qf;
    protected of sf;
    protected final nac vj;
    protected com.bytedance.sdk.openadsdk.core.jr.oo.sf vy;
    protected final vh wh;

    public pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.pcc = sfVar;
        this.sf = sfVar.sf;
        this.gm = sfVar.erj;
        this.oo = sfVar.se;
        this.vj = sfVar.fum;
        this.wh = sfVar.mu;
        this.qf = sfVar.ye;
        this.kj = sfVar.zti;
    }

    public void gm() {
        if (atb.sf(this.pcc.sf) && DeviceUtils.qf() == 0) {
            this.pcc.xb = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        sfVar.zti.sf(sfVar.xb);
    }

    public void pcc(boolean z) {
        if (this.pcc.vy.get()) {
            return;
        }
        of ofVar = this.sf;
        if (ofVar != null && ofVar.nmd()) {
            this.kj.gm(false);
            this.kj.pcc(true);
            this.pcc.mu.sf(8);
            this.pcc.mu.oo(8);
            return;
        }
        hc hcVar = this.kj;
        if (z) {
            hcVar.pcc(this.pcc.sf.dk());
            if (pcc()) {
                this.kj.gm(true);
            }
            if (pcc() || ((this instanceof qf) && this.pcc.sf.wh())) {
                this.kj.oo(true);
            } else {
                this.kj.vj();
                this.pcc.mu.wh(0);
            }
        } else {
            hcVar.gm(false);
            this.kj.pcc(false);
            this.kj.oo(false);
            this.pcc.mu.wh(8);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        if (!z) {
            sfVar.mu.sf(4);
            this.pcc.mu.gm(8);
            this.pcc.mu.oo(8);
        } else if (sfVar.gd != com.bytedance.sdk.openadsdk.component.reward.view.gm.pcc) {
            sfVar.mu.sf(8);
            this.pcc.mu.oo(8);
        } else {
            sfVar.mu.sf(0);
            this.pcc.mu.gm(0);
            this.pcc.mu.oo(0);
        }
    }

    public boolean sf() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        boolean z = sfVar.ywp == null;
        boolean qf = sfVar.fum.qf();
        boolean z2 = lo.gm(this.pcc.sf) || !of.vj(this.pcc.sf);
        if (z && qf && z2) {
            return false;
        }
        boolean sf = lo.sf(this.pcc.sf);
        boolean z3 = this.pcc.dax.get();
        if (sf && z3) {
            FrameLayout wh = this.pcc.mu.wh();
            wh.setVisibility(4);
            wh.setVisibility(0);
            return false;
        }
        boolean z4 = this.pcc.vy.get();
        boolean z5 = this.pcc.ork.get();
        if (z4 || z5) {
            return false;
        }
        return this.pcc.fum.vy() || this.pcc.fum.lq();
    }

    public boolean pcc() {
        return this.pcc.sf.on() || this.pcc.sf.ct() == 15 || this.pcc.sf.ct() == 5 || this.pcc.sf.ct() == 50;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, tsz tszVar) {
        this.vy = sfVar;
        this.ork = tszVar;
    }
}
