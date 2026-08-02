package ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersSelectorViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/ozon/app/android/travel/feature/general/widgets/travelPassengersCountSelector/v1/di/TravelPassengersCountSelectorComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/widgets/travelPassengersCountSelector/v1/di/TravelPassengersCountSelectorComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "handlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "travelCommonActionResultApi$delegate", "LSc/j;", "getTravelCommonActionResultApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "travelCommonActionResultApi", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel;", "getSelectorViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel;", "selectorViewModel", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "getSharedRefreshViewModel", "()Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "sharedRefreshViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPassengersCountSelectorComponent$Companion$create$1$1 implements TravelPassengersCountSelectorComponent {
    private final CustomActionHandlersComponentApi handlersApi;
    private final NetworkComponentApi networkApi;

    /* renamed from: travelCommonActionResultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelCommonActionResultApi = k.b(new TravelPassengersCountSelectorComponent$Companion$create$1$1$travelCommonActionResultApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TravelPassengersCountSelectorComponent$Companion$create$1$1$mapper$2.INSTANCE);

    TravelPassengersCountSelectorComponent$Companion$create$1$1(C7475g c7475g) {
        this.handlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    private final TravelCommonActionResultApi getTravelCommonActionResultApi() {
        Object value = this.travelCommonActionResultApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TravelCommonActionResultApi) value;
    }

    @Override // ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di.TravelPassengersCountSelectorComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.handlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di.TravelPassengersCountSelectorComponent
    public TravelPassengersCountSelectorMapper getMapper() {
        return (TravelPassengersCountSelectorMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di.TravelPassengersCountSelectorComponent
    public TravelPassengersSelectorViewModel getSelectorViewModel() {
        return new TravelPassengersSelectorViewModel(getTravelCommonActionResultApi());
    }

    @Override // ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di.TravelPassengersCountSelectorComponent
    public ModalParentRefreshSharedViewModel getSharedRefreshViewModel() {
        return new ModalParentRefreshSharedViewModel();
    }
}
