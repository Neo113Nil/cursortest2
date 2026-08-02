package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import android.content.Context;
import android.content.res.Resources;
import jw.C7442a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper.SmallTileMoleculeMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent$Companion$create$1$1;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper.TileScrollItemMeasureWidthHelper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper.TileScrollMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.prefetcher.TileScrollPrefetchInfoProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\u0091\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\"\u00104\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010(\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bK\u0010(\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010RR(\u0010U\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010T0T018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u00105\u001a\u0004\bV\u0010WR\u001b\u0010\\\u001a\u00020X8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bY\u0010(\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b^\u0010(\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0018\u0010r\u001a\u00060nj\u0002`o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0083\u0001"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/di/TileScrollComponent$Companion$create$1$1", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/di/TileScrollComponent;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "pdpScreenStorageComponentApi", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "storefrontCommonComponentApi", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "Landroid/content/Context;", "appContext$delegate", "LSc/j;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;", "smallTileHeightMeasurer$delegate", "getSmallTileHeightMeasurer", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileAsyncStateMeasurer;", "smallTileHeightMeasurer", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollItemMeasureWidthHelper;", "kotlin.jvm.PlatformType", "tileScrollItemMeasureWidthHelper", "LPc/a;", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "favoriteProductMoleculeV2Mapper$delegate", "getFavoriteProductMoleculeV2Mapper", "()Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "favoriteProductMoleculeV2Mapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "smallTileMoleculeMapper$delegate", "getSmallTileMoleculeMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/mapper/SmallTileMoleculeMapper;", "smallTileMoleculeMapper", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider$delegate", "getFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider$delegate", "getCoroutineDispatcherProvider", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/prefetcher/TileScrollPrefetchInfoProvider;", "tileScrollPrefetchInfoProvider$delegate", "getTileScrollPrefetchInfoProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/prefetcher/TileScrollPrefetchInfoProvider;", "tileScrollPrefetchInfoProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollMapper;", "tileScrollMapper$delegate", "getTileScrollMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollMapper;", "tileScrollMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinderProvider", "getAddToCartButtonBinderProvider", "()LPc/a;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler$delegate", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider$delegate", "getBlurDelegateProvider", "()Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "getOfflineScreenWidgetsData", "()Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineScreenWidgetsData", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "getTilesOpenPdpOfflineProductMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollComponent$Companion$create$1$1 implements TileScrollComponent {
    private final AccountComponentApi accountComponentApi;
    private final CartServiceApi cartServiceApi;
    private final ContextComponentDependencies contextDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final FavoriteComponentApi favoriteComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final PdpOfflineScreenComponentApi pdpScreenStorageComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi;
    private final StorefrontCommonComponentApi storefrontCommonComponentApi;
    private final VideoComponentApi videoComponentApi;

    /* renamed from: appContext$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appContext = k.b(new TileScrollComponent$Companion$create$1$1$appContext$2(this));

    /* renamed from: smallTileHeightMeasurer$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j smallTileHeightMeasurer = k.b(new TileScrollComponent$Companion$create$1$1$smallTileHeightMeasurer$2(this));
    private final a<TileScrollItemMeasureWidthHelper> tileScrollItemMeasureWidthHelper = new a() { // from class: nY.a
        @Override // Pc.a
        public final Object get() {
            TileScrollItemMeasureWidthHelper tileScrollItemMeasureWidthHelper$lambda$0;
            tileScrollItemMeasureWidthHelper$lambda$0 = TileScrollComponent$Companion$create$1$1.tileScrollItemMeasureWidthHelper$lambda$0(TileScrollComponent$Companion$create$1$1.this);
            return tileScrollItemMeasureWidthHelper$lambda$0;
        }
    };

    /* renamed from: favoriteProductMoleculeV2Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j favoriteProductMoleculeV2Mapper = LazyUtilsKt.unsafeLazy(TileScrollComponent$Companion$create$1$1$favoriteProductMoleculeV2Mapper$2.INSTANCE);

    /* renamed from: smallTileMoleculeMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j smallTileMoleculeMapper = LazyUtilsKt.unsafeLazy(new TileScrollComponent$Companion$create$1$1$smallTileMoleculeMapper$2(this));

    /* renamed from: favoriteDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j favoriteDelegateProvider = k.b(new TileScrollComponent$Companion$create$1$1$favoriteDelegateProvider$2(this));

    /* renamed from: coroutineDispatcherProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j coroutineDispatcherProvider = k.b(new TileScrollComponent$Companion$create$1$1$coroutineDispatcherProvider$2(this));

    /* renamed from: tileScrollPrefetchInfoProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tileScrollPrefetchInfoProvider = k.b(TileScrollComponent$Companion$create$1$1$tileScrollPrefetchInfoProvider$2.INSTANCE);

    /* renamed from: tileScrollMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tileScrollMapper = k.b(new TileScrollComponent$Companion$create$1$1$tileScrollMapper$2(this));
    private final a<SmallTileAddToCartButtonBinder> addToCartButtonBinderProvider = new C7442a(this, 1);

    /* renamed from: adultHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultHandler = LazyUtilsKt.unsafeLazy(new TileScrollComponent$Companion$create$1$1$adultHandler$2(this));

    /* renamed from: blurDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j blurDelegateProvider = LazyUtilsKt.unsafeLazy(new TileScrollComponent$Companion$create$1$1$blurDelegateProvider$2(this));

    TileScrollComponent$Companion$create$1$1(C7475g c7475g) {
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.retainComposerPerformanceComponentApi = (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.contextDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.videoComponentApi = (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class);
        this.pdpScreenStorageComponentApi = (PdpOfflineScreenComponentApi) c7475g.getComponent(PdpOfflineScreenComponentApi.class);
        this.storefrontCommonComponentApi = (StorefrontCommonComponentApi) c7475g.getComponent(StorefrontCommonComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallTileAddToCartButtonBinder addToCartButtonBinderProvider$lambda$1(TileScrollComponent$Companion$create$1$1 tileScrollComponent$Companion$create$1$1) {
        return new SmallTileAddToCartButtonBinder(tileScrollComponent$Companion$create$1$1.getCartService(), tileScrollComponent$Companion$create$1$1.getCoroutineDispatcherProvider(), tileScrollComponent$Companion$create$1$1.getFeatureChecker());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getAppContext() {
        return (Context) this.appContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoriteProductMoleculeV2Mapper getFavoriteProductMoleculeV2Mapper() {
        return (FavoriteProductMoleculeV2Mapper) this.favoriteProductMoleculeV2Mapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmallTileAsyncStateMeasurer getSmallTileHeightMeasurer() {
        return (SmallTileAsyncStateMeasurer) this.smallTileHeightMeasurer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmallTileMoleculeMapper getSmallTileMoleculeMapper() {
        return (SmallTileMoleculeMapper) this.smallTileMoleculeMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileScrollItemMeasureWidthHelper tileScrollItemMeasureWidthHelper$lambda$0(TileScrollComponent$Companion$create$1$1 tileScrollComponent$Companion$create$1$1) {
        Resources resources = tileScrollComponent$Companion$create$1$1.getAppContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new TileScrollItemMeasureWidthHelper(resources);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public a<SmallTileAddToCartButtonBinder> getAddToCartButtonBinderProvider() {
        return this.addToCartButtonBinderProvider;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public AdultHandler getAdultHandler() {
        return (AdultHandler) this.adultHandler.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public BlurDelegateProvider getBlurDelegateProvider() {
        return (BlurDelegateProvider) this.blurDelegateProvider.getValue();
    }

    public CartService getCartService() {
        return this.cartServiceApi.getCartService();
    }

    public CoroutineDispatcherProvider getCoroutineDispatcherProvider() {
        return (CoroutineDispatcherProvider) this.coroutineDispatcherProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public ProductFavoriteDelegateProvider getFavoriteDelegateProvider() {
        return (ProductFavoriteDelegateProvider) this.favoriteDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public FrameBinder getFrameBinder() {
        return this.retainComposerPerformanceComponentApi.getFrameBinder();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public PdpOfflineScreenWidgetsData getOfflineScreenWidgetsData() {
        return this.pdpScreenStorageComponentApi.pdpEmptyScreenService();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public PlayerPreloader getPlayerPreloader() {
        return this.videoComponentApi.getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public TileScrollMapper getTileScrollMapper() {
        return (TileScrollMapper) this.tileScrollMapper.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public TileScrollPrefetchInfoProvider getTileScrollPrefetchInfoProvider() {
        return (TileScrollPrefetchInfoProvider) this.tileScrollPrefetchInfoProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public TilesOpenPdpOfflineProductMapper getTilesOpenPdpOfflineProductMapper() {
        return new TilesOpenPdpOfflineProductMapper();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
