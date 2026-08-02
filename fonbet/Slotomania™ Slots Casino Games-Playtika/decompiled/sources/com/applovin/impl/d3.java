package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import com.braze.models.inappmessage.InAppMessageBase;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d3 extends j3 {
    public d3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(c3Var, jSONObject, jSONObject2, null, lVar);
    }

    public boolean A0() {
        return a("proe", (Boolean) this.a.a(t3.l8)).booleanValue();
    }

    @Override // com.applovin.impl.a3
    public a3 a(com.applovin.impl.mediation.h hVar) {
        return new d3(this, hVar);
    }

    public long u0() {
        long a = a("ad_refresh_ms", -1L);
        return a >= 0 ? a : b("ad_refresh_ms", ((Long) this.a.a(t3.J7)).longValue());
    }

    public long v0() {
        return q7.e(a(InAppMessageBase.BG_COLOR, (String) null));
    }

    public int w0() {
        int a = a("ad_view_height", -2);
        if (a != -2) {
            return a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long x0() {
        return a("viewability_imp_delay_ms", ((Long) this.a.a(z4.r1)).longValue());
    }

    public int y0() {
        int a = a("ad_view_width", -2);
        if (a != -2) {
            return a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean z0() {
        return u0() >= 0;
    }

    private d3(d3 d3Var, com.applovin.impl.mediation.h hVar) {
        super(d3Var.Q(), d3Var.a(), d3Var.g(), hVar, d3Var.a);
    }
}
