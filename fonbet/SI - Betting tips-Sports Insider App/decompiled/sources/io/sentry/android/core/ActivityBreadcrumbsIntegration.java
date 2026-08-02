package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.y3;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements q1, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final MyApp f15444a;

    /* renamed from: b, reason: collision with root package name */
    public y3 f15445b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15446c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f15447d = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(MyApp myApp) {
        this.f15444a = myApp;
    }

    public final void c(Activity activity, String str) {
        if (this.f15445b == null) {
            return;
        }
        io.sentry.e eVar = new io.sentry.e();
        eVar.f16334e = "navigation";
        eVar.c(str, "state");
        eVar.c(activity.getClass().getSimpleName(), "screen");
        eVar.f16336g = "ui.lifecycle";
        eVar.f16338i = b5.INFO;
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(activity, "android:activity");
        this.f15445b.h(eVar, h0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15446c) {
            this.f15444a.unregisterActivityLifecycleCallbacks(this);
            y3 y3Var = this.f15445b;
            if (y3Var != null) {
                y3Var.m().getLogger().h(b5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "created");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "destroyed");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "paused");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "resumed");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "saveInstanceState");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "started");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        io.sentry.r a7 = this.f15447d.a();
        try {
            c(activity, "stopped");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15445b = y3.f17255a;
        this.f15446c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = b6Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f15446c));
        if (this.f15446c) {
            this.f15444a.registerActivityLifecycleCallbacks(this);
            b6Var.getLogger().h(b5Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            rh.g.a("ActivityBreadcrumbs");
        }
    }
}
