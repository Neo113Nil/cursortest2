package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public int gm = 1;
    public ArrayList<Integer> oo;
    public String pcc;
    public int qf;
    public int sf;
    public AdSlot vj;
    public String wh;

    public static void pcc(gm gmVar) {
        int sf;
        if (gmVar == null || gmVar.oo() == null || (sf = gmVar.sf()) >= 0 || sf == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.oo.pcc("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.model.gm.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", gm.this.gm());
                jSONObject.put("err_code", gm.this.sf());
                jSONObject.put("err_msg", gm.this.wh);
                jSONObject.put("ext_from", gm.this.qf);
                jSONObject.put("server_res_str", gm.this.pcc());
                if (gm.this.vj() != null && gm.this.vj().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) gm.this.vj()).toString());
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("rd_client_custom_error").pcc(gm.this.oo().getDurationSlotType()).sf(jSONObject.toString());
            }
        });
    }

    public int gm() {
        return this.gm;
    }

    public AdSlot oo() {
        return this.vj;
    }

    public int sf() {
        return this.sf;
    }

    public ArrayList<Integer> vj() {
        return this.oo;
    }

    public void gm(int i) {
        this.qf = i;
    }

    public void sf(int i) {
        this.gm = i;
    }

    public void sf(String str) {
        this.wh = str;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public void pcc(AdSlot adSlot) {
        this.vj = adSlot;
    }

    public void pcc(ArrayList<Integer> arrayList) {
        this.oo = arrayList;
    }

    public String pcc() {
        return this.pcc;
    }
}
