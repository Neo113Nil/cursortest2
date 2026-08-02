package ru.ozon.app.android.cml.delivery.widgets.order.v2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.data.mapper.OrderParamsGroupVOMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.data.mapper.OrderWidgetStickyButtonVOMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.data.mapper.OrderWidgetV2AsyncUpdateMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component$Companion$create$1$1;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation.OrderWidgetV2ViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u00060\"j\u0002`#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"ru/ozon/app/android/cml/delivery/widgets/order/v2/di/OrderWidgetV2Component$Companion$create$1$1", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/di/OrderWidgetV2Component;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "cellListGroupMapper$delegate", "LSc/j;", "getCellListGroupMapper", "()Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "cellListGroupMapper", "Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderParamsGroupVOMapper;", "orderParamsGroupMapper$delegate", "getOrderParamsGroupMapper", "()Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderParamsGroupVOMapper;", "orderParamsGroupMapper", "Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderWidgetStickyButtonVOMapper;", "stickyButtonMapper$delegate", "getStickyButtonMapper", "()Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderWidgetStickyButtonVOMapper;", "stickyButtonMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/mapper/OrderWidgetV2AsyncUpdateMapper;", "orderWidgetV2AsyncUpdateMapper$delegate", "getOrderWidgetV2AsyncUpdateMapper", "()Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/mapper/OrderWidgetV2AsyncUpdateMapper;", "orderWidgetV2AsyncUpdateMapper", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderWidgetV2ViewModel;", "orderWidgetV2ViewModelProvider", "LPc/a;", "getOrderWidgetV2ViewModelProvider", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderWidgetV2Component$Companion$create$1$1 implements OrderWidgetV2Component {
    final /* synthetic */ CustomActionHandlersComponentApi $actionHandlersApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;
    private final a<OrderWidgetV2ViewModel> orderWidgetV2ViewModelProvider;

    /* renamed from: cellListGroupMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cellListGroupMapper = k.b(OrderWidgetV2Component$Companion$create$1$1$cellListGroupMapper$2.INSTANCE);

    /* renamed from: orderParamsGroupMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderParamsGroupMapper = k.b(new OrderWidgetV2Component$Companion$create$1$1$orderParamsGroupMapper$2(this));

    /* renamed from: stickyButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyButtonMapper = k.b(OrderWidgetV2Component$Companion$create$1$1$stickyButtonMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(OrderWidgetV2Component$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: orderWidgetV2AsyncUpdateMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderWidgetV2AsyncUpdateMapper = k.b(new OrderWidgetV2Component$Companion$create$1$1$orderWidgetV2AsyncUpdateMapper$2(this));

    OrderWidgetV2Component$Companion$create$1$1(CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi, final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi) {
        this.$actionHandlersApi = customActionHandlersComponentApi;
        this.$retainComposerApi = retainComposerComponentApi;
        this.orderWidgetV2ViewModelProvider = new a() { // from class: Xp.a
            @Override // Pc.a
            public final Object get() {
                OrderWidgetV2ViewModel orderWidgetV2ViewModelProvider$lambda$0;
                orderWidgetV2ViewModelProvider$lambda$0 = OrderWidgetV2Component$Companion$create$1$1.orderWidgetV2ViewModelProvider$lambda$0(ComposerWidgetAsyncComponentApi.this, this);
                return orderWidgetV2ViewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CellListGroupMapper getCellListGroupMapper() {
        return (CellListGroupMapper) this.cellListGroupMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderWidgetV2ViewModel orderWidgetV2ViewModelProvider$lambda$0(ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, OrderWidgetV2Component$Companion$create$1$1 orderWidgetV2Component$Companion$create$1$1) {
        return new OrderWidgetV2ViewModel(composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), orderWidgetV2Component$Companion$create$1$1.getOrderWidgetV2AsyncUpdateMapper());
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component
    public d getActionHandlersStoreFactory() {
        return this.$actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component
    public OrderParamsGroupVOMapper getOrderParamsGroupMapper() {
        return (OrderParamsGroupVOMapper) this.orderParamsGroupMapper.getValue();
    }

    public OrderWidgetV2AsyncUpdateMapper getOrderWidgetV2AsyncUpdateMapper() {
        return (OrderWidgetV2AsyncUpdateMapper) this.orderWidgetV2AsyncUpdateMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component
    public a<OrderWidgetV2ViewModel> getOrderWidgetV2ViewModelProvider() {
        return this.orderWidgetV2ViewModelProvider;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component
    public OrderWidgetStickyButtonVOMapper getStickyButtonMapper() {
        return (OrderWidgetStickyButtonVOMapper) this.stickyButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }
}
