package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
class Uc extends AbstractC4286e {
    private final String i = C4318fd.a;

    public Uc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4286e
    public String a() {
        return C4318fd.a;
    }

    @Override // com.ironsource.AbstractC4286e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC4286e
    public String a(ArrayList<C4632x5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = new JSONObject();
        } else {
            this.f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C4632x5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject a = a(it.next());
                if (a != null) {
                    jSONArray.put(a);
                }
            }
        }
        return a(jSONArray);
    }
}
