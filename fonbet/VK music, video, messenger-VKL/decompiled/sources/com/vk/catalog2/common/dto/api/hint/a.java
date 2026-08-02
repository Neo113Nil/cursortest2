package com.vk.catalog2.common.dto.api.hint;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.s3q0;

/* compiled from: CatalogHintParser.kt */
/* loaded from: classes16.dex */
public final class a extends aay<CatalogHint> {
    @Override // xsna.aay
    public final CatalogHint a(JSONObject jSONObject) {
        ArrayList arrayList;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("text");
        CatalogHintType.a aVar = CatalogHintType.Companion;
        String optString4 = jSONObject.optString("type");
        aVar.getClass();
        CatalogHintType a = CatalogHintType.a.a(optString4);
        boolean optBoolean = jSONObject.optBoolean("unskipable");
        CatalogButton.b bVar = CatalogButton.b;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        Object a2 = bVar.a(optJSONObject);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new CatalogHint(optString, optString2, optString3, a, optBoolean, arrayList, jSONObject.optString("campaign_name"));
    }
}
