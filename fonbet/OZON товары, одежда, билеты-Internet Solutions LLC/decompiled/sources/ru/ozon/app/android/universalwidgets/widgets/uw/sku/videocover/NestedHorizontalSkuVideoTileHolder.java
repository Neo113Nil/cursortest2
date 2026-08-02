package ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.media3.ui.PlayerView;
import jk0.j;
import jk0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.VideoTileHolder;
import ru.ozon.app.android.videocover.VideoTileItem;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u00030\bj\u0006\u0012\u0002\b\u0003`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0019¢\u0006\u0004\b$\u0010\u001bJ\r\u0010%\u001a\u00020\u0019¢\u0006\u0004\b%\u0010\u001bJ\r\u0010&\u001a\u00020\u0019¢\u0006\u0004\b&\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R \u0010\n\u001a\u000e\u0012\u0002\b\u00030\bj\u0006\u0012\u0002\b\u0003`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0018\u00107\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/NestedHorizontalSkuVideoTileHolder;", "Lru/ozon/app/android/videocover/VideoTileHolder;", "Landroid/view/ViewGroup;", "scrollingContainer", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "galleryView", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "itemViewHolder", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;Ljk0/j;)V", "", "isSmooth", "swipeGalleryToFirstImage", "(Z)Z", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "", "showPreview", "()V", "hidePreview", "onVideoStart", "onVideoStop", "scrollNestedVideoItemToFirstVideo", "Lru/ozon/app/android/product/common/product/ProductVO;", "productVO", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onProductClick", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Ljk0/j;", "Lru/ozon/app/android/videocover/VideoTileItem;", "videoItem", "Lru/ozon/app/android/videocover/VideoTileItem;", "getVideoItem", "()Lru/ozon/app/android/videocover/VideoTileItem;", "setVideoItem", "(Lru/ozon/app/android/videocover/VideoTileItem;)V", "isHorizontalItem", "Z", "()Z", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/product/common/product/ProductVO;", "Landroid/view/View;", "getGalleryItemView", "()Landroid/view/View;", "galleryItemView", "", "getWidgetHolderPosition", "()I", "widgetHolderPosition", "getPositionInGallery", "positionInGallery", "getVideoTileComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "videoTileComposerReferences", "Ljk0/l;", "getOverlayPositions", "()Ljk0/l;", "overlayPositions", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestedHorizontalSkuVideoTileHolder implements VideoTileHolder {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final SkuImageWrapper galleryView;
    private final boolean isHorizontalItem;

    @NotNull
    private final j itemViewHolder;
    private ProductVO product;
    private final ViewGroup scrollingContainer;
    private VideoTileItem videoItem;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final k<?> widgetViewHolder;

    public NestedHorizontalSkuVideoTileHolder(ViewGroup viewGroup, @NotNull ComposerReferences composerReferences, @NotNull SkuImageWrapper galleryView, @NotNull k<?> widgetViewHolder, @NotNull VideoTileDelegate videoTileDelegate, @NotNull j itemViewHolder) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(galleryView, "galleryView");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(itemViewHolder, "itemViewHolder");
        this.scrollingContainer = viewGroup;
        this.composerReferences = composerReferences;
        this.galleryView = galleryView;
        this.widgetViewHolder = widgetViewHolder;
        this.videoTileDelegate = videoTileDelegate;
        this.itemViewHolder = itemViewHolder;
        this.isHorizontalItem = true;
    }

    public final void bind(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "productVO");
        this.product = productVO;
        Object currentItem = productVO != null ? UtilsKt.getCurrentItem(productVO) : null;
        setVideoItem(currentItem instanceof GalleryItem.VideoItem ? (GalleryItem.VideoItem) currentItem : null);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    @NotNull
    public View getGalleryItemView() {
        return this.galleryView;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    @NotNull
    /* renamed from: getOverlayPositions */
    public l getOverlapContainersPositionInfo() {
        return this.widgetViewHolder.getViewHolderPositionInfo().a();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    @NotNull
    public PlayerView getPlayerView() {
        return this.galleryView.getPlayerView();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public int getPositionInGallery() {
        return this.itemViewHolder.getAdapterPosition();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public boolean getShouldReplay() {
        return VideoTileHolder.DefaultImpls.getShouldReplay(this);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public VideoTileItem getVideoItem() {
        return this.videoItem;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    @NotNull
    /* renamed from: getVideoTileComposerReferences, reason: from getter */
    public ComposerReferences getComposerReferences() {
        return this.composerReferences;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public int getWidgetHolderPosition() {
        return this.widgetViewHolder.getAdapterPosition();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void hidePreview() {
        this.galleryView.hidePreview();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    /* renamed from: isHorizontalItem, reason: from getter */
    public boolean getIsHorizontalItem() {
        return this.isHorizontalItem;
    }

    public final void onProductClick() {
        this.videoTileDelegate.onVideoTileClicked(UtilsKt.listOfGalleryItems(this.product));
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStart() {
        this.galleryView.onVideoStart();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStop() {
        this.galleryView.onVideoStop();
    }

    public final void onViewInVisibleBounds() {
        ProductVO productVO = this.product;
        if (productVO == null || !UtilsKt.hasVideoCover(productVO)) {
            return;
        }
        ProductVO productVO2 = this.product;
        if ((productVO2 != null ? UtilsKt.getCurrentItem(productVO2) : null) instanceof GalleryItem.VideoItem) {
            this.videoTileDelegate.onVideoTileInVisibleBounds(this);
        }
    }

    public final void onViewOutOfVisibleBounds() {
        ProductVO productVO = this.product;
        if (productVO == null || !UtilsKt.hasVideoCover(productVO)) {
            return;
        }
        boolean a11 = getComposerReferences().getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED);
        this.videoTileDelegate.onVideoTileOutOfVisibleBounds(this, a11);
        if (a11) {
            ProductVO productVO2 = this.product;
            if (productVO2 != null) {
                UtilsKt.setCurrentItemAsVideo(productVO2);
            }
            ProductVO productVO3 = this.product;
            setVideoItem(productVO3 != null ? UtilsKt.getVideoItem(productVO3) : null);
            scrollNestedVideoItemToFirstVideo();
        }
    }

    public void scrollNestedVideoItemToFirstVideo() {
        ProductVO productVO = this.product;
        if (productVO != null) {
            UtilsKt.setCurrentItemAsVideo(productVO);
        }
        SkuImageWrapper skuImageWrapper = this.galleryView;
        Object videoItem = getVideoItem();
        skuImageWrapper.bindItem(videoItem instanceof GalleryItem ? (GalleryItem) videoItem : null);
    }

    public void setVideoItem(VideoTileItem videoTileItem) {
        this.videoItem = videoTileItem;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void showPreview() {
        VideoTileItem videoItem = getVideoItem();
        if ((videoItem instanceof GalleryItem.VideoItem ? (GalleryItem.VideoItem) videoItem : null) != null) {
            this.galleryView.showPreview();
        }
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public boolean swipeGalleryToFirstImage(boolean isSmooth) {
        GalleryItem.ImageItem imageItem;
        ProductVO productVO = this.product;
        if (productVO == null || (imageItem = UtilsKt.getImageItem(productVO)) == null) {
            return false;
        }
        ProductVO productVO2 = this.product;
        if (productVO2 != null) {
            UtilsKt.setCurrentItemAsImage(productVO2);
        }
        this.galleryView.bindItem(imageItem);
        this.videoTileDelegate.onVideoTileOutOfVisibleBounds(this, getComposerReferences().getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED));
        return false;
    }
}
