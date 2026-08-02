package ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MultipleRangesFilterViewHolder$isMultiLineList$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ MultipleRangesFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleRangesFilterViewHolder$isMultiLineList$2(MultipleRangesFilterViewHolder multipleRangesFilterViewHolder) {
        super(0);
        this.this$0 = multipleRangesFilterViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MultipleRangesFilterVO boundData;
        TagFilterVO tagFilterVO;
        TagFilterVO tagFilterVO2;
        MultipleRangesFilterVO boundData2 = this.this$0.getBoundData();
        return Boolean.valueOf((((boundData2 == null || (tagFilterVO2 = boundData2.getTagFilterVO()) == null) ? null : tagFilterVO2.getTotalValuesCount()) == null || (boundData = this.this$0.getBoundData()) == null || (tagFilterVO = boundData.getTagFilterVO()) == null || tagFilterVO.getScrollEnabled()) ? false : true);
    }
}
