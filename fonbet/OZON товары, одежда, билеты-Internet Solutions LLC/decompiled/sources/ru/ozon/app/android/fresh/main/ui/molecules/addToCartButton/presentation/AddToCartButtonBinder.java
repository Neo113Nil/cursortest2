package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import WZ.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonView;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J5\u0010(\u001a\u00020\u0010*\u00020\b2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/JA\u0010\u0011\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\b2\b\u00101\u001a\u0004\u0018\u00010\n2\b\u00102\u001a\u0004\u0018\u00010\u000e2\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0010\u0018\u000103¢\u0006\u0004\b\u0011\u00106J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0010\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView;", "view", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "buttonDTO", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cartItemInfo", "", "widgetId", "", "bindButton", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView;Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;Ljava/lang/Long;)V", "", "currentCount", "maxItems", "", "isPlusEnabled", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;II)Z", "isButtonDisabled", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;II)Z", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "setOnClickListener", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView;ILjava/util/Map;Ljava/lang/Long;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "getUpdateCartActionFromParams", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "count", "isPlusDisabled", "automatizationId", "appendLocator", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView;IZZLjava/lang/String;)V", "LWZ/l;", "tokenizedAnalytics", "init", "(LWZ/l;)V", "subscribe", "()V", "firstButton", "firstButtonDTO", "firstButtonWidgetId", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView;Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Ljava/lang/ref/WeakReference;", "buttonReference", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "buttonWidgetId", "Ljava/lang/Long;", "Lkotlin/jvm/functions/Function1;", "Lxe/M;", "scope", "Lxe/M;", "getSkuId", "()Ljava/lang/Long;", "skuId", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddToCartButtonBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;
    private AddToCartButtonDTO buttonDTO;
    private WeakReference<AddToCartButtonView> buttonReference;
    private Long buttonWidgetId;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final M scope;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder$Companion;", "", "<init>", "()V", "LOCATOR_ADD_TO_CART", "", "LOCATOR_BUTTON_DISABLED", "LOCATOR_COUNTER_PLUS_DISABLED", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddToCartButtonBinder(@NotNull CartService cartService, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.cartService = cartService;
        this.dispatcherProvider = dispatcherProvider;
        this.scope = N.a(CoroutineContext.Element.a.d(new AddToCartButtonBinder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0), (H0) X0.b()));
    }

    private final void appendLocator(AddToCartButtonView addToCartButtonView, int i11, boolean z11, boolean z12, String str) {
        if (str == null) {
            str = "AddToCartButton";
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 0 && z12) {
            sb2.append("_disabled");
        } else if (z11) {
            sb2.append("_disabled_plus");
        }
        if (i11 > 0) {
            sb2.append("_" + i11);
        }
        addToCartButtonView.setContentDescription(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getSkuId() {
        String skuId;
        AddToCartButtonDTO addToCartButtonDTO = this.buttonDTO;
        if (addToCartButtonDTO == null || (skuId = addToCartButtonDTO.getSkuId()) == null) {
            return null;
        }
        return h.y0(skuId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddToCartButtonDTO.QuantityButton.UpdateCartAction getUpdateCartActionFromParams(AtomActionDTO atomActionDTO) {
        String str;
        String str2;
        String str3;
        Integer w02;
        Map<String, String> params = atomActionDTO.getParams();
        Long l11 = null;
        if (params == null || (str = params.get("id")) == null) {
            return null;
        }
        Map<String, String> params2 = atomActionDTO.getParams();
        int intValue = (params2 == null || (str3 = params2.get("quantity")) == null || (w02 = h.w0(str3)) == null) ? 1 : w02.intValue();
        Map<String, String> params3 = atomActionDTO.getParams();
        if (params3 != null && (str2 = params3.get("selectedDeliverySchema")) != null) {
            l11 = h.y0(str2);
        }
        return new AddToCartButtonDTO.QuantityButton.UpdateCartAction(str, intValue, l11);
    }

    private final boolean isButtonDisabled(AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, int currentCount, int maxItems) {
        AddToCartButtonDTO.ActionButton actionButton;
        CommonControlSettings common;
        AtomActionDTO action;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
        if (buttonDTO != null ? Intrinsics.d(buttonDTO.isDisabled(), Boolean.TRUE) : false) {
            return true;
        }
        if (currentCount == 0) {
            if (((buttonDTO == null || (actionButton = buttonDTO.getActionButton()) == null || (common = actionButton.getCommon()) == null || (action = common.getAction()) == null || (updateCartActionFromParams = getUpdateCartActionFromParams(action)) == null) ? 1 : updateCartActionFromParams.getQuantity()) > maxItems) {
                return true;
            }
        }
        return (cartItemInfo == null || buttonDTO == null || buttonDTO.getQuantityButton() == null || cartItemInfo.getQuantity() <= 0 || Intrinsics.d(buttonDTO.getQuantityButton().getUpdateCartAction().getSelectedDeliverySchema(), cartItemInfo.getSelectedDeliverySchema())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isPlusEnabled(AddToCartButtonDTO buttonDTO, int currentCount, int maxItems) {
        AtomActionDTO action;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
        int quantity;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
        if ((quantityButton != null ? quantityButton.getQuantSize() : null) == null) {
            if (currentCount > 0) {
                AddToCartButtonDTO.QuantityButton quantityButton2 = buttonDTO.getQuantityButton();
                if (quantityButton2 != null && (updateCartAction = quantityButton2.getUpdateCartAction()) != null) {
                    quantity = updateCartAction.getQuantity();
                }
            } else {
                CommonControlSettings common = buttonDTO.getActionButton().getCommon();
                if (common != null && (action = common.getAction()) != null && (updateCartActionFromParams = getUpdateCartActionFromParams(action)) != null) {
                    quantity = updateCartActionFromParams.getQuantity();
                }
            }
            return currentCount + quantity > maxItems;
        }
        quantity = 1;
        if (currentCount + quantity > maxItems) {
        }
    }

    private final void setOnClickListener(final AddToCartButtonDTO buttonDTO, AddToCartButtonView view, final int currentCount, final Map<String, TokenizedTrackingInfo> trackingInfo, final Long widgetId) {
        view.setClickListener(new AddToCartButtonView.AddToCartClickListener() { // from class: ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$setOnClickListener$1
            @Override // ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonView.AddToCartClickListener
            public void onAction(CommonControlSettings commonControlSettings) {
                Function1 function1;
                AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
                Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                AtomActionDTO action = commonControlSettings.getAction();
                if (action == null) {
                    return;
                }
                if (Intrinsics.d(action.getId(), "addToCart")) {
                    updateCartActionFromParams = AddToCartButtonBinder.this.getUpdateCartActionFromParams(action);
                    if (updateCartActionFromParams != null) {
                        onPlusButtonClicked(updateCartActionFromParams);
                        return;
                    }
                    return;
                }
                function1 = AddToCartButtonBinder.this.actionHandler;
                if (function1 != null) {
                    function1.invoke(AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()));
                }
            }

            @Override // ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonView.AddToCartClickListener
            public void onMinusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                M m11;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                m11 = AddToCartButtonBinder.this.scope;
                C10727i.c(m11, null, null, new AddToCartButtonBinder$setOnClickListener$1$onMinusButtonClicked$1(buttonDTO, currentCount, updateCartAction, AddToCartButtonBinder.this, trackingInfo, widgetId, null), 3);
            }

            @Override // ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonView.AddToCartClickListener
            public void onPlusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                M m11;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                m11 = AddToCartButtonBinder.this.scope;
                C10727i.c(m11, null, null, new AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1(buttonDTO, currentCount, updateCartAction, AddToCartButtonBinder.this, trackingInfo, widgetId, null), 3);
            }
        });
    }

    public final void bindButton(AddToCartButtonView firstButton, AddToCartButtonDTO firstButtonDTO, Long firstButtonWidgetId, Function1<? super AtomAction, Unit> actionHandler) {
        this.buttonReference = firstButton != null ? new WeakReference<>(firstButton) : null;
        this.buttonDTO = firstButtonDTO;
        this.actionHandler = actionHandler;
        this.buttonWidgetId = firstButtonWidgetId;
        Long skuId = getSkuId();
        bindButton(firstButton, firstButtonDTO, skuId != null ? this.cartService.getCartState().getItems().get(Long.valueOf(skuId.longValue())) : null, firstButtonWidgetId);
    }

    public final void init(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    public final void subscribe() {
        AddToCartButtonDTO addToCartButtonDTO = this.buttonDTO;
        if ((addToCartButtonDTO != null ? addToCartButtonDTO.getQuantityButton() : null) == null) {
            return;
        }
        C10727i.c(this.scope, null, null, new AddToCartButtonBinder$subscribe$1(this, null), 3);
    }

    public final void unsubscribe() {
        E0.d(this.scope.getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(AddToCartButtonView view, AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, Long widgetId) {
        AddToCartButtonView addToCartButtonView;
        TestInfo testInfo;
        Integer prevCount;
        if (view == null) {
            return;
        }
        int i11 = 0;
        view.setVisibility(buttonDTO != null ? 0 : 8);
        if (buttonDTO == null) {
            return;
        }
        if (cartItemInfo != null && buttonDTO.getQuantityButton() != null && Intrinsics.d(cartItemInfo.getSelectedDeliverySchema(), buttonDTO.getQuantityButton().getUpdateCartAction().getSelectedDeliverySchema())) {
            i11 = cartItemInfo.getQuantity();
        }
        int i12 = i11;
        AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
        int maxItems = quantityButton != null ? quantityButton.getMaxItems() : Integer.MAX_VALUE;
        boolean isButtonDisabled = isButtonDisabled(buttonDTO, cartItemInfo, i12, maxItems);
        boolean isPlusEnabled = isPlusEnabled(buttonDTO, i12, maxItems);
        if (buttonDTO.equals(view.getPrevModel()) && isButtonDisabled == view.getIsDisabled() && (prevCount = view.getPrevCount()) != null && i12 == prevCount.intValue() && isPlusEnabled == view.getIsPlusButtonEnabled()) {
            addToCartButtonView = view;
        } else {
            view.bind(buttonDTO, isButtonDisabled, i12, isPlusEnabled);
            boolean z11 = !isPlusEnabled;
            CommonControlSettings common = buttonDTO.getActionButton().getCommon();
            addToCartButtonView = view;
            appendLocator(addToCartButtonView, i12, z11, isButtonDisabled, (common == null || (testInfo = common.getTestInfo()) == null) ? null : testInfo.getAutomatizationId());
        }
        setOnClickListener(buttonDTO, addToCartButtonView, i12, buttonDTO.getTrackingInfo(), widgetId);
    }
}
