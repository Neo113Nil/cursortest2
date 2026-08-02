package io.sentry.android.core;

/* loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;

    /* renamed from: a, reason: collision with root package name */
    public final Thread f50671a;

    public ApplicationNotResponding(String str) {
        super(str);
        this.f50671a = null;
    }

    public Thread a() {
        return this.f50671a;
    }

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.w.c(thread, "Thread must be provided.");
        this.f50671a = thread2;
        setStackTrace(thread2.getStackTrace());
    }
}
