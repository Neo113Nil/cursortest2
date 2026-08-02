package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.kj;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.hc;
import com.bytedance.sdk.openadsdk.component.reward.pcc.lu;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.vh;
import com.bytedance.sdk.openadsdk.component.reward.view.vy;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.swm;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class sf extends pcc {
    private com.bytedance.sdk.openadsdk.hc.qf hc;
    public com.bytedance.sdk.openadsdk.core.widget.sf tmg;
    protected com.bytedance.sdk.openadsdk.core.gm.vj vh;

    public sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
    }

    private void gm(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        vh vhVar = sfVar.mu;
        if (vhVar != null && vhVar.ork() != null) {
            sfVar.mu.ork().performClick();
            return;
        }
        vh vhVar2 = sfVar.mu;
        if (vhVar2 == null || vhVar2.vh() == null) {
            return;
        }
        sfVar.mu.vh().performClick();
    }

    private void oo(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        hc hcVar = sfVar.zti;
        if (hcVar != null) {
            hcVar.oo();
        }
    }

    public void dax() {
        int i;
        if (this.pcc.vy.get() && this.pcc.lu.getAndSet(false) && ((i = this.pcc.qf) >= 0 || i == -1)) {
            Message obtain = Message.obtain();
            obtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            obtain.arg1 = sfVar.qf;
            sfVar.rj.sendMessage(obtain);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
        if (sfVar2.kj <= 0 || !sfVar2.gpj.getAndSet(false)) {
            return;
        }
        Message obtain2 = Message.obtain();
        obtain2.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
        obtain2.arg1 = sfVar3.kj;
        sfVar3.rj.sendMessage(obtain2);
    }

    public void fum() {
        this.pcc.zti.gm();
        this.pcc.zti.vj(true);
    }

    public void gbb() {
        tsz tszVar = this.ork;
        if (tszVar != null) {
            tszVar.removeMessages(300);
        }
    }

    public void gpj() {
        sf(false);
    }

    public void hc() {
        if (this.pcc.qf()) {
            this.pcc.zti.vj();
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            boolean z = false;
            if (!sfVar.gdh || !(sfVar.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.pcc)) {
                sfVar.mu.wh(0);
            }
            lu luVar = this.pcc.ye;
            boolean z2 = luVar != null && luVar.lo();
            if (atb.wh(this.pcc.sf) && !z2) {
                z = true;
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
            if (sfVar2.gh != null) {
                if (sfVar2.gbb.get() || z) {
                    this.pcc.gh.oo();
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
                    sfVar3.gh.pcc(sfVar3, sfVar3.qf);
                }
            }
        }
    }

    public void jr() {
        if (this.pcc.ywp != null || ((!atb.sf(this.sf) && !atb.gm(this.sf)) || (atb.kj(this.sf) && this.pcc.ye.mk() && !this.pcc.ye.lq()))) {
            dax();
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        if (sfVar == null) {
            return;
        }
        if (sfVar.gh != null && !sfVar.ork.get()) {
            this.pcc.gh.pcc();
        }
        this.pcc.oo();
    }

    public boolean jsj() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010b, code lost:
    
        if (r2.pcc == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View kj() {
        View createPAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this.pcc.rnn);
        gmVar.setId(nac.wke);
        View sf = com.bytedance.sdk.openadsdk.core.widget.wh.sf(this.pcc.rnn);
        sf.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = rj.sf(this.pcc.rnn, 20.0f);
        layoutParams.rightMargin = rj.sf(this.pcc.rnn, 16.0f);
        sf.setLayoutParams(layoutParams);
        sf.setContentDescription(tz.pcc(this.pcc.rnn, "tt_ad_close_text"));
        sf.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wh.oo pcc = com.bytedance.sdk.openadsdk.core.widget.wh.pcc(this.pcc.rnn, gmVar);
        pcc.setId(nac.st);
        pcc.setContentDescription(tz.pcc(this.pcc.rnn, "tt_close_backup_button_text"));
        kj kjVar = this.pcc.ywp;
        if (kjVar == null || !kjVar.rj().jsj()) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(sfVar.rnn, sfVar.sf);
            createPAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, rj.sf(this.pcc.rnn, 14.0f));
            layoutParams2.gravity = 8388691;
            createPAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            createPAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(this.pcc.rnn);
        ooVar.setId(nac.jum);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(rj.sf(this.pcc.rnn, 32.0f), rj.sf(this.pcc.rnn, 14.0f));
        layoutParams3.gravity = 8388693;
        ooVar.setLayoutParams(layoutParams3);
        ooVar.setPadding(rj.sf(this.pcc.rnn, 9.0f), 0, rj.sf(this.pcc.rnn, 9.0f), 0);
        ooVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (createPAGLogoViewByMaterial != null) {
            gmVar.addView(createPAGLogoViewByMaterial);
        }
        gmVar.addView(ooVar);
        if (this.pcc.sf.xb()) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
            if (sfVar2.gdh) {
            }
        }
        View gmVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.gm(this.pcc.rnn);
        gmVar2.setId(nac.on);
        gmVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        gmVar.addView(gmVar2);
        gmVar.addView(sf);
        return gmVar;
    }

    public void lo() {
        if (!this.pcc.of.vh() && com.bytedance.sdk.openadsdk.core.lu.oo().tz(String.valueOf(this.pcc.wh)) == 1) {
            int pcc = pcc(this.pcc);
            boolean sf = sf(this.pcc);
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            if (sf) {
                gm(sfVar);
            } else if (pcc(sfVar, pcc)) {
                oo(this.pcc);
            }
        }
    }

    public void lu() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        if (sfVar == null) {
            return;
        }
        vh vhVar = sfVar.mu;
        if (vhVar != null) {
            vhVar.nac();
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
        boolean z = sfVar2.xb;
        sfVar2.atb.pcc();
        DeviceUtils.qf();
        this.pcc.ye.jr();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
        if (sfVar3.xb) {
            sfVar3.rnn.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.sf.1
                @Override // java.lang.Runnable
                public void run() {
                    if (sf.this.pcc.atb.pcc() > 0) {
                        sf.this.pcc.atb.pcc(false);
                    }
                }
            });
        }
    }

    public void nac() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        if (sfVar == null) {
            return;
        }
        try {
            sfVar.ri = false;
            boolean z = sfVar.xb;
            if (!sfVar.ork.get()) {
                this.pcc.fum.dax();
            }
            gbb();
            this.pcc.ye.dax();
            this.pcc.of.kj();
            this.pcc.gpj.set(true);
            if (this.pcc.vy.get()) {
                this.pcc.lu.set(true);
            }
            gbb gbbVar = this.pcc.gh;
            if (gbbVar != null) {
                gbbVar.sf();
            }
            this.pcc.vj();
        } catch (Throwable unused) {
        }
    }

    public void of() {
        if (!vj() && (this instanceof qf)) {
            this.pcc.jsj.sf();
            return;
        }
        if (!this.vy.pcc(this.vj.jr(), false)) {
            this.pcc.fum.vh();
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            if (sfVar.gdh) {
                kj kjVar = sfVar.ywp;
                if (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) {
                    ((com.bytedance.sdk.openadsdk.activity.single.pcc) kjVar).of();
                }
            }
            pcc(sf.C0122sf.pcc);
            com.bytedance.sdk.openadsdk.component.reward.pcc.nac nacVar = this.vj;
            nacVar.pcc(!nacVar.rnn() ? 1 : 0, 4);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
        of ofVar = sfVar2.sf;
        if (ofVar == null || sfVar2.gh == null || !ofVar.nmd()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
        sfVar3.gh.pcc(sfVar3, sfVar3.fum.tsz());
    }

    public abstract boolean oo();

    public void ork() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        sfVar.qy.pcc(sfVar, sfVar.oo);
        this.pcc.mu.sf();
        this.pcc.pq.pcc();
        if (!this.pcc.sf.on()) {
            this.pcc.ye.pcc();
            this.pcc.lq.pcc();
        }
        this.pcc.of.qf();
        this.pcc.zti.pcc();
        if (atb.wh(this.pcc.sf)) {
            this.pcc.mu.oo();
            rj.pcc((View) this.pcc.ye.kj(), 4);
        }
        if (lo.oo(this.pcc.sf) || lo.sf(this.pcc.sf) || lo.kj(this.pcc.sf)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
        sfVar2.mu.pcc(rj.sf(sfVar2.kun, sfVar2.erj), rj.sf(this.pcc.kun, r2.se));
        this.pcc.tz.pcc();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
        if (sfVar3.kz) {
            sfVar3.mu.pcc(0);
        }
    }

    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        vh vhVar;
        lo loVar;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        int i = message.what;
        if (i == 1) {
            fum();
            return;
        }
        if (i == 300) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            if (sfVar.gdh) {
                kj kjVar = sfVar.ywp;
                if (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) {
                    ((com.bytedance.sdk.openadsdk.activity.single.pcc) kjVar).of();
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
                    ork.pcc(sfVar2.sf, "play_video_time_out", sfVar2.vj, (String) null);
                    gto = this.pcc.sf.gto();
                    if (gto != null && (pcc = gto.pcc()) != null) {
                        pcc.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
                    }
                    vhVar = this.pcc.mu;
                    if (vhVar != null || (loVar = vhVar.dax) == null) {
                        return;
                    }
                    loVar.ork();
                    return;
                }
            }
            pcc(sf.C0122sf.sf);
            com.bytedance.sdk.openadsdk.component.reward.pcc.nac nacVar = this.pcc.fum;
            nacVar.pcc(!nacVar.rnn() ? 1 : 0, 1 ^ (this.pcc.fum.rnn() ? 1 : 0));
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar22 = this.pcc;
            ork.pcc(sfVar22.sf, "play_video_time_out", sfVar22.vj, (String) null);
            gto = this.pcc.sf.gto();
            if (gto != null) {
                pcc.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
            }
            vhVar = this.pcc.mu;
            if (vhVar != null) {
                return;
            } else {
                return;
            }
        }
        if (i == 400) {
            this.pcc.fum.lo();
            pcc(false, true, false, 3);
            return;
        }
        if (i == 500) {
            if (!atb.vj(this.pcc.sf)) {
                this.pcc.zti.gm(false);
            }
            com.bytedance.sdk.component.vy.qf kj = this.pcc.ye.kj();
            if (kj != null && kj.getWebView() != null) {
                kj.tmg();
                kj.getWebView().resumeTimers();
            }
            if (this.pcc.ye.kj() != null) {
                this.pcc.ye.pcc(1.0f);
                this.pcc.mu.pcc(1.0f);
            }
            if (!this.pcc.sf.tuy() && this.pcc.fum.wh() && this.pcc.jr.get()) {
                this.pcc.fum.lo();
                return;
            }
            return;
        }
        if (i == 600) {
            hc();
            return;
        }
        if (i == 700) {
            int i2 = message.arg1;
            if (this.pcc.lu.get()) {
                return;
            }
            if (i2 <= 0) {
                this.ork.removeMessages(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
                if (!atb.qf(this.sf)) {
                    hc();
                    return;
                } else if (this.pcc.of.sf() || !this.pcc.ye.hc()) {
                    hc();
                    return;
                } else {
                    fum();
                    return;
                }
            }
            this.pcc.zti.sf();
            this.pcc.zti.pcc((CharSequence) ((i2 / 1000) + "s"));
            this.pcc.zti.vj(false);
            Message obtain = Message.obtain();
            obtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
            obtain.arg1 = i2 - 1000;
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
            sfVar3.qf -= 1000;
            this.ork.sendMessageDelayed(obtain, 1000L);
            return;
        }
        if (i == 800) {
            if (!atb.sf(this.pcc.sf)) {
                this.pcc.zti.gm(false);
            }
            this.pcc.mu.pcc(1.0f);
            if (!this.pcc.sf.tuy() && this.pcc.fum.wh() && this.pcc.jr.get()) {
                this.pcc.fum.lo();
                return;
            }
            return;
        }
        if (i == 900 && !this.pcc.gpj.get()) {
            int i3 = message.arg1;
            double tsx = this.pcc.fum.tsx();
            pcc(i3, (long) (1000.0d * tsx));
            if (i3 <= 0) {
                this.ork.removeMessages(900);
                hc();
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = this.pcc;
                kj kjVar2 = sfVar4.ywp;
                if (sfVar4.gdh && (kjVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.pcc)) {
                    kjVar2.rj().pcc(kjVar2, new sf.vj(5, this.pcc));
                    return;
                }
                return;
            }
            this.pcc.zti.sf();
            this.pcc.zti.pcc((CharSequence) ((i3 / 1000) + "s"));
            this.pcc.zti.vj(false);
            Message obtain2 = Message.obtain();
            obtain2.what = 900;
            int i4 = i3 - 1000;
            obtain2.arg1 = i4;
            this.pcc.kj = i4;
            this.ork.sendMessageDelayed(obtain2, 1000L);
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar5 = this.pcc;
            if (sfVar5.gdh) {
                kj kjVar3 = sfVar5.ywp;
                if (!(kjVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) || tsx <= 0.0d) {
                    return;
                }
                ((com.bytedance.sdk.openadsdk.activity.single.pcc) kjVar3).pcc((float) (1.0d - ((i3 / 1000.0f) / tsx)));
            }
        }
    }

    public abstract void pcc(FrameLayout frameLayout);

    public RFEndCardBackUpLayout qf() {
        return new RFEndCardBackUpLayout(this.pcc.kun);
    }

    public final void qy() {
        if (this.pcc.rnn.isFinishing()) {
            return;
        }
        this.pcc.ye.ork();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        String str = sfVar.oo ? "reward_endcard" : "fullscreen_endcard";
        sfVar.ye.pcc(this.hc, str, sfVar.tsx);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
        if (sfVar2.rt) {
            sfVar2.of.pcc(sfVar2.xb);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.pcc;
        sfVar3.ye.pcc(str, sfVar3.tsx);
        this.pcc.ye.vj();
    }

    public void sf(boolean z) {
        try {
            vy vyVar = this.pcc.yt;
            if (vyVar != null && !z) {
                vyVar.wh();
            }
            vh vhVar = this.pcc.mu;
            if (vhVar != null) {
                vhVar.jr();
            }
            this.pcc.fum.mu();
            if (!oo()) {
                this.pcc.vy.get();
            }
            lu luVar = this.pcc.ye;
            if (luVar != null) {
                luVar.vh();
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.vy vyVar2 = this.pcc.of;
            if (vyVar2 != null) {
                vyVar2.gm(com.bytedance.sdk.openadsdk.component.reward.pcc.vy.pcc);
            }
            vh vhVar2 = this.pcc.mu;
            if (vhVar2 != null) {
                vhVar2.hc();
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.wh whVar = this.pcc.pq;
            if (whVar != null) {
                whVar.gm();
            }
            gbb gbbVar = this.pcc.gh;
            if (gbbVar != null) {
                gbbVar.gm();
            }
        } catch (Throwable unused) {
        }
    }

    public void tmg() {
        com.bytedance.sdk.openadsdk.core.widget.sf sfVar = this.tmg;
        if (sfVar == null || !sfVar.isShowing()) {
            return;
        }
        this.tmg.dismiss();
    }

    public void tz() {
        this.vh = this.pcc.jsj.gm();
    }

    public abstract boolean vj();

    public View vy() {
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar;
        if (this.sf.pv() != 5) {
            qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(this.pcc.rnn);
            qfVar.setId(nac.jk);
        } else {
            qfVar = null;
        }
        Objects.toString(qfVar);
        return qfVar;
    }

    public abstract void wh();

    public void yt() {
        gm();
        if (!this.pcc.sf.on() && jsj()) {
            qy();
        }
        if (jsj()) {
            this.pcc.pq.sf();
        }
        if (lo.oo(this.pcc.sf) || lo.kj(this.pcc.sf)) {
            this.ork.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
        sfVar.mu.pcc(sfVar.gd == 100.0f);
        tz();
        wh();
    }

    public void vh() {
    }

    private boolean sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        vh vhVar = sfVar.mu;
        return vhVar != null && vhVar.vy();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.pcc
    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, tsz tszVar) {
        super.pcc(sfVar, tszVar);
        if (this.pcc.sf.wh()) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
            if (sfVar2.tmh) {
                sfVar2.ye.pcc(false);
            }
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.view.kj kjVar) {
        pcc(kjVar, this.pcc);
    }

    public void pcc(boolean z, boolean z2, boolean z3, int i) {
        this.pcc.pq.pcc(z, z2, z3, this, i);
    }

    private int pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (atb.gm(sfVar.sf)) {
            return sfVar.sf.ys();
        }
        boolean z = sfVar.oo;
        of ofVar = sfVar.sf;
        return z ? ofVar.quq() : ofVar.bm();
    }

    private boolean pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, int i) {
        if (i == -1) {
            return false;
        }
        boolean z = !sfVar.vy.get() || atb.gm(sfVar.sf);
        com.bytedance.sdk.openadsdk.component.reward.pcc.nac nacVar = sfVar.fum;
        boolean z2 = nacVar != null && nacVar.gbb() >= ((long) i) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.pcc.vy vyVar = sfVar.of;
        return z && (z2 || (vyVar != null && vyVar.oo()));
    }

    public void pcc(int i) {
        this.vj.lo();
        pcc(false, true, false, i);
        if (this.pcc.oo) {
            this.vy.sf(10000);
        }
    }

    private void pcc(long j, long j2) {
        long j3 = j2 - j;
        Activity activity = this.pcc.rnn;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).gm(j3, j2);
        }
    }

    public static void pcc(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        final com.bytedance.sdk.openadsdk.core.wh.oo ooVar;
        Context context = frameLayout.getContext();
        if (sfVar.tmh) {
            com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
            gmVar.setId(nac.tmg);
            frameLayout.addView(gmVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout pcc = pcc(context);
            boolean vj = of.vj(sfVar.sf);
            of ofVar = sfVar.sf;
            String str = "";
            if (vj) {
                swm kez = ofVar.kez();
                if (kez != null) {
                    str = kez.f;
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.lu> by = ofVar.by();
                if (by != null && !by.isEmpty()) {
                    str = by.get(0).pcc();
                }
            }
            if (TextUtils.isEmpty(str)) {
                ooVar = null;
            } else {
                ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
                int i = nac.pjm;
                ooVar.setId(i);
                ooVar.setTag(i, str);
                ooVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                pcc.addView(ooVar);
            }
            gmVar.addView(pcc);
            gmVar.addView(new com.bytedance.sdk.openadsdk.core.widget.vh(context), new FrameLayout.LayoutParams(-1, -1));
            View ooVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.oo(context);
            ooVar2.setId(nac.gbb);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(ooVar2, layoutParams);
            ooVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.sf.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View findViewById = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.nn.findViewById(520093757);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View findViewById2 = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.nn.findViewById(nac.jum);
                    if (findViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View findViewById3 = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.nn.findViewById(nac.we);
                    if (findViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.wh.oo ooVar3 = ooVar;
                    if (ooVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = ooVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            ooVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
            vjVar.setId(nac.jr);
            vjVar.setOrientation(1);
            vjVar.setVisibility(8);
            frameLayout.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (sfVar.lrr) {
            View qfVar = new com.bytedance.sdk.component.vy.qf(context, true, qf.gm.ENDCARD);
            qfVar.setId(nac.dax);
            qfVar.setLayerType(2, null);
            qfVar.setVisibility(4);
            boolean qf = lo.qf(sfVar.sf);
            boolean hc = lo.hc(sfVar.sf);
            if (!sfVar.wax && (qf || hc)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = rj.sf(sfVar.kun, 58.0f);
                frameLayout.addView(qfVar, layoutParams2);
            } else {
                frameLayout.addView(qfVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(nac.nac);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (atb.sf(sfVar.sf)) {
                View gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
                gmVar2.setId(nac.slc);
                gmVar2.setVisibility(4);
                frameLayout.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout pcc(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setId(nac.hc);
        gmVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        gmVar.setLayoutParams(layoutParams);
        return gmVar;
    }
}
