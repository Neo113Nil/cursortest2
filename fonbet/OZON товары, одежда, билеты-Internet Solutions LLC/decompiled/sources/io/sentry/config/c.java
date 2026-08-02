package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f67843a;

    public c(@NotNull ArrayList arrayList) {
        this.f67843a = arrayList;
    }

    @Override // io.sentry.config.f
    public final String f(@NotNull String str) {
        Iterator it = this.f67843a.iterator();
        while (it.hasNext()) {
            String f7 = ((f) it.next()).f(str);
            if (f7 != null) {
                return f7;
            }
        }
        return null;
    }

    @Override // io.sentry.config.f
    @NotNull
    public final Map getMap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f67843a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((f) it.next()).getMap());
        }
        return concurrentHashMap;
    }
}
