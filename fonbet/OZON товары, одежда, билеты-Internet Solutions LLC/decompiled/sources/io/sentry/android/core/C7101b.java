package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.A1;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.android.core.AnrIntegration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7101b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f67045a;

    /* renamed from: b, reason: collision with root package name */
    private final A f67046b;

    /* renamed from: c, reason: collision with root package name */
    private final Z f67047c;

    /* renamed from: d, reason: collision with root package name */
    private final D3.g f67048d;

    /* renamed from: e, reason: collision with root package name */
    private long f67049e;

    /* renamed from: f, reason: collision with root package name */
    private final long f67050f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ILogger f67051g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f67052h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f67053i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Context f67054j;

    /* renamed from: k, reason: collision with root package name */
    private final RunnableC7100a f67055k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7101b(long j11, boolean z11, @NotNull A a11, @NotNull ILogger iLogger, @NotNull Context context) {
        super("|ANR-WatchDog|");
        D3.g gVar = new D3.g();
        Z z12 = new Z();
        this.f67052h = 0L;
        this.f67053i = new AtomicBoolean(false);
        this.f67048d = gVar;
        this.f67050f = j11;
        this.f67049e = 500L;
        this.f67045a = z11;
        this.f67046b = a11;
        this.f67051g = iLogger;
        this.f67047c = z12;
        this.f67054j = context;
        this.f67055k = new RunnableC7100a(this, gVar);
        if (j11 < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    public static void a(C7101b c7101b, D3.g gVar) {
        c7101b.getClass();
        c7101b.f67052h = SystemClock.uptimeMillis();
        c7101b.f67053i.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        this.f67055k.run();
        while (!isInterrupted()) {
            this.f67047c.b(this.f67055k);
            try {
                Thread.sleep(this.f67049e);
                this.f67048d.getClass();
                if (SystemClock.uptimeMillis() - this.f67052h > this.f67050f) {
                    if (this.f67045a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.f67054j.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                list = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f67051g.a(I2.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                                list = null;
                            }
                            if (list != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = list.iterator();
                                while (it.hasNext()) {
                                    if (it.next().condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.f67053i.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(P4.f.a(this.f67050f, " ms.", new StringBuilder("Application Not Responding for at least ")), this.f67047c.a());
                            A a11 = this.f67046b;
                            a11.getClass();
                            io.sentry.util.a aVar = AnrIntegration.f66854f;
                            ((AnrIntegration) a11.f66827a).getClass();
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) a11.f66829c;
                            sentryAndroidOptions.getLogger().c(I2.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean equals = Boolean.TRUE.equals(F.o().p());
                            String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (equals) {
                                str = Nk.a.b("Background ", str);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
                            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
                            lVar.r("ANR");
                            C7230z2 c7230z2 = new C7230z2(new io.sentry.exception.a(lVar, applicationNotResponding2, applicationNotResponding2.a(), true));
                            c7230z2.z0(I2.ERROR);
                            ((A1) a11.f66828b).z(c7230z2, io.sentry.util.h.a(new AnrIntegration.a(equals)));
                        }
                    } else {
                        this.f67051g.c(I2.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f67053i.set(true);
                    }
                }
            } catch (InterruptedException e11) {
                try {
                    Thread.currentThread().interrupt();
                    this.f67051g.c(I2.WARNING, "Interrupted: %s", e11.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f67051g.c(I2.WARNING, "Failed to interrupt due to SecurityException: %s", e11.getMessage());
                    return;
                }
            }
        }
    }
}
