package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.widget.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class dax {
    protected String gm;
    protected String oo;
    protected final com.bytedance.sdk.openadsdk.component.reward.pcc.sf qf;
    protected String sf;
    protected String vj;
    protected String wh;

    public dax(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.qf = sfVar;
        vj();
    }

    private void gm(final boolean z, final Runnable runnable) {
        sf(z);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
        if (sfVar == null || sfVar.rnn.isFinishing() || this.qf.rnn.isDestroyed()) {
            com.bytedance.sdk.component.utils.lo.gm("RewardTipDialogHelper", "adContext or activity is null");
            return;
        }
        final com.bytedance.sdk.openadsdk.core.widget.sf sfVar2 = new com.bytedance.sdk.openadsdk.core.widget.sf(this.qf.rnn);
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar3 = this.qf.ew;
        if (sfVar3 == null) {
            com.bytedance.sdk.component.utils.lo.gm("RewardTipDialogHelper", "adContext or  adType == null");
            return;
        }
        sfVar3.tmg = sfVar2;
        if (z) {
            sfVar2.pcc(this.gm).gm(this.vj).oo(this.wh);
        } else {
            sfVar2.pcc(this.sf).gm(this.oo).oo(this.wh);
        }
        sfVar2.pcc(new sf.InterfaceC0105sf() { // from class: com.bytedance.sdk.openadsdk.common.dax.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0105sf
            public void pcc() {
                dax.this.gm(z);
                sfVar2.dismiss();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0105sf
            public void sf() {
                sfVar2.dismiss();
                dax.this.pcc(true);
                dax.this.qf.nac.set(false);
                dax.this.qf.of.sf(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                boolean z2 = z;
                dax daxVar = dax.this;
                if (!z2) {
                    daxVar.oo();
                } else if (daxVar.qf.gdh || !daxVar.kj()) {
                    dax.this.qf.jsj.wh();
                    dax.this.gm();
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kj() {
        if (!atb.kj(this.qf.sf)) {
            return false;
        }
        this.qf.of.vy();
        return true;
    }

    private boolean qf() {
        return com.bytedance.sdk.openadsdk.core.lu.oo().kj(String.valueOf(this.qf.wh));
    }

    private boolean sf(boolean z, boolean z2, Runnable runnable) {
        if ((z || !wh() || !kj()) && runnable == null) {
            if (z2) {
                gm();
                return true;
            }
            oo();
        }
        return false;
    }

    private void vj() {
        if (this.sf != null) {
            return;
        }
        try {
            this.sf = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_reward_msg");
            this.gm = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_msgPlayable");
            this.wh = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_negtiveBtnBtnText");
            this.oo = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_postiveBtnText");
            this.vj = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    private boolean vy() {
        return !this.qf.sf.xb() && atb.kj(this.qf.sf) && this.qf.ye.kj().getVisibility() == 0;
    }

    private boolean wh() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
        return !sfVar.gdh && sfVar.vy.get();
    }

    public abstract void gm();

    public void oo() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
        if (sfVar == null) {
            com.bytedance.sdk.component.utils.lo.gm("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar.ywp;
        if (kjVar == null || !(kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.vj)) {
            sfVar.fum.zti();
            pcc.pcc(this.qf);
            pcc(this.qf);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.single.vj) kjVar).kj()) {
                return;
            }
            gm();
        }
    }

    public abstract void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar);

    public abstract void pcc(boolean z);

    public abstract boolean pcc();

    public final boolean pcc(boolean z, boolean z2, Runnable runnable) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
        if (sfVar.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
            if (!sfVar.oo || sf() || (this.qf.ywp.rj() != null && this.qf.ywp.rj().nac())) {
                return false;
            }
            if (!z2 && pcc()) {
                return false;
            }
            if (!qf()) {
                if (!z2) {
                    return false;
                }
                if (runnable == null && z) {
                    gm();
                    return true;
                }
            }
        } else {
            if (pcc(z2, runnable)) {
                return false;
            }
            if (!qf()) {
                return sf(z2, z, runnable);
            }
            if (sf()) {
                sf(z, runnable);
                return false;
            }
            if (vy()) {
                this.qf.of.vy();
                return false;
            }
        }
        gm(z, runnable);
        return true;
    }

    public abstract boolean sf();

    private void sf(boolean z, Runnable runnable) {
        if (!(wh() && kj()) && runnable == null) {
            if (z) {
                gm();
            } else {
                oo();
            }
        }
    }

    private void sf(boolean z) {
        this.qf.fum.tz();
        if (z) {
            this.qf.of.wh();
        }
        this.qf.nac.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(boolean z) {
        this.qf.fum.fum();
        if (z) {
            this.qf.of.pcc(1000);
        }
        this.qf.nac.set(false);
    }

    private boolean pcc(boolean z, Runnable runnable) {
        if (z || !pcc()) {
            return false;
        }
        if (!this.qf.gdh) {
            if (wh()) {
                return kj();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        oo();
        return true;
    }
}
