package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.video;

import Sc.InterfaceC4008j;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.d;
import androidx.core.content.a;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.GalleryV5VideoPlayerTvViewBinding;
import ru.ozon.app.android.pdp.databinding.GalleryV5VideoPlayerViewBinding;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010\"J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0017\u0010-\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001fR\u0014\u00100\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0018\u00105\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/video/GalleryV5VideoView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "Landroid/content/Context;", "context", "", "width", "height", "Landroid/graphics/drawable/Drawable;", "background", "", "hasWave", "isTextureViewEnabled", "foregroundDrawable", "isUniqueView", "<init>", "(Landroid/content/Context;IILandroid/graphics/drawable/Drawable;ZZLandroid/graphics/drawable/Drawable;Z)V", "", "showProgress", "()V", "hideProgress", "", "previewUrl", "loadPreview", "(Ljava/lang/String;)V", "hidePreview", "containerWidth", "updateParams", "(I)V", "Landroidx/media3/ui/PlayerView;", "createPlayerView", "()Landroidx/media3/ui/PlayerView;", "Landroid/widget/ImageView;", "createPreviewView", "()Landroid/widget/ImageView;", "Landroidx/core/widget/ContentLoadingProgressBar;", "createLoaderView", "()Landroidx/core/widget/ContentLoadingProgressBar;", "createParanjaView", "Lru/ozon/app/android/product/common/wave/WaveView;", "createWaveView", "(Z)Lru/ozon/app/android/product/common/wave/WaveView;", "I", "Z", "Landroid/graphics/drawable/Drawable;", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "previewIv", "Landroid/widget/ImageView;", "loader", "Landroidx/core/widget/ContentLoadingProgressBar;", "paranjaView", "waveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "", "waveWidth$delegate", "LSc/j;", "getWaveWidth", "()F", "waveWidth", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV5VideoView extends FrameLayout implements GalleryV5Utils {
    private final Drawable foregroundDrawable;
    private final int height;
    private boolean isTextureViewEnabled;
    private final boolean isUniqueView;

    @NotNull
    private final ContentLoadingProgressBar loader;

    @NotNull
    private final ImageView paranjaView;

    @NotNull
    private final PlayerView playerView;

    @NotNull
    private final ImageView previewIv;
    private WaveView waveView;

    /* renamed from: waveWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveWidth;
    private final int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5VideoView(@NotNull Context context, int i11, int i12, Drawable drawable, boolean z11, boolean z12, Drawable drawable2, boolean z13) {
        super(context);
        Drawable.ConstantState constantState;
        Intrinsics.checkNotNullParameter(context, "context");
        this.width = i11;
        this.height = i12;
        this.isTextureViewEnabled = z12;
        this.foregroundDrawable = drawable2;
        this.isUniqueView = z13;
        this.waveWidth = LazyUtilsKt.unsafeLazy(new GalleryV5VideoView$waveWidth$2(this, context));
        setId(R$id.galleryV5VideoV);
        setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
        setClipToOutline(true);
        setBackground(z13 ? (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable() : drawable);
        PlayerView createPlayerView = createPlayerView();
        this.playerView = createPlayerView;
        ImageView createPreviewView = createPreviewView();
        this.previewIv = createPreviewView;
        ContentLoadingProgressBar createLoaderView = createLoaderView();
        this.loader = createLoaderView;
        ImageView createParanjaView = createParanjaView();
        this.paranjaView = createParanjaView;
        this.waveView = createWaveView(z11);
        addViewInLayout(createPlayerView, 0, createPlayerView.getLayoutParams());
        addViewInLayout(createPreviewView, 1, createPreviewView.getLayoutParams());
        addViewInLayout(createLoaderView, 2, createLoaderView.getLayoutParams());
        addViewInLayout(createParanjaView, 3, createParanjaView.getLayoutParams());
        WaveView waveView = this.waveView;
        if (waveView != null) {
            addViewInLayout(waveView, 4, waveView.getLayoutParams());
        }
        setMeasuredDimension(i11, i12);
        requestLayout();
    }

    private final ContentLoadingProgressBar createLoaderView() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.progressBarStyleInverse, typedValue, true);
        ContentLoadingProgressBar contentLoadingProgressBar = new ContentLoadingProgressBar(new d(getContext(), typedValue.resourceId), null);
        contentLoadingProgressBar.setId(R$id.loaderV);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getDp56(), getDp56());
        layoutParams.gravity = 17;
        contentLoadingProgressBar.setLayoutParams(layoutParams);
        return contentLoadingProgressBar;
    }

    private final ImageView createParanjaView() {
        Drawable drawable;
        Drawable.ConstantState constantState;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.paranjaView);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(this.width, this.height));
        if (this.isUniqueView) {
            Drawable drawable2 = this.foregroundDrawable;
            drawable = (drawable2 == null || (constantState = drawable2.getConstantState()) == null) ? null : constantState.newDrawable();
        } else {
            drawable = this.foregroundDrawable;
        }
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    private final PlayerView createPlayerView() {
        PlayerView root = this.isTextureViewEnabled ? GalleryV5VideoPlayerTvViewBinding.inflate(LayoutInflater.from(getContext()), this, false).getRoot() : GalleryV5VideoPlayerViewBinding.inflate(LayoutInflater.from(getContext()), this, false).getRoot();
        Intrinsics.f(root);
        root.setId(R$id.playerV);
        root.setLayoutParams(new FrameLayout.LayoutParams(this.width, this.height));
        root.C(0);
        root.E();
        root.D(a.getColor(root.getContext(), R$color.bg_light_key));
        root.setTag(ru.ozon.app.android.R.id.tag_key_widget_name, "pdp.galleryPreview");
        return root;
    }

    private final ImageView createPreviewView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.galleryV5VideoPreviewIV);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(this.width, this.height));
        return imageView;
    }

    private final WaveView createWaveView(boolean hasWave) {
        if (!hasWave) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WaveView waveView = new WaveView(context, null, 0, 6, null);
        waveView.setId(R$id.waveV);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.width, getDp14());
        layoutParams.gravity = 81;
        waveView.setLayoutParams(layoutParams);
        waveView.bind(new WaveModel(getWaveWidth(), R$attr.layerFloor1));
        return waveView;
    }

    private final float getWaveWidth() {
        return ((Number) this.waveWidth.getValue()).floatValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    public int getDp14() {
        return GalleryV5Utils.DefaultImpls.getDp14(this);
    }

    public int getDp56() {
        return GalleryV5Utils.DefaultImpls.getDp56(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxVerticalStateRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinContainerRatio() {
        return GalleryV5Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    public final void hidePreview() {
        ViewExtKt.gone(this.previewIv);
    }

    public final void hideProgress() {
        this.loader.c();
    }

    public final void loadPreview(@NotNull String previewUrl) {
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        ImageViewExtKt.loadImageOrGone(this.previewIv, previewUrl);
    }

    public final void showProgress() {
        this.loader.d();
    }

    public final void updateParams(int containerWidth) {
        if (getMeasuredWidth() != containerWidth) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = containerWidth;
            setLayoutParams(layoutParams);
        }
    }

    public float waveWidth(@NotNull Context context) {
        return GalleryV5Utils.DefaultImpls.waveWidth(this, context);
    }
}
