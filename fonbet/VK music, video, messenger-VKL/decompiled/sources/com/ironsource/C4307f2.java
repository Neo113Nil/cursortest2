package com.ironsource;

import com.ironsource.O6;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4307f2 {
    private final O6.a a;
    private final ArrayList<String> b = new ArrayList<>(new C4271d2().a());
    private final Q6 c = new Q6();

    public C4307f2(O6.a aVar) {
        this.a = aVar;
    }

    public final JSONObject a() {
        O6.a aVar = this.a;
        JSONObject a = aVar != null ? this.c.a(this.b, aVar) : null;
        if (a == null) {
            a = this.c.a(this.b);
        }
        return a(a);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = R6.b(jSONObject.optJSONObject(O6.u));
        if (b != null) {
            jSONObject.put(O6.u, b);
        }
        return jSONObject;
    }
}
