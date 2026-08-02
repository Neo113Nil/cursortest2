package com.poppop.RNReactNativeSharedGroupPreferences;

import android.content.SharedPreferences;
import android.os.Environment;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* loaded from: classes8.dex */
public class RNReactNativeSharedGroupPreferencesModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public RNReactNativeSharedGroupPreferencesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private SharedPreferences getSharedPreferences(String str) {
        return this.reactContext.getApplicationContext().getSharedPreferences(str, 0);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNReactNativeSharedGroupPreferences";
    }

    @ReactMethod
    public void isAppInstalledAndroid(String str, Callback callback) {
        try {
            this.reactContext.getPackageManager().getPackageInfo(str, 1);
            callback.invoke(true);
        } catch (Exception unused) {
            callback.invoke(false);
        }
    }

    @ReactMethod
    public void setItem(String str, String str2, String str3, ReadableMap readableMap, Callback callback) {
        if (readableMap.hasKey("useAndroidSharedPreferences") ? readableMap.getBoolean("useAndroidSharedPreferences") : false) {
            SharedPreferences.Editor edit = getSharedPreferences(str3).edit();
            edit.putString(str, str2);
            edit.apply();
            callback.invoke(null, "");
            return;
        }
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + str3 + "/");
            file.mkdir();
            File file2 = new File(file, "data.json");
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.append((CharSequence) str2);
            outputStreamWriter.close();
            fileOutputStream.close();
            callback.invoke(null, "");
        } catch (Exception e) {
            e.printStackTrace();
            callback.invoke(0, null);
        }
    }

    @ReactMethod
    public void getItem(String str, String str2, ReadableMap readableMap, Callback callback) {
        if (readableMap.hasKey("useAndroidSharedPreferences") ? readableMap.getBoolean("useAndroidSharedPreferences") : false) {
            callback.invoke(null, getSharedPreferences(str2).getString(str, null));
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + str2 + "/data.json"))));
            String str3 = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str3 = str3 + readLine + "";
                } else {
                    bufferedReader.close();
                    callback.invoke(null, str3);
                    return;
                }
            }
        } catch (IOException unused) {
            callback.invoke(0, null);
        }
    }
}
