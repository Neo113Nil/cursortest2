package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class i implements IPutIntoJson, m {

    /* renamed from: a, reason: collision with root package name */
    public final long f643a;
    public final boolean b;

    public i(long j, boolean z) {
        this.f643a = j;
        this.b = z;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f643a);
        return jSONObject;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return !this.b;
    }
}
