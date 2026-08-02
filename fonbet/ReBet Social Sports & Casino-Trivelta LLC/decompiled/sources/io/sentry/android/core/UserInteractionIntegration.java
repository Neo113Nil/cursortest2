package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2193s;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4839u0;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class UserInteractionIntegration implements InterfaceC4839u0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f50852a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4740e0 f50853b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50854c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50855d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f50856e = new WeakHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Object f50857f = new Object();

    public UserInteractionIntegration(Application application, io.sentry.util.s sVar) {
        this.f50852a = (Application) io.sentry.util.w.c(application, "Application is required");
        this.f50855d = sVar.d("androidx.lifecycle.Lifecycle", this.f50854c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        this.f50854c = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50853b = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        boolean z10 = this.f50854c.isEnableUserInteractionBreadcrumbs() || this.f50854c.isEnableUserInteractionTracing();
        ILogger logger = this.f50854c.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            this.f50852a.registerActivityLifecycleCallbacks(this);
            this.f50854c.getLogger().c(enumC4788n3, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.n.a("UserInteraction");
            if (this.f50855d) {
                Activity b10 = C4705r0.c().b();
                if ((b10 instanceof InterfaceC2193s) && ((InterfaceC2193s) b10).getLifecycle().b() == AbstractC2185j.b.f20394e) {
                    d(b10);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ArrayList arrayList;
        this.f50852a.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.f50857f) {
            arrayList = new ArrayList(this.f50856e.keySet());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Window window = (Window) it.next();
            if (window != null) {
                r(window);
            }
        }
        synchronized (this.f50857f) {
            this.f50856e.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f50854c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public final void d(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f50854c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f50853b == null || this.f50854c == null) {
            return;
        }
        synchronized (this.f50857f) {
            try {
                WeakReference weakReference = (WeakReference) this.f50856e.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new io.sentry.android.core.internal.gestures.b();
                    }
                    io.sentry.android.core.internal.gestures.j jVar = new io.sentry.android.core.internal.gestures.j(callback, activity, new io.sentry.android.core.internal.gestures.i(activity, this.f50853b, this.f50854c), this.f50854c);
                    window.setCallback(jVar);
                    synchronized (this.f50857f) {
                        this.f50856e.put(window, new WeakReference(jVar));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            r(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f50854c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        d(activity);
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

    public final void r(Window window) {
        io.sentry.android.core.internal.gestures.j jVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.j) {
            io.sentry.android.core.internal.gestures.j jVar2 = (io.sentry.android.core.internal.gestures.j) callback;
            jVar2.c();
            if (jVar2.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(jVar2.a());
            }
            synchronized (this.f50857f) {
                this.f50856e.remove(window);
            }
            return;
        }
        synchronized (this.f50857f) {
            try {
                WeakReference weakReference = (WeakReference) this.f50856e.remove(window);
                jVar = weakReference != null ? (io.sentry.android.core.internal.gestures.j) weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            jVar.c();
        }
    }
}
