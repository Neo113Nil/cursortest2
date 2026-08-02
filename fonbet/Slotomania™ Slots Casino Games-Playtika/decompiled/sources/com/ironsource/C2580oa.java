package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.oa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2580oa {
    private InterfaceC2544ma a;

    public C2580oa(InterfaceC2544ma interfaceC2544ma) {
        this.a = interfaceC2544ma;
    }

    public void a(C2562na c2562na, JSONObject jSONObject) {
        this.a.a(false, c2562na.a(), jSONObject);
    }

    public void b(C2562na c2562na, JSONObject jSONObject) {
        this.a.a(true, c2562na.d(), jSONObject);
    }
}
