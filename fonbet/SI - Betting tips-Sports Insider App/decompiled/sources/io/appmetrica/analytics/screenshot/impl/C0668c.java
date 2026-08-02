package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0669d f15350a;

    public C0668c(C0669d c0669d) {
        this.f15350a = c0669d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i5 = AbstractC0667b.f15349a[activityEvent.ordinal()];
        try {
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C0669d.d(this.f15350a));
            } else {
                C0675j c0675j = this.f15350a.f15353c;
                if (c0675j == null || !c0675j.f15369a) {
                    return;
                }
                activity.registerScreenCaptureCallback(this.f15350a.f15351a.getContext().getMainExecutor(), C0669d.d(this.f15350a));
            }
        } catch (Throwable unused) {
        }
    }
}
