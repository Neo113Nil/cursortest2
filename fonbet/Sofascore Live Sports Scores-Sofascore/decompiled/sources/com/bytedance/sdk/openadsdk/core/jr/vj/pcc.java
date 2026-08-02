package com.bytedance.sdk.openadsdk.core.jr.vj;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.component.sf.pcc.qf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oo.vj.sf.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.tmg;
import com.bytedance.sdk.openadsdk.oo.vj.sf.vh;
import com.bytedance.sdk.openadsdk.oo.vj.sf.vy;
import com.bytedance.sdk.openadsdk.utils.rnn;
import defpackage.etm;
import defpackage.nem;
import defpackage.ptm;
import defpackage.v9f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static final ptm pcc = new v9f(6);

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm(nem nemVar, of ofVar, AdSlot adSlot) {
        if (pcc(nemVar)) {
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, nemVar);
            pcc2.pcc(new vy(nemVar.dax(), nemVar.wh()));
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(pcc2);
        }
    }

    public static void pcc(final nem nemVar, final etm etmVar) {
        of ofVar;
        AdSlot adSlot;
        if ((nemVar.wh() > 0 || nemVar.hc()) && nemVar.lu() != -2) {
            if (nemVar.lu() != 1) {
                nemVar.vj(6000);
                nemVar.wh(6000);
                nemVar.qf(6000);
                boolean z = nemVar.vj("material_meta") != null && (nemVar.vj("material_meta") instanceof of);
                boolean z2 = nemVar.vj("ad_slot") != null && (nemVar.vj("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    of ofVar2 = (of) nemVar.vj("material_meta");
                    AdSlot adSlot2 = (AdSlot) nemVar.vj("ad_slot");
                    sf(nemVar, ofVar2, adSlot2);
                    ofVar = ofVar2;
                    adSlot = adSlot2;
                } else {
                    ofVar = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final of ofVar3 = ofVar;
                final etm etmVar2 = new etm() { // from class: com.bytedance.sdk.openadsdk.core.jr.vj.pcc.1
                    @Override // defpackage.etm
                    public void pcc(nem nemVar2, int i, String str) {
                        etm etmVar3 = etm.this;
                        if (etmVar3 != null) {
                            etmVar3.pcc(nemVar2, i, str);
                        }
                        if (ofVar3 == null || adSlot3 == null) {
                            return;
                        }
                        pcc.sf(nemVar, ofVar3, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i, str);
                    }

                    @Override // defpackage.etm
                    public void sf(nem nemVar2, int i) {
                        AdSlot adSlot4;
                        etm etmVar3 = etm.this;
                        if (etmVar3 != null) {
                            etmVar3.pcc(nemVar2, i);
                        }
                        of ofVar4 = ofVar3;
                        if (ofVar4 != null && (adSlot4 = adSlot3) != null) {
                            pcc.gm(nemVar, ofVar4, adSlot4);
                        }
                        nemVar.nac();
                    }

                    @Override // defpackage.etm
                    public void pcc(nem nemVar2, int i) {
                        etm etmVar3 = etm.this;
                        if (etmVar3 != null) {
                            etmVar3.pcc(nemVar2, i);
                        }
                        if (ofVar3 == null || adSlot3 == null) {
                            return;
                        }
                        pcc.sf(nemVar, ofVar3, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }
                };
                if (pcc(nemVar.dax())) {
                    gm gmVar = new gm("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.jr.vj.pcc.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ((v9f) pcc.pcc).q(lu.pcc(), nemVar, etmVar2);
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                    };
                    if (rnn.wh()) {
                        rnn.gm((Runnable) gmVar);
                        return;
                    } else {
                        gmVar.run();
                        return;
                    }
                }
                if (etmVar != null) {
                    etmVar.pcc(nemVar, 404, "unexpected url: " + nemVar.dax());
                }
                sf(nemVar, ofVar3, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                return;
            }
        }
        if (etmVar != null) {
            etmVar.pcc(nemVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(nem nemVar, of ofVar, AdSlot adSlot, long j) {
        if (pcc(nemVar)) {
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, nemVar);
            tmg tmgVar = new tmg();
            tmgVar.pcc(nemVar.dax());
            tmgVar.pcc(nemVar.wh());
            tmgVar.sf(j);
            if (nemVar.tz() == 1) {
                tmgVar.gm(1L);
            } else {
                tmgVar.gm(0L);
            }
            pcc2.pcc(tmgVar);
            oo.pcc("load_video_success", pcc2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(nem nemVar, of ofVar, AdSlot adSlot, long j, int i, String str) {
        if (pcc(nemVar)) {
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, nemVar);
            ork orkVar = new ork();
            orkVar.pcc(nemVar.dax());
            orkVar.pcc(nemVar.wh());
            orkVar.sf(j);
            orkVar.pcc(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            orkVar.sf(str);
            orkVar.gm("");
            pcc2.pcc(orkVar);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(pcc2);
        }
    }

    private static void sf(nem nemVar, of ofVar, AdSlot adSlot) {
        if (pcc(nemVar)) {
            long tmg = nemVar.hc() ? nemVar.tmg() : nemVar.wh();
            com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar, (String) null, -1, nemVar);
            pcc2.pcc(new vh(nemVar.dax(), tmg));
            oo.pcc("load_video_start", pcc2);
        }
    }

    private static boolean pcc(nem nemVar) {
        return true;
    }

    public static boolean pcc(String str) {
        String concat;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            concat = "http:".concat(str.substring(3));
        } else {
            concat = str.regionMatches(true, 0, "wss:", 0, 4) ? "https:".concat(str.substring(4)) : str;
        }
        return qf.gm(concat) != null;
    }
}
