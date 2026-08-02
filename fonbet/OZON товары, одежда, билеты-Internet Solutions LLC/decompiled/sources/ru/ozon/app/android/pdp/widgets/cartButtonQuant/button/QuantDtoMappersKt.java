package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u000e\u0010\u000f\u001a\u00020\u0010*\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0014"}, d2 = {"toCartButtonViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;", "context", "Landroid/content/Context;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "cartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "isInCart", "", "isAutomaticAnimation", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "toSize", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Size;", "toViewStateIcon", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Icon;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton$ButtonIcon;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QuantDtoMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartButtonQuantDto.CartButtonStyle.values().length];
            try {
                iArr[CartButtonQuantDto.CartButtonStyle.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartButtonQuantDto.CartButtonStyle.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final CartButtonQuantViewState toCartButtonViewState(@NotNull CartButtonQuantDto.CartButton cartButton, @NotNull Context context, CartButtonQuantDto.CartButtonStyle cartButtonStyle, DoubleCartQuantVO.CartMode cartMode, boolean z11, boolean z12, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2) {
        Intrinsics.checkNotNullParameter(cartButton, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        OzonSpannableString text = ozonSpannableString == null ? cartButton.getButton().getText() : ozonSpannableString;
        OzonSpannableString subtext = ozonSpannableString2 == null ? cartButton.getButton().getSubtext() : ozonSpannableString2;
        CartButtonQuantDto.CartButton.ButtonIcon buttonIcon = cartButton.getButtonIcon();
        CartButtonQuantViewState.Icon viewStateIcon = buttonIcon != null ? toViewStateIcon(buttonIcon, context) : null;
        ButtonV3Atom.LargeButton.LargeButtonStyle theme = cartButton.getButton().getTheme();
        if (theme == null) {
            theme = ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY;
        }
        return new CartButtonQuantViewState(text, subtext, viewStateIcon, theme, toSize(cartButtonStyle), false, cartButton.getPriorityColors(), cartButton.getPremiumAnimation(), z11 ? DoubleCartQuantVO.CartMode.IN_CART : cartMode, z12, 32, null);
    }

    public static /* synthetic */ CartButtonQuantViewState toCartButtonViewState$default(CartButtonQuantDto.CartButton cartButton, Context context, CartButtonQuantDto.CartButtonStyle cartButtonStyle, DoubleCartQuantVO.CartMode cartMode, boolean z11, boolean z12, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cartMode = null;
        }
        if ((i11 & 32) != 0) {
            ozonSpannableString = null;
        }
        if ((i11 & 64) != 0) {
            ozonSpannableString2 = null;
        }
        return toCartButtonViewState(cartButton, context, cartButtonStyle, cartMode, z11, z12, ozonSpannableString, ozonSpannableString2);
    }

    @NotNull
    public static final CartButtonQuantViewState.Size toSize(CartButtonQuantDto.CartButtonStyle cartButtonStyle) {
        int i11 = cartButtonStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cartButtonStyle.ordinal()];
        if (i11 == -1) {
            return CartButtonQuantViewState.Size.LARGE;
        }
        if (i11 == 1) {
            return CartButtonQuantViewState.Size.MEDIUM;
        }
        if (i11 == 2) {
            return CartButtonQuantViewState.Size.LARGE;
        }
        throw new o();
    }

    @NotNull
    public static final CartButtonQuantViewState.Icon toViewStateIcon(@NotNull CartButtonQuantDto.CartButton.ButtonIcon buttonIcon, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(buttonIcon, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String image = buttonIcon.getIcon().getImage();
        StyleParser styleParser = StyleParser.INSTANCE;
        return new CartButtonQuantViewState.Icon(image, styleParser.parseColor(context, buttonIcon.getIcon().getTintColor()), styleParser.parseColor(context, buttonIcon.getBackgroundColor()));
    }
}
