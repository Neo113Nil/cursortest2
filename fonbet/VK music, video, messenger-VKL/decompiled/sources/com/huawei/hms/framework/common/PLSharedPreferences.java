package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class PLSharedPreferences {
    private static final String MOVE_TO_DE_RECORDS = "grs_move2DE_records";
    private static final String TAG = "PLSharedPreferences";
    private final SharedPreferences sp;

    public PLSharedPreferences(Context context, String str) {
        this.sp = getSharedPreferences(context, str);
    }

    private SharedPreferences getSharedPreferences(Context context, String str) {
        if (context == null) {
            Logger.e(TAG, "context is null, must call init method to set context");
            return null;
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences h = Preference.h(createDeviceProtectedStorageContext, 0, MOVE_TO_DE_RECORDS);
        if (!h.getBoolean(str, false)) {
            if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                SharedPreferences.Editor edit = h.edit();
                edit.putBoolean(str, true);
                edit.apply();
            }
            return Preference.h(context, 0, str);
        }
        context = createDeviceProtectedStorageContext;
        return Preference.h(context, 0, str);
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        StringBuilder sb = new StringBuilder("sp size ");
        sb.append(all == null ? 0 : all.size());
        Logger.i(TAG, sb.toString());
        return all;
    }

    public Map<String, String> getHashMap(String str) {
        HashMap hashMap = new HashMap();
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            try {
                JSONArray jSONArray = new JSONArray(sharedPreferences.getString(str, ""));
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray names = jSONObject.names();
                    if (names != null) {
                        for (int i2 = 0; i2 < names.length(); i2++) {
                            String string = names.getString(i2);
                            hashMap.put(string, jSONObject.getString(string));
                        }
                    }
                }
            } catch (JSONException e) {
                Logger.w(TAG, "getHashMap parse Json to map error: %s", StringUtils.anonymizeMessage(e.getMessage()));
                return hashMap;
            }
        }
        return hashMap;
    }

    public long getLong(String str, long j) {
        SharedPreferences sharedPreferences = this.sp;
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public void putHashMap(String str, Map<String, String> map) {
        if (this.sp == null || map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                Logger.w(TAG, "putHashMap one object error: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
        jSONArray.put(jSONObject);
        this.sp.edit().putString(str, jSONArray.toString()).apply();
    }

    public void putLong(String str, long j) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j).apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public void remove(String str) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public void removeKeyValue(String str) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.sp;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }
}
