package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15355a;

    public d0(g0 g0Var) {
        this.f15355a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C0679n c0679n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = kotlin.collections.e0.f19204a;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C0688x) g0Var.f15360b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f15361c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c0679n.f15386b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0679n c0679n = this.f15355a.f15363e;
        if (this.f15355a.f15362d || c0679n == null || !c0679n.f15385a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f15355a.f15359a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new androidx.transition.i(this.f15355a, this, c0679n, 2));
    }
}
