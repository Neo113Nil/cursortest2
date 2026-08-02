package ru.ozon.app.android.sellerproducts.sellerProducts.videocover;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.media3.ui.PlayerView;
import jk0.l;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductCommonMapperKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.views.CsmaSkuImageWrapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.VideoTileHolder;
import ru.ozon.app.android.videocover.VideoTileItem;
import ru.ozon.app.android.videocover.VideoTileWidgetHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u0014J\r\u0010$\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u001e\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001cR\u001a\u0010<\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\"R\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u001cR\u0016\u0010J\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010+R\u0016\u0010N\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/videocover/SkuVideoCoverDelegate;", "Lru/ozon/app/android/videocover/VideoTileHolder;", "Lru/ozon/app/android/videocover/VideoTileWidgetHolder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;", "galleryView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "", "isHorizontal", "<init>", "(Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/videocover/VideoTileDelegate;Z)V", "isSmooth", "swipeGalleryToFirstImage", "(Z)Z", "", "hidePreview", "()V", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "showPreview", "swipeGalleryToFirstVideo", "", "getPosition", "()I", "onVideoStart", "onVideoStop", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onProductClick", "Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;", "getGalleryView", "()Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "getWidgetViewHolder", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "getVideoTileDelegate", "()Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/videocover/VideoTileItem;", "videoItem", "Lru/ozon/app/android/videocover/VideoTileItem;", "getVideoItem", "()Lru/ozon/app/android/videocover/VideoTileItem;", "setVideoItem", "(Lru/ozon/app/android/videocover/VideoTileItem;)V", "positionInGallery", "I", "getPositionInGallery", "isHorizontalItem", "Z", "()Z", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "getProduct", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "setProduct", "Landroid/view/View;", "getGalleryItemView", "()Landroid/view/View;", "galleryItemView", "getWidgetHolderPosition", "widgetHolderPosition", "getVideoTileComposerReferences", "videoTileComposerReferences", "Ljk0/l;", "getOverlayPositions", "()Ljk0/l;", "overlayPositions", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SkuVideoCoverDelegate implements VideoTileHolder, VideoTileWidgetHolder {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final CsmaSkuImageWrapper galleryView;
    private final boolean isHorizontalItem;
    private final int positionInGallery;
    private ProductVO product;
    private VideoTileItem videoItem;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final k<?> widgetViewHolder;

    public SkuVideoCoverDelegate(@NotNull CsmaSkuImageWrapper galleryView, @NotNull ComposerReferences composerReferences, @NotNull k<?> widgetViewHolder, @NotNull VideoTileDelegate videoTileDelegate, boolean z11) {
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
        ProductVO.GalleryItem currentItem = UtilsKt.getCurrentItem(product);
        setVideoItem(currentItem instanceof ProductVO.GalleryItem.VideoItem ? (ProductVO.GalleryItem.VideoItem) currentItem : null);
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
        q viewHolderPositionInfo = this.widgetViewHolder.getViewHolderPositionInfo();
        if (viewHolderPositionInfo != null) {
            return viewHolderPositionInfo.a();
        }
        return null;
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
        if ((productVO2 != null ? UtilsKt.getCurrentItem(productVO2) : null) instanceof ProductVO.GalleryItem.VideoItem) {
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
            setVideoItem(productVO3 != null ? ProductCommonMapperKt.getVideoItem(productVO3) : null);
            this.videoTileDelegate.onWidgetHolderScrolledOutOfVisibleBounds(this);
        }
    }

    public void setVideoItem(VideoTileItem videoTileItem) {
        this.videoItem = videoTileItem;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void showPreview() {
        VideoTileItem videoItem = getVideoItem();
        if ((videoItem instanceof ProductVO.GalleryItem.VideoItem ? (ProductVO.GalleryItem.VideoItem) videoItem : null) != null) {
            this.galleryView.showPreview();
        }
    }

    @Override // ru.ozon.app.android.videocover.VideoTileHolder
    public boolean swipeGalleryToFirstImage(boolean isSmooth) {
        ProductVO.GalleryItem.ImageItem imageItem;
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
        CsmaSkuImageWrapper csmaSkuImageWrapper = this.galleryView;
        Object videoItem = getVideoItem();
        csmaSkuImageWrapper.bindItem(videoItem instanceof ProductVO.GalleryItem ? (ProductVO.GalleryItem) videoItem : null);
    }
}
