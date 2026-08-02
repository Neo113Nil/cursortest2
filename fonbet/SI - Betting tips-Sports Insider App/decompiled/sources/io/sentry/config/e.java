package io.sentry.config;

import io.sentry.util.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16296a;

    /* renamed from: b, reason: collision with root package name */
    public final Properties f16297b;

    public e(String str, Properties properties) {
        this.f16296a = str;
        y4.a.C(properties, "properties are required");
        this.f16297b = properties;
    }

    @Override // io.sentry.config.d
    public final Map a() {
        String l6 = d9.e.l(new StringBuilder(), this.f16296a, "tags.");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f16297b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(l6)) {
                    hashMap.put(str.substring(l6.length()), l.d((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return l.d(this.f16297b.getProperty(this.f16296a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
