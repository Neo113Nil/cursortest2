package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class w6 extends y6 {
    private final com.applovin.impl.sdk.ad.b g;
    private final AppLovinAdRewardListener h;

    public w6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateAppLovinReward", lVar);
        this.g = bVar;
        this.h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, BrandSafetyEvent.f, this.g.getAdZone().e());
        String clCode = this.g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.t6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.y6
    protected boolean h() {
        return this.g.K0();
    }

    @Override // com.applovin.impl.y6
    protected void a(q4 q4Var) {
        this.g.a(q4Var);
        String b = q4Var.b();
        Map<String, String> a = q4Var.a();
        if (b.equals("accepted")) {
            this.h.userRewardVerified(this.g, a);
            return;
        }
        if (b.equals("quota_exceeded")) {
            this.h.userOverQuota(this.g, a);
        } else if (b.equals("rejected")) {
            this.h.userRewardRejected(this.g, a);
        } else {
            this.h.validationRequestFailed(this.g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.t6
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.h.userRewardRejected(this.g, Collections.emptyMap());
            str = "rejected";
        } else {
            this.h.validationRequestFailed(this.g, i);
            str = "network_timeout";
        }
        this.g.a(q4.a(str));
    }
}
