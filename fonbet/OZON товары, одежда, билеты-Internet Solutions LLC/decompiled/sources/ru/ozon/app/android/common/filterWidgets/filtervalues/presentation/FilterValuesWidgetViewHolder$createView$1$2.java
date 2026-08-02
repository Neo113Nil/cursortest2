package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "pos", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesWidgetViewHolder$createView$1$2 extends AbstractC7737t implements Function1<Integer, Boolean> {
    final /* synthetic */ RecyclerView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesWidgetViewHolder$createView$1$2(RecyclerView recyclerView) {
        super(1);
        this.$this_apply = recyclerView;
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
        boolean z11 = false;
        if (adapter != null && adapter.getItemViewType(i11) == HeaderCell.INSTANCE.getViewType()) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
