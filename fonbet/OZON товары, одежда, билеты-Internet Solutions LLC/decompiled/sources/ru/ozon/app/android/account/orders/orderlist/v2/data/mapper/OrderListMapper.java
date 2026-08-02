package ru.ozon.app.android.account.orders.orderlist.v2.data.mapper;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.OrderDTO;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.OrderListDTO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderVO;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/mapper/OrderListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderListDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderListMapper implements Function2<OrderListDTO, d, List<? extends OrderVO>> {

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;

    @NotNull
    private final Context context;

    public OrderListMapper(@NotNull Context context, @NotNull ApplicationInfoDataSource applicationInfoDataSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        this.context = context;
        this.applicationInfoDataSource = applicationInfoDataSource;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderVO> invoke(@NotNull OrderListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<OrderDTO> orderList = state.getOrderList();
        ArrayList arrayList = new ArrayList(C7714v.z(orderList, 10));
        Iterator<T> it = orderList.iterator();
        while (it.hasNext()) {
            arrayList.add(OrdersKt.toVo((OrderDTO) it.next(), this.context, this.applicationInfoDataSource.getUniqueApplicationId()));
        }
        return arrayList;
    }
}
