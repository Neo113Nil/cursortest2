package x20;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity;

/* renamed from: x20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10649a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10651c f104941a;

    public C10649a(@NotNull C10651c shakerSensorWrapper) {
        Intrinsics.checkNotNullParameter(shakerSensorWrapper, "shakerSensorWrapper");
        this.f104941a = shakerSensorWrapper;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof OzonDebugMenuActivity) {
            this.f104941a.i(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof OzonDebugMenuActivity) {
            this.f104941a.i(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof OzonDebugMenuActivity) {
            return;
        }
        this.f104941a.j();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof OzonDebugMenuActivity) {
            return;
        }
        this.f104941a.h();
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
