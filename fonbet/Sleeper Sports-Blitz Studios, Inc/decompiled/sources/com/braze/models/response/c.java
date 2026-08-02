package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f651a;
    public final long b;
    public final boolean c;
    public final JSONArray d;

    public c(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f651a = jsonObject.optLong("last_card_updated_at", -1L);
        this.b = jsonObject.optLong("last_full_sync_at", -1L);
        this.c = jsonObject.optBoolean("full_sync", false);
        this.d = jsonObject.optJSONArray("cards");
    }

    public c(String serializedCardJson) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        this.c = false;
        this.f651a = -1L;
        this.b = -1L;
        this.d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
