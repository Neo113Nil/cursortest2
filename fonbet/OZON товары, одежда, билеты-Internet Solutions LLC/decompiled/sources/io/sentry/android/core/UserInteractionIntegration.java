package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.AbstractC5434v;
import io.sentry.A1;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class UserInteractionIntegration implements InterfaceC7166l0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f67021a;

    /* renamed from: b, reason: collision with root package name */
    private A1 f67022b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f67023c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f67024d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f67025e;

    public UserInteractionIntegration(@NotNull Application application, @NotNull io.sentry.util.m mVar) {
        io.sentry.util.p.b(application, "Application is required");
        this.f67021a = application;
        this.f67024d = io.sentry.util.m.a(this.f67023c, "androidx.core.view.GestureDetectorCompat");
        this.f67025e = io.sentry.util.m.a(this.f67023c, "androidx.lifecycle.Lifecycle");
    }

    private void c(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f67023c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(I2.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f67022b == null || this.f67023c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.g(callback, activity, new io.sentry.android.core.internal.gestures.e(activity, this.f67022b, this.f67023c), this.f67023c));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f67021a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f67023c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f67023c = sentryAndroidOptions;
        this.f67022b = a12;
        boolean z11 = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f67023c.isEnableUserInteractionTracing();
        ILogger logger = this.f67023c.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z11));
        if (z11) {
            if (!this.f67024d) {
                w22.getLogger().c(I2.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f67021a.registerActivityLifecycleCallbacks(this);
            this.f67023c.getLogger().c(i22, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.j.a("UserInteraction");
            if (this.f67025e) {
                Activity b11 = L.c().b();
                if ((b11 instanceof androidx.lifecycle.J) && ((androidx.lifecycle.J) b11).getLifecycle().b() == AbstractC5434v.b.RESUMED) {
                    c(b11);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f67023c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(I2.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) callback;
            gVar.b();
            if (gVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(gVar.a());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
    }
}
