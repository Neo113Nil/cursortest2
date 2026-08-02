package com.bytedance.sdk.component.adexpress.pcc.gm;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.U3;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private String gm;
    private List<C0043pcc> oo;
    private String pcc;
    private Map<String, pcc> qf = new ConcurrentHashMap();
    private String sf;
    private sf vj;
    private String wh;

    public static pcc pcc(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        pcc pccVar = new pcc();
        pccVar.pcc(jSONObject.optString("name"));
        pccVar.sf(jSONObject.optString("version"));
        pccVar.gm(jSONObject.optString(U3.i.Z));
        pccVar.oo(jSONObject.optString("template_fetch_url", ""));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                C0043pcc c0043pcc = new C0043pcc();
                c0043pcc.pcc(optJSONObject2.optString("url"));
                c0043pcc.sf(optJSONObject2.optString("md5"));
                c0043pcc.pcc(optJSONObject2.optInt("level"));
                arrayList.add(c0043pcc);
            }
        }
        pccVar.pcc(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    pcc pcc = pcc(optJSONObject3.optJSONObject(next));
                    if (pcc != null) {
                        pccVar.pcc().put(next, pcc);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            sf sfVar = new sf();
            sfVar.pcc(optJSONObject.optString("url"));
            sfVar.sf(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    dmi.x(arrayList2, next2, optJSONObject4.optString(next2));
                }
                sfVar.pcc(arrayList2);
            }
            pccVar.pcc(sfVar);
        }
        if (pccVar.kj()) {
            return pccVar;
        }
        return null;
    }

    public static pcc vj(String str) {
        if (str == null) {
            return null;
        }
        try {
            return pcc(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public String gm() {
        return this.sf;
    }

    public boolean kj() {
        return (TextUtils.isEmpty(oo()) || TextUtils.isEmpty(gm()) || TextUtils.isEmpty(sf())) ? false : true;
    }

    public String oo() {
        return this.gm;
    }

    public String ork() {
        JSONObject vy;
        if (!kj() || (vy = vy()) == null) {
            return null;
        }
        return vy.toString();
    }

    public String qf() {
        return this.wh;
    }

    public String sf() {
        return this.pcc;
    }

    public JSONObject vy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", sf());
            jSONObject.putOpt("version", gm());
            jSONObject.putOpt(U3.i.Z, oo());
            if (!TextUtils.isEmpty(this.wh)) {
                jSONObject.put("template_fetch_url", this.wh);
            }
            JSONArray jSONArray = new JSONArray();
            if (wh() != null) {
                for (C0043pcc c0043pcc : wh()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0043pcc.pcc());
                    jSONObject2.putOpt("md5", c0043pcc.sf());
                    jSONObject2.putOpt("level", Integer.valueOf(c0043pcc.gm()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.qf.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.qf.keySet()) {
                    pcc pccVar = this.qf.get(str);
                    if (pccVar != null) {
                        jSONObject3.put(str, pccVar.vy());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            sf vj = vj();
            if (vj != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", vj.pcc);
                jSONObject4.put("md5", vj.sf);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> sf2 = vj.sf();
                if (sf2 != null) {
                    for (Pair<String, String> pair : sf2) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<C0043pcc> wh() {
        List<C0043pcc> list = this.oo;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.oo = arrayList;
        return arrayList;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.adexpress.pcc.gm.pcc$pcc, reason: collision with other inner class name */
    public static class C0043pcc {
        private int gm;
        private String pcc;
        private String sf;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0043pcc)) {
                return this == obj;
            }
            String str2 = this.pcc;
            if (str2 != null) {
                C0043pcc c0043pcc = (C0043pcc) obj;
                if (str2.equals(c0043pcc.pcc()) && (str = this.sf) != null && str.equals(c0043pcc.sf())) {
                    return true;
                }
            }
            return false;
        }

        public int gm() {
            return this.gm;
        }

        public String pcc() {
            return this.pcc;
        }

        public String sf() {
            return this.sf;
        }

        public void pcc(String str) {
            this.pcc = str;
        }

        public void sf(String str) {
            this.sf = str;
        }

        public void pcc(int i) {
            this.gm = i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        private List<Pair<String, String>> gm;
        private String pcc;
        private String sf;

        public String pcc() {
            return this.pcc;
        }

        public void sf(String str) {
            this.sf = str;
        }

        public void pcc(String str) {
            this.pcc = str;
        }

        public List<Pair<String, String>> sf() {
            return this.gm;
        }

        public void pcc(List<Pair<String, String>> list) {
            this.gm = list;
        }
    }

    public void gm(String str) {
        this.gm = str;
    }

    public void oo(String str) {
        this.wh = str;
    }

    public void sf(String str) {
        this.sf = str;
    }

    public sf vj() {
        return this.vj;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(sf sfVar) {
        this.vj = sfVar;
    }

    public void pcc(List<C0043pcc> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.oo = list;
    }

    public Map<String, pcc> pcc() {
        return this.qf;
    }
}
