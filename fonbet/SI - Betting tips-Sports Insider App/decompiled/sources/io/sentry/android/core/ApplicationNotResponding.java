package io.sentry.android.core;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;

    /* renamed from: a, reason: collision with root package name */
    public final Thread f15482a;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        y4.a.C(thread, "Thread must be provided.");
        this.f15482a = thread;
        setStackTrace(thread.getStackTrace());
    }
}
