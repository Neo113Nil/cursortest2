package com.vk.push.common.utils;

import org.json.JSONObject;

/* compiled from: JSONExtension.kt */
/* loaded from: classes5.dex */
public final class JSONExtensionKt {
    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        return StringExtensionsKt.nullIfBlank(jSONObject.optString(str));
    }
}
