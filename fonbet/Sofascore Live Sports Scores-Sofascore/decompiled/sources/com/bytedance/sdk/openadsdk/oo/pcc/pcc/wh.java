package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.sdk.openadsdk.yt.sf;
import com.ironsource.U3;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private static int pcc = -1;

    public static boolean pcc(String str) {
        pcc pccVar;
        if (str == null || (pccVar = (pcc) com.bytedance.sdk.openadsdk.yt.vj.pcc("stats_new_log", pcc.pcc, new sf.pcc<pcc>() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.1
            @Override // com.bytedance.sdk.openadsdk.yt.sf.pcc
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public pcc sf(String str2) {
                return new pcc(str2);
            }
        })) == null) {
            return false;
        }
        return pccVar.pcc(str);
    }

    public static boolean sf() {
        return pcc() == 3;
    }

    public static int pcc() {
        int i = pcc;
        if (i != -1) {
            return i;
        }
        int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("send_log_type", 1);
        pcc = pcc2;
        return pcc2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static pcc pcc = new pcc();
        private int gm;
        private final HashSet<String> sf;

        public pcc(String str) {
            this.sf = new HashSet<>();
            this.gm = 0;
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.gm = jSONObject.optInt(U3.a.t, this.gm);
                JSONArray optJSONArray = jSONObject.optJSONArray("types");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.sf.add(optJSONArray.optString(i));
                    }
                }
            } catch (Exception unused) {
            }
        }

        public boolean pcc(String str) {
            boolean contains = this.sf.contains(str);
            int i = this.gm;
            if (i == 0 && contains) {
                return true;
            }
            return 1 == i && !contains;
        }

        public pcc() {
            this.sf = new HashSet<>();
            this.gm = 0;
        }
    }
}
