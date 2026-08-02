package ru.ozon.app.android.travel.pageconfigurator.refreshOnStart;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/refreshOnStart/TravelRefreshOnRestartPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "", "shouldSkipRefresh", "Z", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRefreshOnRestartPageConfigurator extends ComposerScreenConfig.PageConfigurator implements DefaultLifecycleObserver {
    private boolean shouldSkipRefresh;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.shouldSkipRefresh = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.shouldSkipRefresh) {
            this.shouldSkipRefresh = false;
            return;
        }
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }
}
