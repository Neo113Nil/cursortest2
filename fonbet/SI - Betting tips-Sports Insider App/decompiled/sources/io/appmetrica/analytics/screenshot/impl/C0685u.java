package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0686v f15394a;

    public C0685u(C0686v c0686v) {
        this.f15394a = c0686v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i5 = AbstractC0684t.f15393a[activityEvent.ordinal()];
        try {
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                this.f15394a.f15395a.getContext().getContentResolver().unregisterContentObserver(this.f15394a.f15398d);
            } else {
                C0676k c0676k = this.f15394a.f15397c;
                if (c0676k == null || !c0676k.f15372a) {
                    return;
                }
                this.f15394a.f15395a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f15394a.f15398d);
            }
        } catch (Throwable unused) {
        }
    }
}
