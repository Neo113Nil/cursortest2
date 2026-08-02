package ru.ozon.app.android.storefront.widgets.naviBlocksV3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.SharedPreferences;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.core.NaviBlocksV3Mapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"ru/ozon/app/android/storefront/widgets/naviBlocksV3/di/NaviBlocksV3WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/di/NaviBlocksV3WidgetComponent;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/core/NaviBlocksV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV3/core/NaviBlocksV3Mapper;", "mapper", "Landroid/content/SharedPreferences;", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel$delegate", "getOnBoardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository$Default;", "getOnBoardingDisplayRepository", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository$Default;", "onBoardingDisplayRepository", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV3WidgetComponent$Companion$create$1$1 implements NaviBlocksV3WidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AppType appType;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new NaviBlocksV3WidgetComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: onBoardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingViewModel = k.b(new NaviBlocksV3WidgetComponent$Companion$create$1$1$onBoardingViewModel$2(this));
    private final OnBoardingComponentApi onboardingComponentApi;
    private final SharedPreferences sharedPrefs;

    NaviBlocksV3WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.sharedPrefs = ((StorageComponentApi) c7475g.getComponent(StorageComponentApi.class)).getSharedPreferences();
    }

    private final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return getNetworkComponentApi().getFeatureChecker();
    }

    @Override // ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent
    public NaviBlocksV3Mapper getMapper() {
        return (NaviBlocksV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent
    public BaseOnBoardingViewModel.Default getOnBoardingViewModel() {
        return (BaseOnBoardingViewModel.Default) this.onBoardingViewModel.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent
    public OnBoardingDisplayRepository.Default getOnBoardingDisplayRepository() {
        return new OnBoardingDisplayRepository.Default(this.sharedPrefs);
    }
}
