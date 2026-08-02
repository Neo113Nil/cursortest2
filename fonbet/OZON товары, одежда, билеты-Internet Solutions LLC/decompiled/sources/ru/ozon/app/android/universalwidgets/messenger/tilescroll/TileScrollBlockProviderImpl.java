package ru.ozon.app.android.universalwidgets.messenger.tilescroll;

import Sc.InterfaceC4008j;
import WZ.l;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.a;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.TileScrollBlockFactory;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.TileScrollBlockProviderImpl;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockMapper;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper.TileScrollItemMeasureWidthHelper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,Ba\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u001b\u0010*\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/TileScrollBlockProviderImpl;", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/TileScrollBlockFactory;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroid/app/Application;", "application", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;LWZ/l;Landroid/app/Application;)V", "Lru/ozon/android/messenger/framework/core/a;", "create", "()Lru/ozon/android/messenger/framework/core/a;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "LWZ/l;", "Landroid/app/Application;", "", "isPdpOfflineModeEnabled$delegate", "LSc/j;", "isPdpOfflineModeEnabled", "()Z", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileScrollBlockProviderImpl implements TileScrollBlockFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final Application application;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: isPdpOfflineModeEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isPdpOfflineModeEnabled;

    @NotNull
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ProductFavoriteDelegateProvider productFavoriteDelegateProvider;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/TileScrollBlockProviderImpl$Companion;", "", "<init>", "()V", "VERTICAL", "", "NAME", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TileScrollBlockProviderImpl(@NotNull JsonParser deserializer, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull PlayerPreloader playerPreloader, @NotNull CartService cartService, @NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider, @NotNull l tokenizedAnalytics, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(pdpOfflineScreenWidgetsData, "pdpOfflineScreenWidgetsData");
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(application, "application");
        this.deserializer = deserializer;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.playerPreloader = playerPreloader;
        this.cartService = cartService;
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.productFavoriteDelegateProvider = productFavoriteDelegateProvider;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.application = application;
        this.isPdpOfflineModeEnabled = LazyUtilsKt.unsafeLazy(new TileScrollBlockProviderImpl$isPdpOfflineModeEnabled$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileScrollItemMeasureWidthHelper create$lambda$0(TileScrollBlockProviderImpl tileScrollBlockProviderImpl) {
        Resources resources = tileScrollBlockProviderImpl.application.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new TileScrollItemMeasureWidthHelper(resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallTileAddToCartButtonBinder create$lambda$1(TileScrollBlockProviderImpl tileScrollBlockProviderImpl) {
        return new SmallTileAddToCartButtonBinder(tileScrollBlockProviderImpl.cartService, tileScrollBlockProviderImpl.coroutineDispatcherProvider, tileScrollBlockProviderImpl.featureChecker);
    }

    private final boolean isPdpOfflineModeEnabled() {
        return ((Boolean) this.isPdpOfflineModeEnabled.getValue()).booleanValue();
    }

    @Override // ru.ozon.app.android.storefrontcommonwidgets.core.messenger.TileScrollBlockFactory
    @NotNull
    public a create() {
        JsonParser jsonParser = this.deserializer;
        Context applicationContext = this.application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new a("products", "tileScrollChat", C7714v.t(new TileScrollBlockViewMapper(jsonParser, new TileScrollBlockMapper(new SmallTileAsyncStateMeasurer(applicationContext, this.coroutineDispatcherProvider), new Pc.a() { // from class: BX.a
            @Override // Pc.a
            public final Object get() {
                TileScrollItemMeasureWidthHelper create$lambda$0;
                create$lambda$0 = TileScrollBlockProviderImpl.create$lambda$0(TileScrollBlockProviderImpl.this);
                return create$lambda$0;
            }
        }, new FavoriteProductMoleculeV2Mapper()), this.playerPreloader, new BlurDelegateProvider(this.adultHandler), isPdpOfflineModeEnabled() ? this.pdpOfflineScreenWidgetsData : null, this.adultHandler, this.tokenizedAnalytics, new Pc.a() { // from class: BX.b
            @Override // Pc.a
            public final Object get() {
                SmallTileAddToCartButtonBinder create$lambda$1;
                create$lambda$1 = TileScrollBlockProviderImpl.create$lambda$1(TileScrollBlockProviderImpl.this);
                return create$lambda$1;
            }
        }, this.productFavoriteDelegateProvider)));
    }
}
