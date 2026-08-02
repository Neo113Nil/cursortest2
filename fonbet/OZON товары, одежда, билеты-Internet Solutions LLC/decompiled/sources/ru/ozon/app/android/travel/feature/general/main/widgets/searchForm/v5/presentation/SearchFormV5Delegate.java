package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnScreenRefreshCallbacks;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5Delegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnScreenRefreshCallbacks;", "callbacks", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnScreenRefreshCallbacks;)V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "observeLifecycle", "()V", "Ll10/i;", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnScreenRefreshCallbacks;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5Delegate implements DefaultLifecycleObserver {

    @NotNull
    private final ReturnScreenRefreshCallbacks callbacks;

    @NotNull
    private final i container;

    public SearchFormV5Delegate(@NotNull i container, @NotNull ReturnScreenRefreshCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.container = container;
        this.callbacks = callbacks;
    }

    public final void observeLifecycle() {
        this.container.Q().g().getLifecycle().a(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.callbacks.onStartTimer();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.callbacks.onRefreshData();
    }
}
