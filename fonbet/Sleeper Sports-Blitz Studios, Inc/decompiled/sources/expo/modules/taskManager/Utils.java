package expo.modules.taskManager;

import android.util.Log;
import expo.modules.interfaces.taskManager.TaskInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Utils {
    private static final String TAG = "taskManager.Utils";

    public static Map<String, Object> exportTaskToMap(TaskInterface taskInterface) {
        HashMap hashMap = new HashMap();
        Class<?> cls = taskInterface.getConsumer().getClass();
        String unversionedClassNameForClass = unversionedClassNameForClass(cls);
        hashMap.put("name", taskInterface.getName());
        hashMap.put("consumerClass", unversionedClassNameForClass);
        hashMap.put("consumerVersion", Integer.valueOf(getConsumerVersion(cls)));
        hashMap.put("options", taskInterface.getOptions());
        return hashMap;
    }

    public static Class unversionedClassForClass(Class cls) {
        if (cls == null) {
            return null;
        }
        String unversionedClassNameForClass = unversionedClassNameForClass(cls);
        try {
            return Class.forName(unversionedClassNameForClass);
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "Class with name '" + unversionedClassNameForClass + "' not found.");
            e.printStackTrace();
            return null;
        }
    }

    public static String unversionedClassNameForClass(Class cls) {
        return cls.getName().replaceFirst("\\^abi\\d+_\\d+_\\d+\\.", "");
    }

    public static int getConsumerVersion(Class cls) {
        try {
            return ((Integer) cls.getDeclaredField("VERSION").get(null)).intValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    public static Map<String, Object> jsonToMap(String str) {
        try {
            return jsonToMap(new JSONObject(str));
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static Map<String, Object> jsonToMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jsonObjectToObject(jSONObject.get(next)));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return hashMap;
        }
    }

    public static List<Object> jsonToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj == JSONObject.NULL) {
                    obj = null;
                } else if (obj instanceof JSONArray) {
                    obj = jsonToList((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = jsonToMap((JSONObject) obj);
                }
                arrayList.add(obj);
            } catch (JSONException e) {
                e.printStackTrace();
                return arrayList;
            }
        }
        return arrayList;
    }

    public static Object jsonObjectToObject(Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return jsonToMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? jsonToList((JSONArray) obj) : obj;
    }
}
