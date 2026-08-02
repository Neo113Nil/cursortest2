package ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.data.DisposableBannerMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.presentation.DisposableBannerViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/di/DisposableBannerComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/di/DisposableBannerComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "kotlin.jvm.PlatformType", "completableApi$delegate", "LSc/j;", "getCompletableApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "completableApi", "Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/data/DisposableBannerMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/data/DisposableBannerMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerViewModel;", "viewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisposableBannerComponent$Companion$create$1$1 implements DisposableBannerComponent {

    /* renamed from: completableApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j completableApi = k.b(new DisposableBannerComponent$Companion$create$1$1$completableApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(DisposableBannerComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final NetworkComponentApi networkApi;

    DisposableBannerComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    private final TravelCommonCompletableApi getCompletableApi() {
        return (TravelCommonCompletableApi) this.completableApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.di.DisposableBannerComponent
    public DisposableBannerMapper getMapper() {
        return (DisposableBannerMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.di.DisposableBannerComponent
    public DisposableBannerViewModel getViewModel() {
        TravelCommonCompletableApi completableApi = getCompletableApi();
        Intrinsics.checkNotNullExpressionValue(completableApi, "<get-completableApi>(...)");
        return new DisposableBannerViewModel(completableApi);
    }
}
