package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2ViewModel;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/di/TravelFlightCheckTariffComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/di/TravelFlightCheckTariffComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "travelCommonActionResultApi$delegate", "LSc/j;", "getTravelCommonActionResultApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "travelCommonActionResultApi", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2Mapper;", "travelFlightCheckTariffV2Mapper$delegate", "getTravelFlightCheckTariffV2Mapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2Mapper;", "travelFlightCheckTariffV2Mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2ViewModel;", "travelFlightCheckTariffV2ViewModelProvider$delegate", "getTravelFlightCheckTariffV2ViewModelProvider", "()LPc/a;", "travelFlightCheckTariffV2ViewModelProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffComponent$Companion$create$1$1 implements TravelFlightCheckTariffComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: travelCommonActionResultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelCommonActionResultApi = k.b(new TravelFlightCheckTariffComponent$Companion$create$1$1$travelCommonActionResultApi$2(this));

    /* renamed from: travelFlightCheckTariffV2Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelFlightCheckTariffV2Mapper = k.b(new TravelFlightCheckTariffComponent$Companion$create$1$1$travelFlightCheckTariffV2Mapper$2(this));

    /* renamed from: travelFlightCheckTariffV2ViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelFlightCheckTariffV2ViewModelProvider = k.b(new TravelFlightCheckTariffComponent$Companion$create$1$1$travelFlightCheckTariffV2ViewModelProvider$2(this));

    TravelFlightCheckTariffComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelCommonActionResultApi getTravelCommonActionResultApi() {
        Object value = this.travelCommonActionResultApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TravelCommonActionResultApi) value;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.di.TravelFlightCheckTariffComponent
    public TravelFlightCheckTariffV2Mapper getTravelFlightCheckTariffV2Mapper() {
        return (TravelFlightCheckTariffV2Mapper) this.travelFlightCheckTariffV2Mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.di.TravelFlightCheckTariffComponent
    public Pc.a<TravelFlightCheckTariffV2ViewModel> getTravelFlightCheckTariffV2ViewModelProvider() {
        return (Pc.a) this.travelFlightCheckTariffV2ViewModelProvider.getValue();
    }
}
