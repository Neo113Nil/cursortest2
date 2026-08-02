package com.iab.omid.library.corpmailru.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    @SuppressLint({"StaticFieldLeak"})
    private static b a = new b();
    private boolean b;
    private boolean c;
    private a d;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b a() {
        return a;
    }

    private void e() {
        boolean z = !this.c;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = com.iab.omid.library.corpmailru.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z);
        }
    }

    public void b() {
        this.b = true;
        this.c = false;
        e();
    }

    public void c() {
        this.b = false;
        this.c = false;
        this.d = null;
    }

    @VisibleForTesting
    @RequiresApi(api = 16)
    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View d;
        boolean z = false;
        boolean z2 = d().importance != 100;
        boolean z3 = true;
        for (com.iab.omid.library.corpmailru.adsession.a aVar : com.iab.omid.library.corpmailru.b.a.a().c()) {
            if (aVar.e() && (d = aVar.d()) != null && d.hasWindowFocus()) {
                z3 = false;
            }
        }
        if (z2 && z3) {
            z = true;
        }
        a(z);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    private void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (this.b) {
                e();
                a aVar = this.d;
                if (aVar != null) {
                    aVar.a(!z);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
