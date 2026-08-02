package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.impl.ap;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.d4;
import io.sentry.t4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15526a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.g f15527b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f15528c;

    /* renamed from: d, reason: collision with root package name */
    public final ap f15529d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15530e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15531f;

    /* renamed from: g, reason: collision with root package name */
    public final ILogger f15532g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f15533h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f15534i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final aa.c f15535k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j, boolean z5, com.google.firebase.messaging.g gVar, ILogger iLogger, Context context) {
        super("|ANR-WatchDog|");
        ap apVar = new ap(15);
        n0 n0Var = new n0();
        this.f15533h = 0L;
        this.f15534i = new AtomicBoolean(false);
        this.f15529d = apVar;
        this.f15531f = j;
        this.f15530e = 500L;
        this.f15526a = z5;
        this.f15527b = gVar;
        this.f15532g = iLogger;
        this.f15528c = n0Var;
        this.j = context;
        this.f15535k = new aa.c(this, apVar);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        this.f15535k.run();
        while (!isInterrupted()) {
            ((Handler) this.f15528c.f15782a).post(this.f15535k);
            try {
                Thread.sleep(this.f15530e);
                this.f15529d.getClass();
                if (SystemClock.uptimeMillis() - this.f15533h > this.f15531f) {
                    if (this.f15526a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.j.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                list = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f15532g.e(b5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
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
                        if (this.f15534i.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding("Application Not Responding for at least " + this.f15531f + " ms.", ((Handler) this.f15528c.f15782a).getLooper().getThread());
                            com.google.firebase.messaging.g gVar = this.f15527b;
                            Object obj = gVar.f6125b;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) gVar.f6126c;
                            a aVar = AnrIntegration.f15465e;
                            sentryAndroidOptions.getLogger().h(b5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean equals = Boolean.TRUE.equals(h0.f15617e.f15621d);
                            String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (equals) {
                                str = androidx.appcompat.widget.c1.m("Background ", str);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.f15482a);
                            io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                            mVar.f16855a = "ANR";
                            t4 t4Var = new t4(new io.sentry.exception.a(mVar, applicationNotResponding2, applicationNotResponding2.f15482a, true));
                            t4Var.f17096u = b5.ERROR;
                            d4.d().E(t4Var, k2.x.k(new y(equals)));
                        }
                    } else {
                        this.f15532g.h(b5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f15534i.set(true);
                    }
                }
            } catch (InterruptedException e7) {
                try {
                    Thread.currentThread().interrupt();
                    this.f15532g.h(b5.WARNING, "Interrupted: %s", e7.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f15532g.h(b5.WARNING, "Failed to interrupt due to SecurityException: %s", e7.getMessage());
                    return;
                }
            }
        }
    }
}
