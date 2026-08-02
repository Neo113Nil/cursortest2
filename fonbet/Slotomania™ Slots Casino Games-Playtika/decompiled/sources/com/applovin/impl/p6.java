package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p6 extends r6 {
    private final com.applovin.impl.sdk.ad.b g;

    public p6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        super("TaskReportAppLovinReward", lVar);
        this.g = bVar;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, BrandSafetyEvent.f, this.g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.g.R());
        String clCode = this.g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.r6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Reported reward successfully for ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.t6
    protected String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.r6
    protected q4 h() {
        return this.g.j();
    }

    @Override // com.applovin.impl.r6
    protected void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "No reward result was found for ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.t6
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Failed to report reward for ad: " + this.g + " - error code: " + i);
        }
        this.a.g().a(f2.I, this.g, CollectionUtils.map("code", String.valueOf(i)));
    }
}
