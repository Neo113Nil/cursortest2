package D5;

import D5.a;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2168s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f2549b;

    /* renamed from: a, reason: collision with root package name */
    public static final c f2548a = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final List f2550c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final Map f2551d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final b5.d f2552e = new b5.d() { // from class: D5.b
        @Override // b5.d
        public final void a(Object obj) {
            c.c((f) obj);
        }
    };

    public static final void c(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f2548a.g(event);
    }

    public synchronized void b(b5.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f2550c.add(listener);
    }

    public synchronized void d(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f2549b) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        f2549b = true;
        E5.b.f3006a.a("activity lifecycle monitor registered");
    }

    public synchronized void e(AbstractActivityC2168s activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.f("activity " + activity.getClass().getSimpleName() + " is a fragment activity, registering fragment lifecycle callbacks");
        e eVar = new e(f2552e);
        f2551d.put(activity.getClass().getSimpleName(), eVar);
        activity.getSupportFragmentManager().o1(eVar, true);
    }

    public synchronized void f(b5.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f2550c.remove(listener);
    }

    public void g(f lifecycleEvent) {
        Intrinsics.checkNotNullParameter(lifecycleEvent, "lifecycleEvent");
        Iterator it = f2550c.iterator();
        while (it.hasNext()) {
            ((b5.d) it.next()).a(lifecycleEvent);
        }
    }

    public synchronized void h(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f2549b) {
            application.unregisterActivityLifecycleCallbacks(this);
            f2549b = false;
            E5.b.f3006a.a("activity lifecycle monitor unregistered");
        }
    }

    public synchronized void i(AbstractActivityC2168s activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity " + activity.getClass().getSimpleName() + " is a fragment activity, unregistering fragment lifecycle callbacks");
        e eVar = (e) f2551d.get(activity.getClass().getSimpleName());
        if (eVar != null) {
            activity.getSupportFragmentManager().I1(eVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity created: " + activity.getClass().getSimpleName());
        g(new a.C0051a(activity));
        if (activity instanceof AbstractActivityC2168s) {
            e((AbstractActivityC2168s) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity destroyed: " + activity.getClass().getSimpleName());
        g(new a.b(activity));
        if (activity instanceof AbstractActivityC2168s) {
            i((AbstractActivityC2168s) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity paused: " + activity.getClass().getSimpleName());
        g(new a.c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity resumed: " + activity.getClass().getSimpleName());
        g(new a.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        E5.b.f3006a.a("activity save instance state: " + activity.getClass().getSimpleName());
        g(new a.e(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity started: " + activity.getClass().getSimpleName());
        g(new a.f(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E5.b.f3006a.a("activity stopped: " + activity.getClass().getSimpleName());
        g(new a.g(activity));
    }
}
