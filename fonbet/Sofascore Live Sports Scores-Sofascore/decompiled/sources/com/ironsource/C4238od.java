package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4238od {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "placements";

    @NotNull
    public static final String d = "placementName";

    @Nullable
    private final JSONArray a;

    public C4238od(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optJSONArray(c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1<? super JSONObject, ? extends T> function1) {
        function1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("placementName");
                Object invoke = function1.invoke(jSONObject);
                optString.getClass();
                linkedHashMap.put(optString, invoke);
            }
        }
        return linkedHashMap;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.od$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
