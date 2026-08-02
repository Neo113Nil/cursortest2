package ru.ozon.app.android.cart.configurator;

import androidx.lifecycle.C5423j;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartPrefetchConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "cartPrefetchController", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "<init>", "(Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;)V", "onComposerInitialized", "", "observeFirstPageLoaded", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartPrefetchConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CartPrefetchController cartPrefetchController;

    public CartPrefetchConfigurator(@NotNull CartPrefetchController cartPrefetchController) {
        Intrinsics.checkNotNullParameter(cartPrefetchController, "cartPrefetchController");
        this.cartPrefetchController = cartPrefetchController;
    }

    private final void observeFirstPageLoaded() {
        InterfaceC7851b controller;
        C5423j events;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null || (events = controller.getEvents()) == null) {
            return;
        }
        T t2 = new T();
        t2.a(events, new CartPrefetchConfigurator$inlined$sam$i$androidx_lifecycle_Observer$0(new CartPrefetchConfigurator$observeFirstPageLoaded$$inlined$filterIsInstance$1(t2)));
        T t11 = new T();
        t11.a(t2, new CartPrefetchConfigurator$inlined$sam$i$androidx_lifecycle_Observer$0(new CartPrefetchConfigurator$observeFirstPageLoaded$$inlined$filter$1(t11)));
        t11.observe(getContainer().f(), new CartPrefetchConfigurator$sam$androidx_lifecycle_Observer$0(new CartPrefetchConfigurator$observeFirstPageLoaded$2(this)));
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        observeFirstPageLoaded();
    }
}
