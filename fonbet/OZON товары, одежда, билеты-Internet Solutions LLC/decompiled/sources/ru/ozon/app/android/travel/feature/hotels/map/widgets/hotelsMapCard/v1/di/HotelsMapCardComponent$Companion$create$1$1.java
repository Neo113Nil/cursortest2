package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.data.HotelsMapCardV1Mapper;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/di/HotelsMapCardComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/di/HotelsMapCardComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapCardComponent$Companion$create$1$1 implements HotelsMapCardComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final LocationComponentApi locationComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(HotelsMapCardComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(new HotelsMapCardComponent$Companion$create$1$1$viewModelProvider$2(this));

    HotelsMapCardComponent$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.locationComponentApi = (LocationComponentApi) c7475g.getComponent(LocationComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.di.HotelsMapCardComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.di.HotelsMapCardComponent
    public HotelsMapCardV1Mapper getMapper() {
        return (HotelsMapCardV1Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.di.HotelsMapCardComponent
    public Pc.a<HotelMapInfoViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
