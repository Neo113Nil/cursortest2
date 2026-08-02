package com.bytedance.sdk.openadsdk.core.ork;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.ork.wh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.ye;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private pcc gm;
    private ScheduledFuture<?> kj;
    private com.bytedance.sdk.component.adexpress.sf.jr oo;
    com.bytedance.sdk.openadsdk.core.model.of pcc;
    private int qf;
    private final Context sf;
    private fum vj;
    private int vy;
    private int wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ork.gm$gm, reason: collision with other inner class name */
    public interface InterfaceC0092gm {
        void pcc();

        void pcc(int i, int i2);

        void pcc(String str);

        void sf(String str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements Runnable {
        InterfaceC0092gm pcc;

        public sf(InterfaceC0092gm interfaceC0092gm) {
            this.pcc = interfaceC0092gm;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0092gm interfaceC0092gm = this.pcc;
            if (interfaceC0092gm != null) {
                interfaceC0092gm.pcc(107, 107);
            }
        }
    }

    public gm(Context context, fum fumVar, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str) {
        this.pcc = ofVar;
        this.sf = context;
        this.vj = fumVar;
        pcc(fumVar);
        this.gm = new pcc(context, ofVar, this.wh, this.qf, str, this.vy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        try {
            ScheduledFuture<?> scheduledFuture = this.kj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.kj.cancel(false);
            this.kj = null;
        } catch (Throwable unused) {
        }
    }

    private void pcc(fum fumVar) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.pcc;
        if (ofVar != null && ofVar.nmd()) {
            this.wh = -1;
            this.qf = -1;
            return;
        }
        gpj pcc2 = com.bytedance.sdk.openadsdk.core.oo.sf.pcc(fumVar.getExpectExpressWidth(), fumVar.getExpectExpressHeight());
        this.vy = pcc2.pcc;
        if (fumVar.getExpectExpressWidth() <= 0 || fumVar.getExpectExpressHeight() <= 0) {
            int gm = rj.gm(this.sf);
            this.wh = gm;
            this.qf = Float.valueOf(gm / pcc2.sf).intValue();
        } else {
            this.wh = rj.sf(this.sf, fumVar.getExpectExpressWidth());
            this.qf = rj.sf(this.sf, fumVar.getExpectExpressHeight());
        }
        int i = this.wh;
        if (i <= 0 || i <= rj.gm(this.sf)) {
            return;
        }
        this.wh = rj.gm(this.sf);
        this.qf = Float.valueOf(this.qf * (rj.gm(this.sf) / this.wh)).intValue();
    }

    public void sf() {
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.oo();
            this.gm = null;
        }
        gm();
        this.oo = null;
        this.vj = null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements com.bytedance.sdk.component.adexpress.sf.oo<View>, wh.sf {
        private com.bytedance.sdk.component.adexpress.sf.qf gbb;
        private TTDislikeDialogAbstract gm;
        private int hc;
        private PAGExpressAdWrapperListener jr;
        private FrameLayout kj;
        private String oo;
        private final int ork;
        AtomicBoolean pcc = new AtomicBoolean(false);
        private final int qf;
        private com.bytedance.sdk.openadsdk.gm.gm sf;
        private wh tmg;
        private String vh;
        private final Context vj;
        private com.bytedance.sdk.openadsdk.core.model.of vy;
        private final int wh;

        public pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, int i2, String str, int i3) {
            this.vh = str;
            if (ofVar != null && ofVar.nmd()) {
                this.vh = "fullscreen_interstitial_ad";
            }
            this.vj = context;
            this.wh = i;
            this.qf = i2;
            this.vy = ofVar;
            this.ork = rj.sf(context, 3.0f);
            this.hc = i3;
            wh();
        }

        private wh kj() {
            wh sf = oo.pcc().sf();
            this.tmg = sf;
            if (sf == null) {
                this.tmg = new wh(this.vj);
            }
            oo.pcc().gm(this.tmg);
            this.tmg.pcc(this.vy, this, this.vh);
            this.tmg.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.tmg;
        }

        private View qf() {
            PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.vj, this.vy);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.of ofVar = this.vy;
            if (ofVar == null || !ofVar.nmd()) {
                int i = this.ork;
                layoutParams.topMargin = i;
                layoutParams.leftMargin = i;
            } else {
                layoutParams.leftMargin = rj.sf(this.vj, 20.0f);
                layoutParams.bottomMargin = rj.sf(this.vj, 20.0f);
                layoutParams.gravity = 8388691;
            }
            createPAGLogoViewByMaterial.setLayoutParams(layoutParams);
            createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ork.gm.pcc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (com.bytedance.sdk.openadsdk.utils.sf.wh() && com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                        IABLandingPageActivity.pcc(pcc.this.vj, pcc.this.vy, pcc.this.vh);
                    } else {
                        TTWebsiteActivity.pcc(pcc.this.vj, pcc.this.vy, pcc.this.vh);
                    }
                }
            });
            return createPAGLogoViewByMaterial;
        }

        private void wh() {
            FrameLayout frameLayout = new FrameLayout(this.vj);
            this.kj = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.wh, this.qf);
            }
            layoutParams.width = this.wh;
            layoutParams.height = this.qf;
            layoutParams.gravity = 17;
            this.kj.setLayoutParams(layoutParams);
            wh kj = kj();
            this.kj.addView(kj);
            View qf = qf();
            this.kj.addView(qf);
            com.bytedance.sdk.openadsdk.core.model.of ofVar = this.vy;
            if (ofVar != null && ofVar.nmd()) {
                kj.setBackgroundColor(-16777216);
                kj.pcc(((Activity) this.vj).findViewById(com.bytedance.sdk.openadsdk.utils.nac.gl), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            kj.pcc(qf, friendlyObstructionPurpose);
            Context context = this.vj;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View findViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.nac.wke);
            if (findViewById != null) {
                kj.pcc(findViewById, friendlyObstructionPurpose);
            }
            View findViewById2 = ((Activity) this.vj).findViewById(com.bytedance.sdk.openadsdk.utils.nac.jk);
            if (findViewById2 != null) {
                kj.pcc(findViewById2, friendlyObstructionPurpose);
            }
        }

        public void oo() {
            this.kj = null;
            this.sf = null;
            this.gm = null;
            this.gbb = null;
            this.vy = null;
            wh whVar = this.tmg;
            if (whVar != null) {
                whVar.jr();
                oo.pcc().pcc(this.tmg);
            }
            this.pcc.set(true);
        }

        @Override // com.bytedance.sdk.component.adexpress.sf.oo
        public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar;
            if (this.pcc.get()) {
                return;
            }
            if (this.vj == null || (ofVar = this.vy) == null) {
                qfVar.pcc(106, "material null");
                return;
            }
            this.gbb = qfVar;
            if (TextUtils.isEmpty(ofVar.zgt())) {
                qfVar.pcc(106, "dsp data is null");
            } else {
                this.tmg.gpj();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
        public void sf() {
            if (this.gbb != null) {
                com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
                gbbVar.pcc(true);
                gbbVar.pcc(rj.gm(this.vj, this.wh));
                gbbVar.sf(rj.gm(this.vj, this.qf));
                this.gbb.pcc(this.kj, gbbVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.sf.oo
        public View vj() {
            return this.kj;
        }

        @Override // com.bytedance.sdk.component.adexpress.sf.oo
        public int gm() {
            return 5;
        }

        public void pcc(ye yeVar) {
            if (yeVar instanceof com.bytedance.sdk.openadsdk.gm.gm) {
                this.sf = (com.bytedance.sdk.openadsdk.gm.gm) yeVar;
            }
        }

        public void pcc(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar;
            if (tTDislikeDialogAbstract != null && (ofVar = this.vy) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(ofVar.hl(), this.vy.ywc());
            }
            this.gm = tTDislikeDialogAbstract;
        }

        public void pcc(String str) {
            this.oo = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
        public View pcc() {
            FrameLayout frameLayout = this.kj;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
        public void pcc(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.jr;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
        public void pcc(int i, int i2) {
            com.bytedance.sdk.component.adexpress.sf.qf qfVar = this.gbb;
            if (qfVar != null) {
                qfVar.pcc(i, "render fail");
            }
        }

        public void pcc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.jr = pAGExpressAdWrapperListener;
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.sf.jr jrVar) {
        this.oo = jrVar;
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.pcc;
        if (ofVar != null && ofVar.nmd()) {
            this.kj = rnn.pcc().schedule(new sf(this.gm.tmg), com.bytedance.sdk.openadsdk.core.lu.oo().pq(), TimeUnit.MILLISECONDS);
        }
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(new com.bytedance.sdk.component.adexpress.sf.qf() { // from class: com.bytedance.sdk.openadsdk.core.ork.gm.1
                @Override // com.bytedance.sdk.component.adexpress.sf.qf
                public void pcc(View view, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
                    if (gm.this.vj == null || view == null) {
                        if (gm.this.oo != null) {
                            gm.this.oo.a_(106);
                        }
                    } else if (gm.this.oo != null) {
                        gm.this.oo.pcc(gm.this.gm, gbbVar);
                    }
                    gm.this.gm();
                }

                @Override // com.bytedance.sdk.component.adexpress.sf.qf
                public void pcc(int i, String str) {
                    if (gm.this.oo != null) {
                        gm.this.oo.a_(106);
                    }
                    gm.this.gm();
                }
            });
            View vj = this.gm.vj();
            this.vj.removeView(vj);
            if (vj.getParent() != null) {
                ((ViewGroup) vj.getParent()).removeView(vj);
            }
            this.vj.addView(vj, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.sf.jr jrVar = this.oo;
        if (jrVar != null) {
            jrVar.a_(106);
        }
    }

    public void pcc(ye yeVar) {
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(yeVar);
        }
    }

    public void pcc(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(tTDislikeDialogAbstract);
        }
    }

    public void pcc(String str) {
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(str);
        }
    }

    public void pcc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(pAGExpressAdWrapperListener);
        }
    }
}
