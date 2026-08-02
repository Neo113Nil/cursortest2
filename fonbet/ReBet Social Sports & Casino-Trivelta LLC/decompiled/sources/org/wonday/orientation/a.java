package org.wonday.orientation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static AtomicInteger f62880b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public static a f62881c;

    /* renamed from: a, reason: collision with root package name */
    public b f62882a;

    public static a a() {
        if (f62881c == null) {
            f62881c = new a();
        }
        return f62881c;
    }

    public void b(b bVar) {
        this.f62882a = bVar;
        if (f62880b.get() == 1) {
            this.f62882a.start();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b bVar;
        if (f62880b.get() != 0 || (bVar = this.f62882a) == null) {
            return;
        }
        bVar.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b bVar;
        if (f62880b.incrementAndGet() != 1 || (bVar = this.f62882a) == null) {
            return;
        }
        bVar.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b bVar;
        if (f62880b.decrementAndGet() != 0 || (bVar = this.f62882a) == null) {
            return;
        }
        bVar.stop();
    }
}
