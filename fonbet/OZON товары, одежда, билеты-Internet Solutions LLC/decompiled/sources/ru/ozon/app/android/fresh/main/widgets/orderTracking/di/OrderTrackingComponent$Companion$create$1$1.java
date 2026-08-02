package ru.ozon.app.android.fresh.main.widgets.orderTracking.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.api.OrderTrackingApi;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingMapper;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/orderTracking/di/OrderTrackingComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/di/OrderTrackingComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingMapper;", "orderTrackingMapper$delegate", "LSc/j;", "getOrderTrackingMapper", "()Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingMapper;", "orderTrackingMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingComponent$Companion$create$1$1 implements OrderTrackingComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: orderTrackingMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderTrackingMapper = k.b(OrderTrackingComponent$Companion$create$1$1$orderTrackingMapper$2.INSTANCE);
    private final a<OrderTrackingViewModel> viewModelProvider;

    OrderTrackingComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new Gx.a(c7475g, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTrackingViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        Object create = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getRetrofit().create(OrderTrackingApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new OrderTrackingViewModel((OrderTrackingApi) create);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingComponent
    public OrderTrackingMapper getOrderTrackingMapper() {
        return (OrderTrackingMapper) this.orderTrackingMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingComponent
    public a<OrderTrackingViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
