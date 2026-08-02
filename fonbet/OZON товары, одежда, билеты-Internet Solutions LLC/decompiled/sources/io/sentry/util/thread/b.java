package io.sentry.util.thread;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f68598a = new b();

    public static b d() {
        return f68598a;
    }

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        return false;
    }

    @Override // io.sentry.util.thread.a
    @NotNull
    public final String b() {
        return "";
    }

    @Override // io.sentry.util.thread.a
    public final long c() {
        return 0L;
    }
}
