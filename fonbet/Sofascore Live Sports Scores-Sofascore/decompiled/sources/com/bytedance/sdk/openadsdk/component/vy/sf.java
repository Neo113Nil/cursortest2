package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.dax;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.tsz;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fem;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends fum {
    int gm;
    private com.bytedance.sdk.openadsdk.component.kj.gm kj;
    private com.bytedance.sdk.openadsdk.component.wh.pcc lq;
    float oo;
    boolean pcc;
    private fem pq;
    private final com.bytedance.sdk.openadsdk.component.kj.pcc qf;
    boolean sf;
    private final com.bytedance.sdk.openadsdk.component.pcc vj;
    private final com.bytedance.sdk.openadsdk.component.wh.sf wh;
    private FrameLayout zti;

    public sf(@NonNull Context context, of ofVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.pcc pccVar, com.bytedance.sdk.openadsdk.component.wh.sf sfVar, com.bytedance.sdk.openadsdk.component.kj.pcc pccVar2) {
        super(context, ofVar, adSlot, str, true, true);
        this.pcc = true;
        this.sf = false;
        this.gm = 0;
        this.oo = 1.0f;
        this.vj = pccVar;
        this.wh = sfVar;
        this.qf = pccVar2;
        if (ofVar == null || ofVar.uk() == null) {
            return;
        }
        this.gm = ofVar.uk().sf();
        this.oo = ofVar.uk().pcc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(gbb gbbVar) {
        if (gbbVar == null) {
            return;
        }
        if (gbbVar.pcc() != null) {
            if (this.pcc) {
                gbbVar.pcc().setTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.wh, 1);
                ((FrameLayout) gbbVar.pcc()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) gbbVar.pcc();
                this.zti = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.pcc = false;
                return;
            }
            return;
        }
        double vj = gbbVar.vj();
        double wh = gbbVar.wh();
        double qf = gbbVar.qf();
        double kj = gbbVar.kj();
        int sf = rj.sf(this.vy, (float) vj);
        int sf2 = rj.sf(this.vy, (float) wh);
        int sf3 = rj.sf(this.vy, (float) qf);
        int sf4 = rj.sf(this.vy, (float) kj);
        if ((kj != 0.0d && qf != 0.0d) || this.atb.gm() == 7 || this.atb.gm() == 10 || (this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo)) {
            if ((this.atb.gm() == 7 || this.atb.gm() == 10 || (this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo)) && (gbbVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.sf)) {
                FrameLayout dax = ((com.bytedance.sdk.openadsdk.core.hc.wh.sf) gbbVar).dax();
                if (dax != null) {
                    if (this.zti.getParent() != null) {
                        ((ViewGroup) this.zti.getParent()).removeView(this.zti);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    dax.addView(this.zti, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.zti.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(sf3, sf4);
            }
            layoutParams2.width = sf3;
            layoutParams2.height = sf4;
            layoutParams2.topMargin = sf2;
            layoutParams2.leftMargin = sf;
            layoutParams2.setMarginStart(sf);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.zti.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public int getDynamicShowType() {
        if (this.atb == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(this.tmg, lu.oo().qf(String.valueOf(this.tmg.kot())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.zti;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public long oo() {
        return this.qf.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public boolean pcc(JSONObject jSONObject) {
        of ofVar;
        if (jSONObject == null) {
            this.sf = false;
            return false;
        }
        int i = this.gm;
        if (i != 1 && i != 2) {
            this.sf = false;
            return false;
        }
        int optInt = jSONObject.optInt("switch", 0);
        float optDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.oo = optDouble;
        if (optDouble <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (ofVar = this.tmg) != null && ofVar.uk() != null) {
            this.oo = this.tmg.uk().pcc();
        }
        boolean z = optInt == 1;
        this.sf = z;
        com.bytedance.sdk.openadsdk.component.wh.sf sfVar = this.wh;
        if (sfVar != null) {
            sfVar.pcc(this.gm, this.oo, z);
            com.bytedance.sdk.openadsdk.component.kj.gm gmVar = this.kj;
            if (gmVar != null && gmVar.sf() != null && this.qf != null) {
                this.kj.sf().pcc(this.qf.pcc());
                lo.pcc("PAGAppOpenAdExpressView", "isAccelerate =" + this.sf + ",total duration = " + this.kj.sf().nac());
            }
        }
        if (this.gm == 1) {
            return true;
        }
        if (!this.sf) {
            this.oo = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar2 = this.kj;
        if (gmVar2 != null) {
            return gmVar2.pcc(this.oo);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void qf() {
        this.jr = true;
        this.zti = new FrameLayout(this.vy);
        if (!com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg) && !com.bytedance.sdk.openadsdk.core.hc.vj.sf(this.tmg)) {
            addView(this.zti, new FrameLayout.LayoutParams(-1, -1));
        }
        super.qf();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.hc.kj() { // from class: com.bytedance.sdk.openadsdk.component.vy.sf.1
            @Override // com.bytedance.sdk.openadsdk.hc.kj
            public void pcc(gbb gbbVar) {
                sf.this.pcc(gbbVar);
            }
        });
    }

    public void setExpressVideoListenerProxy(fem femVar) {
        this.pq = femVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.wh.pcc pccVar) {
        this.lq = pccVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.kj.gm gmVar) {
        this.kj = gmVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void sf() {
        super.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public int vj() {
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar = this.kj;
        if (gmVar != null && gmVar.qf()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar2 = this.kj;
        if (gmVar2 != null && gmVar2.wh()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar3 = this.kj;
        if (gmVar3 != null && gmVar3.vj()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar4 = this.kj;
        if (gmVar4 == null || !gmVar4.gm()) {
            com.bytedance.sdk.openadsdk.component.kj.gm gmVar5 = this.kj;
            return (gmVar5 == null || !gmVar5.oo()) ? 3 : 5;
        }
        qf(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void wh() {
        com.bytedance.sdk.openadsdk.component.wh.pcc pccVar = this.lq;
        if (pccVar != null) {
            pccVar.sf(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.jr
    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar, gbb gbbVar) {
        this.atb = ooVar;
        if (ooVar instanceof tsz) {
            tsz tszVar = (tsz) ooVar;
            if (tszVar.yt() != null) {
                tszVar.yt().pcc((dax) this);
            }
        }
        if (gbbVar != null && gbbVar.sf()) {
            pcc(gbbVar);
        }
        super.pcc(ooVar, gbbVar);
    }

    public void pcc(final gbb gbbVar) {
        if (gbbVar == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.vy.sf.2
            @Override // java.lang.Runnable
            public void run() {
                sf.this.gm(gbbVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc() {
        com.bytedance.sdk.openadsdk.component.wh.pcc pccVar = this.lq;
        if (pccVar != null) {
            pccVar.pcc(this);
        }
    }

    public void pcc(long j, long j2) {
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) ooVar).pcc(j, j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i) {
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar = this.kj;
        if (gmVar == null) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                gmVar.kj();
                this.wh.oo();
                return;
            } else if (i == 3) {
                gmVar.vy();
                this.wh.gm();
                return;
            } else if (i == 4) {
                gmVar.ork();
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (gmVar.vj() || this.kj.wh()) {
            return;
        }
        this.kj.pcc(getVideoFrameLayout(), this.vj, this.tmg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.kj
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        if (i != -1 && gmVar != null && i == 3) {
            wh();
        } else {
            super.pcc(view, i, gmVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void pcc(hc.pcc pccVar) {
        pccVar.vj(com.bytedance.sdk.openadsdk.component.qf.pcc.pcc());
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public long gm() {
        return this.qf.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void gm(JSONObject jSONObject) {
        of ofVar = this.tmg;
        boolean z = ofVar != null && ofVar.rt() == 0;
        of ofVar2 = this.tmg;
        com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(jSONObject, ofVar2 != null ? ofVar2.kot() : 0, z);
    }
}
