package com.bytedance.sdk.openadsdk.component.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.qf;
import com.bytedance.sdk.openadsdk.core.jr.pcc.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.tz;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.tsx;
import defpackage.p03;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile pcc pcc;
    private final of sf = lu.gm();

    private pcc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, gm gmVar, Context context, AdSlot adSlot, qf qfVar, tsx tsxVar) {
        if (pccVar.vj() == null || pccVar.vj().isEmpty()) {
            qfVar.onError(-3, vy.pcc(-3));
            gmVar.pcc(-3);
            gmVar.gm(4);
            gm.pcc(gmVar);
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.of> vj = pccVar.vj();
        ArrayList arrayList = new ArrayList(vj.size());
        for (com.bytedance.sdk.openadsdk.core.model.of ofVar : vj) {
            if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar) || (ofVar != null && ofVar.fi())) {
                PAGNativeAd pcc2 = pcc(context, ofVar, adSlot);
                if (qfVar instanceof PAGNativeAdLoadListener) {
                    arrayList.add(pcc2);
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar) && ofVar.kez() != null && ofVar.kez().g != null) {
                if (lu.oo().vj(String.valueOf(ofVar.kot())) && lu.oo().bg()) {
                    if (ofVar.kez() != null) {
                        ofVar.kez().o = 1;
                    }
                    if (ofVar.vck() != null) {
                        ofVar.vck().o = 1;
                    }
                    sf pcc3 = com.bytedance.sdk.openadsdk.core.model.of.pcc(((p03) CacheDirFactory.getICacheDir(ofVar.we())).m(), ofVar);
                    pcc3.pcc("material_meta", ofVar);
                    pcc3.pcc("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc3, null);
                }
                IPBroadcastReceiver.sf(context, ofVar);
            }
        }
        boolean z = qfVar instanceof PAGNativeAdLoadListener;
        if (!z || arrayList.isEmpty()) {
            qfVar.onError(-4, vy.pcc(-4));
            gmVar.pcc(-4);
            gmVar.gm(4);
            gm.pcc(gmVar);
            return;
        }
        if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
            oo.pcc(vj.get(0), tsxVar.oo());
        }
        if (z) {
            ((PAGNativeAdLoadListener) qfVar).onAdLoaded(arrayList.get(0));
        }
        if (gmVar.vj() == null || gmVar.vj().isEmpty()) {
            return;
        }
        gmVar.gm(4);
        gm.pcc(gmVar);
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public void pcc(final Context context, final AdSlot adSlot, final qf qfVar) {
        final tsx sf = tsx.sf();
        this.sf.pcc(adSlot, new tsz(), 5, new tz() { // from class: com.bytedance.sdk.openadsdk.component.sf.pcc.1
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, gm gmVar) {
                pcc.this.pcc(pccVar, gmVar, context, adSlot, qfVar, sf);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                qfVar.onError(i, str);
            }
        });
    }

    private PAGNativeAd pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot) {
        if (ofVar.ei() != 2) {
            return new com.bytedance.sdk.openadsdk.pcc.sf.sf(context, ofVar, 5, adSlot);
        }
        if (ofVar.kez() != null) {
            return new com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf(context, ofVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm(context, ofVar, adSlot);
    }
}
