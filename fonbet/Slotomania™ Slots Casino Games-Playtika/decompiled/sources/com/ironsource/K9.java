package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class K9 {
    private String a;
    private String e;
    private Map<String, String> f;
    private final Gc g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private C2381d8 d = null;
    protected boolean i = false;
    protected String j = null;

    public K9(String str, Gc gc) throws NullPointerException {
        this.a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (Gc) SDKUtils.requireNonNull(gc, "AdListener name can't be null");
    }

    public K9 a(boolean z) {
        this.c = z;
        return this;
    }

    public K9 b(boolean z) {
        this.i = z;
        return this;
    }

    public K9 c() {
        this.b = true;
        return this;
    }

    public K9 a(C2381d8 c2381d8) {
        this.d = c2381d8;
        return this;
    }

    public K9 b(String str) {
        this.j = str;
        return this;
    }

    public K9 c(boolean z) {
        this.h = z;
        return this;
    }

    public K9 a(String str) {
        this.e = str;
        return this;
    }

    public String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("name", this.a);
            jsonObjectInit.put("rewarded", this.b);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? V9.a() : V9.a(jsonObjectInit);
    }

    public K9 a(Map<String, String> map) {
        this.f = map;
        return this;
    }

    public J9 a() {
        return new J9(b(), this.a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
    }
}
