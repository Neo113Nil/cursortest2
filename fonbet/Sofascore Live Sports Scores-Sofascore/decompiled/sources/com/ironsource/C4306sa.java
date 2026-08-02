package com.ironsource;

import defpackage.e5h;
import defpackage.llf;
import defpackage.v6a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4306sa {
    private static final int a = 100;

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        Iterator it = e5h.b(keys).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(@NotNull JSONArray jSONArray, @NotNull JSONArray jSONArray2) {
        jSONArray.getClass();
        jSONArray2.getClass();
        return a(jSONArray, jSONArray2, 0);
    }

    public static final boolean a(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        return a(jSONObject, jSONObject2, 0);
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() == jSONArray2.length() && i <= 100) {
            Iterable j = llf.j(0, jSONArray.length());
            if ((j instanceof Collection) && ((Collection) j).isEmpty()) {
                return true;
            }
            v6a it = j.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (!a(jSONArray.get(nextInt), jSONArray2.get(nextInt), i)) {
                }
            }
            return true;
        }
        return false;
    }

    private static final boolean a(Object obj, Object obj2, int i) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return Intrinsics.c(obj, obj2);
    }
}
