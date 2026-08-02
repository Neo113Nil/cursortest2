package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class h implements io.sentry.transport.o {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.transport.o f51132a = new h();

    public static io.sentry.transport.o b() {
        return f51132a;
    }

    @Override // io.sentry.transport.o
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
