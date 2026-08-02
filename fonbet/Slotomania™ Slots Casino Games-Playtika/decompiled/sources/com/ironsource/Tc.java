package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class Tc extends AbstractC2390e {
    private final String i = C2422fd.a;

    Tc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC2390e
    public String a() {
        return C2422fd.a;
    }

    @Override // com.ironsource.AbstractC2390e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC2390e
    public String a(ArrayList<C2736x5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
        } else {
            this.f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C2736x5> it = arrayList.iterator();
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
