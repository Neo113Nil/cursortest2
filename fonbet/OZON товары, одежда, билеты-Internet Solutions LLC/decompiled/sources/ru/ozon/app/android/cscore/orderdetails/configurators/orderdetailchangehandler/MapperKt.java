package ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeEvent;
import ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailChangeHandlerViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"toActions", "", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action;", "", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "toAction", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapperKt {
    private static final OrderDetailChangeHandlerViewModel.Action toAction(OrderChangeEvent orderChangeEvent) {
        if (orderChangeEvent instanceof OrderChangeEvent.RefreshScreen) {
            return new OrderDetailChangeHandlerViewModel.Action.RefreshPage(0L, 1, null);
        }
        if (!(orderChangeEvent instanceof OrderChangeEvent.ShowMessage)) {
            throw new o();
        }
        OrderChangeEvent.ShowMessage showMessage = (OrderChangeEvent.ShowMessage) orderChangeEvent;
        return new OrderDetailChangeHandlerViewModel.Action.ShowMessage(showMessage.getMessage(), showMessage.getIconId());
    }

    @NotNull
    public static final List<OrderDetailChangeHandlerViewModel.Action> toActions(@NotNull Set<? extends OrderChangeEvent> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set<? extends OrderChangeEvent> set2 = set;
        ArrayList arrayList = new ArrayList(C7714v.z(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(toAction((OrderChangeEvent) it.next()));
        }
        return arrayList;
    }
}
