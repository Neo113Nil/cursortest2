package io.sentry.android.core;

import B1.t0;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.EnumC7225y1;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.K1;
import io.sentry.U2;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f67282a = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f67283b = new io.sentry.util.a();

    public static void a(C7113n c7113n, Context context, K1.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        boolean a11 = io.sentry.util.m.a(sentryAndroidOptions, "timber.log.Timber");
        boolean z11 = io.sentry.util.m.a(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z12 = a11 && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean a12 = io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean a13 = io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        I i11 = new I(c7113n);
        io.sentry.util.m mVar = new io.sentry.util.m();
        C7102c c7102c = new C7102c(mVar, sentryAndroidOptions);
        io.sentry.util.p.b(context, "The context is required.");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(c7113n);
        sentryAndroidOptions.setFatalLogger(new C7112m());
        sentryAndroidOptions.setDefaultScopeType(EnumC7225y1.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(U2.OFF);
        sentryAndroidOptions.setDateProvider(new l0());
        sentryAndroidOptions.getLogs().d(new C7115p());
        sentryAndroidOptions.getMetrics().d(new C7117s());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.v(applicationContext, c7113n, i11));
        a0.a(applicationContext, i11, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        PackageInfo e11 = K.e(applicationContext, i11);
        if (e11 != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(e11.packageName + "@" + e11.versionName + "+" + K.f(e11, i11));
            }
            String str = e11.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(V.a(applicationContext));
            } catch (RuntimeException e12) {
                sentryAndroidOptions.getLogger().a(I2.ERROR, "Could not generate distinct Id.", e12);
            }
        }
        F.o().q(sentryAndroidOptions);
        sentryAndroidOptions.activate();
        C7118t.b(context, sentryAndroidOptions, i11, mVar, c7102c, z11, z12, a12, a13);
        boolean z13 = z11;
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.j m11 = io.sentry.android.core.performance.j.m();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.l h11 = m11.h();
            if (h11.h()) {
                h11.m(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            m11.q((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.l n11 = m11.n();
        if (n11.h()) {
            n11.m(f67282a);
        }
        C7118t.a(sentryAndroidOptions, context, i11, mVar, c7102c, a12);
        b(sentryAndroidOptions, z13, z12);
    }

    private static void b(@NotNull SentryAndroidOptions sentryAndroidOptions, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC7166l0 interfaceC7166l0 : sentryAndroidOptions.getIntegrations()) {
            if (z11 && (interfaceC7166l0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC7166l0);
            }
            if (z12 && (interfaceC7166l0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC7166l0);
            }
            if (interfaceC7166l0 instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(interfaceC7166l0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i11 = 0; i11 < arrayList2.size() - 1; i11++) {
                sentryAndroidOptions.getIntegrations().remove((InterfaceC7166l0) arrayList2.get(i11));
            }
        }
        if (arrayList.size() > 1) {
            for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
                sentryAndroidOptions.getIntegrations().remove((InterfaceC7166l0) arrayList.get(i12));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i13 = 0; i13 < arrayList3.size() - 1; i13++) {
                sentryAndroidOptions.getIntegrations().remove((InterfaceC7166l0) arrayList3.get(i13));
            }
        }
    }

    public static void c(@NotNull Context context, @NotNull K1.a<SentryAndroidOptions> aVar) {
        C7113n c7113n = new C7113n();
        try {
            InterfaceC7097a0 a11 = f67283b.a();
            try {
                K1.f(new t0(), new j0(c7113n, context, aVar));
                io.sentry.W d11 = K1.d();
                if (K.g()) {
                    if (d11.getOptions().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        d11.x(new Fl.a(atomicBoolean, 3));
                        if (!atomicBoolean.get()) {
                            d11.l();
                        }
                    }
                    d11.getOptions().getReplayController().start();
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalAccessException e11) {
            c7113n.a(I2.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (InstantiationException e12) {
            c7113n.a(I2.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (NoSuchMethodException e13) {
            c7113n.a(I2.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        } catch (InvocationTargetException e14) {
            c7113n.a(I2.FATAL, "Fatal error during SentryAndroid.init(...)", e14);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e14);
        }
    }
}
