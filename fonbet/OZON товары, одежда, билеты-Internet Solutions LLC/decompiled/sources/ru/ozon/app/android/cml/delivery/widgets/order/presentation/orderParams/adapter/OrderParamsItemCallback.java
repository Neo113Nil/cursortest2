package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.os.Bundle;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupVO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/OrderParamsItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "<init>", "()V", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$ParamsGroup;", "oldItem", "newItem", "Landroid/os/Bundle;", "handleOrderParamsGroupPayload", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$ParamsGroup;Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$ParamsGroup;)Landroid/os/Bundle;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$SecureDeal;", "handleSecureDealPayload", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$SecureDeal;Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$SecureDeal;)Landroid/os/Bundle;", "", "areItemsTheSame", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;)Ljava/lang/Object;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderParamsItemCallback extends i.d<OrderParamsItem> {
    private final Bundle handleOrderParamsGroupPayload(OrderParamsItem.ParamsGroup oldItem, OrderParamsItem.ParamsGroup newItem) {
        Bundle bundle = new Bundle();
        CellListGroupVO cellListGroupVO = oldItem.getCellListGroupVO();
        CellListGroupVO cellListGroupVO2 = newItem.getCellListGroupVO();
        if (cellListGroupVO.getTopMargin() != cellListGroupVO2.getTopMargin() || cellListGroupVO.getBottomMargin() != cellListGroupVO2.getBottomMargin()) {
            bundle.putBoolean("marginsChanged", true);
        }
        if (!Intrinsics.d(cellListGroupVO.getBackgroundColor(), cellListGroupVO2.getBackgroundColor())) {
            bundle.putBoolean("backgroundChanged", true);
        }
        if (cellListGroupVO.getCornerRadius() != cellListGroupVO2.getCornerRadius()) {
            bundle.putBoolean("cornerRadiusChanged", true);
        }
        if (!Intrinsics.d(cellListGroupVO.getTitle(), cellListGroupVO2.getTitle())) {
            bundle.putBoolean("titleChanged", true);
        }
        if (!Intrinsics.d(cellListGroupVO.getSubtitle(), cellListGroupVO2.getSubtitle())) {
            bundle.putBoolean("subtitleChanged", true);
        }
        if (!Intrinsics.d(cellListGroupVO.getCellItems(), cellListGroupVO2.getCellItems())) {
            bundle.putBoolean("cellsChanged", true);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    private final Bundle handleSecureDealPayload(OrderParamsItem.SecureDeal oldItem, OrderParamsItem.SecureDeal newItem) {
        Bundle bundle = new Bundle();
        SecureDealMoleculeDTO secureDeal = oldItem.getSecureDeal();
        SecureDealMoleculeDTO secureDeal2 = newItem.getSecureDeal();
        if (secureDeal.getTopMargin() != secureDeal2.getTopMargin() || secureDeal.getBottomMargin() != secureDeal2.getBottomMargin() || secureDeal.getLeftMargin() != secureDeal2.getLeftMargin() || secureDeal.getRightMargin() != secureDeal2.getRightMargin()) {
            bundle.putBoolean("marginsChanged", true);
        }
        if (!Intrinsics.d(secureDeal.getTitle(), secureDeal2.getTitle())) {
            bundle.putBoolean("titleChanged", true);
        }
        if (!Intrinsics.d(secureDeal.getToggle(), secureDeal2.getToggle())) {
            bundle.putBoolean("toggleChanged", true);
        }
        if (!Intrinsics.d(secureDeal.getTitleIconButton(), secureDeal2.getTitleIconButton())) {
            bundle.putBoolean("titleIconChanged", true);
        }
        if (!Intrinsics.d(secureDeal.getSubtitle(), secureDeal2.getSubtitle())) {
            bundle.putBoolean("subtitleChanged", true);
        }
        if (!Intrinsics.d(secureDeal.getBottomBlock(), secureDeal2.getBottomBlock())) {
            bundle.putBoolean("bottomBlockChanged", true);
        }
        if (!Intrinsics.d(secureDeal.getCommonControlSettings(), secureDeal2.getCommonControlSettings())) {
            bundle.putBoolean("actionChanged", true);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull OrderParamsItem oldItem, @NotNull OrderParamsItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull OrderParamsItem oldItem, @NotNull OrderParamsItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }

    @Override // androidx.recyclerview.widget.i.d
    public Object getChangePayload(@NotNull OrderParamsItem oldItem, @NotNull OrderParamsItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof OrderParamsItem.ParamsGroup) && (newItem instanceof OrderParamsItem.ParamsGroup)) {
            return handleOrderParamsGroupPayload((OrderParamsItem.ParamsGroup) oldItem, (OrderParamsItem.ParamsGroup) newItem);
        }
        if ((oldItem instanceof OrderParamsItem.SecureDeal) && (newItem instanceof OrderParamsItem.SecureDeal)) {
            return handleSecureDealPayload((OrderParamsItem.SecureDeal) oldItem, (OrderParamsItem.SecureDeal) newItem);
        }
        return null;
    }
}
