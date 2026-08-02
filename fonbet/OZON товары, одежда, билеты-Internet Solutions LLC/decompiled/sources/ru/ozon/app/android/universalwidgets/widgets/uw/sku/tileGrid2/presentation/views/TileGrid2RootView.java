package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views;

import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonView;
import ru.ozon.app.android.product.tiles.tilegrid2.flags.TileGrid2BackgroundsOverdrawEnabled;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.TileGrid2BadgesDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.tile.TileGrid2OverlayView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySingleViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.debug.HierarchyLogger;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 U2\u00020\u0001:\u0001UB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u00101R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010>\u001a\u0004\u0018\u00010=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u0011R\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010K\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020O038\u0006¢\u0006\f\n\u0004\bP\u0010&\u001a\u0004\bQ\u00107R\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020R038\u0006¢\u0006\f\n\u0004\bS\u0010&\u001a\u0004\bT\u00107¨\u0006V"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "isSingleTopRightButton", "isThinView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "productFavDelegateProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Landroid/content/Context;ZZLru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "Landroidx/recyclerview/widget/RecyclerView;", "createTopRightButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "createTopRightButtonView", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "", "accesibilityTileID", "Ljava/lang/String;", "getAccesibilityTileID", "()Ljava/lang/String;", "setAccesibilityTileID", "(Ljava/lang/String;)V", "preCreateViewEnabled$delegate", "LSc/j;", "getPreCreateViewEnabled", "()Z", "preCreateViewEnabled", "isGalleryOverdrawEnabled", "Z", "isIndicatorInflateEnabled$delegate", "isIndicatorInflateEnabled", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/debug/HierarchyLogger;", "viewHierarchyLogger$delegate", "getViewHierarchyLogger", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/debug/HierarchyLogger;", "viewHierarchyLogger", "LSc/j;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "countButton", "getCountButton", "()LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "galleryViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "getGalleryViewDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "getBadgesDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "contentElementsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getContentElementsRV", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "topRightButtonsDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "getTopRightButtonsDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "Landroidx/appcompat/widget/AppCompatImageView;", "kebabIV", "Landroidx/appcompat/widget/AppCompatImageView;", "getKebabIV", "()Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView;", "overlayView", "getOverlayView", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "getRatingView", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class TileGrid2RootView extends ConstraintLayout {
    private String accesibilityTileID;
    private final TileGrid2BadgesDelegate badgesDelegate;

    @NotNull
    private final RecyclerView contentElementsRV;

    @NotNull
    private final InterfaceC4008j<CountButtonView> countButton;

    @NotNull
    private final GalleryBaseViewDelegate galleryViewDelegate;
    private final boolean isGalleryOverdrawEnabled;

    /* renamed from: isIndicatorInflateEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isIndicatorInflateEnabled;

    @NotNull
    private final AppCompatImageView kebabIV;

    @NotNull
    private final InterfaceC4008j<TileGrid2OverlayView> overlayView;

    /* renamed from: preCreateViewEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preCreateViewEnabled;

    @NotNull
    private final InterfaceC4008j<RatingView> ratingView;

    @NotNull
    private final TileGrid2TopRightButtonsDelegate topRightButtonsDelegate;

    /* renamed from: viewHierarchyLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewHierarchyLogger;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_2 = UiExtKt.toPx(2);
    private static final int DP_4 = UiExtKt.toPx(4);
    private static final int DP_6 = UiExtKt.toPx(6);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_32 = UiExtKt.toPx(32);
    private static final int topRightButtonsId = R$id.topRightButtonsRV;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView$Companion;", "", "<init>", "()V", "", "KEBAB_LOCATOR", "Ljava/lang/String;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileGrid2RootView(Context context, boolean z11, boolean z12, FavoriteDelegateProvider favoriteDelegateProvider, FeatureChecker featureChecker, FavoriteManager favoriteManager, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z11, (i11 & 4) != 0 ? false : z12, favoriteDelegateProvider, featureChecker, favoriteManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductFavoriteMoleculeButtonView createTopRightButtonView() {
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView;
        if (getPreCreateViewEnabled()) {
            productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) q.f64554a.i(N.b(ProductFavoriteMoleculeButtonView.class), getContext());
            if (productFavoriteMoleculeButtonView == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(context, null, 0, 6, null);
            }
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(context2, null, 0, 6, null);
        }
        productFavoriteMoleculeButtonView.setId(topRightButtonsId);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(tileGrid2Constants.getTopRightBtnsWidth(), tileGrid2Constants.getTopRightBtnsWidth());
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = tileGrid2Constants.getTopRightBtnsTopMargin();
        productFavoriteMoleculeButtonView.setLayoutParams(bVar);
        addView(productFavoriteMoleculeButtonView);
        return productFavoriteMoleculeButtonView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView createTopRightButtonsRv() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(topRightButtonsId);
        recyclerView.setNestedScrollingEnabled(false);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(tileGrid2Constants.getTopRightBtnsWidth(), 0);
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41640k = R$id.contentElementsVAL;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = tileGrid2Constants.getTopRightBtnsTopMargin();
        recyclerView.setLayoutParams(bVar);
        addView(recyclerView);
        return recyclerView;
    }

    private final boolean getPreCreateViewEnabled() {
        return ((Boolean) this.preCreateViewEnabled.getValue()).booleanValue();
    }

    private final HierarchyLogger getViewHierarchyLogger() {
        return (HierarchyLogger) this.viewHierarchyLogger.getValue();
    }

    private final boolean isIndicatorInflateEnabled() {
        return ((Boolean) this.isIndicatorInflateEnabled.getValue()).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        try {
            return super.dispatchTouchEvent(ev);
        } catch (NullPointerException e11) {
            getViewHierarchyLogger().onDispatchTouchEventFailed(ev, this, e11);
            return true;
        }
    }

    public final TileGrid2BadgesDelegate getBadgesDelegate() {
        return this.badgesDelegate;
    }

    @NotNull
    public final RecyclerView getContentElementsRV() {
        return this.contentElementsRV;
    }

    @NotNull
    public final InterfaceC4008j<CountButtonView> getCountButton() {
        return this.countButton;
    }

    @NotNull
    public final GalleryBaseViewDelegate getGalleryViewDelegate() {
        return this.galleryViewDelegate;
    }

    @NotNull
    public final AppCompatImageView getKebabIV() {
        return this.kebabIV;
    }

    @NotNull
    public final InterfaceC4008j<TileGrid2OverlayView> getOverlayView() {
        return this.overlayView;
    }

    @NotNull
    public final InterfaceC4008j<RatingView> getRatingView() {
        return this.ratingView;
    }

    @NotNull
    public final TileGrid2TopRightButtonsDelegate getTopRightButtonsDelegate() {
        return this.topRightButtonsDelegate;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setText(this.accesibilityTileID);
        }
    }

    public final void setAccesibilityTileID(String str) {
        this.accesibilityTileID = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2RootView(@NotNull Context context, boolean z11, boolean z12, @NotNull FavoriteDelegateProvider productFavDelegateProvider, @NotNull FeatureChecker featureChecker, @NotNull FavoriteManager favoriteManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productFavDelegateProvider, "productFavDelegateProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.preCreateViewEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2RootView$preCreateViewEnabled$2(featureChecker));
        boolean isEnabled = featureChecker.isEnabled(TileGrid2BackgroundsOverdrawEnabled.INSTANCE);
        this.isGalleryOverdrawEnabled = isEnabled;
        this.isIndicatorInflateEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2RootView$isIndicatorInflateEnabled$2(featureChecker));
        this.viewHierarchyLogger = k.b(TileGrid2RootView$viewHierarchyLogger$2.INSTANCE);
        this.countButton = LazyUtilsKt.unsafeLazy(new TileGrid2RootView$countButton$1(context, this));
        GalleryBaseViewDelegate gallerySingleViewDelegate = z12 ? new GallerySingleViewDelegate(this, getPreCreateViewEnabled(), isEnabled) : new GallerySwipeViewDelegate(this, isEnabled, isIndicatorInflateEnabled());
        this.galleryViewDelegate = gallerySingleViewDelegate;
        this.badgesDelegate = z12 ? null : new TileGrid2BadgesDelegate(this);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.contentElementsVAL);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        int i11 = DP_6;
        bVar.setMarginStart(i11);
        bVar.setMarginEnd(i11);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = DP_4;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = DP_8;
        bVar.f41598E = 0.0f;
        bVar.f41599F = 0.0f;
        bVar.f41616W = true;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = gallerySingleViewDelegate.getBottomViewId();
        recyclerView.setLayoutParams(bVar);
        recyclerView.setClickable(true);
        recyclerView.setFocusable(true);
        recyclerView.setNestedScrollingEnabled(false);
        this.contentElementsRV = recyclerView;
        this.topRightButtonsDelegate = new TileGrid2TopRightButtonsDelegate(z11, productFavDelegateProvider, favoriteManager, new TileGrid2RootView$topRightButtonsDelegate$1(this), new TileGrid2RootView$topRightButtonsDelegate$2(this));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        int i12 = DP_32;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i12, i12);
        bVar2.f41658v = 0;
        bVar2.f41636i = recyclerView.getId();
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = -i11;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = DP_2;
        appCompatImageView.setLayoutParams(bVar2);
        appCompatImageView.setPadding(i11, i11, i11, i11);
        appCompatImageView.setContentDescription("TileGrid2KebabIV");
        this.kebabIV = appCompatImageView;
        this.overlayView = LazyUtilsKt.unsafeLazy(new TileGrid2RootView$overlayView$1(context, this));
        this.ratingView = LazyUtilsKt.unsafeLazy(new TileGrid2RootView$ratingView$1(context, this));
        setId(R$id.tileGridItemCl);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setClipToPadding(false);
        setClickable(true);
        setFocusable(true);
        addView(recyclerView);
        addView(appCompatImageView);
    }
}
