package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654zc {
    public static final A9 a(C0654zc c0654zc, J9 j92, Map map) {
        int i5;
        Object value;
        c0654zc.getClass();
        A9 a92 = new A9();
        switch (j92) {
            case UNKNOWN:
                i5 = 0;
                break;
            case APPSFLYER:
                i5 = 1;
                break;
            case ADJUST:
                i5 = 2;
                break;
            case KOCHAVA:
                i5 = 3;
                break;
            case TENJIN:
                i5 = 4;
                break;
            case AIRBRIDGE:
                i5 = 5;
                break;
            case SINGULAR:
                i5 = 6;
                break;
            default:
                throw new gf.m();
        }
        a92.f11982a = i5;
        Ac.f11990b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int a7 = kotlin.collections.m0.a(kotlin.collections.v.k(entrySet, 10));
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double doubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    value = null;
                    linkedHashMap.put(key, value);
                }
            }
            value = entry.getValue();
            linkedHashMap.put(key, value);
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            a92.f11983b = jSONObject.getBytes(Charsets.UTF_8);
        }
        return a92;
    }
}
