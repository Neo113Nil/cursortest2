package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.common.pcc;
import com.bytedance.sdk.openadsdk.component.reward.tmg;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.widget.sf;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String fum;
    private static String gpj;
    private static String lo;
    private static String lu;
    private static String nac;
    private static com.bytedance.sdk.openadsdk.pcc.vj.pcc yt;
    protected com.bytedance.sdk.openadsdk.pcc.vj.pcc dax;
    protected int gbb;
    protected int jr;
    private String of;
    private String tz;
    private final AtomicBoolean qy = new AtomicBoolean(false);
    private int jsj = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(final boolean z, boolean z2) {
        of ofVar;
        of ofVar2;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null) {
            return;
        }
        if (!z2 && ofVar.dax() && this.sf.vy.get() && atb.kj(this.sf.sf)) {
            this.sf.of.vy();
            return;
        }
        if (!lu.oo().kj(String.valueOf(this.sf.wh))) {
            if (!z2 && this.sf.vy.get() && atb.kj(this.sf.sf)) {
                this.sf.of.vy();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                rj();
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
        if (sfVar2 != null && (ofVar2 = sfVar2.sf) != null && ofVar2.rj()) {
            if (this.sf.vy.get() && atb.kj(this.sf.sf)) {
                this.sf.of.vy();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                rj();
                return;
            }
        }
        if (atb.kj(this.sf.sf) && this.sf.ye.kj().getVisibility() == 0) {
            this.sf.of.vy();
            return;
        }
        this.sf.nac.set(true);
        this.sf.fum.tz();
        if (z) {
            this.sf.of.wh();
        }
        final com.bytedance.sdk.openadsdk.core.widget.sf sfVar3 = new com.bytedance.sdk.openadsdk.core.widget.sf(this);
        this.gm.tmg = sfVar3;
        if (z) {
            sfVar3.pcc(lu).gm(fum).oo(gpj);
        } else {
            sfVar3.pcc(nac).gm(lo).oo(gpj);
        }
        this.gm.tmg.pcc(new sf.InterfaceC0105sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0105sf
            public void pcc() {
                TTRewardVideoActivity.this.sf.fum.fum();
                if (z) {
                    TTRewardVideoActivity.this.sf.of.pcc(1000);
                }
                sfVar3.dismiss();
                TTRewardVideoActivity.this.sf.nac.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0105sf
            public void sf() {
                sfVar3.dismiss();
                TTRewardVideoActivity.this.vj(true);
                TTRewardVideoActivity.this.sf.nac.set(false);
                TTRewardVideoActivity.this.sf.of.sf(Integer.MAX_VALUE);
                if (!z || !atb.wh(TTRewardVideoActivity.this.sf.sf)) {
                    TTRewardVideoActivity.this.rj();
                    return;
                }
                boolean kj = atb.kj(TTRewardVideoActivity.this.sf.sf);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (kj) {
                    tTRewardVideoActivity.sf.of.vy();
                } else {
                    tTRewardVideoActivity.sf.jsj.wh();
                    TTRewardVideoActivity.this.finish();
                }
            }
        }).show();
    }

    private JSONObject iv() {
        JSONObject jSONObject = new JSONObject();
        int tsz = (int) this.sf.fum.tsz();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.sf.sf.gdh());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.sf.sf.otd());
            jSONObject.put("network", com.bytedance.sdk.component.utils.lu.gm(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int bxz = this.sf.sf.bxz();
            String str = "unKnow";
            if (bxz == 2) {
                str = kun.sf();
            } else if (bxz == 1) {
                str = kun.oo();
            }
            jSONObject.put("user_agent", str);
            JSONObject zvx = this.sf.sf.zvx();
            zvx.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            jSONObject.put("extra", zvx);
            jSONObject.put("media_extra", this.tz);
            jSONObject.put("video_duration", this.sf.sf.kez().d);
            jSONObject.put("play_start_ts", this.gbb);
            jSONObject.put("play_end_ts", this.jr);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, tsz);
            jSONObject.put("user_id", this.of);
            jSONObject.put("trans_id", tsz.pcc().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            lo.pcc("TTAD.RVA", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lrr() {
        toString();
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (r3.sf.hc.get() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rj() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(this.sf.fum.hc());
        pccVar.oo(this.sf.fum.jsj());
        pccVar.gm(this.sf.fum.nac());
        pccVar.gm(3);
        pccVar.oo(this.sf.fum.qy());
        pccVar.pcc(this.sf.fum.sf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.sf.fum.kj(), pccVar, this.sf.fum.vj());
        mk.gm(this.sf.wh);
        this.sf.fum.pcc("skip", false);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar.gm) {
            if (com.bytedance.sdk.openadsdk.core.model.lo.gm(sfVar.sf)) {
                com.bytedance.sdk.openadsdk.component.reward.view.gm pcc2 = this.sf.yt.pcc();
                if (pcc2 == null || pcc2.oo != 0) {
                    pcc(true, 4);
                } else {
                    finish();
                }
            } else {
                pcc(true, 4);
            }
            if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(this.sf.sf)) {
            }
            gto = this.sf.sf.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                long hc = this.sf.fum.hc();
                pcc.wh(hc);
                pcc.vj(hc);
            }
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.sf.sf, 5);
        }
        finish();
        gto = this.sf.sf.gto();
        if (gto != null) {
            long hc2 = this.sf.fum.hc();
            pcc.wh(hc2);
            pcc.vj(hc2);
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.sf.sf, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void atb() {
        kun();
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.ork) {
            return;
        }
        yt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.sf != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.sf.sf);
        }
        wh();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void fum() {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc;
        super.fum();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (pcc = sfVar.yt.pcc()) == null) {
            return;
        }
        pcc.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                TTRewardVideoActivity.this.lrr();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void gpj() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.pcc();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
            ork.pcc(sfVar != null ? sfVar.sf : null, "show", 0);
        }
        if (tsz()) {
            this.sf.yt.hc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public dax kj() {
        return new dax(this.sf) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.dax
            public void gm() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public boolean pcc() {
                of ofVar;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
                return (sfVar == null || (ofVar = sfVar.sf) == null || !ofVar.dax()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public boolean sf() {
                of ofVar;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
                return (sfVar == null || (ofVar = sfVar.sf) == null || !ofVar.rj()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public void pcc(boolean z) {
                TTRewardVideoActivity.this.vj(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
                com.bytedance.sdk.openadsdk.common.pcc.pcc(sfVar, new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                    public void pcc(boolean z, int i) {
                        TTRewardVideoActivity.this.pcc(z, i);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                    public void pcc() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    public void kun() {
        pcc(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void lq() {
        this.jr = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
        pcc(2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
        kun();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (nac == null) {
                nac = tz.pcc(this, "tt_reward_msg");
                lu = tz.pcc(this, "tt_msgPlayable");
                gpj = tz.pcc(this, "tt_negtiveBtnBtnText");
                lo = tz.pcc(this, "tt_postiveBtnText");
                fum = tz.pcc(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            lo.gm("TTAD.RVA", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wh();
        pcc(isFinishing(), isChangingConfigurations());
        if (this.ork) {
            return;
        }
        this.dax = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        tmg tmgVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (tmgVar = sfVar.ra) == null) {
            return;
        }
        tmgVar.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        tmg tmgVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (tmgVar = sfVar.ra) == null) {
            return;
        }
        tmgVar.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.ork) {
            yt = this.dax;
        }
        super.onSaveInstanceState(bundle);
    }

    public void pcc(final int i) {
        of ofVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null || ofVar.rj() || this.sf.sf.dax()) {
            return;
        }
        this.sf.sf.vy(true);
        tmg tmgVar = this.sf.ra;
        if (tmgVar != null) {
            tmgVar.gm();
        }
        if (lu.oo().nac(String.valueOf(this.sf.wh))) {
            pcc(true, this.sf.sf.otd(), this.sf.sf.gdh(), 0, "", i);
        } else {
            lu.gm().pcc(iv(), new of.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.of.sf
                public void pcc(yt.sf sfVar2) {
                    boolean z = sfVar2.sf;
                    TTRewardVideoActivity.this.pcc(sfVar2.sf, sfVar2.gm.pcc(), sfVar2.gm.sf(), 0, "", i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.of.sf
                public void pcc(int i2, String str) {
                    TTRewardVideoActivity.this.pcc(false, 0, "", i2, str, i);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        lrr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void qcw() {
        lrr();
        this.sf.sf.hu();
        this.sf.sf.oo(true);
        if (this.sf.vy.get() || !com.bytedance.sdk.openadsdk.core.model.of.vj(this.sf.sf)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        com.bytedance.sdk.openadsdk.core.model.of ofVar = sfVar.sf;
        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, sfVar.vj, ofVar.zex());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean qy() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
        if (z) {
            kun();
            return;
        }
        if ((1.0d - (this.vj / this.sf.fum.tsx())) * 100.0d >= lu.oo().tsz(String.valueOf(this.sf.wh)).wh) {
            kun();
        }
    }

    public void vj(boolean z) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null) {
            return;
        }
        ofVar.gm(z);
        tmg.pcc(this.sf.sf, false, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void vy() {
        this.sf.zti.pcc(null, TTAdDislikeToast.getSkipText());
        this.sf.zti.vj(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void yt() {
        final View ork = this.sf.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.sf.ye.lo() && TTRewardVideoActivity.this.sf.vy.get()) {
                        boolean hc = TTRewardVideoActivity.this.sf.lq.hc();
                        TTRewardVideoActivity.this.sf.ye.wh(hc);
                        TTRewardVideoActivity.this.sf.mu.wh(8);
                        View view2 = ork;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) view2).setImageResource(tz.oo(TTRewardVideoActivity.this.sf.kun, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.sf.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.of.gm(TTRewardVideoActivity.this.sf.sf)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.of.gm(TTRewardVideoActivity.this.sf.sf) && hc) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.sf.ye.fum();
                    TTRewardVideoActivity.this.sf.lq.vh();
                    TTRewardVideoActivity.this.sf.jsj.wh();
                    boolean oo = atb.oo(TTRewardVideoActivity.this.sf.sf);
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    if (oo) {
                        tTRewardVideoActivity.gm(true, true);
                    } else {
                        tTRewardVideoActivity.finish();
                    }
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.sf.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.oo gto;
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                TTRewardVideoActivity.this.sf.xb = !r3.xb;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.sf.xb);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.sf.atb.pcc());
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = TTRewardVideoActivity.this.sf;
                sfVar.fum.pcc(sfVar.xb, str);
                if (!atb.dax(TTRewardVideoActivity.this.sf.sf) || TTRewardVideoActivity.this.sf.vy.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = TTRewardVideoActivity.this.sf;
                    sfVar2.ye.vj(sfVar2.xb);
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = TTRewardVideoActivity.this.sf;
                    sfVar3.of.sf(sfVar3.xb);
                    com.bytedance.sdk.openadsdk.core.model.of ofVar = TTRewardVideoActivity.this.sf.sf;
                    if (ofVar == null || (gto = ofVar.gto()) == null || (pcc = gto.pcc()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = TTRewardVideoActivity.this.sf;
                    if (sfVar4.xb) {
                        pcc.kj(sfVar4.fum.hc());
                    } else {
                        pcc.vy(sfVar4.fum.hc());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.sf.mk.pcc(tTRewardVideoActivity.gm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.gm(atb.gm(tTRewardVideoActivity.sf.sf), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.mu.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void sf(boolean z, boolean z2) {
        this.gbb = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
        if (i == 10000) {
            kun();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void sf() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.sf();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
            ork.pcc(sfVar != null ? sfVar.sf : null, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 0);
        }
    }

    public void sf(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        int i = this.jsj;
        if (i == -1) {
            i = Math.min(100, this.sf.sf.vgx());
            this.jsj = i;
        }
        if (((j / 1000.0f) / j2) * 100.0f >= i) {
            kun();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc() {
        final com.bytedance.sdk.openadsdk.core.model.of ofVar;
        super.pcc();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null || ofVar.rj()) {
            return;
        }
        this.sf.ra = new tmg(new tmg.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.tmg.pcc
            public void pcc(int i, boolean z) {
                if (ofVar.rj()) {
                    return;
                }
                if (z || !ofVar.dax()) {
                    TTRewardVideoActivity.this.pcc(i);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc sf;
        if (this.ork) {
            super.pcc(bundle);
            sf = (com.bytedance.sdk.openadsdk.pcc.vj.pcc) com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(this.mu, com.bytedance.sdk.openadsdk.pcc.vj.pcc.class);
            this.dax = sf;
        } else {
            sf = com.bytedance.sdk.openadsdk.core.atb.pcc().sf();
            this.dax = sf;
            if (sf == null && bundle != null) {
                sf = yt;
                this.dax = sf;
                yt = null;
            }
        }
        Objects.toString(sf);
        Objects.toString(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc(@NonNull Intent intent) {
        super.pcc(intent);
        this.tz = intent.getStringExtra("media_extra");
        this.of = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc(long j, long j2) {
        int i = (int) (j / 1000);
        int quq = this.sf.sf.quq();
        boolean z = quq >= 0;
        gm(j, j2);
        if (this.vj > 0) {
            this.sf.zti.oo(true);
            if (z && i >= quq) {
                this.sf.pcc(true);
                this.sf.zti.pcc(String.valueOf(this.vj), TTAdDislikeToast.getSkipText());
                this.sf.zti.vj(true);
                return;
            }
            this.sf.zti.pcc(String.valueOf(this.vj), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        toString();
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = TTRewardVideoActivity.this.dax;
                if (pccVar != null) {
                    pccVar.pcc(z, i, str, i2, str2);
                    tmg.pcc(TTRewardVideoActivity.this.sf.sf, z, i3);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void gm() {
        tmg tmgVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (tmgVar = sfVar.ra) == null) {
            return;
        }
        tmgVar.oo();
    }

    public void gm(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        boolean z = false;
        if (sfVar != null) {
            if (sfVar.sf.vgx() >= 0 && this.sf.sf.ibq() >= 0) {
                z = true;
            }
            if (z) {
                j2 = this.sf.sf.ibq();
            }
        }
        long j3 = (this.sf.hpk * 1000) + j;
        if (z) {
            sf(j3, j2);
            return;
        }
        int i = this.jsj;
        if (i == -1) {
            i = lu.oo().tsz(String.valueOf(this.sf.wh)).wh;
            this.jsj = i;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j3 >= 27000) {
            kun();
        } else if ((j3 * 100) / j2 >= i) {
            kun();
        }
    }
}
