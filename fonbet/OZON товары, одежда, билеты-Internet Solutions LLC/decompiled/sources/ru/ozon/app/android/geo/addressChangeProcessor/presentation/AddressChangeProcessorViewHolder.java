package ru.ozon.app.android.geo.addressChangeProcessor.presentation;

import Pc.a;
import Vg.d;
import android.view.View;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d20.AbstractC6065b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addressChangeProcessor.presentation.AddressChangeProcessorVO;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HBe\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0018\u0010\u0016\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001e\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010F\u001a\n E*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorViewHolder;", "Ld20/b;", "Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO;", "Ll10/i;", "container", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/location/AddressLocalStore;", "addressLocalStore", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManager", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStore", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "viewModelProvider", "<init>", "(Ll10/i;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/location/AddressLocalStore;Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;LVg/d;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;LPc/a;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "closeFlowAndUpdateAddress", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "widgetId", "processTwoActions", "(Lru/ozon/uni/atoms/af/AtomAction;J)V", "", "actionJson", "processAction", "(Ljava/lang/String;J)V", "", "checkNeedCloseFlow", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO;)V", "Ll10/i;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/location/AddressLocalStore;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "LVg/d;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "LPc/a;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "kotlin.jvm.PlatformType", "viewModel", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressChangeProcessorViewHolder extends AbstractC6065b<AddressChangeProcessorVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AddressLocalStore addressLocalStore;

    @NotNull
    private final AddressUiInfoViewModel addressUiInfoViewModel;

    @NotNull
    private final AddressUpdateManager addressUpdateManager;

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStore;

    @NotNull
    private final JsonParser jsonDeserializer;
    private final View metricView;

    @NotNull
    private final ComposerNavigator navigator;
    private final AddToCartViewModel viewModel;

    @NotNull
    private final a<AddToCartViewModel> viewModelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorViewHolder$Companion;", "", "<init>", "()V", "ACTION_ID_PERFORM_TWO_ACTIONS", "", "ACTION_ID_CHECKOUT_POP_AND_REFRESH", "ACTION_ID_CHECKOUT_DISMISS_AND_REFRESH", "ACTION_ID_ADD_TO_CART", "ACTION_PARAM_FIRST_ACTION", "ACTION_PARAM_SECOND_ACTION", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddressChangeProcessorViewHolder(@NotNull i container, @NotNull AreaLocalStore areaLocalStore, @NotNull AddressLocalStore addressLocalStore, @NotNull AddressUiInfoViewModel addressUiInfoViewModel, @NotNull AddressUpdateManager addressUpdateManager, @NotNull CheckoutPrefetchController checkoutPrefetchController, @NotNull d customActionHandlersStore, @NotNull ComposerNavigator navigator, @NotNull JsonParser jsonDeserializer, @NotNull a<AddToCartViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(addressLocalStore, "addressLocalStore");
        Intrinsics.checkNotNullParameter(addressUiInfoViewModel, "addressUiInfoViewModel");
        Intrinsics.checkNotNullParameter(addressUpdateManager, "addressUpdateManager");
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.container = container;
        this.areaLocalStore = areaLocalStore;
        this.addressLocalStore = addressLocalStore;
        this.addressUiInfoViewModel = addressUiInfoViewModel;
        this.addressUpdateManager = addressUpdateManager;
        this.checkoutPrefetchController = checkoutPrefetchController;
        this.customActionHandlersStore = customActionHandlersStore;
        this.navigator = navigator;
        this.jsonDeserializer = jsonDeserializer;
        this.viewModelProvider = viewModelProvider;
        AddToCartViewModel addToCartViewModel = (AddToCartViewModel) new z0(container.b0().b(), new z0.c() { // from class: ru.ozon.app.android.geo.addressChangeProcessor.presentation.AddressChangeProcessorViewHolder$special$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = AddressChangeProcessorViewHolder.this.viewModelProvider;
                AddToCartViewModel addToCartViewModel2 = (AddToCartViewModel) aVar.get();
                Intrinsics.g(addToCartViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addToCartViewModel2;
            }
        }).a(AddToCartViewModel.class);
        addToCartViewModel.attach(container.X());
        this.viewModel = addToCartViewModel;
    }

    private final boolean checkNeedCloseFlow(AtomAction action) {
        Map<String, String> params;
        String str;
        if (!Intrinsics.d(action.getId(), "performTwoActions") || (params = action.getParams()) == null || (str = params.get("secondAction")) == null) {
            return true;
        }
        return (h.t(str, "checkoutPopAndRefresh", false) || h.t(str, "checkoutDismissAndRefresh", false)) ? false : true;
    }

    private final void closeFlowAndUpdateAddress(ComposerReferences references) {
        if (ComposerExtKt.isFlow(references.getContainer())) {
            ComposerExtKt.closeFlow(references.getContainer());
        }
        this.addressUpdateManager.addressChanged();
    }

    private final void processAction(String actionJson, long widgetId) {
        C10727i.c(K.a(this.container.K().d()), new AddressChangeProcessorViewHolder$processAction$$inlined$CoroutineExceptionHandler$1(J.f105405n0), null, new AddressChangeProcessorViewHolder$processAction$2(this, actionJson, widgetId, null), 2);
    }

    private final void processTwoActions(AtomAction action, long widgetId) {
        AtomAction.Click click;
        Map<String, String> params;
        String str;
        String str2;
        if (!(action instanceof AtomAction.Click) || (params = (click = (AtomAction.Click) action).getParams()) == null || (str = params.get("firstAction")) == null) {
            return;
        }
        processAction(str, widgetId);
        Map<String, String> params2 = click.getParams();
        if (params2 == null || (str2 = params2.get("secondAction")) == null) {
            return;
        }
        processAction(str2, widgetId);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.actionHandler = new ActionHandler.Builder(this.container, this).customActionHandlers(new AddressChangeProcessorViewHolder$onWidgetCreated$1(this)).buildHandler();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r0 == null) goto L32;
     */
    @Override // d20.AbstractC6065b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull AddressChangeProcessorVO item) {
        Unit unit;
        Long areaId;
        Intrinsics.checkNotNullParameter(item, "item");
        AddressChangeProcessorVO.LocationInfo locationInfo = item.getLocationInfo();
        boolean z11 = false;
        if (locationInfo != null) {
            long storedAreaId = this.areaLocalStore.getStoredAreaId();
            Long areaId2 = locationInfo.getAreaId();
            if (areaId2 != null && storedAreaId == areaId2.longValue()) {
                z11 = true;
            }
        }
        AddressChangeProcessorVO.LocationInfo locationInfo2 = item.getLocationInfo();
        if (locationInfo2 != null && (areaId = locationInfo2.getAreaId()) != null) {
            this.areaLocalStore.storeArea(areaId.longValue());
        }
        AddressChangeProcessorVO.LocationInfo locationInfo3 = item.getLocationInfo();
        this.addressLocalStore.storeAddress(locationInfo3 != null ? locationInfo3.getAddressId() : null);
        AtomAction action = item.getAction();
        if (action != null) {
            if (checkNeedCloseFlow(action)) {
                e V11 = this.container.V();
                Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
                closeFlowAndUpdateAddress((ComposerReferences) V11);
            }
            if (Intrinsics.d(action.getId(), "performTwoActions")) {
                processTwoActions(action, item.getId());
                unit = Unit.f71690a;
            } else {
                Function1<? super AtomAction, Unit> function1 = this.actionHandler;
                if (function1 != null) {
                    function1.invoke(action);
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
            }
        }
        String redirectLink = item.getRedirectLink();
        if (redirectLink != null) {
            e V12 = this.container.V();
            Intrinsics.g(V12, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            closeFlowAndUpdateAddress((ComposerReferences) V12);
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.navigator, redirectLink, null, 2, null);
        } else {
            if (!z11) {
                this.addressUiInfoViewModel.updateTabConfig();
            }
            this.checkoutPrefetchController.removeAllCache();
        }
        this.addressUiInfoViewModel.updateAddressCell("main");
        this.container.M().m(item.getId());
    }
}
