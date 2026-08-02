package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantVoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductCountUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.ProductUpdateKey;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.QuantExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantUpdateConsumer;", "", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "oldVO", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/ProductCountUpdateKey;", "update", "", "canFirstCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/ProductCountUpdateKey;)Z", "canSecondCart", "buildInitialVO", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "buildFirstCartButtonActiveVO", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/ProductCountUpdateKey;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "buildSecondCartButtonActiveVO", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "newFirstCartData", "newSecondCartData", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "calculateMode", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartQuantUpdateConsumer {

    @NotNull
    public static final DoubleCartQuantUpdateConsumer INSTANCE = new DoubleCartQuantUpdateConsumer();

    private DoubleCartQuantUpdateConsumer() {
    }

    private final DoubleCartQuantVO buildFirstCartButtonActiveVO(ProductCountUpdateKey update, DoubleCartQuantVO oldVO) {
        CartQuantVO copy$default = CartQuantVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, update.getQuantity() > 0, null, null, update.getQuantity(), 0, null, null, null, null, false, null, null, true, false, 49115, null);
        return DoubleCartQuantVO.copy$default(oldVO, 0L, calculateMode$default(this, oldVO, copy$default, null, 2, null), copy$default, CartQuantVO.copy$default(oldVO.getSecondCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, null, false, null, null, true, false, 49115, null), false, null, null, 113, null);
    }

    private final DoubleCartQuantVO buildInitialVO(DoubleCartQuantVO oldVO) {
        return DoubleCartQuantVO.copy$default(oldVO, 0L, DoubleCartQuantVO.CartMode.DEFAULT, CartQuantVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, null, false, null, null, true, false, 49115, null), CartQuantVO.copy$default(oldVO.getSecondCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, null, false, null, null, true, false, 49115, null), false, null, null, 113, null);
    }

    private final DoubleCartQuantVO buildSecondCartButtonActiveVO(ProductCountUpdateKey update, DoubleCartQuantVO oldVO) {
        CartQuantVO copy$default = CartQuantVO.copy$default(oldVO.getSecondCartData(), 0L, 0L, update.getQuantity() > 0, null, null, update.getQuantity(), 0, null, null, null, null, false, null, null, true, false, 49115, null);
        return DoubleCartQuantVO.copy$default(oldVO, 0L, calculateMode$default(this, oldVO, null, copy$default, 1, null), CartQuantVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, null, false, null, null, true, false, 49115, null), copy$default, false, null, null, 113, null);
    }

    private final DoubleCartQuantVO.CartMode calculateMode(DoubleCartQuantVO doubleCartQuantVO, CartQuantVO cartQuantVO, CartQuantVO cartQuantVO2) {
        if (cartQuantVO == null) {
            cartQuantVO = doubleCartQuantVO.getFirstCartData();
        }
        if (cartQuantVO.getQuantity() > 0) {
            return DoubleCartQuantVO.CartMode.FIRST;
        }
        return (cartQuantVO2 != null ? cartQuantVO2.getQuantity() : doubleCartQuantVO.getSecondCartData().getQuantity()) > 0 ? DoubleCartQuantVO.CartMode.SECOND : DoubleCartQuantVO.CartMode.DEFAULT;
    }

    static /* synthetic */ DoubleCartQuantVO.CartMode calculateMode$default(DoubleCartQuantUpdateConsumer doubleCartQuantUpdateConsumer, DoubleCartQuantVO doubleCartQuantVO, CartQuantVO cartQuantVO, CartQuantVO cartQuantVO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartQuantVO = null;
        }
        if ((i11 & 2) != 0) {
            cartQuantVO2 = null;
        }
        return doubleCartQuantUpdateConsumer.calculateMode(doubleCartQuantVO, cartQuantVO, cartQuantVO2);
    }

    private final boolean canFirstCart(DoubleCartQuantVO oldVO, ProductCountUpdateKey update) {
        return Intrinsics.d(update.getSelectedDeliverySchema(), QuantExtKt.getSelectedQuantDeliverySchema(QuantExtKt.getFirstToCart(oldVO))) && update.getCartMode() == DoubleCartQuantVO.CartMode.FIRST;
    }

    private final boolean canSecondCart(DoubleCartQuantVO oldVO, ProductCountUpdateKey update) {
        return (Intrinsics.d(update.getSelectedDeliverySchema(), ExtKt.getSelectedDeliverySchema(QuantExtKt.getSecondToCart(oldVO))) && update.getCartMode() == DoubleCartQuantVO.CartMode.SECOND) || update.getCartMode() == null;
    }

    @NotNull
    public final DoubleCartQuantVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DoubleCartQuantVO oldVO) {
        DoubleCartQuantVO copy$default;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof ProductCountUpdateKey) {
            ProductCountUpdateKey productCountUpdateKey = (ProductCountUpdateKey) update;
            if (productCountUpdateKey.getCartMode() == DoubleCartQuantVO.CartMode.DEFAULT) {
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
            CartQuantVO firstCartData = oldVO.getFirstCartData();
            AsyncCartButtonDeliveryUpdateKey asyncCartButtonDeliveryUpdateKey = (AsyncCartButtonDeliveryUpdateKey) update;
            AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton = asyncCartButtonDeliveryUpdateKey.getFirstButton();
            String toCart = firstButton != null ? firstButton.getToCart() : null;
            AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton2 = asyncCartButtonDeliveryUpdateKey.getFirstButton();
            CartQuantVO updateWithAsyncTexts = CartQuantVoMappersKt.updateWithAsyncTexts(firstCartData, toCart, firstButton2 != null ? firstButton2.getInCart() : null);
            CartQuantVO secondCartData = oldVO.getSecondCartData();
            AsyncCartButtonDeliveryUpdateKey.ButtonText secondButton = asyncCartButtonDeliveryUpdateKey.getSecondButton();
            String toCart2 = secondButton != null ? secondButton.getToCart() : null;
            AsyncCartButtonDeliveryUpdateKey.ButtonText secondButton2 = asyncCartButtonDeliveryUpdateKey.getSecondButton();
            copy$default = DoubleCartQuantVO.copy$default(oldVO, 0L, null, updateWithAsyncTexts, CartQuantVoMappersKt.updateWithAsyncTexts(secondCartData, toCart2, secondButton2 != null ? secondButton2.getInCart() : null), false, null, null, 115, null);
        } else if (update instanceof AsyncCartButtonErrorUpdateKey) {
            copy$default = DoubleCartQuantVO.copy$default(oldVO, 0L, null, CartQuantVoMappersKt.updateWithRestoredOriginalText(oldVO.getFirstCartData()), CartQuantVoMappersKt.updateWithRestoredOriginalText(oldVO.getSecondCartData()), false, null, null, 115, null);
        } else {
            if (Intrinsics.d(update, ProductUpdateKey.INSTANCE)) {
                copy$default = DoubleCartQuantVO.copy$default(oldVO, 0L, null, CartQuantVO.copy$default(oldVO.getFirstCartData(), 0L, 0L, false, null, null, 0, 0, null, null, null, null, false, null, null, true, false, 49151, null), null, false, null, null, 123, null);
            }
            copy$default = oldVO;
        }
        return (DoubleCartQuantVO) WhenExtKt.getExhaustive(copy$default);
    }
}
