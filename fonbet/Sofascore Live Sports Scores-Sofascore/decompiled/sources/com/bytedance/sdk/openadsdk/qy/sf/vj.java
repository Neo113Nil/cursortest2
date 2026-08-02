package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static final Map<Integer, sf> pcc = new ConcurrentHashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public int pcc;
        public int sf = -1;

        public pcc(int i) {
            this.pcc = i;
        }
    }

    private static boolean gm(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        String pcc2 = kun.pcc(ofVar);
        return ((!"open_ad".equals(pcc2) && !"fullscreen_interstitial_ad".equals(pcc2) && !"rewarded_video".equals(pcc2)) || atb.sf(ofVar) || ofVar.bg() == 5 || ofVar.bg() == 33 || !of.vj(ofVar) || ofVar.kez() == null) ? false : true;
    }

    private static sf pcc(View view, of ofVar, boolean z, pcc pccVar) {
        if (view == null || ofVar == null || ofVar.esn() == null) {
            return null;
        }
        Integer sf = sf(ofVar);
        Map<Integer, sf> map = pcc;
        if (!map.containsKey(sf)) {
            sf pcc2 = sf.pcc(z, sf, view, ofVar, pccVar);
            map.put(sf, pcc2);
            return pcc2;
        }
        sf sfVar = map.get(sf);
        if (sfVar != null) {
            sfVar.pcc(view);
        }
        return sfVar;
    }

    public static Integer sf(of ofVar) {
        return Integer.valueOf((ofVar.qxv() + ofVar.esn()).hashCode());
    }

    public static void sf(Integer num) {
        pcc.remove(num);
    }

    public static void pcc(View view, of ofVar, pcc pccVar) {
        if (view == null || ofVar == null || ofVar.am()) {
            return;
        }
        boolean gm = gm(ofVar);
        if (atb.sf(ofVar) && pccVar != null) {
            pccVar.pcc = -1;
        }
        pcc(pcc(view, ofVar, gm, pccVar));
    }

    private static void pcc(sf sfVar) {
        if (sfVar == null) {
            return;
        }
        sfVar.pcc();
    }

    public static void pcc(of ofVar, int i) {
        if (ofVar == null || ofVar.esn() == null) {
            return;
        }
        pcc(pcc.get(sf(ofVar)), i);
    }

    public static void pcc(sf sfVar, int i) {
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(i);
    }

    public static void pcc(of ofVar) {
        if (ofVar == null || ofVar.esn() == null) {
            return;
        }
        Integer sf = sf(ofVar);
        Map<Integer, sf> map = pcc;
        sf sfVar = map.get(sf);
        if (sfVar != null) {
            sfVar.ork();
        }
        sf(sf);
        if (map.size() <= 0) {
            qf.pcc();
        }
    }

    public static sf pcc(Integer num) {
        return pcc.get(num);
    }
}
