package ru.ozon.uni.atoms.v3.holders.cell.indicatorCell;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.indicator.indicatorBadgeTitleSubtitleCell.IndicatorBadgeTitleSubtitleCellView;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.cell.badge.BadgeTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/cell/indicator/indicatorBadgeTitleSubtitleCell/IndicatorBadgeTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "bindCellData", "(Lru/ozon/uni/android/cell/indicator/indicatorBadgeTitleSubtitleCell/IndicatorBadgeTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorBadgeTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bindCellData(@NotNull IndicatorBadgeTitleSubtitleCellView indicatorBadgeTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, BadgeDTO badgeDTO, IndicatorDTO indicatorDTO) {
        Intrinsics.checkNotNullParameter(indicatorBadgeTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        BadgeTitleSubtitleCellHolderKt.bindCellData(indicatorBadgeTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO, badgeDTO);
        indicatorBadgeTitleSubtitleCellView.setIndicatorVisible(indicatorDTO != null);
        IndicatorHolderKt.bindOrGone$default(indicatorBadgeTitleSubtitleCellView.getAddonView(), indicatorDTO != null ? IndicatorDTO.copy$default(indicatorDTO, null, null, indicatorBadgeTitleSubtitleCellView.getPreset().getIndicatorAddonWrapperPreset().getIndicatorSize(), null, null, null, null, null, null, null, null, 2043, null) : null, null, 2, null);
    }
}
