package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data.PricesHistogramMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/di/PricesHistogramComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/di/PricesHistogramComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "kotlin.jvm.PlatformType", "resultApi$delegate", "LSc/j;", "getResultApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "resultApi", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramComponent$Companion$create$1$1 implements PricesHistogramComponent {
    private final ContextComponentDependencies contextApi;
    private final NetworkComponentApi networkApi;
    private final RetainComposerComponentApi retainApi;

    /* renamed from: resultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j resultApi = k.b(new PricesHistogramComponent$Companion$create$1$1$resultApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new PricesHistogramComponent$Companion$create$1$1$mapper$2(this));

    PricesHistogramComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.contextApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    private final TravelCommonActionResultApi getResultApi() {
        return (TravelCommonActionResultApi) this.resultApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.di.PricesHistogramComponent
    public PricesHistogramMapper getMapper() {
        return (PricesHistogramMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.di.PricesHistogramComponent
    public l getTokenizedAnalytics() {
        return this.retainApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.di.PricesHistogramComponent
    public PricesHistogramViewModel getViewModel() {
        TravelCommonActionResultApi resultApi = getResultApi();
        Intrinsics.checkNotNullExpressionValue(resultApi, "<get-resultApi>(...)");
        return new PricesHistogramViewModel(resultApi);
    }
}
