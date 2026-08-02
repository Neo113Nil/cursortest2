package com.bytedance.sdk.component.adexpress.dynamic.oo;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public String gm;
    public String oo;
    public List<pcc> pcc;
    public String sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public int pcc;
        public JSONObject sf;
    }

    public static oo pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        oo ooVar = new oo();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    pcc pccVar = new pcc();
                    pccVar.pcc = optJSONObject.optInt("id");
                    pccVar.sf = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(pccVar);
                }
            }
        } catch (JSONException unused) {
        }
        ooVar.pcc = arrayList;
        ooVar.sf = jSONObject.optString("diff_data");
        ooVar.gm = jSONObject.optString("style_diff");
        ooVar.oo = jSONObject.optString("tag_diff");
        return ooVar;
    }
}
