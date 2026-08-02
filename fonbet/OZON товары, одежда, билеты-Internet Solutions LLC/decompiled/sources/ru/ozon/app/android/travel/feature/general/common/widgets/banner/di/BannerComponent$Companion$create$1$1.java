package ru.ozon.app.android.travel.feature.general.common.widgets.banner.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.data.BannerMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.presentation.BannerViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/banner/di/BannerComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/banner/di/BannerComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "kotlin.jvm.PlatformType", "completableApi$delegate", "LSc/j;", "getCompletableApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "completableApi", "Lru/ozon/app/android/travel/feature/general/common/widgets/banner/data/BannerMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/banner/data/BannerMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/banner/presentation/BannerViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/banner/presentation/BannerViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerComponent$Companion$create$1$1 implements BannerComponent {
    private final ContextComponentDependencies contextApi;
    private final NetworkComponentApi networkApi;
    private final RetainComposerComponentApi retainApi;

    /* renamed from: completableApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j completableApi = k.b(new BannerComponent$Companion$create$1$1$completableApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new BannerComponent$Companion$create$1$1$mapper$2(this));

    BannerComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final TravelCommonCompletableApi getCompletableApi() {
        return (TravelCommonCompletableApi) this.completableApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.banner.di.BannerComponent
    public BannerMapper getMapper() {
        return (BannerMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.banner.di.BannerComponent
    public l getTokenizedAnalytics() {
        return this.retainApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.banner.di.BannerComponent
    public BannerViewModel getViewModel() {
        TravelCommonCompletableApi completableApi = getCompletableApi();
        Intrinsics.checkNotNullExpressionValue(completableApi, "<get-completableApi>(...)");
        return new BannerViewModel(completableApi);
    }
}
