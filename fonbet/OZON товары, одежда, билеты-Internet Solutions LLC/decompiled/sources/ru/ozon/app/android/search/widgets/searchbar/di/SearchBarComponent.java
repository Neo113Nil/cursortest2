package ru.ozon.app.android.search.widgets.searchbar.di;

import Sg.a;
import Vg.d;
import WZ.l;
import android.content.SharedPreferences;
import ei0.InterfaceC6369b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarMapper;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001GJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH&¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bH&¢\u0006\u0004\b\u0014\u0010\u000bJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\bH&¢\u0006\u0004\b\u0016\u0010\u000bJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\bH&¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00060\"j\u0002`#H&¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H&¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H&¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u0002020\bH&¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H&¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H&¢\u0006\u0004\bA\u0010BJ\u0013\u0010E\u001a\u00060Cj\u0002`DH&¢\u0006\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/di/SearchBarComponent;", "Lhi/a;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "staticSearchBarMapper", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "Lru/ozon/app/android/search/widgets/searchbar/core/ActiveSearchBarMapper;", "activeSearchBarMapper", "()Lru/ozon/app/android/search/widgets/searchbar/core/ActiveSearchBarMapper;", "LPc/a;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "viewModel", "()LPc/a;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "clearSearchTextViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "searchPhotoViewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "tapTagsV2ViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "tapTagsV3ViewModel", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "sharedCarouselViewModel", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "()Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "keyboardVisibilityHelper", "()Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "searchByImageRouter", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "getOnboardingRepository", "()Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "modifySearchUrlViewModel", "Lei0/b;", "ozonTracker", "()Lei0/b;", "LSg/a;", "analyticsScreenStorage", "()LSg/a;", "Landroid/content/SharedPreferences;", "sharedPreferences", "()Landroid/content/SharedPreferences;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "()Lru/ozon/app/android/account/user/UserManager;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "()LVg/d;", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchBarComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0080\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/di/SearchBarComponent$Factory;", "", "create", "Lru/ozon/app/android/search/widgets/searchbar/di/SearchBarComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "searchHistoryRepositoryComponentApi", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "searchByImageRepositoryComponentApi", "Lru/ozon/app/android/search/widgets/searchbar/di/SearchByImageRepositoryComponentApi;", "searchPrefetchApi", "Lru/ozon/app/android/common/di/SearchPrefetchApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "searchOnboardingRepositoryComponentApi", "Lru/ozon/app/android/search/widgets/searchOnboarding/di/repository/SearchOnboardingRepositoryComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        SearchBarComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, @NotNull SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi, @NotNull SearchPrefetchApi searchPrefetchApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi, @NotNull OnboardingComponentApi onboardingComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi);
    }

    @NotNull
    ActiveSearchBarMapper activeSearchBarMapper();

    @NotNull
    a analyticsScreenStorage();

    @NotNull
    AuthStateStorage authStateStorage();

    @NotNull
    Pc.a<ClearSearchTextViewModel> clearSearchTextViewModel();

    @NotNull
    d customActionHandlersStoreFactory();

    @NotNull
    FeatureChecker featureChecker();

    @NotNull
    FeatureService featureService();

    @NotNull
    CommonOnboardingRepository getOnboardingRepository();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    KeyboardVisibilityHelper keyboardVisibilityHelper();

    @NotNull
    Pc.a<ModifySearchUrlViewModel> modifySearchUrlViewModel();

    @NotNull
    ComposerNavigator navigator();

    @NotNull
    BaseOnBoardingViewModel.Default onBoardingViewModel();

    @NotNull
    InterfaceC6369b ozonTracker();

    @NotNull
    SearchByImageRouter searchByImageRouter();

    @NotNull
    Pc.a<SearchByImageViewModel> searchPhotoViewModel();

    @NotNull
    SearchUrlPrefetchService searchUrlPrefetchService();

    @NotNull
    Pc.a<SharedCarouselViewModel> sharedCarouselViewModel();

    @NotNull
    SharedPreferences sharedPreferences();

    @NotNull
    SearchBarMapper staticSearchBarMapper();

    @NotNull
    Pc.a<TapTagsV2ViewModel> tapTagsV2ViewModel();

    @NotNull
    Pc.a<TapTagsV3ViewModel> tapTagsV3ViewModel();

    @NotNull
    UserManager userManager();

    @NotNull
    Pc.a<ActiveSearchBarViewModel> viewModel();
}
