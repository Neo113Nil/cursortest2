package com.ironsource;

import com.ironsource.U3;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4437zf {
    private final JSONObject a;

    public C4437zf(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.a.optBoolean(U3.a.o, false);
    }

    public boolean c() {
        return this.a.optBoolean(U3.a.p, false);
    }

    public boolean d() {
        return this.a.optBoolean(U3.a.l, false);
    }

    public boolean e() {
        return this.a.optBoolean(U3.a.n, false);
    }
}
