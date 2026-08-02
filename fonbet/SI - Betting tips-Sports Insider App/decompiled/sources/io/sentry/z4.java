package io.sentry;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z4 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile z4 f17271c;

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.util.a f17272d = new io.sentry.util.a();

    /* renamed from: e, reason: collision with root package name */
    public static volatile Boolean f17273e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final io.sentry.util.a f17274f = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f17275a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f17276b = new CopyOnWriteArraySet();

    public static z4 d() {
        if (f17271c == null) {
            r a7 = f17272d.a();
            try {
                if (f17271c == null) {
                    f17271c = new z4();
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f17271c;
    }

    public final void a(String str) {
        y4.a.C(str, "integration is required.");
        this.f17275a.add(str);
    }

    public final void b(String str, String str2) {
        this.f17276b.add(new io.sentry.protocol.w(str, str2));
        r a7 = f17274f.a();
        try {
            f17273e = null;
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean c(ILogger iLogger) {
        Boolean bool = f17273e;
        if (bool != null) {
            return bool.booleanValue();
        }
        r a7 = f17274f.a();
        try {
            Iterator it = this.f17276b.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
                if (wVar.f16924a.startsWith("maven:io.sentry:") && !"8.30.0".equalsIgnoreCase(wVar.f16925b)) {
                    iLogger.h(b5.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", wVar.f16924a, "8.30.0", wVar.f16925b);
                    z5 = true;
                }
            }
            if (z5) {
                b5 b5Var = b5.ERROR;
                iLogger.h(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.h(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.h(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.h(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f17273e = Boolean.valueOf(z5);
            a7.close();
            return z5;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
