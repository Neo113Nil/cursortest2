package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.dli0;
import xsna.izs;
import xsna.jgp;
import xsna.t5j;
import xsna.uki0;
import xsna.zcl;

/* renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4216a1 {
    public static final a b = new a(null);
    public static final String c = "adUnits";
    private final JSONObject a;

    /* renamed from: com.ironsource.a1$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public C4216a1(JSONObject jSONObject) {
        this.a = jSONObject.optJSONObject(c);
    }

    public final <T> Map<String, T> a(izs<? super JSONObject, ? extends T> izsVar) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return jgp.b;
        }
        uki0 c2 = dli0.c(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = ((t5j) c2).iterator();
        while (it.hasNext()) {
            T next = it.next();
            linkedHashMap.put(next, izsVar.invoke(jSONObject.getJSONObject((String) next)));
        }
        return linkedHashMap;
    }
}
