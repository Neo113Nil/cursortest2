package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import kotlin.Metadata;
import ru.ozon.app.android.pdp.R$plurals;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"quantData", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "vo", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "firstData", "secondData", "appendQuant", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleInCartQuantViewImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final OzonSpannableString appendQuant(OzonSpannableString ozonSpannableString, CartQuantVO cartQuantVO) {
        int quantity = cartQuantVO.getQuantity();
        Integer quantMultiplicityValue = cartQuantVO.getQuantMultiplicityValue();
        if (quantMultiplicityValue == null) {
            return null;
        }
        if (quantity < quantMultiplicityValue.intValue()) {
            return ozonSpannableString;
        }
        int quantity2 = cartQuantVO.getQuantity() / cartQuantVO.getQuantMultiplicityValue().intValue();
        return OzonSpannableStringKt.toOzonSpannableString(((Object) ozonSpannableString) + " " + StringProvider.getQuantityString(R$plurals.pdp_cart_button_quant_count_plural_android, quantity2, Integer.valueOf(quantity2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OzonSpannableString quantData(CartQuantVO cartQuantVO, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2) {
        int quantity = cartQuantVO.getQuantity();
        Integer quantMultiplicityValue = cartQuantVO.getQuantMultiplicityValue();
        if (quantMultiplicityValue != null) {
            return quantity >= quantMultiplicityValue.intValue() ? ozonSpannableString : ozonSpannableString2;
        }
        return null;
    }
}
