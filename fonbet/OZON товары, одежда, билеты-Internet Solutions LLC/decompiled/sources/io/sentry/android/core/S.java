package io.sentry.android.core;

import Ij.C3261b;
import android.os.FileObserver;
import io.sentry.C7139e1;
import io.sentry.I2;
import io.sentry.ILogger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class S extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    private final String f66961a;

    /* renamed from: b, reason: collision with root package name */
    private final C7139e1 f66962b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f66963c;

    /* renamed from: d, reason: collision with root package name */
    private final long f66964d;

    /* loaded from: classes10.dex */
    private static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.o, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.k {

        /* renamed from: a, reason: collision with root package name */
        boolean f66965a;

        /* renamed from: b, reason: collision with root package name */
        boolean f66966b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private CountDownLatch f66967c;

        /* renamed from: d, reason: collision with root package name */
        private final long f66968d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ILogger f66969e;

        public a(long j11, @NotNull ILogger iLogger) {
            reset();
            this.f66968d = j11;
            io.sentry.util.p.b(iLogger, "ILogger is required.");
            this.f66969e = iLogger;
        }

        @Override // io.sentry.hints.o
        public final boolean b() {
            return this.f66966b;
        }

        @Override // io.sentry.hints.l
        public final boolean c() {
            return this.f66965a;
        }

        @Override // io.sentry.hints.o
        public final void d(boolean z11) {
            this.f66966b = z11;
            this.f66967c.countDown();
        }

        @Override // io.sentry.hints.l
        public final void e(boolean z11) {
            this.f66965a = z11;
        }

        @Override // io.sentry.hints.i
        public final boolean h() {
            try {
                return this.f66967c.await(this.f66968d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f66969e.a(I2.ERROR, "Exception while awaiting on lock.", e11);
                return false;
            }
        }

        @Override // io.sentry.hints.k
        public final void reset() {
            this.f66967c = new CountDownLatch(1);
            this.f66965a = false;
            this.f66966b = false;
        }
    }

    S(String str, C7139e1 c7139e1, @NotNull ILogger iLogger, long j11) {
        super(str);
        this.f66961a = str;
        this.f66962b = c7139e1;
        io.sentry.util.p.b(iLogger, "Logger is required.");
        this.f66963c = iLogger;
        this.f66964d = j11;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i11, String str) {
        if (str == null || i11 != 8) {
            return;
        }
        I2 i22 = I2.DEBUG;
        Integer valueOf = Integer.valueOf(i11);
        String str2 = this.f66961a;
        ILogger iLogger = this.f66963c;
        iLogger.c(i22, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", valueOf, str2, str);
        io.sentry.E a11 = io.sentry.util.h.a(new a(this.f66964d, iLogger));
        this.f66962b.g(C.o0.c(C3261b.e(str2), File.separator, str), a11);
    }
}
