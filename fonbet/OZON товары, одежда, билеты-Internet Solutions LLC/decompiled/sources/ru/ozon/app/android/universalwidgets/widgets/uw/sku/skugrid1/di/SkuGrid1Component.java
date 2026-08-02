package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di;

import Pc.a;
import Vg.d;
import android.content.Context;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*J\u0013\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0012¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/di/SkuGrid1Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "mapper", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductAdultImageWithVideoCoverBinder;", "getPProductImagesBinder", "()LPc/a;", "pProductImagesBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBottomBadgesBinder;", "getPProductBadgesBinder", "pProductBadgesBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductStateRecyclerViewBinder;", "getPProductStateBinder", "pProductStateBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductButtonBinder;", "getPProductButtonBinder", "pProductButtonBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetProxyBinderFactory;", "getPProductActionSheetProxyBinderFactory", "pProductActionSheetProxyBinderFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductButtonSubtitleBinder;", "getPProductButtonSubtitleBinder", "pProductButtonSubtitleBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/overlay/ProductOverlayBinderProvider;", "getPProductOverlayBinderProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/overlay/ProductOverlayBinderProvider;", "pProductOverlayBinderProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBackgroundBinder;", "getPProductBackgroundBinder", "pProductBackgroundBinder", "Factory", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SkuGrid1Component extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0088\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H&¨\u0006$"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/di/SkuGrid1Component$Factory;", "", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/di/SkuGrid1Component;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartAtomBinderComponentApi", "Lru/ozon/app/android/cart/ui/di/CartAtomBinderComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "videoCoverComponentApi", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "cartComponentApi", "Lru/ozon/app/android/cart/common/di/CartComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        SkuGrid1Component create(@NotNull RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, @NotNull CartServiceApi cartServiceApi, @NotNull CartAtomBinderComponentApi cartAtomBinderComponentApi, @NotNull FavoriteComponentApi favoriteComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull VideoCoverComponentApi videoCoverComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull CartComponentApi cartComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull FavoriteCoreComponentApi favoriteCoreComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, @NotNull VideoComponentApi videoComponentApi);
    }

    @NotNull
    Context getContext();

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
    ProductOverlayBinderProvider getPProductOverlayBinderProvider();

    @NotNull
    a<ProductStateRecyclerViewBinder> getPProductStateBinder();
}
