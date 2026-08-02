package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final L f66924b = new L();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f66925a;

    @NotNull
    public static L c() {
        return f66924b;
    }

    public final void a(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.f66925a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f66925a = null;
        }
    }

    public final Activity b() {
        WeakReference<Activity> weakReference = this.f66925a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void d(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.f66925a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f66925a = new WeakReference<>(activity);
        }
    }
}
