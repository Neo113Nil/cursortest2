package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4839u0;
import io.sentry.android.core.j1;
import io.sentry.android.core.p1;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class FeedbackShakeIntegration implements InterfaceC4839u0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f50689a;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50691c;

    /* renamed from: d, reason: collision with root package name */
    public volatile WeakReference f50692d;

    /* renamed from: f, reason: collision with root package name */
    public volatile Runnable f50694f;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f50693e = false;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f50690b = new j1(io.sentry.U0.e());

    public FeedbackShakeIntegration(Application application) {
        this.f50689a = (Application) io.sentry.util.w.c(application, "Application is required");
    }

    public static /* synthetic */ void d(FeedbackShakeIntegration feedbackShakeIntegration, Runnable runnable) {
        feedbackShakeIntegration.f50693e = false;
        feedbackShakeIntegration.f50691c.getFeedbackOptions().z(runnable);
        if (runnable != null) {
            runnable.run();
        }
        feedbackShakeIntegration.f50694f = null;
    }

    public static /* synthetic */ void k(final FeedbackShakeIntegration feedbackShakeIntegration) {
        WeakReference weakReference = feedbackShakeIntegration.f50692d;
        final Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean z02 = AppState.w0().z0();
        if (activity == null || feedbackShakeIntegration.f50691c == null || feedbackShakeIntegration.f50693e || Boolean.TRUE.equals(z02)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.A0
            @Override // java.lang.Runnable
            public final void run() {
                FeedbackShakeIntegration.r(FeedbackShakeIntegration.this, activity);
            }
        });
    }

    public static /* synthetic */ void r(final FeedbackShakeIntegration feedbackShakeIntegration, Activity activity) {
        if (feedbackShakeIntegration.f50693e || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            feedbackShakeIntegration.f50693e = true;
            final Runnable j10 = feedbackShakeIntegration.f50691c.getFeedbackOptions().j();
            feedbackShakeIntegration.f50694f = j10;
            feedbackShakeIntegration.f50691c.getFeedbackOptions().z(new Runnable() { // from class: io.sentry.android.core.B0
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackShakeIntegration.d(FeedbackShakeIntegration.this, j10);
                }
            });
            new p1.a(activity).a().show();
        } catch (Throwable th2) {
            feedbackShakeIntegration.f50693e = false;
            feedbackShakeIntegration.f50691c.getFeedbackOptions().z(feedbackShakeIntegration.f50694f);
            feedbackShakeIntegration.f50694f = null;
            feedbackShakeIntegration.f50691c.getLogger().b(EnumC4788n3.ERROR, "Failed to show feedback dialog on shake.", th2);
        }
    }

    public final void B(Activity activity) {
        if (this.f50691c == null) {
            return;
        }
        U();
        this.f50690b.e(activity, new j1.a() { // from class: io.sentry.android.core.z0
            @Override // io.sentry.android.core.j1.a
            public final void onShake() {
                FeedbackShakeIntegration.k(FeedbackShakeIntegration.this);
            }
        });
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50691c = sentryAndroidOptions;
        if (sentryAndroidOptions.getFeedbackOptions().v()) {
            this.f50690b.d(this.f50689a, this.f50691c.getLogger());
            io.sentry.util.n.a("FeedbackShake");
            this.f50689a.registerActivityLifecycleCallbacks(this);
            this.f50691c.getLogger().c(EnumC4788n3.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
            Activity b10 = C4705r0.c().b();
            if (b10 != null) {
                this.f50692d = new WeakReference(b10);
                B(b10);
            }
        }
    }

    public final void U() {
        this.f50690b.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50689a.unregisterActivityLifecycleCallbacks(this);
        this.f50690b.b();
        if (this.f50693e) {
            this.f50693e = false;
            SentryAndroidOptions sentryAndroidOptions = this.f50691c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().z(this.f50694f);
            }
            this.f50694f = null;
        }
        this.f50692d = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.f50692d != null ? (Activity) this.f50692d.get() : null;
        if (this.f50693e && activity == activity2) {
            this.f50693e = false;
            this.f50692d = null;
            SentryAndroidOptions sentryAndroidOptions = this.f50691c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().z(this.f50694f);
            }
            this.f50694f = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity == (this.f50692d != null ? (Activity) this.f50692d.get() : null)) {
            U();
            if (this.f50693e) {
                return;
            }
            this.f50692d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Activity activity2 = this.f50692d != null ? (Activity) this.f50692d.get() : null;
        if (this.f50693e && activity2 != null && activity2 != activity) {
            this.f50693e = false;
            SentryAndroidOptions sentryAndroidOptions = this.f50691c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().z(this.f50694f);
            }
            this.f50694f = null;
        }
        this.f50692d = new WeakReference(activity);
        B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
