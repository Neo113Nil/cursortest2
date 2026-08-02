package com.logrocket.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final LogRocketCore f6413a;

    /* renamed from: b, reason: collision with root package name */
    public final ba.d f6414b = new ba.d("lifecycle");

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f6415c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public Activity f6416d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f6417e = "";

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6418f;

    public d(LogRocketCore logRocketCore, boolean z5) {
        this.f6413a = logRocketCore;
        this.f6418f = z5;
    }

    public static String a(Activity activity) {
        return activity == null ? "unknown" : activity.getClass().getName();
    }

    public final void b(Activity activity, int i5) {
        xg.b v5 = xg.c.v();
        String packageName = activity.getPackageName();
        v5.d();
        xg.c.q((xg.c) v5.f6816b, packageName);
        String localClassName = activity.getLocalClassName();
        v5.d();
        xg.c.r((xg.c) v5.f6816b, localClassName);
        v5.d();
        xg.c.p((xg.c) v5.f6816b, i5);
        this.f6413a.b(6, v5, null, i5 == 2, null);
    }

    public final String c() {
        Activity activity = this.f6416d;
        return activity != null ? d(activity) : "";
    }

    public final String d(Activity activity) {
        String packageName = activity.getPackageName();
        String[] strArr = {this.f6418f ? activity.getLocalClassName() : null, this.f6417e};
        if (packageName.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("https://".concat(packageName));
        for (int i5 = 0; i5 < 2; i5++) {
            String str = strArr[i5];
            if (str != null && !str.isEmpty()) {
                sb2.append("/");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 4));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 0));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 5));
        }
        this.f6416d = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 6));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 3));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.f6418f) {
            h0.b(new c(this, activity, 2));
        }
    }
}
