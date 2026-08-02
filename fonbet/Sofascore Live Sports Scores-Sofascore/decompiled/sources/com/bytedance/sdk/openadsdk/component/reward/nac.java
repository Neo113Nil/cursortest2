package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.jr.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.tz;
import com.unity3d.services.UnityAdsConstants;
import defpackage.mwm;
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
public class nac {
    private static volatile nac pcc;
    private final Context sf;
    private com.bytedance.sdk.component.kj.sf.gm vj;
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final List<sf> oo = w1l.n();
    private final jsj.pcc wh = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.6
        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (nac.this.vj == null) {
                    nac nacVar = nac.this;
                    nacVar.vj = new com.bytedance.sdk.openadsdk.component.reward.gm("net connect task", nacVar.oo);
                }
                com.bytedance.sdk.component.utils.vy.pcc().post(nac.this.vj);
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        private final PAGRewardedAdLoadListener oo;
        private final Context pcc;
        private final AdSlot sf;
        private final boolean vj;

        public pcc(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.pcc = context;
            this.sf = adSlot;
            this.gm = pccVar;
            this.oo = pAGRewardedAdLoadListener;
            this.vj = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.oo;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            nac.pcc(this.pcc).pcc(this.sf, this.gm, this.oo, pAGRewardedAd, this.vj);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf extends com.bytedance.sdk.component.kj.sf.gm {
        final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        final of pcc;
        final AdSlot sf;

        public sf(of ofVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            super("Reward Task");
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
            com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new nwm() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.sf.1
                @Override // defpackage.etm
                public void pcc(nem nemVar, int i) {
                    dax pcc2 = dax.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
                    sf sfVar = sf.this;
                    pcc2.pcc(sfVar.sf, sfVar.gm);
                }

                @Override // defpackage.etm
                public void pcc(nem nemVar, int i, String str) {
                }
            });
        }
    }

    private nac(Context context) {
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

    private void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of ofVar, lo loVar, final AdSlot adSlot, final boolean z, gm gmVar) {
        final lo loVar2;
        final gm gmVar2;
        if (z && !atb.gm(ofVar) && com.bytedance.sdk.openadsdk.core.lu.oo().tsz(adSlot.getCodeId()).oo == 1 && !com.bytedance.sdk.component.utils.lu.oo(this.sf)) {
            pcc(new sf(ofVar, adSlot, pccVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = gmVar != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 1;
        if (atb.gm(ofVar)) {
            loVar2 = loVar;
            gmVar2 = gmVar;
            if (z) {
                dax.pcc(this.sf).pcc(adSlot, pccVar);
            }
        } else {
            if (ofVar.kez() != null) {
                com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(ofVar.we())).u(), ofVar);
                pcc2.pcc("material_meta", ofVar);
                pcc2.pcc("ad_slot", adSlot);
                loVar2 = loVar;
                gmVar2 = gmVar;
                com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc2, new nwm() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.4
                    @Override // defpackage.etm
                    public void pcc(nem nemVar, int i) {
                        loVar2.sf();
                        if (z) {
                            dax.pcc(nac.this.sf).pcc(adSlot, pccVar);
                        } else {
                            if (gmVar2 == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                                return;
                            }
                            gmVar2.onAdLoaded(loVar2.pcc());
                        }
                    }

                    @Override // defpackage.etm
                    public void pcc(nem nemVar, int i, String str) {
                        if (gmVar2 == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                            return;
                        }
                        gmVar2.onError(i, str);
                    }
                });
            } else {
                loVar2 = loVar;
                gmVar2 = gmVar;
                z2 = z3;
            }
            z3 = z2;
        }
        if (z3) {
            gmVar2.onAdLoaded(loVar2.pcc());
        }
    }

    private void sf(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.jr.gm()) {
            mwm.a(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        tsz tszVar = new tsz();
        tszVar.sf = 1;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 7, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.2
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                com.bytedance.sdk.openadsdk.core.model.pcc pccVar2;
                if (pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                    if (pAGRewardedAdLoadListener2 != null) {
                        pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
                        gmVar.pcc(-3);
                        gmVar.gm(6);
                        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
                        return;
                    }
                    return;
                }
                lo loVar = new lo(nac.this.sf, pccVar, adSlot);
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(pccVar.vj().isEmpty() ? null : pccVar.vj().get(0));
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(pccVar.qf(), System.currentTimeMillis() - currentTimeMillis);
                }
                if (pAGRewardedAdLoadListener == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 0) {
                    pccVar2 = pccVar;
                } else {
                    nac.this.pcc(adSlot, pccVar, pAGRewardedAdLoadListener, loVar.pcc(), this.pcc);
                    pccVar2 = pccVar;
                }
                nac.this.pcc(pccVar2, loVar, adSlot, false, pAGRewardedAdLoadListener);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String pcc2 = dax.pcc(nac.this.sf).pcc(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(pcc2)) {
                    return null;
                }
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = dax.pcc(nac.this.sf).pcc(pccVar);
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
        dax.pcc(this.sf).pcc(adSlot.getCodeId());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm implements PAGRewardedAdLoadListener {
        private final AtomicInteger gm;
        private final com.bytedance.sdk.openadsdk.core.model.pcc oo;
        private final PAGRewardedAdLoadListener pcc;
        private final AtomicBoolean sf;

        private gm(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            this.sf = new AtomicBoolean(false);
            this.pcc = pAGRewardedAdLoadListener;
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
            if (this.gm.decrementAndGet() > 0 || this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onError(i, str);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.gm.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                @Nullable
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", gm.this.oo.gm());
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("choose_ad_load_error").sf(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.gm.decrementAndGet();
            if (this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onAdLoaded(pAGRewardedAd);
        }
    }

    private void sf(final AdSlot adSlot) {
        tsz tszVar = new tsz();
        tszVar.sf = 2;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 7, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.1
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (this.pcc || pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    return;
                }
                nac.this.pcc(pccVar, new lo(nac.this.sf, pccVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                return dax.pcc(nac.this.sf).pcc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = dax.pcc(nac.this.sf).pcc(pccVar);
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

    public static nac pcc(Context context) {
        if (pcc == null) {
            synchronized (nac.class) {
                try {
                    if (pcc == null) {
                        pcc = new nac(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public void pcc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        sf(adSlot);
    }

    public void pcc(String str, of ofVar) {
        dax.pcc(this.sf).pcc(str, ofVar);
    }

    public void pcc() {
        try {
            dax.pcc(this.sf).pcc();
        } catch (Throwable unused) {
        }
    }

    public void pcc(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        sf(adSlot, pAGRewardedAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, lo loVar, AdSlot adSlot, boolean z, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        lo loVar2;
        boolean z2;
        AdSlot adSlot2;
        nac nacVar;
        if (!z) {
            com.bytedance.sdk.openadsdk.gbb.gm.pcc().pcc(pccVar.qf());
        }
        AdSlot adSlot3 = adSlot;
        gm gmVar = new gm(new pcc(this.sf, adSlot3, pccVar, pAGRewardedAdLoadListener, false), pccVar);
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
                    loVar2 = loVar;
                    z2 = z;
                    adSlot2 = adSlot3;
                    nacVar = this;
                    if (!pccVar.vy() && bg != 43) {
                        return;
                    }
                    i++;
                    this = nacVar;
                    loVar = loVar2;
                    adSlot3 = adSlot2;
                    z = z2;
                }
            }
            loVar2 = loVar;
            z2 = z;
            adSlot2 = adSlot3;
            nacVar = this;
            nacVar.pcc(pccVar, ofVar, loVar2, adSlot2, z2, gmVar);
            if (!pccVar.vy()) {
            }
            i++;
            this = nacVar;
            loVar = loVar2;
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
        for (final int i2 = 0; i2 < pccVar.vj().size(); i2++) {
            of ofVar = pccVar.vj().get(i2);
            if (i2 >= i) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(ofVar, new pcc.InterfaceC0085pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.3
                @Override // com.bytedance.sdk.openadsdk.core.jr.gm.pcc.InterfaceC0085pcc
                public void pcc(boolean z) {
                    com.bytedance.sdk.component.utils.lo.pcc("RewardVideoLoadManager", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.5
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = z;
                nac nacVar = nac.this;
                if (z2) {
                    nacVar.gm(adSlot);
                } else {
                    dax.pcc(nacVar.sf).pcc(adSlot, pccVar);
                    nac.this.gm(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void pcc(sf sfVar) {
        if (sfVar == null) {
            return;
        }
        if (this.oo.size() > 0) {
            this.oo.remove(0);
        }
        this.oo.add(sfVar);
    }
}
