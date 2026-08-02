package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class q6 extends r6 {
    private final e3 g;

    public q6(e3 e3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskReportMaxReward", lVar);
        this.g = e3Var;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        String v0 = this.g.v0();
        if (!StringUtils.isValidString(v0)) {
            v0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", v0);
        String C = this.g.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.r6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Reported reward successfully for mediated ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.t6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.r6
    protected q4 h() {
        return this.g.r0();
    }

    @Override // com.applovin.impl.r6
    protected void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "No reward result was found for mediated ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.t6
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Failed to report reward for mediated ad: " + this.g + " - error code: " + i);
        }
        this.a.R().a(f2.v0, this.g, CollectionUtils.map("code", String.valueOf(i)));
    }
}
