package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di;

import JI.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3ProgressMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3TrainMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3ViewStateBinder;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 )2\u00060\u0001j\u0002`\u0002:\u0001)R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3ProgressMapper;", "getProgressMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3ProgressMapper;", "progressMapper", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3TrainMapper;", "getTrainMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3TrainMapper;", "trainMapper", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/TravelRailwaySearchResultsV3ProgressViewModel;", "getProgressViewModel", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/TravelRailwaySearchResultsV3ProgressViewModel;", "progressViewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "getPerformanceTrackerDelegate", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3ViewStateBinder;", "getTravelRailwaySearchResultsV3ViewStateBinder", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3ViewStateBinder;", "travelRailwaySearchResultsV3ViewStateBinder", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TravelRailwaySearchResultsV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/di/TravelRailwaySearchResultsV3Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TravelRailwaySearchResultsV3Component create$lambda$0(final C7475g c7475g) {
            return new TravelRailwaySearchResultsV3Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component$Companion$create$1$1
                private final ActionComponentApi actionComponentApi;
                private final AnalyticsComponentApi analyticsComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final OnBoardingComponentApi onBoardingComponentApi;
                private final RetainComposerComponentApi retainComponentApi;
                private final RetainComposerPerformanceComponentApi retainComposerPerformanceApi;

                /* renamed from: progressMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j progressMapper = k.b(TravelRailwaySearchResultsV3Component$Companion$create$1$1$progressMapper$2.INSTANCE);

                /* renamed from: trainMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j trainMapper = k.b(TravelRailwaySearchResultsV3Component$Companion$create$1$1$trainMapper$2.INSTANCE);

                {
                    this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
                    this.retainComposerPerformanceApi = (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public FrameBinder getFrameBinder() {
                    return this.retainComposerPerformanceApi.getFrameBinder();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public PerformanceTrackerDelegate getPerformanceTrackerDelegate() {
                    return this.analyticsComponentApi.getPerformanceTrackerDelegate();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public TravelRailwaySearchResultsV3ProgressMapper getProgressMapper() {
                    return (TravelRailwaySearchResultsV3ProgressMapper) this.progressMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public TravelRailwaySearchResultsV3ProgressViewModel getProgressViewModel() {
                    return new TravelRailwaySearchResultsV3ProgressViewModel(this.actionComponentApi.getActionRepository());
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public TravelRailwaySearchResultsV3TrainMapper getTrainMapper() {
                    return (TravelRailwaySearchResultsV3TrainMapper) this.trainMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public TravelRailwaySearchResultsV3ViewStateBinder getTravelRailwaySearchResultsV3ViewStateBinder() {
                    return new TravelRailwaySearchResultsV3ViewStateBinder();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component
                public TravelOnboardingViewModel getOnBoardingViewModel() {
                    return new TravelOnboardingViewModel(this.onBoardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
                }
            };
        }

        @NotNull
        public final C7473e<TravelRailwaySearchResultsV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TravelRailwaySearchResultsV3Component.class), new a(storage, 4));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    BaseOnBoardingViewModel getOnBoardingViewModel();

    @NotNull
    PerformanceTrackerDelegate getPerformanceTrackerDelegate();

    @NotNull
    TravelRailwaySearchResultsV3ProgressMapper getProgressMapper();

    @NotNull
    TravelRailwaySearchResultsV3ProgressViewModel getProgressViewModel();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    TravelRailwaySearchResultsV3TrainMapper getTrainMapper();

    @NotNull
    TravelRailwaySearchResultsV3ViewStateBinder getTravelRailwaySearchResultsV3ViewStateBinder();
}
