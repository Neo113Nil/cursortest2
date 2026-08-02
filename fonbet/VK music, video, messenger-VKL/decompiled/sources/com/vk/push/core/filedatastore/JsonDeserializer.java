package com.vk.push.core.filedatastore;

import org.json.JSONObject;

/* compiled from: JsonSerializable.kt */
/* loaded from: classes.dex */
public interface JsonDeserializer<T> {
    T fromJson(JSONObject jSONObject);
}
