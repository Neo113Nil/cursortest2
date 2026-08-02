package io.sentry.config;

import C.o0;
import io.sentry.util.p;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Properties f67839b;

    protected a(@NotNull String str, @NotNull Properties properties) {
        this.f67838a = str;
        p.b(properties, "properties are required");
        this.f67839b = properties;
    }

    @Override // io.sentry.config.f
    public final String f(@NotNull String str) {
        return w.d(this.f67839b.getProperty(o0.c(new StringBuilder(), this.f67838a, str)));
    }

    @Override // io.sentry.config.f
    @NotNull
    public final Map getMap() {
        String c11 = o0.c(new StringBuilder(), this.f67838a, "tags.");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f67839b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(c11)) {
                    hashMap.put(str.substring(c11.length()), w.d((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }
}
