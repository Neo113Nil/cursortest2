package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class Tc extends AbstractC4045e {
    private final String i = C4059ed.a;

    public Tc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4045e
    public String a(ArrayList<C4355v5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = new JSONObject();
        } else {
            this.f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C4355v5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject a = a(it.next());
                if (a != null) {
                    jSONArray.put(a);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.ironsource.AbstractC4045e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC4045e
    public String a() {
        return C4059ed.a;
    }
}
