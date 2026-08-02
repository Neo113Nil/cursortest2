package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2;

import Pc.a;
import Vg.d;
import android.content.Context;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.search.di.SearchComponentApi;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.TextMeasurer;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridImagePrefetchInfoProvider;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001EJ\u0013\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001e\u0010@\u001a\f\u0012\b\u0012\u00060<j\u0002`=0;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/widgetv2/SearchResultsGridWidgetV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;", "getTextMeasurer", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;", "textMeasurer", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "LPc/a;", "Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "getButtonsBinder", "()LPc/a;", "buttonsBinder", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "getMessagesProcessor", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "messagesProcessor", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "getSheetHandlerFactory", "()Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;", "getTopRightButtonsViewHolderUtils", "topRightButtonsViewHolderUtils", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "getPinchToZoomOnboardingDelegate", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "pinchToZoomOnboardingDelegate", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "getVideoTileDelegate", "()Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridImagePrefetchInfoProvider;", "getPrefetchInfoProvider", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridImagePrefetchInfoProvider;", "prefetchInfoProvider", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "getOnboardingRepository", "()Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchResultsGridWidgetV2Component extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H&¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/widgetv2/SearchResultsGridWidgetV2Component$Factory;", "", "create", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/widgetv2/SearchResultsGridWidgetV2Component;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "cartComponentApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartAtomBinderComponentApi", "Lru/ozon/app/android/cart/ui/di/CartAtomBinderComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "switchingButtonComponentApi", "Lru/ozon/app/android/ui/switchingbutton/di/SwitchingButtonComponentApi;", "videoCoverComponentApi", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "searchComponentApi", "Lru/ozon/app/android/search/di/SearchComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface Factory {
        @NotNull
        SearchResultsGridWidgetV2Component create(@NotNull RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, @NotNull CartServiceApi cartComponentApi, @NotNull CartAtomBinderComponentApi cartAtomBinderComponentApi, @NotNull FavoriteComponentApi favoriteComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull SwitchingButtonComponentApi switchingButtonComponentApi, @NotNull VideoCoverComponentApi videoCoverComponentApi, @NotNull SearchComponentApi searchComponentApi, @NotNull FavoriteCoreComponentApi favoriteCoreComponentApi, @NotNull RetainImagePrefetchComponentApi retainComposerComponentApi, @NotNull ContextComponentDependencies contextComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull OnboardingComponentApi onboardingComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi);
    }

    @NotNull
    ActionSheetEventHandler getActionSheetEventHandler();

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    Context getAppContext();

    @NotNull
    a<ButtonsBinder> getButtonsBinder();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage();

    @NotNull
    MessagesProcessor getMessagesProcessor();

    @NotNull
    CommonOnboardingRepository getOnboardingRepository();

    @NotNull
    PinchToZoomOnboardingDelegate getPinchToZoomOnboardingDelegate();

    @NotNull
    SearchResultsGridImagePrefetchInfoProvider getPrefetchInfoProvider();

    @NotNull
    SelectedProductsManager getSelectedProductsManager();

    @NotNull
    TileActionSheetHandlerFactory getSheetHandlerFactory();

    @NotNull
    TextMeasurer getTextMeasurer();

    @NotNull
    a<TopRightButtonsViewHolderUtils> getTopRightButtonsViewHolderUtils();

    @NotNull
    VideoTileDelegate getVideoTileDelegate();
}
