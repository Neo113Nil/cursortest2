package kb;

import java.util.Map;

/* renamed from: kb.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5235u {

    /* renamed from: a, reason: collision with root package name */
    public String f54413a;

    /* renamed from: b, reason: collision with root package name */
    public Map f54414b;

    public C5235u(String str, Map map) {
        this.f54413a = str;
        this.f54414b = map;
    }

    public long a() {
        return g("auth_time");
    }

    public Map b() {
        return this.f54414b;
    }

    public long c() {
        return g("exp");
    }

    public long d() {
        return g("iat");
    }

    public String e() {
        Map map = (Map) this.f54414b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        return this.f54413a;
    }

    public final long g(String str) {
        Integer num = (Integer) this.f54414b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
