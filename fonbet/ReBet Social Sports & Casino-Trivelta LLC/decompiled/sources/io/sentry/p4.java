package io.sentry;

import java.lang.Thread;

/* loaded from: classes3.dex */
public interface p4 {

    public static final class a implements p4 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52257a = new a();

        public static p4 c() {
            return f52257a;
        }

        @Override // io.sentry.p4
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.p4
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
