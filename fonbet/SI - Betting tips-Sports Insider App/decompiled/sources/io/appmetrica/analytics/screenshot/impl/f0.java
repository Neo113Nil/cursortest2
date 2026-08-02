package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15358a;

    public f0(g0 g0Var) {
        this.f15358a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i5 = e0.f15357a[activityEvent.ordinal()];
        try {
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                this.f15358a.f15362d = true;
                return;
            }
            C0679n c0679n = this.f15358a.f15363e;
            if (c0679n == null || !c0679n.f15385a) {
                return;
            }
            this.f15358a.f15362d = false;
            g0 g0Var = this.f15358a;
            g0Var.f15361c.postDelayed(g0Var.f15364f, 0L);
        } catch (Throwable unused) {
        }
    }
}
