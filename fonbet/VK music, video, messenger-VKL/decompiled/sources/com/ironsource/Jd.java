package com.ironsource;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.dli0;
import xsna.izs;
import xsna.jgp;
import xsna.pn00;
import xsna.ulp0;

/* loaded from: classes13.dex */
public final class Jd {
    private final Map<String, C4657yc> a;

    public static final class a extends Lambda implements izs<String, Pair<? extends String, ? extends C4657yc>> {
        final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C4657yc> invoke(String str) {
            return new Pair<>(str, new C4657yc(str, this.a.getJSONObject(str)));
        }
    }

    public Jd(JSONObject jSONObject) {
        Map map;
        ulp0 ulp0Var = new ulp0(dli0.c(jSONObject.keys()), new a(jSONObject));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        pn00.q(linkedHashMap, ulp0Var);
        int size = linkedHashMap.size();
        if (size != 0) {
            map = linkedHashMap;
            if (size == 1) {
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
            }
        } else {
            map = jgp.b;
        }
        this.a = map;
        for (Map.Entry entry2 : map.entrySet()) {
            C4657yc c4657yc = (C4657yc) entry2.getValue();
            if (b(c4657yc)) {
                c4657yc.b(a(c4657yc));
            }
        }
    }

    private final boolean b(C4657yc c4657yc) {
        return c4657yc.o() && c4657yc.l().length() > 0;
    }

    public final Map<String, C4657yc> a() {
        return this.a;
    }

    private final C4657yc a(C4657yc c4657yc) {
        return this.a.get(c4657yc.h());
    }
}
