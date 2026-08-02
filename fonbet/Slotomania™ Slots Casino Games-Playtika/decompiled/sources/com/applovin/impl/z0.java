package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class z0 extends w0 {
    private Map c;

    public z0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        super(jSONObject, lVar);
    }

    public Map f() {
        return this.c;
    }

    public String g() {
        return JsonUtils.getString(this.b, "name", null);
    }

    @Override // com.applovin.impl.w0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + "}";
    }
}
