package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.di;

import Pc.a;
import Vg.d;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductActionSheetProxyBinderFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBackgroundBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBottomBadgesBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductButtonSubtitleBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductStateRecyclerViewBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.overlay.ProductOverlayBinderProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductToManyMapper;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\nR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\nR\u0018\u0010&\u001a\u00060\"j\u0002`#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skulist/di/SkuListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductAdultImageWithVideoCoverBinder;", "getPProductImagesBinder", "()LPc/a;", "pProductImagesBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBottomBadgesBinder;", "getPProductBadgesBinder", "pProductBadgesBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductStateRecyclerViewBinder;", "getPProductStateBinder", "pProductStateBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductButtonBinder;", "getPProductButtonBinder", "pProductButtonBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/overlay/ProductOverlayBinderProvider;", "getProductOverlayBinder", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/overlay/ProductOverlayBinderProvider;", "productOverlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductButtonSubtitleBinder;", "getPProductButtonSubtitleBinder", "pProductButtonSubtitleBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetProxyBinderFactory;", "getPProductActionSheetProxyBinderFactory", "pProductActionSheetProxyBinderFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBackgroundBinder;", "getPProductBackgroundBinder", "pProductBackgroundBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Factory", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SkuListComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0090\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H&¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skulist/di/SkuListComponent$Factory;", "", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skulist/di/SkuListComponent;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartAtomBinderComponentApi", "Lru/ozon/app/android/cart/ui/di/CartAtomBinderComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "videoCoverComponentApi", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "cartComponentApi", "Lru/ozon/app/android/cart/common/di/CartComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        SkuListComponent create(@NotNull RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull CartAtomBinderComponentApi cartAtomBinderComponentApi, @NotNull FavoriteComponentApi favoriteComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull VideoCoverComponentApi videoCoverComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull CartComponentApi cartComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull FavoriteCoreComponentApi favoriteCoreComponentApi, @NotNull RetainComposerComponentApi retainComposerComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, @NotNull VideoComponentApi videoComponentApi);
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductToManyMapper getMapper();

    @NotNull
    a<ProductActionSheetProxyBinderFactory> getPProductActionSheetProxyBinderFactory();

    @NotNull
    a<ProductBackgroundBinder> getPProductBackgroundBinder();

    @NotNull
    a<ProductBottomBadgesBinder> getPProductBadgesBinder();

    @NotNull
    a<ProductButtonBinder> getPProductButtonBinder();

    @NotNull
    a<ProductButtonSubtitleBinder> getPProductButtonSubtitleBinder();

    @NotNull
    a<ProductAdultImageWithVideoCoverBinder> getPProductImagesBinder();

    @NotNull
    a<ProductStateRecyclerViewBinder> getPProductStateBinder();

    @NotNull
    ProductOverlayBinderProvider getProductOverlayBinder();
}
