package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorApi;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewModel;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/di/TouristCountSelectorComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/di/TouristCountSelectorComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorApi;", "kotlin.jvm.PlatformType", "touristCountSelectorApi$delegate", "LSc/j;", "getTouristCountSelectorApi", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorApi;", "touristCountSelectorApi", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorComponent$Companion$create$1$1 implements TouristCountSelectorComponent {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: touristCountSelectorApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j touristCountSelectorApi = k.b(new TouristCountSelectorComponent$Companion$create$1$1$touristCountSelectorApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TouristCountSelectorComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(new TouristCountSelectorComponent$Companion$create$1$1$viewModelProvider$2(this));

    TouristCountSelectorComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TouristCountSelectorApi getTouristCountSelectorApi() {
        return (TouristCountSelectorApi) this.touristCountSelectorApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di.TouristCountSelectorComponent
    public TouristCountSelectorMapper getMapper() {
        return (TouristCountSelectorMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di.TouristCountSelectorComponent
    public Pc.a<TouristCountSelectorViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
