package com.reactnativecommunity.asyncstorage;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public class AsyncStorageErrorUtil {
    static WritableMap getError(@Nullable String key, String errorMessage) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", errorMessage);
        if (key != null) {
            createMap.putString(SDKConstants.PARAM_KEY, key);
        }
        return createMap;
    }

    static WritableMap getInvalidKeyError(@Nullable String key) {
        return getError(key, "Invalid key");
    }

    static WritableMap getInvalidValueError(@Nullable String key) {
        return getError(key, "Invalid Value");
    }

    static WritableMap getDBError(@Nullable String key) {
        return getError(key, "Database Error");
    }
}
