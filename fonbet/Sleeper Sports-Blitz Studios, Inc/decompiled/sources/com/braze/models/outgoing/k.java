package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class k implements IPutIntoJson, m {

    /* renamed from: a, reason: collision with root package name */
    public final String f645a;
    public final Boolean b;
    public final i c;

    public k(String str, Boolean bool, i iVar) {
        this.f645a = str;
        this.b = bool;
        this.c = iVar;
    }

    public final boolean c() {
        return this.b != null;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        i iVar;
        JSONObject jsonObject = getJsonObject();
        if (jsonObject.length() == 0) {
            return true;
        }
        if (this.b == null && (iVar = this.c) != null) {
            return !iVar.b;
        }
        if (jsonObject.length() == 1) {
            return jsonObject.has("user_id");
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f645a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.f645a);
        }
        Boolean bool = this.b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        i iVar = this.c;
        if (iVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", iVar.f643a);
            jSONObject.put(AnalyticsConstantsKt.KEY_CONFIG, jSONObject2);
        }
        return jSONObject;
    }
}
