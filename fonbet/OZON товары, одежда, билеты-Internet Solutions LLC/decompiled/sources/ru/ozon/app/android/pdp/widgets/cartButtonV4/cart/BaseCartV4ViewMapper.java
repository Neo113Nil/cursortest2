package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import A00.a;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHStateHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartVoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ProductUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070!0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/BaseCartV4ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/di/CartButtonWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder;", "cartPreCreateVHStateHolder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCartV4ViewMapper extends OverlayWidgetScreenViewItemMapper2<CartButtonWidgetComponent, CartButtonV4Dto, CartVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ProductCountUpdateKey.class, AsyncCartButtonDeliveryUpdateKey.class, AsyncCartButtonErrorUpdateKey.class, ProductUpdateKey.class);

    @NotNull
    protected final CartButtonPreCreateVHStateHolder cartPreCreateVHStateHolder() {
        return component().getCartPreCreateVHStateHolder();
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
    public C7473e<CartButtonWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartButtonWidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public CartVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CartVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ProductCountUpdateKey) {
            ProductCountUpdateKey productCountUpdateKey = (ProductCountUpdateKey) update;
            if (oldItem.getSku() == productCountUpdateKey.getProductId()) {
                return CartVO.copy$default(oldItem, 0L, 0L, productCountUpdateKey.getQuantity() > 0, null, null, productCountUpdateKey.getQuantity(), 0, null, null, null, false, null, null, true, false, null, null, 122843, null);
            }
        } else {
            if (update instanceof AsyncCartButtonDeliveryUpdateKey) {
                AsyncCartButtonDeliveryUpdateKey asyncCartButtonDeliveryUpdateKey = (AsyncCartButtonDeliveryUpdateKey) update;
                AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton = asyncCartButtonDeliveryUpdateKey.getFirstButton();
                String toCart = firstButton != null ? firstButton.getToCart() : null;
                AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton2 = asyncCartButtonDeliveryUpdateKey.getFirstButton();
                return CartVoMappersKt.updateWithAsyncTexts(oldItem, toCart, firstButton2 != null ? firstButton2.getInCart() : null);
            }
            if (update instanceof AsyncCartButtonErrorUpdateKey) {
                return CartVoMappersKt.updateWithRestoredOriginalText(oldItem);
            }
            if (update instanceof ProductUpdateKey) {
                return CartVO.copy$default(oldItem, 0L, 0L, false, null, null, 0, 0, null, null, null, false, null, null, true, false, null, null, 122879, null);
            }
        }
        return oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CartVO> map(@NotNull CartButtonV4Dto state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        List<CartVO> invoke = component().getCartMapper().invoke(state, info);
        CartButtonPreCreateVHStateHolder cartPreCreateVHStateHolder = cartPreCreateVHStateHolder();
        CartVO cartVO = (CartVO) C7714v.M(invoke);
        cartPreCreateVHStateHolder.cache(new CartPreCreateViewHolderState(cartVO != null ? cartVO.getHasShadow() : false));
        return invoke;
    }
}
