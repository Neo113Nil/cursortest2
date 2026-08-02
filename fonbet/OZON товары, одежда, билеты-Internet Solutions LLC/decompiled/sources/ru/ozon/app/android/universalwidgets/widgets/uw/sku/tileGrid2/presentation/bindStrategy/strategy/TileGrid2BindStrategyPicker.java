package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import Pc.a;
import Sc.InterfaceC4008j;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.RatingMoleculeBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.BadgeOnboardingDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.TileGrid2BadgesDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2DefaultViewStateBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewStateBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.TileGrid2RootBgColorCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.videocover.VideoTileDelegate;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012\u0012\u0006\u0010\"\u001a\u00020!\u0012\"\u0010'\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%`&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101JE\u00102\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u00103J7\u00106\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010?R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010@R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010AR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010<R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010BR0\u0010'\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010DR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010ER\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010FR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010GR\u001b\u0010K\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategyPicker;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/BindStrategyPicker;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LPc/a;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinderProvider", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "viewBinding", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "isThin", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;", "badgeOnboardingDelegate", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoDelegate;", "brandLogoDelegateLazy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "gallerySwipeViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "tileGrid2RootBgColorCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "selectionProductsEventManager", "Ljava/util/HashMap;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "Lkotlin/collections/HashMap;", "selectionProductsEventsMap", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;", "ratingBinder", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LPc/a;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/network/abtool/FeatureChecker;ZLru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;LSc/j;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;LSc/j;Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;Ljava/util/HashMap;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "createBindStrategy", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;LSc/j;Lru/ozon/app/android/network/abtool/FeatureChecker;Z)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;", "tileGrid2GridViewStateBinder", "createMultiFrameBindStrategy", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/network/abtool/FeatureChecker;Z)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "Lru/ozon/app/android/composer/ComposerReferences;", "LPc/a;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "Ljava/util/HashMap;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "bindStrategy$delegate", "getBindStrategy", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "bindStrategy", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BindStrategyPicker extends BindStrategyPicker<TileGrid2BindStrategy> {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final BadgeOnboardingDelegate badgeOnboardingDelegate;
    private final TileGrid2BadgesDelegate badgesDelegate;

    /* renamed from: bindStrategy$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bindStrategy;

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final InterfaceC4008j<BrandLogoDelegate> brandLogoDelegateLazy;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final a<FrameBinder> frameBinderProvider;
    private final GalleryBaseViewDelegate gallerySwipeViewDelegate;

    @NotNull
    private final TileOverlayBinder overlayBinder;

    @NotNull
    private final RatingMoleculeBinder ratingBinder;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SelectionProductsEventManager selectionProductsEventManager;

    @NotNull
    private final HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap;

    @NotNull
    private final TileDislikeInteractor tileDislikeInteractor;

    @NotNull
    private final TileGrid2RootBgColorCache tileGrid2RootBgColorCache;
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final InterfaceC4008j<WishlistService> wishlistServiceLazy;

    /* JADX WARN: Multi-variable type inference failed */
    public TileGrid2BindStrategyPicker(@NotNull ComposerReferences refs, @NotNull a<FrameBinder> frameBinderProvider, VideoTileDelegate videoTileDelegate, @NotNull TileGrid2BaseViewBinding viewBinding, @NotNull FeatureChecker featureChecker, boolean z11, @NotNull BadgeOnboardingDelegate badgeOnboardingDelegate, @NotNull InterfaceC4008j<BrandLogoDelegate> brandLogoDelegateLazy, TileGrid2BadgesDelegate tileGrid2BadgesDelegate, GalleryBaseViewDelegate galleryBaseViewDelegate, @NotNull TileGrid2RootBgColorCache tileGrid2RootBgColorCache, @NotNull TileOverlayBinder overlayBinder, @NotNull TileDislikeInteractor tileDislikeInteractor, @NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy, @NotNull SelectionProductsEventManager selectionProductsEventManager, @NotNull HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap, @NotNull AdultHandler adultHandler, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull RatingMoleculeBinder ratingBinder, @NotNull FavoriteManager favoriteManager) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(frameBinderProvider, "frameBinderProvider");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(badgeOnboardingDelegate, "badgeOnboardingDelegate");
        Intrinsics.checkNotNullParameter(brandLogoDelegateLazy, "brandLogoDelegateLazy");
        Intrinsics.checkNotNullParameter(tileGrid2RootBgColorCache, "tileGrid2RootBgColorCache");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        Intrinsics.checkNotNullParameter(tileDislikeInteractor, "tileDislikeInteractor");
        Intrinsics.checkNotNullParameter(wishlistServiceLazy, "wishlistServiceLazy");
        Intrinsics.checkNotNullParameter(selectionProductsEventManager, "selectionProductsEventManager");
        Intrinsics.checkNotNullParameter(selectionProductsEventsMap, "selectionProductsEventsMap");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(ratingBinder, "ratingBinder");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.refs = refs;
        this.frameBinderProvider = frameBinderProvider;
        this.videoTileDelegate = videoTileDelegate;
        this.badgeOnboardingDelegate = badgeOnboardingDelegate;
        this.brandLogoDelegateLazy = brandLogoDelegateLazy;
        this.badgesDelegate = tileGrid2BadgesDelegate;
        this.gallerySwipeViewDelegate = galleryBaseViewDelegate;
        this.tileGrid2RootBgColorCache = tileGrid2RootBgColorCache;
        this.overlayBinder = overlayBinder;
        this.tileDislikeInteractor = tileDislikeInteractor;
        this.wishlistServiceLazy = wishlistServiceLazy;
        this.selectionProductsEventManager = selectionProductsEventManager;
        this.selectionProductsEventsMap = selectionProductsEventsMap;
        this.adultHandler = adultHandler;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.ratingBinder = ratingBinder;
        this.favoriteManager = favoriteManager;
        this.bindStrategy = LazyUtilsKt.unsafeLazy(new TileGrid2BindStrategyPicker$bindStrategy$2(this, viewBinding, featureChecker, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TileGrid2BindStrategy createBindStrategy(TileGrid2BaseViewBinding viewBinding, ComposerReferences refs, BadgeOnboardingDelegate badgeOnboardingDelegate, InterfaceC4008j<BrandLogoDelegate> brandLogoDelegateLazy, FeatureChecker featureChecker, boolean isThin) {
        return createMultiFrameBindStrategy(viewBinding, new TileGrid2DefaultViewStateBinder(refs, this.videoTileDelegate, brandLogoDelegateLazy, this.badgesDelegate, this.gallerySwipeViewDelegate, badgeOnboardingDelegate, this.tileGrid2RootBgColorCache, this.wishlistServiceLazy, this.tileDislikeInteractor, LazyUtilsKt.unsafeLazy(new TileGrid2BindStrategyPicker$createBindStrategy$tileGrid2ViewHolderBinder$1(this, viewBinding)), this.adultHandler, this.blurMoleculeDelegate, this.ratingBinder, this.favoriteManager), refs, featureChecker, isThin);
    }

    private final TileGrid2BindStrategy createMultiFrameBindStrategy(TileGrid2BaseViewBinding viewBinding, TileGrid2ViewStateBinder tileGrid2GridViewStateBinder, ComposerReferences refs, FeatureChecker featureChecker, boolean isThin) {
        ViewGroup root = viewBinding.getRoot();
        FrameBinder frameBinder = this.frameBinderProvider.get();
        Intrinsics.checkNotNullExpressionValue(frameBinder, "get(...)");
        return new TileGrid2MultiFrameBindStrategy(tileGrid2GridViewStateBinder, refs, root, frameBinder, this.badgesDelegate != null, isThin, featureChecker);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.BindStrategyPicker
    @NotNull
    public TileGrid2BindStrategy getBindStrategy() {
        return (TileGrid2BindStrategy) this.bindStrategy.getValue();
    }
}
