package yZ;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.activity.ActivityC5043j;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EZ.h f106393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10874a f106394b;

    public d(@NotNull EZ.h navigatorHolder, @NotNull InterfaceC10874a activityNavigationChecker) {
        Intrinsics.checkNotNullParameter(navigatorHolder, "navigatorHolder");
        Intrinsics.checkNotNullParameter(activityNavigationChecker, "activityNavigationChecker");
        this.f106393a = navigatorHolder;
        this.f106394b = activityNavigationChecker;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!(activity instanceof r) || (activity instanceof f) || this.f106394b.a((r) activity)) {
            return;
        }
        h.a(new EZ.g((r) activity, null, null, null, 14, null), this.f106393a, (ActivityC5043j) activity);
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
