package com.ironsource;

import com.ironsource.L6;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4030d2 {

    @Nullable
    private final L6.a a;

    @NotNull
    private final ArrayList<String> b = new ArrayList<>(new C3994b2().a());

    @NotNull
    private final N6 c = new N6();

    public C4030d2(@Nullable L6.a aVar) {
        this.a = aVar;
    }

    @NotNull
    public final JSONObject a() {
        L6.a aVar = this.a;
        JSONObject a = aVar != null ? this.c.a(this.b, aVar) : null;
        if (a == null) {
            a = this.c.a(this.b);
            a.getClass();
        }
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
