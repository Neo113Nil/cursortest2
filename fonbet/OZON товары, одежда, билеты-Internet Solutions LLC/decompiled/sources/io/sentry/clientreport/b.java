package io.sentry.clientreport;

import io.sentry.util.l;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l<Map<d, AtomicLong>> f67826a = new l<>(new a());

    public final void a(d dVar, Long l11) {
        AtomicLong atomicLong = this.f67826a.a().get(dVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l11.longValue());
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<d, AtomicLong> entry : this.f67826a.a().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long valueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new g(entry.getKey().b(), entry.getKey().a(), valueOf));
            }
        }
        return arrayList;
    }
}
