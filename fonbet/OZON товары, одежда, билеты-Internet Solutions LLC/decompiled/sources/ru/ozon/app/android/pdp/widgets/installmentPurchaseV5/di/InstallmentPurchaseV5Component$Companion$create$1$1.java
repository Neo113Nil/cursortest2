package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentV5ProductsListMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentV5SingleProductMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentV5TitleMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/pdp/widgets/installmentPurchaseV5/di/InstallmentPurchaseV5Component$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/di/InstallmentPurchaseV5Component;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5TitleMapper;", "titleMapper$delegate", "LSc/j;", "getTitleMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5TitleMapper;", "titleMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5SingleProductMapper;", "singleProductMapper$delegate", "getSingleProductMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5SingleProductMapper;", "singleProductMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5ProductsListMapper;", "productsListMapper$delegate", "getProductsListMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5ProductsListMapper;", "productsListMapper", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseV5Component$Companion$create$1$1 implements InstallmentPurchaseV5Component {
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final OnBoardingComponentApi onboardingComponentApi;

    /* renamed from: titleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j titleMapper = k.b(InstallmentPurchaseV5Component$Companion$create$1$1$titleMapper$2.INSTANCE);

    /* renamed from: singleProductMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j singleProductMapper = k.b(InstallmentPurchaseV5Component$Companion$create$1$1$singleProductMapper$2.INSTANCE);

    /* renamed from: productsListMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productsListMapper = k.b(InstallmentPurchaseV5Component$Companion$create$1$1$productsListMapper$2.INSTANCE);

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = DelegatesKt.lazyUnsafe(new InstallmentPurchaseV5Component$Companion$create$1$1$appType$2(this));

    InstallmentPurchaseV5Component$Companion$create$1$1(C7475g c7475g) {
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component
    public BaseOnBoardingViewModel.Default getOnboardingViewModel() {
        return new BaseOnBoardingViewModel.Default(this.onboardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component
    public InstallmentV5ProductsListMapper getProductsListMapper() {
        return (InstallmentV5ProductsListMapper) this.productsListMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component
    public InstallmentV5SingleProductMapper getSingleProductMapper() {
        return (InstallmentV5SingleProductMapper) this.singleProductMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component
    public InstallmentV5TitleMapper getTitleMapper() {
        return (InstallmentV5TitleMapper) this.titleMapper.getValue();
    }
}
