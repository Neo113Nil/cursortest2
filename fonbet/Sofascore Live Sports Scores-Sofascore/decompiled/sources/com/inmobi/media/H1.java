package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import defpackage.yq5;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class H1 implements Application.ActivityLifecycleCallbacks {
    public final G1 a;
    public WeakReference b;
    public final /* synthetic */ Context c;

    public H1(Context context) {
        this.c = context;
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        this.a = new G1(mainLooper);
    }

    public static final void a(Context context, H1 h1) {
        if (I1.a(context) || h1.b != null) {
            return;
        }
        h1.a.sendEmptyMessageDelayed(1001, com.ironsource.Ua.C);
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        WeakReference weakReference = this.b;
        if (!Intrinsics.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.b = new WeakReference(activity);
        }
        this.a.removeMessages(1001);
        this.a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        WeakReference weakReference = this.b;
        if (!Intrinsics.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.b = new WeakReference(activity);
        }
        this.a.removeMessages(1001);
        this.a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        WeakReference weakReference = this.b;
        if (Intrinsics.c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.a.sendEmptyMessageDelayed(1001, com.ironsource.Ua.C);
        } else if (this.b == null) {
            AbstractC3424fj.g.submit(new yq5(7, this.c, this));
        }
    }
}
