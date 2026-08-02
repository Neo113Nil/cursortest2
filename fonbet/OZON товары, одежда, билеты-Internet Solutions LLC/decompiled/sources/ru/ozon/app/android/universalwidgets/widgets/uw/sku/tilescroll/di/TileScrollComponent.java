package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di;

import AT.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper.TileScrollMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.prefetcher.TileScrollPrefetchInfoProvider;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 92\u00060\u0001j\u0002`\u0002:\u00019R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/di/TileScrollComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteDelegateProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/prefetcher/TileScrollPrefetchInfoProvider;", "getTileScrollPrefetchInfoProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/prefetcher/TileScrollPrefetchInfoProvider;", "tileScrollPrefetchInfoProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollMapper;", "getTileScrollMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollMapper;", "tileScrollMapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "getAddToCartButtonBinderProvider", "()LPc/a;", "addToCartButtonBinderProvider", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "getOfflineScreenWidgetsData", "()Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineScreenWidgetsData", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "getTilesOpenPdpOfflineProductMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "getBlurDelegateProvider", "()Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileScrollComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/di/TileScrollComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/di/TileScrollComponent;", "create", "(Lk20/g;)Lk20/e;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TileScrollComponent create$lambda$0(C7475g c7475g) {
            return new TileScrollComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<TileScrollComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TileScrollComponent.class), new a(storage, 9));
        }
    }

    @NotNull
    Pc.a<SmallTileAddToCartButtonBinder> getAddToCartButtonBinderProvider();

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    BlurDelegateProvider getBlurDelegateProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductFavoriteDelegateProvider getFavoriteDelegateProvider();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    PdpOfflineScreenWidgetsData getOfflineScreenWidgetsData();

    @NotNull
    PlayerPreloader getPlayerPreloader();

    @NotNull
    TileScrollMapper getTileScrollMapper();

    @NotNull
    TileScrollPrefetchInfoProvider getTileScrollPrefetchInfoProvider();

    @NotNull
    TilesOpenPdpOfflineProductMapper getTilesOpenPdpOfflineProductMapper();

    @NotNull
    l getTokenizedAnalytics();
}
