package ru.ozon.app.android.pdp.widgets.brand.presentation.original;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.brand.presentation.OriginalBrandVO;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OriginalBrandBinder$onVisibleAreaChanged$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ OriginalBrandBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OriginalBrandBinder$onVisibleAreaChanged$1(OriginalBrandBinder originalBrandBinder) {
        super(0);
        this.this$0 = originalBrandBinder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView;
        boolean z11;
        DisclosureIconTitleSubtitleCellDTO disclosureCell;
        IconDTO icon;
        disclosureIconTitleSubtitleCellView = this.this$0.containerView;
        if (disclosureIconTitleSubtitleCellView.getMainView().getAddonView().getDrawable() == null) {
            OriginalBrandVO boundData = this.this$0.getViewHolderOwner().getBoundData();
            if (((boundData == null || (disclosureCell = boundData.getDisclosureCell()) == null || (icon = disclosureCell.getIcon()) == null) ? null : icon.getText()) == null) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        z11 = true;
        return Boolean.valueOf(z11);
    }
}
