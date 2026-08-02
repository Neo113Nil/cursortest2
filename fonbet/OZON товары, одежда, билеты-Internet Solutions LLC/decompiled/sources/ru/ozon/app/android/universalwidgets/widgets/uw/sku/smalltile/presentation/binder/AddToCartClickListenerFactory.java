package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import Sc.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.utils.AddToCartButtonExtKt;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.Source;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/AddToCartClickListenerFactory;", "", "Lxe/M;", "scope", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lxe/M;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "buttonDTO", "", "currentCount", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;", "source", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;", "getOrCreateAddToCartClickListener", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;ILjava/util/Map;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;)Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;", "Lxe/M;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddToCartClickListenerFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final CartService cartService;

    @NotNull
    private final M scope;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/AddToCartClickListenerFactory$Companion;", "", "<init>", "()V", "PLUS_CLICK", "", "MINUS_CLICK", "PARAMS_NEXT_COUNT", "PARAMS_PRODUCT_ID", "PARAMS_DELIVERY_SCHEMA", "PARAMS_MIN_ITEMS", "PARAMS_CURRENT_COUNT", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddToCartClickListenerFactory(@NotNull M scope, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.scope = scope;
        this.cartService = cartService;
    }

    public final AddToCartButtonView.AddToCartClickListener getOrCreateAddToCartClickListener(@NotNull final AddToCartButtonDTO buttonDTO, final int currentCount, final Map<String, TokenizedTrackingInfo> trackingInfo, final Function1<? super AtomAction, Unit> actionHandler, final Source source) {
        Intrinsics.checkNotNullParameter(buttonDTO, "buttonDTO");
        if (source == null) {
            return null;
        }
        if (source instanceof Source.ComposerWidget) {
            return new AddToCartButtonView.AddToCartClickListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1
                @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
                public void onAction(CommonControlSettings commonControlSettings) {
                    AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
                    Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                    AtomActionDTO action = commonControlSettings.getAction();
                    if (action == null) {
                        return;
                    }
                    if (Intrinsics.d(action.getId(), "addToCart")) {
                        updateCartActionFromParams = SmallTileAddToCartButtonBinderKt.getUpdateCartActionFromParams(action);
                        if (updateCartActionFromParams != null) {
                            onPlusButtonClicked(updateCartActionFromParams);
                            return;
                        }
                        return;
                    }
                    Function1<AtomAction, Unit> function1 = actionHandler;
                    if (function1 != null) {
                        function1.invoke(AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()));
                    }
                }

                @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
                public void onMinusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                    M m11;
                    Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                    m11 = AddToCartClickListenerFactory.this.scope;
                    C10727i.c(m11, null, null, new AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onMinusButtonClicked$1(buttonDTO, currentCount, updateCartAction, AddToCartClickListenerFactory.this, trackingInfo, source, null), 3);
                }

                @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
                public void onPlusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                    M m11;
                    Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                    m11 = AddToCartClickListenerFactory.this.scope;
                    C10727i.c(m11, null, null, new AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$1$onPlusButtonClicked$1(currentCount, updateCartAction, AddToCartClickListenerFactory.this, trackingInfo, source, buttonDTO, null), 3);
                }
            };
        }
        if (source.equals(Source.MessengerBlock.INSTANCE)) {
            return new AddToCartButtonView.AddToCartClickListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.AddToCartClickListenerFactory$getOrCreateAddToCartClickListener$2
                @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
                public void onAction(CommonControlSettings commonControlSettings) {
                    AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
                    Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                    AtomActionDTO action = commonControlSettings.getAction();
                    if (action == null) {
                        return;
                    }
                    if (Intrinsics.d(action.getId(), "addToCart")) {
                        updateCartActionFromParams = SmallTileAddToCartButtonBinderKt.getUpdateCartActionFromParams(action);
                        if (updateCartActionFromParams != null) {
                            onPlusButtonClicked(updateCartActionFromParams);
                            return;
                        }
                        return;
                    }
                    Function1<AtomAction, Unit> function1 = actionHandler;
                    if (function1 != null) {
                        function1.invoke(AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()));
                    }
                }

                @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
                public void onMinusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                    Integer minItems;
                    Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                    Map<String, String> params = AddToCartButtonExtKt.getParams(AddToCartButtonDTO.this);
                    if (params == null) {
                        params = U.c();
                    }
                    LinkedHashMap u11 = U.u(params);
                    int quantity = currentCount - updateCartAction.getQuantity();
                    AddToCartButtonDTO.QuantityButton quantityButton = AddToCartButtonDTO.this.getQuantityButton();
                    int intValue = (quantityButton == null || (minItems = quantityButton.getMinItems()) == null) ? 1 : minItems.intValue();
                    u11.put("productId", updateCartAction.getId());
                    u11.put("nextCount", String.valueOf(quantity));
                    u11.put("selectedDeliverySchema", String.valueOf(updateCartAction.getSelectedDeliverySchema()));
                    u11.put("minItems", String.valueOf(intValue));
                    Function1<AtomAction, Unit> function1 = actionHandler;
                    if (function1 != null) {
                        function1.invoke(new AtomAction.Click("minusClick", null, null, u11, trackingInfo, 4, null));
                    }
                }

                @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
                public void onPlusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                    Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                    Map<String, String> params = AddToCartButtonExtKt.getParams(AddToCartButtonDTO.this);
                    if (params == null) {
                        params = U.c();
                    }
                    LinkedHashMap u11 = U.u(params);
                    int quantity = updateCartAction.getQuantity() + currentCount;
                    u11.put("productId", updateCartAction.getId());
                    u11.put("nextCount", String.valueOf(quantity));
                    u11.put("selectedDeliverySchema", String.valueOf(updateCartAction.getSelectedDeliverySchema()));
                    u11.put("currentCount", String.valueOf(currentCount));
                    Function1<AtomAction, Unit> function1 = actionHandler;
                    if (function1 != null) {
                        function1.invoke(new AtomAction.Click("plusClick", null, null, u11, trackingInfo, 4, null));
                    }
                }
            };
        }
        throw new o();
    }
}
