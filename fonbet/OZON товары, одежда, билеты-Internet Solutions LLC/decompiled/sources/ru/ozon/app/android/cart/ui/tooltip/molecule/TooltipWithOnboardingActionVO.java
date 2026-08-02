package ru.ozon.app.android.cart.ui.tooltip.molecule;

import Fm.C3051a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "Lru/ozon/uni/atoms/af/AtomAction;", "onboardingAction", "", "hidingTimeMs", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnboardingAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/Long;", "getHidingTimeMs", "()Ljava/lang/Long;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TooltipWithOnboardingActionVO {
    private final Long hidingTimeMs;
    private final AtomAction onboardingAction;

    @NotNull
    private final CartTooltipVO tooltip;

    public TooltipWithOnboardingActionVO(@NotNull CartTooltipVO tooltip, AtomAction atomAction, Long l11) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        this.tooltip = tooltip;
        this.onboardingAction = atomAction;
        this.hidingTimeMs = l11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipWithOnboardingActionVO)) {
            return false;
        }
        TooltipWithOnboardingActionVO tooltipWithOnboardingActionVO = (TooltipWithOnboardingActionVO) other;
        return Intrinsics.d(this.tooltip, tooltipWithOnboardingActionVO.tooltip) && Intrinsics.d(this.onboardingAction, tooltipWithOnboardingActionVO.onboardingAction) && Intrinsics.d(this.hidingTimeMs, tooltipWithOnboardingActionVO.hidingTimeMs);
    }

    public final Long getHidingTimeMs() {
        return this.hidingTimeMs;
    }

    public final AtomAction getOnboardingAction() {
        return this.onboardingAction;
    }

    @NotNull
    public final CartTooltipVO getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int hashCode = this.tooltip.hashCode() * 31;
        AtomAction atomAction = this.onboardingAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Long l11 = this.hidingTimeMs;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CartTooltipVO cartTooltipVO = this.tooltip;
        AtomAction atomAction = this.onboardingAction;
        Long l11 = this.hidingTimeMs;
        StringBuilder sb2 = new StringBuilder("TooltipWithOnboardingActionVO(tooltip=");
        sb2.append(cartTooltipVO);
        sb2.append(", onboardingAction=");
        sb2.append(atomAction);
        sb2.append(", hidingTimeMs=");
        return C3051a.d(sb2, l11, ")");
    }
}
