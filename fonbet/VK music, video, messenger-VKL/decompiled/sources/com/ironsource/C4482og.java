package com.ironsource;

import android.content.Context;
import org.json.JSONObject;
import xsna.ozl;

/* renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4482og {
    private final String[] a = C4464ng.a.a();
    private final Q6 b = new Q6();

    @ozl
    public final JSONObject a() {
        return a(this.b.a(this.a));
    }

    public final JSONObject a(Context context) {
        return a(this.b.a(context, this.a));
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = R6.b(jSONObject.optJSONObject(O6.u));
        if (b != null) {
            jSONObject.put(O6.u, b);
        }
        return jSONObject;
    }
}
