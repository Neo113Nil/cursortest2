package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.StatusBannerMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.StatusBannerRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.api.StatusBannerApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation.StatusBannerViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/di/StatusBannerComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/di/StatusBannerComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/api/StatusBannerApi;", "statusBannerApi$delegate", "LSc/j;", "getStatusBannerApi", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/api/StatusBannerApi;", "statusBannerApi", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerRepository;", "statusBannerRepository$delegate", "getStatusBannerRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerRepository;", "statusBannerRepository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerMapper;", "mapper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerMapper;", "getMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerMapper;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewModel;", "viewModel", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusBannerComponent$Companion$create$1$1 implements StatusBannerComponent {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: statusBannerApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j statusBannerApi = k.b(new StatusBannerComponent$Companion$create$1$1$statusBannerApi$2(this));

    /* renamed from: statusBannerRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j statusBannerRepository = k.b(new StatusBannerComponent$Companion$create$1$1$statusBannerRepository$2(this));
    private final StatusBannerMapper mapper = new StatusBannerMapper();

    StatusBannerComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatusBannerApi getStatusBannerApi() {
        return (StatusBannerApi) this.statusBannerApi.getValue();
    }

    private final StatusBannerRepository getStatusBannerRepository() {
        return (StatusBannerRepository) this.statusBannerRepository.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.di.StatusBannerComponent
    public StatusBannerMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.di.StatusBannerComponent
    public StatusBannerViewModel getViewModel() {
        return new StatusBannerViewModel(getStatusBannerRepository());
    }
}
