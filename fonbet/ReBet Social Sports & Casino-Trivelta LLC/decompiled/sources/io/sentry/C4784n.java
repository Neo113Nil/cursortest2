package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4784n implements D {

    /* renamed from: a, reason: collision with root package name */
    public final Map f52213a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    public final F3 f52214b;

    public C4784n(F3 f32) {
        this.f52214b = f32;
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, J j10) {
        String k10;
        Long j11;
        if (!io.sentry.util.l.f(j10, UncaughtExceptionHandlerIntegration.a.class)) {
            return c4733c3;
        }
        io.sentry.protocol.t x02 = c4733c3.x0();
        if (x02 == null || (k10 = x02.k()) == null || (j11 = x02.j()) == null) {
            return c4733c3;
        }
        Long l10 = (Long) this.f52213a.get(k10);
        if (l10 == null || l10.equals(j11)) {
            this.f52213a.put(k10, j11);
            return c4733c3;
        }
        this.f52214b.getLogger().c(EnumC4788n3.INFO, "Event %s has been dropped due to multi-threaded deduplication", c4733c3.G());
        io.sentry.util.l.k(j10, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
