package io.sentry.react;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.AndroidLogger;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class RNSentryJsonConverter {
    public static final String NAME = "RNSentry.RNSentryJsonConverter";
    private static final ILogger logger = new AndroidLogger(NAME);

    private RNSentryJsonConverter() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    static WritableMap convertToWritable(JSONObject jSONObject) {
        try {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (!(obj instanceof Float) && !(obj instanceof Double)) {
                    if (obj instanceof Number) {
                        javaOnlyMap.putInt(next, jSONObject.getInt(next));
                    } else if (obj instanceof String) {
                        javaOnlyMap.putString(next, jSONObject.getString(next));
                    } else if (obj instanceof JSONObject) {
                        javaOnlyMap.putMap(next, convertToWritable(jSONObject.getJSONObject(next)));
                    } else if (obj instanceof JSONArray) {
                        javaOnlyMap.putArray(next, convertToWritable(jSONObject.getJSONArray(next)));
                    } else if (obj == JSONObject.NULL) {
                        javaOnlyMap.putNull(next);
                    }
                }
                javaOnlyMap.putDouble(next, jSONObject.getDouble(next));
            }
            return javaOnlyMap;
        } catch (JSONException e) {
            logger.log(SentryLevel.ERROR, "Error parsing json object:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    static WritableArray convertToWritable(JSONArray jSONArray) throws JSONException {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                javaOnlyArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                javaOnlyArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(convertToWritable(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(convertToWritable(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                javaOnlyArray.pushNull();
            }
        }
        return javaOnlyArray;
    }
}
