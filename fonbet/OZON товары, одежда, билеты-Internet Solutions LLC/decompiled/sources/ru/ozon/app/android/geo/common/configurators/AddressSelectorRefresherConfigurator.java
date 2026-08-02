package ru.ozon.app.android.geo.common.configurators;

import A00.a;
import Ay.C2452a;
import Ay.b;
import androidx.lifecycle.J;
import i10.h;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$State;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/geo/common/configurators/AddressSelectorRefresherConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManager", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "tabConfigUpdateDelegate", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "cartScreenStateHolder", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$State;", "pdpScreenStateHolder", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$State;)V", "", "onComposerInitialized", "()V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$State;", "Lnc/b;", "addressUpdateDisposable", "Lnc/b;", "Li10/h$b;", "getPostProcessingInfo", "()Li10/h$b;", "postProcessingInfo", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressSelectorRefresherConfigurator extends ComposerScreenConfig.PageConfigurator {
    private InterfaceC8487b addressUpdateDisposable;

    @NotNull
    private final AddressUpdateManager addressUpdateManager;

    @NotNull
    private final CartEventsController cartEventController;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final CartScreenStateHolder cartScreenStateHolder;

    @NotNull
    private final PdpScreenStateHolder$State pdpScreenStateHolder;

    @NotNull
    private final TabConfigUpdateDelegate tabConfigUpdateDelegate;

    public AddressSelectorRefresherConfigurator(@NotNull AddressUpdateManager addressUpdateManager, @NotNull TabConfigUpdateDelegate tabConfigUpdateDelegate, @NotNull CartScreenStateHolder cartScreenStateHolder, @NotNull CartEventsController cartEventController, @NotNull CartModeManager cartModeManager, @NotNull PdpScreenStateHolder$State pdpScreenStateHolder) {
        Intrinsics.checkNotNullParameter(addressUpdateManager, "addressUpdateManager");
        Intrinsics.checkNotNullParameter(tabConfigUpdateDelegate, "tabConfigUpdateDelegate");
        Intrinsics.checkNotNullParameter(cartScreenStateHolder, "cartScreenStateHolder");
        Intrinsics.checkNotNullParameter(cartEventController, "cartEventController");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(pdpScreenStateHolder, "pdpScreenStateHolder");
        this.addressUpdateManager = addressUpdateManager;
        this.tabConfigUpdateDelegate = tabConfigUpdateDelegate;
        this.cartScreenStateHolder = cartScreenStateHolder;
        this.cartEventController = cartEventController;
        this.cartModeManager = cartModeManager;
        this.pdpScreenStateHolder = pdpScreenStateHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.b getPostProcessingInfo() {
        return new h.b(this.pdpScreenStateHolder.isResumed() ? new a.C.C0000a() : Intrinsics.d(MiniAppExtKt.getMiniAppName(getContainer().a()), "supermarket") ? new a.C.C0000a() : null, null, 2);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        p<Unit> observeOn = this.addressUpdateManager.observeAddressChange().observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observeRoute(observeOn, getOwner(), new AddressSelectorRefresherConfigurator$onComposerInitialized$1(this), new AddressSelectorRefresherConfigurator$onComposerInitialized$2(Lm0.a.f17149a));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        this.addressUpdateDisposable = this.addressUpdateManager.observeAddressChange().observeOn(C8125a.a()).subscribe(new C2452a(new AddressSelectorRefresherConfigurator$onStart$1(this)), new b(new AddressSelectorRefresherConfigurator$onStart$2(Lm0.a.f17149a)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        InterfaceC8487b interfaceC8487b = this.addressUpdateDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }
}
