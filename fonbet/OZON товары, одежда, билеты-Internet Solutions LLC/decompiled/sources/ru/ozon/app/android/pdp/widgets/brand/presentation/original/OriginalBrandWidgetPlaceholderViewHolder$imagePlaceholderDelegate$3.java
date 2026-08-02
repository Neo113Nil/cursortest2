package ru.ozon.app.android.pdp.widgets.brand.presentation.original;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.brand.presentation.OriginalBrandVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OriginalBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$3 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ OriginalBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OriginalBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$3(OriginalBrandWidgetPlaceholderViewHolder originalBrandWidgetPlaceholderViewHolder) {
        super(0);
        this.this$0 = originalBrandWidgetPlaceholderViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        DisclosureIconTitleSubtitleCellDTO disclosureCell;
        CommonCellSettings common;
        OriginalBrandVO originalBrandVO = (OriginalBrandVO) this.this$0.getBoundData();
        return Boolean.valueOf(((originalBrandVO == null || (disclosureCell = originalBrandVO.getDisclosureCell()) == null || (common = disclosureCell.getCommon()) == null) ? null : common.getAction()) != null);
    }
}
