package ru.ozon.app.android.geo.addressChangeProcessor.di;

import Pc.a;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\u00060\u001ej\u0002`\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001e\u0010+\u001a\u00060)j\u0002`*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"ru/ozon/app/android/geo/addressChangeProcessor/di/AddressChangeProcessorWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/geo/addressChangeProcessor/di/AddressChangeProcessorWidgetComponent;", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "addressComponentApi", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "getAddressUiInfoViewModel", "()Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManager", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "getAddressUpdateManager", "()Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/location/AreaLocalStore;", "getAreaLocalStore", "()Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/location/AddressLocalStore;", "addressLocalStore", "Lru/ozon/app/android/location/AddressLocalStore;", "getAddressLocalStore", "()Lru/ozon/app/android/location/AddressLocalStore;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "getCheckoutPrefetchController", "()Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStore", "LVg/d;", "getCustomActionHandlersStore", "()LVg/d;", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/domain/CartService;", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressChangeProcessorWidgetComponent$Companion$create$1$1 implements AddressChangeProcessorWidgetComponent {
    private final AddressComponentApi addressComponentApi;
    private final AddressLocalStore addressLocalStore;
    private final AddressUiInfoViewModel addressUiInfoViewModel;
    private final AddressUpdateManager addressUpdateManager;
    private final AreaLocalStore areaLocalStore;
    private final CartService cartService;
    private final CheckoutPrefetchController checkoutPrefetchController;
    private final ComposerNavigator composerNavigator;
    private final d customActionHandlersStore;
    private final JsonParser jsonDeserializer;
    private final a<AddToCartViewModel> viewModelProvider;

    AddressChangeProcessorWidgetComponent$Companion$create$1$1(final C7475g c7475g) {
        AddressComponentApi addressComponentApi = (AddressComponentApi) c7475g.getComponent(AddressComponentApi.class);
        this.addressComponentApi = addressComponentApi;
        this.addressUiInfoViewModel = addressComponentApi.getAddressUiInfoViewModel();
        this.addressUpdateManager = addressComponentApi.getAddressManager();
        this.areaLocalStore = ((LocationComponentApi) c7475g.getComponent(LocationComponentApi.class)).getAreaLocalStore();
        this.addressLocalStore = ((LocationComponentApi) c7475g.getComponent(LocationComponentApi.class)).getAddressLocalStore();
        this.checkoutPrefetchController = ((CheckoutPrefetchApi) c7475g.getComponent(CheckoutPrefetchApi.class)).getCheckoutPrefetchController();
        this.customActionHandlersStore = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
        this.composerNavigator = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getComposerNavigator();
        this.jsonDeserializer = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getJsonDeserializer();
        this.cartService = ((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService();
        this.viewModelProvider = new a() { // from class: ly.a
            @Override // Pc.a
            public final Object get() {
                AddToCartViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = AddressChangeProcessorWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$0(AddressChangeProcessorWidgetComponent$Companion$create$1$1.this, c7475g);
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartViewModel viewModelProvider$lambda$0(AddressChangeProcessorWidgetComponent$Companion$create$1$1 addressChangeProcessorWidgetComponent$Companion$create$1$1, C7475g c7475g) {
        return new AddToCartViewModel(addressChangeProcessorWidgetComponent$Companion$create$1$1.cartService, addressChangeProcessorWidgetComponent$Companion$create$1$1.getJsonDeserializer(), ((CartComponentApi) c7475g.getComponent(CartComponentApi.class)).getCartEventsController());
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public AddressLocalStore getAddressLocalStore() {
        return this.addressLocalStore;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public AddressUiInfoViewModel getAddressUiInfoViewModel() {
        return this.addressUiInfoViewModel;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public AddressUpdateManager getAddressUpdateManager() {
        return this.addressUpdateManager;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public AreaLocalStore getAreaLocalStore() {
        return this.areaLocalStore;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public CheckoutPrefetchController getCheckoutPrefetchController() {
        return this.checkoutPrefetchController;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public ComposerNavigator getComposerNavigator() {
        return this.composerNavigator;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public d getCustomActionHandlersStore() {
        return this.customActionHandlersStore;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public JsonParser getJsonDeserializer() {
        return this.jsonDeserializer;
    }

    @Override // ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent
    public a<AddToCartViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
