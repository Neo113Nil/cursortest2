package com.appsflyer.sdk_base.util;

import defpackage.e5h;
import defpackage.k13;
import defpackage.l6a;
import defpackage.llf;
import defpackage.lm5;
import defpackage.ml3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004\u001a\u0014\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007*\u00020\bH\u0002\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000b"}, d2 = {"toMap", "", "", "", "Lorg/json/JSONObject;", "toStringMap", "toList", "", "Lorg/json/JSONArray;", "convertJsonValue", "jsonValue", "sdk_base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonUtils {
    private static final Object convertJsonValue(Object obj) {
        if (obj instanceof JSONArray) {
            return toList((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return toMap((JSONObject) obj);
        }
        if (Intrinsics.c(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> toList(JSONArray jSONArray) {
        IntRange j = llf.j(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(k13.r(j, 10));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((l6a) it).nextInt());
            obj.getClass();
            arrayList.add(convertJsonValue(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ml3 b = e5h.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            obj.getClass();
            linkedHashMap.put(next, convertJsonValue(obj));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, String> toStringMap(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.length() == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ml3 b = e5h.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            linkedHashMap.put(next, Intrinsics.c(obj, JSONObject.NULL) ? "null" : obj.toString());
        }
        return linkedHashMap;
    }
}
