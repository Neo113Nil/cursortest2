package io.sentry.exception;

/* loaded from: classes3.dex */
public final class b extends Exception {
    private static final long serialVersionUID = -8353316997083420940L;

    /* renamed from: a, reason: collision with root package name */
    public final String f52038a;

    public b(String str) {
        this(str, null);
    }

    public b(String str, Throwable th2) {
        super("sentry-trace header does not conform to expected format: " + str, th2);
        this.f52038a = str;
    }
}
