package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.kj;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.oo.qf;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.core.ork.ork;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.lrr;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private boolean gbb;
    private long gpj;
    private final boolean kj;
    private of oo;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm ork;
    protected oo pcc;
    protected AdSlot sf;
    private qf tmg;
    private fum vh;
    private PAGBannerAdWrapperListener vj;
    private boolean vy;
    private final Context wh;
    private String gm = "banner_ad";
    private long qf = 0;
    private final AtomicBoolean hc = new AtomicBoolean(false);
    private final int jr = 1;
    private final int dax = 0;
    private int nac = -1;
    private final View.OnAttachStateChangeListener lu = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (pcc.this.nac == 0 || pcc.this.vy) {
                return;
            }
            pcc pccVar = pcc.this;
            pccVar.pcc(pccVar.pcc.getCurView(), pcc.this.oo);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            boolean z = pcc.this.gbb;
            pcc pccVar = pcc.this;
            if (z) {
                pccVar.nac = 0;
            } else {
                pccVar.wh();
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.oo.pcc$pcc, reason: collision with other inner class name */
    public static class C0091pcc extends com.bytedance.sdk.component.kj.sf.gm {
        WeakReference<pcc> gm;
        boolean pcc;
        of sf;

        public C0091pcc(boolean z, of ofVar, pcc pccVar) {
            super("ReportWindowFocusChangedAdShow");
            this.pcc = z;
            this.sf = ofVar;
            this.gm = new WeakReference<>(pccVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<pcc> weakReference = this.gm;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.gm.get().sf(this.pcc, this.sf);
        }
    }

    public pcc(Context context, of ofVar, AdSlot adSlot, qf qfVar, boolean z) {
        this.gbb = false;
        this.wh = context;
        this.oo = ofVar;
        this.sf = adSlot;
        this.tmg = qfVar;
        this.gbb = z;
        pcc(context, ofVar, adSlot);
        this.kj = false;
        this.vy = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ork() {
        tmg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(@NonNull final fum fumVar, @NonNull final of ofVar) {
        pcc pccVar;
        final fum fumVar2;
        com.bytedance.sdk.openadsdk.core.kj kjVar;
        if (fumVar == null || ofVar == null) {
            return;
        }
        this.oo = ofVar;
        this.ork = pcc(ofVar);
        this.vh = fumVar;
        final String pcc = tsz.pcc();
        final qf.pcc vh = vh();
        fumVar.setClosedListenerKey(pcc);
        fumVar.setBannerClickClosedListener(vh);
        fumVar.setBackupListener(new com.bytedance.sdk.component.adexpress.sf.gm() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.2
            @Override // com.bytedance.sdk.component.adexpress.sf.gm
            public boolean pcc(ViewGroup viewGroup, int i) {
                try {
                    fumVar.tz();
                    if (!pcc.this.oo.on()) {
                        sf sfVar = new sf(fumVar.getContext());
                        sfVar.setClosedListenerKey(pcc);
                        sfVar.pcc(pcc.this.oo, fumVar, pcc.this.ork);
                        sfVar.setAdInteractionListener(pcc.this.vj);
                        return true;
                    }
                    vy vyVar = new vy(fumVar.getContext());
                    vyVar.setClosedListenerKey(pcc);
                    vyVar.pcc(pcc.this.oo, fumVar, pcc.this.ork);
                    vyVar.setAdInteractionListener(pcc.this.vj);
                    fumVar.setVastVideoHelper(vyVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (this.kj) {
            boolean pcc2 = this.tmg.pcc();
            lrr.sf sfVar = new lrr.sf() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.4
                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void pcc(View view, boolean z) {
                    pcc pccVar2 = pcc.this;
                    if (!z) {
                        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(pccVar2.oo, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(pccVar2.oo, 4);
                    if (pcc.this.hc.compareAndSet(false, true)) {
                        pcc.this.pcc(view, fumVar, ofVar, pcc, vh);
                    }
                    oo ooVar = pcc.this.pcc;
                    if (ooVar == null || ooVar.getCurView() == null) {
                        return;
                    }
                    pcc.this.pcc.getCurView().vh();
                    pcc.this.pcc.getCurView().gpj();
                    pcc.this.pcc.setIsShow(true);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void sf() {
                    pcc pccVar2 = pcc.this;
                    pccVar2.sf(pccVar2.oo);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void pcc() {
                    if (pcc.this.nac != 0) {
                        pcc.this.ork();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void pcc(boolean z) {
                    pcc.this.pcc(z, ofVar);
                }
            };
            pccVar = this;
            lrr.pcc(fumVar, true, 1, pcc2, sfVar, null);
            fumVar2 = fumVar;
            kjVar = null;
        } else {
            kjVar = pcc(fumVar);
            if (kjVar == null) {
                kjVar = new com.bytedance.sdk.openadsdk.core.kj(this.wh, fumVar, this.tmg.pcc());
                fumVar.addView(kjVar);
            }
            kjVar.setAdType(1);
            fumVar2 = fumVar;
            kjVar.setCallback(new kj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.3
                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void pcc(View view) {
                    if (pcc.this.hc.compareAndSet(false, true)) {
                        pcc.this.pcc(view, fumVar2, ofVar, pcc, vh);
                    }
                    oo ooVar = pcc.this.pcc;
                    if (ooVar == null || ooVar.getCurView() == null) {
                        return;
                    }
                    pcc.this.pcc.getCurView().vh();
                    pcc.this.pcc.getCurView().gpj();
                    pcc.this.pcc.setIsShow(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void sf() {
                    pcc pccVar2 = pcc.this;
                    pccVar2.sf(pccVar2.oo);
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void pcc() {
                    if (pcc.this.nac != 0) {
                        pcc.this.ork();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void pcc(boolean z) {
                    pcc.this.pcc(z, ofVar);
                }
            });
            pccVar = this;
        }
        Context pcc3 = com.bytedance.sdk.component.utils.sf.pcc(fumVar2);
        if (pcc3 == null) {
            pcc3 = pccVar.wh;
        }
        ork orkVar = new ork(pcc3, ofVar, pccVar.gm, 2);
        orkVar.sf(fumVar2);
        orkVar.pcc(pccVar);
        orkVar.pcc(pccVar.ork);
        orkVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.5
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                if (pcc.this.vj != null) {
                    pcc.this.vj.onAdClicked();
                }
            }
        });
        fumVar2.setClickListener(orkVar);
        com.bytedance.sdk.openadsdk.core.ork.vy vyVar = new com.bytedance.sdk.openadsdk.core.ork.vy(pccVar.wh, ofVar, pccVar.gm, 2);
        vyVar.sf(fumVar2);
        vyVar.pcc(pccVar);
        vyVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.6
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                if (pcc.this.vj != null) {
                    pcc.this.vj.onAdClicked();
                }
            }
        });
        fum fumVar3 = pccVar.vh;
        if (fumVar3 instanceof lo) {
            vyVar.pcc(((lo) fumVar3).getVideoController());
        }
        vyVar.pcc(pccVar.ork);
        fumVar2.setClickCreativeListener(vyVar);
        if (pccVar.kj) {
            return;
        }
        kjVar.setNeedCheckingShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(boolean z, of ofVar) {
        try {
            if (z) {
                this.qf = System.currentTimeMillis();
            } else {
                if (this.qf <= 0 || this.vh == null) {
                    return;
                }
                String valueOf = String.valueOf(System.currentTimeMillis() - this.qf);
                this.qf = 0L;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, ofVar, this.gm, this.vh.getAdShowTime());
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("PAGBannerAdImpl", e.getMessage());
        }
    }

    private void tmg() {
        this.oo.pcc(SystemClock.elapsedRealtime());
        this.pcc.vj();
    }

    private qf.pcc vh() {
        return new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.7
            private View pcc(boolean z) {
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(pcc.this.wh);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                gmVar.setBackgroundColor(-1);
                gmVar.setLayoutParams(layoutParams);
                View view = new View(pcc.this.wh);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                gmVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(pcc.this.wh);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                pcc pccVar = pcc.this;
                if (z) {
                    gmVar2.setBackground(tz.gm(pccVar.wh, "tt_ad_closed_background_300_250"));
                } else {
                    gmVar2.setBackground(tz.gm(pccVar.wh, "tt_ad_closed_background_320_50"));
                }
                gmVar.addView(gmVar2, layoutParams3);
                PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(pcc.this.wh, pcc.this.oo);
                createPAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                pcc pccVar2 = pcc.this;
                if (z) {
                    int sf = rj.sf(pccVar2.wh, 16.0f);
                    layoutParams4.width = rj.sf(pcc.this.wh, 77.0f);
                    layoutParams4.height = rj.sf(pcc.this.wh, 14.0f);
                    layoutParams4.leftMargin = sf;
                    layoutParams4.topMargin = sf;
                } else {
                    int sf2 = rj.sf(pccVar2.wh, 8.0f);
                    layoutParams4.width = rj.sf(pcc.this.wh, 45.0f);
                    layoutParams4.height = rj.sf(pcc.this.wh, 8.18f);
                    layoutParams4.leftMargin = sf2;
                    layoutParams4.topMargin = sf2;
                }
                gmVar2.addView(createPAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(pcc.this.wh);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                kjVar.setAlpha(0.5f);
                kjVar.setLines(1);
                kjVar.setText(tz.pcc(pcc.this.wh, "tt_ad_is_closed"));
                if (z) {
                    kjVar.setTextSize(18.0f);
                } else {
                    kjVar.setTextSize(12.0f);
                }
                gmVar2.addView(kjVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                            IABLandingPageActivity.pcc(pcc.this.wh, pcc.this.oo, pcc.this.gm);
                        } else {
                            TTWebsiteActivity.pcc(pcc.this.wh, pcc.this.oo, pcc.this.gm);
                        }
                    }
                };
                createPAGLogoViewByMaterial.setOnClickListener(onClickListener);
                kjVar.setOnClickListener(onClickListener);
                return gmVar;
            }

            @Override // com.bytedance.sdk.openadsdk.core.oo.qf.pcc
            public void pcc() {
                int width = pcc.this.vh.getWidth();
                int height = pcc.this.vh.getHeight();
                View pcc = pcc(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                pcc.this.vh.yt();
                pcc.this.vh.removeAllViews();
                pcc.this.vh.addView(pcc, new ViewGroup.LayoutParams(width, height));
                pcc.this.vh.setClickCreativeListener(null);
                pcc.this.vh.setClickListener(null);
                if (pcc.this.vj != null) {
                    pcc.this.vj.onAdDismissed();
                }
                pcc.this.vy = true;
            }
        };
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc gm() {
        oo ooVar = this.pcc;
        if (ooVar instanceof gm) {
            return ((gm) ooVar).getVideoModel();
        }
        return null;
    }

    public void kj() {
        oo ooVar = this.pcc;
        if (ooVar instanceof gm) {
            ((gm) ooVar).sf();
        }
    }

    public void oo() {
        sf(this.oo);
        this.qf = 0L;
    }

    public void qf() {
        if (this.pcc != null) {
            try {
                wh();
                this.pcc.removeOnAttachStateChangeListener(this.lu);
            } catch (Throwable unused) {
            }
        }
    }

    public void vj() {
        this.qf = System.currentTimeMillis();
    }

    public void vy() {
        oo ooVar = this.pcc;
        if (ooVar instanceof gm) {
            ((gm) ooVar).pcc();
        }
    }

    public void wh() {
        this.nac = 1;
        this.pcc.oo();
    }

    public boolean sf() {
        return this.pcc instanceof gm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(of ofVar) {
        if (this.qf <= 0 || ofVar == null) {
            return;
        }
        try {
            if (this.vh != null) {
                String valueOf = String.valueOf(System.currentTimeMillis() - this.qf);
                this.qf = 0L;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, ofVar, this.gm, this.vh.getAdShowTime());
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("PAGBannerAdImpl", e.getMessage());
        }
    }

    public void pcc(int i) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.setCurrentIndex(i);
        }
    }

    public void pcc(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        kj kjVar = new kj(pAGBannerAdInteractionCallback);
        this.vj = kjVar;
        this.pcc.setExpressInteractionListener(kjVar);
    }

    public void pcc(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        kj kjVar = new kj(pAGBannerAdInteractionListener);
        this.vj = kjVar;
        this.pcc.setExpressInteractionListener(kjVar);
    }

    public View pcc() {
        com.bytedance.sdk.openadsdk.utils.sf.pcc(this.oo);
        IPBroadcastReceiver.sf(this.wh, this.oo);
        return this.pcc;
    }

    private void pcc(Context context, of ofVar, AdSlot adSlot) {
        if (ofVar.kez() != null) {
            gm gmVar = new gm(context, ofVar, adSlot, this.gbb);
            this.pcc = gmVar;
            gmVar.addOnAttachStateChangeListener(this.lu);
        } else {
            oo ooVar = new oo(context, ofVar, adSlot, this.gbb);
            this.pcc = ooVar;
            ooVar.addOnAttachStateChangeListener(this.lu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z, of ofVar) {
        if (z && this.oo.qap() && !this.oo.tsz()) {
            this.oo.qf(true);
            of ofVar2 = this.oo;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar2, this.gm, ofVar2.uij());
        }
        rnn.sf(new C0091pcc(z, ofVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(View view, fum fumVar, of ofVar, String str, qf.pcc pccVar) {
        com.bytedance.sdk.openadsdk.core.ork.sf().pcc(str, pccVar);
        this.qf = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (fumVar != null) {
                jSONObject.put("dynamic_show_type", fumVar.getDynamicShowType());
                fumVar.pcc(jSONObject, ofVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.gm, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(ofVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.lo.gm("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.vj;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, ofVar.az());
        }
        if (ofVar.qxq()) {
            kun.pcc(ofVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm pcc(of ofVar) {
        if (ofVar.az() == 4) {
            return com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.wh, this.gm);
        }
        return null;
    }

    private com.bytedance.sdk.openadsdk.core.kj pcc(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.kj) {
                    return (com.bytedance.sdk.openadsdk.core.kj) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void pcc(final com.bytedance.sdk.openadsdk.pcc.pcc.sf sfVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.gpj > 500) {
            this.gpj = currentTimeMillis;
            oo ooVar = this.pcc;
            if (ooVar instanceof gm) {
                ooVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((gm) pcc.this.pcc).pcc(sfVar);
                    }
                }, 500L);
            }
        }
    }
}
