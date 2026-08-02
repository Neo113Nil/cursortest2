package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.TitleCell;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "pos", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesWidgetViewHolder$createView$1$1 extends AbstractC7737t implements Function1<Integer, Boolean> {
    final /* synthetic */ RecyclerView $this_apply;
    final /* synthetic */ FilterValuesWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesWidgetViewHolder$createView$1$1(RecyclerView recyclerView, FilterValuesWidgetViewHolder filterValuesWidgetViewHolder) {
        super(1);
        this.$this_apply = recyclerView;
        this.this$0 = filterValuesWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Boolean invoke(int i11) {
        if (i11 == -1) {
            return Boolean.FALSE;
        }
        RecyclerView.g adapter = this.$this_apply.getAdapter();
        boolean z11 = true;
        if (adapter == null || adapter.getItemViewType(i11) != HeaderCell.INSTANCE.getViewType()) {
            RecyclerView.g adapter2 = this.$this_apply.getAdapter();
            if (adapter2 != null && adapter2.getItemViewType(i11) == TitleCell.INSTANCE.getViewType()) {
                List<FilterValuesCell> currentList = this.this$0.mAdapter.getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
                List<FilterValuesCell> list = currentList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((FilterValuesCell) it.next()) instanceof HeaderCell) {
                        }
                    }
                }
            }
            z11 = false;
            break;
        }
        return Boolean.valueOf(z11);
    }
}
