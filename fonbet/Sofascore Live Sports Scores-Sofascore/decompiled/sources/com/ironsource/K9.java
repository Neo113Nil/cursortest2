package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class K9 {
    private String a;
    private String e;
    private Map<String, String> f;
    private final Gc g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private C4000b8 d = null;
    protected boolean i = false;
    protected String j = null;

    public K9(String str, Gc gc) throws NullPointerException {
        this.a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (Gc) SDKUtils.requireNonNull(gc, "AdListener name can't be null");
    }

    public J9 a() {
        return new J9(b(), this.a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? V9.a() : V9.a(jSONObject);
    }

    public K9 c() {
        this.b = true;
        return this;
    }

    public K9 c(boolean z) {
        this.h = z;
        return this;
    }

    public K9 a(C4000b8 c4000b8) {
        this.d = c4000b8;
        return this;
    }

    public K9 a(String str) {
        this.e = str;
        return this;
    }

    public K9 a(Map<String, String> map) {
        this.f = map;
        return this;
    }

    public K9 a(boolean z) {
        this.c = z;
        return this;
    }

    public K9 b(@Nullable String str) {
        this.j = str;
        return this;
    }

    public K9 b(boolean z) {
        this.i = z;
        return this;
    }
}
