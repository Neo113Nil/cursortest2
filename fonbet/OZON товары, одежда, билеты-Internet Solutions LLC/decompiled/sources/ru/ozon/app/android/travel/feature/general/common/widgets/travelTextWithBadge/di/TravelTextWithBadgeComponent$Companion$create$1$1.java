package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.data.TravelTextWithBadgeMapper;
import ru.ozon.app.android.travel.utils.onboarding.data.TravelOnboardingDisplayRepository;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/di/TravelTextWithBadgeComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/di/TravelTextWithBadgeComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/travel/utils/onboarding/data/TravelOnboardingDisplayRepository;", "travelOnboardingDisplayRepository$delegate", "LSc/j;", "getTravelOnboardingDisplayRepository", "()Lru/ozon/app/android/travel/utils/onboarding/data/TravelOnboardingDisplayRepository;", "travelOnboardingDisplayRepository", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeMapper;", "mapper", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onBoardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextWithBadgeComponent$Companion$create$1$1 implements TravelTextWithBadgeComponent {
    private final ContextComponentDependencies contextComponentApi;
    private final OnBoardingComponentApi onBoardingComponentApi;
    private final RetainComposerComponentApi retainComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: travelOnboardingDisplayRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelOnboardingDisplayRepository = k.b(new TravelTextWithBadgeComponent$Companion$create$1$1$travelOnboardingDisplayRepository$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TravelTextWithBadgeComponent$Companion$create$1$1$mapper$2(this));

    TravelTextWithBadgeComponent$Companion$create$1$1(C7475g c7475g) {
        this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final TravelOnboardingDisplayRepository getTravelOnboardingDisplayRepository() {
        return (TravelOnboardingDisplayRepository) this.travelOnboardingDisplayRepository.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.di.TravelTextWithBadgeComponent
    public TravelTextWithBadgeMapper getMapper() {
        return (TravelTextWithBadgeMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.di.TravelTextWithBadgeComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.di.TravelTextWithBadgeComponent
    public TravelOnboardingViewModel getOnBoardingViewModel() {
        return new TravelOnboardingViewModel(getTravelOnboardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }
}
