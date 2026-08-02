package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0015\u001a\u00020\u0001*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0017\u001a\u00020\u0001*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "mainButton", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "quantity", "toCartQuantButtonQuantityPlaceholder", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)Lru/ozon/uni/atoms/data/text/TextDTO;", "", "getSelectedQuantDeliverySchema", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Ljava/lang/Long;", "", "getForStars", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Ljava/lang/Boolean;", "Lkotlin/text/Regex;", "PLACEHOLDER_REGEX", "Lkotlin/text/Regex;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "getFirstToCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "firstToCart", "getSecondToCart", "secondToCart", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QuantExtKt {

    @NotNull
    private static final Regex PLACEHOLDER_REGEX = new Regex("%ld");

    @NotNull
    public static final ButtonV3Atom.LargeButton getFirstToCart(@NotNull DoubleCartQuantVO doubleCartQuantVO) {
        Intrinsics.checkNotNullParameter(doubleCartQuantVO, "<this>");
        return mainButton(doubleCartQuantVO.getFirstCartData().getToCart());
    }

    public static final Boolean getForStars(@NotNull ButtonV3Atom.LargeButton largeButton) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (params = action.getParams()) == null || (str = params.get("forStars")) == null) {
            return null;
        }
        return h.t0(str);
    }

    @NotNull
    public static final ButtonV3Atom.LargeButton getSecondToCart(@NotNull DoubleCartQuantVO doubleCartQuantVO) {
        Intrinsics.checkNotNullParameter(doubleCartQuantVO, "<this>");
        return mainButton(doubleCartQuantVO.getSecondCartData().getToCart());
    }

    public static final Long getSelectedQuantDeliverySchema(@NotNull ButtonV3Atom.LargeButton largeButton) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (params = action.getParams()) == null || (str = params.get("selectedDeliverySchema")) == null) {
            return null;
        }
        return h.y0(str);
    }

    @NotNull
    public static final ButtonV3Atom.LargeButton mainButton(@NotNull CartButtonQuantDto.Configuration.CartData.Buttons buttons) {
        Intrinsics.checkNotNullParameter(buttons, "<this>");
        return buttons.getButtonWithIcon().getButton();
    }

    @NotNull
    public static final TextDTO toCartQuantButtonQuantityPlaceholder(TextDTO textDTO, int i11) {
        if (textDTO != null) {
            TextDTO copy$default = TextDTO.copy$default(textDTO, OzonSpannableStringKt.toOzonSpannableString(PLACEHOLDER_REGEX.replace(textDTO.getText(), String.valueOf(i11))), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            if (copy$default != null) {
                return copy$default;
            }
        }
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(String.valueOf(i11)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }
}
