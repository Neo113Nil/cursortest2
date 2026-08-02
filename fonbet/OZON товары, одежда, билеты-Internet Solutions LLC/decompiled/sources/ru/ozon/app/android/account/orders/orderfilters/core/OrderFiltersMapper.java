package ru.ozon.app.android.account.orders.orderfilters.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderfilters.data.OrderFiltersDTO;
import ru.ozon.app.android.account.orders.orderfilters.presentation.OrderFiltersVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/core/OrderFiltersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderFiltersMapper implements Function2<OrderFiltersDTO, d, List<? extends OrderFiltersVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderFiltersVO> invoke(@NotNull OrderFiltersDTO state, @NotNull d widgetInfo) {
        ?? r32;
        ?? r102;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long j11 = -1257809818;
        List<OrderFiltersDTO.SortDTO> sorts = state.getSorts();
        if (sorts != null) {
            List<OrderFiltersDTO.SortDTO> list = sorts;
            r32 = new ArrayList(C7714v.z(list, 10));
            for (OrderFiltersDTO.SortDTO sortDTO : list) {
                r32.add(new OrderFiltersVO.SortVO(sortDTO.isSelected(), sortDTO.getName(), sortDTO.getDeeplink()));
            }
        } else {
            r32 = K.f71697a;
        }
        List<OrderFiltersDTO.YearDTO> years = state.getYears();
        if (years != null) {
            List<OrderFiltersDTO.YearDTO> list2 = years;
            r102 = new ArrayList(C7714v.z(list2, 10));
            for (OrderFiltersDTO.YearDTO yearDTO : list2) {
                r102.add(new OrderFiltersVO.YearVO(yearDTO.isSelected(), yearDTO.getName(), yearDTO.getDeeplink()));
            }
        } else {
            r102 = K.f71697a;
        }
        return C7714v.a0(new OrderFiltersVO(j11, r32, r102));
    }
}
