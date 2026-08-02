package com.bytedance.sdk.openadsdk.tz.sf;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private List<C0130pcc> gm;
    private String pcc;
    private List<C0130pcc> sf;

    public static pcc sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            pcc pccVar = new pcc();
            pccVar.pcc(jSONObject.optString("version"));
            JSONArray optJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0130pcc pcc = C0130pcc.pcc(optJSONArray.optJSONObject(i));
                    if (pcc != null) {
                        if (pcc.gm == 1) {
                            arrayList.add(pcc);
                        } else if (pcc.gm == 2 && arrayList2.size() < 10) {
                            arrayList2.add(pcc);
                        }
                    }
                }
            }
            pccVar.pcc(arrayList);
            pccVar.sf(arrayList2);
            return pccVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public List<C0130pcc> gm() {
        return this.gm;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(List<C0130pcc> list) {
        this.sf = list;
    }

    public String pcc() {
        return this.pcc;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.tz.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0130pcc {
        private int gm;
        private String pcc;
        private String sf;

        public static C0130pcc pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0130pcc c0130pcc = new C0130pcc();
            c0130pcc.pcc = jSONObject.optString("url");
            c0130pcc.sf = jSONObject.optString("md5");
            c0130pcc.gm = jSONObject.optInt("type");
            return c0130pcc;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0130pcc)) {
                return this == obj;
            }
            String str2 = this.pcc;
            if (str2 != null) {
                C0130pcc c0130pcc = (C0130pcc) obj;
                if (str2.equals(c0130pcc.pcc) && (str = this.sf) != null && str.equals(c0130pcc.sf)) {
                    return true;
                }
            }
            return false;
        }

        public String pcc() {
            return this.pcc;
        }
    }

    public List<C0130pcc> sf() {
        return this.sf;
    }

    public void sf(List<C0130pcc> list) {
        this.gm = list;
    }
}
