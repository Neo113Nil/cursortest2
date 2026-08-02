package ru.ozon.app.android.initializers.lifecycle;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.lifecycle.orientation.FragmentsAppearanceUpdater;
import ru.ozon.app.android.platform.lifecycle.activity.ActivityLifeCycleHolder;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/ConfigChangesComponentCallback;", "Landroid/content/ComponentCallbacks;", "activityLifeCycleHolder", "Lru/ozon/app/android/platform/lifecycle/activity/ActivityLifeCycleHolder;", "fragmentsAppearanceUpdater", "Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsAppearanceUpdater;", "<init>", "(Lru/ozon/app/android/platform/lifecycle/activity/ActivityLifeCycleHolder;Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsAppearanceUpdater;)V", "onLowMemory", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigChangesComponentCallback implements ComponentCallbacks {

    @NotNull
    private final ActivityLifeCycleHolder activityLifeCycleHolder;

    @NotNull
    private final FragmentsAppearanceUpdater fragmentsAppearanceUpdater;

    public ConfigChangesComponentCallback(@NotNull ActivityLifeCycleHolder activityLifeCycleHolder, @NotNull FragmentsAppearanceUpdater fragmentsAppearanceUpdater) {
        Intrinsics.checkNotNullParameter(activityLifeCycleHolder, "activityLifeCycleHolder");
        Intrinsics.checkNotNullParameter(fragmentsAppearanceUpdater, "fragmentsAppearanceUpdater");
        this.activityLifeCycleHolder = activityLifeCycleHolder;
        this.fragmentsAppearanceUpdater = fragmentsAppearanceUpdater;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.fragmentsAppearanceUpdater.onConfigurationChanged(this.activityLifeCycleHolder.getActiveActivity(), newConfig);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
