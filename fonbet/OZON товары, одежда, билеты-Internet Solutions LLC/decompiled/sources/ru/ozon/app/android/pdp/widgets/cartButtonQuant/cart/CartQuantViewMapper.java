package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import A00.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonPreCreateVHState;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonPreCreateVHStateHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantVoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00020!j\b\u0012\u0004\u0012\u00020\u0002`\"2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0*0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/di/CartButtonQuantWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonPreCreateVHStateHolder;", "cartPreCreateVHStateHolder", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonPreCreateVHStateHolder;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartQuantViewMapper extends OverlayWidgetScreenViewItemMapper2<CartButtonQuantWidgetComponent, CartButtonQuantDto, CartQuantVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ProductCountUpdateKey.class, AsyncCartButtonDeliveryUpdateKey.class, AsyncCartButtonErrorUpdateKey.class, ProductUpdateKey.class);

    private final CartButtonPreCreateVHStateHolder cartPreCreateVHStateHolder() {
        return component().getCartPreCreateVHStateHolder();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        CartButtonQuantDto cartButtonQuantDto = state instanceof CartButtonQuantDto ? (CartButtonQuantDto) state : null;
        return (cartButtonQuantDto != null ? cartButtonQuantDto.getConfiguration() : null) instanceof CartButtonQuantDto.Configuration.CartData;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CartQuantVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        CartQuantViewBinder cartQuantViewBinder = component().getCartQuantViewBinder();
        CartButtonPreCreateVHState cachedState = cartPreCreateVHStateHolder().getCachedState();
        Intrinsics.g(cachedState, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.QuantCartPreCreateViewHolderState");
        return new CartButtonQuantQuantOverlayViewHolder(container, cartQuantViewBinder, ((QuantCartPreCreateViewHolderState) cachedState).getHasShadow(), component().getFeatureChecker());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartButtonQuantWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartButtonQuantWidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public CartQuantVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CartQuantVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ProductCountUpdateKey) {
            ProductCountUpdateKey productCountUpdateKey = (ProductCountUpdateKey) update;
            if (oldItem.getSku() == productCountUpdateKey.getProductId()) {
                return CartQuantVO.copy$default(oldItem, 0L, 0L, productCountUpdateKey.getQuantity() > 0, null, null, productCountUpdateKey.getQuantity(), 0, null, null, null, null, false, null, null, true, false, 49115, null);
            }
        } else {
            if (update instanceof AsyncCartButtonDeliveryUpdateKey) {
                AsyncCartButtonDeliveryUpdateKey asyncCartButtonDeliveryUpdateKey = (AsyncCartButtonDeliveryUpdateKey) update;
                AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton = asyncCartButtonDeliveryUpdateKey.getFirstButton();
                String toCart = firstButton != null ? firstButton.getToCart() : null;
                AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton2 = asyncCartButtonDeliveryUpdateKey.getFirstButton();
                return CartQuantVoMappersKt.updateWithAsyncTexts(oldItem, toCart, firstButton2 != null ? firstButton2.getInCart() : null);
            }
            if (update instanceof AsyncCartButtonErrorUpdateKey) {
                return CartQuantVoMappersKt.updateWithRestoredOriginalText(oldItem);
            }
            if (update instanceof ProductUpdateKey) {
                return CartQuantVO.copy$default(oldItem, 0L, 0L, false, null, null, 0, 0, null, null, null, null, false, null, null, true, false, 49151, null);
            }
        }
        return oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CartQuantVO> map(@NotNull CartButtonQuantDto state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        List<CartQuantVO> invoke = component().getCartMapper().invoke(state, info);
        CartButtonPreCreateVHStateHolder cartPreCreateVHStateHolder = cartPreCreateVHStateHolder();
        CartQuantVO cartQuantVO = (CartQuantVO) C7714v.M(invoke);
        cartPreCreateVHStateHolder.cache(new QuantCartPreCreateViewHolderState(cartQuantVO != null ? cartQuantVO.getHasShadow() : false));
        return invoke;
    }
}
