package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final String f15283a = "permissions";

    /* renamed from: b, reason: collision with root package name */
    public final String f15284b = "name";

    /* renamed from: c, reason: collision with root package name */
    public final String f15285c = "list";

    /* renamed from: d, reason: collision with root package name */
    public final String f15286d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(@NotNull JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f15283a);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(this.f15285c)) != null) {
            int length = optJSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i5);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(this.f15286d)) {
                    String optString = optJSONObject2.optString(this.f15284b);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
        }
        return new a(hashSet);
    }

    @Nullable
    public final a b(@NotNull JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
