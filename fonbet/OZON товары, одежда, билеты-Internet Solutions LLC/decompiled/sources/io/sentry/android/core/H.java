package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.core.view.M0;
import io.sentry.A1;
import io.sentry.C7230z2;
import io.sentry.I2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class H implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final long f66905f = TimeUnit.DAYS.toMillis(91);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66906a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A1 f66907b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f66908c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f66909d;

    /* renamed from: e, reason: collision with root package name */
    private final long f66910e;

    interface a {
        int a();

        Long b();

        boolean c();

        b d(@NotNull ApplicationExitInfo applicationExitInfo, boolean z11);

        @NotNull
        String getLabel();
    }

    /* loaded from: classes10.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7230z2 f66911a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.sentry.E f66912b;

        /* renamed from: c, reason: collision with root package name */
        private final io.sentry.hints.d f66913c;

        b(@NotNull C7230z2 c7230z2, @NotNull io.sentry.E e11, io.sentry.hints.d dVar) {
            this.f66911a = c7230z2;
            this.f66912b = e11;
            this.f66913c = dVar;
        }

        @NotNull
        public final C7230z2 a() {
            return this.f66911a;
        }

        public final io.sentry.hints.d b() {
            return this.f66913c;
        }

        @NotNull
        public final io.sentry.E c() {
            return this.f66912b;
        }
    }

    H(@NotNull Context context, @NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.transport.c cVar, @NotNull a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f66906a = applicationContext != null ? applicationContext : context;
        this.f66907b = a12;
        this.f66908c = sentryAndroidOptions;
        this.f66909d = aVar;
        cVar.getClass();
        this.f66910e = System.currentTimeMillis() - f66905f;
    }

    private void a(@NotNull ApplicationExitInfo applicationExitInfo, boolean z11) {
        io.sentry.hints.d b11;
        a aVar = this.f66909d;
        b d11 = aVar.d(applicationExitInfo, z11);
        if (d11 == null) {
            return;
        }
        if (this.f66907b.z(d11.a(), d11.c()).equals(io.sentry.protocol.t.f68325b) || (b11 = d11.b()) == null || b11.h()) {
            return;
        }
        this.f66908c.getLogger().c(I2.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", aVar.getLabel(), d11.a().G());
    }

    @Override // java.lang.Runnable
    public final void run() {
        List historicalProcessExitReasons;
        ApplicationExitInfo applicationExitInfo;
        long timestamp;
        int reason;
        long timestamp2;
        long timestamp3;
        long timestamp4;
        int reason2;
        ActivityManager activityManager = (ActivityManager) this.f66906a.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.f66908c;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().c(I2.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            if (!fVar.k()) {
                sentryAndroidOptions.getLogger().c(I2.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                fVar.f();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        a aVar = this.f66909d;
        Long b11 = aVar.b();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                applicationExitInfo = null;
                break;
            }
            applicationExitInfo = M0.b(it.next());
            reason2 = applicationExitInfo.getReason();
            if (reason2 == aVar.a()) {
                it.remove();
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "No %ss have been found in the historical exit reasons list.", aVar.getLabel());
            return;
        }
        timestamp = applicationExitInfo.getTimestamp();
        long j11 = this.f66910e;
        if (timestamp < j11) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "Latest %s happened too long ago, returning early.", aVar.getLabel());
            return;
        }
        if (b11 != null) {
            timestamp4 = applicationExitInfo.getTimestamp();
            if (timestamp4 <= b11.longValue()) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Latest %s has already been reported, returning early.", aVar.getLabel());
                return;
            }
        }
        if (aVar.c()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo b12 = M0.b(it2.next());
                reason = b12.getReason();
                if (reason == aVar.a()) {
                    timestamp2 = b12.getTimestamp();
                    if (timestamp2 < j11) {
                        sentryAndroidOptions.getLogger().c(I2.DEBUG, "%s happened too long ago %s.", aVar.getLabel(), b12);
                    } else {
                        if (b11 != null) {
                            timestamp3 = b12.getTimestamp();
                            if (timestamp3 <= b11.longValue()) {
                                sentryAndroidOptions.getLogger().c(I2.DEBUG, "%s has already been reported %s.", aVar.getLabel(), b12);
                            }
                        }
                        a(b12, false);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}
