package com.google.zxing;

/* loaded from: classes3.dex */
public abstract class f extends Exception {
    protected static final StackTraceElement[] NO_TRACE;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f38415a;

    static {
        f38415a = System.getProperty("surefire.test.class.path") != null;
        NO_TRACE = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
