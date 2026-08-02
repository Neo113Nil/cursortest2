package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.b5;
import io.sentry.t4;
import io.sentry.y3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final long f15770f = TimeUnit.DAYS.toMillis(91);

    /* renamed from: a, reason: collision with root package name */
    public final Context f15771a;

    /* renamed from: b, reason: collision with root package name */
    public final y3 f15772b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f15773c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f15774d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15775e;

    public l0(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.d dVar, k0 k0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f15771a = applicationContext != null ? applicationContext : context;
        this.f15772b = y3.f17255a;
        this.f15773c = sentryAndroidOptions;
        this.f15774d = k0Var;
        dVar.getClass();
        this.f15775e = System.currentTimeMillis() - f15770f;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z5) {
        k0 k0Var = this.f15774d;
        androidx.appcompat.app.v0 e7 = k0Var.e(applicationExitInfo, z5);
        if (e7 == null) {
            return;
        }
        t4 t4Var = (t4) e7.f364b;
        if (this.f15772b.E(t4Var, (io.sentry.h0) e7.f365c).equals(io.sentry.protocol.v.f16922b) || ((io.sentry.hints.c) e7.f366d).d()) {
            return;
        }
        this.f15773c.getLogger().h(b5.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", k0Var.c(), t4Var.f16455a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.f15771a.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.f15773c;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().h(b5.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.f()) {
                sentryAndroidOptions.getLogger().h(b5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.f16245e.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        k0 k0Var = this.f15774d;
        Long b10 = k0Var.b();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ApplicationExitInfo d10 = io.sentry.clientreport.a.d(it.next());
            if (d10.getReason() == k0Var.a()) {
                it.remove();
                applicationExitInfo = d10;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "No %ss have been found in the historical exit reasons list.", k0Var.c());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j = this.f15775e;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "Latest %s happened too long ago, returning early.", k0Var.c());
            return;
        }
        if (b10 != null && applicationExitInfo.getTimestamp() <= b10.longValue()) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "Latest %s has already been reported, returning early.", k0Var.c());
            return;
        }
        if (k0Var.d()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo d11 = io.sentry.clientreport.a.d(it2.next());
                if (d11.getReason() == k0Var.a()) {
                    if (d11.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().h(b5.DEBUG, "%s happened too long ago %s.", k0Var.c(), d11);
                    } else if (b10 == null || d11.getTimestamp() > b10.longValue()) {
                        a(d11, false);
                    } else {
                        sentryAndroidOptions.getLogger().h(b5.DEBUG, "%s has already been reported %s.", k0Var.c(), d11);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}
