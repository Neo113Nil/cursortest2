package ru.ozon.app.android.regulardraw.deeplinkhandlers;

import a00.C4908c;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.uikit.utils.StatusBarController;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/deeplinkhandlers/PrizesConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onComposerInitialized", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PrizesConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C4911f ownerContainer;
        final ComponentCallbacksC5392m c11;
        ConfiguratorReferences references;
        C4911f ownerContainer2;
        C4908c g10;
        AbstractC5434v lifecycle;
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (references = getReferences()) == null || (ownerContainer2 = references.getOwnerContainer()) == null || (g10 = ownerContainer2.g()) == null || (lifecycle = g10.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.regulardraw.deeplinkhandlers.PrizesConfigurator$onComposerInitialized$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                StatusBarController statusBarController = StatusBarController.INSTANCE;
                ComponentCallbacksC5392m componentCallbacksC5392m = ComponentCallbacksC5392m.this;
                StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
                statusBarController.setStatusBarBackgroundColor(componentCallbacksC5392m, newState, 0);
                StatusBarController.setStatusBarContentColor$default(statusBarController, ComponentCallbacksC5392m.this, newState, true, false, 8, null);
            }
        });
    }
}
