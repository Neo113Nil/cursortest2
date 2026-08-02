package io.sentry.config;

import C.o0;
import io.sentry.util.w;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class d implements f {
    @NotNull
    private static String g(@NotNull String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.f
    public final String f(@NotNull String str) {
        return w.d(System.getenv(g(str)));
    }

    @Override // io.sentry.config.f
    @NotNull
    public final Map getMap() {
        String d11;
        String c11 = o0.c(new StringBuilder(), g("tags"), "_");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(c11) && (d11 = w.d(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(c11.length()).toLowerCase(Locale.ROOT), d11);
            }
        }
        return concurrentHashMap;
    }
}
