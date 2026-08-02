package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.jr.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.tz;
import com.unity3d.services.UnityAdsConstants;
import defpackage.nem;
import defpackage.nwm;
import defpackage.p03;
import defpackage.w1l;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private static volatile wh pcc;
    private final Context sf;
    private com.bytedance.sdk.component.kj.sf.gm vj;
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final List<gm> oo = w1l.n();
    private final jsj.pcc wh = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.6
        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (wh.this.vj == null) {
                    wh whVar = wh.this;
                    whVar.vj = new com.bytedance.sdk.openadsdk.component.reward.gm("fsv net connect task", whVar.oo);
                }
                com.bytedance.sdk.component.utils.vy.pcc().post(wh.this.vj);
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm extends com.bytedance.sdk.component.kj.sf.gm {
        final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        final of pcc;
        final AdSlot sf;

        public gm(of ofVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            super("Fullscreen Task");
            this.pcc = ofVar;
            this.sf = adSlot;
            this.gm = pccVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            of ofVar = this.pcc;
            if (ofVar == null || ofVar.kez() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).u(), this.pcc);
            pcc.pcc("material_meta", this.pcc);
            pcc.pcc("ad_slot", this.sf);
            com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new nwm() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.gm.1
                @Override // defpackage.etm
                public void pcc(nem nemVar, int i) {
                    vj pcc2 = vj.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
                    gm gmVar = gm.this;
                    pcc2.pcc(gmVar.sf, gmVar.gm);
                }

                @Override // defpackage.etm
                public void pcc(nem nemVar, int i, String str) {
                }
            });
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        private final PAGInterstitialAdLoadListener oo;
        private final Context pcc;
        private final AdSlot sf;
        private final boolean vj;

        public pcc(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.pcc = context;
            this.sf = adSlot;
            this.gm = pccVar;
            this.oo = pAGInterstitialAdLoadListener;
            this.vj = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
        public void onError(int i, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.oo;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            wh.pcc(this.pcc).pcc(this.sf, this.gm, this.oo, pAGInterstitialAd, this.vj);
        }
    }

    private wh(Context context) {
        this.sf = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
        sf();
    }

    private void gm() {
        if (this.gm.get()) {
            this.gm.set(false);
            try {
                jsj.pcc(this.wh);
            } catch (Exception unused) {
            }
        }
    }

    private void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of ofVar, gpj gpjVar, final AdSlot adSlot, final boolean z, sf sfVar) {
        final gpj gpjVar2;
        final sf sfVar2;
        if (z && !atb.gm(ofVar) && of.vj(ofVar) && com.bytedance.sdk.openadsdk.core.lu.oo().tsz(adSlot.getCodeId()).oo == 1 && !com.bytedance.sdk.component.utils.lu.oo(this.sf)) {
            pcc(new gm(ofVar, adSlot, pccVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = sfVar != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 1;
        if (atb.gm(ofVar)) {
            gpjVar2 = gpjVar;
            sfVar2 = sfVar;
            if (z) {
                vj.pcc(this.sf).pcc(adSlot, pccVar);
            }
        } else if (of.vj(ofVar)) {
            if (ofVar.kez() != null) {
                com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(ofVar.we())).u(), ofVar);
                pcc2.pcc("material_meta", ofVar);
                pcc2.pcc("ad_slot", adSlot);
                gpjVar2 = gpjVar;
                sfVar2 = sfVar;
                com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc2, new nwm() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.5
                    @Override // defpackage.etm
                    public void pcc(nem nemVar, int i) {
                        gpjVar2.sf();
                        if (z) {
                            vj.pcc(wh.this.sf).pcc(adSlot, pccVar);
                        } else {
                            if (sfVar2 == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                                return;
                            }
                            sfVar2.onAdLoaded(gpjVar2.pcc());
                        }
                    }

                    @Override // defpackage.etm
                    public void pcc(nem nemVar, int i, String str) {
                        if (sfVar2 == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                            return;
                        }
                        sfVar2.onError(i, str);
                    }
                });
            } else {
                gpjVar2 = gpjVar;
                sfVar2 = sfVar;
                z2 = z3;
            }
            z3 = z2;
        } else {
            gpjVar2 = gpjVar;
            sfVar2 = sfVar;
            if (z) {
                vj.pcc(this.sf).pcc(adSlot, pccVar);
            }
        }
        if (z3) {
            sfVar2.onAdLoaded(gpjVar2.pcc());
        }
    }

    private void sf(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        tsz tszVar = new tsz();
        tszVar.gm = 1;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 8, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.2
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                com.bytedance.sdk.openadsdk.core.model.pcc pccVar2;
                if (pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                    if (pAGInterstitialAdLoadListener2 != null) {
                        pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
                        gmVar.pcc(-3);
                        gmVar.gm(5);
                        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
                        return;
                    }
                    return;
                }
                gpj gpjVar = new gpj(wh.this.sf, pccVar);
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(pccVar.vj().isEmpty() ? null : pccVar.vj().get(0));
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(pccVar.qf(), System.currentTimeMillis() - currentTimeMillis);
                }
                if (pAGInterstitialAdLoadListener == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 0) {
                    pccVar2 = pccVar;
                } else {
                    wh.this.pcc(adSlot, pccVar, pAGInterstitialAdLoadListener, gpjVar.pcc(), this.pcc);
                    pccVar2 = pccVar;
                }
                wh.this.pcc(pccVar2, gpjVar, adSlot, false, pAGInterstitialAdLoadListener);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String pcc2 = vj.pcc(wh.this.sf).pcc(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(pcc2)) {
                    return null;
                }
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = vj.pcc(wh.this.sf).pcc(pccVar);
                this.pcc = pcc2;
                return pcc2;
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.vj != null) {
            try {
                com.bytedance.sdk.component.utils.vy.pcc().removeCallbacks(this.vj);
            } catch (Exception unused) {
            }
            this.vj = null;
        }
        gm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(AdSlot adSlot) {
        vj.pcc(this.sf).pcc(adSlot.getCodeId());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements PAGInterstitialAdLoadListener {
        private final AtomicInteger gm;
        private final com.bytedance.sdk.openadsdk.core.model.pcc oo;
        private final PAGInterstitialAdLoadListener pcc;
        private final AtomicBoolean sf;

        private sf(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            this.sf = new AtomicBoolean(false);
            this.pcc = pAGInterstitialAdLoadListener;
            this.oo = pccVar;
            this.gm = new AtomicInteger(pcc());
        }

        private int pcc() {
            if (!this.oo.wh()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.oo.vj().size(); i2++) {
                of ofVar = this.oo.vj().get(i2);
                if (ofVar != null && !atb.gm(ofVar) && ofVar.kez() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
        public void onError(int i, String str) {
            if (this.gm.decrementAndGet() > 0 || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onError(i, str);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.sf.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                @Nullable
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", sf.this.oo.gm());
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("choose_ad_load_error").sf(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.gm.decrementAndGet();
            if (this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onAdLoaded(pAGInterstitialAd);
        }
    }

    private void sf(final AdSlot adSlot) {
        tsz tszVar = new tsz();
        tszVar.gm = 2;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 8, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.1
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (this.pcc || pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    return;
                }
                wh.this.pcc(pccVar, new gpj(wh.this.sf, pccVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                return vj.pcc(wh.this.sf).pcc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = vj.pcc(wh.this.sf).pcc(pccVar);
                this.pcc = pcc2;
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
            }
        });
    }

    private void sf() {
        if (this.gm.get()) {
            return;
        }
        this.gm.set(true);
        jsj.pcc(this.wh, this.sf);
    }

    public static wh pcc(Context context) {
        if (pcc == null) {
            synchronized (wh.class) {
                try {
                    if (pcc == null) {
                        pcc = new wh(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public void pcc() {
        try {
            vj.pcc(this.sf).pcc();
        } catch (Throwable unused) {
        }
    }

    public void pcc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        sf(adSlot);
    }

    public void pcc(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        sf(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.3
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = z;
                wh whVar = wh.this;
                if (z2) {
                    whVar.gm(adSlot);
                } else {
                    vj.pcc(whVar.sf).pcc(adSlot, pccVar);
                    wh.this.gm(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, gpj gpjVar, AdSlot adSlot, boolean z, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        gpj gpjVar2;
        boolean z2;
        AdSlot adSlot2;
        wh whVar;
        if (!z) {
            com.bytedance.sdk.openadsdk.gbb.gm.pcc().pcc(pccVar.qf());
        }
        AdSlot adSlot3 = adSlot;
        sf sfVar = new sf(new pcc(this.sf, adSlot3, pccVar, pAGInterstitialAdLoadListener, false), pccVar);
        pcc(pccVar);
        int i = 0;
        while (i < pccVar.vj().size()) {
            of ofVar = pccVar.vj().get(i);
            int bg = ofVar.bg();
            if (i == 0 && bg == 43) {
                ofVar.kez().o = 0;
            }
            if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.vj()) {
                    ofVar.kez().o = 0;
                } else {
                    gpjVar2 = gpjVar;
                    z2 = z;
                    adSlot2 = adSlot3;
                    whVar = this;
                    if (!pccVar.vy() && ofVar.bg() != 43) {
                        return;
                    }
                    i++;
                    this = whVar;
                    gpjVar = gpjVar2;
                    adSlot3 = adSlot2;
                    z = z2;
                }
            }
            gpjVar2 = gpjVar;
            z2 = z;
            adSlot2 = adSlot3;
            whVar = this;
            whVar.pcc(pccVar, ofVar, gpjVar2, adSlot2, z2, sfVar);
            if (!pccVar.vy()) {
            }
            i++;
            this = whVar;
            gpjVar = gpjVar2;
            adSlot3 = adSlot2;
            z = z2;
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        qy vh = pccVar.vh();
        int i = pccVar.vy() ? 10 : 1;
        if (vh != null) {
            i = vh.dax();
        }
        for (final int i2 = 0; i2 < pccVar.vj().size() && i2 < i; i2++) {
            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pccVar.vj().get(i2), new pcc.InterfaceC0085pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.4
                @Override // com.bytedance.sdk.openadsdk.core.jr.gm.pcc.InterfaceC0085pcc
                public void pcc(boolean z) {
                    com.bytedance.sdk.component.utils.lo.pcc("ScreenVideoLoadM", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private void pcc(gm gmVar) {
        if (gmVar == null) {
            return;
        }
        if (this.oo.size() > 0) {
            this.oo.remove(0);
        }
        this.oo.add(gmVar);
    }

    public void pcc(String str, of ofVar) {
        vj.pcc(this.sf).pcc(str, ofVar);
    }
}
