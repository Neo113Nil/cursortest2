package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax implements com.bytedance.sdk.openadsdk.oem.pcc {
    private static Context gm;
    private static String oo;
    private static final dax pcc = new dax();
    private static com.bytedance.sdk.openadsdk.component.reward.gm.sf qf;
    private static com.bytedance.sdk.openadsdk.core.model.of sf;
    private static boolean vj;
    private static com.bytedance.sdk.openadsdk.core.jr.oo.sf wh;

    public static void sf() {
        vj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.pcc
    public void pcc(String str, final int i) {
        com.bytedance.sdk.openadsdk.core.model.wh xfm;
        com.bytedance.sdk.openadsdk.core.model.of ofVar = sf;
        if (ofVar == null || gm == null || (xfm = ofVar.xfm()) == null) {
            return;
        }
        String gm2 = xfm.gm();
        if (TextUtils.isEmpty(gm2) || !gm2.equals(str)) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.dax.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (dax.sf == null || dax.gm == null || (i2 = i) <= 0 || i2 > 5) {
                    return;
                }
                boolean z = true;
                boolean z2 = i2 == 1;
                if (dax.vj) {
                    if (dax.wh != null) {
                        dax.wh.qcw();
                    }
                    if (dax.qf != null) {
                        dax.qf.pcc();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.oo.gm.pcc("click", dax.sf, new tmg.pcc().pcc(), dax.oo, true, (Map<String, Object>) hashMap, 1);
                } else {
                    z = z2;
                }
                if (z) {
                    dax.pcc();
                }
            }
        });
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, Context context, String str, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar) {
        pcc(ofVar, context, str, null, sfVar);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, Context context, String str, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar2) {
        com.bytedance.sdk.openadsdk.core.model.mk gmi = ofVar.gmi();
        if (gmi != null) {
            if (gmi.qf() || gmi.kj()) {
                sf = ofVar;
                gm = context;
                oo = str;
                wh = sfVar;
                qf = sfVar2;
                IPBroadcastReceiver pcc2 = IPBroadcastReceiver.pcc(context, ofVar);
                if (pcc2 != null) {
                    pcc2.pcc(pcc);
                }
            }
        }
    }

    public static void pcc() {
        if (sf == null) {
            return;
        }
        IPBroadcastReceiver pcc2 = IPBroadcastReceiver.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), sf);
        if (pcc2 != null) {
            pcc2.pcc();
        }
        vj = false;
        sf = null;
        gm = null;
        oo = null;
        wh = null;
        qf = null;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, Context context, String str, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        pcc(ofVar, context, str, sfVar, null);
    }
}
