package com.sleeperbot.modules;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.sleeperbot.BuildConfig;

/* loaded from: classes8.dex */
public class SharedLoginManager extends ReactContextBaseJavaModule {
    private static final String KEY_LOGIN_DATA = "login_data";
    private static final String MODULE_NAME = "SharedLoginManager";
    private static final String[] SUPPORTED_PACKAGES = {BuildConfig.APPLICATION_ID, "com.sleeperbot.lite", "com.sleeperbot.picks"};

    public SharedLoginManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void getData(Promise promise) {
        String dataForPackage;
        try {
            WritableArray createArray = Arguments.createArray();
            for (String str : SUPPORTED_PACKAGES) {
                if (checkIfProviderExists(str) && (dataForPackage = getDataForPackage(str)) != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("packageName", str);
                    createMap.putString("data", dataForPackage);
                    createArray.pushMap(createMap);
                }
            }
            promise.resolve(createArray);
        } catch (Exception e) {
            promise.reject("GET_DATA_ERROR", e.getMessage(), e);
        }
    }

    @ReactMethod
    public void setLocalData(String str, Promise promise) {
        try {
            setDataForPackage(getReactApplicationContext().getPackageName(), str);
            promise.resolve(null);
        } catch (Exception e) {
            promise.reject("SET_LOCAL_DATA_ERROR", e.getMessage(), e);
        }
    }

    private String getDataForPackage(String str) {
        try {
            Cursor query = getReactApplicationContext().getContentResolver().query(Uri.parse("content://" + (str + ".sharedloginprovider") + "/login"), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex(KEY_LOGIN_DATA));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } finally {
                }
            }
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Exception e) {
            System.out.println("Error accessing " + str + ": " + e.getMessage());
            return null;
        }
    }

    private void setDataForPackage(String str, String str2) {
        Uri parse = Uri.parse("content://" + (str + ".sharedloginprovider") + "/login");
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        try {
            if (str2 == null) {
                contentResolver.delete(parse, null, null);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_LOGIN_DATA, str2);
            contentResolver.insert(parse, contentValues);
        } catch (Exception e) {
            System.out.println("Error writing to " + str + ": " + e.getMessage());
        }
    }

    private boolean checkIfProviderExists(String str) {
        try {
            Cursor query = getReactApplicationContext().getContentResolver().query(Uri.parse("content://" + (str + ".sharedloginprovider") + "/login"), null, null, null, null);
            boolean z = query != null;
            if (query != null) {
                query.close();
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
