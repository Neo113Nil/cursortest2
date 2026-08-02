package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a \u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"updateWithAsyncTexts", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "toCartText", "", "inCartText", "updateWithRestoredOriginalText", "update", "", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartQuantVoMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartButtonQuantDto.AsyncFetchType.values().length];
            try {
                iArr[CartButtonQuantDto.AsyncFetchType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartButtonQuantDto.AsyncFetchType.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final CartQuantVO update(@NotNull CartQuantVO cartQuantVO, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(cartQuantVO, "<this>");
        return CartQuantVO.copy$default(cartQuantVO, 0L, 0L, false, CartButtonQuantDto.Configuration.CartData.Buttons.copy$default(cartQuantVO.getInCart(), update$copyWithAsyncText(cartQuantVO.getInCart().getButtonWithIcon(), charSequence2), null, 2, null), CartButtonQuantDto.Configuration.CartData.Buttons.copy$default(cartQuantVO.getToCart(), update$copyWithAsyncText(cartQuantVO.getToCart().getButtonWithIcon(), charSequence), null, 2, null), 0, 0, null, null, null, null, false, null, null, false, false, 65511, null);
    }

    private static final CartButtonQuantDto.CartButton update$copyWithAsyncText(CartButtonQuantDto.CartButton cartButton, CharSequence charSequence) {
        ButtonV3Atom.LargeButton copy$default;
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(charSequence != null ? OzonSpannableStringKt.toOzonSpannableString(charSequence) : null);
        CartButtonQuantDto.AsyncFetchType asyncFetchType = cartButton.getAsyncFetchType();
        int i11 = asyncFetchType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[asyncFetchType.ordinal()];
        if (i11 == 1) {
            copy$default = ButtonV3Atom.LargeButton.copy$default(cartButton.getButton(), orEmpty, null, null, null, null, null, null, null, null, 510, null);
        } else {
            if (i11 != 2) {
                return cartButton;
            }
            copy$default = ButtonV3Atom.LargeButton.copy$default(cartButton.getButton(), null, orEmpty, null, null, null, null, null, null, null, 509, null);
        }
        return CartButtonQuantDto.CartButton.copy$default(cartButton, copy$default, null, null, null, null, null, null, 126, null);
    }

    @NotNull
    public static final CartQuantVO updateWithAsyncTexts(@NotNull CartQuantVO cartQuantVO, String str, String str2) {
        Intrinsics.checkNotNullParameter(cartQuantVO, "<this>");
        CartButtonQuantDto.AsyncFetchType asyncFetchType = cartQuantVO.getInCart().getButtonWithIcon().getAsyncFetchType();
        return (asyncFetchType == null || asyncFetchType == CartButtonQuantDto.AsyncFetchType.NONE) ? cartQuantVO : update(cartQuantVO, str, str2);
    }

    @NotNull
    public static final CartQuantVO updateWithRestoredOriginalText(@NotNull CartQuantVO cartQuantVO) {
        Intrinsics.checkNotNullParameter(cartQuantVO, "<this>");
        return cartQuantVO.getInCart().getButtonWithIcon().getAsyncFetchType() != CartButtonQuantDto.AsyncFetchType.TITLE ? cartQuantVO : update(cartQuantVO, cartQuantVO.getToCart().getButtonWithIcon().getOriginalButtonText(), cartQuantVO.getInCart().getButtonWithIcon().getOriginalButtonText());
    }
}
