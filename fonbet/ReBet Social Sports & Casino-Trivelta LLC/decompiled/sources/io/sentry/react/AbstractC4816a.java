package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4779m;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.react.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4816a {
    public static C4744f a(ReadableMap readableMap, ILogger iLogger) {
        try {
            Map c10 = c(readableMap);
            Object obj = c10.get(EventKeys.TIMESTAMP);
            if (obj instanceof Number) {
                c10.put(EventKeys.TIMESTAMP, AbstractC4779m.g(new Date((long) (((Number) obj).doubleValue() * 1000.0d))));
            }
            C4744f a10 = new C4744f.a().a(new io.sentry.util.u(c10), iLogger);
            if (a10.m() == null) {
                a10.x(EnumC4788n3.INFO);
            }
            if (a10.p() == null) {
                a10.z("react-native");
            }
            return a10;
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Failed to deserialize breadcrumb from map.", e10);
            C4744f c4744f = new C4744f();
            c4744f.z("react-native");
            return c4744f;
        }
    }

    public static String b(ReadableMap readableMap) {
        String string = readableMap.hasKey("category") ? readableMap.getString("category") : null;
        if (string != null && "navigation".equals(string)) {
            ReadableMap map = readableMap.hasKey(EventKeys.DATA) ? readableMap.getMap(EventKeys.DATA) : null;
            if (map == null) {
                return null;
            }
            try {
                if (map.hasKey("to")) {
                    return map.getString("to");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map c(ReadableMap readableMap) {
        ReadableMap map;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (readableMap.getType(nextKey) == ReadableType.Map && (map = readableMap.getMap(nextKey)) != null) {
                hashMap.put(nextKey, c(map));
            }
        }
        return hashMap;
    }
}
