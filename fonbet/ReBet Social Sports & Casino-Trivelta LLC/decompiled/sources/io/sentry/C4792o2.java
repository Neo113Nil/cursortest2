package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4792o2 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f52232a;

    public C4792o2(Map map) {
        this.f52232a = map;
    }

    public static C4792o2 b(Map map) {
        if (map == null) {
            return new C4792o2(new ConcurrentHashMap());
        }
        C4792o2 c4792o2 = new C4792o2(new ConcurrentHashMap(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                c4792o2.a(C4782m2.b(str, entry.getValue()));
            }
        }
        return c4792o2;
    }

    public void a(C4782m2 c4782m2) {
        if (c4782m2 == null) {
            return;
        }
        this.f52232a.put(c4782m2.a(), c4782m2);
    }

    public Map c() {
        return this.f52232a;
    }
}
