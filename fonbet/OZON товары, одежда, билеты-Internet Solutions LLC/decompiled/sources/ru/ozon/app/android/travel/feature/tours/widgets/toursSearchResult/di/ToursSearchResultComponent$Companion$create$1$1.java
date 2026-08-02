package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultLoadingMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.utils.ToursSearchResultRefreshObserver;

@Metadata(d1 = {"\u0000}\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#R!\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010.R\u0018\u00104\u001a\u000600j\u0002`18VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00109\u001a\u000605j\u0002`68VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"ru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/di/ToursSearchResultComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/di/ToursSearchResultComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "composerContextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/metrics/client/di/MetricsClientComponentApi;", "metricsClientComponentApi", "Lru/ozon/app/android/metrics/client/di/MetricsClientComponentApi;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultApi;", "kotlin.jvm.PlatformType", "toursSearchResultApi$delegate", "LSc/j;", "getToursSearchResultApi", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultApi;", "toursSearchResultApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "toursSearchResultMapper$delegate", "getToursSearchResultMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "toursSearchResultMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultLoadingMapper;", "toursSearchResultLoadingMapper$delegate", "getToursSearchResultLoadingMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultLoadingMapper;", "toursSearchResultLoadingMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "toursSearchResultViewModel$delegate", "getToursSearchResultViewModel", "()LPc/a;", "toursSearchResultViewModel", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/utils/ToursSearchResultRefreshObserver;", "toursSearchResultRefreshObserver$delegate", "getToursSearchResultRefreshObserver", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/utils/ToursSearchResultRefreshObserver;", "toursSearchResultRefreshObserver", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultComponent$Companion$create$1$1 implements ToursSearchResultComponent {
    private final AnalyticsComponentApi analyticsComponentApi;
    private final ContextComponentDependencies composerContextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final MetricsClientComponentApi metricsClientComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: toursSearchResultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j toursSearchResultApi = k.b(new ToursSearchResultComponent$Companion$create$1$1$toursSearchResultApi$2(this));

    /* renamed from: toursSearchResultMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j toursSearchResultMapper = k.b(new ToursSearchResultComponent$Companion$create$1$1$toursSearchResultMapper$2(this));

    /* renamed from: toursSearchResultLoadingMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j toursSearchResultLoadingMapper = k.b(ToursSearchResultComponent$Companion$create$1$1$toursSearchResultLoadingMapper$2.INSTANCE);

    /* renamed from: toursSearchResultViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j toursSearchResultViewModel = k.b(new ToursSearchResultComponent$Companion$create$1$1$toursSearchResultViewModel$2(this));

    /* renamed from: toursSearchResultRefreshObserver$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j toursSearchResultRefreshObserver = k.b(new ToursSearchResultComponent$Companion$create$1$1$toursSearchResultRefreshObserver$2(this));

    ToursSearchResultComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.composerContextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.metricsClientComponentApi = (MetricsClientComponentApi) c7475g.getComponent(MetricsClientComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToursSearchResultApi getToursSearchResultApi() {
        return (ToursSearchResultApi) this.toursSearchResultApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent
    public ToursSearchResultLoadingMapper getToursSearchResultLoadingMapper() {
        return (ToursSearchResultLoadingMapper) this.toursSearchResultLoadingMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent
    public ToursSearchResultMapper getToursSearchResultMapper() {
        return (ToursSearchResultMapper) this.toursSearchResultMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent
    public ToursSearchResultRefreshObserver getToursSearchResultRefreshObserver() {
        return (ToursSearchResultRefreshObserver) this.toursSearchResultRefreshObserver.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent
    public Pc.a<ToursSearchResultViewModel> getToursSearchResultViewModel() {
        return (Pc.a) this.toursSearchResultViewModel.getValue();
    }
}
