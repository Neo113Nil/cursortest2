package io.sentry.android.core;

import Y2.AbstractC1817h;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.InterfaceC4740e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4681h0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final long f50978f = TimeUnit.DAYS.toMillis(91);

    /* renamed from: a, reason: collision with root package name */
    public final Context f50979a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4740e0 f50980b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f50981c;

    /* renamed from: d, reason: collision with root package name */
    public final a f50982d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50983e;

    /* renamed from: io.sentry.android.core.h0$a */
    public interface a {
        Long a();

        String b();

        boolean c();

        b d(ApplicationExitInfo applicationExitInfo, boolean z10);

        int e();
    }

    /* renamed from: io.sentry.android.core.h0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C4733c3 f50984a;

        /* renamed from: b, reason: collision with root package name */
        public final io.sentry.J f50985b;

        /* renamed from: c, reason: collision with root package name */
        public final io.sentry.hints.d f50986c;

        public b(C4733c3 c4733c3, io.sentry.J j10, io.sentry.hints.d dVar) {
            this.f50984a = c4733c3;
            this.f50985b = j10;
            this.f50986c = dVar;
        }

        public C4733c3 a() {
            return this.f50984a;
        }

        public io.sentry.hints.d b() {
            return this.f50986c;
        }

        public io.sentry.J c() {
            return this.f50985b;
        }
    }

    public RunnableC4681h0(Context context, InterfaceC4740e0 interfaceC4740e0, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.o oVar, a aVar) {
        this.f50979a = AbstractC4704q0.g(context);
        this.f50980b = interfaceC4740e0;
        this.f50981c = sentryAndroidOptions;
        this.f50982d = aVar;
        this.f50983e = oVar.a() - f50978f;
    }

    public final ApplicationExitInfo a(List list) {
        int reason;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a10 = AbstractC1817h.a(it.next());
            reason = a10.getReason();
            if (reason == this.f50982d.e()) {
                it.remove();
                return a10;
            }
        }
        return null;
    }

    public final void b(ApplicationExitInfo applicationExitInfo, boolean z10) {
        io.sentry.hints.d b10;
        b d10 = this.f50982d.d(applicationExitInfo, z10);
        if (d10 == null || this.f50980b.v(d10.a(), d10.c()).equals(io.sentry.protocol.u.f52477c) || (b10 = d10.b()) == null || b10.g()) {
            return;
        }
        this.f50981c.getLogger().c(EnumC4788n3.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", this.f50982d.b(), d10.a().G());
    }

    public final void c(List list, Long l10) {
        int reason;
        long timestamp;
        long timestamp2;
        Collections.reverse(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a10 = AbstractC1817h.a(it.next());
            reason = a10.getReason();
            if (reason == this.f50982d.e()) {
                timestamp = a10.getTimestamp();
                if (timestamp < this.f50983e) {
                    this.f50981c.getLogger().c(EnumC4788n3.DEBUG, "%s happened too long ago %s.", this.f50982d.b(), a10);
                } else {
                    if (l10 != null) {
                        timestamp2 = a10.getTimestamp();
                        if (timestamp2 <= l10.longValue()) {
                            this.f50981c.getLogger().c(EnumC4788n3.DEBUG, "%s has already been reported %s.", this.f50982d.b(), a10);
                        }
                    }
                    b(a10, false);
                }
            }
        }
    }

    public final void d() {
        io.sentry.cache.g envelopeDiskCache = this.f50981c.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f50981c.isEnableAutoSessionTracking()) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            if (fVar.A()) {
                return;
            }
            this.f50981c.getLogger().c(EnumC4788n3.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
            fVar.s();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List historicalProcessExitReasons;
        long timestamp;
        long timestamp2;
        ActivityManager activityManager = (ActivityManager) this.f50979a.getSystemService("activity");
        if (activityManager == null) {
            this.f50981c.getLogger().c(EnumC4788n3.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            this.f50981c.getLogger().c(EnumC4788n3.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        d();
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        Long a10 = this.f50982d.a();
        ApplicationExitInfo a11 = a(arrayList);
        if (a11 == null) {
            this.f50981c.getLogger().c(EnumC4788n3.DEBUG, "No %ss have been found in the historical exit reasons list.", this.f50982d.b());
            return;
        }
        timestamp = a11.getTimestamp();
        if (timestamp < this.f50983e) {
            this.f50981c.getLogger().c(EnumC4788n3.DEBUG, "Latest %s happened too long ago, returning early.", this.f50982d.b());
            return;
        }
        if (a10 != null) {
            timestamp2 = a11.getTimestamp();
            if (timestamp2 <= a10.longValue()) {
                this.f50981c.getLogger().c(EnumC4788n3.DEBUG, "Latest %s has already been reported, returning early.", this.f50982d.b());
                return;
            }
        }
        if (this.f50982d.c()) {
            c(arrayList, a10);
        }
        b(a11, true);
    }
}
