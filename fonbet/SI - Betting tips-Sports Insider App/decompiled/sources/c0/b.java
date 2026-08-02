package c0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f3231a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f3232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3234d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3235e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3236f = false;

    public b(Activity activity) {
        this.f3232b = activity;
        this.f3233c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f3232b == activity) {
            this.f3232b = null;
            this.f3235e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f3235e || this.f3236f || this.f3234d) {
            return;
        }
        Object obj = this.f3231a;
        try {
            Object obj2 = c.f3239c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f3233c) {
                c.f3243g.postAtFrontOfQueue(new g8.a(5, c.f3238b.get(activity), obj2));
                this.f3236f = true;
                this.f3231a = null;
            }
        } catch (Throwable th2) {
            w0.e("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f3232b == activity) {
            this.f3234d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
