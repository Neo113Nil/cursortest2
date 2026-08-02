package com.braze.reactbridge;

import com.braze.reactbridge.util.MapFactoryKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a0\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u001a\f\u0010\r\u001a\u00020\n*\u00020\nH\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a>\u0010\u0013\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fH\u0002\u001a.\u0010\u0006\u001a\u00020\u0015*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fH\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u000f*\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0018"}, d2 = {"toNativeMap", "Lcom/facebook/react/bridge/ReadableMap;", "Lorg/json/JSONObject;", "toNativeArray", "Lcom/facebook/react/bridge/ReadableArray;", "Lorg/json/JSONArray;", "formatToCamelCase", "Lcom/facebook/react/bridge/WritableMap;", "keysToPreserve", "", "", "specialCases", "", "snakeToCamelCase", "addValue", "", SDKConstants.PARAM_KEY, "value", "", "addValueWithCamelKey", "camelKey", "Lcom/facebook/react/bridge/WritableArray;", "addArrayItem", "item", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonUtilsKt {
    public static final ReadableMap toNativeMap(JSONObject jSONObject) {
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        if (jSONObject == null) {
            return mutableMap;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                Intrinsics.checkNotNull(next);
                mutableMap.putMap(next, toNativeMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                Intrinsics.checkNotNull(next);
                mutableMap.putArray(next, toNativeArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                Intrinsics.checkNotNull(next);
                mutableMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                Intrinsics.checkNotNull(next);
                mutableMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                Intrinsics.checkNotNull(next);
                mutableMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                Intrinsics.checkNotNull(next);
                mutableMap.putString(next, (String) obj);
            } else if (obj instanceof Long) {
                Intrinsics.checkNotNull(next);
                mutableMap.putLong(next, ((Number) obj).longValue());
            } else if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
                Intrinsics.checkNotNull(next);
                mutableMap.putNull(next);
            }
        }
        return mutableMap;
    }

    public static final ReadableArray toNativeArray(JSONArray jSONArray) {
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        if (jSONArray == null) {
            return mutableArray;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                mutableArray.pushMap(toNativeMap((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                mutableArray.pushArray(toNativeArray((JSONArray) opt));
            } else if (opt instanceof Boolean) {
                mutableArray.pushBoolean(((Boolean) opt).booleanValue());
            } else if (opt instanceof Integer) {
                mutableArray.pushInt(((Number) opt).intValue());
            } else if (opt instanceof Double) {
                mutableArray.pushDouble(((Number) opt).doubleValue());
            } else if (opt instanceof String) {
                mutableArray.pushString((String) opt);
            } else if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
                mutableArray.pushNull();
            } else if (opt instanceof Long) {
                mutableArray.pushLong(((Number) opt).longValue());
            } else {
                mutableArray.pushString(opt.toString());
            }
        }
        return mutableArray;
    }

    public static /* synthetic */ WritableMap formatToCamelCase$default(JSONObject jSONObject, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        return formatToCamelCase(jSONObject, (List<String>) list, (Map<String, String>) map);
    }

    public static final WritableMap formatToCamelCase(JSONObject jSONObject, List<String> keysToPreserve, Map<String, String> specialCases) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(keysToPreserve, "keysToPreserve");
        Intrinsics.checkNotNullParameter(specialCases, "specialCases");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (keysToPreserve.contains(next)) {
                Intrinsics.checkNotNull(next);
                Intrinsics.checkNotNull(obj);
                addValue(mutableMap, next, obj);
            } else {
                String str = specialCases.get(next);
                if (str == null) {
                    Intrinsics.checkNotNull(next);
                    str = snakeToCamelCase(next);
                }
                Intrinsics.checkNotNull(obj);
                addValueWithCamelKey(mutableMap, str, obj, keysToPreserve, specialCases);
            }
        }
        return mutableMap;
    }

    private static final String snakeToCamelCase(String str) {
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
        if (split$default.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder((String) split$default.get(0));
        int size = split$default.size();
        for (int i = 1; i < size; i++) {
            String str2 = (String) split$default.get(i);
            String str3 = str2;
            if (str3.length() > 0) {
                if (str3.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String valueOf = String.valueOf(str2.charAt(0));
                    Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = valueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    sb2.append((Object) upperCase);
                    String substring = str2.substring(1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    sb2.append(substring);
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private static final void addValue(WritableMap writableMap, String str, Object obj) {
        if (obj instanceof JSONObject) {
            writableMap.putMap(str, toNativeMap((JSONObject) obj));
            return;
        }
        if (obj instanceof JSONArray) {
            writableMap.putArray(str, toNativeArray((JSONArray) obj));
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(str, ((Number) obj).longValue());
        } else if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            writableMap.putNull(str);
        } else {
            writableMap.putString(str, obj.toString());
        }
    }

    private static final void addValueWithCamelKey(WritableMap writableMap, String str, Object obj, List<String> list, Map<String, String> map) {
        if (obj instanceof JSONObject) {
            writableMap.putMap(str, formatToCamelCase((JSONObject) obj, list, map));
            return;
        }
        if (obj instanceof JSONArray) {
            writableMap.putArray(str, formatToCamelCase((JSONArray) obj, list, map));
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(str, ((Number) obj).longValue());
        } else if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            writableMap.putNull(str);
        } else {
            writableMap.putString(str, obj.toString());
        }
    }

    private static final WritableArray formatToCamelCase(JSONArray jSONArray, List<String> list, Map<String, String> map) {
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                mutableArray.pushMap(formatToCamelCase((JSONObject) opt, list, map));
            } else {
                addArrayItem(mutableArray, opt);
            }
        }
        return mutableArray;
    }

    private static final void addArrayItem(WritableArray writableArray, Object obj) {
        if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Double) {
            writableArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            writableArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Long) {
            writableArray.pushLong(((Number) obj).longValue());
        } else if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            writableArray.pushNull();
        } else {
            writableArray.pushString(String.valueOf(obj));
        }
    }
}
