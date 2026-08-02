package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import defpackage.cem;
import defpackage.zdm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo extends fum implements zdm, cem {
    boolean gm;
    int kj;
    private com.bytedance.sdk.openadsdk.gpj.gm.pcc lq;
    private com.bytedance.sdk.openadsdk.pcc.sf.gm mu;
    private boolean nn;
    boolean oo;
    private nac pcc;
    private long pq;
    boolean qf;
    private com.bytedance.sdk.openadsdk.core.jr.sf.wh rnn;
    int sf;
    int vj;
    boolean wh;
    private long zti;

    public lo(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str, boolean z) {
        super(context, ofVar, adSlot, str, false, true);
        this.sf = 1;
        this.gm = false;
        this.oo = true;
        this.wh = true;
        this.qf = true;
        this.kj = -1;
        this.nn = z;
        jr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(@NonNull com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        com.bytedance.sdk.openadsdk.core.jr.sf.gm videoController;
        if (pcc(gbbVar, false)) {
            this.hc.removeAllViews();
            if (this.pcc != null) {
                if ((this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) && (gbbVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.sf)) {
                    FrameLayout dax = ((com.bytedance.sdk.openadsdk.core.hc.wh.sf) gbbVar).dax();
                    if (dax != null) {
                        dax.removeAllViews();
                        if (this.kj == 10) {
                            this.pcc.setClickable(false);
                        }
                        dax.addView(this.pcc, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh) && (videoController = getVideoController()) != null) {
                        videoController.wh(false);
                    }
                } else if (gbbVar.pcc() == null) {
                    this.hc.addView(this.pcc);
                } else if (this.qf) {
                    gbbVar.pcc().setTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.wh, 1);
                    ((FrameLayout) gbbVar.pcc()).removeAllViews();
                    ((FrameLayout) gbbVar.pcc()).addView(this.pcc, new FrameLayout.LayoutParams(-1, -1));
                    this.qf = false;
                }
                this.pcc.pcc(0L, true, false);
                oo(this.vj);
                if (!com.bytedance.sdk.component.utils.lu.oo(this.vy) && !this.oo && this.wh) {
                    this.pcc.vj();
                }
                if (TextUtils.equals("embeded_ad", this.ork)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar, boolean z) {
        int i;
        double vj = gbbVar.vj();
        double wh = gbbVar.wh();
        double qf = gbbVar.qf();
        double kj = gbbVar.kj();
        if ((qf == 0.0d || kj == 0.0d) && (i = this.kj) != 7 && i != 10 && i != 9 && !(this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo)) {
            return false;
        }
        int sf = rj.sf(this.vy, (float) vj);
        int sf2 = rj.sf(this.vy, (float) wh);
        int sf3 = rj.sf(this.vy, (float) qf);
        int sf4 = rj.sf(this.vy, (float) kj);
        float min = Math.min(Math.min(rj.sf(this.vy, gbbVar.vh()), rj.sf(this.vy, gbbVar.tmg())), Math.min(rj.sf(this.vy, gbbVar.hc()), rj.sf(this.vy, gbbVar.gbb())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.hc.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(sf3, sf4);
        }
        layoutParams.width = sf3;
        layoutParams.height = sf4;
        layoutParams.topMargin = sf2;
        layoutParams.leftMargin = sf;
        layoutParams.setMarginStart(sf);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.hc.setLayoutParams(layoutParams);
        rj.sf(this.hc, min);
        nac nacVar = this.pcc;
        if (nacVar == null || !z) {
            return true;
        }
        nacVar.pcc(sf3, sf4);
        return true;
    }

    private void setShowAdInteractionView(boolean z) {
        nac nacVar = this.pcc;
        if (nacVar != null) {
            nacVar.setShowAdInteractionView(z);
        }
    }

    private void sf(long j, long j2) {
        int abs = (int) Math.abs(this.gpj - j);
        int i = this.gpj;
        if (i < 0 || abs > 500 || i > j2 || abs >= 500 || this.fum.contains(this.lo)) {
            return;
        }
        if (this.gpj > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.lo.4
                @Override // java.lang.Runnable
                public void run() {
                    lo.this.pcc.setCanInterruptVideoPlay(true);
                    lo.this.pcc.performClick();
                    lo loVar = lo.this;
                    loVar.sf(loVar.gpj, loVar.lo);
                }
            }, abs);
        } else {
            this.pcc.setCanInterruptVideoPlay(true);
            this.pcc.performClick();
            sf(this.gpj, this.lo);
        }
        this.fum.add(this.lo);
    }

    private void tsz() {
        try {
            this.lq = new com.bytedance.sdk.openadsdk.gpj.gm.pcc();
            nac nacVar = new nac(this.vy, this.tmg, this.ork, this.jsj, this.nn);
            this.pcc = nacVar;
            nacVar.setShouldCheckNetChange(false);
            this.pcc.setControllerStatusCallBack(new wh.sf() { // from class: com.bytedance.sdk.openadsdk.core.ork.lo.2
                @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.sf
                public void pcc(boolean z, long j, long j2, long j3, boolean z2) {
                    lo.this.lq.pcc = z;
                    lo.this.lq.vj = j;
                    lo.this.lq.wh = j2;
                    lo.this.lq.qf = j3;
                    lo.this.lq.oo = z2;
                }
            });
            this.pcc.setVideoAdLoadListener(this);
            this.pcc.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.ork)) {
                this.pcc.setIsAutoPlay(this.gm ? this.vh.isAutoPlay() : this.oo);
            } else {
                boolean equals = "open_ad".equals(this.ork);
                nac nacVar2 = this.pcc;
                if (equals) {
                    nacVar2.setIsAutoPlay(true);
                } else {
                    nacVar2.setIsAutoPlay(this.oo);
                }
            }
            if ("open_ad".equals(this.ork)) {
                this.pcc.pcc(true, "initVideo");
            } else {
                boolean gm = com.bytedance.sdk.openadsdk.core.lu.oo().gm(String.valueOf(this.vj));
                this.of = gm;
                this.pcc.pcc(gm, "initVideo");
            }
            this.pcc.oo();
        } catch (Exception unused) {
            this.pcc = null;
        }
    }

    public void dax() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.rnn;
        if (whVar != null) {
            whVar.hc();
            return;
        }
        nac nacVar = this.pcc;
        if (nacVar != null) {
            nacVar.hc();
        }
    }

    @Override // defpackage.zdm
    public void g_() {
        this.wh = false;
        this.sf = 2;
        com.bytedance.sdk.openadsdk.pcc.sf.gm gmVar = this.mu;
        if (gmVar != null) {
            gmVar.pcc(null);
        }
    }

    public boolean gbb() {
        return this.nn;
    }

    public nac getExpressVideoView() {
        return this.pcc;
    }

    public com.bytedance.sdk.openadsdk.pcc.sf.gm getVideoAdListener() {
        return this.mu;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.jr.sf.gm getVideoController() {
        nac nacVar = this.pcc;
        if (nacVar != null) {
            return nacVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc getVideoModel() {
        return this.lq;
    }

    @Override // defpackage.zdm
    public void h_() {
        this.wh = false;
        this.gbb = true;
        this.sf = 3;
        com.bytedance.sdk.openadsdk.pcc.sf.gm gmVar = this.mu;
        if (gmVar != null) {
            gmVar.sf(null);
        }
    }

    @Override // defpackage.zdm
    public void i_() {
        this.wh = false;
        this.gbb = false;
        this.sf = 2;
    }

    @Override // defpackage.zdm
    public void j_() {
        this.wh = false;
        this.sf = 5;
        com.bytedance.sdk.component.adexpress.sf.sf sfVar = this.mk;
        if (sfVar != null && sfVar.sf() != null) {
            this.mk.sf().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.pcc.sf.gm gmVar = this.mu;
        if (gmVar != null) {
            gmVar.gm(null);
        }
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) ooVar).onvideoComplate();
        }
    }

    public void jr() {
        this.hc = new FrameLayout(this.vy);
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
        int kot = ofVar != null ? ofVar.kot() : 0;
        this.vj = kot;
        oo(kot);
        tsz();
        addView(this.hc, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.hc.kj() { // from class: com.bytedance.sdk.openadsdk.core.ork.lo.1
            @Override // com.bytedance.sdk.openadsdk.hc.kj
            public void pcc(final com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.lo.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lo.this.pcc(gbbVar, true);
                    }
                });
            }
        });
    }

    public void lu() {
        com.bytedance.sdk.openadsdk.core.jr.sf.gm videoController = getVideoController();
        if (videoController != null) {
            videoController.pcc(3, true);
        }
    }

    public void nac() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.rnn;
        if (whVar != null) {
            whVar.jr();
            return;
        }
        nac nacVar = this.pcc;
        if (nacVar != null) {
            nacVar.jr();
        }
    }

    public void oo(int i) {
        int sf = com.bytedance.sdk.openadsdk.core.lu.oo().sf(i);
        if (3 == sf) {
            this.gm = false;
            this.oo = false;
        } else if (4 == sf) {
            this.gm = true;
        } else {
            int gm = com.bytedance.sdk.component.utils.lu.gm(com.bytedance.sdk.openadsdk.core.lu.pcc());
            if (1 == sf) {
                this.gm = false;
                this.oo = kun.oo(gm);
            } else if (2 == sf) {
                if (kun.vj(gm) || kun.oo(gm) || kun.wh(gm)) {
                    this.gm = false;
                    this.oo = true;
                }
            } else if (5 == sf && (kun.oo(gm) || kun.wh(gm))) {
                this.gm = false;
                this.oo = true;
            }
        }
        if (this.oo) {
            return;
        }
        this.sf = 3;
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar) {
        this.rnn = whVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.pcc.sf.gm gmVar) {
        this.mu = gmVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public int vj() {
        nac nacVar;
        if (this.sf == 3 && (nacVar = this.pcc) != null) {
            nacVar.oo();
        }
        nac nacVar2 = this.pcc;
        if (nacVar2 != null && nacVar2.getNativeVideoController().gbb()) {
            this.sf = 1;
        }
        qf(this.sf);
        return this.sf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void wh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void sf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public long oo() {
        return this.zti;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public long gm() {
        return this.zti;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.jr
    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        this.atb = ooVar;
        this.kj = ooVar.gm();
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar2 = this.atb;
        if ((ooVar2 instanceof tsz) && ((tsz) ooVar2).yt() != null) {
            ((tsz) this.atb).yt().pcc((dax) this);
        }
        if (gbbVar != null && gbbVar.sf()) {
            pcc(gbbVar);
        }
        super.pcc(ooVar, gbbVar);
    }

    private void pcc(final com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        if (gbbVar == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.lo.3
            @Override // java.lang.Runnable
            public void run() {
                lo.this.gm(gbbVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(boolean z, String str) {
        nac nacVar;
        if (this.tmg.jl() || (nacVar = this.pcc) == null) {
            return;
        }
        nacVar.pcc(z, str);
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i) {
        nac nacVar = this.pcc;
        if (nacVar == null) {
            return;
        }
        if (i == 1) {
            nacVar.pcc(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            nacVar.setCanInterruptVideoPlay(true);
            this.pcc.performClick();
        } else if (i == 4) {
            nacVar.getNativeVideoController().vj();
        } else {
            if (i != 5) {
                return;
            }
            nacVar.pcc(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.kj
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        if (i == -1 || gmVar == null) {
            return;
        }
        if (i == 11) {
            try {
                nac nacVar = this.pcc;
                if (nacVar != null) {
                    nacVar.setCanInterruptVideoPlay(true);
                    this.pcc.performClick();
                    if (this.gbb) {
                        this.pcc.findViewById(com.bytedance.sdk.openadsdk.utils.nac.bgf).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.pcc(view, i, gmVar);
    }

    @Override // defpackage.zdm
    public void pcc(long j, long j2) {
        this.wh = false;
        int i = this.sf;
        if (i != 5 && i != 3 && j > this.zti) {
            this.sf = 2;
        }
        this.zti = j;
        this.pq = j2;
        com.bytedance.sdk.component.adexpress.sf.sf sfVar = this.mk;
        if (sfVar != null && sfVar.sf() != null) {
            this.mk.sf().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) ooVar).setTimeUpdate(((int) (j2 - j)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) this.atb).pcc(j, j2);
        }
        sf(j, j2);
    }

    @Override // defpackage.cem
    public void pcc(int i, int i2) {
        this.zti = this.pq;
        this.sf = 4;
        com.bytedance.sdk.openadsdk.pcc.sf.gm gmVar = this.mu;
        if (gmVar != null) {
            gmVar.pcc(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i, String str) {
        this.gpj = i;
        this.lo = str;
    }
}
