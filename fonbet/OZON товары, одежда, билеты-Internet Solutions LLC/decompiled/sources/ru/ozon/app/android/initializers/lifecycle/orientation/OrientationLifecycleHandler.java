package ru.ozon.app.android.initializers.lifecycle.orientation;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate;
import ru.ozon.app.android.utils.lifecycle.ActivityLifecycleCallbacksAdapter;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/orientation/OrientationLifecycleHandler;", "Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "screenOrientationDelegate", "Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;", "<init>", "(Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrientationLifecycleHandler implements ActivityLifecycleCallbacksAdapter {

    @NotNull
    private final ScreenOrientationDelegate screenOrientationDelegate;

    public OrientationLifecycleHandler(@NotNull ScreenOrientationDelegate screenOrientationDelegate) {
        Intrinsics.checkNotNullParameter(screenOrientationDelegate, "screenOrientationDelegate");
        this.screenOrientationDelegate = screenOrientationDelegate;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.screenOrientationDelegate.requestOrientation(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityStopped(this, activity);
    }
}
