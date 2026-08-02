package ih0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ih0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7080a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Long f66478d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f66479a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f66480b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f66481c;

    public final Long b(@NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        if (this.f66480b || this.f66481c) {
            return null;
        }
        Long l11 = f66478d;
        Long l12 = (Long) this.f66479a.get(serviceName);
        if (l11 == null || l12 == null) {
            return null;
        }
        this.f66481c = true;
        return Long.valueOf(l12.longValue() - l11.longValue());
    }

    public final void c(@NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        ConcurrentHashMap concurrentHashMap = this.f66479a;
        if (concurrentHashMap.containsKey(serviceName)) {
            return;
        }
        concurrentHashMap.put(serviceName, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f66480b = true;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
