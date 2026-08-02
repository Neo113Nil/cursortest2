package com.ironsource;

import com.ironsource.X3;
import org.json.JSONObject;

/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4284df {
    private EnumC4302ef a;

    public C4284df(JSONObject jSONObject) {
        this.a = EnumC4302ef.b.a(jSONObject.optInt(X3.a.t, EnumC4302ef.CurrentlyLoadedAds.b()));
    }

    public final EnumC4302ef a() {
        return this.a;
    }
}
