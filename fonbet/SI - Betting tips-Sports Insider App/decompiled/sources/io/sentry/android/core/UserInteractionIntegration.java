package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.q6;
import io.sentry.y3;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class UserInteractionIntegration implements q1, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final MyApp f15519a;

    /* renamed from: b, reason: collision with root package name */
    public y3 f15520b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f15521c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15522d = io.sentry.hints.j.y(this.f15521c, "androidx.core.view.GestureDetectorCompat");

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15523e = io.sentry.hints.j.y(this.f15521c, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(MyApp myApp, io.sentry.hints.j jVar) {
        this.f15519a = myApp;
    }

    public final void c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f15521c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(b5.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f15520b == null || this.f15521c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f15520b, this.f15521c), this.f15521c));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15519a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f15521c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f15521c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(b5.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.f15655c.d(q6.CANCELLED);
            Window.Callback callback2 = hVar.f15654b;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15521c = sentryAndroidOptions;
        this.f15520b = y3.f17255a;
        boolean z5 = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f15521c.isEnableUserInteractionTracing();
        ILogger logger = this.f15521c.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z5));
        if (z5) {
            if (!this.f15522d) {
                b6Var.getLogger().h(b5.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f15519a.registerActivityLifecycleCallbacks(this);
            this.f15521c.getLogger().h(b5Var, "UserInteractionIntegration installed.", new Object[0]);
            rh.g.a("UserInteraction");
            if (this.f15523e) {
                WeakReference weakReference = (WeakReference) n0.f15781b.f15782a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof androidx.lifecycle.e0) && ((androidx.lifecycle.g0) ((androidx.lifecycle.e0) activity).getLifecycle()).f2169d == androidx.lifecycle.x.f2257e) {
                    c(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
