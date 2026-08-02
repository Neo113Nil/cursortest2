package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.yt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private pcc gm;
    private final sf pcc;
    private final com.bytedance.sdk.openadsdk.component.reward.view.qf sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar, int i);
    }

    public wh(sf sfVar) {
        this.pcc = sfVar;
        this.sf = new com.bytedance.sdk.openadsdk.component.reward.view.qf(sfVar);
    }

    private int wh() {
        of ofVar;
        sf sfVar = this.pcc;
        if (sfVar != null && (ofVar = sfVar.sf) != null) {
            int orc = ofVar.orc();
            if (com.bytedance.sdk.openadsdk.core.lu.oo() == null) {
                return -1;
            }
            int pcc2 = com.bytedance.sdk.openadsdk.core.lu.oo().pcc(this.pcc.sf.kot());
            if (!pcc(orc) && !pcc(pcc2)) {
                return Math.min(sf(orc), sf(pcc2));
            }
        }
        return -1;
    }

    public void gm() {
        this.sf.oo();
    }

    public void oo() {
        pcc(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        if (r11.rnn() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar, int i) {
        if (this.pcc != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.pcc.sf);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(this.pcc.sf);
        }
        Objects.toString(sfVar);
        if (this.pcc.rnn.isFinishing() || sfVar == null) {
            return;
        }
        this.pcc.mu.hc();
        if (z2) {
            this.pcc.tmg.set(true);
        }
        sf sfVar2 = this.pcc;
        if (sfVar2.tmh && !sfVar2.hc.get() && !lo.gbb(this.pcc.sf) && !lo.tmg(this.pcc.sf) && (!lo.sf(this.pcc.sf) || !this.pcc.tmg.get() || !this.pcc.gbb.get())) {
            if ((lo.sf(this.pcc.sf) && z3) || !sf(z2)) {
                return;
            }
            if (lo.sf(this.pcc.sf) || lo.oo(this.pcc.sf) || lo.kj(this.pcc.sf)) {
                this.pcc.zti.gm(false);
                sfVar.hc();
                return;
            }
        }
        if (this.pcc.rnn.isDestroyed() || this.pcc.rnn.isFinishing()) {
            return;
        }
        if (this.pcc.sf.nmd()) {
            com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.pcc.yt;
            com.bytedance.sdk.openadsdk.core.ork.gm brandBannerController = (vyVar == null || vyVar.pcc() == null) ? null : vyVar.pcc().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.sf();
            }
            this.pcc.rnn.finish();
            return;
        }
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(z, z2, z3, sfVar, i);
            return;
        }
        this.pcc.fum.lo();
        this.pcc.ye.tz();
        this.pcc.ork.set(false);
        sf sfVar3 = this.pcc;
        if (sfVar3.otd) {
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar3.ywp;
            if (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
            }
        }
        this.pcc.vh.set(false);
        this.pcc.mk.pcc();
        sf sfVar4 = this.pcc;
        sfVar4.zti.pcc(sfVar4.sf.dk());
        if (this.pcc.vy.getAndSet(true)) {
            return;
        }
        if (!atb.sf(this.pcc.sf) || !this.pcc.rt) {
            pcc(z, sfVar);
            return;
        }
        pcc(z, z2, z3, i);
        this.pcc.mu.oo(8);
        this.pcc.zti.gm(true);
        this.pcc.of.ork();
        com.bytedance.sdk.openadsdk.core.jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.wh.1
            @Override // java.lang.Runnable
            public void run() {
                wh.this.pcc.mu.gm();
                if (wh.this.pcc.yt != null) {
                    wh.this.pcc.yt.wh();
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.model.atb.qf(r5.pcc.sf) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sf(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        boolean z;
        this.pcc.qf = wh();
        sf sfVar2 = this.pcc;
        int i = sfVar2.qf;
        if (sfVar2.sf.lo()) {
            return false;
        }
        sf sfVar3 = this.pcc;
        int i2 = sfVar3.qf;
        if (i2 != -1) {
            if (i2 >= 0) {
                sfVar3.lu.set(false);
                Message obtain = Message.obtain();
                obtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                sf sfVar4 = this.pcc;
                obtain.arg1 = sfVar4.qf;
                sfVar4.rj.sendMessage(obtain);
            }
            z = false;
        } else if (sfVar3.ywp == null && atb.kj(sfVar3.sf) && this.pcc.ye.hc()) {
            sfVar.fum();
            z = false;
        } else {
            sfVar.hc();
            z = true;
        }
        if (this.pcc.ye.lo() ? false : z) {
            sf sfVar5 = this.pcc;
            if (sfVar5.gh == null || !sfVar5.qf()) {
                return true;
            }
            sf sfVar6 = this.pcc;
            sfVar6.gh.pcc(sfVar6, sfVar6.qf);
        }
        return true;
    }

    public boolean vj() {
        return this.sf.vj();
    }

    public void sf() {
        this.sf.gm();
    }

    private int sf(int i) {
        if (i <= 1000) {
            return 1000;
        }
        return (i / 1000) * 1000;
    }

    private boolean sf(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc2;
        if (!lo.gm(this.pcc.sf) || (pcc2 = this.pcc.yt.pcc()) == null || pcc2.oo != 0 || z) {
            return true;
        }
        this.pcc.zti.gm(false);
        return false;
    }

    public void pcc() {
        this.sf.pcc();
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        this.sf.pcc(vjVar);
    }

    private boolean pcc(int i) {
        return i < 0 || i > 20000;
    }

    private void pcc(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        if (this.pcc.ye.tsz()) {
            i2 = 1;
        } else {
            i2 = !this.pcc.ye.gbb() ? -1 : 2;
        }
        hashMap.put("webview_state", Integer.valueOf(i2));
        sf sfVar = this.pcc;
        com.bytedance.sdk.openadsdk.oo.gm.pcc(sfVar.sf, sfVar.vj, z, z2, z3, sfVar.rnn.isFinishing(), i, hashMap);
    }

    public void pcc(boolean z, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        gbb gbbVar;
        this.pcc.jr.set(z);
        sfVar.tmg();
        this.pcc.sf.on();
        this.pcc.zti.oo(false);
        this.pcc.zti.gm(false);
        this.pcc.ye.of();
        lo loVar = this.pcc.mu.dax;
        if (loVar != null) {
            loVar.vj();
        }
        this.pcc.mu.gm();
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.pcc.yt;
        if (vyVar != null) {
            vyVar.wh();
        }
        vy vyVar2 = this.pcc.of;
        if (vyVar2 != null) {
            vyVar2.gm(vy.sf);
        }
        sf sfVar2 = this.pcc;
        boolean isEmpty = TextUtils.isEmpty(of.pcc(sfVar2.kun, sfVar2.sf));
        sf sfVar3 = this.pcc;
        if (!isEmpty) {
            yt.pcc(sfVar3.rnn, atb.tmg(sfVar3.sf), this.pcc.sf, sf.pcc.gm, true);
            return;
        }
        if (of.gm(sfVar3.sf) && (gbbVar = this.pcc.lq) != null) {
            gbbVar.wh();
        }
        if (!of.pcc(this.pcc.sf) && (of.gm(this.pcc.sf) || !this.pcc.ye.atb())) {
            sf sfVar4 = this.pcc;
            if (of.pcc(sfVar4.sf, sfVar4.ye.tsz(), this.pcc.ye.zti(), this.pcc.lq.tmg(), this.pcc.ye.yt())) {
                if (!of.oo(this.pcc.sf) && !of.gm(this.pcc.sf)) {
                    this.pcc.ye.pcc(true, 0, (String) null);
                }
                sf(sfVar);
                pcc(sfVar);
                return;
            }
        }
        oo();
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        boolean gm = of.gm(this.pcc.sf);
        sf sfVar2 = this.pcc;
        if (!gm) {
            sfVar2.lq.pcc(8);
            this.pcc.ye.pcc(0);
            this.pcc.ye.ye();
        } else {
            sfVar2.ye.pcc(8);
            this.pcc.lq.pcc(0);
            this.pcc.lq.qf();
        }
        this.pcc.mu.oo(8);
        this.pcc.mu.qf();
        boolean gm2 = of.gm(this.pcc.sf);
        sf sfVar3 = this.pcc;
        if (gm2) {
            sfVar3.rj.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        sfVar3.ye.pcc(sfVar3.xb, true);
        this.pcc.ye.gm(true);
        this.pcc.ye.sf(true);
        mu vy = this.pcc.ye.vy();
        if (vy != null) {
            vy.pcc("prerender_page_show", (JSONObject) null);
        }
        if (!atb.sf(this.pcc.sf)) {
            this.pcc.zti.gm(false);
        }
        com.bytedance.sdk.component.vy.qf kj = this.pcc.ye.kj();
        if (kj == null || kj.getWebView() == null) {
            return;
        }
        kj.tmg();
        kj.getWebView().resumeTimers();
    }

    public void pcc(boolean z) {
        if (!of.oo(this.pcc.sf)) {
            this.pcc.ye.pcc(false, 408, "end_card_timeout");
        }
        this.pcc.ye.sf(com.bytedance.sdk.openadsdk.core.hc.wh.pcc.gm.pcc() ? 1 : 0);
        this.pcc.ye.pcc(8);
        this.pcc.lq.pcc(8);
        this.pcc.mu.oo(8);
        if (this.pcc.sf.on()) {
            if (!this.sf.pcc(this.pcc.fum)) {
                this.pcc.rnn.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.pcc.ywp;
            if (kjVar != null) {
                this.sf.pcc(kjVar.rj().ork());
            }
            this.sf.sf();
        }
        this.pcc.mu.qf();
        if (z) {
            sf(this.pcc.ew);
        }
        this.pcc.zti.gm(false);
        sf sfVar = this.pcc;
        sfVar.jsj.pcc(sfVar.sf.tuy());
    }

    public void pcc(pcc pccVar) {
        this.gm = pccVar;
    }
}
