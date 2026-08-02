package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.yt;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.mz1;
import defpackage.swm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends gm {
    private kj dax;
    private int gbb;
    private sf.AbstractC0065sf hc;
    private vj jr;
    private com.bytedance.sdk.openadsdk.component.reward.top.gm kj;
    private boolean lu;
    private int nac;
    private com.bytedance.sdk.openadsdk.core.wh.gm ork;
    private final List<kj> qf;
    private com.bytedance.sdk.openadsdk.core.wh.kj tmg;
    private com.bytedance.sdk.openadsdk.core.wh.gm vh;
    private com.bytedance.sdk.openadsdk.jr.pcc vy;
    public gbb wh;

    public vy(Activity activity, of ofVar, sf sfVar) {
        super(activity, ofVar, sfVar);
        this.qf = new ArrayList();
        this.lu = false;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(activity);
        this.ork = gmVar;
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.ork);
    }

    private void fum() {
        boolean jr = vh.sf().jr(String.valueOf(this.sf.kot()));
        int sf = this.oo.wh() ? sf(0, jr) : 0;
        if (this.qf.isEmpty() && !atb.gm(this.sf)) {
            int i = sf + 1;
            this.qf.add(pcc(this.oo, this.sf, sf, i, true));
            sf = i;
        }
        pcc(sf, jr);
    }

    private void gm(kj kjVar) {
        try {
            this.tmg.setText(this.pcc.getString(tz.sf(lu.pcc(), "tt_multiple_ad_indicator"), Integer.valueOf(kjVar.vh + 1), Integer.valueOf(this.gbb)));
            this.tmg.setVisibility(0);
        } catch (Throwable th) {
            lo.pcc("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    private void oo(kj kjVar) {
        com.bytedance.sdk.openadsdk.jr.pcc pccVar = this.vy;
        if (pccVar != null) {
            rj.qf(pccVar);
            this.vy = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.kj;
        if (gmVar != null) {
            rj.qf(gmVar);
            rj.qf(this.kj.getITopLayout());
            this.kj = null;
        }
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            abstractC0065sf.gm();
        }
        if (kjVar instanceof qf) {
            ((qf) kjVar).zsj();
        }
        gbb gbbVar = this.wh;
        if (gbbVar != null) {
            gbbVar.gm();
        }
    }

    private int sf(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        List<of> ky = this.sf.ky();
        if (ky.isEmpty()) {
            return i;
        }
        int size = ky.size();
        this.gbb = size;
        int i5 = i;
        int i6 = 0;
        while (i6 < size) {
            boolean z2 = i6 == size + (-1);
            of ofVar = ky.get(i6);
            if (ofVar != null) {
                ofVar.rnn(this.vj);
            }
            if (atb.sf(ofVar)) {
                boolean gm = atb.gm(ofVar);
                List<kj> list = this.qf;
                if (gm) {
                    i2 = i5 + 1;
                    vj vjVar = new vj(this.oo, ofVar, i5, i6, true, z2, false);
                    ofVar = ofVar;
                    list.add(vjVar);
                    i4 = i2;
                } else {
                    list.add(pcc(this.oo, ofVar, i5, i6, z2));
                    i3 = i5 + 2;
                    this.qf.add(new vj(this.oo, ofVar, i5 + 1, i6, true, z2, false));
                    i4 = i3;
                }
            } else {
                if (com.bytedance.sdk.openadsdk.core.model.lo.wh(ofVar)) {
                    i2 = i5 + 1;
                    this.qf.add(pcc(this.oo, ofVar, i5, i6, z2));
                } else {
                    boolean qf = com.bytedance.sdk.openadsdk.core.model.lo.qf(ofVar);
                    List<kj> list2 = this.qf;
                    if (qf) {
                        list2.add(pcc(this.oo, ofVar, i5, i6, z2));
                        i3 = i5 + 2;
                        this.qf.add(new vj(this.oo, ofVar, i5 + 1, i6, false, z2, false));
                        i4 = i3;
                    } else {
                        i2 = i5 + 1;
                        list2.add(pcc(this.oo, ofVar, i5, i6, z2));
                    }
                }
                i4 = i2;
            }
            if (z) {
                boolean pcc = this.oo.pcc(ofVar);
                sf sfVar = this.oo;
                if (z2) {
                    if (sfVar.oo() && pcc && !atb.sf(ofVar)) {
                        this.qf.add(new vj(this.oo, ofVar, i4, i6, false, z2, false));
                        i4++;
                    }
                    if (!TextUtils.isEmpty(ofVar.kj())) {
                        vj vjVar2 = new vj(this.oo, ofVar, i4, i6, false, z2, true);
                        this.jr = vjVar2;
                        this.qf.add(vjVar2);
                        i5 = i4 + 1;
                    }
                } else if (sfVar.vj() && pcc) {
                    this.qf.add(new vj(this.oo, ofVar, i4, i6, false, z2, false));
                    i5 = i4 + 1;
                }
                i6++;
            }
            i5 = i4;
            i6++;
        }
        return i5;
    }

    private void tz() {
        gbb pcc = com.bytedance.sdk.openadsdk.utils.vy.pcc(this.pcc, new vy.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.vy.1
            @Override // com.bytedance.sdk.openadsdk.utils.vy.pcc
            public View pcc() {
                if (vy.this.kj != null) {
                    return vy.this.kj.getCloseBackupButton();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vy.pcc
            public void sf() {
                if (vy.this.kj != null) {
                    vy.this.kj.setSkipInvisiable();
                }
            }
        });
        this.wh = pcc;
        pcc.pcc(new jr() { // from class: com.bytedance.sdk.openadsdk.activity.single.vy.2
            @Override // com.bytedance.sdk.openadsdk.utils.jr
            public void pcc() {
                com.bytedance.sdk.openadsdk.component.oo.sf.pcc("force_button_tracker", "show", vy.this.sf);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public vj gbb() {
        vj vjVar = this.jr;
        if (vjVar != null) {
            return vjVar;
        }
        kj kjVar = this.dax;
        int i = kjVar != null ? kjVar.ork : -1;
        int size = this.qf.size() - 1;
        while (true) {
            if (size <= i) {
                break;
            }
            kj kjVar2 = this.qf.get(size);
            if (kjVar2 instanceof vj) {
                vj vjVar2 = (vj) kjVar2;
                if (vjVar2.pcc) {
                    this.jr = vjVar2;
                    break;
                }
            }
            size--;
        }
        return this.jr;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void gpj() {
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            abstractC0065sf.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public kj hc() {
        kj kjVar = this.dax;
        if (kjVar == null) {
            return null;
        }
        int i = kjVar.ork;
        while (true) {
            i++;
            if (i >= this.qf.size()) {
                return null;
            }
            kj kjVar2 = this.qf.get(i);
            if (kjVar2 instanceof pcc) {
                return kjVar2;
            }
            if ((kjVar2 instanceof vj) && atb.gm(kjVar2.wh) && kjVar2.dax) {
                return kjVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public List<of> jr() {
        return this.sf.ky();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public int kj() {
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            return abstractC0065sf.pcc();
        }
        return 0;
    }

    public int lo() {
        kj kjVar = this.dax;
        if (kjVar != null) {
            return kjVar.ork;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void lu() {
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            abstractC0065sf.kj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public int ork() {
        return this.nac;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(kj kjVar, kj kjVar2, sf.vj vjVar) {
        kj kjVar3 = this.dax;
        if ((kjVar3 == null || kjVar3 == kjVar) && !com.bytedance.sdk.component.utils.sf.pcc(this.pcc)) {
            lo();
            if (kjVar2 == null) {
                kj kjVar4 = this.dax;
                int i = kjVar4 != null ? kjVar4.ork + 1 : 0;
                if (i < this.qf.size()) {
                    kjVar2 = this.qf.get(i);
                }
                if (kjVar2 == null) {
                    this.oo.qf();
                    return;
                }
            }
            kj kjVar5 = this.dax;
            if (kjVar5 != null) {
                if (kjVar5 == kjVar2) {
                    return;
                }
                kjVar5.gbb();
                this.dax.oo();
                com.bytedance.sdk.openadsdk.component.reward.view.kj pcc = this.dax.pcc();
                if (pcc != null) {
                    this.vh.removeView(pcc);
                }
                this.dax.gpj();
                this.dax.tmg = false;
                if (this.oo.vj()) {
                    kj kjVar6 = this.dax;
                    if (kjVar6 instanceof pcc) {
                        int i2 = kjVar6.ork + 1;
                        kj kjVar7 = i2 < this.qf.size() ? this.qf.get(i2) : null;
                        if ((kjVar7 instanceof vj) && kjVar7 != kjVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.kj pcc2 = kjVar7.pcc();
                            if (pcc2 != null && pcc2.getParent() != null && (pcc2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) pcc2.getParent()).removeView(pcc2);
                            }
                            kjVar7.gpj();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.sf.pcc(this.pcc)) {
                return;
            }
            kjVar2.tmg = true;
            kj kjVar8 = this.dax;
            this.dax = kjVar2;
            sf(kjVar8, kjVar2, vjVar);
            kjVar2.sf(this.pcc, vjVar);
            com.bytedance.sdk.openadsdk.component.reward.view.kj pcc3 = kjVar2.pcc();
            if (pcc3 != null) {
                ViewParent parent = pcc3.getParent();
                if (parent != null) {
                    if (parent == this.vh) {
                        pcc3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(pcc3);
                    }
                }
                if (pcc3.getParent() == null) {
                    this.vh.addView(pcc3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i3 = kjVar8 != null ? kjVar8.ork : 0; i3 < this.qf.size(); i3++) {
                this.qf.get(i3).pcc(kjVar8, this.dax, vjVar);
            }
            this.oo.sf(this.dax);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void qf() {
        super.qf();
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.oo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public com.bytedance.sdk.openadsdk.component.reward.top.gm tmg() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public kj vh() {
        return this.dax;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void vy() {
        super.vy();
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.lo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void wh() {
        super.wh();
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.hc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public boolean oo() {
        if (this.qf.isEmpty()) {
            return false;
        }
        kj kjVar = (kj) mz1.g(1, this.qf);
        return (kjVar instanceof vj) && ((vj) kjVar).pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void gm() {
        super.gm();
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.gbb();
        }
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            abstractC0065sf.pcc(-1);
        }
        gbb gbbVar = this.wh;
        if (gbbVar != null) {
            gbbVar.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc() {
        super.pcc();
        fum();
    }

    private static kj pcc(sf sfVar, of ofVar, int i, int i2, boolean z) {
        boolean tuy = ofVar.tuy();
        AdSlot gqd = ofVar.gqd();
        if (gqd != null) {
            tuy = gqd.getDurationSlotType() == 7;
        }
        if (tuy) {
            return new qf(sfVar, ofVar, i, i2, z);
        }
        return new wh(sfVar, ofVar, i, i2, z);
    }

    private void pcc(int i, boolean z) {
        if (gbb() == null && this.oo.wh()) {
            tz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(Bundle bundle) {
        super.pcc(bundle);
        this.vh = new com.bytedance.sdk.openadsdk.core.wh.gm(this.pcc);
        this.ork.addView(this.vh, new FrameLayout.LayoutParams(-1, -1));
        this.vy = new com.bytedance.sdk.openadsdk.jr.pcc(this.pcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, rj.sf(this.pcc, 2.0f));
        layoutParams.gravity = 80;
        this.ork.addView(this.vy, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this.pcc);
        this.tmg = kjVar;
        kjVar.setTextColor(-1);
        this.tmg.setTextSize(15.0f);
        this.tmg.setShadowLayer(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = rj.sf(this.pcc, 60.0f);
        layoutParams2.rightMargin = rj.sf(this.pcc, 16.0f);
        layoutParams2.gravity = 8388661;
        this.ork.addView(this.tmg, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = new com.bytedance.sdk.openadsdk.component.reward.top.gm(this.pcc);
        this.kj = gmVar;
        this.ork.addView(gmVar, new FrameLayout.LayoutParams(-1, -2));
        this.kj.pcc(this.sf);
        this.kj.setShowDislike(true);
        pcc(null, null, new sf.vj(1, null));
        com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this.pcc, this.ork, com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this.sf.qxv()));
    }

    private void sf(kj kjVar, kj kjVar2, sf.vj vjVar) {
        gbb gbbVar;
        of ofVar;
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf == null) {
            if (kjVar2 != null && kjVar2.c_()) {
                abstractC0065sf = new sf.oo(this.oo, this.sf, this.kj);
                this.hc = abstractC0065sf;
            } else {
                abstractC0065sf = new sf.pcc(this.oo, this.sf, this.kj);
                this.hc = abstractC0065sf;
            }
        }
        abstractC0065sf.sf();
        int sf = sf(kjVar2);
        boolean z = kjVar2 instanceof vj;
        if (z && !((vj) kjVar2).pcc && !kjVar2.dax && (ofVar = kjVar2.wh) != null && ofVar.prg()) {
            this.hc.oo();
        } else {
            this.hc.pcc(sf, kjVar2.wh);
            boolean z2 = kjVar2 instanceof vj;
            if (z2 && ((vj) kjVar2).pcc) {
                oo(kjVar);
            } else if (kjVar2.wh.jkt()) {
                boolean z3 = false;
                boolean z4 = (kjVar2 instanceof pcc) && com.bytedance.sdk.openadsdk.core.model.lo.wh(kjVar2.wh);
                if (z2 && (kjVar2.dax || com.bytedance.sdk.openadsdk.core.model.lo.qf(kjVar2.wh))) {
                    z3 = true;
                }
                if (z4 || z3) {
                    this.hc.pcc(kjVar2);
                }
            } else if (kjVar2.dax) {
                this.hc.pcc(kjVar2.wh, kjVar2.nac);
            } else if (z2) {
                this.hc.gm(kjVar2.wh.nfv().oo());
            }
        }
        if (z && (gbbVar = this.wh) != null && kjVar == null) {
            gbbVar.pcc(kjVar2.vy, sf * 1000);
        }
        if (kjVar2 instanceof pcc) {
            this.nac++;
            pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (com.bytedance.sdk.openadsdk.core.model.lo.wh(kjVar2.wh)) {
                this.tmg.setVisibility(8);
                return;
            } else {
                gm(kjVar2);
                return;
            }
        }
        if (z) {
            if (((vj) kjVar2).pcc) {
                this.tmg.setVisibility(8);
                return;
            }
            if (kjVar2.dax && atb.gm(kjVar2.wh)) {
                this.nac++;
            }
            if (!kjVar2.dax && !com.bytedance.sdk.openadsdk.core.model.lo.qf(kjVar2.wh)) {
                gm(kjVar2);
            } else {
                this.tmg.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(int i, int i2) {
        super.pcc(i, i2);
        if (i >= 0) {
            if (TextUtils.isEmpty(this.gm)) {
                this.tmg.setText(this.pcc.getString(tz.sf(lu.pcc(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i)));
            } else {
                this.tmg.setText(String.format(this.gm, Integer.valueOf(i)));
            }
            this.tmg.setVisibility(0);
            return;
        }
        this.tmg.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(Activity activity) {
        super.pcc(activity);
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.sf(activity);
        }
        int lo = lo();
        for (kj kjVar2 : this.qf) {
            if (kjVar2.ork >= lo) {
                kjVar2.gpj();
            }
        }
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            abstractC0065sf.gm();
        }
        gbb gbbVar = this.wh;
        if (gbbVar != null) {
            gbbVar.gm();
        }
        kj kjVar3 = this.dax;
        if (kjVar3 != null && !kjVar3.tz() && !this.sf.duh()) {
            com.bytedance.sdk.openadsdk.core.jr.sf().post(new sf.gm(this.sf));
        }
        this.dax = null;
    }

    private int sf(kj kjVar) {
        of ofVar;
        int oo;
        int i = 0;
        for (int i2 = kjVar.ork; i2 < this.qf.size(); i2++) {
            kj kjVar2 = this.qf.get(i2);
            if ((kjVar2 instanceof vj) && ((vj) kjVar2).pcc) {
                break;
            }
            boolean z = kjVar2.dax;
            boolean qf = com.bytedance.sdk.openadsdk.core.model.lo.qf(kjVar2.wh);
            boolean wh = com.bytedance.sdk.openadsdk.core.model.lo.wh(kjVar2.wh);
            yt pcc = kjVar2.wh.pcc();
            int gm = pcc != null ? pcc.gm() : 10;
            if (kjVar2 instanceof pcc) {
                if (!wh) {
                    swm kez = kjVar2.wh.kez();
                    i = kez != null ? (int) (i + kez.d) : (int) (i + 10);
                }
                i += gm;
            } else {
                if (kjVar2 instanceof vj) {
                    if (!qf) {
                        if (z) {
                            if (!kjVar2.wh.jkt()) {
                                oo = atb.qy(kjVar2.wh) + atb.fum(kjVar2.wh);
                            }
                        } else if (this.oo.vj() && (ofVar = kjVar2.wh) != null && !ofVar.prg()) {
                            oo = kjVar2.wh.nfv().oo();
                        }
                        i = oo + i;
                    }
                    i += gm;
                }
            }
        }
        return i;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(float f) {
        com.bytedance.sdk.openadsdk.jr.pcc pccVar = this.vy;
        if (pccVar == null) {
            return;
        }
        pccVar.setProgress(f);
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.vy.getVisibility() == 0) {
            this.vy.setVisibility(4);
        } else {
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.vy.getVisibility() == 0) {
                return;
            }
            this.vy.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(int i) {
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            if (i == 2) {
                abstractC0065sf.pcc(2);
            } else if (i == 1) {
                abstractC0065sf.sf(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void sf() {
        super.sf();
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.gm();
        }
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf != null) {
            abstractC0065sf.sf(-1);
        }
        gbb gbbVar = this.wh;
        if (gbbVar != null) {
            gbbVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(kj kjVar, sf.vj vjVar) {
        kj kjVar2 = this.dax;
        if (kjVar2 == null || kjVar2 == kjVar) {
            if (kjVar2 != null && (kjVar2 instanceof pcc)) {
                final long gbb = (kjVar2.yt() == null || this.dax.yt().fum == null) ? 0L : this.dax.yt().fum.gbb();
                final int i = this.dax.vh + 1;
                long currentTimeMillis = System.currentTimeMillis();
                kj kjVar3 = this.dax;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(currentTimeMillis, kjVar3.wh, kjVar3.d_(), "dislike_skip", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.vy.3
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        return com.bytedance.sdk.openadsdk.oo.gm.pcc(i);
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject sf() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, gbb);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            kj hc = hc();
            if (hc == null) {
                hc = gbb();
            }
            pcc(this.dax, hc, vjVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void sf(kj kjVar, int i) {
        sf.AbstractC0065sf abstractC0065sf = this.hc;
        if (abstractC0065sf == null) {
            return;
        }
        if (i == 2) {
            abstractC0065sf.pcc(i);
            gbb gbbVar = this.wh;
            if (gbbVar != null) {
                gbbVar.sf();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0065sf.sf(i);
            gbb gbbVar2 = this.wh;
            if (gbbVar2 != null) {
                gbbVar2.pcc();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            try {
                this.dax.yt().fum.zti();
            } catch (Throwable th) {
                lo.gm("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(kj kjVar, boolean z, boolean z2, boolean z3, int i) {
        vj gbb;
        kj kjVar2 = this.dax;
        if ((kjVar2 == null || kjVar2 == kjVar) && (gbb = gbb()) != null) {
            sf.vj vjVar = new sf.vj(i, kjVar != null ? kjVar.yt() : null);
            vjVar.pcc.putBoolean("isSkip", z);
            vjVar.pcc.putBoolean("force", z2);
            vjVar.pcc.putBoolean("isFromLandingPage", z3);
            pcc(this.dax, gbb, vjVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void sf(Activity activity) {
        super.sf(activity);
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.pcc(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(pcc pccVar, boolean z) {
        sf.AbstractC0065sf abstractC0065sf;
        super.pcc(pccVar, z);
        if (pccVar == null || pccVar != this.dax || (abstractC0065sf = this.hc) == null) {
            return;
        }
        abstractC0065sf.sf(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(kj kjVar) {
        sf.AbstractC0065sf abstractC0065sf;
        super.pcc(kjVar);
        if (kjVar == null) {
            return;
        }
        kjVar.toString();
        if (kjVar.tmg && (abstractC0065sf = this.hc) != null) {
            abstractC0065sf.wh();
        }
        kj hc = hc();
        if (hc instanceof pcc) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt = hc.yt();
            if (yt == null || !com.bytedance.sdk.openadsdk.core.model.lo.wh(yt.sf)) {
                ((pcc) hc).fum();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(kj kjVar, boolean z) {
        sf.AbstractC0065sf abstractC0065sf;
        super.pcc(kjVar, z);
        if (kjVar == null) {
            return;
        }
        kjVar.toString();
        if (!kjVar.tmg || (abstractC0065sf = this.hc) == null) {
            return;
        }
        abstractC0065sf.pcc(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(View view) {
        super.pcc(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.vh.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(View view, boolean z) {
        super.pcc(view, z);
        if (view.getParent() == null && this.vh != null) {
            view.setVisibility(4);
            int childCount = this.vh.getChildCount();
            com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.vh;
            if (z) {
                gmVar.addView(view, 0);
            } else {
                gmVar.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public boolean pcc(kj kjVar, int i) {
        return i == this.qf.size() - 1 && this.qf.get(i) != null && (this.qf.get(i) instanceof vj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(boolean z) {
        super.pcc(z);
        kj kjVar = this.dax;
        if (kjVar != null) {
            kjVar.gm(z);
        }
    }
}
