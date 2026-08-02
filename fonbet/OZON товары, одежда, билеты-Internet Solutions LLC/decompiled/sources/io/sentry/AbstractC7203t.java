package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC7203t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A1 f68486a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f68487b;

    /* renamed from: c, reason: collision with root package name */
    private final long f68488c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<String> f68489d;

    /* renamed from: io.sentry.t$a */
    private static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.o, io.sentry.hints.i, io.sentry.hints.g {

        /* renamed from: a, reason: collision with root package name */
        boolean f68490a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f68491b = false;

        /* renamed from: c, reason: collision with root package name */
        private final CountDownLatch f68492c = new CountDownLatch(1);

        /* renamed from: d, reason: collision with root package name */
        private final long f68493d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ILogger f68494e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f68495f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final Queue<String> f68496g;

        public a(long j11, @NotNull ILogger iLogger, @NotNull String str, @NotNull Queue<String> queue) {
            this.f68493d = j11;
            this.f68495f = str;
            this.f68496g = queue;
            this.f68494e = iLogger;
        }

        @Override // io.sentry.hints.g
        public final void a() {
            this.f68496g.add(this.f68495f);
        }

        @Override // io.sentry.hints.o
        public final boolean b() {
            return this.f68491b;
        }

        @Override // io.sentry.hints.l
        public final boolean c() {
            return this.f68490a;
        }

        @Override // io.sentry.hints.o
        public final void d(boolean z11) {
            this.f68491b = z11;
            this.f68492c.countDown();
        }

        @Override // io.sentry.hints.l
        public final void e(boolean z11) {
            this.f68490a = z11;
        }

        @Override // io.sentry.hints.i
        public final boolean h() {
            try {
                return this.f68492c.await(this.f68493d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f68494e.a(I2.ERROR, "Exception while awaiting on lock.", e11);
                return false;
            }
        }
    }

    AbstractC7203t(@NotNull A1 a12, @NotNull ILogger iLogger, long j11, int i11) {
        this.f68486a = a12;
        this.f68487b = iLogger;
        this.f68488c = j11;
        this.f68489d = o3.a(new C7145g(i11));
    }

    protected abstract boolean a(String str);

    public void b(@NotNull File file) {
        ILogger iLogger = this.f68487b;
        try {
            I2 i22 = I2.DEBUG;
            iLogger.c(i22, "Processing dir. %s", file.getAbsolutePath());
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.s
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return AbstractC7203t.this.a(str);
                }
            });
            if (listFiles == null) {
                iLogger.c(I2.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            iLogger.c(i22, "Processing %d items from cache dir %s", Integer.valueOf(listFiles.length), file.getAbsolutePath());
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    Queue<String> queue = this.f68489d;
                    if (((o3) queue).contains(absolutePath)) {
                        iLogger.c(I2.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.m h11 = this.f68486a.h();
                        if (h11 != null && h11.m(EnumC7161k.All)) {
                            iLogger.c(I2.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            iLogger.c(I2.DEBUG, "Processing file: %s", absolutePath);
                            c(file2, io.sentry.util.h.a(new a(this.f68488c, this.f68487b, absolutePath, queue)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    iLogger.c(I2.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            iLogger.b(I2.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void c(@NotNull File file, @NotNull E e11);
}
