package com.bytedance.sdk.openadsdk.component.reward.gm;

import com.bytedance.sdk.openadsdk.core.model.jsj;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private static Integer gm;
    private static Integer oo;
    private static Boolean pcc;
    private static Integer sf;

    public static boolean gm() {
        return pcc() == 2;
    }

    public static int kj() {
        Integer num = sf;
        if (num == null) {
            int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("unify_web_close_backup_config", "interval", 10000);
            num = Integer.valueOf(pcc2 > 1000 ? pcc2 : 10000);
            sf = num;
        }
        return num.intValue();
    }

    public static int oo() {
        Integer num = gm;
        if (num == null) {
            int i = 1;
            int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("unify_web_config", "video_preload_type", 1);
            if (pcc2 >= 0 && pcc2 <= 2) {
                i = pcc2;
            }
            num = Integer.valueOf(i);
            gm = num;
        }
        return num.intValue();
    }

    public static boolean pcc(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        boolean z = ofVar.ei() == 2;
        boolean z2 = ofVar.rt() == 11;
        boolean on = ofVar.on();
        boolean uxz = ofVar.uxz();
        jsj nfv = ofVar.nfv();
        return (!z || !z2 || on || uxz || (nfv != null && (nfv.pcc() == 1 || nfv.pcc() == 2))) ? false : true;
    }

    public static boolean qf() {
        Boolean bool = pcc;
        if (bool == null) {
            bool = Boolean.valueOf(com.bytedance.sdk.openadsdk.yt.vj.pcc("unify_web_close_backup_config", a.k, 1) == 1);
            pcc = bool;
        }
        return bool.booleanValue();
    }

    public static boolean sf() {
        return pcc() == 1;
    }

    public static boolean vj() {
        return oo() == 1 || oo() == 2;
    }

    public static boolean wh() {
        return oo() == 1;
    }

    public static int pcc() {
        Integer num = oo;
        if (num == null) {
            int i = 2;
            int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("unify_web_refresh", 2);
            if (pcc2 >= 0 && pcc2 <= 2) {
                i = pcc2;
            }
            num = Integer.valueOf(i);
            oo = num;
        }
        return num.intValue();
    }

    public static void pcc(final int i, final String str, final of ofVar, final Map<String, String> map) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("unify_web_preload_video", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.kj.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", i);
                jSONObject.put("video_url", str);
                of ofVar2 = ofVar;
                if (ofVar2 != null) {
                    jSONObject.put("req_id", ofVar2.qxv());
                }
                Map map2 = map;
                if (map2 != null && !map2.isEmpty()) {
                    jSONObject.put("range", map.get(Command.HTTP_HEADER_RANGE));
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("unify_web_preload_video").sf(jSONObject.toString());
            }
        });
    }
}
