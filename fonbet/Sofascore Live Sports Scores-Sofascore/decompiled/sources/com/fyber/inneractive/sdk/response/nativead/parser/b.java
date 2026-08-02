package com.fyber.inneractive.sdk.response.nativead.parser;

import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b {
    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (optString != null && !optString.isEmpty() && !optString.equals("null")) {
                    arrayList.add(optString);
                }
            }
        }
        return arrayList;
    }
}
