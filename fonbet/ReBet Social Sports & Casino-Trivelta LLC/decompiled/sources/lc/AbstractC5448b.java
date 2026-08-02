package lc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: lc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5448b {
    public static WritableMap a(String str) {
        return b(str, "Database Error");
    }

    public static WritableMap b(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    public static WritableMap c(String str) {
        return b(str, "Invalid key");
    }

    public static WritableMap d(String str) {
        return b(str, "Invalid Value");
    }
}
