package ru.ozon.app.android.pdp.widgets.brand.presentation.original;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OriginalBrandWidgetPlaceholderViewHolder$mainView$1 extends AbstractC7737t implements Function0<DisclosureIconTitleSubtitleCellView> {
    final /* synthetic */ OriginalBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OriginalBrandWidgetPlaceholderViewHolder$mainView$1(OriginalBrandWidgetPlaceholderViewHolder originalBrandWidgetPlaceholderViewHolder) {
        super(0);
        this.this$0 = originalBrandWidgetPlaceholderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DisclosureIconTitleSubtitleCellView invoke() {
        return OriginalBrandViewHolder.INSTANCE.createView(this.this$0.getContext());
    }
}
