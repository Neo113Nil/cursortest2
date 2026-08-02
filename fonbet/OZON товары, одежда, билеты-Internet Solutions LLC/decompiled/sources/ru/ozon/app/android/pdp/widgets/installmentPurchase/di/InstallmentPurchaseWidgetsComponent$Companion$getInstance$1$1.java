package ru.ozon.app.android.pdp.widgets.installmentPurchase.di;

import Sc.InterfaceC4008j;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.periods.InstallmentPeriodsMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.title.InstallmentTitleMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\u00060 j\u0002`!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"ru/ozon/app/android/pdp/widgets/installmentPurchase/di/InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/di/InstallmentPurchaseWidgetsComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "installmentPurchaseMapper$delegate", "LSc/j;", "getInstallmentPurchaseMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "installmentPurchaseMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/periods/InstallmentPeriodsMapper;", "installmentPeriodsMapper$delegate", "getInstallmentPeriodsMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/periods/InstallmentPeriodsMapper;", "installmentPeriodsMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/title/InstallmentTitleMapper;", "installmentTitleMapper$delegate", "getInstallmentTitleMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/title/InstallmentTitleMapper;", "installmentTitleMapper", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "getSaleBlockViewModel", "()Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1 implements InstallmentPurchaseWidgetsComponent {
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: installmentPurchaseMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j installmentPurchaseMapper = DelegatesKt.lazyUnsafe(InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1$installmentPurchaseMapper$2.INSTANCE);

    /* renamed from: installmentPeriodsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j installmentPeriodsMapper = DelegatesKt.lazyUnsafe(InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1$installmentPeriodsMapper$2.INSTANCE);

    /* renamed from: installmentTitleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j installmentTitleMapper = DelegatesKt.lazyUnsafe(InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1$installmentTitleMapper$2.INSTANCE);

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = DelegatesKt.lazyUnsafe(new InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1$appType$2(this));

    InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public InstallmentPeriodsMapper getInstallmentPeriodsMapper() {
        return (InstallmentPeriodsMapper) this.installmentPeriodsMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public InstallmentPurchaseMapper getInstallmentPurchaseMapper() {
        return (InstallmentPurchaseMapper) this.installmentPurchaseMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public InstallmentTitleMapper getInstallmentTitleMapper() {
        return (InstallmentTitleMapper) this.installmentTitleMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public BaseOnBoardingViewModel.Default getOnboardingViewModel() {
        return new BaseOnBoardingViewModel.Default(this.onboardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public SaleBlockViewModel getSaleBlockViewModel() {
        return new SaleBlockViewModel();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
