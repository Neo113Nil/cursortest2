package ru.ozon.app.android.cart.configurator;

import Ae.C2399j;
import Ae.C2408n0;
import a00.h;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/configurator/AsyncCartConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProviderWrapper", "<init>", "(Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "onPause", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "", "checkBoxViewIsAnimationsEnabledPreviousValue", "Z", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncCartConfigurator extends ComposerScreenConfig.PageConfigurator {
    private AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final AsyncCartViewModelProviderWrapper asyncCartViewModelProviderWrapper;
    private final boolean checkBoxViewIsAnimationsEnabledPreviousValue;

    public AsyncCartConfigurator(@NotNull AsyncCartViewModelProviderWrapper asyncCartViewModelProviderWrapper) {
        Intrinsics.checkNotNullParameter(asyncCartViewModelProviderWrapper, "asyncCartViewModelProviderWrapper");
        this.asyncCartViewModelProviderWrapper = asyncCartViewModelProviderWrapper;
        this.checkBoxViewIsAnimationsEnabledPreviousValue = CheckBoxView.INSTANCE.isAnimationsEnabled();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        h viewModelOwnerProvider;
        ConfiguratorReferences references;
        C7475g composerWidgetComponentStorage;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (viewModelOwnerProvider = references2.getViewModelOwnerProvider()) == null || (references = getReferences()) == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) {
            return;
        }
        AsyncCartViewModel asyncCartViewModel = this.asyncCartViewModelProviderWrapper.get(viewModelOwnerProvider, composerWidgetComponentStorage);
        this.asyncCartViewModel = asyncCartViewModel;
        C2399j.C(new C2408n0(asyncCartViewModel.isProcessing(), new AsyncCartConfigurator$onCreate$1(this, null)), K.a(owner));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        AsyncCartViewModel asyncCartViewModel = this.asyncCartViewModel;
        if (asyncCartViewModel != null) {
            asyncCartViewModel.executePendingRequestsImmediately();
        }
        CheckBoxView.INSTANCE.setAnimationsEnabled(this.checkBoxViewIsAnimationsEnabledPreviousValue);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        CheckBoxView.INSTANCE.setAnimationsEnabled(false);
    }
}
