package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import io.sentry.protocol.C7189e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC7166l0, Closeable, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.sentry.E f66871e = new io.sentry.E();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66872a;

    /* renamed from: b, reason: collision with root package name */
    private A1 f66873b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f66874c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.g f66875d = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.a(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f66872a = applicationContext != null ? applicationContext : context;
    }

    public static void c(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j11, Configuration configuration) {
        if (appComponentsBreadcrumbsIntegration.f66873b != null) {
            C7189e.b a11 = io.sentry.android.core.internal.util.h.a(appComponentsBreadcrumbsIntegration.f66872a.getResources().getConfiguration().orientation);
            String lowerCase = a11 != null ? a11.name().toLowerCase(Locale.ROOT) : "undefined";
            C7141f c7141f = new C7141f(j11);
            c7141f.r("navigation");
            c7141f.n("device.orientation");
            c7141f.o(lowerCase, "position");
            c7141f.p(I2.INFO);
            io.sentry.E e11 = new io.sentry.E();
            e11.k(configuration, "android:configuration");
            appComponentsBreadcrumbsIntegration.f66873b.g(c7141f, e11);
        }
    }

    public static void j(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j11, int i11) {
        if (appComponentsBreadcrumbsIntegration.f66873b != null) {
            C7141f c7141f = new C7141f(j11);
            c7141f.r("system");
            c7141f.n("device.event");
            c7141f.q("Low memory");
            c7141f.o("LOW_MEMORY", "action");
            c7141f.o(Integer.valueOf(i11), "level");
            c7141f.p(I2.WARNING);
            appComponentsBreadcrumbsIntegration.f66873b.g(c7141f, f66871e);
        }
    }

    private void k(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f66874c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f66874c.getLogger().b(I2.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f66872a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f66874c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(I2.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f66874c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(I2.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        this.f66873b = a12;
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66874c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f66874c.isEnableAppComponentBreadcrumbs()));
        if (this.f66874c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f66872a.registerComponentCallbacks(this);
                w22.getLogger().c(i22, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.j.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f66874c.setEnableAppComponentBreadcrumbs(false);
                w22.getLogger().b(I2.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull final Configuration configuration) {
        final long currentTimeMillis = System.currentTimeMillis();
        k(new Runnable() { // from class: io.sentry.android.core.D
            @Override // java.lang.Runnable
            public final void run() {
                AppComponentsBreadcrumbsIntegration.c(AppComponentsBreadcrumbsIntegration.this, currentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i11) {
        if (i11 >= 40 && !this.f66875d.a()) {
            final long currentTimeMillis = System.currentTimeMillis();
            k(new Runnable() { // from class: io.sentry.android.core.E
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration.j(AppComponentsBreadcrumbsIntegration.this, currentTimeMillis, i11);
                }
            });
        }
    }
}
