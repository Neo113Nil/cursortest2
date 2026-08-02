package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.y3;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements q1, Closeable, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final io.sentry.h0 f15474e = new io.sentry.h0();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15475a;

    /* renamed from: b, reason: collision with root package name */
    public y3 f15476b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f15477c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f15478d = new io.sentry.android.core.internal.util.g(60000, 0);

    public AppComponentsBreadcrumbsIntegration(MyApp myApp) {
        Context applicationContext = myApp.getApplicationContext();
        this.f15475a = applicationContext != null ? applicationContext : myApp;
    }

    public final void c(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f15477c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f15477c.getLogger().b(b5.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f15475a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f15477c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(b5.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f15477c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().h(b5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        c(new c0(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i5) {
        if (i5 >= 40 && !this.f15478d.a()) {
            final long currentTimeMillis = System.currentTimeMillis();
            c(new Runnable() { // from class: io.sentry.android.core.d0
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = AppComponentsBreadcrumbsIntegration.this;
                    if (appComponentsBreadcrumbsIntegration.f15476b != null) {
                        io.sentry.e eVar = new io.sentry.e(currentTimeMillis);
                        eVar.f16334e = "system";
                        eVar.f16336g = "device.event";
                        eVar.f16333d = "Low memory";
                        eVar.c("LOW_MEMORY", "action");
                        eVar.c(Integer.valueOf(i5), "level");
                        eVar.f16338i = b5.WARNING;
                        appComponentsBreadcrumbsIntegration.f15476b.h(eVar, AppComponentsBreadcrumbsIntegration.f15474e);
                    }
                }
            });
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        this.f15476b = y3.f17255a;
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15477c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f15477c.isEnableAppComponentBreadcrumbs()));
        if (this.f15477c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f15475a.registerComponentCallbacks(this);
                b6Var.getLogger().h(b5Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                rh.g.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f15477c.setEnableAppComponentBreadcrumbs(false);
                b6Var.getLogger().b(b5.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
