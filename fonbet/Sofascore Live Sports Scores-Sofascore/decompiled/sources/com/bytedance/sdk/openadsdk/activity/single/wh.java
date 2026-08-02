package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.vh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends pcc {
    private boolean lo;

    public wh(sf sfVar, of ofVar, int i, int i2, boolean z) {
        super(sfVar, ofVar, i, i2, z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void a_() {
        sf sfVar = this.qf;
        if (sfVar != null && sfVar.gm()) {
            super.a_();
            return;
        }
        final View ork = this.vy.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.wh.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (wh.this.vy.ye.lo() && wh.this.vy.vy.get()) {
                        boolean hc = wh.this.vy.lq.hc();
                        wh.this.vy.ye.wh(hc);
                        wh.this.vy.mu.wh(8);
                        wh.this.vy.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(wh.this.vy.sf)) {
                            return;
                        }
                        if (of.gm(wh.this.vy.sf) && hc) {
                            return;
                        }
                    }
                    wh.this.vy.ye.fum();
                    wh.this.vy.lq.vh();
                    wh.this.vy.jsj.wh();
                    wh.this.iv();
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.vy.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.wh.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
                wh whVar = wh.this;
                whVar.sf(whVar.vy);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                if (lo.pcc(wh.this.vy.sf) && !wh.this.vy.hc.get()) {
                    wh.this.iv();
                    return;
                }
                wh.this.vy.fum.zti();
                jr.pcc pccVar = new jr.pcc();
                pccVar.sf(wh.this.vy.fum.hc());
                pccVar.oo(wh.this.vy.fum.jsj());
                pccVar.gm(wh.this.vy.fum.nac());
                pccVar.gm(3);
                pccVar.oo(wh.this.vy.fum.qy());
                pccVar.pcc(wh.this.vy.fum.sf());
                com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(wh.this.vy.fum.kj(), pccVar, wh.this.vy.fum.vj());
                mk.gm(wh.this.vy.wh);
                wh.this.vy.fum.pcc("skip", false);
                wh.this.vy.zti.oo(false);
                wh whVar = wh.this;
                if (whVar.vy.gm) {
                    whVar.pcc(true, 4);
                } else {
                    whVar.iv();
                }
                of ofVar = wh.this.vy.sf;
                if (ofVar != null && ofVar.gto() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = wh.this.vy;
                    if (sfVar2.fum != null && (pcc = sfVar2.sf.gto().pcc()) != null) {
                        pcc.wh(wh.this.vy.fum.hc());
                        pcc.vj(wh.this.vy.fum.hc());
                    }
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(wh.this.vy.sf, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                wh.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                wh.this.pcc(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public String d_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void e_() {
        this.vy.mk.pcc(((pcc) this).sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean f_() {
        return this.vy.xb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void nn() {
        super.nn();
        this.vj = false;
        this.vy.yt.sf(false);
        this.vy.fum.xb();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc, com.bytedance.sdk.openadsdk.activity.single.kj
    public void oo() {
        super.oo();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null || !sf(sfVar.sf) || pcc(this.vy.sf)) {
            return;
        }
        if (this.lo) {
            this.lo = false;
            iv();
        } else if (this.vy.ye.jsj()) {
            iv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        sfVar.xb = !sfVar.xb;
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = sfVar.yt;
        if (vyVar != null && vyVar.pcc() != null) {
            this.vy.yt.pcc().setSoundMute(this.vy.xb);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.vy;
        sfVar2.fum.pcc(sfVar2.xb, str);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.vy;
        sfVar3.ye.vj(sfVar3.xb);
        of ofVar = this.vy.sf;
        if (ofVar == null || (gto = ofVar.gto()) == null || (pcc = gto.pcc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = this.vy;
        if (sfVar4.xb) {
            pcc.kj(sfVar4.fum.hc());
        } else {
            pcc.vy(sfVar4.fum.hc());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        if (this.vy.sf.zx() != 100.0f) {
            this.lo = true;
        }
        super.pq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc
    public FrameLayout qf() {
        vh vhVar;
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar;
        boolean wh = this.wh.wh();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (wh) {
            if (sfVar == null || (vyVar = sfVar.yt) == null) {
                return null;
            }
            return vyVar.sf();
        }
        if (sfVar == null || (vhVar = sfVar.mu) == null) {
            return null;
        }
        return vhVar.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc
    public void sf() {
        if (!of.vj(this.vy.sf)) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
            if (!sfVar.gm) {
                sfVar.zti.pcc(null, "X");
                this.vy.zti.vj(true);
            }
        }
        this.vy.zti.pcc(null, TTAdDislikeToast.getSkipText());
        this.vy.zti.vj(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
    }

    private boolean sf(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        return lu.oo().fum(String.valueOf(this.vy.wh));
    }

    private boolean pcc(of ofVar) {
        return ofVar == null || ofVar.zx() == 100.0f;
    }
}
