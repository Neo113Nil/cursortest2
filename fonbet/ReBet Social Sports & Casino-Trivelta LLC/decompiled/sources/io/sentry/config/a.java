package io.sentry.config;

import io.sentry.util.D;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f51996a;

    /* renamed from: b, reason: collision with root package name */
    public final Properties f51997b;

    public a(String str, Properties properties) {
        this.f51996a = (String) w.c(str, "prefix is required");
        this.f51997b = (Properties) w.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        String str2 = this.f51996a + str + ".";
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f51997b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    hashMap.put(str3.substring(str2.length()), D.i((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        return D.i(this.f51997b.getProperty(this.f51996a + str), "\"");
    }

    public a(Properties properties) {
        this("", properties);
    }
}
