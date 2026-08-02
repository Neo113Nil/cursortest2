package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a \u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"updateWithAsyncTexts", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "toCartText", "", "inCartText", "updateWithRestoredOriginalText", "update", "", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartVoMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartButtonV4Dto.AsyncFetchType.values().length];
            try {
                iArr[CartButtonV4Dto.AsyncFetchType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartButtonV4Dto.AsyncFetchType.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final CartVO update(@NotNull CartVO cartVO, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(cartVO, "<this>");
        return CartVO.copy$default(cartVO, 0L, 0L, false, CartButtonV4Dto.Configuration.CartData.Buttons.copy$default(cartVO.getInCart(), update$copyWithAsyncText(cartVO.getInCart().getButtonWithIcon(), charSequence2), null, 2, null), CartButtonV4Dto.Configuration.CartData.Buttons.copy$default(cartVO.getToCart(), update$copyWithAsyncText(cartVO.getToCart().getButtonWithIcon(), charSequence), null, 2, null), 0, 0, null, null, null, false, null, null, false, false, null, null, 131047, null);
    }

    private static final CartButtonV4Dto.CartButton update$copyWithAsyncText(CartButtonV4Dto.CartButton cartButton, CharSequence charSequence) {
        ButtonV3Atom.LargeButton copy$default;
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(charSequence != null ? OzonSpannableStringKt.toOzonSpannableString(charSequence) : null);
        CartButtonV4Dto.AsyncFetchType asyncFetchType = cartButton.getAsyncFetchType();
        int i11 = asyncFetchType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[asyncFetchType.ordinal()];
        if (i11 == 1) {
            copy$default = ButtonV3Atom.LargeButton.copy$default(cartButton.getButton(), orEmpty, null, null, null, null, null, null, null, null, 510, null);
        } else {
            if (i11 != 2) {
                return cartButton;
            }
            copy$default = ButtonV3Atom.LargeButton.copy$default(cartButton.getButton(), null, orEmpty, null, null, null, null, null, null, null, 509, null);
        }
        return CartButtonV4Dto.CartButton.copy$default(cartButton, copy$default, null, null, null, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final CartVO updateWithAsyncTexts(@NotNull CartVO cartVO, String str, String str2) {
        Intrinsics.checkNotNullParameter(cartVO, "<this>");
        CartButtonV4Dto.AsyncFetchType asyncFetchType = cartVO.getInCart().getButtonWithIcon().getAsyncFetchType();
        if (asyncFetchType == null) {
            asyncFetchType = cartVO.getToCart().getButtonWithIcon().getAsyncFetchType();
        }
        if (asyncFetchType == null) {
            return cartVO;
        }
        OzonSpannableString ozonSpannableString = str;
        if (asyncFetchType == CartButtonV4Dto.AsyncFetchType.NONE) {
            return cartVO;
        }
        if (str == 0) {
            ozonSpannableString = cartVO.getToCart().getButtonWithIcon().getOriginalButtonText();
        }
        return update(cartVO, ozonSpannableString, str2);
    }

    @NotNull
    public static final CartVO updateWithRestoredOriginalText(@NotNull CartVO cartVO) {
        Intrinsics.checkNotNullParameter(cartVO, "<this>");
        return (cartVO.getIsInCart() ? cartVO.getInCart() : cartVO.getToCart()).getButtonWithIcon().getAsyncFetchType() != CartButtonV4Dto.AsyncFetchType.TITLE ? cartVO : update(cartVO, cartVO.getToCart().getButtonWithIcon().getOriginalButtonText(), cartVO.getInCart().getButtonWithIcon().getOriginalButtonText());
    }
}
