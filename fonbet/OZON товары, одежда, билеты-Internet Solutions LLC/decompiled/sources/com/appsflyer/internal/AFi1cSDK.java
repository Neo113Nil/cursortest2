package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.C7741a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AFi1cSDK {
    @NotNull
    public static final Map<String, Object> AFInAppEventType(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        C7741a b11 = kotlin.sequences.l.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            linkedHashMap.put(next, AFKeystoreWrapper(obj));
        }
        return linkedHashMap;
    }

    private static final Object AFKeystoreWrapper(Object obj) {
        if (obj instanceof JSONArray) {
            return valueOf((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return AFInAppEventType((JSONObject) obj);
        }
        if (Intrinsics.d(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> valueOf(JSONArray jSONArray) {
        IntRange o11 = kotlin.ranges.h.o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
        Iterator<Integer> it = o11.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((Q) it).b());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(AFKeystoreWrapper(obj));
        }
        return arrayList;
    }
}
