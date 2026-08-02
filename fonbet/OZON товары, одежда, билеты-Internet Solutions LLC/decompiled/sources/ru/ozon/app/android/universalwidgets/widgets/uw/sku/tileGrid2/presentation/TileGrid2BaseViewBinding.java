package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import Sc.InterfaceC4008j;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.TileGrid2BadgesDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.tile.TileGrid2OverlayView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2RootView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate;
import ru.ozon.uni.android.atom.rating.RatingView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003'()B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001f\u0082\u0001\u0003*+,¨\u0006-"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "", "<init>", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "getTopRightButtonsDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "topRightButtonsDelegate", "Landroidx/recyclerview/widget/RecyclerView;", "getContentElementsVAL", "()Landroidx/recyclerview/widget/RecyclerView;", "contentElementsVAL", "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "root", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "getGalleryViewDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "galleryViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "getBadgesDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Landroidx/appcompat/widget/AppCompatImageView;", "getKebabBtn", "()Landroidx/appcompat/widget/AppCompatImageView;", "kebabBtn", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView;", "getOverlayView", "()LSc/j;", "overlayView", "Lru/ozon/uni/android/atom/rating/RatingView;", "getRatingView", "ratingView", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "getCountButtonViewLazy", "countButtonViewLazy", "TileGrid2DefaultViewBinding", "TileGrid2SimpleRightButtonsViewBinding", "TileGrid2ThinViewBinding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding$TileGrid2DefaultViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding$TileGrid2SimpleRightButtonsViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding$TileGrid2ThinViewBinding;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TileGrid2BaseViewBinding {

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020*0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)¨\u00060"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding$TileGrid2DefaultViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;", "view", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "topRightButtonsDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "getTopRightButtonsDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "Landroidx/recyclerview/widget/RecyclerView;", "contentElementsVAL", "Landroidx/recyclerview/widget/RecyclerView;", "getContentElementsVAL", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "root", "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "galleryViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "getGalleryViewDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "getBadgesDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "Landroidx/appcompat/widget/AppCompatImageView;", "kebabBtn", "Landroidx/appcompat/widget/AppCompatImageView;", "getKebabBtn", "()Landroidx/appcompat/widget/AppCompatImageView;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView;", "overlayView", "LSc/j;", "getOverlayView", "()LSc/j;", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "getRatingView", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "countButtonViewLazy", "getCountButtonViewLazy", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TileGrid2DefaultViewBinding extends TileGrid2BaseViewBinding {
        private final TileGrid2BadgesDelegate badgesDelegate;

        @NotNull
        private final RecyclerView contentElementsVAL;

        @NotNull
        private final InterfaceC4008j<CountButtonView> countButtonViewLazy;

        @NotNull
        private final GalleryBaseViewDelegate galleryViewDelegate;

        @NotNull
        private final AppCompatImageView kebabBtn;

        @NotNull
        private final InterfaceC4008j<TileGrid2OverlayView> overlayView;

        @NotNull
        private final InterfaceC4008j<RatingView> ratingView;

        @NotNull
        private final ViewGroup root;

        @NotNull
        private final TileGrid2TopRightButtonsDelegate topRightButtonsDelegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileGrid2DefaultViewBinding(@NotNull TileGrid2RootView view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.topRightButtonsDelegate = view.getTopRightButtonsDelegate();
            this.contentElementsVAL = view.getContentElementsRV();
            this.root = view;
            this.galleryViewDelegate = view.getGalleryViewDelegate();
            this.badgesDelegate = view.getBadgesDelegate();
            this.kebabBtn = view.getKebabIV();
            this.overlayView = view.getOverlayView();
            this.ratingView = view.getRatingView();
            this.countButtonViewLazy = view.getCountButton();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public TileGrid2BadgesDelegate getBadgesDelegate() {
            return this.badgesDelegate;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public RecyclerView getContentElementsVAL() {
            return this.contentElementsVAL;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public InterfaceC4008j<CountButtonView> getCountButtonViewLazy() {
            return this.countButtonViewLazy;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public GalleryBaseViewDelegate getGalleryViewDelegate() {
            return this.galleryViewDelegate;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public AppCompatImageView getKebabBtn() {
            return this.kebabBtn;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public InterfaceC4008j<TileGrid2OverlayView> getOverlayView() {
            return this.overlayView;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public InterfaceC4008j<RatingView> getRatingView() {
            return this.ratingView;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public ViewGroup getRoot() {
            return this.root;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public TileGrid2TopRightButtonsDelegate getTopRightButtonsDelegate() {
            return this.topRightButtonsDelegate;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)¨\u00060"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding$TileGrid2SimpleRightButtonsViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;", "view", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "topRightButtonsDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "getTopRightButtonsDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "Landroidx/recyclerview/widget/RecyclerView;", "contentElementsVAL", "Landroidx/recyclerview/widget/RecyclerView;", "getContentElementsVAL", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "root", "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "galleryViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "getGalleryViewDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "getBadgesDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "Landroidx/appcompat/widget/AppCompatImageView;", "kebabBtn", "Landroidx/appcompat/widget/AppCompatImageView;", "getKebabBtn", "()Landroidx/appcompat/widget/AppCompatImageView;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView;", "overlayView", "LSc/j;", "getOverlayView", "()LSc/j;", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "getRatingView", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "countButtonViewLazy", "getCountButtonViewLazy", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TileGrid2SimpleRightButtonsViewBinding extends TileGrid2BaseViewBinding {
        private final TileGrid2BadgesDelegate badgesDelegate;

        @NotNull
        private final RecyclerView contentElementsVAL;
        private final InterfaceC4008j<CountButtonView> countButtonViewLazy;

        @NotNull
        private final GalleryBaseViewDelegate galleryViewDelegate;
        private final AppCompatImageView kebabBtn;
        private final InterfaceC4008j<TileGrid2OverlayView> overlayView;
        private final InterfaceC4008j<RatingView> ratingView;

        @NotNull
        private final ViewGroup root;

        @NotNull
        private final TileGrid2TopRightButtonsDelegate topRightButtonsDelegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileGrid2SimpleRightButtonsViewBinding(@NotNull TileGrid2RootView view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.topRightButtonsDelegate = view.getTopRightButtonsDelegate();
            this.contentElementsVAL = view.getContentElementsRV();
            this.root = view;
            this.galleryViewDelegate = view.getGalleryViewDelegate();
            this.badgesDelegate = view.getBadgesDelegate();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public TileGrid2BadgesDelegate getBadgesDelegate() {
            return this.badgesDelegate;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public RecyclerView getContentElementsVAL() {
            return this.contentElementsVAL;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public InterfaceC4008j<CountButtonView> getCountButtonViewLazy() {
            return this.countButtonViewLazy;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public GalleryBaseViewDelegate getGalleryViewDelegate() {
            return this.galleryViewDelegate;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public AppCompatImageView getKebabBtn() {
            return this.kebabBtn;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public InterfaceC4008j<TileGrid2OverlayView> getOverlayView() {
            return this.overlayView;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public InterfaceC4008j<RatingView> getRatingView() {
            return this.ratingView;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public ViewGroup getRoot() {
            return this.root;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public TileGrid2TopRightButtonsDelegate getTopRightButtonsDelegate() {
            return this.topRightButtonsDelegate;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)¨\u00060"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding$TileGrid2ThinViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;", "view", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2RootView;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "topRightButtonsDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "getTopRightButtonsDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "Landroidx/recyclerview/widget/RecyclerView;", "contentElementsVAL", "Landroidx/recyclerview/widget/RecyclerView;", "getContentElementsVAL", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "root", "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "galleryViewDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "getGalleryViewDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "badgesDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "getBadgesDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "Landroidx/appcompat/widget/AppCompatImageView;", "kebabBtn", "Landroidx/appcompat/widget/AppCompatImageView;", "getKebabBtn", "()Landroidx/appcompat/widget/AppCompatImageView;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView;", "overlayView", "LSc/j;", "getOverlayView", "()LSc/j;", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "getRatingView", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "countButtonViewLazy", "getCountButtonViewLazy", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TileGrid2ThinViewBinding extends TileGrid2BaseViewBinding {
        private final TileGrid2BadgesDelegate badgesDelegate;

        @NotNull
        private final RecyclerView contentElementsVAL;
        private final InterfaceC4008j<CountButtonView> countButtonViewLazy;

        @NotNull
        private final GalleryBaseViewDelegate galleryViewDelegate;
        private final AppCompatImageView kebabBtn;
        private final InterfaceC4008j<TileGrid2OverlayView> overlayView;
        private final InterfaceC4008j<RatingView> ratingView;

        @NotNull
        private final ViewGroup root;

        @NotNull
        private final TileGrid2TopRightButtonsDelegate topRightButtonsDelegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileGrid2ThinViewBinding(@NotNull TileGrid2RootView view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.topRightButtonsDelegate = view.getTopRightButtonsDelegate();
            this.contentElementsVAL = view.getContentElementsRV();
            this.root = view;
            this.galleryViewDelegate = view.getGalleryViewDelegate();
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public TileGrid2BadgesDelegate getBadgesDelegate() {
            return this.badgesDelegate;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public RecyclerView getContentElementsVAL() {
            return this.contentElementsVAL;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public InterfaceC4008j<CountButtonView> getCountButtonViewLazy() {
            return this.countButtonViewLazy;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public GalleryBaseViewDelegate getGalleryViewDelegate() {
            return this.galleryViewDelegate;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public AppCompatImageView getKebabBtn() {
            return this.kebabBtn;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public InterfaceC4008j<TileGrid2OverlayView> getOverlayView() {
            return this.overlayView;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        public InterfaceC4008j<RatingView> getRatingView() {
            return this.ratingView;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public ViewGroup getRoot() {
            return this.root;
        }

        @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding
        @NotNull
        public TileGrid2TopRightButtonsDelegate getTopRightButtonsDelegate() {
            return this.topRightButtonsDelegate;
        }
    }

    public /* synthetic */ TileGrid2BaseViewBinding(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TileGrid2BadgesDelegate getBadgesDelegate();

    @NotNull
    public abstract RecyclerView getContentElementsVAL();

    public abstract InterfaceC4008j<CountButtonView> getCountButtonViewLazy();

    @NotNull
    public abstract GalleryBaseViewDelegate getGalleryViewDelegate();

    public abstract AppCompatImageView getKebabBtn();

    public abstract InterfaceC4008j<TileGrid2OverlayView> getOverlayView();

    public abstract InterfaceC4008j<RatingView> getRatingView();

    @NotNull
    public abstract ViewGroup getRoot();

    @NotNull
    public abstract TileGrid2TopRightButtonsDelegate getTopRightButtonsDelegate();

    private TileGrid2BaseViewBinding() {
    }
}
