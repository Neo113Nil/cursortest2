package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.TravelOrderListMobileMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.TravelOrderListMobileViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/di/TravelOrderListMobileComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/di/TravelOrderListMobileComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "handlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "kotlin.jvm.PlatformType", "resultApi$delegate", "LSc/j;", "getResultApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "resultApi", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileMapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListMobileComponent$Companion$create$1$1 implements TravelOrderListMobileComponent {
    private final CustomActionHandlersComponentApi handlersApi;
    private final NetworkComponentApi networkApi;

    /* renamed from: resultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j resultApi = k.b(new TravelOrderListMobileComponent$Companion$create$1$1$resultApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TravelOrderListMobileComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(TravelOrderListMobileComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    TravelOrderListMobileComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.handlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    private final TravelCommonActionResultApi getResultApi() {
        return (TravelCommonActionResultApi) this.resultApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListMobileComponent
    public d getActionHandlersStoreFactory() {
        return this.handlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListMobileComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListMobileComponent
    public TravelOrderListMobileMapper getMapper() {
        return (TravelOrderListMobileMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListMobileComponent
    public TravelOrderListMobileViewModel getViewModel() {
        TravelCommonActionResultApi resultApi = getResultApi();
        Intrinsics.checkNotNullExpressionValue(resultApi, "<get-resultApi>(...)");
        return new TravelOrderListMobileViewModel(resultApi);
    }
}
