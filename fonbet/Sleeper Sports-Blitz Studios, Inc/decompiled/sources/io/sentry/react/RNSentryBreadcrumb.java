package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import java.util.Map;

/* loaded from: classes9.dex */
public final class RNSentryBreadcrumb {
    private RNSentryBreadcrumb() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    public static String getCurrentScreenFrom(ReadableMap readableMap) {
        String string = readableMap.hasKey("category") ? readableMap.getString("category") : null;
        if (string != null && "navigation".equals(string)) {
            ReadableMap map = readableMap.hasKey("data") ? readableMap.getMap("data") : null;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Breadcrumb fromMap(ReadableMap readableMap) {
        Breadcrumb breadcrumb = new Breadcrumb();
        if (readableMap.hasKey("message")) {
            breadcrumb.setMessage(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            breadcrumb.setType(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            breadcrumb.setCategory(readableMap.getString("category"));
        }
        if (readableMap.hasKey("origin")) {
            breadcrumb.setOrigin(readableMap.getString("origin"));
        } else {
            breadcrumb.setOrigin("react-native");
        }
        if (readableMap.hasKey("level")) {
            String string = readableMap.getString("level");
            switch (string.hashCode()) {
                case 3237038:
                    string.equals("info");
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
                case 95458899:
                    if (string.equals("debug")) {
                        breadcrumb.setLevel(SentryLevel.DEBUG);
                        break;
                    }
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
                case 96784904:
                    if (string.equals("error")) {
                        breadcrumb.setLevel(SentryLevel.ERROR);
                        break;
                    }
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
                case 97203460:
                    if (string.equals("fatal")) {
                        breadcrumb.setLevel(SentryLevel.FATAL);
                        break;
                    }
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
                case 1124446108:
                    if (string.equals("warning")) {
                        breadcrumb.setLevel(SentryLevel.WARNING);
                        break;
                    }
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
                default:
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
            }
        }
        if (readableMap.hasKey("data")) {
            for (Map.Entry<String, Object> entry : readableMap.getMap("data").toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    breadcrumb.setData(entry.getKey(), entry.getValue());
                }
            }
        }
        return breadcrumb;
    }
}
