package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import androidx.appcompat.widget.q4;
import com.sports.insider.MyApp;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b5;
import io.sentry.k5;
import io.sentry.q1;
import io.sentry.w3;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15555a = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public static final io.sentry.util.a f15556b = new io.sentry.util.a();

    public static void a(v vVar, MyApp myApp, androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        boolean y5 = io.sentry.hints.j.y(sentryAndroidOptions, "timber.log.Timber");
        boolean z5 = io.sentry.hints.j.y(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.hints.j.y(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z7 = y5 && io.sentry.hints.j.y(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean y10 = io.sentry.hints.j.y(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean y11 = io.sentry.hints.j.y(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        n0 n0Var = new n0(vVar);
        io.sentry.hints.j jVar = new io.sentry.hints.j(22);
        q4 q4Var = new q4(jVar, sentryAndroidOptions);
        Context applicationContext = myApp.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = myApp;
        }
        sentryAndroidOptions.setLogger(vVar);
        sentryAndroidOptions.setFatalLogger(new v(2));
        sentryAndroidOptions.setDefaultScopeType(w3.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(k5.OFF);
        sentryAndroidOptions.setDateProvider(new d1());
        sentryAndroidOptions.setRuntimeManager(new io.sentry.android.core.internal.util.d());
        sentryAndroidOptions.getLogs().f17102b = new v(4);
        sentryAndroidOptions.getMetrics().f17152b = new v(5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.p(applicationContext, vVar, n0Var));
        w0.c(applicationContext, sentryAndroidOptions, n0Var);
        sentryAndroidOptions.setCacheDirPath((String) sentryAndroidOptions.getRuntimeManager().b(new f3.q(applicationContext, 1)));
        PackageInfo f6 = m0.f(applicationContext, n0Var);
        if (f6 != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(f6.packageName + "@" + f6.versionName + "+" + m0.g(f6, n0Var));
            }
            String str = f6.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId((String) sentryAndroidOptions.getRuntimeManager().b(new f3.q(applicationContext, 2)));
            } catch (RuntimeException e7) {
                sentryAndroidOptions.getLogger().e(b5.ERROR, "Could not generate distinct Id.", e7);
            }
        }
        h0 h0Var = h0.f15617e;
        if (h0Var.f15619b == null) {
            io.sentry.r a7 = h0Var.f15618a.a();
            try {
                h0Var.n(sentryAndroidOptions.getLogger());
                a7.close();
            } finally {
            }
        }
        q.b(myApp, sentryAndroidOptions, n0Var, jVar, q4Var, z5, z7, y10, y11);
        boolean z10 = z5;
        try {
            aVar.e(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.f b10 = io.sentry.android.core.performance.f.b();
        if (sentryAndroidOptions.isEnablePerformanceV2() && Build.VERSION.SDK_INT >= 24) {
            io.sentry.android.core.performance.g gVar = b10.f15804c;
            if (gVar.f15814c == 0) {
                gVar.c(Process.getStartUptimeMillis());
            }
        }
        if (myApp.getApplicationContext() instanceof Application) {
            b10.f((Application) myApp.getApplicationContext());
        }
        io.sentry.android.core.performance.g gVar2 = b10.f15805d;
        if (gVar2.f15814c == 0) {
            gVar2.c(f15555a);
        }
        q.a(sentryAndroidOptions, myApp, n0Var, jVar, q4Var, y10);
        b(sentryAndroidOptions, z10, z7);
    }

    public static void b(SentryAndroidOptions sentryAndroidOptions, boolean z5, boolean z7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (q1 q1Var : sentryAndroidOptions.getIntegrations()) {
            if (z5 && (q1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(q1Var);
            }
            if (z7 && (q1Var instanceof SentryTimberIntegration)) {
                arrayList.add(q1Var);
            }
            if (q1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(q1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i5 = 0; i5 < arrayList2.size() - 1; i5++) {
                sentryAndroidOptions.getIntegrations().remove((q1) arrayList2.get(i5));
            }
        }
        if (arrayList.size() > 1) {
            for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
                sentryAndroidOptions.getIntegrations().remove((q1) arrayList.get(i10));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i11 = 0; i11 < arrayList3.size() - 1; i11++) {
                sentryAndroidOptions.getIntegrations().remove((q1) arrayList3.get(i11));
            }
        }
    }
}
