package ru.ozon.app.android.pdp.widgets.cartButtonV4.button;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButtonViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u000e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0010"}, d2 = {"toCartButtonViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "context", "Landroid/content/Context;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "cartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "isInCart", "", "toSize", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Size;", "toViewStateIcon", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState$Icon;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton$ButtonIcon;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DtoMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartButtonV4Dto.CartButtonStyle.values().length];
            try {
                iArr[CartButtonV4Dto.CartButtonStyle.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartButtonV4Dto.CartButtonStyle.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final CartButtonViewState toCartButtonViewState(@NotNull CartButtonV4Dto.CartButton cartButton, @NotNull Context context, CartButtonV4Dto.CartButtonStyle cartButtonStyle, DoubleCartVO.CartMode cartMode, boolean z11) {
        Intrinsics.checkNotNullParameter(cartButton, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        OzonSpannableString text = cartButton.getButton().getText();
        OzonSpannableString subtext = cartButton.getButton().getSubtext();
        CartButtonV4Dto.CartButton.ButtonIcon buttonIcon = cartButton.getButtonIcon();
        CartButtonViewState.Icon viewStateIcon = buttonIcon != null ? toViewStateIcon(buttonIcon, context) : null;
        ButtonV3Atom.LargeButton.LargeButtonStyle theme = cartButton.getButton().getTheme();
        if (theme == null) {
            theme = ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY;
        }
        return new CartButtonViewState(text, subtext, viewStateIcon, theme, toSize(cartButtonStyle), false, cartButton.getPriorityColors(), z11 ? DoubleCartVO.CartMode.IN_CART : cartMode, 32, null);
    }

    public static /* synthetic */ CartButtonViewState toCartButtonViewState$default(CartButtonV4Dto.CartButton cartButton, Context context, CartButtonV4Dto.CartButtonStyle cartButtonStyle, DoubleCartVO.CartMode cartMode, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cartMode = null;
        }
        return toCartButtonViewState(cartButton, context, cartButtonStyle, cartMode, z11);
    }

    @NotNull
    public static final CartButtonViewState.Size toSize(CartButtonV4Dto.CartButtonStyle cartButtonStyle) {
        int i11 = cartButtonStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cartButtonStyle.ordinal()];
        if (i11 == -1) {
            return CartButtonViewState.Size.LARGE;
        }
        if (i11 == 1) {
            return CartButtonViewState.Size.MEDIUM;
        }
        if (i11 == 2) {
            return CartButtonViewState.Size.LARGE;
        }
        throw new o();
    }

    @NotNull
    public static final CartButtonViewState.Icon toViewStateIcon(@NotNull CartButtonV4Dto.CartButton.ButtonIcon buttonIcon, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(buttonIcon, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String image = buttonIcon.getIcon().getImage();
        StyleParser styleParser = StyleParser.INSTANCE;
        return new CartButtonViewState.Icon(image, styleParser.parseColor(context, buttonIcon.getIcon().getTintColor()), styleParser.parseColor(context, buttonIcon.getBackgroundColor()));
    }
}
