package ru.ozon.app.android.checkoutcomposer.rfbsSplit.configurator;

import androidx.lifecycle.C5423j;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\f\u0010\b\u001a\u00020\u0007*\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/configurator/CheckoutClearCacheConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "checkoutPrefetchController", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "<init>", "(Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;)V", "onComposerInitialized", "", "observeEventsOnRefreshAndSwipe", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutClearCacheConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;

    public CheckoutClearCacheConfigurator(@NotNull CheckoutPrefetchController checkoutPrefetchController) {
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        this.checkoutPrefetchController = checkoutPrefetchController;
    }

    private final void observeEventsOnRefreshAndSwipe(ConfiguratorReferences configuratorReferences) {
        C5423j events = configuratorReferences.getController().getEvents();
        T t2 = new T();
        t2.a(events, new CheckoutClearCacheConfigurator$inlined$sam$i$androidx_lifecycle_Observer$0(new CheckoutClearCacheConfigurator$observeEventsOnRefreshAndSwipe$$inlined$filterIsInstance$1(t2)));
        t2.observe(getOwner(), new CheckoutClearCacheConfigurator$sam$androidx_lifecycle_Observer$0(new CheckoutClearCacheConfigurator$observeEventsOnRefreshAndSwipe$1(this)));
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references != null) {
            observeEventsOnRefreshAndSwipe(references);
        }
    }
}
