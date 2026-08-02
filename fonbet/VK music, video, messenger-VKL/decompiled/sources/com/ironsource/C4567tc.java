package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4567tc implements InterfaceC4517qf<JSONObject>, InterfaceC4481of<C4531rc> {
    private final Map<String, C4377j1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4294e7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC4499pf enumC4499pf) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4377j1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray a = entry.getValue().a(enumC4499pf);
            if (a.length() > 0) {
                jSONObject.put(key, a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC4481of
    public void a(C4531rc c4531rc) {
        String c = c4531rc.c();
        Map<String, C4377j1> map = this.a;
        C4377j1 c4377j1 = map.get(c);
        if (c4377j1 == null) {
            c4377j1 = new C4377j1();
            map.put(c, c4377j1);
        }
        c4377j1.a(c4531rc.a(new C4549sc()));
    }
}
