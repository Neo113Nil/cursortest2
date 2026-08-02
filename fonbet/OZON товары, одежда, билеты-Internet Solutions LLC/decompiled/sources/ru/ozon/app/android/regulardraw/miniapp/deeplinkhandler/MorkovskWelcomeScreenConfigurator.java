package ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler;

import a00.C4908c;
import a00.C4911f;
import androidx.activity.C;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.uikit.utils.StatusBarController;

@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/deeplinkhandler/MorkovskWelcomeScreenConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "ru/ozon/app/android/regulardraw/miniapp/deeplinkhandler/MorkovskWelcomeScreenConfigurator$backPressedCallback$1", "backPressedCallback", "Lru/ozon/app/android/regulardraw/miniapp/deeplinkhandler/MorkovskWelcomeScreenConfigurator$backPressedCallback$1;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MorkovskWelcomeScreenConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final MorkovskWelcomeScreenConfigurator$backPressedCallback$1 backPressedCallback = new C() { // from class: ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler.MorkovskWelcomeScreenConfigurator$backPressedCallback$1
        @Override // androidx.activity.C
        public void handleOnBackPressed() {
        }
    };

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
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler.MorkovskWelcomeScreenConfigurator$onComposerInitialized$1
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        r a11 = getContainer().a();
        if (a11 != null) {
            a11.getOnBackPressedDispatcher().h(owner, this.backPressedCallback);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        remove();
    }
}
