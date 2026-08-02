package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder;

import Sc.InterfaceC4008j;
import WZ.t;
import a00.C4908c;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonView;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.AdultImagesModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
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
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySingleViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist.WishlistSubscriber;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 JM\u0010/\u001a\u00020.2\u0012\u0010#\u001a\u000e\u0012\u0002\b\u00030!j\u0006\u0012\u0002\b\u0003`\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J+\u00107\u001a\u00020.2\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020.H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020.H\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020.H\u0016¢\u0006\u0004\b<\u0010:J\u000f\u0010=\u001a\u00020.H\u0016¢\u0006\u0004\b=\u0010:J\u000f\u0010>\u001a\u00020.H\u0016¢\u0006\u0004\b>\u0010:J\u000f\u0010?\u001a\u00020.H\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020.H\u0016¢\u0006\u0004\b@\u0010:J\u000f\u0010A\u001a\u00020.H\u0016¢\u0006\u0004\bA\u0010:J\u000f\u0010B\u001a\u00020.H\u0016¢\u0006\u0004\bB\u0010:J\u000f\u0010C\u001a\u00020.H\u0016¢\u0006\u0004\bC\u0010:J\u000f\u0010D\u001a\u00020.H\u0016¢\u0006\u0004\bD\u0010:J\u000f\u0010E\u001a\u00020.H\u0016¢\u0006\u0004\bE\u0010:J\u000f\u0010F\u001a\u00020.H\u0016¢\u0006\u0004\bF\u0010:J\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020.H\u0016¢\u0006\u0004\bJ\u0010:J\u0019\u0010M\u001a\u00020.2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020.2\u0006\u0010O\u001a\u000201H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020.2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020.2\u0006\u0010O\u001a\u000201H\u0002¢\u0006\u0004\bV\u0010QJ\u000f\u0010W\u001a\u00020.H\u0002¢\u0006\u0004\bW\u0010:J\u000f\u0010X\u001a\u00020GH\u0002¢\u0006\u0004\bX\u0010IJ\u0019\u0010[\u001a\u00020G2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020GH\u0002¢\u0006\u0004\b]\u0010IJ\u0013\u0010_\u001a\u00020^*\u000201H\u0002¢\u0006\u0004\b_\u0010`R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010cR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010hR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010iR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010jR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010kR\u001b\u0010o\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010IR\u001d\u0010s\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010m\u001a\u0004\bq\u0010rR\u0016\u0010O\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010tR\"\u0010#\u001a\u000e\u0012\u0002\b\u00030!j\u0006\u0012\u0002\b\u0003`\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010uR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010vR\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010wR\u0018\u0010x\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001b\u0010\u007f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010m\u001a\u0004\b}\u0010~R\u001f\u0010\u0083\u0001\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010m\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u008b\u0001R\u0017\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b)\u0010\u008c\u0001R\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0091\u0001"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2DefaultViewStateBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoDelegate;", "brandLogoDelegateLazy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "gallerySwipeViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;", "badgeOnboardingDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "tileGrid2RootBgColorCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "selectionProductsEventsHandlerLazy", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;", "ratingBinder", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/videocover/VideoTileDelegate;LSc/j;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;LSc/j;Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;LSc/j;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "viewBinding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "contentAdapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;Landroidx/recyclerview/widget/RecyclerView$u;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "vo", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "countButtonViewModel", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "prepare", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "bindGallery", "()V", "bindBadges", "bindMainState", "bindTopRightButtons", "bindLogo", "bindCountButton", "bindBackground", "onAttach", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onDetach", "onRecycle", "swipeGalleryToFirstVideo", "", "getPosition", "()I", "trackView", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;", "kebab", "bindKebabOrGone", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO$Kebab;)V", "item", "bindOverlay", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)V", "", "show", "onWishlistChanged", "(Z)V", "bindRating", "bindBottomPadding", "getTileBackgroundColor", "", "color", "initTileBackgroundColor", "(Ljava/lang/String;)I", "getCartButtonsSize", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;", "mapTopRightButtonsState", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/BadgeOnboardingDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "dp2$delegate", "LSc/j;", "getDp2", "dp2", "selectionProductsEventsHandler$delegate", "getSelectionProductsEventsHandler", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "selectionProductsEventsHandler", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "tileBackgroundColorToken", "Ljava/lang/String;", "tileBackgroundColor", "Ljava/lang/Integer;", "brandLogoDelegate$delegate", "getBrandLogoDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoDelegate;", "brandLogoDelegate", "wishlistService$delegate", "getWishlistService", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistService", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "wishlistSubscriber", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "Landroid/graphics/drawable/InsetDrawable;", "bgDrawable", "Landroid/graphics/drawable/InsetDrawable;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2DefaultViewStateBinder implements TileGrid2ViewStateBinder {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final BadgeOnboardingDelegate badgeOnboardingDelegate;
    private final TileGrid2BadgesDelegate badgesDelegate;

    @NotNull
    private final InsetDrawable bgDrawable;

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    /* renamed from: brandLogoDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j brandLogoDelegate;
    private TileContentItemsAdapter contentAdapter;
    private CountButtonViewModel countButtonViewModel;

    @NotNull
    private final C8486a disposables;

    /* renamed from: dp2$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp2;

    @NotNull
    private final FavoriteManager favoriteManager;
    private final GalleryBaseViewDelegate gallerySwipeViewDelegate;
    private TileGrid2VO item;
    private TileOverlayBinder overlayBinder;

    @NotNull
    private final RatingMoleculeBinder ratingBinder;

    @NotNull
    private final ComposerReferences references;

    /* renamed from: selectionProductsEventsHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectionProductsEventsHandler;
    private Integer tileBackgroundColor;
    private String tileBackgroundColorToken;

    @NotNull
    private final TileDislikeInteractor tileDislikeInteractor;

    @NotNull
    private final TileGrid2RootBgColorCache tileGrid2RootBgColorCache;
    private TopRightButtonAdapter topRightButtonsAdapter;
    private final VideoTileDelegate videoTileDelegate;
    private TileGrid2BaseViewBinding viewBinding;
    private k<?> viewHolder;

    /* renamed from: wishlistService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j wishlistService;

    @NotNull
    private final WishlistSubscriber wishlistSubscriber;

    public TileGrid2DefaultViewStateBinder(@NotNull ComposerReferences references, VideoTileDelegate videoTileDelegate, @NotNull InterfaceC4008j<BrandLogoDelegate> brandLogoDelegateLazy, TileGrid2BadgesDelegate tileGrid2BadgesDelegate, GalleryBaseViewDelegate galleryBaseViewDelegate, @NotNull BadgeOnboardingDelegate badgeOnboardingDelegate, @NotNull TileGrid2RootBgColorCache tileGrid2RootBgColorCache, @NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy, @NotNull TileDislikeInteractor tileDislikeInteractor, @NotNull InterfaceC4008j<? extends SelectionProductsEventsHandler> selectionProductsEventsHandlerLazy, @NotNull AdultHandler adultHandler, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull RatingMoleculeBinder ratingBinder, @NotNull FavoriteManager favoriteManager) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(brandLogoDelegateLazy, "brandLogoDelegateLazy");
        Intrinsics.checkNotNullParameter(badgeOnboardingDelegate, "badgeOnboardingDelegate");
        Intrinsics.checkNotNullParameter(tileGrid2RootBgColorCache, "tileGrid2RootBgColorCache");
        Intrinsics.checkNotNullParameter(wishlistServiceLazy, "wishlistServiceLazy");
        Intrinsics.checkNotNullParameter(tileDislikeInteractor, "tileDislikeInteractor");
        Intrinsics.checkNotNullParameter(selectionProductsEventsHandlerLazy, "selectionProductsEventsHandlerLazy");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(ratingBinder, "ratingBinder");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.references = references;
        this.videoTileDelegate = videoTileDelegate;
        this.badgesDelegate = tileGrid2BadgesDelegate;
        this.gallerySwipeViewDelegate = galleryBaseViewDelegate;
        this.badgeOnboardingDelegate = badgeOnboardingDelegate;
        this.tileGrid2RootBgColorCache = tileGrid2RootBgColorCache;
        this.tileDislikeInteractor = tileDislikeInteractor;
        this.adultHandler = adultHandler;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.ratingBinder = ratingBinder;
        this.favoriteManager = favoriteManager;
        this.dp2 = LazyUtilsKt.unsafeLazy(TileGrid2DefaultViewStateBinder$dp2$2.INSTANCE);
        this.selectionProductsEventsHandler = selectionProductsEventsHandlerLazy;
        this.brandLogoDelegate = brandLogoDelegateLazy;
        this.wishlistService = wishlistServiceLazy;
        this.wishlistSubscriber = new WishlistSubscriber(wishlistServiceLazy, new TileGrid2DefaultViewStateBinder$wishlistSubscriber$1(this));
        this.disposables = new C8486a();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(TileGrid2Constants.INSTANCE.getContainerCornerRadius());
        this.bgDrawable = new InsetDrawable((Drawable) gradientDrawable, 0, getDp2(), 0, 0);
    }

    private final void bindBottomPadding() {
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding != null) {
            ViewExtKt.updatePadding$default(tileGrid2BaseViewBinding.getRoot(), 0, 0, 0, getCartButtonsSize(), 7, null);
        } else {
            Intrinsics.n("viewBinding");
            throw null;
        }
    }

    private final void bindKebabOrGone(final TileGrid2VO.Kebab kebab) {
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        AppCompatImageView kebabBtn = tileGrid2BaseViewBinding.getKebabBtn();
        if (kebabBtn == null) {
            return;
        }
        if (kebab == null) {
            kebabBtn.setVisibility(8);
            return;
        }
        kebabBtn.setVisibility(0);
        Context context = kebabBtn.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, kebab.getIcon().getIcon());
        if (iconResByToken != null) {
            kebabBtn.setImageResource(iconResByToken.intValue());
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = kebabBtn.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context2, kebab.getIcon().getTintColor());
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            Context context3 = kebabBtn.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            kebabBtn.setColorFilter(ResourceExtKt.color(context3, intValue), PorterDuff.Mode.SRC_IN);
        }
        kebabBtn.setOnClickListener(new View.OnClickListener() { // from class: eY.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TileGrid2DefaultViewStateBinder.bindKebabOrGone$lambda$8$lambda$7(TileGrid2DefaultViewStateBinder.this, kebab, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindKebabOrGone$lambda$8$lambda$7(TileGrid2DefaultViewStateBinder tileGrid2DefaultViewStateBinder, TileGrid2VO.Kebab kebab, View view) {
        Function1<AtomAction, Unit> handler;
        DisposableActionHandler disposableActionHandler = tileGrid2DefaultViewStateBinder.actionHandler;
        if (disposableActionHandler == null || (handler = disposableActionHandler.getHandler()) == null) {
            return;
        }
        handler.invoke(kebab.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindOverlay(TileGrid2VO item) {
        boolean z11;
        TileOverlayBinder tileOverlayBinder;
        TileDislikeId tileDislikeId = new TileDislikeId(item.getTileId(), item.getTileWidgetId());
        WishlistTileKey wishlistKey = item.getWishlistKey();
        boolean isRemovedFromWishlist = wishlistKey != null ? getWishlistService().isRemovedFromWishlist(wishlistKey) : false;
        SelectionProductsTileKey selectionKey = item.getSelectionKey();
        if (selectionKey != null) {
            SelectionProductsEventsHandler selectionProductsEventsHandler = getSelectionProductsEventsHandler();
            Boolean valueOf = selectionProductsEventsHandler != null ? Boolean.valueOf(selectionProductsEventsHandler.isRemovedFromSelectionProducts(selectionKey)) : null;
            if (valueOf != null) {
                z11 = valueOf.booleanValue();
                boolean z12 = !isRemovedFromWishlist || this.tileDislikeInteractor.isDisliked(tileDislikeId) || z11;
                tileOverlayBinder = this.overlayBinder;
                if (tileOverlayBinder == null) {
                    tileOverlayBinder.bind(z12, item.getOverlayItem(), item.getButtonMode() != TileGrid2VO.ButtonMode.NONE ? RoundMode.TOP : RoundMode.ALL, tileDislikeId, Integer.valueOf(getCartButtonsSize()));
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (isRemovedFromWishlist) {
        }
        tileOverlayBinder = this.overlayBinder;
        if (tileOverlayBinder == null) {
        }
    }

    private final void bindRating(TileGrid2VO item) {
        GalleryBaseViewDelegate galleryBaseViewDelegate;
        RatingMoleculeBinder ratingMoleculeBinder = this.ratingBinder;
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        ratingMoleculeBinder.bind(item, disposableActionHandler != null ? disposableActionHandler.getHandler() : null);
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        InterfaceC4008j<RatingView> ratingView = tileGrid2BaseViewBinding.getRatingView();
        if (ratingView == null || (galleryBaseViewDelegate = this.gallerySwipeViewDelegate) == null) {
            return;
        }
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding2 = this.viewBinding;
        if (tileGrid2BaseViewBinding2 == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        RecyclerView contentElementsVAL = tileGrid2BaseViewBinding2.getContentElementsVAL();
        ViewGroup.LayoutParams layoutParams = contentElementsVAL.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41638j = item.getRatingMolecule() != null ? ratingView.getValue().getId() : galleryBaseViewDelegate.getBottomViewId();
        contentElementsVAL.setLayoutParams(bVar);
    }

    private final BrandLogoDelegate getBrandLogoDelegate() {
        return (BrandLogoDelegate) this.brandLogoDelegate.getValue();
    }

    private final int getCartButtonsSize() {
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (tileGrid2VO.getButtonMode() == TileGrid2VO.ButtonMode.NONE) {
            return 0;
        }
        AddToCartButtonView.Companion companion = AddToCartButtonView.INSTANCE;
        int seller_icon_offset = companion.getSELLER_ICON_OFFSET() + companion.getConfigDefault().getContainerHeight();
        TileGrid2VO tileGrid2VO2 = this.item;
        if (tileGrid2VO2 != null) {
            return TileGrid2Constants.INSTANCE.getBUTTON_MARGIN() + (tileGrid2VO2.getButtonMode().getCount() * seller_icon_offset);
        }
        Intrinsics.n("item");
        throw null;
    }

    private final int getDp2() {
        return ((Number) this.dp2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectionProductsEventsHandler getSelectionProductsEventsHandler() {
        return (SelectionProductsEventsHandler) this.selectionProductsEventsHandler.getValue();
    }

    private final int getTileBackgroundColor() {
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        String islandBackgroundColor = tileGrid2VO.getIslandBackgroundColor();
        if (!Intrinsics.d(islandBackgroundColor, this.tileBackgroundColorToken)) {
            initTileBackgroundColor(islandBackgroundColor);
        }
        Integer num = this.tileBackgroundColor;
        return num != null ? num.intValue() : initTileBackgroundColor(islandBackgroundColor);
    }

    private final WishlistService getWishlistService() {
        return (WishlistService) this.wishlistService.getValue();
    }

    private final int initTileBackgroundColor(String color) {
        this.tileBackgroundColorToken = color;
        StyleParser styleParser = StyleParser.INSTANCE;
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        Context context = tileGrid2BaseViewBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, color, R$color.layer_floor_1);
        this.tileBackgroundColor = Integer.valueOf(parseColor);
        return parseColor;
    }

    private final TileGrid2TopRightButtonsDelegate.State mapTopRightButtonsState(TileGrid2VO tileGrid2VO) {
        boolean z11;
        WishlistTileKey wishlistKey = tileGrid2VO.getWishlistKey();
        if (wishlistKey != null && getWishlistService().isRemovedFromWishlist(wishlistKey)) {
            return TileGrid2TopRightButtonsDelegate.State.REMOVED_FROM_WISHLIST;
        }
        SelectionProductsTileKey selectionKey = tileGrid2VO.getSelectionKey();
        Boolean bool = null;
        if (selectionKey != null) {
            SelectionProductsEventsHandler selectionProductsEventsHandler = getSelectionProductsEventsHandler();
            z11 = Intrinsics.d(selectionProductsEventsHandler != null ? Boolean.valueOf(selectionProductsEventsHandler.isRemovedFromSelectionProducts(selectionKey)) : null, Boolean.TRUE);
        } else {
            z11 = false;
        }
        if (z11) {
            return TileGrid2TopRightButtonsDelegate.State.REMOVED_FROM_SELECTION;
        }
        if (tileGrid2VO.getTopRightButtonsAnimationEnabled()) {
            FavoriteManager favoriteManager = this.favoriteManager;
            Long y02 = h.y0(tileGrid2VO.getTileId());
            if (Intrinsics.d(favoriteManager.getCurrentFavState(y02 != null ? y02.longValue() : 0L), Boolean.FALSE)) {
                return TileGrid2TopRightButtonsDelegate.State.COLLAPSED;
            }
        }
        if (tileGrid2VO.getTopRightButtonsAnimationEnabled()) {
            FavoriteManager favoriteManager2 = this.favoriteManager;
            Long y03 = h.y0(tileGrid2VO.getTileId());
            if (favoriteManager2.getCurrentFavState(y03 != null ? y03.longValue() : 0L) == null) {
                List<Object> topRightButtons = tileGrid2VO.getTopRightButtons();
                if (topRightButtons != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : topRightButtons) {
                        if (obj instanceof FavoriteProductMolecule) {
                            arrayList.add(obj);
                        }
                    }
                    FavoriteProductMolecule favoriteProductMolecule = (FavoriteProductMolecule) C7714v.M(arrayList);
                    if (favoriteProductMolecule != null) {
                        bool = Boolean.valueOf(favoriteProductMolecule.isFavorite());
                    }
                }
                return Intrinsics.d(bool, Boolean.FALSE) ? TileGrid2TopRightButtonsDelegate.State.COLLAPSED : TileGrid2TopRightButtonsDelegate.State.EXPANDED;
            }
        }
        return TileGrid2TopRightButtonsDelegate.State.EXPANDED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWishlistChanged(boolean show) {
        TileGrid2DTO.OverlayItem overlayItem;
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        tileGrid2BaseViewBinding.getTopRightButtonsDelegate().onWishlistOverlayVisibilityChanged(show);
        TileOverlayBinder tileOverlayBinder = this.overlayBinder;
        if (tileOverlayBinder != null) {
            if (show) {
                TileGrid2VO tileGrid2VO = this.item;
                if (tileGrid2VO == null) {
                    Intrinsics.n("item");
                    throw null;
                }
                overlayItem = tileGrid2VO.getOverlayItem();
            } else {
                overlayItem = null;
            }
            TileGrid2VO tileGrid2VO2 = this.item;
            if (tileGrid2VO2 != null) {
                TileOverlayBinder.bind$default(tileOverlayBinder, show, overlayItem, tileGrid2VO2.getButtonMode() != TileGrid2VO.ButtonMode.NONE ? RoundMode.TOP : RoundMode.ALL, null, null, 24, null);
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindBackground() {
        Drawable drawable = this.bgDrawable.getDrawable();
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getTileBackgroundColor());
            TileGrid2VO tileGrid2VO = this.item;
            if (tileGrid2VO == null) {
                Intrinsics.n("item");
                throw null;
            }
            gradientDrawable.setCornerRadius(tileGrid2VO.getTheme().getContainerCornerRadius());
        }
        TileGrid2RootBgColorCache tileGrid2RootBgColorCache = this.tileGrid2RootBgColorCache;
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        Context context = tileGrid2BaseViewBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TileGrid2VO tileGrid2VO2 = this.item;
        if (tileGrid2VO2 != null) {
            tileGrid2RootBgColorCache.cacheColor(context, tileGrid2VO2.getBackgroundColor());
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindBadges() {
        TileGrid2BadgesDelegate tileGrid2BadgesDelegate;
        TileGrid2BadgesDelegate tileGrid2BadgesDelegate2 = this.badgesDelegate;
        if (tileGrid2BadgesDelegate2 != null) {
            TileGrid2VO tileGrid2VO = this.item;
            if (tileGrid2VO == null) {
                Intrinsics.n("item");
                throw null;
            }
            long id2 = tileGrid2VO.getId();
            TileGrid2VO tileGrid2VO2 = this.item;
            if (tileGrid2VO2 == null) {
                Intrinsics.n("item");
                throw null;
            }
            BadgeDTO leftBottomBadge = tileGrid2VO2.getLeftBottomBadge();
            TileGrid2VO tileGrid2VO3 = this.item;
            if (tileGrid2VO3 == null) {
                Intrinsics.n("item");
                throw null;
            }
            BadgeDTO secondLeftBottomBadge = tileGrid2VO3.getSecondLeftBottomBadge();
            TileGrid2VO tileGrid2VO4 = this.item;
            if (tileGrid2VO4 == null) {
                Intrinsics.n("item");
                throw null;
            }
            boolean badgesInCorner = tileGrid2VO4.getBadgesInCorner();
            TileGrid2VO tileGrid2VO5 = this.item;
            if (tileGrid2VO5 == null) {
                Intrinsics.n("item");
                throw null;
            }
            tileGrid2BadgesDelegate2.bindOrGone(id2, leftBottomBadge, secondLeftBottomBadge, badgesInCorner, tileGrid2VO5.getCountButton() != null);
        }
        TileGrid2VO tileGrid2VO6 = this.item;
        if (tileGrid2VO6 == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (tileGrid2VO6.getLeftBottomBadge() == null || (tileGrid2BadgesDelegate = this.badgesDelegate) == null) {
            return;
        }
        TileGrid2VO tileGrid2VO7 = this.item;
        if (tileGrid2VO7 == null) {
            Intrinsics.n("item");
            throw null;
        }
        BadgeView viewForFirstBadge = tileGrid2BadgesDelegate.getViewForFirstBadge(tileGrid2VO7.getSecondLeftBottomBadge() == null);
        if (viewForFirstBadge != null) {
            BadgeOnboardingDelegate badgeOnboardingDelegate = this.badgeOnboardingDelegate;
            TileGrid2VO tileGrid2VO8 = this.item;
            if (tileGrid2VO8 == null) {
                Intrinsics.n("item");
                throw null;
            }
            TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
            if (tileGrid2BaseViewBinding == null) {
                Intrinsics.n("viewBinding");
                throw null;
            }
            ViewGroup root = tileGrid2BaseViewBinding.getRoot();
            k<?> kVar = this.viewHolder;
            if (kVar != null) {
                badgeOnboardingDelegate.showOnboardingIfNeeded(viewForFirstBadge, tileGrid2VO8, root, kVar);
            } else {
                Intrinsics.n("viewHolder");
                throw null;
            }
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindCountButton() {
        CountButtonView value;
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        CountButtonVO countButton = tileGrid2VO.getCountButton();
        if (countButton == null) {
            TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
            if (tileGrid2BaseViewBinding == null) {
                Intrinsics.n("viewBinding");
                throw null;
            }
            InterfaceC4008j<CountButtonView> countButtonViewLazy = tileGrid2BaseViewBinding.getCountButtonViewLazy();
            if (countButtonViewLazy != null && !countButtonViewLazy.isInitialized()) {
                return;
            }
        }
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding2 = this.viewBinding;
        if (tileGrid2BaseViewBinding2 == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        InterfaceC4008j<CountButtonView> countButtonViewLazy2 = tileGrid2BaseViewBinding2.getCountButtonViewLazy();
        if (countButtonViewLazy2 == null || (value = countButtonViewLazy2.getValue()) == null) {
            return;
        }
        value.bindOrGone(countButton, this.countButtonViewModel, this.actionHandler);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindGallery() {
        GalleryBaseViewDelegate galleryBaseViewDelegate = this.gallerySwipeViewDelegate;
        if (galleryBaseViewDelegate != null) {
            TileGrid2VO tileGrid2VO = this.item;
            if (tileGrid2VO == null) {
                Intrinsics.n("item");
                throw null;
            }
            galleryBaseViewDelegate.setLocalModel(tileGrid2VO.getGalleryModel());
        }
        GalleryBaseViewDelegate galleryBaseViewDelegate2 = this.gallerySwipeViewDelegate;
        if (galleryBaseViewDelegate2 != null) {
            TileGrid2VO tileGrid2VO2 = this.item;
            if (tileGrid2VO2 == null) {
                Intrinsics.n("item");
                throw null;
            }
            AdultImagesModel adultImagesModel = tileGrid2VO2.getGalleryModel().getAdultImagesModel();
            boolean isUserAnAdult = this.adultHandler.isUserAnAdult();
            TileGrid2VO tileGrid2VO3 = this.item;
            if (tileGrid2VO3 == null) {
                Intrinsics.n("item");
                throw null;
            }
            galleryBaseViewDelegate2.bind(adultImagesModel, isUserAnAdult, tileGrid2VO3.getTheme());
        }
        GalleryBaseViewDelegate galleryBaseViewDelegate3 = this.gallerySwipeViewDelegate;
        if (galleryBaseViewDelegate3 != null) {
            TileGrid2VO tileGrid2VO4 = this.item;
            if (tileGrid2VO4 != null) {
                galleryBaseViewDelegate3.bindRatio(tileGrid2VO4.getGalleryModel());
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindLogo() {
        BrandLogoDelegate brandLogoDelegate = getBrandLogoDelegate();
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO != null) {
            brandLogoDelegate.bind(tileGrid2VO);
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindMainState() {
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        ViewExtKt.show(tileGrid2BaseViewBinding.getContentElementsVAL());
        TileContentItemsAdapter tileContentItemsAdapter = this.contentAdapter;
        if (tileContentItemsAdapter == null) {
            Intrinsics.n("contentAdapter");
            throw null;
        }
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        tileContentItemsAdapter.submitList(tileGrid2VO.getContentElements());
        TileGrid2VO tileGrid2VO2 = this.item;
        if (tileGrid2VO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        bindKebabOrGone(tileGrid2VO2.getKebab());
        TileGrid2VO tileGrid2VO3 = this.item;
        if (tileGrid2VO3 == null) {
            Intrinsics.n("item");
            throw null;
        }
        bindOverlay(tileGrid2VO3);
        TileGrid2VO tileGrid2VO4 = this.item;
        if (tileGrid2VO4 == null) {
            Intrinsics.n("item");
            throw null;
        }
        bindRating(tileGrid2VO4);
        bindBottomPadding();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindTopRightButtons() {
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        List<? extends Object> topRightButtons = tileGrid2VO.getTopRightButtons();
        if (topRightButtons == null) {
            TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
            if (tileGrid2BaseViewBinding != null) {
                tileGrid2BaseViewBinding.getTopRightButtonsDelegate().gone();
                return;
            } else {
                Intrinsics.n("viewBinding");
                throw null;
            }
        }
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding2 = this.viewBinding;
        if (tileGrid2BaseViewBinding2 == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        TileGrid2TopRightButtonsDelegate topRightButtonsDelegate = tileGrid2BaseViewBinding2.getTopRightButtonsDelegate();
        TopRightButtonAdapter topRightButtonAdapter = this.topRightButtonsAdapter;
        k<?> kVar = this.viewHolder;
        if (kVar == null) {
            Intrinsics.n("viewHolder");
            throw null;
        }
        TileGrid2VO tileGrid2VO2 = this.item;
        if (tileGrid2VO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        TileGrid2TopRightButtonsDelegate.State mapTopRightButtonsState = mapTopRightButtonsState(tileGrid2VO2);
        TileGrid2VO tileGrid2VO3 = this.item;
        if (tileGrid2VO3 != null) {
            topRightButtonsDelegate.bind(topRightButtons, topRightButtonAdapter, kVar, mapTopRightButtonsState, tileGrid2VO3.getTopRightButtonsAnimationEnabled());
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public HorizontalScrollDelegate getHorizontalDelegate() {
        return TileGrid2ViewStateBinder.DefaultImpls.getHorizontalDelegate(this);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public int getPosition() {
        k<?> kVar = this.viewHolder;
        if (kVar != null) {
            return kVar.getAdapterPosition();
        }
        Intrinsics.n("viewHolder");
        throw null;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewStateBinder
    public void init(@NotNull k<?> viewHolder, @NotNull TileGrid2BaseViewBinding viewBinding, TopRightButtonAdapter topRightButtonsAdapter, @NotNull TileContentItemsAdapter contentAdapter, @NotNull RecyclerView.u pool, @NotNull TileOverlayBinder overlayBinder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(contentAdapter, "contentAdapter");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        this.viewHolder = viewHolder;
        this.topRightButtonsAdapter = topRightButtonsAdapter;
        this.contentAdapter = contentAdapter;
        this.viewBinding = viewBinding;
        this.overlayBinder = overlayBinder;
        viewBinding.getRoot().setBackground(this.bgDrawable);
        viewBinding.getTopRightButtonsDelegate().setRecycledViewPool(pool);
        GalleryBaseViewDelegate galleryBaseViewDelegate = this.gallerySwipeViewDelegate;
        if (galleryBaseViewDelegate != null) {
            galleryBaseViewDelegate.setRecycledViewPool(pool);
        }
        viewBinding.getContentElementsVAL().setRecycledViewPool(pool);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle
    public void onAttach() {
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        TileGrid2TopRightButtonsDelegate topRightButtonsDelegate = tileGrid2BaseViewBinding.getTopRightButtonsDelegate();
        TopRightButtonAdapter topRightButtonAdapter = this.topRightButtonsAdapter;
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        Long y02 = h.y0(tileGrid2VO.getTileId());
        topRightButtonsDelegate.onAttach(topRightButtonAdapter, y02 != null ? y02.longValue() : 0L);
        this.ratingBinder.onAttach();
        k<?> kVar = this.viewHolder;
        if (kVar != null) {
            kVar.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2DefaultViewStateBinder$onAttach$1
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
                
                    r6 = r5.this$0.getSelectionProductsEventsHandler();
                 */
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onCreate(J owner) {
                    WishlistSubscriber wishlistSubscriber;
                    k kVar2;
                    ComposerReferences composerReferences;
                    TileGrid2VO tileGrid2VO2;
                    TileGrid2VO tileGrid2VO3;
                    SelectionProductsEventsHandler selectionProductsEventsHandler;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    wishlistSubscriber = TileGrid2DefaultViewStateBinder.this.wishlistSubscriber;
                    kVar2 = TileGrid2DefaultViewStateBinder.this.viewHolder;
                    if (kVar2 == null) {
                        Intrinsics.n("viewHolder");
                        throw null;
                    }
                    D a11 = K.a(kVar2);
                    composerReferences = TileGrid2DefaultViewStateBinder.this.references;
                    C4908c g10 = composerReferences.getContainer().g();
                    tileGrid2VO2 = TileGrid2DefaultViewStateBinder.this.item;
                    if (tileGrid2VO2 == null) {
                        Intrinsics.n("item");
                        throw null;
                    }
                    wishlistSubscriber.subscribeIfNeed(a11, g10, tileGrid2VO2.getWishlistKey());
                    tileGrid2VO3 = TileGrid2DefaultViewStateBinder.this.item;
                    if (tileGrid2VO3 == null) {
                        Intrinsics.n("item");
                        throw null;
                    }
                    if (tileGrid2VO3.getSelectionKey() == null || selectionProductsEventsHandler == null) {
                        return;
                    }
                    selectionProductsEventsHandler.subscribeToSelectionProductsEvents();
                }

                /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
                
                    r2 = r1.this$0.getSelectionProductsEventsHandler();
                 */
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onDestroy(J owner) {
                    C8486a c8486a;
                    TileOverlayBinder tileOverlayBinder;
                    TileGrid2VO tileGrid2VO2;
                    k kVar2;
                    SelectionProductsEventsHandler selectionProductsEventsHandler;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    c8486a = TileGrid2DefaultViewStateBinder.this.disposables;
                    c8486a.d();
                    tileOverlayBinder = TileGrid2DefaultViewStateBinder.this.overlayBinder;
                    if (tileOverlayBinder != null) {
                        tileOverlayBinder.unsubscribe();
                    }
                    tileGrid2VO2 = TileGrid2DefaultViewStateBinder.this.item;
                    if (tileGrid2VO2 == null) {
                        Intrinsics.n("item");
                        throw null;
                    }
                    if (tileGrid2VO2.getSelectionKey() != null && selectionProductsEventsHandler != null) {
                        selectionProductsEventsHandler.reset();
                    }
                    kVar2 = TileGrid2DefaultViewStateBinder.this.viewHolder;
                    if (kVar2 != null) {
                        kVar2.getLifecycle().e(this);
                    } else {
                        Intrinsics.n("viewHolder");
                        throw null;
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner) {
                    TileOverlayBinder tileOverlayBinder;
                    TileGrid2VO tileGrid2VO2;
                    BlurMoleculeDelegate blurMoleculeDelegate;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    tileOverlayBinder = TileGrid2DefaultViewStateBinder.this.overlayBinder;
                    if (tileOverlayBinder != null) {
                        tileOverlayBinder.subscribe();
                    }
                    tileGrid2VO2 = TileGrid2DefaultViewStateBinder.this.item;
                    if (tileGrid2VO2 == null) {
                        Intrinsics.n("item");
                        throw null;
                    }
                    BlurMoleculeVO blurMolecule = tileGrid2VO2.getGalleryModel().getAdultImagesModel().getBlurMolecule();
                    if (blurMolecule != null) {
                        blurMoleculeDelegate = TileGrid2DefaultViewStateBinder.this.blurMoleculeDelegate;
                        blurMoleculeDelegate.subscribe(blurMolecule);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(J owner) {
                    TileOverlayBinder tileOverlayBinder;
                    BlurMoleculeDelegate blurMoleculeDelegate;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    tileOverlayBinder = TileGrid2DefaultViewStateBinder.this.overlayBinder;
                    if (tileOverlayBinder != null) {
                        tileOverlayBinder.unsubscribe();
                    }
                    blurMoleculeDelegate = TileGrid2DefaultViewStateBinder.this.blurMoleculeDelegate;
                    blurMoleculeDelegate.unsubscribe();
                }
            });
        } else {
            Intrinsics.n("viewHolder");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle
    public void onDetach() {
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        tileGrid2BaseViewBinding.getTopRightButtonsDelegate().onDetach();
        TileOverlayBinder tileOverlayBinder = this.overlayBinder;
        if (tileOverlayBinder != null) {
            tileOverlayBinder.unsubscribe();
        }
        this.ratingBinder.onDetach();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle
    public void onRecycle() {
        CountButtonView value;
        TileGrid2ViewStateBinder.DefaultImpls.onRecycle(this);
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.viewBinding;
        if (tileGrid2BaseViewBinding == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        InterfaceC4008j<CountButtonView> countButtonViewLazy = tileGrid2BaseViewBinding.getCountButtonViewLazy();
        if (countButtonViewLazy == null || !countButtonViewLazy.isInitialized()) {
            return;
        }
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding2 = this.viewBinding;
        if (tileGrid2BaseViewBinding2 == null) {
            Intrinsics.n("viewBinding");
            throw null;
        }
        InterfaceC4008j<CountButtonView> countButtonViewLazy2 = tileGrid2BaseViewBinding2.getCountButtonViewLazy();
        if (countButtonViewLazy2 == null || (value = countButtonViewLazy2.getValue()) == null) {
            return;
        }
        value.recycle();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle
    public void onViewInVisibleBounds() {
        TileGrid2GalleryModel.Image image;
        t tokenizedEvent;
        TileGrid2ViewStateBinder.DefaultImpls.onViewInVisibleBounds(this);
        if (this.gallerySwipeViewDelegate instanceof GallerySingleViewDelegate) {
            TileGrid2VO tileGrid2VO = this.item;
            if (tileGrid2VO == null) {
                Intrinsics.n("item");
                throw null;
            }
            TileGrid2GalleryModel.GalleryItem galleryItem = (TileGrid2GalleryModel.GalleryItem) C7714v.M(tileGrid2VO.getGalleryModel().getAdultImagesModel().getImageItems());
            if (galleryItem == null || (image = galleryItem.getImage()) == null || (tokenizedEvent = image.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle
    public void onViewOutOfVisibleBounds() {
        VideoTileDelegate videoTileDelegate;
        TileGrid2ViewStateBinder.DefaultImpls.onViewOutOfVisibleBounds(this);
        if (!this.references.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED) || (videoTileDelegate = this.videoTileDelegate) == null) {
            return;
        }
        videoTileDelegate.onWidgetHolderScrolledOutOfVisibleBounds(this);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void prepare(@NotNull TileGrid2VO vo, CountButtonViewModel countButtonViewModel, DisposableActionHandler actionHandler) {
        SelectionProductsEventsHandler selectionProductsEventsHandler;
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.item = vo;
        this.countButtonViewModel = countButtonViewModel;
        this.actionHandler = actionHandler;
        if (vo == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (vo.getSelectionKey() == null || (selectionProductsEventsHandler = getSelectionProductsEventsHandler()) == null) {
            return;
        }
        selectionProductsEventsHandler.updateSelectionProductsData(vo.getTileId(), vo.getOverlayItem());
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public void swipeGalleryToFirstVideo() {
        GalleryBaseViewDelegate galleryBaseViewDelegate = this.gallerySwipeViewDelegate;
        if (galleryBaseViewDelegate != null) {
            galleryBaseViewDelegate.swipeToFirstVideo();
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewStateBinder
    public void trackView() {
        this.ratingBinder.trackView();
    }
}
