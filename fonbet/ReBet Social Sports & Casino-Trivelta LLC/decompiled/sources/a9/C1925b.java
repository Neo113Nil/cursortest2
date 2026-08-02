package a9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1925b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1925b f15106a = new C1925b();

    public final ReadableArray a(JSONArray arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        WritableArray createArray = Arguments.createArray();
        int length = arr.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = arr.get(i10);
            if (obj instanceof JSONObject) {
                createArray.pushMap(b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(a((JSONArray) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                createArray.pushInt((int) ((Number) obj).longValue());
            } else {
                if (!arr.isNull(i10)) {
                    throw new JSONException("Unexpected value when parsing JSON array. index: " + i10);
                }
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public final ReadableMap b(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = obj.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj2 = obj.get(next);
            if (obj2 instanceof JSONObject) {
                Intrinsics.checkNotNull(next);
                createMap.putMap(next, b((JSONObject) obj2));
            } else if (obj2 instanceof JSONArray) {
                Intrinsics.checkNotNull(next);
                createMap.putArray(next, a((JSONArray) obj2));
            } else if (obj2 instanceof String) {
                Intrinsics.checkNotNull(next);
                createMap.putString(next, (String) obj2);
            } else if (obj2 instanceof Boolean) {
                Intrinsics.checkNotNull(next);
                createMap.putBoolean(next, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof Integer) {
                Intrinsics.checkNotNull(next);
                createMap.putInt(next, ((Number) obj2).intValue());
            } else if (obj2 instanceof Double) {
                Intrinsics.checkNotNull(next);
                createMap.putDouble(next, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof Long) {
                Intrinsics.checkNotNull(next);
                createMap.putInt(next, (int) ((Number) obj2).longValue());
            } else {
                if (!obj.isNull(next)) {
                    throw new JSONException("Unexpected value when parsing JSON object. key: " + next);
                }
                Intrinsics.checkNotNull(next);
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    public final ReadableMap c(String str) {
        return b(new JSONObject(str));
    }
}
