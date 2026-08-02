package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views;

import Nx.ViewOnClickListenerC3676a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ay.ViewOnClickListenerC5491a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.models.MediaImageStickerVO;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0014J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0014J0\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0014\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\r0\u000bH\u0016J$\u0010)\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r0\u000bJ\b\u0010-\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryItemView;", "Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;", "context", "Landroid/content/Context;", "playerPreloader", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "iconPlayBitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/preload/PlayerPreloader;Landroid/graphics/Bitmap;)V", "preCreatePlayer", "Lkotlin/Function1;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "", "iconTop", "", "iconLeft", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isPlayIconVisible", "setPlayIconVisible", "(Z)V", "mediaImageStickerView", "Lru/ozon/uni/android/atom/image/Image;", "onLayout", "changed", "left", "", "top", "right", "bottom", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "bindMedia", "item", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "mediaPreviewCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "openDeeplink", "", "bindSticker", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;", "onAction", "Lru/ozon/uni/atoms/af/AtomAction;", "requireMediaImageStickerView", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class SingleReviewGalleryItemView extends StatusableMediaPreviewView {
    private float iconLeft;

    @NotNull
    private final Bitmap iconPlayBitmap;
    private float iconTop;
    private boolean isPlayIconVisible;
    private Image mediaImageStickerView;

    @NotNull
    private final Function1<PreloadVideoInfo, Unit> preCreatePlayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewGalleryItemView(@NotNull Context context, @NotNull PlayerPreloader playerPreloader, @NotNull Bitmap iconPlayBitmap) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(iconPlayBitmap, "iconPlayBitmap");
        this.iconPlayBitmap = iconPlayBitmap;
        this.preCreatePlayer = new SingleReviewGalleryItemView$preCreatePlayer$1(playerPreloader);
        setParandjaForDarkTheme();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMedia$lambda$0(MediaVO mediaVO, SingleReviewGalleryItemView singleReviewGalleryItemView, Function1 function1, View view) {
        PreloadVideoInfo videoInfo;
        MediaVO.MediaType type = mediaVO.getType();
        MediaVO.MediaType.VIDEO video = type instanceof MediaVO.MediaType.VIDEO ? (MediaVO.MediaType.VIDEO) type : null;
        if (video != null && (videoInfo = video.getVideoInfo()) != null) {
            singleReviewGalleryItemView.preCreatePlayer.invoke(videoInfo);
        }
        function1.invoke(mediaVO.getDeeplink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSticker$lambda$2$lambda$1(MediaImageStickerVO mediaImageStickerVO, Function1 function1, View view) {
        AtomAction clickAction = mediaImageStickerVO.getClickAction();
        if (clickAction != null) {
            function1.invoke(clickAction);
        }
    }

    private final Image requireMediaImageStickerView() {
        Image image = this.mediaImageStickerView;
        if (image != null) {
            return image;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Image image2 = new Image(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDP_8();
        layoutParams.leftMargin = dimens.getDP_8();
        image2.setLayoutParams(layoutParams);
        this.mediaImageStickerView = image2;
        addView(image2);
        return image2;
    }

    private final void setPlayIconVisible(boolean z11) {
        if (z11 != this.isPlayIconVisible) {
            this.isPlayIconVisible = z11;
            invalidate();
        }
    }

    public void bindMedia(@NotNull MediaVO item, CornerRadius mediaPreviewCornerRadius, @NotNull Function1<? super String, Unit> openDeeplink) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        StatusableMediaPreviewView.bind$default(this, item, null, mediaPreviewCornerRadius, 2, null);
        setPlayIconVisible(item.getType() instanceof MediaVO.MediaType.VIDEO);
        setOnClickListener(new ViewOnClickListenerC5491a(item, this, openDeeplink, 2));
    }

    public final void bindSticker(MediaImageStickerVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (item != null) {
            Image requireMediaImageStickerView = requireMediaImageStickerView();
            ImageHolderKt.bindOrGone(requireMediaImageStickerView, item.getImage(), onAction);
            requireMediaImageStickerView.setOnClickListener(new ViewOnClickListenerC3676a(5, item, onAction));
        } else {
            Image image = this.mediaImageStickerView;
            if (image != null) {
                ViewExtKt.gone(image);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.isPlayIconVisible) {
            canvas.drawBitmap(this.iconPlayBitmap, this.iconLeft, this.iconTop, (Paint) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.iconTop = (getHeight() / 2.0f) - (this.iconPlayBitmap.getHeight() / 2.0f);
        this.iconLeft = (getWidth() / 2.0f) - (this.iconPlayBitmap.getWidth() / 2.0f);
    }
}
