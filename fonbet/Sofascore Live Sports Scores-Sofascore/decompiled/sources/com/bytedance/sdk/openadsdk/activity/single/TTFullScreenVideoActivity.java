package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.swm;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.pcc.gm.sf jr;
    private boolean dax;
    private com.bytedance.sdk.openadsdk.pcc.gm.sf gbb;

    private void gm(int i) {
        this.sf.zti.pcc(null, String.format(tz.pcc(lu.pcc(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kun() {
        toString();
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.onAdClicked();
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.ork) {
            return;
        }
        jr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.sf != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.sf.sf);
        }
        try {
            wh();
        } catch (Exception unused) {
        }
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
        pcc.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                TTFullScreenVideoActivity.this.kun();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void gpj() {
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.pcc();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
            ork.pcc(sfVar2 != null ? sfVar2.sf : null, "show", 0);
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
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || of.vj(sfVar.sf)) {
            return;
        }
        swm kez = this.sf.sf.kez();
        if (kez == null) {
            swm swmVar = new swm();
            swmVar.d = 10.0d;
            this.sf.sf.pcc(swmVar);
        } else if (kez.d <= 0.0d) {
            kez.d = 10.0d;
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
        this.gbb = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.ork) {
            jr = this.gbb;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || !sf(sfVar.sf) || pcc(this.sf.sf)) {
            return;
        }
        if (this.dax) {
            this.dax = false;
            finish();
        } else if (this.sf.ye.jsj()) {
            finish();
        }
    }

    public void pcc(int i) {
        int bm = this.sf.sf.bm();
        if (!lu.oo().wh(String.valueOf(this.sf.wh)) || (!of.vj(this.sf.sf) && !this.sf.gm)) {
            if (i >= bm) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
                if (!sfVar.hoh) {
                    sfVar.pcc(true);
                }
                vy();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
        if (!sfVar2.hoh) {
            sfVar2.pcc(true);
        }
        if (i > bm) {
            vy();
        } else {
            gm(bm - i);
            this.sf.zti.vj(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        if (this.sf.sf.zx() != 100.0f) {
            this.dax = true;
        }
        kun();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void qcw() {
        kun();
        this.sf.sf.hu();
        this.sf.sf.oo(true);
        if (this.sf.vy.get() || !of.vj(this.sf.sf)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        of ofVar = sfVar.sf;
        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, sfVar.vj, ofVar.zex());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean qy() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void sf() {
        toString();
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.sf();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
            ork.pcc(sfVar2 != null ? sfVar2.sf : null, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void vy() {
        if (!of.vj(this.sf.sf)) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
            if (!sfVar.gm) {
                sfVar.zti.pcc(null, "X");
                this.sf.zti.vj(true);
            }
        }
        this.sf.zti.pcc(null, TTAdDislikeToast.getSkipText());
        this.sf.zti.vj(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void yt() {
        final View ork = this.sf.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.sf.ye.lo() && TTFullScreenVideoActivity.this.sf.vy.get()) {
                        boolean hc = TTFullScreenVideoActivity.this.sf.lq.hc();
                        TTFullScreenVideoActivity.this.sf.ye.wh(hc);
                        TTFullScreenVideoActivity.this.sf.mu.wh(8);
                        View view2 = ork;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) view2).setImageResource(tz.oo(TTFullScreenVideoActivity.this.sf.kun, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.sf.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(TTFullScreenVideoActivity.this.sf.sf)) {
                            return;
                        }
                        if (of.gm(TTFullScreenVideoActivity.this.sf.sf) && hc) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.sf.ye.fum();
                    TTFullScreenVideoActivity.this.sf.lq.vh();
                    TTFullScreenVideoActivity.this.sf.jsj.wh();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.sf.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                of ofVar;
                com.bytedance.sdk.openadsdk.core.model.oo gto;
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                if (atb.wh(TTFullScreenVideoActivity.this.sf.sf) || (atb.vj(TTFullScreenVideoActivity.this.sf.sf) && TTFullScreenVideoActivity.this.sf.of.oo(com.bytedance.sdk.openadsdk.component.reward.pcc.vy.sf))) {
                    if (atb.kj(TTFullScreenVideoActivity.this.sf.sf)) {
                        TTFullScreenVideoActivity.this.sf.of.vy();
                        return;
                    }
                    View view2 = ork;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (lo.pcc(TTFullScreenVideoActivity.this.sf.sf) && !TTFullScreenVideoActivity.this.sf.hc.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                jr.pcc pccVar = new jr.pcc();
                pccVar.sf(TTFullScreenVideoActivity.this.sf.fum.hc());
                pccVar.oo(TTFullScreenVideoActivity.this.sf.fum.jsj());
                pccVar.gm(TTFullScreenVideoActivity.this.sf.fum.nac());
                pccVar.gm(3);
                pccVar.oo(TTFullScreenVideoActivity.this.sf.fum.qy());
                pccVar.pcc(TTFullScreenVideoActivity.this.sf.fum.sf());
                com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(TTFullScreenVideoActivity.this.sf.fum.kj(), pccVar, TTFullScreenVideoActivity.this.sf.fum.vj());
                mk.gm(TTFullScreenVideoActivity.this.sf.wh);
                TTFullScreenVideoActivity.this.sf.fum.pcc("skip", false);
                TTFullScreenVideoActivity.this.sf.zti.oo(false);
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = TTFullScreenVideoActivity.this.sf;
                if (sfVar.gm) {
                    boolean gm = lo.gm(sfVar.sf);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    if (gm) {
                        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc2 = tTFullScreenVideoActivity.sf.yt.pcc();
                        if (pcc2 == null || pcc2.oo != 0) {
                            TTFullScreenVideoActivity.this.pcc(true, 4);
                        }
                    } else {
                        tTFullScreenVideoActivity.pcc(true, 4);
                    }
                    ofVar = TTFullScreenVideoActivity.this.sf.sf;
                    if (ofVar != null && (gto = ofVar.gto()) != null && (pcc = gto.pcc()) != null) {
                        pcc.wh(TTFullScreenVideoActivity.this.sf.fum.hc());
                        pcc.vj(TTFullScreenVideoActivity.this.sf.fum.hc());
                    }
                    com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(TTFullScreenVideoActivity.this.sf.sf, 5);
                }
                TTFullScreenVideoActivity.this.finish();
                ofVar = TTFullScreenVideoActivity.this.sf.sf;
                if (ofVar != null) {
                    pcc.wh(TTFullScreenVideoActivity.this.sf.fum.hc());
                    pcc.vj(TTFullScreenVideoActivity.this.sf.fum.hc());
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(TTFullScreenVideoActivity.this.sf.sf, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.sf.mk.pcc(tTFullScreenVideoActivity.gm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.oo gto;
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = TTFullScreenVideoActivity.this.sf;
                boolean z = !sfVar.xb;
                sfVar.xb = z;
                sfVar.fum.pcc(z, str);
                if (!atb.dax(TTFullScreenVideoActivity.this.sf.sf) || TTFullScreenVideoActivity.this.sf.vy.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = TTFullScreenVideoActivity.this.sf;
                    sfVar2.ye.vj(sfVar2.xb);
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = TTFullScreenVideoActivity.this.sf;
                    sfVar3.of.sf(sfVar3.xb);
                    of ofVar = TTFullScreenVideoActivity.this.sf.sf;
                    if (ofVar == null || (gto = ofVar.gto()) == null || (pcc = gto.pcc()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = TTFullScreenVideoActivity.this.sf;
                    if (sfVar4.xb) {
                        pcc.kj(sfVar4.fum.hc());
                    } else {
                        pcc.vy(sfVar4.fum.hc());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.mu.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
    }

    private boolean sf(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        return lu.oo().fum(String.valueOf(this.sf.wh));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void gm() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc(@NonNull Intent intent) {
        super.pcc(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
        if (this.ork) {
            super.pcc(bundle);
            this.gbb = (com.bytedance.sdk.openadsdk.pcc.gm.sf) com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(this.mu, com.bytedance.sdk.openadsdk.pcc.gm.sf.class);
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.gm.sf gm = com.bytedance.sdk.openadsdk.core.atb.pcc().gm();
        this.gbb = gm;
        if (gm != null || bundle == null) {
            return;
        }
        this.gbb = jr;
        jr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc(long j, long j2) {
        pcc((int) (j / 1000));
        int i = this.vj;
        if (i >= 0) {
            this.sf.zti.pcc(String.valueOf(i), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
    }

    private boolean pcc(of ofVar) {
        return ofVar == null || ofVar.zx() == 100.0f;
    }
}
