package ru.ozon.app.android.pdp.widgets.cartButtonV4.plain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButtonViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.DtoMappersKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"toViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "priorityColor", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlainViewV4Kt {
    @NotNull
    public static final CartButtonViewState toViewState(@NotNull PlainVO plainVO) {
        Intrinsics.checkNotNullParameter(plainVO, "<this>");
        return toViewState$default(plainVO.getButton(), plainVO.getStyle(), null, 2, null);
    }

    public static /* synthetic */ CartButtonViewState toViewState$default(ButtonV3Atom.LargeButton largeButton, CartButtonV4Dto.CartButtonStyle cartButtonStyle, CartButtonV4Dto.ButtonColors buttonColors, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            buttonColors = null;
        }
        return toViewState(largeButton, cartButtonStyle, buttonColors);
    }

    @NotNull
    public static final CartButtonViewState toViewState(@NotNull ButtonV3Atom.LargeButton largeButton, CartButtonV4Dto.CartButtonStyle cartButtonStyle, CartButtonV4Dto.ButtonColors buttonColors) {
        Intrinsics.checkNotNullParameter(largeButton, "<this>");
        return new CartButtonViewState(largeButton.getText(), largeButton.getSubtext(), null, largeButton.getTheme(), DtoMappersKt.toSize(cartButtonStyle), false, buttonColors, null, 164, null);
    }
}
