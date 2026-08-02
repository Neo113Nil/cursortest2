package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.common.gbb;
import com.bytedance.sdk.openadsdk.common.pcc;
import com.bytedance.sdk.openadsdk.component.reward.pcc.nac;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.component.reward.pcc.vh;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.ye;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.mk;
import com.bytedance.sdk.openadsdk.utils.pq;
import com.bytedance.sdk.openadsdk.utils.rj;
import defpackage.fem;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements tsz.pcc, com.bytedance.sdk.openadsdk.core.jr.oo.sf {
    private int dax;
    private final AtomicBoolean gbb;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.sf.sf gm;
    protected boolean hc;
    private boolean jr;
    int kj;
    private int lu;
    private final tmg.sf nac;
    final tsz oo;
    protected boolean ork;
    public final String pcc;
    protected pq qf;
    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sf;
    protected long tmg;
    protected boolean vh;
    int vj;
    protected boolean vy;
    boolean wh;

    public TTBaseVideoActivity() {
        this.pcc = qy() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.gbb = new AtomicBoolean(false);
        this.oo = new tsz(Looper.getMainLooper(), this);
        this.jr = false;
        this.dax = 0;
        this.kj = 1;
        this.nac = new tmg.sf();
        this.vy = false;
        this.lu = -1;
    }

    private void kun() {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        this.gm.yt();
        this.vj = (int) this.sf.fum.tsx();
        if (this.hc) {
            com.bytedance.sdk.openadsdk.common.pcc.sf(new gbb.pcc(this.sf, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                public void pcc(boolean z, int i) {
                    TTBaseVideoActivity.this.pcc(z, i);
                }

                @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                public void pcc() {
                    TTBaseVideoActivity.this.finish();
                }
            }).pcc(qf()).pcc(kj()).pcc());
        } else {
            yt();
        }
        hc();
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.sf.sf.gto();
        if (gto == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.pcc(0L);
    }

    private boolean lrr() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.sf.vy.get();
        }
        return true;
    }

    private void rj() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        if (this.sf == null || (sfVar = this.gm) == null) {
            super.onBackPressed();
        } else {
            sfVar.lo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public View dax() {
        return this.sf.fum.rj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.sf == null) {
            return;
        }
        if (mk.wh()) {
            rj.sf((Activity) this);
        }
        if (!atb.vj(this.sf.sf) || this.sf.of.oo(com.bytedance.sdk.openadsdk.component.reward.pcc.vy.sf)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void gbb() {
        rj();
    }

    public abstract void gm();

    public abstract void gpj();

    public void hc() {
        if (atb.gm(this.sf.sf)) {
            pcc(false, sf.C0122sf.gm);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar != null) {
            sfVar.pcc(this.sf.mu.wh());
            this.gm.of();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void jr() {
        this.sf.fum.kun();
    }

    public abstract boolean jsj();

    public abstract dax kj();

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void kz() {
        this.sf.jsj.pcc();
    }

    public void lo() {
        if (tsz() && !this.jr) {
            this.jr = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = tTBaseVideoActivity.sf;
                    sfVar.tsz.pcc(sfVar.qy.pcc(tTBaseVideoActivity.kj));
                    TTBaseVideoActivity.this.fum();
                }
            });
        }
    }

    public void mk() {
        of ofVar;
        ye uk;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null || (uk = ofVar.uk()) == null) {
            return;
        }
        if (uk.sf() == 1 || uk.sf() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
            pq pqVar = new pq(sfVar2, sfVar2.sf);
            this.qf = pqVar;
            nac nacVar = this.sf.fum;
            if (nacVar != null) {
                nacVar.pcc(pqVar);
            }
        }
    }

    public void nn() {
        boolean gd = this.sf.sf.gd();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (!gd) {
            if (!of.vj(sfVar.sf)) {
                this.sf.fum.pcc("skip", true);
            }
            finish();
            return;
        }
        boolean wh = sfVar.sf.wh();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
        if (!wh) {
            sfVar2.zti.gm();
        } else if (sfVar2.yt.vh() == 1) {
            this.sf.zti.gm();
        }
    }

    public void of() {
        this.oo.removeMessages(400);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.qy.pcc();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        rj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z = true;
        }
        this.ork = z;
        this.tmg = SystemClock.elapsedRealtime();
        lu.sf(getApplicationContext());
        if (!jr.vj()) {
            finish();
            return;
        }
        of pcc = com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(getIntent(), bundle, this);
        if (pcc == null) {
            finish();
            return;
        }
        this.hc = com.bytedance.sdk.openadsdk.yt.vj.vh();
        com.bytedance.sdk.openadsdk.utils.sf.pcc(pcc);
        this.vh = com.bytedance.sdk.openadsdk.utils.sf.pcc();
        pcc.rnn(String.valueOf(hashCode()));
        this.kj = pcc.ial();
        pcc(pcc, bundle);
        if (bundle != null) {
            ork.pcc(pcc, "activity_recreate", pcc.vj(), "activity_recreate", null);
        }
        try {
            lu();
            pcc();
            kun();
        } catch (Throwable th) {
            lo.pcc("TTAD.BVA", "onCreate: ", th);
            ork.pcc(pcc, "show_ad_fail", this.pcc, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        of ofVar;
        super.onDestroy();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || this.gm == null) {
            return;
        }
        if (sfVar.qcw > 0 && (ofVar = sfVar.sf) != null && ofVar.iv()) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.sf.qcw);
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, sfVar2.sf, this.pcc, sfVar2.fum.vj());
            this.sf.qcw = 0L;
        }
        this.sf.mk.sf();
        this.oo.removeCallbacksAndMessages(null);
        this.gm.gpj();
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.sf.sf);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(this.sf.sf);
        AdSlot gqd = this.sf.sf.gqd();
        if (!this.sf.fum.pq() && gqd != null && TextUtils.isEmpty(gqd.getBidAdm()) && !this.sf.sf.duh() && !of.wh(this.sf.sf)) {
            jr.sf().post(new com.bytedance.sdk.openadsdk.component.reward.gbb(qy(), gqd));
        }
        com.bytedance.sdk.openadsdk.utils.dax.pcc();
        pq pqVar = this.qf;
        if (pqVar != null) {
            pqVar.vj();
            this.qf = null;
        }
        this.nac.pcc(this);
        tsx.pcc().pcc(String.valueOf(hashCode()));
        com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(this.sf.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.nac();
    }

    @Override // android.app.Activity
    public void onRestart() {
        of ofVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null) {
            return;
        }
        if (this.pq && !ofVar.evs() && !TextUtils.isEmpty(of.pcc(this, ofVar))) {
            finish();
        }
        if (ofVar.evs()) {
            ofVar.jr(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        super.onResume();
        toString();
        if (this.sf == null || (sfVar = this.gm) == null) {
            return;
        }
        sfVar.jr();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
        sfVar2.ri = true;
        this.nac.pcc(this, sfVar2.zsj, sfVar2.gd, this.vh);
        if (lrr()) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.sf;
            sfVar3.zti.pcc(sfVar3.sf.dk());
        }
        this.sf.mu.dax();
        this.sf.ye.nac();
        this.sf.of.vj();
        if (this.gm.sf()) {
            this.sf.fum.pcc(this.gm);
            this.sf.fum.pcc(false, this, this.dax != 0);
        }
        this.dax++;
        lo();
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.sf.yt;
        if (vyVar != null) {
            vyVar.qf();
        }
        this.sf.qy.pcc(this.oo);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.sf == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.mu)) {
            bundle.putString("single_process_listener_key", this.mu);
        }
        bundle.putBoolean("enable_new_arch", this.ork);
        of ofVar = this.sf.sf;
        int pcc = ofVar != null ? com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(ofVar) : -1;
        this.lu = pcc;
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.sf, bundle, pcc);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        toString();
        if (this.lu >= 0) {
            com.bytedance.sdk.openadsdk.core.atb.pcc().gm(this.lu);
            this.lu = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.ye.qy();
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.sf.sf);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.lu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        vh vhVar;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (vhVar = sfVar.jsj) == null) {
            return;
        }
        vhVar.sf(z);
        this.sf.jsj.gm(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean oo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void ork() {
        of ofVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || (ofVar = sfVar.sf) == null || ofVar.kun()) {
            return;
        }
        toString();
        this.sf.sf.kj(true);
        gpj();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = sfVar2.yt;
        if (vyVar != null) {
            com.bytedance.sdk.openadsdk.component.oo.pcc.sf(sfVar2.sf, vyVar.vh());
        }
    }

    public abstract void pcc(long j, long j2);

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public boolean pcc(long j, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.vh vhVar;
        com.bytedance.sdk.openadsdk.core.model.lo loVar;
        if (this.sf == null) {
            return false;
        }
        this.gbb.set(false);
        com.bytedance.sdk.openadsdk.oo.qf kj = this.sf.kj();
        FrameLayout zti = zti();
        if (zti == null) {
            return false;
        }
        this.sf.fum.pcc(zti, kj);
        Map<String, Object> tsx = tsx();
        fem femVar = new fem() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // defpackage.fem
            public void pcc(long j2, int i) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar;
                com.bytedance.sdk.openadsdk.utils.gbb gbbVar;
                TTBaseVideoActivity.this.gbb.get();
                if (TTBaseVideoActivity.this.gbb.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.gbb.set(true);
                TTBaseVideoActivity.this.of();
                TTBaseVideoActivity.this.atb();
                TTBaseVideoActivity.this.sf.fum.pcc(j2, j2);
                boolean tsz = TTBaseVideoActivity.this.tsz();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tsz) {
                    tTBaseVideoActivity.sf.yt.sf(true);
                } else {
                    tTBaseVideoActivity.sf.dax.set(true);
                }
                TTBaseVideoActivity.this.lq();
                if (TTBaseVideoActivity.this.sf.sf.bg() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = TTBaseVideoActivity.this.sf;
                    if (sfVar2.gm) {
                        sfVar2.tz.gm().pcc(TTBaseVideoActivity.this.sf.sf);
                        com.bytedance.sdk.openadsdk.utils.dax.sf();
                    }
                }
                if (!TTBaseVideoActivity.this.tsz() && TTBaseVideoActivity.this.sf.sf.giw()) {
                    TTBaseVideoActivity.this.sf.sf.zsj(1);
                    TTBaseVideoActivity.this.sf.mu.lu();
                }
                if (TTBaseVideoActivity.this.sf.sf.bg() == 21 && !TTBaseVideoActivity.this.sf.sf.gpj()) {
                    TTBaseVideoActivity.this.sf.sf.vj(true);
                    TTBaseVideoActivity.this.sf.mu.lu();
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity2.vy && tTBaseVideoActivity2.sf.yt.tmg()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.tsz()) {
                    if (com.bytedance.sdk.openadsdk.core.model.lo.oo(TTBaseVideoActivity.this.sf.sf) || com.bytedance.sdk.openadsdk.core.model.lo.sf(TTBaseVideoActivity.this.sf.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(TTBaseVideoActivity.this.sf.sf)) {
                        TTBaseVideoActivity.this.pcc(false, 5);
                        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = TTBaseVideoActivity.this.sf;
                        com.bytedance.sdk.openadsdk.utils.gbb gbbVar2 = sfVar3.gh;
                        if (gbbVar2 != null) {
                            gbbVar2.pcc(sfVar3, 0L);
                            return;
                        }
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(TTBaseVideoActivity.this.sf.sf) && !TTBaseVideoActivity.this.sf.hc.get()) {
                        TTBaseVideoActivity.this.sf.pcc(true);
                        TTBaseVideoActivity.this.sf.zti.vj(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity3 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = tTBaseVideoActivity3.sf;
                if (!sfVar4.gm) {
                    tTBaseVideoActivity3.nn();
                    return;
                }
                boolean gd = sfVar4.sf.gd();
                TTBaseVideoActivity tTBaseVideoActivity4 = TTBaseVideoActivity.this;
                if (gd) {
                    boolean tsz2 = tTBaseVideoActivity4.tsz();
                    TTBaseVideoActivity tTBaseVideoActivity5 = TTBaseVideoActivity.this;
                    if (!tsz2) {
                        tTBaseVideoActivity5.sf.zti.gm();
                        return;
                    } else {
                        if (tTBaseVideoActivity5.sf.yt.vh() == 1) {
                            TTBaseVideoActivity.this.sf.zti.gm();
                            return;
                        }
                        return;
                    }
                }
                tTBaseVideoActivity4.pcc(false, 5);
                if (!TTBaseVideoActivity.this.tsz() && com.bytedance.sdk.openadsdk.core.model.lo.sf(TTBaseVideoActivity.this.sf.sf) && (gbbVar = (sfVar = TTBaseVideoActivity.this.sf).gh) != null) {
                    gbbVar.pcc(sfVar, 0L);
                }
                if (of.vj(TTBaseVideoActivity.this.sf.sf)) {
                    return;
                }
                TTBaseVideoActivity.this.sf.fum.pcc("skip", true);
            }

            @Override // defpackage.fem
            public void sf(long j2, int i) {
                com.bytedance.sdk.openadsdk.core.model.lo loVar2;
                TTBaseVideoActivity.this.sf.fum.vh();
                com.bytedance.sdk.openadsdk.component.reward.view.vh vhVar2 = TTBaseVideoActivity.this.sf.mu;
                if (vhVar2 != null && (loVar2 = vhVar2.dax) != null) {
                    loVar2.ork();
                }
                boolean wh = TTBaseVideoActivity.this.sf.fum.wh();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (wh) {
                    tTBaseVideoActivity.tz();
                    return;
                }
                tTBaseVideoActivity.sf.fum.lo();
                TTBaseVideoActivity.this.atb();
                if (TTBaseVideoActivity.this.sf.sf.wh()) {
                    TTBaseVideoActivity.this.sf.yt.pcc(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity2.sf.gm) {
                    tTBaseVideoActivity2.finish();
                    return;
                }
                tTBaseVideoActivity2.pcc(false, true, 3);
                nac nacVar = TTBaseVideoActivity.this.sf.fum;
                nacVar.pcc(!nacVar.rnn() ? 1 : 0, 2);
            }

            @Override // defpackage.fem
            public void pcc() {
                TTBaseVideoActivity.this.sf.fum.vh();
                TTBaseVideoActivity.this.of();
                TTBaseVideoActivity.this.atb();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.sf.gm) {
                    tTBaseVideoActivity.pcc(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                nac nacVar = TTBaseVideoActivity.this.sf.fum;
                nacVar.pcc(!nacVar.rnn() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.sf.fum.rnn() ? 1 : 0));
                TTBaseVideoActivity.this.sf.fum.lo();
            }

            @Override // defpackage.fem
            public void pcc(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = TTBaseVideoActivity.this.sf;
                if (!sfVar.ri && sfVar.fum.wh()) {
                    TTBaseVideoActivity.this.sf.fum.tz();
                }
                if (TTBaseVideoActivity.this.sf.vy.get()) {
                    return;
                }
                if (j2 != TTBaseVideoActivity.this.sf.fum.gbb()) {
                    TTBaseVideoActivity.this.of();
                }
                if (TTBaseVideoActivity.this.tsz() && !TTBaseVideoActivity.this.sf.fum.wh()) {
                    TTBaseVideoActivity.this.oo.removeMessages(300);
                    return;
                }
                TTBaseVideoActivity.this.sf.fum.pcc(j2, j3);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j4 = j2 / 1000;
                tTBaseVideoActivity.vj = (int) (tTBaseVideoActivity.sf.fum.tsx() - j4);
                int i = (int) j4;
                if ((TTBaseVideoActivity.this.sf.nac.get() || TTBaseVideoActivity.this.sf.ork.get()) && TTBaseVideoActivity.this.sf.fum.wh()) {
                    TTBaseVideoActivity.this.sf.fum.tz();
                }
                if (TTBaseVideoActivity.this.qy()) {
                    TTBaseVideoActivity.this.sf.mu.vj(i);
                }
                boolean jsj = TTBaseVideoActivity.this.jsj();
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                if (jsj) {
                    boolean oo = tTBaseVideoActivity2.sf.fum.oo();
                    TTBaseVideoActivity tTBaseVideoActivity3 = TTBaseVideoActivity.this;
                    if (oo) {
                        pq pqVar = tTBaseVideoActivity3.qf;
                        if (pqVar != null) {
                            pqVar.pcc(j2);
                            return;
                        }
                        return;
                    }
                    pq pqVar2 = tTBaseVideoActivity3.qf;
                    if (pqVar2 == null || !pqVar2.pcc()) {
                        TTBaseVideoActivity.this.pcc(j2, j3);
                        return;
                    }
                    return;
                }
                tTBaseVideoActivity2.pcc(j2, j3);
            }
        };
        this.sf.fum.pcc(femVar);
        if (!this.sf.sf.wh() && (vhVar = this.sf.mu) != null && (loVar = vhVar.dax) != null) {
            loVar.pcc(femVar);
        }
        boolean pcc = this.sf.fum.pcc(j, z, tsx, this.gm);
        sf(pcc, z);
        return pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public List<of> ptr() {
        return this.sf.sf.ky();
    }

    public boolean qf() {
        return !qy();
    }

    public abstract boolean qy();

    public boolean rnn() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar != null) {
            return sfVar.vr;
        }
        return false;
    }

    public abstract void sf();

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void tmg() {
        this.sf.gbb.set(true);
        vh();
    }

    public Map<String, Object> tsx() {
        return null;
    }

    public boolean tsz() {
        return false;
    }

    public void tz() {
        Message message = new Message();
        message.what = 400;
        if (qy()) {
            sf(10000);
        }
        this.oo.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vh() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.vh();
    }

    public abstract void vy();

    public void wh() {
        if (com.bytedance.sdk.openadsdk.yt.vj.vy() && isChangingConfigurations()) {
            lo.pcc("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.wh) {
            lo.pcc("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.wh = true;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        of ofVar = sfVar != null ? sfVar.sf : null;
        if (ofVar != null && !ofVar.iv()) {
            long vy = ofVar.vy();
            if (vy > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - vy;
                if (elapsedRealtime > 0) {
                    ofVar.sf(elapsedRealtime);
                }
            }
            this.sf.pcc(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1003);
            this.sf.jsj.pcc();
        }
        gm();
        sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ye() {
        this.vy = true;
    }

    public abstract void yt();

    public abstract FrameLayout zti();

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void oo(boolean z) {
    }

    public void atb() {
    }

    public void fum() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void hoh() {
    }

    public void lq() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vj() {
    }

    public void sf(boolean z, boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(boolean z) {
    }

    private void pcc(of ofVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.component.reward.pcc.sf(this, this.oo, ofVar, this, 0, this.vh);
        this.sf = sfVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(sfVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            pcc(intent);
            ofVar.pcc(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.sf.hoh) {
            vy();
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf pcc = com.bytedance.sdk.openadsdk.component.reward.sf.wh.pcc(this.sf);
        this.gm = pcc;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
        sfVar2.ew = pcc;
        com.bytedance.sdk.openadsdk.utils.dax.pcc(ofVar, sfVar2.kun, sfVar2.vj, sfVar2.tsx);
        Objects.toString(this.gm);
    }

    public void pcc() {
        setContentView(this.sf.nn);
        this.sf.nn.pcc(this.gm);
        this.gm.pcc(this, this.oo);
        this.gm.ork();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this, sfVar.nn, com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(sfVar.sf.qxv()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
        if (this.ork) {
            if (bundle != null) {
                this.mu = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.mu = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.mu = "";
            }
        }
    }

    public void pcc(@NonNull Intent intent) {
        this.sf.vr = intent.getBooleanExtra("back_up", false);
        this.sf.bg = intent.getIntExtra("extra_conversion_link", 0);
    }

    public void pcc(boolean z, int i) {
        pcc(z, false, i);
    }

    public void pcc(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(z, z2, false, i);
    }

    public void pcc(boolean z, boolean z2) {
        if (!this.ork || TextUtils.isEmpty(this.mu)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(this.mu, z, z2);
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(message);
    }
}
