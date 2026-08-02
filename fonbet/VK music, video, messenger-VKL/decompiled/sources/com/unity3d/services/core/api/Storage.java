package com.unity3d.services.core.api;

import com.unity3d.services.core.device.StorageError;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class Storage {
    public static void clear(String str, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else if (storage.clearStorage()) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_CLEAR_STORAGE, str);
        }
    }

    public static void delete(String str, String str2, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else if (storage.delete(str2)) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_DELETE_VALUE, str);
        }
    }

    public static void get(String str, String str2, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        Object obj = storage.get(str2);
        if (obj == null) {
            webViewCallback.error(StorageError.COULDNT_GET_VALUE, str2);
        } else {
            webViewCallback.invoke(obj);
        }
    }

    public static void getKeys(String str, String str2, Boolean bool, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        List<String> keys = storage.getKeys(str2, bool.booleanValue());
        if (keys != null) {
            webViewCallback.invoke(new JSONArray((Collection) keys));
        } else {
            webViewCallback.invoke(new JSONArray());
        }
    }

    private static com.unity3d.services.core.device.Storage getStorage(String str) {
        return StorageManager.getStorage(StorageManager.StorageType.valueOf(str));
    }

    public static void read(String str, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else {
            storage.readStorage();
            webViewCallback.invoke(str);
        }
    }

    public static void set(String str, String str2, Integer num, WebViewCallback webViewCallback) {
        set(str, str2, (Object) num, webViewCallback);
    }

    public static void write(String str, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else if (storage.writeStorage()) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_WRITE_STORAGE_TO_CACHE, str);
        }
    }

    public static void set(String str, String str2, Boolean bool, WebViewCallback webViewCallback) {
        set(str, str2, (Object) bool, webViewCallback);
    }

    public static void set(String str, String str2, Long l, WebViewCallback webViewCallback) {
        set(str, str2, (Object) l, webViewCallback);
    }

    public static void set(String str, String str2, Double d, WebViewCallback webViewCallback) {
        set(str, str2, (Object) d, webViewCallback);
    }

    public static void set(String str, String str2, String str3, WebViewCallback webViewCallback) {
        set(str, str2, (Object) str3, webViewCallback);
    }

    public static void set(String str, String str2, JSONObject jSONObject, WebViewCallback webViewCallback) {
        set(str, str2, (Object) jSONObject, webViewCallback);
    }

    public static void set(String str, String str2, JSONArray jSONArray, WebViewCallback webViewCallback) {
        set(str, str2, (Object) jSONArray, webViewCallback);
    }

    public static void set(String str, String str2, Object obj, WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.set(str2, obj)) {
                webViewCallback.invoke(str2);
                return;
            } else {
                webViewCallback.error(StorageError.COULDNT_SET_VALUE, str2);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
    }
}
