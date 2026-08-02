package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/CellListGroupViewBinding;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CellListGroupDelegateKt$cellListGroupAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, CellListGroupViewBinding> {
    final /* synthetic */ RecyclerView.u $viewPool;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellListGroupDelegateKt$cellListGroupAdapterDelegate$1(RecyclerView.u uVar) {
        super(2);
        this.$viewPool = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CellListGroupViewBinding invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CellListGroupView cellListGroupView = new CellListGroupView(context, null, 0, 6, null);
        RecyclerView.u uVar = this.$viewPool;
        cellListGroupView.setLayoutParams(new RecyclerView.p(-1, -2));
        cellListGroupView.setRecycledViewPool(uVar);
        return new CellListGroupViewBinding(cellListGroupView);
    }
}
