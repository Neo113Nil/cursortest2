package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentApi;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/di/TravelPersonalAccountReplenishmentComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/di/TravelPersonalAccountReplenishmentComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentApi;", "kotlin.jvm.PlatformType", "travelPersonalAccountReplenishmentApi$delegate", "LSc/j;", "getTravelPersonalAccountReplenishmentApi", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentApi;", "travelPersonalAccountReplenishmentApi", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentMapper;", "travelPersonalAccountReplenishmentMapper$delegate", "getTravelPersonalAccountReplenishmentMapper", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentMapper;", "travelPersonalAccountReplenishmentMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel;", "travelPersonalAccountReplenishmentViewModelProvider$delegate", "getTravelPersonalAccountReplenishmentViewModelProvider", "()LPc/a;", "travelPersonalAccountReplenishmentViewModelProvider", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPersonalAccountReplenishmentComponent$Companion$create$1$1 implements TravelPersonalAccountReplenishmentComponent {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: travelPersonalAccountReplenishmentApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelPersonalAccountReplenishmentApi = k.b(new TravelPersonalAccountReplenishmentComponent$Companion$create$1$1$travelPersonalAccountReplenishmentApi$2(this));

    /* renamed from: travelPersonalAccountReplenishmentMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelPersonalAccountReplenishmentMapper = k.b(TravelPersonalAccountReplenishmentComponent$Companion$create$1$1$travelPersonalAccountReplenishmentMapper$2.INSTANCE);

    /* renamed from: travelPersonalAccountReplenishmentViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelPersonalAccountReplenishmentViewModelProvider = k.b(new TravelPersonalAccountReplenishmentComponent$Companion$create$1$1$travelPersonalAccountReplenishmentViewModelProvider$2(this));

    TravelPersonalAccountReplenishmentComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelPersonalAccountReplenishmentApi getTravelPersonalAccountReplenishmentApi() {
        return (TravelPersonalAccountReplenishmentApi) this.travelPersonalAccountReplenishmentApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di.TravelPersonalAccountReplenishmentComponent
    public TravelPersonalAccountReplenishmentMapper getTravelPersonalAccountReplenishmentMapper() {
        return (TravelPersonalAccountReplenishmentMapper) this.travelPersonalAccountReplenishmentMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di.TravelPersonalAccountReplenishmentComponent
    public Pc.a<TravelPersonalAccountReplenishmentViewModel> getTravelPersonalAccountReplenishmentViewModelProvider() {
        return (Pc.a) this.travelPersonalAccountReplenishmentViewModelProvider.getValue();
    }
}
