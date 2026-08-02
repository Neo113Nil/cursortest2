package ru.ozon.app.android.pdp.widgets.cartButtonV5.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"toVO", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "cartType", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "hasSubtitle", "", "otherQuantMultiplicityValue", "", "isAsyncState", "lastQuantCartType", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;ZLjava/lang/Integer;ZLru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5ViewMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CartButtonV5VO.CartButton toVO(CartButtonV5DTO.CartButton cartButton, CartButtonV5VO.CartType cartType, boolean z11, Integer num, boolean z12, CartButtonV5VO.CartType cartType2) {
        CartButtonV5VO.CartType cartType3;
        boolean z13;
        TextDTO subtitle;
        TextDTO textDTO;
        CartButtonV5DTO.CartButton.Button copy;
        CartButtonV5DTO.CartButton.Button inCart;
        TextDTO textDTO2;
        if ((cartButton.getQuantMultiplicityValue() == null && num == null) || (cartButton.getQuantMultiplicityValue() == null && cartType2 == null)) {
            cartType3 = cartType;
        } else {
            cartType3 = cartType;
            if (cartType2 == null || cartType2 != cartType3) {
                z13 = true;
                boolean isInCart = !z13 ? false : cartButton.isInCart();
                CartButtonV5DTO.CartButton.Button toCart = cartButton.getToCart();
                CartButtonV5DTO.CartButton.Button button = null;
                TextDTO copy$default = TextDTO.copy$default(cartButton.getToCart().getTitle(), null, cartButton.getToCart().getIcon() == null ? TextDTO.TextAlignment.LEADING : null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
                subtitle = cartButton.getToCart().getSubtitle();
                if (subtitle == null) {
                    textDTO = TextDTO.copy$default(subtitle, null, cartButton.getToCart().getIcon() != null ? TextDTO.TextAlignment.LEADING : null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
                } else {
                    textDTO = null;
                }
                copy = toCart.copy((r29 & 1) != 0 ? toCart.backgroundColor : null, (r29 & 2) != 0 ? toCart.cornerRadius : null, (r29 & 4) != 0 ? toCart.title : copy$default, (r29 & 8) != 0 ? toCart.subtitle : textDTO, (r29 & 16) != 0 ? toCart.icon : null, (r29 & 32) != 0 ? toCart.isNonIcon : false, (r29 & 64) != 0 ? toCart.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart.action : null, (r29 & 256) != 0 ? toCart.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart.animationSubtitle : !z11 ? cartButton.getToCart().getSubtitle() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart.asyncFetchType : !z12 ? cartButton.getToCart().getAsyncFetchType() : CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE, (r29 & 2048) != 0 ? toCart.borderColor : null, (r29 & 4096) != 0 ? toCart.showBorder : false, (r29 & 8192) != 0 ? toCart.tooltip : null);
                inCart = cartButton.getInCart();
                if (inCart != null) {
                    TextDTO copy$default2 = TextDTO.copy$default(cartButton.getInCart().getTitle(), null, cartButton.getInCart().getIcon() != null ? TextDTO.TextAlignment.LEADING : null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
                    TextDTO subtitle2 = cartButton.getInCart().getSubtitle();
                    if (subtitle2 != null) {
                        textDTO2 = TextDTO.copy$default(subtitle2, null, cartButton.getInCart().getIcon() != null ? TextDTO.TextAlignment.LEADING : null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
                    } else {
                        textDTO2 = null;
                    }
                    button = inCart.copy((r29 & 1) != 0 ? inCart.backgroundColor : null, (r29 & 2) != 0 ? inCart.cornerRadius : null, (r29 & 4) != 0 ? inCart.title : copy$default2, (r29 & 8) != 0 ? inCart.subtitle : textDTO2, (r29 & 16) != 0 ? inCart.icon : null, (r29 & 32) != 0 ? inCart.isNonIcon : false, (r29 & 64) != 0 ? inCart.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart.action : null, (r29 & 256) != 0 ? inCart.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart.animationSubtitle : z11 ? cartButton.getInCart().getSubtitle() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart.asyncFetchType : z12 ? cartButton.getInCart().getAsyncFetchType() : CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE, (r29 & 2048) != 0 ? inCart.borderColor : null, (r29 & 4096) != 0 ? inCart.showBorder : false, (r29 & 8192) != 0 ? inCart.tooltip : null);
                }
                return new CartButtonV5VO.CartButton(cartType3, isInCart, copy, button, cartButton.getAdditionalButton(), cartButton.getSku(), cartButton.getDeliverySchema(), cartButton.getFreeRest(), cartButton.getMinAddToCartQuantity(), z13 ? 0 : cartButton.getInCartQuantity(), cartButton.getMultiplicityValue(), cartButton.getQuantMultiplicityValue(), num, false, null, 24576, null);
            }
        }
        z13 = false;
        if (!z13) {
        }
        CartButtonV5DTO.CartButton.Button toCart2 = cartButton.getToCart();
        CartButtonV5DTO.CartButton.Button button2 = null;
        TextDTO copy$default3 = TextDTO.copy$default(cartButton.getToCart().getTitle(), null, cartButton.getToCart().getIcon() == null ? TextDTO.TextAlignment.LEADING : null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
        subtitle = cartButton.getToCart().getSubtitle();
        if (subtitle == null) {
        }
        copy = toCart2.copy((r29 & 1) != 0 ? toCart2.backgroundColor : null, (r29 & 2) != 0 ? toCart2.cornerRadius : null, (r29 & 4) != 0 ? toCart2.title : copy$default3, (r29 & 8) != 0 ? toCart2.subtitle : textDTO, (r29 & 16) != 0 ? toCart2.icon : null, (r29 & 32) != 0 ? toCart2.isNonIcon : false, (r29 & 64) != 0 ? toCart2.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart2.action : null, (r29 & 256) != 0 ? toCart2.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart2.animationSubtitle : !z11 ? cartButton.getToCart().getSubtitle() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart2.asyncFetchType : !z12 ? cartButton.getToCart().getAsyncFetchType() : CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE, (r29 & 2048) != 0 ? toCart2.borderColor : null, (r29 & 4096) != 0 ? toCart2.showBorder : false, (r29 & 8192) != 0 ? toCart2.tooltip : null);
        inCart = cartButton.getInCart();
        if (inCart != null) {
        }
        return new CartButtonV5VO.CartButton(cartType3, isInCart, copy, button2, cartButton.getAdditionalButton(), cartButton.getSku(), cartButton.getDeliverySchema(), cartButton.getFreeRest(), cartButton.getMinAddToCartQuantity(), z13 ? 0 : cartButton.getInCartQuantity(), cartButton.getMultiplicityValue(), cartButton.getQuantMultiplicityValue(), num, false, null, 24576, null);
    }
}
