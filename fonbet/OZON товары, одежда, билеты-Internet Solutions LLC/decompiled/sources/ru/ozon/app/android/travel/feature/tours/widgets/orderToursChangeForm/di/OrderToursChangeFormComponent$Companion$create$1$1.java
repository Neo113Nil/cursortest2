package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.data.OrderToursChangeFormButtonMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.data.OrderToursChangeFormMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010#\u001a\u00060\u001fj\u0002` 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"ru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/di/OrderToursChangeFormComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/di/OrderToursChangeFormComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "kotlin.jvm.PlatformType", "travelCommonActionResultApi$delegate", "LSc/j;", "getTravelCommonActionResultApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "travelCommonActionResultApi", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/data/OrderToursChangeFormMapper;", "orderToursChangeFormMapper$delegate", "getOrderToursChangeFormMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/data/OrderToursChangeFormMapper;", "orderToursChangeFormMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/data/OrderToursChangeFormButtonMapper;", "orderToursChangeFormButtonMapper$delegate", "getOrderToursChangeFormButtonMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/data/OrderToursChangeFormButtonMapper;", "orderToursChangeFormButtonMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;", "orderToursChangeFormViewModel$delegate", "getOrderToursChangeFormViewModel", "()LPc/a;", "orderToursChangeFormViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderToursChangeFormComponent$Companion$create$1$1 implements OrderToursChangeFormComponent {
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: travelCommonActionResultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelCommonActionResultApi = k.b(new OrderToursChangeFormComponent$Companion$create$1$1$travelCommonActionResultApi$2(this));

    /* renamed from: orderToursChangeFormMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderToursChangeFormMapper = k.b(OrderToursChangeFormComponent$Companion$create$1$1$orderToursChangeFormMapper$2.INSTANCE);

    /* renamed from: orderToursChangeFormButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderToursChangeFormButtonMapper = k.b(OrderToursChangeFormComponent$Companion$create$1$1$orderToursChangeFormButtonMapper$2.INSTANCE);

    /* renamed from: orderToursChangeFormViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderToursChangeFormViewModel = k.b(new OrderToursChangeFormComponent$Companion$create$1$1$orderToursChangeFormViewModel$2(this));

    OrderToursChangeFormComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelCommonActionResultApi getTravelCommonActionResultApi() {
        return (TravelCommonActionResultApi) this.travelCommonActionResultApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent
    public OrderToursChangeFormButtonMapper getOrderToursChangeFormButtonMapper() {
        return (OrderToursChangeFormButtonMapper) this.orderToursChangeFormButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent
    public OrderToursChangeFormMapper getOrderToursChangeFormMapper() {
        return (OrderToursChangeFormMapper) this.orderToursChangeFormMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent
    public Pc.a<OrderToursChangeFormViewModel> getOrderToursChangeFormViewModel() {
        return (Pc.a) this.orderToursChangeFormViewModel.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
