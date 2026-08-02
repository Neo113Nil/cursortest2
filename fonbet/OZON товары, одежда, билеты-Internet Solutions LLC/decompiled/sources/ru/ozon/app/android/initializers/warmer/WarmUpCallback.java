package ru.ozon.app.android.initializers.warmer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.flags.CartWarmupAdaptersConfigurationFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.pdp.flags.PdpWarmupAdaptersConfigurationFlag;
import ru.ozon.app.android.utils.lifecycle.ActivityLifecycleCallbacksAdapter;
import ru.ozon.app.android.warmup.flags.HomeWarmupAdaptersConfigurationFlag;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/initializers/warmer/WarmUpCallback;", "Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "moshiAdapterWarmer", "Lru/ozon/app/android/initializers/warmer/MoshiAdapterWarmer;", "<init>", "(Lru/ozon/app/android/initializers/warmer/MoshiAdapterWarmer;)V", "isWarmedUp", "", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WarmUpCallback implements ActivityLifecycleCallbacksAdapter {
    private boolean isWarmedUp;

    @NotNull
    private final MoshiAdapterWarmer moshiAdapterWarmer;

    public WarmUpCallback(@NotNull MoshiAdapterWarmer moshiAdapterWarmer) {
        Intrinsics.checkNotNullParameter(moshiAdapterWarmer, "moshiAdapterWarmer");
        this.moshiAdapterWarmer = moshiAdapterWarmer;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"CheckResult"})
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.isWarmedUp) {
            return;
        }
        this.isWarmedUp = true;
        MoshiAdapterWarmer moshiAdapterWarmer = this.moshiAdapterWarmer;
        FeatureFlag[] elements = {HomeWarmupAdaptersConfigurationFlag.INSTANCE, CartWarmupAdaptersConfigurationFlag.INSTANCE, PdpWarmupAdaptersConfigurationFlag.INSTANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        moshiAdapterWarmer.warmUpJsonAdapters(C7705l.j0(elements));
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
