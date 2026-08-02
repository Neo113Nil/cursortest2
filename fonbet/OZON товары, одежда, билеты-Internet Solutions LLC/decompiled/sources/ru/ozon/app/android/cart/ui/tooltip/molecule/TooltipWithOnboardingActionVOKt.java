package ru.ozon.app.android.cart.ui.tooltip.molecule;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVo", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TooltipWithOnboardingActionVOKt {
    @NotNull
    public static final TooltipWithOnboardingActionVO toVo(@NotNull TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO) {
        Intrinsics.checkNotNullParameter(tooltipWithOnboardingActionDTO, "<this>");
        CartTooltipVO cartTooltipVO = CartTooltipVOKt.toCartTooltipVO(tooltipWithOnboardingActionDTO.getTooltip());
        AtomActionDTO onboardingAction = tooltipWithOnboardingActionDTO.getOnboardingAction();
        return new TooltipWithOnboardingActionVO(cartTooltipVO, onboardingAction != null ? AtomActionMapperKt.toAtomAction(onboardingAction, null) : null, tooltipWithOnboardingActionDTO.getHidingTimeMs());
    }
}
