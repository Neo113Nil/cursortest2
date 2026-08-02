package io.sentry.android.core;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Thread f66879a;

    ApplicationNotResponding(String str, @NotNull Thread thread) {
        super(str);
        io.sentry.util.p.b(thread, "Thread must be provided.");
        this.f66879a = thread;
        setStackTrace(thread.getStackTrace());
    }

    @NotNull
    public final Thread a() {
        return this.f66879a;
    }
}
