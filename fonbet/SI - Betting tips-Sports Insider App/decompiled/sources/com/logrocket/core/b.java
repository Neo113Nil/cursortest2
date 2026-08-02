package com.logrocket.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final LogRocketCore f6407a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6408b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f6409c = new AtomicInteger();

    public b(LogRocketCore logRocketCore) {
        this.f6407a = logRocketCore;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        h0.b(new a(this, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f6409c.incrementAndGet() == 1) {
            this.f6408b.set(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a aVar = new a(this, 0);
        AtomicReference atomicReference = aa.l.f112a;
        Handler handler = (Handler) atomicReference.get();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            atomicReference.set(handler);
        }
        handler.postDelayed(aVar, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
