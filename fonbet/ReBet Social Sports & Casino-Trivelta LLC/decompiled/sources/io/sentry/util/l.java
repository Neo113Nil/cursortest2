package io.sentry.util;

import io.sentry.ILogger;

/* loaded from: classes3.dex */
public abstract class l {

    public interface a {
        void accept(Object obj);
    }

    public interface b {
        void a(Object obj, Class cls);
    }

    public static /* synthetic */ void b(Object obj, Class cls) {
    }

    public static io.sentry.J c(Object obj) {
        io.sentry.J j10 = new io.sentry.J();
        m(j10, obj);
        return j10;
    }

    public static io.sentry.hints.h d(io.sentry.J j10) {
        return (io.sentry.hints.h) j10.e("sentry:eventDropReason", io.sentry.hints.h.class);
    }

    public static Object e(io.sentry.J j10) {
        return j10.d("sentry:typeCheckHint");
    }

    public static boolean f(io.sentry.J j10, Class cls) {
        return cls.isInstance(e(j10));
    }

    public static boolean g(io.sentry.J j10) {
        return Boolean.TRUE.equals(j10.e("sentry:isFromHybridSdk", Boolean.class));
    }

    public static void h(io.sentry.J j10, Class cls, a aVar) {
        i(j10, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.l.b
            public final void a(Object obj, Class cls2) {
                l.b(obj, cls2);
            }
        });
    }

    public static void i(io.sentry.J j10, Class cls, a aVar, b bVar) {
        Object e10 = e(j10);
        if (!f(j10, cls) || e10 == null) {
            bVar.a(e10, cls);
        } else {
            aVar.accept(e10);
        }
    }

    public static void j(io.sentry.J j10, Class cls, final ILogger iLogger, a aVar) {
        i(j10, cls, aVar, new b() { // from class: io.sentry.util.k
            @Override // io.sentry.util.l.b
            public final void a(Object obj, Class cls2) {
                t.a(cls2, obj, ILogger.this);
            }
        });
    }

    public static void k(io.sentry.J j10, io.sentry.hints.h hVar) {
        j10.m("sentry:eventDropReason", hVar);
    }

    public static void l(io.sentry.J j10, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            j10.m("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void m(io.sentry.J j10, Object obj) {
        j10.m("sentry:typeCheckHint", obj);
    }

    public static boolean n(io.sentry.J j10) {
        return !(f(j10, io.sentry.hints.e.class) || f(j10, io.sentry.hints.c.class)) || f(j10, io.sentry.hints.b.class);
    }
}
