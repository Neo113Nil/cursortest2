package io.sentry.util;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;

/* loaded from: classes3.dex */
public abstract class t {
    public static void a(Class cls, Object obj, ILogger iLogger) {
        iLogger.c(EnumC4788n3.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
