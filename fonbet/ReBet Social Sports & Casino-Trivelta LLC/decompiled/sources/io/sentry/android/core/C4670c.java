package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4670c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50922a;

    /* renamed from: b, reason: collision with root package name */
    public final a f50923b;

    /* renamed from: c, reason: collision with root package name */
    public final L0 f50924c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.transport.o f50925d;

    /* renamed from: e, reason: collision with root package name */
    public long f50926e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50927f;

    /* renamed from: g, reason: collision with root package name */
    public final ILogger f50928g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f50929h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f50930i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f50931j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f50932k;

    /* renamed from: io.sentry.android.core.c$a */
    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    public C4670c(long j10, boolean z10, a aVar, ILogger iLogger, Context context) {
        this(new io.sentry.transport.o() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.o
            public final long a() {
                long uptimeMillis;
                uptimeMillis = SystemClock.uptimeMillis();
                return uptimeMillis;
            }
        }, j10, 500L, z10, aVar, iLogger, new L0(), context);
    }

    public static /* synthetic */ void a(C4670c c4670c, io.sentry.transport.o oVar) {
        c4670c.getClass();
        c4670c.f50929h = oVar.a();
        c4670c.f50930i.set(false);
    }

    public final boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        ActivityManager activityManager = (ActivityManager) this.f50931j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            list = activityManager.getProcessesInErrorState();
        } catch (Throwable th2) {
            this.f50928g.b(EnumC4788n3.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f50932k.run();
        while (!isInterrupted()) {
            this.f50924c.b(this.f50932k);
            try {
                Thread.sleep(this.f50926e);
                if (this.f50925d.a() - this.f50929h > this.f50927f) {
                    if (!this.f50922a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f50928g.c(EnumC4788n3.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f50930i.set(true);
                    } else if (c() && this.f50930i.compareAndSet(false, true)) {
                        this.f50923b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f50927f + " ms.", this.f50924c.a()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f50928g.c(EnumC4788n3.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f50928g.c(EnumC4788n3.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }

    public C4670c(final io.sentry.transport.o oVar, long j10, long j11, boolean z10, a aVar, ILogger iLogger, L0 l02, Context context) {
        super("|ANR-WatchDog|");
        this.f50929h = 0L;
        this.f50930i = new AtomicBoolean(false);
        this.f50925d = oVar;
        this.f50927f = j10;
        this.f50926e = j11;
        this.f50922a = z10;
        this.f50923b = aVar;
        this.f50928g = iLogger;
        this.f50924c = l02;
        this.f50931j = context;
        this.f50932k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                C4670c.a(C4670c.this, oVar);
            }
        };
        if (j10 < this.f50926e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f50926e * 2)));
        }
    }
}
