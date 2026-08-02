package com.radar;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class RadarUtils {
    static WritableMap mapForJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, mapForJson((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeMap.putArray(next, arrayForJson((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                writableNativeMap.putDouble(next, Double.valueOf(obj.toString()).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            }
        }
        return writableNativeMap;
    }

    static WritableArray arrayForJson(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(mapForJson((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(arrayForJson((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            }
        }
        return writableNativeArray;
    }

    static JSONObject jsonForMap(ReadableMap readableMap) throws JSONException {
        if (readableMap == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    jSONObject.put(nextKey, jsonForMap(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    jSONObject.put(nextKey, jsonForArray(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }

    /* renamed from: com.radar.RadarUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static JSONArray jsonForArray(ReadableArray readableArray) throws JSONException {
        if (readableArray == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()];
            if (i2 == 2) {
                jSONArray.put(readableArray.getBoolean(i));
            } else if (i2 == 3) {
                jSONArray.put(readableArray.getDouble(i));
            } else if (i2 == 4) {
                jSONArray.put(readableArray.getString(i));
            } else if (i2 == 5) {
                jSONArray.put(jsonForMap(readableArray.getMap(i)));
            } else if (i2 == 6) {
                jSONArray.put(jsonForArray(readableArray.getArray(i)));
            }
        }
        return jSONArray;
    }

    static String[] stringArrayForArray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = readableArray.getString(i);
            }
            return strArr;
        }
        return new String[0];
    }

    static ReadableArray arrayForStringArray(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (String str : strArr) {
            writableNativeArray.pushString(str);
        }
        return writableNativeArray;
    }

    static Map<String, String> stringStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }
}
