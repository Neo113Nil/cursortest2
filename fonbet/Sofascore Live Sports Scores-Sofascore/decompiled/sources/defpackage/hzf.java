package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.jzf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hzf {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, d6b d6bVar) {
        activity.getClass();
        d6bVar.getClass();
        if (activity instanceof u6b) {
            g6b lifecycle = ((u6b) activity).getLifecycle();
            if (lifecycle instanceof y6b) {
                ((y6b) lifecycle).g(d6bVar);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            jzf.a.Companion.getClass();
            izf.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new jzf(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
