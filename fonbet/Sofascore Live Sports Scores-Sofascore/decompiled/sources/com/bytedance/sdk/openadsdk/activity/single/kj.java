package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.common.gbb;
import com.bytedance.sdk.openadsdk.common.pcc;
import com.bytedance.sdk.openadsdk.component.reward.tmg;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.widget.lu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.nem;
import defpackage.nwm;
import defpackage.p03;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class kj implements com.bytedance.sdk.openadsdk.core.jr.oo.sf {
    public String gbb;
    private lu gm;
    protected dax gpj;
    public boolean hc;
    public String jr;
    protected boolean lu;
    public boolean nac;
    public int ork;
    private boolean pcc;
    protected final sf qf;
    private boolean sf;
    public boolean tmg;
    public int vh;
    protected com.bytedance.sdk.openadsdk.component.reward.pcc.sf vy;
    protected of wh;
    protected final AtomicBoolean kj = new AtomicBoolean(false);
    public boolean dax = false;

    public kj(sf sfVar, of ofVar, int i, int i2, boolean z) {
        this.qf = sfVar;
        this.wh = ofVar;
        this.ork = i;
        this.vh = i2;
        this.nac = z;
    }

    private Runnable fum() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.2
            @Override // java.lang.Runnable
            public void run() {
                kj.this.iv();
            }
        };
    }

    private dax kj() {
        return new dax(this.vy) { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.1
            @Override // com.bytedance.sdk.openadsdk.common.dax
            public void gm() {
                kj.this.iv();
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public boolean pcc() {
                return kj.this.qf.hc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public boolean sf() {
                return kj.this.qf.tmg().getBoolean("reward_verify", false) || kj.this.qf.nac();
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public void pcc(boolean z) {
                kj.this.qf.sf(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
                kj.this.pcc(sfVar);
            }
        };
    }

    private pcc.InterfaceC0066pcc mk() {
        return new pcc.InterfaceC0066pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.4
            @Override // com.bytedance.sdk.openadsdk.common.pcc.InterfaceC0066pcc
            public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, View view) {
                kj.this.sf(sfVar);
            }
        };
    }

    private pcc.sf of() {
        return new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.3
            @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
            public void pcc(boolean z, int i) {
                kj kjVar = kj.this;
                if (kjVar instanceof pcc) {
                    ((pcc) kjVar).pcc(z, i);
                } else if (kjVar instanceof vj) {
                    kjVar.vh();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
            public void pcc() {
                kj.this.iv();
            }
        };
    }

    private void pcc(dax daxVar) {
        com.bytedance.sdk.openadsdk.common.pcc.sf(new gbb.pcc(this.vy, "BVA", fum(), of()).pcc(b_()).pcc(daxVar).pcc(mk()).pcc());
    }

    public void a_() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar;
        sf sfVar2 = this.qf;
        boolean z = sfVar2 != null && sfVar2.gm();
        if (z && (sfVar = this.vy) != null && !(sfVar.ywp instanceof wh)) {
            this.gpj = kj();
        }
        if (z) {
            pcc(this.gpj);
        }
    }

    public boolean b_() {
        return false;
    }

    public void bg() {
        if (tsx() || yt() == null || yt().nn == null || !yt().sf.jkt()) {
            return;
        }
        lu luVar = new lu(yt(), new lu.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
            public void gm() {
                sf sfVar = kj.this.qf;
                if (sfVar != null) {
                    sfVar.lq();
                }
                kj.this.oo(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
            public int oo() {
                sf sfVar = kj.this.qf;
                if (sfVar != null) {
                    return sfVar.zti();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
            public void pcc() {
                kj kjVar = kj.this;
                kjVar.gm(kjVar.yt());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
            public void sf() {
                sf sfVar = kj.this.qf;
                if (sfVar != null) {
                    sfVar.ye();
                }
                kj.this.oo(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
            public void vj() {
                kj.this.oo(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
            public void wh() {
                kj.this.oo(1);
            }
        });
        this.gm = luVar;
        luVar.pcc(yt().nn);
    }

    public abstract boolean c_();

    public abstract String d_();

    public abstract void e_();

    public void erj() {
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(((p03) CacheDirFactory.getICacheDir(this.wh.we())).u(), this.wh);
        pcc.pcc("material_meta", this.wh);
        pcc.pcc("ad_slot", this.wh.gqd());
        com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new nwm() { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.6
            @Override // defpackage.etm
            public void pcc(nem nemVar, int i, String str) {
            }

            @Override // defpackage.etm
            public void pcc(nem nemVar, int i) {
            }
        });
    }

    public abstract boolean f_();

    public final void fmh() {
        this.qf.gbb();
    }

    public JSONObject gd() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.jr);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.gbb);
            jSONObject.put("trans_id", tsz.pcc().replace("-", ""));
            if (yt() != null) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt = yt();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, (int) yt.fum.tsz());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, yt.sf.gdh());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, yt.sf.otd());
                jSONObject.put("network", com.bytedance.sdk.component.utils.lu.gm(yt.kun));
                JSONObject zvx = yt.sf.zvx();
                zvx.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
                jSONObject.put("extra", zvx);
                jSONObject.put("video_duration", yt.sf.kez().d);
                String str = "unKnow";
                int bxz = yt.sf.bxz();
                if (bxz == 2) {
                    str = kun.sf();
                } else if (bxz == 1) {
                    str = kun.oo();
                }
                jSONObject.put("user_agent", str);
            }
            return jSONObject;
        } catch (Throwable th) {
            lo.pcc("Scene", "", th);
            return null;
        }
    }

    public void gm(final int i) {
        if (this.qf.tmg().getBoolean("reward_verify", false) || this.qf.nac() || this.qf.hc()) {
            return;
        }
        this.qf.tmg().putBoolean("reward_verify", true);
        if (yt() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt = yt();
        if (com.bytedance.sdk.openadsdk.core.lu.oo().nac(String.valueOf(yt.wh))) {
            pcc(true, yt.sf.otd(), yt.sf.gdh(), 0, "", i);
        } else {
            com.bytedance.sdk.openadsdk.core.lu.gm().pcc(gd(), new of.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.kj.5
                @Override // com.bytedance.sdk.openadsdk.core.of.sf
                public void pcc(yt.sf sfVar) {
                    kj.this.pcc(sfVar.sf, sfVar.gm.pcc(), sfVar.gm.sf(), 0, "", i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.of.sf
                public void pcc(int i2, String str) {
                    kj.this.pcc(false, 0, "", i2, str, i);
                }
            });
        }
    }

    public abstract void gm(boolean z);

    public void gpj() {
        lu luVar = this.gm;
        if (luVar != null) {
            luVar.kj();
            this.gm = null;
        }
        this.pcc = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void hoh() {
        sf sfVar = this.qf;
        if (sfVar != null) {
            sfVar.pcc(this, true);
        }
    }

    public void hpk() {
        sf sfVar = this.qf;
        if (sfVar == null || sfVar.gpj()) {
            return;
        }
        this.qf.dax();
        this.qf.fum();
    }

    public void iv() {
        if (this.wh != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.wh);
        }
        this.qf.qf();
    }

    public int kun() {
        return this.vh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void kz() {
        if (yt() != null) {
            yt().jsj.pcc();
        }
    }

    public boolean lq() {
        return false;
    }

    public Activity lrr() {
        return this.qf.kj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
        gm(2);
    }

    public void oo(int i) {
        sf sfVar = this.qf;
        if (sfVar != null) {
            sfVar.pcc(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ork() {
        toString();
        hpk();
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.kj pcc();

    public abstract void pcc(Activity activity, sf.vj vjVar);

    public abstract void pcc(String str);

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        fmh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public List<com.bytedance.sdk.openadsdk.core.model.of> ptr() {
        return this.qf.mk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void qcw() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        fmh();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null || (ofVar = sfVar.sf) == null) {
            return;
        }
        ofVar.hu();
        this.vy.sf.oo(true);
        if (com.bytedance.sdk.openadsdk.core.model.of.vj(this.vy.sf)) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.vy;
            com.bytedance.sdk.openadsdk.core.model.of ofVar2 = sfVar2.sf;
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar2, sfVar2.vj, ofVar2.zex());
        }
    }

    public boolean qy() {
        return false;
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar;
        tmg tmgVar;
        if (!c_() || (sfVar = this.vy) == null || (tmgVar = sfVar.ra) == null) {
            return;
        }
        tmgVar.oo();
    }

    public sf rj() {
        return this.qf;
    }

    public boolean rnn() {
        sf sfVar = this.qf;
        return sfVar != null && sfVar.pcc(this, this.ork);
    }

    public boolean se() {
        return this.sf;
    }

    public void sf(Activity activity) {
        if (com.bytedance.sdk.openadsdk.yt.vj.vy() && activity != null && activity.isChangingConfigurations()) {
            sf sfVar = this.qf;
            if (sfVar == null || sfVar.pcc() == null) {
                return;
            }
            ork.pcc(this.qf.pcc(), "close_interception_config_change", this.qf.pcc().vj(), (String) null);
            return;
        }
        Objects.toString(this.qf);
        if (!this.qf.gpj() && !xb()) {
            long vy = this.qf.pcc().vy();
            if (vy > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - vy;
                if (elapsedRealtime > 0) {
                    this.wh.sf(elapsedRealtime);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt = yt();
            if (yt != null) {
                yt.pcc(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                yt.jsj.pcc();
            }
        }
        ri();
        this.qf.jr();
    }

    public boolean tsx() {
        return this.nac;
    }

    public abstract boolean tz();

    public void vj(boolean z) {
        this.sf = z;
    }

    public boolean vr() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        lu luVar;
        if (tsx() || (yt = yt()) == null || !yt.sf.jkt() || (luVar = this.gm) == null) {
            return false;
        }
        return luVar.pcc(yt.rnn);
    }

    public void wh(boolean z) {
        this.lu = z;
    }

    public boolean xb() {
        com.bytedance.sdk.openadsdk.core.model.of pcc = this.qf.pcc();
        if (pcc != null) {
            List<com.bytedance.sdk.openadsdk.core.model.of> ky = pcc.ky();
            for (int i = 0; i < ky.size(); i++) {
                com.bytedance.sdk.openadsdk.core.model.of ofVar = ky.get(i);
                if (ofVar != null && ofVar.iv()) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt();

    public void zsj() {
        gm(0);
    }

    public boolean zti() {
        return false;
    }

    public void oo() {
    }

    public void gbb() {
    }

    public void hc() {
    }

    public void lo() {
    }

    public void nn() {
    }

    public void tsz() {
    }

    public void pcc(Activity activity) {
    }

    public void pcc(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
    }

    public void pcc(kj kjVar, kj kjVar2, sf.vj vjVar) {
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
    }

    public void pcc(Map<String, Object> map, float f, float f2) {
    }

    public void pcc(boolean z, boolean z2, boolean z3, int i) {
        this.qf.pcc(this, z, z2, z3, i);
    }

    public final void pcc(boolean z, int i, String str, int i2, String str2, int i3) {
        if (this.qf.nac()) {
            return;
        }
        this.qf.pcc(this, z, i, str, i2, str2, i3);
        tmg.pcc(this.wh, z, i3);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, int i2) {
        this.wh = ofVar;
        this.ork = i;
        this.vh = i2;
    }

    public void gm() {
    }

    public void gm(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (rnn()) {
            return;
        }
        sf.vj vjVar = new sf.vj(8, sfVar);
        vjVar.oo = sfVar.xb;
        sf sfVar2 = this.qf;
        if (sfVar2 != null) {
            sfVar2.sf(this, vjVar);
        }
    }

    public final void sf(Activity activity, sf.vj vjVar) {
        if (this.pcc) {
            return;
        }
        this.pcc = true;
        pcc(activity, vjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
    }

    public void sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (sfVar == null) {
            return;
        }
        try {
            int zti = this.qf.zti();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(zti, 0));
            com.bytedance.sdk.openadsdk.oo.gm.vj(this.wh, sfVar.vj, jSONObject);
        } catch (Throwable unused) {
        }
        gm(sfVar);
    }
}
