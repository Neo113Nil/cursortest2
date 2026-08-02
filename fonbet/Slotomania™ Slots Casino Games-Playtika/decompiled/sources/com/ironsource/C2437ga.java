package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C2437ga extends AbstractC2390e {
    private final String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = B5.R;
    private final String l = "data";

    C2437ga(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC2390e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC2390e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC2390e
    public String a(ArrayList<C2736x5> arrayList, JSONObject jSONObject) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (jSONObject == null) {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
        } else {
            this.f = jSONObject;
        }
        try {
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
            jsonObjectInit.put(B5.R, "super.dwh.mediation_events");
            jsonObjectInit.put("data", a(jSONArray));
            return jsonObjectInit.toString();
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
