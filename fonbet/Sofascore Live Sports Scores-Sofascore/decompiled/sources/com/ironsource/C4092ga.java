package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4092ga extends AbstractC4045e {
    private final String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = C4427z5.R;
    private final String l = "data";

    public C4092ga(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4045e
    public String a(ArrayList<C4355v5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f = new JSONObject();
        } else {
            this.f = jSONObject;
        }
        try {
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
            jSONObject2.put(C4427z5.R, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    @Override // com.ironsource.AbstractC4045e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC4045e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }
}
