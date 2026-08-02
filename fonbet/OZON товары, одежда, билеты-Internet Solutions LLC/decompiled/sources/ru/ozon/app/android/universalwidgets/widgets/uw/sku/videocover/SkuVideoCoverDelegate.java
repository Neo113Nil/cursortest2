package ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.media3.ui.PlayerView;
import jk0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.VideoTileHolder;
import ru.ozon.app.android.videocover.VideoTileItem;
import ru.ozon.app.android.videocover.VideoTileWidgetHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0015J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0013¢\u0006\u0004\b$\u0010\u0015J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010\u0015J\r\u0010&\u001a\u00020\u0013¢\u0006\u0004\b&\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R&\u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001dR\u001a\u0010=\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R$\u0010!\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010#R\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u001dR\u0016\u0010K\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010,R\u0016\u0010O\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/SkuVideoCoverDelegate;", "Lru/ozon/app/android/videocover/VideoTileHolder;", "Lru/ozon/app/android/videocover/VideoTileWidgetHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "galleryView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "", "isHorizontal", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;Z)V", "isSmooth", "swipeGalleryToFirstImage", "(Z)Z", "", "hidePreview", "()V", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "showPreview", "swipeGalleryToFirstVideo", "", "getPosition", "()I", "onVideoStart", "onVideoStop", "Lru/ozon/app/android/product/common/product/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onProductClick", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "getGalleryView", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "getWidgetViewHolder", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "getVideoTileDelegate", "()Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/videocover/VideoTileItem;", "videoItem", "Lru/ozon/app/android/videocover/VideoTileItem;", "getVideoItem", "()Lru/ozon/app/android/videocover/VideoTileItem;", "setVideoItem", "(Lru/ozon/app/android/videocover/VideoTileItem;)V", "positionInGallery", "I", "getPositionInGallery", "isHorizontalItem", "Z", "()Z", "Lru/ozon/app/android/product/common/product/ProductVO;", "getProduct", "()Lru/ozon/app/android/product/common/product/ProductVO;", "setProduct", "Landroid/view/View;", "getGalleryItemView", "()Landroid/view/View;", "galleryItemView", "getWidgetHolderPosition", "widgetHolderPosition", "getVideoTileComposerReferences", "videoTileComposerReferences", "Ljk0/l;", "getOverlayPositions", "()Ljk0/l;", "overlayPositions", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SkuVideoCoverDelegate implements VideoTileHolder, VideoTileWidgetHolder {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final SkuImageWrapper galleryView;
    private final boolean isHorizontalItem;
    private final int positionInGallery;
    private ProductVO product;
    private VideoTileItem videoItem;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final k<?> widgetViewHolder;

    public SkuVideoCoverDelegate(@NotNull SkuImageWrapper galleryView, @NotNull ComposerReferences composerReferences, @NotNull k<?> widgetViewHolder, @NotNull VideoTileDelegate videoTileDelegate, boolean z11) {
        Intrinsics.checkNotNullParameter(galleryView, "galleryView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        this.galleryView = galleryView;
        this.composerReferences = composerReferences;
        this.widgetViewHolder = widgetViewHolder;
        this.videoTileDelegate = videoTileDelegate;
        this.isHorizontalItem = z11;
    }

    public final void bind(@NotNull ProductVO product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.product = product;
        GalleryItem currentItem = UtilsKt.getCurrentItem(product);
        setVideoItem(currentItem instanceof GalleryItem.VideoItem ? (GalleryItem.VideoItem) currentItem : null);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    @NotNull
    public View getGalleryItemView() {
        return this.galleryView;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public HorizontalScrollDelegate getHorizontalDelegate() {
        return VideoTileWidgetHolder.DefaultImpls.getHorizontalDelegate(this);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    /* renamed from: getOverlayPositions */
    public l getOverlapContainersPositionInfo() {
        return this.widgetViewHolder.getViewHolderPositionInfo().a();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    @NotNull
    public PlayerView getPlayerView() {
        return this.galleryView.getPlayerView();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public int getPosition() {
        return this.widgetViewHolder.getAdapterPosition();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public int getPositionInGallery() {
        return this.positionInGallery;
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
        boolean a11 = this.composerReferences.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED);
        this.videoTileDelegate.onVideoTileOutOfVisibleBounds(this, a11);
        if (a11) {
            ProductVO productVO2 = this.product;
            if (productVO2 != null) {
                UtilsKt.setCurrentItemAsVideo(productVO2);
            }
            ProductVO productVO3 = this.product;
            setVideoItem(productVO3 != null ? UtilsKt.getVideoItem(productVO3) : null);
            this.videoTileDelegate.onWidgetHolderScrolledOutOfVisibleBounds(this);
        }
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
        this.videoTileDelegate.onVideoTileOutOfVisibleBounds(this, this.composerReferences.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED));
        return false;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public void swipeGalleryToFirstVideo() {
        ProductVO productVO = this.product;
        if (productVO != null) {
            UtilsKt.setCurrentItemAsVideo(productVO);
        }
        SkuImageWrapper skuImageWrapper = this.galleryView;
        Object videoItem = getVideoItem();
        skuImageWrapper.bindItem(videoItem instanceof GalleryItem ? (GalleryItem) videoItem : null);
    }
}
