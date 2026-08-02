package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2601pd {
    public static final a b = new a(null);
    public static final String c = "placements";
    public static final String d = "placementName";
    private final JSONArray a;

    /* renamed from: com.ironsource.pd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2601pd(JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration.optJSONArray(c);
    }

    public final <T> Map<String, T> a(Function1<? super JSONObject, ? extends T> valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i);
                String key = jsonObject.optString("placementName");
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T invoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }
}
