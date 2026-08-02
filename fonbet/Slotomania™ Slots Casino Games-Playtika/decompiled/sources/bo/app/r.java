package bo.app;

import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000\u001a\f\u0010\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "Lorg/json/JSONArray;", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class r {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ List<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<? extends Object> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Removing non-string keys from map. Removed keys: ", this.b);
        }
    }

    public static final Map<?, ?> a(Map<?, ?> map) {
        Map<?, ?> map2;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Set<?> keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof String) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        List list = (List) new Pair(arrayList, arrayList2).component2();
        if (list.isEmpty()) {
            map2 = map;
        } else {
            map2 = map;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, map2, BrazeLogger.Priority.W, (Throwable) null, new a(list), 2, (Object) null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map2.entrySet()) {
            if (entry.getKey() instanceof String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object value = entry2.getValue();
            if ((value instanceof Date) || (value instanceof Map) || (value instanceof Long) || (value instanceof Integer) || (value instanceof Double) || (value instanceof Boolean) || (value instanceof String) || (value instanceof JSONObject) || (value instanceof JSONArray) || value == null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Date) {
                value2 = DateTimeUtils.formatDate$default((Date) value2, BrazeDateFormat.LONG, null, 2, null);
            } else if (value2 instanceof JSONArray) {
                value2 = a((JSONArray) value2);
            } else if (value2 instanceof Map) {
                value2 = a((Map<?, ?>) value2);
            }
            linkedHashMap3.put(key, value2);
        }
        return linkedHashMap3;
    }

    public static final JSONArray a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            Object obj = jSONArray.get(i);
            if (obj instanceof Date) {
                jSONArray2.put(DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
            } else if (obj instanceof JSONArray) {
                jSONArray2.put(a((JSONArray) obj));
            } else if (obj instanceof Map) {
                jSONArray2.put(a((Map<?, ?>) obj));
            } else {
                jSONArray2.put(obj);
            }
            i = i2;
        }
        return jSONArray2;
    }
}
