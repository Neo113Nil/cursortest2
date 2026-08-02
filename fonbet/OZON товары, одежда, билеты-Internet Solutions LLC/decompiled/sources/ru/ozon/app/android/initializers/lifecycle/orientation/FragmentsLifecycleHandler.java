package ru.ozon.app.android.initializers.lifecycle.orientation;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.lifecycle.ActivityLifecycleCallbacksAdapter;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsLifecycleHandler;", "Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "Landroidx/fragment/app/G$m;", "Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsAppearanceUpdater;", "fragmentsAppearanceUpdater", "Lru/ozon/app/android/initializers/lifecycle/orientation/BottomSheetFragmentsAppearanceUpdater;", "bottomSheetFragmentsAppearanceUpdater", "<init>", "(Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsAppearanceUpdater;Lru/ozon/app/android/initializers/lifecycle/orientation/BottomSheetFragmentsAppearanceUpdater;)V", "Landroid/app/Activity;", "activity", "", "registerFragmentLifecycleCallbacks", "(Landroid/app/Activity;)V", "unregisterFragmentLifecycleCallbacks", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "Landroidx/fragment/app/G;", "fm", "Landroidx/fragment/app/m;", "f", "onFragmentStarted", "(Landroidx/fragment/app/G;Landroidx/fragment/app/m;)V", "Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsAppearanceUpdater;", "Lru/ozon/app/android/initializers/lifecycle/orientation/BottomSheetFragmentsAppearanceUpdater;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FragmentsLifecycleHandler extends G.m implements ActivityLifecycleCallbacksAdapter {

    @NotNull
    private final BottomSheetFragmentsAppearanceUpdater bottomSheetFragmentsAppearanceUpdater;

    @NotNull
    private final FragmentsAppearanceUpdater fragmentsAppearanceUpdater;

    public FragmentsLifecycleHandler(@NotNull FragmentsAppearanceUpdater fragmentsAppearanceUpdater, @NotNull BottomSheetFragmentsAppearanceUpdater bottomSheetFragmentsAppearanceUpdater) {
        Intrinsics.checkNotNullParameter(fragmentsAppearanceUpdater, "fragmentsAppearanceUpdater");
        Intrinsics.checkNotNullParameter(bottomSheetFragmentsAppearanceUpdater, "bottomSheetFragmentsAppearanceUpdater");
        this.fragmentsAppearanceUpdater = fragmentsAppearanceUpdater;
        this.bottomSheetFragmentsAppearanceUpdater = bottomSheetFragmentsAppearanceUpdater;
    }

    private final void registerFragmentLifecycleCallbacks(Activity activity) {
        G supportFragmentManager;
        r rVar = activity instanceof r ? (r) activity : null;
        if (rVar == null || (supportFragmentManager = rVar.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.Y0(this, true);
    }

    private final void unregisterFragmentLifecycleCallbacks(Activity activity) {
        G supportFragmentManager;
        r rVar = activity instanceof r ? (r) activity : null;
        if (rVar == null || (supportFragmentManager = rVar.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.t1(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        registerFragmentLifecycleCallbacks(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        unregisterFragmentLifecycleCallbacks(activity);
        q.f64554a.b(activity);
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

    @Override // androidx.fragment.app.G.m
    public void onFragmentStarted(@NotNull G fm, @NotNull ComponentCallbacksC5392m f7) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f7, "f");
        this.fragmentsAppearanceUpdater.onFragmentStarted(f7, f7.getResources().getConfiguration().orientation);
        this.bottomSheetFragmentsAppearanceUpdater.onFragmentStarted(f7);
    }
}
