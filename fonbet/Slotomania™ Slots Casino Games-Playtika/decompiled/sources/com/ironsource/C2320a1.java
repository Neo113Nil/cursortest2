package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2320a1 {
    public static final a b = new a(null);
    public static final String c = "adUnits";
    private final JSONObject a;

    /* renamed from: com.ironsource.a1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2320a1(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = configurations.optJSONObject(c);
    }

    public final <T> Map<String, T> a(Function1<? super JSONObject, ? extends T> valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "adUnits.keys()");
        Sequence asSequence = SequencesKt.asSequence(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : asSequence) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
