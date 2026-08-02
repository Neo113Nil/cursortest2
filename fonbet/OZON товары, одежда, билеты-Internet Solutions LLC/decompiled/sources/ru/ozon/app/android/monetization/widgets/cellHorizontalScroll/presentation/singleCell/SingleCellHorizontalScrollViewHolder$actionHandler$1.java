package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll20/a;", "invoke", "()Ll20/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class SingleCellHorizontalScrollViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<C7854a> {
    final /* synthetic */ SingleCellHorizontalScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleCellHorizontalScrollViewHolder$actionHandler$1(SingleCellHorizontalScrollViewHolder singleCellHorizontalScrollViewHolder) {
        super(0);
        this.this$0 = singleCellHorizontalScrollViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7854a invoke() {
        l viewItem = this.this$0.getViewItem();
        if (viewItem != null) {
            return viewItem;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
