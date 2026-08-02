package com.applovin.impl;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i7 {
    private final com.applovin.impl.sdk.l a;
    private boolean b;
    private List c;

    public i7(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        b5 b5Var = b5.I;
        this.b = ((Boolean) lVar.a(b5Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.l.p()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || lVar.B().T();
        lVar.c(b5Var);
    }

    private void e() {
        com.applovin.impl.sdk.k u = this.a.u();
        if (this.b) {
            u.b(this.c);
        } else {
            u.a(this.c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        List list = this.c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.c == null) {
            return;
        }
        if (list == null || !list.equals(this.c)) {
            this.c = list;
            e();
        }
    }

    public void a() {
        this.a.b(b5.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.m B = this.a.B();
        boolean T = B.T();
        String a = B.f().a();
        m.b H = B.H();
        this.b = T || JsonUtils.containsCaseInsensitiveString(a, jSONArray) || JsonUtils.containsCaseInsensitiveString(H != null ? H.a : null, jSONArray);
    }
}
