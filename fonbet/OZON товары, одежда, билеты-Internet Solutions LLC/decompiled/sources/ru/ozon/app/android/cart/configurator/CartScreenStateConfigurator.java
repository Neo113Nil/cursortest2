package ru.ozon.app.android.cart.configurator;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.flags.CartScreenStateNewLogic;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartScreenStateConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "cartScreenStateHolder", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "currentMiniAppHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroidx/lifecycle/J;", "owner", "", "updateState", "(Landroidx/lifecycle/J;)V", "onComposerInitialized", "()V", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "miniApp", "Ljava/lang/String;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartScreenStateConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CartScreenStateHolder cartScreenStateHolder;

    @NotNull
    private final CurrentMiniAppHolder currentMiniAppHolder;

    @NotNull
    private final FeatureChecker featureChecker;
    private String miniApp;

    public CartScreenStateConfigurator(@NotNull CartScreenStateHolder cartScreenStateHolder, @NotNull CurrentMiniAppHolder currentMiniAppHolder, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(cartScreenStateHolder, "cartScreenStateHolder");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.cartScreenStateHolder = cartScreenStateHolder;
        this.currentMiniAppHolder = currentMiniAppHolder;
        this.featureChecker = featureChecker;
    }

    private final void updateState(J owner) {
        if (!this.featureChecker.isEnabled(CartScreenStateNewLogic.INSTANCE)) {
            this.cartScreenStateHolder.setState(owner.getLifecycle().b());
            return;
        }
        String str = this.miniApp;
        if (str != null) {
            this.cartScreenStateHolder.setState(owner.getLifecycle().b(), str);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        this.miniApp = this.currentMiniAppHolder.getCurrentMiniApp();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateState(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateState(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateState(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateState(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateState(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateState(owner);
    }
}
