package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.U0;
import io.sentry.android.core.AppState;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.B;
import io.sentry.util.C4843a;
import io.sentry.util.n;
import io.sentry.util.w;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class AnrProfilingIntegration implements InterfaceC4839u0, Closeable, AppState.a, Runnable {

    /* renamed from: h, reason: collision with root package name */
    public volatile e f50886h;

    /* renamed from: j, reason: collision with root package name */
    public volatile SentryAndroidOptions f50888j;

    /* renamed from: n, reason: collision with root package name */
    public volatile Handler f50892n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Thread f50893o;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f50879a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f50880b = new Runnable() { // from class: io.sentry.android.core.anr.g
        @Override // java.lang.Runnable
        public final void run() {
            AnrProfilingIntegration.r(AnrProfilingIntegration.this);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public final C4843a f50881c = new C4843a();

    /* renamed from: d, reason: collision with root package name */
    public final C4843a f50882d = new C4843a();

    /* renamed from: e, reason: collision with root package name */
    public volatile long f50883e = SystemClock.uptimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f50884f = new AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    public volatile a f50885g = a.IDLE;

    /* renamed from: i, reason: collision with root package name */
    public volatile ILogger f50887i = U0.e();

    /* renamed from: k, reason: collision with root package name */
    public volatile Thread f50889k = null;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f50890l = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f50891m = false;

    public enum a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    public static /* synthetic */ void B(AnrProfilingIntegration anrProfilingIntegration, e eVar) {
        anrProfilingIntegration.getClass();
        if (eVar == null) {
            return;
        }
        try {
            eVar.close();
        } catch (IOException unused) {
            anrProfilingIntegration.f50887i.c(EnumC4788n3.WARNING, "Failed to close AnrProfileManager", new Object[0]);
        }
    }

    public static /* synthetic */ void r(AnrProfilingIntegration anrProfilingIntegration) {
        anrProfilingIntegration.getClass();
        anrProfilingIntegration.f50883e = SystemClock.uptimeMillis();
    }

    public e A0() {
        InterfaceC4765j0 d10 = this.f50882d.d();
        try {
            if (this.f50886h == null) {
                F3 f32 = (F3) w.c(this.f50888j, "Options can't be null");
                String cacheDirPath = f32.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                this.f50886h = new e(f32, f.b(new File(cacheDirPath)));
            }
            e eVar = this.f50886h;
            if (d10 != null) {
                d10.close();
            }
            return eVar;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        this.f50888j = (SentryAndroidOptions) w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50887i = f32.getLogger();
        if (this.f50888j.isAnrProfilingEnabled()) {
            if (this.f50888j.getCacheDirPath() == null) {
                this.f50887i.c(EnumC4788n3.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.f50893o = mainLooper.getThread();
            this.f50892n = new Handler(mainLooper);
            n.a("AnrProfiling");
            AppState.w0().B(this);
        }
    }

    public final void U(i iVar) {
        if (this.f50879a.get()) {
            this.f50884f.incrementAndGet();
            A0().d(iVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50879a.set(false);
        AppState.w0().D0(this);
        Handler handler = this.f50892n;
        if (handler != null) {
            handler.removeCallbacks(this.f50880b);
        }
        Thread thread = this.f50889k;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f50888j;
        InterfaceC4765j0 d10 = this.f50882d.d();
        try {
            final e eVar = this.f50886h;
            this.f50886h = null;
            if (d10 != null) {
                d10.close();
            }
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.anr.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnrProfilingIntegration.B(AnrProfilingIntegration.this, eVar);
                        }
                    });
                } catch (Throwable unused) {
                    this.f50887i.c(EnumC4788n3.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public void d() {
        if (this.f50879a.get()) {
            InterfaceC4765j0 d10 = this.f50881c.d();
            try {
                if (this.f50891m) {
                    if (d10 != null) {
                        d10.close();
                        return;
                    }
                    return;
                }
                this.f50891m = true;
                this.f50880b.run();
                Thread thread = this.f50889k;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.f50889k = thread2;
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public void k() {
        if (this.f50879a.get()) {
            InterfaceC4765j0 d10 = this.f50881c.d();
            try {
                this.f50891m = false;
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.f50892n;
        Thread thread = this.f50893o;
        if (handler == null || thread == null) {
            return;
        }
        while (this.f50879a.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.f50891m) {
                        w0(thread);
                        handler.removeCallbacks(this.f50880b);
                        handler.post(this.f50880b);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.f50891m && this.f50879a.get()) {
                                try {
                                    wait();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        this.f50880b.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th3) {
                this.f50887i.b(EnumC4788n3.WARNING, "Failed to execute AnrStacktraceIntegration", th3);
                return;
            }
        }
    }

    public void w0(Thread thread) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f50883e;
        if (uptimeMillis < 1000) {
            this.f50885g = a.IDLE;
            this.f50890l = false;
        }
        if (this.f50885g == a.IDLE && uptimeMillis > 1000) {
            ILogger iLogger = this.f50887i;
            EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
            if (iLogger.d(enumC4788n3)) {
                this.f50887i.c(enumC4788n3, "ANR: main thread is suspicious", new Object[0]);
            }
            this.f50885g = a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.f50888j;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && B.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.f50890l = true;
            }
            if (this.f50890l) {
                z0();
            }
        }
        if (this.f50890l && (this.f50885g == a.SUSPICIOUS || this.f50885g == a.ANR_DETECTED)) {
            if (this.f50884f.get() < 151) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                i iVar = new i(System.currentTimeMillis(), thread.getStackTrace());
                long uptimeMillis3 = SystemClock.uptimeMillis() - uptimeMillis2;
                ILogger iLogger2 = this.f50887i;
                EnumC4788n3 enumC4788n32 = EnumC4788n3.DEBUG;
                if (iLogger2.d(enumC4788n32)) {
                    this.f50887i.c(enumC4788n32, "AnrWatchdog: capturing main thread stacktrace took " + uptimeMillis3 + "ms", new Object[0]);
                }
                U(iVar);
            } else {
                ILogger iLogger3 = this.f50887i;
                EnumC4788n3 enumC4788n33 = EnumC4788n3.DEBUG;
                if (iLogger3.d(enumC4788n33)) {
                    this.f50887i.c(enumC4788n33, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.f50885g != a.SUSPICIOUS || uptimeMillis <= 4000) {
            return;
        }
        ILogger iLogger4 = this.f50887i;
        EnumC4788n3 enumC4788n34 = EnumC4788n3.DEBUG;
        if (iLogger4.d(enumC4788n34)) {
            this.f50887i.c(enumC4788n34, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.f50885g = a.ANR_DETECTED;
    }

    public final void z0() {
        this.f50884f.set(0);
        A0().k();
    }
}
