package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C3122c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C3122c f32445e = new ComponentCallbacks2C3122c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f32446a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f32447b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32448c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f32449d = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z10);
    }

    public static ComponentCallbacks2C3122c b() {
        return f32445e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C3122c componentCallbacks2C3122c = f32445e;
        synchronized (componentCallbacks2C3122c) {
            try {
                if (!componentCallbacks2C3122c.f32449d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3122c);
                    application.registerComponentCallbacks(componentCallbacks2C3122c);
                    componentCallbacks2C3122c.f32449d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f32445e) {
            this.f32448c.add(aVar);
        }
    }

    public boolean d() {
        return this.f32446a.get();
    }

    public boolean e(boolean z10) {
        AtomicBoolean atomicBoolean = this.f32447b;
        if (!atomicBoolean.get()) {
            if (K9.q.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f32446a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z10) {
        synchronized (f32445e) {
            try {
                Iterator it = this.f32448c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f32447b;
        boolean compareAndSet = this.f32446a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f32447b;
        boolean compareAndSet = this.f32446a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f32446a.compareAndSet(false, true)) {
            this.f32447b.set(true);
            f(true);
        }
    }
}
