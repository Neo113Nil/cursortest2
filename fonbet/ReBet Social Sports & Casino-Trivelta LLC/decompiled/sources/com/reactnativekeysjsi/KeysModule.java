package com.reactnativekeysjsi;

import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class KeysModule extends KeysSpec {
    public static final String NAME = "Keys";
    public static ReactApplicationContext reactContext;

    static {
        System.loadLibrary("react-native-keys");
    }

    public KeysModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactContext = reactApplicationContext;
    }

    public static native String getJniJsonStringifyData(String str);

    public static String getSecureFor(String str) {
        try {
            JSONObject jSONObject = new JSONObject(getJniJsonStringifyData(c.f41411a));
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private native void nativeInstall(long j10);

    @Override // com.reactnativekeysjsi.NativeKeysSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "Keys";
    }

    public Map<String, Object> getPublicKeys() {
        String packageName;
        HashMap hashMap = new HashMap();
        try {
            try {
                packageName = reactContext.getString(reactContext.getResources().getIdentifier("build_config_package", "string", reactContext.getPackageName()));
            } catch (Resources.NotFoundException unused) {
                packageName = reactContext.getPackageName();
            }
            for (Field field : Class.forName(packageName + ".BuildConfig").getDeclaredFields()) {
                try {
                    hashMap.put(field.getName(), field.get(null));
                } catch (IllegalAccessException unused2) {
                    field.getName();
                }
            }
        } catch (ClassNotFoundException unused3) {
        }
        return hashMap;
    }

    @Override // com.reactnativekeysjsi.NativeKeysSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        try {
            nativeInstall(reactContext.getJavaScriptContextHolder().getContext());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
