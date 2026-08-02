package com.unity3d.ads.core.extensions;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.dli0;
import xsna.t5j;
import xsna.uki0;

/* compiled from: JSONObjectExtensions.kt */
/* loaded from: classes14.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        uki0 c = dli0.c(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((t5j) c).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object opt = jSONObject.opt((String) next);
            if (opt == null || String.valueOf(opt).equals(StringUtils.UNDEFINED) || String.valueOf(opt).equals("null")) {
                opt = null;
            }
            linkedHashMap.put(next, opt);
        }
        return linkedHashMap;
    }
}
