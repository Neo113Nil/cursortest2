package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class FileObserverC4717x0 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final String f51334a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.U f51335b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f51336c;

    /* renamed from: d, reason: collision with root package name */
    public final long f51337d;

    /* renamed from: io.sentry.android.core.x0$a */
    public static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.k {

        /* renamed from: a, reason: collision with root package name */
        public boolean f51338a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f51339b;

        /* renamed from: c, reason: collision with root package name */
        public CountDownLatch f51340c;

        /* renamed from: d, reason: collision with root package name */
        public final long f51341d;

        /* renamed from: e, reason: collision with root package name */
        public final ILogger f51342e;

        public a(long j10, ILogger iLogger) {
            reset();
            this.f51341d = j10;
            this.f51342e = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.l
        public boolean a() {
            return this.f51338a;
        }

        @Override // io.sentry.hints.q
        public void c(boolean z10) {
            this.f51339b = z10;
            this.f51340c.countDown();
        }

        @Override // io.sentry.hints.l
        public void d(boolean z10) {
            this.f51338a = z10;
        }

        @Override // io.sentry.hints.q
        public boolean e() {
            return this.f51339b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f51340c.await(this.f51341d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f51342e.b(EnumC4788n3.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.k
        public void reset() {
            this.f51340c = new CountDownLatch(1);
            this.f51338a = false;
            this.f51339b = false;
        }
    }

    public FileObserverC4717x0(String str, io.sentry.U u10, ILogger iLogger, long j10) {
        super(str);
        this.f51334a = str;
        this.f51335b = (io.sentry.U) io.sentry.util.w.c(u10, "Envelope sender is required.");
        this.f51336c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
        this.f51337d = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.f51336c.c(EnumC4788n3.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.f51334a, str);
        io.sentry.J c10 = io.sentry.util.l.c(new a(this.f51337d, this.f51336c));
        this.f51335b.a(this.f51334a + File.separator + str, c10);
    }
}
