package io.sentry.clientreport;

import io.sentry.EnumC7161k;
import io.sentry.util.l;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l.a {
    @Override // io.sentry.util.l.a
    public final Object g() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : f.values()) {
            for (EnumC7161k enumC7161k : EnumC7161k.values()) {
                concurrentHashMap.put(new d(fVar.getReason(), enumC7161k.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }
}
