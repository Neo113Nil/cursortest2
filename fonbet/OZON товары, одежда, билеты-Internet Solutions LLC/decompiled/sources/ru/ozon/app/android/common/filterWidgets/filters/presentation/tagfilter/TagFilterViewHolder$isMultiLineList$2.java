package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TagFilterViewHolder$isMultiLineList$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ TagFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagFilterViewHolder$isMultiLineList$2(TagFilterViewHolder tagFilterViewHolder) {
        super(0);
        this.this$0 = tagFilterViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        TagFilterVO boundData;
        TagFilterVO boundData2 = this.this$0.getBoundData();
        return Boolean.valueOf(((boundData2 != null ? boundData2.getTotalValuesCount() : null) == null || (boundData = this.this$0.getBoundData()) == null || boundData.getScrollEnabled()) ? false : true);
    }
}
