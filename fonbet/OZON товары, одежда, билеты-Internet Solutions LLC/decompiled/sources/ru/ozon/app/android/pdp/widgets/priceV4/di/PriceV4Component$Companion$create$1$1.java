package ru.ozon.app.android.pdp.widgets.priceV4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4SizeResolver;

@Metadata(d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u00060\u001cj\u0002`\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"ru/ozon/app/android/pdp/widgets/priceV4/di/PriceV4Component$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/priceV4/di/PriceV4Component;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "LSc/j;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4SizeResolver;", "onboardingResolver$delegate", "getOnboardingResolver", "()Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4SizeResolver;", "onboardingResolver", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate$delegate", "getPartnerBanksDelegate", "()Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV4Component$Companion$create$1$1 implements PriceV4Component {
    final /* synthetic */ C7475g $storage;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(PriceV4Component$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: onboardingResolver$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onboardingResolver = k.b(PriceV4Component$Companion$create$1$1$onboardingResolver$2.INSTANCE);

    /* renamed from: partnerBanksDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j partnerBanksDelegate = k.b(new PriceV4Component$Companion$create$1$1$partnerBanksDelegate$2(this));

    PriceV4Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component
    public FeatureChecker getFeatureChecker() {
        return getNetworkComponentApi().getFeatureChecker();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component
    public PriceV4SizeResolver getOnboardingResolver() {
        return (PriceV4SizeResolver) this.onboardingResolver.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component
    public BaseOnBoardingViewModel.Default getOnboardingViewModel() {
        return new BaseOnBoardingViewModel.Default(this.onboardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component
    public PartnerBanksDelegate getPartnerBanksDelegate() {
        return (PartnerBanksDelegate) this.partnerBanksDelegate.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
