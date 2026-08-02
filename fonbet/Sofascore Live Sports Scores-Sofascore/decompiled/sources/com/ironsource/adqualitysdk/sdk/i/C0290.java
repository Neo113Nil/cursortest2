package com.ironsource.adqualitysdk.sdk.i;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʎ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0290 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f530;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f531;

    public C0290(JSONObject jSONObject) {
        String uuid = UUID.randomUUID().toString();
        this.f531 = jSONObject;
        this.f530 = uuid;
    }

    public C0290(String str, JSONObject jSONObject) {
        this.f531 = jSONObject;
        this.f530 = str;
    }
}
