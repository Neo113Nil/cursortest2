package ru.ozon.app.android.sellerproducts.sellerProducts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.videocover.VideoTileView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\f\u0010 \u001a\u00020\u0011*\u00020\rH\u0002J\f\u0010!\u001a\u00020\u0011*\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Lru/ozon/app/android/cscore/adultimage/DeliveryAdultImageView;", "videoView", "Lru/ozon/app/android/sellerproducts/sellerProducts/videocover/VideoTileView;", "ratio", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setRatio", "bindItem", "image", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "hidePreview", "showPreview", "onVideoStart", "onVideoStop", "getPlayerView", "Landroidx/media3/ui/PlayerView;", "getVideoView", "createVideoView", "customGone", "customShow", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CsmaSkuImageWrapper extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float IMAGE_CORNER_RADIUS = ResourceExtKt.toPxF(12);

    @NotNull
    private final DeliveryAdultImageView imageView;
    private float ratio;
    private VideoTileView videoView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/views/CsmaSkuImageWrapper$Companion;", "", "<init>", "()V", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CsmaSkuImageWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final VideoTileView createVideoView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VideoTileView videoTileView = new VideoTileView(context, null, 0, 6, null);
        videoTileView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.videoView = videoTileView;
        addView(videoTileView);
        VideoTileView videoTileView2 = this.videoView;
        Intrinsics.f(videoTileView2);
        return videoTileView2;
    }

    private final void customGone(VideoTileView videoTileView) {
        removeView(this.videoView);
    }

    private final void customShow(VideoTileView videoTileView) {
        if (videoTileView.getParent() == null) {
            addView(this.videoView);
            ViewExtKt.show(videoTileView);
        }
    }

    private final VideoTileView getVideoView() {
        VideoTileView videoTileView = this.videoView;
        return videoTileView == null ? createVideoView() : videoTileView;
    }

    public final void bindItem(ProductVO.GalleryItem image) {
        if (image instanceof ProductVO.GalleryItem.ImageItem) {
            ProductVO.GalleryItem.ImageItem imageItem = (ProductVO.GalleryItem.ImageItem) image;
            DeliveryAdultImageView.bind$default(this.imageView, imageItem.getImage().getUrl(), imageItem.getShouldBlur(), null, 4, null);
            ViewExtKt.show(this.imageView);
            VideoTileView videoTileView = this.videoView;
            if (videoTileView != null) {
                customGone(videoTileView);
                return;
            }
            return;
        }
        if (image instanceof ProductVO.GalleryItem.VideoItem) {
            getVideoView().bind((ProductVO.GalleryItem.VideoItem) image);
            customShow(getVideoView());
            ViewExtKt.gone(this.imageView);
        } else {
            VideoTileView videoTileView2 = this.videoView;
            if (videoTileView2 != null) {
                customGone(videoTileView2);
            }
            ViewExtKt.gone(this.imageView);
        }
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return getVideoView().getPlayerView();
    }

    public final void hidePreview() {
        ViewExtKt.gone(this.imageView);
        customShow(getVideoView());
        getVideoView().hidePreview();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(C6915b.c(size * this.ratio), 1073741824));
    }

    public final void onVideoStart() {
        getVideoView().onVideoStart();
    }

    public final void onVideoStop() {
        getVideoView().onVideoStop();
    }

    public final void setRatio(float ratio) {
        if (this.ratio == ratio) {
            return;
        }
        this.ratio = ratio;
        requestLayout();
        this.imageView.requestLayout();
        VideoTileView videoTileView = this.videoView;
        if (videoTileView != null) {
            videoTileView.requestLayout();
        }
    }

    public final void showPreview() {
        ViewExtKt.gone(this.imageView);
        customShow(getVideoView());
        getVideoView().showPreview();
    }

    public /* synthetic */ CsmaSkuImageWrapper(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsmaSkuImageWrapper(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        DeliveryAdultImageView deliveryAdultImageView = new DeliveryAdultImageView(context, null, 0, 6, null);
        deliveryAdultImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        deliveryAdultImageView.setCornerRadius(IMAGE_CORNER_RADIUS);
        this.imageView = deliveryAdultImageView;
        this.ratio = 1.0f;
        addView(deliveryAdultImageView);
    }
}
