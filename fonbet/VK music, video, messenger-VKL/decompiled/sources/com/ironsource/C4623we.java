package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.we, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4623we {
    private final Ve a;
    private final Fd b;
    private final Jd c;
    private final O3 d;
    private final N5 e;

    public C4623we(Ve ve) {
        this.a = ve;
        JSONObject optJSONObject = ve.j().optJSONObject(C4641xe.a);
        this.b = new Fd(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = ve.j().optJSONObject(C4641xe.b);
        this.c = new Jd(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = ve.j().optJSONObject("configurations");
        this.d = new O3(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = ve.j().optJSONObject(C4641xe.d);
        this.e = new N5(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    public final O3 a() {
        return this.d;
    }

    public final N5 b() {
        return this.e;
    }

    public final Ve c() {
        return this.a;
    }

    public final Fd d() {
        return this.b;
    }

    public final Jd e() {
        return this.c;
    }
}
