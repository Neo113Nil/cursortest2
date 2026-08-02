package ru.ozon.uni.atoms.v3.holders.cell.indicatorCell;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.IndicatorTitleSubtitleCellView;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "bindCellData", "(Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bindCellData(@NotNull IndicatorTitleSubtitleCellView indicatorTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IndicatorDTO indicatorDTO) {
        Intrinsics.checkNotNullParameter(indicatorTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(indicatorTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO);
        indicatorTitleSubtitleCellView.setIndicatorVisible(indicatorDTO != null);
        IndicatorHolderKt.bindOrGone$default(indicatorTitleSubtitleCellView.getAddonView(), indicatorDTO != null ? IndicatorDTO.copy$default(indicatorDTO, null, null, indicatorTitleSubtitleCellView.getPreset().getIndicatorAddonWrapperPreset().getIndicatorSize(), null, null, null, null, null, null, null, null, 2043, null) : null, null, 2, null);
    }
}
