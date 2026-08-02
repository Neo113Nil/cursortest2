package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartVoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ProductUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartUpdateConsumer;", "", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "oldVO", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/ProductCountUpdateKey;", "update", "", "canFirstCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/ProductCountUpdateKey;)Z", "canSecondCart", "buildInitialVO", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "buildFirstCartButtonActiveVO", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/ProductCountUpdateKey;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "buildSecondCartButtonActiveVO", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "newFirstCartData", "newSecondCartData", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "calculateMode", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartUpdateConsumer {

    @NotNull
    public static final DoubleCartUpdateConsumer INSTANCE = new DoubleCartUpdateConsumer();

    private DoubleCartUpdateConsumer() {
    }

    private final DoubleCartVO buildFirstCartButtonActiveVO(ProductCountUpdateKey update, DoubleCartVO oldVO) {
        CartVO copy$default = CartVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, update.getQuantity() > 0, null, null, update.getQuantity(), 0, null, null, null, false, null, null, true, false, null, null, 122843, null);
        return DoubleCartVO.copy$default(oldVO, 0L, calculateMode$default(this, oldVO, copy$default, null, 2, null), copy$default, CartVO.copy$default(oldVO.getSecondCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, false, null, null, true, false, null, null, 122843, null), false, null, null, null, null, 497, null);
    }

    private final DoubleCartVO buildInitialVO(DoubleCartVO oldVO) {
        return DoubleCartVO.copy$default(oldVO, 0L, DoubleCartVO.CartMode.DEFAULT, CartVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, false, null, null, true, false, null, null, 122843, null), CartVO.copy$default(oldVO.getSecondCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, false, null, null, true, false, null, null, 122843, null), false, null, null, null, null, 497, null);
    }

    private final DoubleCartVO buildSecondCartButtonActiveVO(ProductCountUpdateKey update, DoubleCartVO oldVO) {
        CartVO copy$default = CartVO.copy$default(oldVO.getSecondCartData(), 0L, 0L, update.getQuantity() > 0, null, null, update.getQuantity(), 0, null, null, null, false, null, null, true, false, null, null, 122843, null);
        return DoubleCartVO.copy$default(oldVO, 0L, calculateMode$default(this, oldVO, null, copy$default, 1, null), CartVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, false, null, null, true, false, null, null, 122843, null), copy$default, false, null, null, null, null, 497, null);
    }

    private final DoubleCartVO.CartMode calculateMode(DoubleCartVO doubleCartVO, CartVO cartVO, CartVO cartVO2) {
        if (cartVO == null) {
            cartVO = doubleCartVO.getFirstCartData();
        }
        if (cartVO.getQuantity() > 0) {
            return DoubleCartVO.CartMode.FIRST;
        }
        return (cartVO2 != null ? cartVO2.getQuantity() : doubleCartVO.getSecondCartData().getQuantity()) > 0 ? DoubleCartVO.CartMode.SECOND : DoubleCartVO.CartMode.DEFAULT;
    }

    static /* synthetic */ DoubleCartVO.CartMode calculateMode$default(DoubleCartUpdateConsumer doubleCartUpdateConsumer, DoubleCartVO doubleCartVO, CartVO cartVO, CartVO cartVO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartVO = null;
        }
        if ((i11 & 2) != 0) {
            cartVO2 = null;
        }
        return doubleCartUpdateConsumer.calculateMode(doubleCartVO, cartVO, cartVO2);
    }

    private final boolean canFirstCart(DoubleCartVO oldVO, ProductCountUpdateKey update) {
        return Intrinsics.d(update.getSelectedDeliverySchema(), ExtKt.getSelectedDeliverySchema(ExtKt.getFirstToCart(oldVO))) && update.getCartMode() == DoubleCartVO.CartMode.FIRST;
    }

    private final boolean canSecondCart(DoubleCartVO oldVO, ProductCountUpdateKey update) {
        return (Intrinsics.d(update.getSelectedDeliverySchema(), ExtKt.getSelectedDeliverySchema(ExtKt.getSecondToCart(oldVO))) && update.getCartMode() == DoubleCartVO.CartMode.SECOND) || update.getCartMode() == null;
    }

    @NotNull
    public final DoubleCartVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DoubleCartVO oldVO) {
        DoubleCartVO copy$default;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof ProductCountUpdateKey) {
            ProductCountUpdateKey productCountUpdateKey = (ProductCountUpdateKey) update;
            if (productCountUpdateKey.getCartMode() == DoubleCartVO.CartMode.DEFAULT) {
                copy$default = buildInitialVO(oldVO);
            } else if (canFirstCart(oldVO, productCountUpdateKey)) {
                copy$default = buildFirstCartButtonActiveVO(productCountUpdateKey, oldVO);
            } else {
                if (canSecondCart(oldVO, productCountUpdateKey)) {
                    copy$default = buildSecondCartButtonActiveVO(productCountUpdateKey, oldVO);
                }
                copy$default = oldVO;
            }
        } else if (update instanceof AsyncCartButtonDeliveryUpdateKey) {
            CartVO firstCartData = oldVO.getFirstCartData();
            AsyncCartButtonDeliveryUpdateKey asyncCartButtonDeliveryUpdateKey = (AsyncCartButtonDeliveryUpdateKey) update;
            AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton = asyncCartButtonDeliveryUpdateKey.getFirstButton();
            String toCart = firstButton != null ? firstButton.getToCart() : null;
            AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton2 = asyncCartButtonDeliveryUpdateKey.getFirstButton();
            CartVO updateWithAsyncTexts = CartVoMappersKt.updateWithAsyncTexts(firstCartData, toCart, firstButton2 != null ? firstButton2.getInCart() : null);
            CartVO secondCartData = oldVO.getSecondCartData();
            AsyncCartButtonDeliveryUpdateKey.ButtonText secondButton = asyncCartButtonDeliveryUpdateKey.getSecondButton();
            String toCart2 = secondButton != null ? secondButton.getToCart() : null;
            AsyncCartButtonDeliveryUpdateKey.ButtonText secondButton2 = asyncCartButtonDeliveryUpdateKey.getSecondButton();
            copy$default = DoubleCartVO.copy$default(oldVO, 0L, null, updateWithAsyncTexts, CartVoMappersKt.updateWithAsyncTexts(secondCartData, toCart2, secondButton2 != null ? secondButton2.getInCart() : null), false, null, null, null, null, 499, null);
        } else if (update instanceof AsyncCartButtonErrorUpdateKey) {
            copy$default = DoubleCartVO.copy$default(oldVO, 0L, null, CartVoMappersKt.updateWithRestoredOriginalText(oldVO.getFirstCartData()), CartVoMappersKt.updateWithRestoredOriginalText(oldVO.getSecondCartData()), false, null, null, null, null, 499, null);
        } else {
            if (Intrinsics.d(update, ProductUpdateKey.INSTANCE)) {
                copy$default = DoubleCartVO.copy$default(oldVO, 0L, null, CartVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, false, null, null, true, false, null, null, 122879, null), null, false, null, null, null, null, 507, null);
            }
            copy$default = oldVO;
        }
        return (DoubleCartVO) WhenExtKt.getExhaustive(copy$default);
    }
}
