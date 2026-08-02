package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import l20.c;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.prefetcher.TileGrid3PrefetchInfoProvider;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000å\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u00100\u001a\u00060+j\u0002`,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bA\u0010'\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\bL\u0010MR \u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020U8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010'\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b[\u0010'\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020d0c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/di/TileGrid3WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/di/TileGrid3WidgetComponent;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "pdpScreenStorageComponentApi", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "retainImagePrefetchComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "getRetainImagePrefetchComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService$delegate", "LSc/j;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider$delegate", "getFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider$delegate", "getCoroutineDispatcherProvider", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/prefetcher/TileGrid3PrefetchInfoProvider;", "prefetchInfoProvider$delegate", "getPrefetchInfoProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/prefetcher/TileGrid3PrefetchInfoProvider;", "prefetchInfoProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper$delegate", "getTilesOpenPdpOfflineProductMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinderProvider", "LPc/a;", "getAddToCartButtonBinderProvider", "()LPc/a;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler$delegate", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider$delegate", "getBlurDelegateProvider", "()Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "getOfflineScreenWidgetsData", "()Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineScreenWidgetsData", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid3WidgetComponent$Companion$create$1$1 implements TileGrid3WidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final CartServiceApi cartServiceApi;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final FavoriteComponentApi favoriteComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final PdpOfflineScreenComponentApi pdpScreenStorageComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi;
    private final RetainImagePrefetchComponentApi retainImagePrefetchComponentApi;
    private final VideoComponentApi videoComponentApi;

    /* renamed from: cartService$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cartService = k.b(new TileGrid3WidgetComponent$Companion$create$1$1$cartService$2(this));

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory = k.b(new TileGrid3WidgetComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new TileGrid3WidgetComponent$Companion$create$1$1$tokenizedAnalytics$2(this));

    /* renamed from: favoriteDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j favoriteDelegateProvider = k.b(new TileGrid3WidgetComponent$Companion$create$1$1$favoriteDelegateProvider$2(this));

    /* renamed from: coroutineDispatcherProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j coroutineDispatcherProvider = k.b(new TileGrid3WidgetComponent$Companion$create$1$1$coroutineDispatcherProvider$2(this));

    /* renamed from: prefetchInfoProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j prefetchInfoProvider = k.b(TileGrid3WidgetComponent$Companion$create$1$1$prefetchInfoProvider$2.INSTANCE);

    /* renamed from: tilesOpenPdpOfflineProductMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tilesOpenPdpOfflineProductMapper = k.b(TileGrid3WidgetComponent$Companion$create$1$1$tilesOpenPdpOfflineProductMapper$2.INSTANCE);

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker = k.b(new TileGrid3WidgetComponent$Companion$create$1$1$featureChecker$2(this));
    private final a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider = new Ix.a(this, 1);

    /* renamed from: adultHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultHandler = UtilsKt.unsafeLazy(new TileGrid3WidgetComponent$Companion$create$1$1$adultHandler$2(this));

    /* renamed from: blurDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j blurDelegateProvider = UtilsKt.unsafeLazy(new TileGrid3WidgetComponent$Companion$create$1$1$blurDelegateProvider$2(this));

    TileGrid3WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.pdpScreenStorageComponentApi = (PdpOfflineScreenComponentApi) c7475g.getComponent(PdpOfflineScreenComponentApi.class);
        this.videoComponentApi = (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComposerPerformanceComponentApi = (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class);
        this.retainImagePrefetchComponentApi = (RetainImagePrefetchComponentApi) c7475g.getComponent(RetainImagePrefetchComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallTileAddToCartButtonBinder addToCartButtonBinderProvider$lambda$0(TileGrid3WidgetComponent$Companion$create$1$1 tileGrid3WidgetComponent$Companion$create$1$1) {
        return new SmallTileAddToCartButtonBinder(tileGrid3WidgetComponent$Companion$create$1$1.getCartService(), tileGrid3WidgetComponent$Companion$create$1$1.getCoroutineDispatcherProvider(), tileGrid3WidgetComponent$Companion$create$1$1.getFeatureChecker());
    }

    private final CartService getCartService() {
        return (CartService) this.cartService.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public a<SmallTileAddToCartButtonBinder> getAddToCartButtonBinderProvider() {
        return this.addToCartButtonBinderProvider;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public AdultHandler getAdultHandler() {
        return (AdultHandler) this.adultHandler.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public BlurDelegateProvider getBlurDelegateProvider() {
        return (BlurDelegateProvider) this.blurDelegateProvider.getValue();
    }

    public CoroutineDispatcherProvider getCoroutineDispatcherProvider() {
        return (CoroutineDispatcherProvider) this.coroutineDispatcherProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public ProductFavoriteDelegateProvider getFavoriteDelegateProvider() {
        return (ProductFavoriteDelegateProvider) this.favoriteDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public FrameBinder getFrameBinder() {
        return this.retainComposerPerformanceComponentApi.getFrameBinder();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
        return this.retainImagePrefetchComponentApi.getImagePrefetchInfoProviderStorage();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public PdpOfflineScreenWidgetsData getOfflineScreenWidgetsData() {
        return this.pdpScreenStorageComponentApi.pdpEmptyScreenService();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public PlayerPreloader getPlayerPreloader() {
        return this.videoComponentApi.getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public TileGrid3PrefetchInfoProvider getPrefetchInfoProvider() {
        return (TileGrid3PrefetchInfoProvider) this.prefetchInfoProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public TilesOpenPdpOfflineProductMapper getTilesOpenPdpOfflineProductMapper() {
        return (TilesOpenPdpOfflineProductMapper) this.tilesOpenPdpOfflineProductMapper.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }
}
