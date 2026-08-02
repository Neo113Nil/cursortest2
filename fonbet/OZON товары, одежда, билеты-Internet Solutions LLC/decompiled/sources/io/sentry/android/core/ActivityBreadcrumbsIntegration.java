package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC7166l0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f66830a;

    /* renamed from: b, reason: collision with root package name */
    private A1 f66831b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66832c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66833d = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(@NotNull Application application) {
        io.sentry.util.p.b(application, "Application is required");
        this.f66830a = application;
    }

    private void c(@NotNull Activity activity, @NotNull String str) {
        if (this.f66831b == null) {
            return;
        }
        C7141f c7141f = new C7141f();
        c7141f.r("navigation");
        c7141f.o(str, "state");
        c7141f.o(activity.getClass().getSimpleName(), "screen");
        c7141f.n("ui.lifecycle");
        c7141f.p(I2.INFO);
        io.sentry.E e11 = new io.sentry.E();
        e11.k(activity, "android:activity");
        this.f66831b.g(c7141f, e11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f66832c) {
            this.f66830a.unregisterActivityLifecycleCallbacks(this);
            A1 a12 = this.f66831b;
            if (a12 != null) {
                a12.getOptions().getLogger().c(I2.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66831b = a12;
        this.f66832c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = w22.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f66832c));
        if (this.f66832c) {
            this.f66830a.registerActivityLifecycleCallbacks(this);
            w22.getLogger().c(i22, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.j.a("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "created");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "destroyed");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "paused");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "resumed");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "saveInstanceState");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "started");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66833d.a();
        try {
            c(activity, "stopped");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
