package com.bytedance.adsdk.ugeno.oo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    private static Map<String, qf> pcc = new HashMap();

    public static void pcc(List<qf> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (qf qfVar : list) {
            if (qfVar != null) {
                pcc.put(qfVar.pcc(), qfVar);
            }
        }
    }

    public static qf pcc(String str) {
        return pcc.get(str);
    }
}
