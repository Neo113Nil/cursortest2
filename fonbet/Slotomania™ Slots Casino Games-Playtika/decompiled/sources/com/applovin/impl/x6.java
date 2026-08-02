package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x6 extends y6 {
    private final e3 g;

    public x6(e3 e3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateMaxReward", lVar);
        this.g = e3Var;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.g.getFormat().getLabel());
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

    @Override // com.applovin.impl.t6
    protected String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.y6
    protected boolean h() {
        return this.g.A0();
    }

    @Override // com.applovin.impl.y6
    protected void a(q4 q4Var) {
        this.g.a(q4Var);
    }

    @Override // com.applovin.impl.t6
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.g.a(q4.a(str));
        HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", str);
        hashMap.put("code", String.valueOf(i));
        this.a.R().a(f2.w0, this.g, hashMap);
    }
}
