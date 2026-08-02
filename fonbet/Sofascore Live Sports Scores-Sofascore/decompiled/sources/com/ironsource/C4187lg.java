package com.ironsource;

import android.content.Context;
import defpackage.wx4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4187lg {

    @NotNull
    private final String[] a = C4169kg.a.a();

    @NotNull
    private final N6 b = new N6();

    @NotNull
    public final JSONObject a(@NotNull Context context) {
        context.getClass();
        JSONObject a = this.b.a(context, this.a);
        a.getClass();
        return a(a);
    }

    @wx4
    @NotNull
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        a.getClass();
        return a(a);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = O6.b(jSONObject.optJSONObject(L6.u));
        if (b != null) {
            jSONObject.put(L6.u, b);
        }
        return jSONObject;
    }
}
