package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.imageprefetch.IconBackgroundImagePrefetchProvider;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4AllDoneMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4LoadingMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4ViewStateBinder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.AviaSearchResultV4LoadingWidgetViewModel;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R!\u00103\u001a\b\u0012\u0004\u0012\u00020/0.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u00102R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0015\u0010@\u001a\u00060<j\u0002`=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010D\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0015\u0010M\u001a\u00060Ij\u0002`J8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/di/AviaSearchResultV4Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "actionHandlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "imagePrefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4AllDoneMapper;", "aviaSearchResultV4AllDoneMapper$delegate", "LSc/j;", "getAviaSearchResultV4AllDoneMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4AllDoneMapper;", "aviaSearchResultV4AllDoneMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4LoadingMapper;", "aviaSearchResultV4LoadingMapper$delegate", "getAviaSearchResultV4LoadingMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4LoadingMapper;", "aviaSearchResultV4LoadingMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewModel;", "aviaSearchResultV4LoadingWidgetViewModel$delegate", "getAviaSearchResultV4LoadingWidgetViewModel", "()LPc/a;", "aviaSearchResultV4LoadingWidgetViewModel", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel;", "getAviaSearchResultV4AllDoneViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel;", "aviaSearchResultV4AllDoneViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4ViewStateBinder;", "getAviaSearchResultV4ViewStateBinder", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4ViewStateBinder;", "aviaSearchResultV4ViewStateBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaSearchResultV4Component implements InterfaceC6958a {

    @NotNull
    private final CustomActionHandlersComponentApi actionHandlersApi;

    @NotNull
    private final AnalyticsComponentApi analyticsComponentApi;

    /* renamed from: aviaSearchResultV4AllDoneMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j aviaSearchResultV4AllDoneMapper;

    /* renamed from: aviaSearchResultV4LoadingMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j aviaSearchResultV4LoadingMapper;

    /* renamed from: aviaSearchResultV4LoadingWidgetViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j aviaSearchResultV4LoadingWidgetViewModel;

    @NotNull
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    @NotNull
    private final ImagePrefetcher<IconDTO> imagePrefetcher;

    @NotNull
    private final OnBoardingComponentApi onBoardingComponentApi;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    @NotNull
    private final RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi;

    public AviaSearchResultV4Component(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.actionHandlersApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.onBoardingComponentApi = (OnBoardingComponentApi) storage.getComponent(OnBoardingComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) storage.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.retainComposerPerformanceComponentApi = (RetainComposerPerformanceComponentApi) storage.getComponent(RetainComposerPerformanceComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        IconBackgroundImagePrefetchProvider iconBackgroundImagePrefetchProvider = new IconBackgroundImagePrefetchProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(IconDTO.class), iconBackgroundImagePrefetchProvider);
        this.imagePrefetcher = new ImagePrefetcher<>(6, imagePrefetchInfoProviderStorage);
        this.aviaSearchResultV4AllDoneMapper = k.b(new AviaSearchResultV4Component$aviaSearchResultV4AllDoneMapper$2(this));
        this.aviaSearchResultV4LoadingMapper = k.b(new AviaSearchResultV4Component$aviaSearchResultV4LoadingMapper$2(this));
        this.aviaSearchResultV4LoadingWidgetViewModel = k.b(new AviaSearchResultV4Component$aviaSearchResultV4LoadingWidgetViewModel$2(this));
    }

    @NotNull
    public final d getActionHandlersStoreFactory() {
        return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final AviaSearchResultV4AllDoneMapper getAviaSearchResultV4AllDoneMapper() {
        return (AviaSearchResultV4AllDoneMapper) this.aviaSearchResultV4AllDoneMapper.getValue();
    }

    @NotNull
    public final AviaSearchResultV4AllDoneViewModel getAviaSearchResultV4AllDoneViewModel() {
        return new AviaSearchResultV4AllDoneViewModel();
    }

    @NotNull
    public final AviaSearchResultV4LoadingMapper getAviaSearchResultV4LoadingMapper() {
        return (AviaSearchResultV4LoadingMapper) this.aviaSearchResultV4LoadingMapper.getValue();
    }

    @NotNull
    public final Pc.a<AviaSearchResultV4LoadingWidgetViewModel> getAviaSearchResultV4LoadingWidgetViewModel() {
        return (Pc.a) this.aviaSearchResultV4LoadingWidgetViewModel.getValue();
    }

    @NotNull
    public final AviaSearchResultV4ViewStateBinder getAviaSearchResultV4ViewStateBinder() {
        return new AviaSearchResultV4ViewStateBinder();
    }

    @NotNull
    public final FrameBinder getFrameBinder() {
        return this.retainComposerPerformanceComponentApi.getFrameBinder();
    }

    @NotNull
    public final TravelOnboardingViewModel getOnBoardingViewModel() {
        return new TravelOnboardingViewModel(this.onBoardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
