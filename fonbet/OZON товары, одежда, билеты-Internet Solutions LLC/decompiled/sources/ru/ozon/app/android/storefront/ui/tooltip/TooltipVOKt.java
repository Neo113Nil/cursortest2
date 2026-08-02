package ru.ozon.app.android.storefront.ui.tooltip;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.tooltip.internal.TooltipUtilsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toTooltipVO", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltip_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TooltipVOKt {
    @NotNull
    public static final TooltipVO toTooltipVO(@NotNull TooltipDTO tooltipDTO) {
        Intrinsics.checkNotNullParameter(tooltipDTO, "<this>");
        TooltipDTO.StyleType styleType = tooltipDTO.getStyleType();
        if (styleType == null) {
            styleType = TooltipDTO.StyleType.DEFAULT;
        }
        TooltipStyle style = TooltipUtilsKt.toStyle(styleType);
        Integer valueOf = Integer.valueOf(tooltipDTO.getMinWidth());
        if (valueOf.intValue() < 100) {
            valueOf = null;
        }
        int px = UiExtKt.toPx(valueOf != null ? valueOf.intValue() : 100);
        TextDTO tooltipTitle = TooltipUtilsKt.toTooltipTitle(tooltipDTO.getTitle(), style.getTitleColor().getToken());
        String subtitle = tooltipDTO.getSubtitle();
        TextDTO tooltipSubtitle = subtitle != null ? TooltipUtilsKt.toTooltipSubtitle(subtitle, style.getSubtitleColor().getToken()) : null;
        Boolean hasCloseIcon = tooltipDTO.getHasCloseIcon();
        boolean booleanValue = hasCloseIcon != null ? hasCloseIcon.booleanValue() : false;
        TooltipDTO.BeakPosition beakPosition = tooltipDTO.getBeakPosition();
        if (beakPosition == null) {
            beakPosition = TooltipDTO.BeakPosition.BOTTOM_CENTER;
        }
        TooltipBeakPosition beakPosition2 = TooltipUtilsKt.toBeakPosition(beakPosition);
        Integer valueOf2 = tooltipDTO.getSizeType() == TooltipDTO.SizeType.FIXED ? Integer.valueOf(px) : null;
        boolean z11 = tooltipDTO.getSizeType() == TooltipDTO.SizeType.FILLED;
        UniPaddingToken leftMargin = tooltipDTO.getLeftMargin();
        int px2 = leftMargin != null ? TooltipUtilsKt.toPx(leftMargin) : 0;
        UniPaddingToken rightMargin = tooltipDTO.getRightMargin();
        return new TooltipVO(tooltipTitle, tooltipSubtitle, booleanValue, style, beakPosition2, px, valueOf2, z11, px2, rightMargin != null ? TooltipUtilsKt.toPx(rightMargin) : 0, tooltipDTO.getTestInfo(), tooltipDTO.getTrackingInfo());
    }
}
