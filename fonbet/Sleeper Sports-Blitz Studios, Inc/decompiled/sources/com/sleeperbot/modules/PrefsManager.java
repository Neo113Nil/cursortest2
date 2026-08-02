package com.sleeperbot.modules;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* loaded from: classes8.dex */
public class PrefsManager extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "PrefsManager";
    private static final String PREFS_NAME = "RNAppSharedPrefs";
    private final SharedPreferences prefs;

    public PrefsManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.prefs = reactApplicationContext.getSharedPreferences(PREFS_NAME, 0);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void setString(String str, String str2, Promise promise) {
        if (str == null || str2 == null) {
            promise.reject("ERR_PREFS_INVALID", "Key and value must be non-null strings.");
            return;
        }
        try {
            this.prefs.edit().putString(str, str2).apply();
            promise.resolve(null);
        } catch (Exception e) {
            promise.reject("ERR_PREFS_SET_FAILED", "Failed to set key=\"" + str + "\": " + e.getMessage());
        }
    }

    @ReactMethod
    public void getString(String str, Promise promise) {
        if (str == null) {
            promise.reject("ERR_PREFS_INVALID", "Key must be a non-null string.");
            return;
        }
        try {
            String string = this.prefs.getString(str, null);
            if (string != null) {
                promise.resolve(string);
            } else {
                promise.resolve(null);
            }
        } catch (Exception e) {
            promise.reject("ERR_PREFS_GET_FAILED", "Failed to get key=\"" + str + "\": " + e.getMessage());
        }
    }

    public static String getStringSync(Context context, String str) {
        return context.getSharedPreferences(PREFS_NAME, 0).getString(str, null);
    }

    public static void setStringSync(Context context, String str, String str2) {
        context.getSharedPreferences(PREFS_NAME, 0).edit().putString(str, str2).apply();
    }
}
