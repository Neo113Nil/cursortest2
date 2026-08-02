package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.util.C4843a;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC4839u0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f50611a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4740e0 f50612b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50613c;

    /* renamed from: d, reason: collision with root package name */
    public final C4843a f50614d = new C4843a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f50611a = (Application) io.sentry.util.w.c(application, "Application is required");
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50612b = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        this.f50613c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = f32.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f50613c));
        if (this.f50613c) {
            this.f50611a.registerActivityLifecycleCallbacks(this);
            f32.getLogger().c(enumC4788n3, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.n.a("ActivityBreadcrumbs");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f50613c) {
            this.f50611a.unregisterActivityLifecycleCallbacks(this);
            InterfaceC4740e0 interfaceC4740e0 = this.f50612b;
            if (interfaceC4740e0 != null) {
                interfaceC4740e0.i().getLogger().c(EnumC4788n3.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    public final void d(Activity activity, String str) {
        if (this.f50612b == null) {
            return;
        }
        C4744f c4744f = new C4744f();
        c4744f.A("navigation");
        c4744f.w("state", str);
        c4744f.w("screen", k(activity));
        c4744f.v("ui.lifecycle");
        c4744f.x(EnumC4788n3.INFO);
        io.sentry.J j10 = new io.sentry.J();
        j10.m("android:activity", activity);
        this.f50612b.g(c4744f, j10);
    }

    public final String k(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "created");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "destroyed");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "paused");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "resumed");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "saveInstanceState");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "started");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        InterfaceC4765j0 d10 = this.f50614d.d();
        try {
            d(activity, "stopped");
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
