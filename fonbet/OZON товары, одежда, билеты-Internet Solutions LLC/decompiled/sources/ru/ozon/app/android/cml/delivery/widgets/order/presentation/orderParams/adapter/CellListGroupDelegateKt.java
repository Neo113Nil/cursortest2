package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupVO;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupView;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "cellListGroupAdapterDelegate", "(Lkotlin/jvm/functions/Function1;Landroidx/recyclerview/widget/RecyclerView$u;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupView;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "item", "Landroid/os/Bundle;", "payload", "handlePayload", "(Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupView;Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)V", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellListGroupDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<OrderParamsItem>> cellListGroupAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull RecyclerView.u viewPool) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        return new DslViewBindingListAdapterDelegate(new CellListGroupDelegateKt$cellListGroupAdapterDelegate$1(viewPool), CellListGroupDelegateKt$cellListGroupAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new CellListGroupDelegateKt$cellListGroupAdapterDelegate$2(actionHandler), CellListGroupDelegateKt$cellListGroupAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePayload(CellListGroupView cellListGroupView, CellListGroupVO cellListGroupVO, Bundle bundle, Function1<? super AtomAction, Unit> function1) {
        if (bundle.containsKey("marginsChanged")) {
            cellListGroupView.setMargins(cellListGroupVO.getTopMargin(), cellListGroupVO.getBottomMargin());
        }
        if (bundle.containsKey("backgroundChanged")) {
            cellListGroupView.setBackground(cellListGroupVO.getBackgroundColor());
        }
        if (bundle.containsKey("cornerRadiusChanged")) {
            cellListGroupView.setCornerRadius(cellListGroupVO.getCornerRadius());
        }
        if (bundle.containsKey("titleChanged")) {
            cellListGroupView.bindTitle(cellListGroupVO.getTitle());
        }
        if (bundle.containsKey("subtitleChanged")) {
            cellListGroupView.bindSubtitle(cellListGroupVO.getSubtitle());
        }
        if (bundle.containsKey("cellsChanged")) {
            cellListGroupView.bindCells(cellListGroupVO.getCellItems(), function1);
        }
    }
}
