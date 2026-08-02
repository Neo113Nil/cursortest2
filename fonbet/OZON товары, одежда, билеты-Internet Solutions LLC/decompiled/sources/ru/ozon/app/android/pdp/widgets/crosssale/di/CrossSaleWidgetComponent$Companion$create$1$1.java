package ru.ozon.app.android.pdp.widgets.crosssale.di;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingRepository;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.crosssale.core.CrossSaleMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"ru/ozon/app/android/pdp/widgets/crosssale/di/CrossSaleWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/crosssale/di/CrossSaleWidgetComponent;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "pdpOnBoardingRepository$delegate", "LSc/j;", "getPdpOnBoardingRepository", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "pdpOnBoardingRepository", "Lru/ozon/app/android/pdp/widgets/crosssale/core/CrossSaleMapper;", "crossSaleMapper$delegate", "getCrossSaleMapper", "()Lru/ozon/app/android/pdp/widgets/crosssale/core/CrossSaleMapper;", "crossSaleMapper", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "getNavigationComponentApi", "()Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "getViewModelProvider", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModelProvider", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossSaleWidgetComponent$Companion$create$1$1 implements CrossSaleWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final OnBoardingComponentApi onboardingComponentApi;

    /* renamed from: pdpOnBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j pdpOnBoardingRepository = k.b(new CrossSaleWidgetComponent$Companion$create$1$1$pdpOnBoardingRepository$2(this));

    /* renamed from: crossSaleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j crossSaleMapper = k.b(CrossSaleWidgetComponent$Companion$create$1$1$crossSaleMapper$2.INSTANCE);

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = DelegatesKt.lazyUnsafe(new CrossSaleWidgetComponent$Companion$create$1$1$appType$2(this));

    CrossSaleWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
    }

    private final NavigationComponentApi getNavigationComponentApi() {
        return (NavigationComponentApi) this.$storage.getComponent(NavigationComponentApi.class);
    }

    private final PDPOnBoardingRepository getPdpOnBoardingRepository() {
        return (PDPOnBoardingRepository) this.pdpOnBoardingRepository.getValue();
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.crosssale.di.CrossSaleWidgetComponent
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.crosssale.di.CrossSaleWidgetComponent
    public CrossSaleMapper getCrossSaleMapper() {
        return (CrossSaleMapper) this.crossSaleMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.crosssale.di.CrossSaleWidgetComponent
    public g getOzonRouter() {
        return getNavigationComponentApi().getOzonRouter();
    }

    @Override // ru.ozon.app.android.pdp.widgets.crosssale.di.CrossSaleWidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.crosssale.di.CrossSaleWidgetComponent
    public PDPOnBoardingViewModel getViewModelProvider() {
        return new PDPOnBoardingViewModel(getPdpOnBoardingRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }
}
