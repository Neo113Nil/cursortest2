package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dli0;
import xsna.epx;
import xsna.j9x;
import xsna.swe0;
import xsna.t5j;

/* renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4565ta {
    private static final int a = 100;

    public static final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        return a(jSONObject, jSONObject2, 0);
    }

    public static final boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        return a(jSONArray, jSONArray2, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        Iterator it = ((t5j) dli0.c(jSONObject.keys())).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() == jSONArray2.length() && i <= 100) {
            Iterable q = swe0.q(0, jSONArray.length());
            if ((q instanceof Collection) && ((Collection) q).isEmpty()) {
                return true;
            }
            j9x it = q.iterator();
            while (it.d) {
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
        return epx.f(obj, obj2);
    }
}
