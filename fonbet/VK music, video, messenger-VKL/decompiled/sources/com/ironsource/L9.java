package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class L9 {
    private String a;
    private String e;
    private Map<String, String> f;
    private final Hc g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private C4295e8 d = null;
    protected boolean i = false;
    protected String j = null;

    public L9(String str, Hc hc) throws NullPointerException {
        this.a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (Hc) SDKUtils.requireNonNull(hc, "AdListener name can't be null");
    }

    public L9 a(boolean z) {
        this.c = z;
        return this;
    }

    public L9 b(boolean z) {
        this.i = z;
        return this;
    }

    public L9 c() {
        this.b = true;
        return this;
    }

    public L9 a(C4295e8 c4295e8) {
        this.d = c4295e8;
        return this;
    }

    public L9 b(@Nullable String str) {
        this.j = str;
        return this;
    }

    public L9 c(boolean z) {
        this.h = z;
        return this;
    }

    public L9 a(String str) {
        this.e = str;
        return this;
    }

    public String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.a);
            jSONObject.put("rewarded", this.b);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? W9.a() : W9.a(jSONObject);
    }

    public L9 a(Map<String, String> map) {
        this.f = map;
        return this;
    }

    public K9 a() {
        return new K9(b(), this.a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
    }
}
