package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4838u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4740e0 f52766a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f52767b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52768c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f52769d;

    /* renamed from: io.sentry.u$a */
    public static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.g {

        /* renamed from: a, reason: collision with root package name */
        public boolean f52770a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f52771b = false;

        /* renamed from: c, reason: collision with root package name */
        public final CountDownLatch f52772c = new CountDownLatch(1);

        /* renamed from: d, reason: collision with root package name */
        public final long f52773d;

        /* renamed from: e, reason: collision with root package name */
        public final ILogger f52774e;

        /* renamed from: f, reason: collision with root package name */
        public final String f52775f;

        /* renamed from: g, reason: collision with root package name */
        public final Queue f52776g;

        public a(long j10, ILogger iLogger, String str, Queue queue) {
            this.f52773d = j10;
            this.f52775f = str;
            this.f52776g = queue;
            this.f52774e = iLogger;
        }

        @Override // io.sentry.hints.l
        public boolean a() {
            return this.f52770a;
        }

        @Override // io.sentry.hints.g
        public void b() {
            this.f52776g.add(this.f52775f);
        }

        @Override // io.sentry.hints.q
        public void c(boolean z10) {
            this.f52771b = z10;
            this.f52772c.countDown();
        }

        @Override // io.sentry.hints.l
        public void d(boolean z10) {
            this.f52770a = z10;
        }

        @Override // io.sentry.hints.q
        public boolean e() {
            return this.f52771b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f52772c.await(this.f52773d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f52774e.b(EnumC4788n3.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }
    }

    public AbstractC4838u(InterfaceC4740e0 interfaceC4740e0, ILogger iLogger, long j10, int i10) {
        this.f52766a = interfaceC4740e0;
        this.f52767b = iLogger;
        this.f52768c = j10;
        this.f52769d = h4.c(new C4749g(i10));
    }

    public abstract boolean c(String str);

    public void d(File file) {
        try {
            ILogger iLogger = this.f52767b;
            EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
            iLogger.c(enumC4788n3, "Processing dir. %s", file.getAbsolutePath());
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.t
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    boolean c10;
                    c10 = AbstractC4838u.this.c(str);
                    return c10;
                }
            });
            if (listFiles == null) {
                this.f52767b.c(EnumC4788n3.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            this.f52767b.c(enumC4788n3, "Processing %d items from cache dir %s", Integer.valueOf(listFiles.length), file.getAbsolutePath());
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f52769d.contains(absolutePath)) {
                        this.f52767b.c(EnumC4788n3.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.z e10 = this.f52766a.e();
                        if (e10 != null && e10.A0(EnumC4774l.All)) {
                            this.f52767b.c(EnumC4788n3.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f52767b.c(EnumC4788n3.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.l.c(new a(this.f52768c, this.f52767b, absolutePath, this.f52769d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f52767b.c(EnumC4788n3.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            this.f52767b.a(EnumC4788n3.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    public abstract void e(File file, J j10);
}
