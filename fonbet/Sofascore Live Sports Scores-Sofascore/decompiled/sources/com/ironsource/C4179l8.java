package com.ironsource;

import com.ironsource.InterfaceC4161k8;
import com.ironsource.U3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4179l8 implements InterfaceC4161k8, InterfaceC4161k8.a {

    @NotNull
    private JSONObject a = new JSONObject();

    @NotNull
    private JSONObject b = new JSONObject();

    @NotNull
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

    @Override // com.ironsource.InterfaceC4161k8.a
    public void a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject(U3.a.b);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.b = optJSONObject;
        JSONObject optJSONObject2 = this.a.optJSONObject(U3.a.c);
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        this.c = optJSONObject2;
    }

    @Override // com.ironsource.InterfaceC4161k8
    @Nullable
    public Integer b(@NotNull String str) {
        str.getClass();
        Object e = e(str);
        if (e instanceof Integer) {
            return (Integer) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4161k8
    @Nullable
    public Boolean c(@NotNull String str) {
        str.getClass();
        Object e = e(str);
        if (e instanceof Boolean) {
            return (Boolean) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4161k8
    @Nullable
    public String d(@NotNull String str) {
        str.getClass();
        Object e = e(str);
        if (e instanceof String) {
            return (String) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4161k8
    @Nullable
    public JSONObject a(@NotNull String str) {
        str.getClass();
        Object e = e(str);
        if (e instanceof JSONObject) {
            return (JSONObject) e;
        }
        return null;
    }
}
