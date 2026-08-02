package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static final d f = new d();
    public volatile int b;
    public volatile boolean c;
    public volatile c d;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public static final boolean a(d dVar, Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        dVar.getClass();
        try {
            if (intent != null) {
                context.startActivity(intent);
                if (mVar != null) {
                    mVar.a(true);
                }
            } else {
                if (intent2 == null) {
                    return false;
                }
                context.startActivity(intent2);
            }
        } catch (Exception e) {
            boolean z = u.a;
            t.b("ActivityManager", "Failed to start activity: " + e);
            if (intent != null && mVar != null) {
                try {
                    mVar.a(false);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (intent != null && intent2 != null) {
                context.startActivity(intent2);
            }
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.b++;
        if (this.c || this.b != 1) {
            return;
        }
        this.c = true;
        c cVar = this.d;
        if (cVar != null) {
            Context context = (Context) cVar.b().get();
            if (context != null) {
                a.a(context, cVar.c(), cVar.d(), cVar.a());
            }
            this.d = null;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.b--;
        if (this.c && this.b == 0) {
            this.c = false;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    public static final void a(d dVar, Context context) {
        Object u2gVar;
        if (dVar.a.getAndSet(true)) {
            return;
        }
        try {
            p2g p2gVar = w2g.b;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(dVar);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z = u.a;
            t.a("ActivityManager", "Error initializing ActivityManager", a);
            dVar.a.set(false);
        }
    }

    public static final boolean a(d dVar) {
        return !dVar.a.get() || dVar.c;
    }

    public static final void a(d dVar, b bVar) {
        dVar.e.add(bVar);
    }

    public final void a(b bVar) {
        bVar.getClass();
        this.e.remove(bVar);
    }
}
