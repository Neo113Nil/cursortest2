package com.logrocket.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6588a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6589b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f6590c = true;

    /* renamed from: d, reason: collision with root package name */
    public eh.b f6591d = eh.f.v();

    /* renamed from: e, reason: collision with root package name */
    public eh.b f6592e = null;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f6593f = null;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6594g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public HashSet f6595h = new HashSet();

    public final void a(long j, eh.d dVar) {
        if (this.f6595h.contains(dVar)) {
            return;
        }
        this.f6595h.add(dVar);
        for (int u10 = ((eh.f) this.f6591d.f6816b).u() - 1; u10 >= 0; u10--) {
            if (j - ((eh.f) this.f6591d.f6816b).t(u10).r() > 10000) {
                eh.b bVar = this.f6591d;
                bVar.d();
                eh.f.s((eh.f) bVar.f6816b, u10);
            }
        }
        eh.c t3 = eh.e.t();
        t3.d();
        eh.e.p((eh.e) t3.f6816b, j);
        t3.d();
        eh.e.q((eh.e) t3.f6816b, dVar);
        eh.b bVar2 = this.f6591d;
        bVar2.d();
        eh.f.q((eh.f) bVar2.f6816b, (eh.e) t3.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(System.currentTimeMillis(), eh.d.ACTIVITY_CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f6589b.remove(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResumed(Activity activity) {
        int i5;
        a(System.currentTimeMillis(), eh.d.ACTIVITY_RESUMED);
        if (this.f6590c && ((eh.f) this.f6591d.f6816b).u() > 0) {
            if (((eh.f) this.f6591d.f6816b).t(0).s() == eh.d.APPLICATION_INITIALIZED) {
                i5 = 1;
            } else if (((eh.f) this.f6591d.f6816b).u() == 2) {
                i5 = 3;
            } else if (((eh.f) this.f6591d.f6816b).u() > 2) {
                i5 = 2;
            }
            if (i5 != 0) {
                eh.b bVar = this.f6591d;
                bVar.d();
                eh.f.p((eh.f) bVar.f6816b, i5);
                eh.b bVar2 = this.f6591d;
                g maybeGetEventAdder = LogRocketCore.maybeGetEventAdder();
                synchronized (this.f6594g) {
                    try {
                        if (maybeGetEventAdder != null) {
                            String d10 = maybeGetEventAdder.f6462a.d(activity);
                            bVar2.d();
                            eh.f.r((eh.f) bVar2.f6816b, d10);
                            maybeGetEventAdder.a(24, bVar2);
                        } else {
                            this.f6592e = bVar2;
                            this.f6593f = new WeakReference(activity);
                        }
                    } finally {
                    }
                }
            }
            this.f6591d = eh.f.v();
            this.f6595h = new HashSet();
            this.f6590c = false;
            this.f6589b.add(activity);
        }
        i5 = 0;
        if (i5 != 0) {
        }
        this.f6591d = eh.f.v();
        this.f6595h = new HashSet();
        this.f6590c = false;
        this.f6589b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(System.currentTimeMillis(), eh.d.ACTIVITY_STARTED);
        this.f6588a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        HashSet hashSet = this.f6588a;
        hashSet.remove(activity);
        this.f6590c = hashSet.isEmpty() && !activity.isChangingConfigurations();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
