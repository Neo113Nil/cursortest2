package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iie implements Application.ActivityLifecycleCallbacks {
    public static Function1 i;
    public static final iie a = new iie();
    public static AdvertisingIdClient.Info b = oie.b;
    public static String c = "";
    public static String d = "";
    public static WeakReference e = new WeakReference(null);
    public static final mqi f = ypa.b(zg3.D);
    public static final mqi g = ypa.b(zg3.E);
    public static final mqi h = ypa.b(zg3.F);
    public static final long j = SystemClock.elapsedRealtime();

    public static SharedPreferences a() {
        Object value = g.getValue();
        value.getClass();
        return (SharedPreferences) value;
    }

    public static String b() {
        Object value = h.getValue();
        value.getClass();
        return (String) value;
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
        e = new WeakReference(activity);
        Function1 function1 = i;
        if (function1 != null) {
            function1.invoke(activity);
        }
        i = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
