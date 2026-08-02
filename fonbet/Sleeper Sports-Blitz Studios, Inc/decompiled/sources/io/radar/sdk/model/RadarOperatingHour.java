package io.radar.sdk.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarOperatingHour.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/model/RadarOperatingHour;", "", "hours", "", "", "(Ljava/util/Map;)V", "getHours", "()Ljava/util/Map;", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarOperatingHour {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Object> hours;

    @JvmStatic
    public static final RadarOperatingHour fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarOperatingHour(Map<String, Object> hours) {
        Intrinsics.checkNotNullParameter(hours, "hours");
        this.hours = hours;
    }

    public final Map<String, Object> getHours() {
        return this.hours;
    }

    /* compiled from: RadarOperatingHour.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarOperatingHour$Companion;", "", "()V", "fromJson", "Lio/radar/sdk/model/RadarOperatingHour;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarOperatingHour fromJson(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = obj.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj2 = obj.get(next);
                if (obj2 instanceof JSONArray) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = (JSONArray) obj2;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj3 = jSONArray.get(i);
                        if (obj3 instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj3;
                            if (jSONArray2.length() == 2) {
                                ArrayList arrayList2 = new ArrayList();
                                Object obj4 = jSONArray2.get(0);
                                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                                arrayList2.add(obj4);
                                Object obj5 = jSONArray2.get(1);
                                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                                arrayList2.add(obj5);
                                arrayList.add(arrayList2);
                            }
                        }
                    }
                    Intrinsics.checkNotNull(next);
                    linkedHashMap.put(next, arrayList);
                }
            }
            return new RadarOperatingHour(linkedHashMap);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : this.hours.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (List) value) {
                    if (obj instanceof List) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            jSONArray2.put(it.next());
                        }
                        jSONArray.put(jSONArray2);
                    }
                }
                jSONObject.put(key, jSONArray);
            }
        }
        return jSONObject;
    }
}
