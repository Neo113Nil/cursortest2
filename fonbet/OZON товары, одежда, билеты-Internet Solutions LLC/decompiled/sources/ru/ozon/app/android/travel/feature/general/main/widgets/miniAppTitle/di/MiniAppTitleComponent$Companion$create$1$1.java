package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.data.MiniAppTitleMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.OnboardingType;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010#\u001a\u00060\u001fj\u0002` 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/di/MiniAppTitleComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/di/MiniAppTitleComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/data/MiniAppTitleMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/data/MiniAppTitleMapper;", "mapper", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/onboarding/MiniAppOnboardingInfoProvider;", "onboardingInfoProviders$delegate", "getOnboardingInfoProviders", "()Ljava/util/Map;", "onboardingInfoProviders", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onBoardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "getDispatchersProvider", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiniAppTitleComponent$Companion$create$1$1 implements MiniAppTitleComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final OnBoardingComponentApi onBoardingComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new MiniAppTitleComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: onboardingInfoProviders$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onboardingInfoProviders = k.b(MiniAppTitleComponent$Companion$create$1$1$onboardingInfoProviders$2.INSTANCE);

    MiniAppTitleComponent$Companion$create$1$1(C7475g c7475g) {
        this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di.MiniAppTitleComponent
    public CoroutineDispatcherProvider getDispatchersProvider() {
        return this.coroutineDispatchersComponentApi.getDispatcherProvider();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di.MiniAppTitleComponent
    public MiniAppTitleMapper getMapper() {
        return (MiniAppTitleMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di.MiniAppTitleComponent
    public Map<OnboardingType, MiniAppOnboardingInfoProvider> getOnboardingInfoProviders() {
        return (Map) this.onboardingInfoProviders.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di.MiniAppTitleComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di.MiniAppTitleComponent
    public TravelOnboardingViewModel getOnBoardingViewModel() {
        return new TravelOnboardingViewModel(this.onBoardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }
}
