package ru.ozon.app.android.travel.feature.entry;

import Ib.a;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.lifecycle.ActivityLifecycleCallbacksAdapter;
import ru.ozon.app.android.warmup.WarmupAdaptersFacade;
import xZ.InterfaceC10682a;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0017\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/TravelWarmUpAdaptersCallback;", "Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "Lcom/squareup/moshi/Moshi;", "moshi", "LIb/a;", "Lru/ozon/app/android/warmup/WarmupAdaptersFacade;", "warmupAdaptersFacade", "<init>", "(Lcom/squareup/moshi/Moshi;LIb/a;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "Lcom/squareup/moshi/Moshi;", "LIb/a;", "", "isWarmUp", "Z", "ru/ozon/app/android/travel/feature/entry/TravelWarmUpAdaptersCallback$fragmentListener$1", "fragmentListener", "Lru/ozon/app/android/travel/feature/entry/TravelWarmUpAdaptersCallback$fragmentListener$1;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelWarmUpAdaptersCallback implements ActivityLifecycleCallbacksAdapter {

    @NotNull
    private final TravelWarmUpAdaptersCallback$fragmentListener$1 fragmentListener;
    private boolean isWarmUp;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final a<WarmupAdaptersFacade> warmupAdaptersFacade;

    public TravelWarmUpAdaptersCallback(@NotNull Moshi moshi, @NotNull a<WarmupAdaptersFacade> warmupAdaptersFacade) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(warmupAdaptersFacade, "warmupAdaptersFacade");
        this.moshi = moshi;
        this.warmupAdaptersFacade = warmupAdaptersFacade;
        this.fragmentListener = new TravelWarmUpAdaptersCallback$fragmentListener$1(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if ((activity instanceof InterfaceC10682a) && (activity instanceof r)) {
            ((r) activity).getSupportFragmentManager().Y0(this.fragmentListener, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if ((activity instanceof InterfaceC10682a) && (activity instanceof r)) {
            ((r) activity).getSupportFragmentManager().t1(this.fragmentListener);
        }
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
