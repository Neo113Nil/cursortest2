package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private ArrayList<pcc> pcc;
    private oo sf;

    public vj(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            pcc pccVar = new pcc(jSONArray.optJSONObject(i));
            ArrayList<pcc> arrayList = this.pcc;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.pcc = arrayList;
            }
            arrayList.add(pccVar);
        }
    }

    public static boolean pcc(of ofVar) {
        if (ofVar == null || ofVar.ye()) {
            return false;
        }
        int hh = ofVar.hh();
        int ct = ofVar.ct();
        return (hh == 3 || hh == 7 || hh == 8) && (ct == 5 || ct == 15 || ct == 50);
    }

    public boolean gm() {
        ArrayList<pcc> arrayList = this.pcc;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Nullable
    public oo sf() {
        if (this.sf == null) {
            this.sf = new oo();
            ArrayList<pcc> arrayList = this.pcc;
            if (arrayList != null) {
                Iterator<pcc> it = arrayList.iterator();
                while (it.hasNext()) {
                    pcc next = it.next();
                    com.bytedance.sdk.openadsdk.core.gbb.oo pcc2 = next.pcc();
                    Set<com.bytedance.sdk.openadsdk.core.gbb.ork> sf = next.sf();
                    if (pcc2 != null) {
                        this.sf.pcc().pcc(pcc2);
                    }
                    if (sf != null) {
                        this.sf.sf().addAll(sf);
                    }
                }
            }
        }
        return this.sf;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private com.bytedance.sdk.openadsdk.core.gbb.oo gm;
        private Set<com.bytedance.sdk.openadsdk.core.gbb.ork> oo;
        private final String pcc;
        private final String sf;

        public pcc(JSONObject jSONObject) {
            this.pcc = jSONObject.optString("vast_url");
            this.sf = jSONObject.optString("vast_content");
            JSONObject optJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (optJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.gbb.oo ooVar = new com.bytedance.sdk.openadsdk.core.gbb.oo();
                this.gm = ooVar;
                ooVar.pcc(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (optJSONArray != null) {
                this.oo = com.bytedance.sdk.openadsdk.core.gbb.ork.pcc(optJSONArray);
            }
        }

        public String gm() {
            return this.pcc;
        }

        public String oo() {
            return this.sf;
        }

        public com.bytedance.sdk.openadsdk.core.gbb.oo pcc() {
            return this.gm;
        }

        public Set<com.bytedance.sdk.openadsdk.core.gbb.ork> sf() {
            return this.oo;
        }

        public void pcc(com.bytedance.sdk.openadsdk.core.gbb.oo ooVar) {
            this.gm = ooVar;
        }

        public void pcc(Set<com.bytedance.sdk.openadsdk.core.gbb.ork> set) {
            this.oo = set;
        }
    }

    public ArrayList<pcc> pcc() {
        return this.pcc;
    }
}
