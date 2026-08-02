package io.sentry.util;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.util.p;

/* loaded from: classes3.dex */
public class s {
    public boolean c(String str, ILogger iLogger) {
        return h(str, iLogger, false) != null;
    }

    public boolean d(String str, F3 f32) {
        return c(str, f32 != null ? f32.getLogger() : null);
    }

    public p e(final String str, final ILogger iLogger) {
        return new p(new p.a() { // from class: io.sentry.util.r
            @Override // io.sentry.util.p.a
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(s.this.c(str, iLogger));
                return valueOf;
            }
        });
    }

    public p f(final String str, final F3 f32) {
        return new p(new p.a() { // from class: io.sentry.util.q
            @Override // io.sentry.util.p.a
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(s.this.d(str, f32));
                return valueOf;
            }
        });
    }

    public Class g(String str, ILogger iLogger) {
        return h(str, iLogger, true);
    }

    public final Class h(String str, ILogger iLogger, boolean z10) {
        try {
            return Class.forName(str, z10, s.class.getClassLoader());
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(EnumC4788n3.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC4788n3.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC4788n3.ERROR, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
