package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import xsna.c5g;
import xsna.k9x;
import xsna.swe0;
import xsna.z8x;

/* compiled from: JSONArrayExtensions.kt */
/* loaded from: classes14.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            list.add(jSONArray2.getString(1));
            linkedHashMap.put(jSONArray2.getString(0), list);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        k9x q = swe0.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(c5g.u(q, 10));
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((z8x) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
