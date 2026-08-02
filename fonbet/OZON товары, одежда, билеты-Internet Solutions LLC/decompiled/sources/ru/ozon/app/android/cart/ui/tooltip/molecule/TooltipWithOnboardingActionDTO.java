package ru.ozon.app.android.cart.ui.tooltip.molecule;

import Fm.C3051a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "onboardingAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hidingTimeMs", "", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getOnboardingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHidingTimeMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;)Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TooltipWithOnboardingActionDTO {
    private final Long hidingTimeMs;
    private final AtomActionDTO onboardingAction;

    @NotNull
    private final TooltipDTO tooltip;

    public TooltipWithOnboardingActionDTO(@NotNull TooltipDTO tooltip, AtomActionDTO atomActionDTO, Long l11) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        this.tooltip = tooltip;
        this.onboardingAction = atomActionDTO;
        this.hidingTimeMs = l11;
    }

    public static /* synthetic */ TooltipWithOnboardingActionDTO copy$default(TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO, TooltipDTO tooltipDTO, AtomActionDTO atomActionDTO, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tooltipDTO = tooltipWithOnboardingActionDTO.tooltip;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = tooltipWithOnboardingActionDTO.onboardingAction;
        }
        if ((i11 & 4) != 0) {
            l11 = tooltipWithOnboardingActionDTO.hidingTimeMs;
        }
        return tooltipWithOnboardingActionDTO.copy(tooltipDTO, atomActionDTO, l11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getOnboardingAction() {
        return this.onboardingAction;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getHidingTimeMs() {
        return this.hidingTimeMs;
    }

    @NotNull
    public final TooltipWithOnboardingActionDTO copy(@NotNull TooltipDTO tooltip, AtomActionDTO onboardingAction, Long hidingTimeMs) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        return new TooltipWithOnboardingActionDTO(tooltip, onboardingAction, hidingTimeMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipWithOnboardingActionDTO)) {
            return false;
        }
        TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO = (TooltipWithOnboardingActionDTO) other;
        return Intrinsics.d(this.tooltip, tooltipWithOnboardingActionDTO.tooltip) && Intrinsics.d(this.onboardingAction, tooltipWithOnboardingActionDTO.onboardingAction) && Intrinsics.d(this.hidingTimeMs, tooltipWithOnboardingActionDTO.hidingTimeMs);
    }

    public final Long getHidingTimeMs() {
        return this.hidingTimeMs;
    }

    public final AtomActionDTO getOnboardingAction() {
        return this.onboardingAction;
    }

    @NotNull
    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int hashCode = this.tooltip.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.onboardingAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Long l11 = this.hidingTimeMs;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TooltipDTO tooltipDTO = this.tooltip;
        AtomActionDTO atomActionDTO = this.onboardingAction;
        Long l11 = this.hidingTimeMs;
        StringBuilder sb2 = new StringBuilder("TooltipWithOnboardingActionDTO(tooltip=");
        sb2.append(tooltipDTO);
        sb2.append(", onboardingAction=");
        sb2.append(atomActionDTO);
        sb2.append(", hidingTimeMs=");
        return C3051a.d(sb2, l11, ")");
    }
}
