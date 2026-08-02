package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.di;

import KK.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarViewModel;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.data.OrderNavTitleMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/di/OrderNavTitleComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "<init>", "()V", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "getViewModelProvider", "()LPc/a;", "kotlin.jvm.PlatformType", "viewModel", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleMapper;", "mapper", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderNavTitleComponent implements InterfaceC6958a {

    @NotNull
    private final a<OrderNavBarViewModel> viewModel = new b(1);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(OrderNavTitleComponent$mapper$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderNavBarViewModel viewModel$lambda$0() {
        return new OrderNavBarViewModel();
    }

    @NotNull
    public final OrderNavTitleMapper getMapper() {
        return (OrderNavTitleMapper) this.mapper.getValue();
    }

    @NotNull
    public final a<OrderNavBarViewModel> getViewModelProvider() {
        return this.viewModel;
    }
}
