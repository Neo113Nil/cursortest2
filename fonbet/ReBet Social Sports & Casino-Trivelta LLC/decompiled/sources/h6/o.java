package h6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f47796a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final String f47797b = o.class.getName();

    public static final synchronized void a(C4474a accessTokenAppIdPair, C4472H appEvents) {
        synchronized (o.class) {
            if (Y7.a.d(o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                p6.g.b();
                C4471G a10 = C4480g.a();
                a10.a(accessTokenAppIdPair, appEvents.d());
                C4480g.b(a10);
            } catch (Throwable th2) {
                Y7.a.b(th2, o.class);
            }
        }
    }

    public static final synchronized void b(C4479f eventsToPersist) {
        synchronized (o.class) {
            if (Y7.a.d(o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                p6.g.b();
                C4471G a10 = C4480g.a();
                for (C4474a c4474a : eventsToPersist.f()) {
                    C4472H c10 = eventsToPersist.c(c4474a);
                    if (c10 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    a10.a(c4474a, c10.d());
                }
                C4480g.b(a10);
            } catch (Throwable th2) {
                Y7.a.b(th2, o.class);
            }
        }
    }
}
