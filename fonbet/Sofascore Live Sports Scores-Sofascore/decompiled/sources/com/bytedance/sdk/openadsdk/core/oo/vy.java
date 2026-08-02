package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.gpj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cem;
import defpackage.zdm;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends com.bytedance.sdk.openadsdk.core.ork.pcc implements zdm, cem {
    private long dax;
    private com.bytedance.sdk.openadsdk.core.jr.sf.wh gbb;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm hc;
    private String jr;
    private PAGBannerAdWrapperListener nac;
    public boolean pcc;
    private fum tmg;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public com.bytedance.sdk.openadsdk.core.wh.oo gm;
        public PAGLogoView oo;
        public FrameLayout pcc;
        public tmg sf;
        public com.bytedance.sdk.openadsdk.core.wh.oo vj;

        private pcc() {
        }
    }

    public vy(@NonNull Context context) {
        super(context);
        this.pcc = true;
        this.sf = context;
    }

    private void pcc(gpj gpjVar) {
        View view;
        of ofVar = this.gm;
        if (ofVar != null) {
            int ct = ofVar.ct();
            pcc sf = sf(gpjVar);
            if (sf == null || (view = sf.pcc) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar = sf.gm;
            PAGLogoView pAGLogoView = sf.oo;
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = sf.vj;
            if (ooVar2 != null && this.gm.of()) {
                rj.pcc((View) ooVar2, 0);
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(lu.pcc(), 11.0f, true), ooVar2, this.gm);
            }
            com.bytedance.sdk.openadsdk.core.jr.sf.wh videoView = getVideoView();
            if (videoView != null) {
                this.gbb = videoView;
                videoView.setVideoAdLoadListener(this);
                this.gbb.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(ooVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(ooVar2, friendlyObstructionPurpose));
                this.gbb.pcc(arrayList);
                this.gbb.setAdCreativeClickListener(new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.vy.1
                    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.pcc
                    public void pcc(View view2, int i) {
                        if (vy.this.nac != null) {
                            vy.this.nac.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.vy.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                            IABLandingPageActivity.pcc(((com.bytedance.sdk.openadsdk.core.ork.pcc) vy.this).sf, ((com.bytedance.sdk.openadsdk.core.ork.pcc) vy.this).gm, ((com.bytedance.sdk.openadsdk.core.ork.pcc) vy.this).wh);
                        } else {
                            TTWebsiteActivity.pcc(((com.bytedance.sdk.openadsdk.core.ork.pcc) vy.this).sf, ((com.bytedance.sdk.openadsdk.core.ork.pcc) vy.this).gm, ((com.bytedance.sdk.openadsdk.core.ork.pcc) vy.this).wh);
                        }
                    }
                });
            }
            if (ooVar != null) {
                ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.vy.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        vy.this.pcc();
                    }
                });
            }
            tmg tmgVar = sf.sf;
            of ofVar2 = this.gm;
            if (ofVar2 != null && ofVar2.ibs() != null && tmgVar != null) {
                int ork = this.gm.ibs().ork();
                float vh = this.gm.ibs().vh();
                if (ork > 0 && vh > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    tmgVar.setRatio(ork / vh);
                } else if (ct == 15) {
                    tmgVar.setRatio(0.5625f);
                } else if (ct == 5) {
                    tmgVar.setRatio(1.7777778f);
                } else {
                    tmgVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && tmgVar != null) {
                tmgVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            pcc((View) videoView, true);
            pcc((View) this, true);
            pcc(tmgVar);
        }
    }

    private pcc sf(gpj gpjVar) {
        com.bytedance.sdk.openadsdk.core.wh.oo sf;
        pcc pccVar = new pcc();
        pccVar.pcc = new FrameLayout(this.sf);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        pccVar.pcc.setLayoutParams(layoutParams);
        pccVar.sf = new tmg(this.sf);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        pccVar.sf.setLayoutParams(layoutParams2);
        pccVar.pcc.addView(pccVar.sf);
        int sf2 = rj.sf(this.sf, 5.0f);
        if (gpjVar == null || gpjVar.pcc != 1) {
            sf = com.bytedance.sdk.openadsdk.core.widget.wh.sf(getContext());
            pccVar.gm = sf;
        } else {
            sf = com.bytedance.sdk.openadsdk.core.widget.wh.pcc(getContext());
            pccVar.gm = sf;
        }
        sf.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(sf2, sf2, sf2, sf2);
        pccVar.gm.setLayoutParams(layoutParams3);
        pccVar.pcc.addView(pccVar.gm);
        pccVar.oo = PAGLogoView.createPAGLogoViewByMaterial(this.sf, this.gm);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(sf2, sf2, sf2, sf2);
        pccVar.oo.setLayoutParams(layoutParams4);
        pccVar.pcc.addView(pccVar.oo);
        pccVar.vj = new com.bytedance.sdk.openadsdk.core.wh.oo(this.sf);
        int sf3 = rj.sf(this.sf, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(sf3, sf3);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = sf2;
        layoutParams5.bottomMargin = sf2;
        pccVar.vj.setVisibility(8);
        pccVar.vj.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pccVar.vj.setLayoutParams(layoutParams5);
        pccVar.pcc.addView(pccVar.vj);
        return pccVar;
    }

    private void vj() {
        gpj pcc2 = sf.pcc(this.tmg.getExpectExpressWidth(), this.tmg.getExpectExpressHeight());
        if (this.tmg.getExpectExpressWidth() <= 0 || this.tmg.getExpectExpressHeight() <= 0) {
            int gm = rj.gm(this.sf);
            this.qf = gm;
            this.kj = Float.valueOf(gm / pcc2.sf).intValue();
        } else {
            this.qf = rj.sf(this.sf, this.tmg.getExpectExpressWidth());
            this.kj = rj.sf(this.sf, this.tmg.getExpectExpressHeight());
        }
        int i = this.qf;
        if (i > 0 && i > rj.gm(this.sf)) {
            this.qf = rj.gm(this.sf);
            this.kj = Float.valueOf(this.kj * (rj.gm(this.sf) / this.qf)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.qf, this.kj);
        }
        layoutParams.width = this.qf;
        layoutParams.height = this.kj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        pcc(pcc2);
    }

    public long getVideoProgress() {
        return this.dax;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.nac = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.jr = str;
    }

    @Override // defpackage.zdm
    public void g_() {
    }

    @Override // defpackage.zdm
    public void h_() {
    }

    @Override // defpackage.zdm
    public void i_() {
    }

    @Override // defpackage.zdm
    public void j_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    public void pcc(View view, int i, dax daxVar) {
        fum fumVar = this.tmg;
        if (fumVar != null) {
            fumVar.pcc(view, i, daxVar);
            com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.gbb;
            if (whVar == null || whVar.getNativeVideoController() == null) {
                return;
            }
            this.gbb.getNativeVideoController().nn();
        }
    }

    public void pcc(of ofVar, fum fumVar, com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar) {
        setBackgroundColor(-16777216);
        this.gm = ofVar;
        this.tmg = fumVar;
        this.hc = gmVar;
        this.wh = "banner_ad";
        fumVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        vj();
    }

    @Override // defpackage.cem
    public void pcc(int i, int i2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    public void pcc() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.vj;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.gm.gm gmVar = this.oo;
        if (gmVar != null) {
            gmVar.pcc();
        } else {
            TTDelegateActivity.pcc(this.gm, this.jr);
        }
    }

    @Override // defpackage.zdm
    public void pcc(long j, long j2) {
        this.dax = j;
    }
}
