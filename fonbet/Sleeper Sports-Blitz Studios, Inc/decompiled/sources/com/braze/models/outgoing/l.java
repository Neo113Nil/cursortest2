package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class l implements IPutIntoJson, m {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f646a;
    public final JSONArray b;

    public l(JSONObject userObject) {
        Intrinsics.checkNotNullParameter(userObject, "userObject");
        this.f646a = userObject;
        this.b = new JSONArray().put(userObject);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONArray jsonArrayForJsonPut = this.b;
        Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return this.f646a.length() == 0 || (this.f646a.length() == 1 && this.f646a.has("user_id"));
    }
}
