package ru.ozon.app.android.universalwidgets.widgets.uw.sku;

import Ax.ViewOnClickListenerC2451a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.imagesswipeview.AdultServerBlurImageView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.VideoTileView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010 \u001a\u00020\u00112\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00110\"J\u0006\u0010$\u001a\u00020\u0011J\u0006\u0010%\u001a\u00020\u0011J\b\u0010&\u001a\u00020\rH\u0002J\b\u0010'\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "videoView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/VideoTileView;", "ratio", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setRatio", "setTileAlpha", "alpha", "bindItem", "galleryItem", "Lru/ozon/app/android/product/common/core/GalleryItem;", "hidePreview", "showPreview", "onVideoStart", "onVideoStop", "getPlayerView", "Landroidx/media3/ui/PlayerView;", "setClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Landroid/view/View;", "show", "gone", "getVideoView", "createVideoView", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuImageWrapper extends FrameLayout {

    @NotNull
    private final AdultServerBlurImageView imageView;
    private float ratio;
    private VideoTileView videoView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkuImageWrapper(@NotNull Context context, AttributeSet attributeSet) {
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

    private final VideoTileView getVideoView() {
        VideoTileView videoTileView = this.videoView;
        return videoTileView == null ? createVideoView() : videoTileView;
    }

    public final void bindItem(GalleryItem galleryItem) {
        if (galleryItem instanceof GalleryItem.ImageItem) {
            this.imageView.bind(((GalleryItem.ImageItem) galleryItem).getImage());
            ViewExtKt.show(this.imageView);
            VideoTileView videoTileView = this.videoView;
            if (videoTileView != null) {
                ViewExtKt.gone(videoTileView);
                return;
            }
            return;
        }
        if (galleryItem instanceof GalleryItem.VideoItem) {
            getVideoView().bind((GalleryItem.VideoItem) galleryItem);
            ViewExtKt.show(getVideoView());
            ViewExtKt.gone(this.imageView);
        } else {
            VideoTileView videoTileView2 = this.videoView;
            if (videoTileView2 != null) {
                ViewExtKt.gone(videoTileView2);
            }
            ViewExtKt.gone(this.imageView);
        }
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return getVideoView().getPlayerView();
    }

    public final void gone() {
        setVisibility(8);
    }

    public final void hidePreview() {
        ViewExtKt.gone(this.imageView);
        ViewExtKt.show(getVideoView());
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

    public final void setClickListener(@NotNull Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnClickListener(new ViewOnClickListenerC2451a(listener, 4));
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

    public final void setTileAlpha(float alpha) {
        setAlpha(alpha);
    }

    public final void show() {
        setVisibility(0);
    }

    public final void showPreview() {
        ViewExtKt.gone(this.imageView);
        ViewExtKt.show(getVideoView());
        getVideoView().showPreview();
    }

    public /* synthetic */ SkuImageWrapper(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuImageWrapper(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AdultServerBlurImageView adultServerBlurImageView = new AdultServerBlurImageView(context, null, 0, 6, null);
        adultServerBlurImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.imageView = adultServerBlurImageView;
        this.ratio = 1.0f;
        addView(adultServerBlurImageView);
    }
}
