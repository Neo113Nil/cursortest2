package com.ironsource;

import com.ironsource.InterfaceC4456n8;
import com.ironsource.X3;
import org.json.JSONObject;

/* renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4474o8 implements InterfaceC4456n8, InterfaceC4456n8.a {
    private JSONObject a = new JSONObject();
    private JSONObject b = new JSONObject();
    private JSONObject c = new JSONObject();

    private final Object e(String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.a.has(str)) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4456n8
    public JSONObject a(String str) {
        Object e = e(str);
        if (e instanceof JSONObject) {
            return (JSONObject) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4456n8
    public Integer b(String str) {
        Object e = e(str);
        if (e instanceof Integer) {
            return (Integer) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4456n8
    public Boolean c(String str) {
        Object e = e(str);
        if (e instanceof Boolean) {
            return (Boolean) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4456n8
    public String d(String str) {
        Object e = e(str);
        if (e instanceof String) {
            return (String) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4456n8.a
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject(X3.a.b);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.b = optJSONObject;
        JSONObject optJSONObject2 = this.a.optJSONObject(X3.a.c);
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        this.c = optJSONObject2;
    }
}
