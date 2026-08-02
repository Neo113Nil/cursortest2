package ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.QuantDtoMappersKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"toViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "priorityColor", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$ButtonColors;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlainQuantViewKt {
    @NotNull
    public static final CartButtonQuantViewState toViewState(@NotNull PlainQuantVO plainQuantVO) {
        Intrinsics.checkNotNullParameter(plainQuantVO, "<this>");
        return toViewState$default(plainQuantVO.getButton(), plainQuantVO.getStyle(), null, 2, null);
    }

    public static /* synthetic */ CartButtonQuantViewState toViewState$default(ButtonV3Atom.LargeButton largeButton, CartButtonQuantDto.CartButtonStyle cartButtonStyle, CartButtonQuantDto.ButtonColors buttonColors, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            buttonColors = null;
        }
        return toViewState(largeButton, cartButtonStyle, buttonColors);
    }

    @NotNull
    public static final CartButtonQuantViewState toViewState(@NotNull ButtonV3Atom.LargeButton largeButton, CartButtonQuantDto.CartButtonStyle cartButtonStyle, CartButtonQuantDto.ButtonColors buttonColors) {
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        return new CartButtonQuantViewState(largeButton.getText(), largeButton.getSubtext(), null, largeButton.getTheme(), QuantDtoMappersKt.toSize(cartButtonStyle), false, buttonColors, null, null, false, 932, null);
    }
}
