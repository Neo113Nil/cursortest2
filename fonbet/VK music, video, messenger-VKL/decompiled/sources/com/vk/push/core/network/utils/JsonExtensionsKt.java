package com.vk.push.core.network.utils;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: JsonExtensions.kt */
/* loaded from: classes5.dex */
public final class JsonExtensionsKt {
    public static final <T> List<T> map(JSONArray jSONArray, izs<? super JSONObject, ? extends T> izsVar) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(izsVar.invoke(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
