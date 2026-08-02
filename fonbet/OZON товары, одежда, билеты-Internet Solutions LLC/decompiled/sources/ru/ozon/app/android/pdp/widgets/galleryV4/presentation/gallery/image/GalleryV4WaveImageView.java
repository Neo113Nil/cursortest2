package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.uni.R$attr;
import y7.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4WaveImageView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "context", "Landroid/content/Context;", "width", "", "height", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "foregroundColor", "backgroundRadius", "", "isUniqueView", "", "<init>", "(Landroid/content/Context;IILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;FZ)V", "imageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "getImageView", "()Lcom/google/android/material/imageview/ShapeableImageView;", "waveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "waveWidth", "bind", "", "containerWidth", "(Ljava/lang/Integer;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4WaveImageView extends FrameLayout implements GalleryV4Utils {

    @NotNull
    private final ShapeableImageView imageView;

    @NotNull
    private final WaveView waveView;
    private final float waveWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4WaveImageView(@NotNull Context context, int i11, int i12, Drawable drawable, Drawable drawable2, float f7, boolean z11) {
        super(context, null, 0);
        Drawable.ConstantState constantState;
        Drawable.ConstantState constantState2;
        Intrinsics.checkNotNullParameter(context, "context");
        float waveWidth = waveWidth(context);
        this.waveWidth = waveWidth;
        setId(R$id.galleryV4ImageWaveV);
        setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
        setBackground(z11 ? (drawable == null || (constantState2 = drawable.getConstantState()) == null) ? null : constantState2.newDrawable() : drawable);
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(ru.ozon.app.android.pdp.ui.configurators.R$id.galleryV4ImageV);
        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
        shapeableImageView.setForeground(z11 ? (drawable2 == null || (constantState = drawable2.getConstantState()) == null) ? null : constantState.newDrawable() : drawable2);
        k.a aVar = new k.a(new k());
        aVar.n(f7);
        aVar.r(f7);
        shapeableImageView.setShapeAppearanceModel(aVar.a());
        this.imageView = shapeableImageView;
        WaveView waveView = new WaveView(context, null, 0, 6, null);
        waveView.setId(R$id.waveV);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, getDp14());
        layoutParams.gravity = 81;
        waveView.setLayoutParams(layoutParams);
        waveView.bind(new WaveModel(waveWidth, R$attr.layerFloor1));
        this.waveView = waveView;
        addViewInLayout(shapeableImageView, 0, shapeableImageView.getLayoutParams());
        addViewInLayout(waveView, 1, waveView.getLayoutParams());
        setMeasuredDimension(i11, i12);
    }

    public final void bind(Integer containerWidth) {
        if (containerWidth != null) {
            if (containerWidth.intValue() != getMeasuredWidth()) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = containerWidth.intValue();
                setLayoutParams(layoutParams);
                WaveView waveView = this.waveView;
                ViewGroup.LayoutParams layoutParams2 = waveView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = containerWidth.intValue();
                waveView.setLayoutParams(layoutParams2);
                this.waveView.bind(new WaveModel(this.waveWidth, R$attr.layerFloor1));
            }
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    public int getDp14() {
        return GalleryV4Utils.DefaultImpls.getDp14(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
    }

    @NotNull
    public final ShapeableImageView getImageView() {
        return this.imageView;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxVerticalStateRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinContainerRatio() {
        return GalleryV4Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    public float waveWidth(@NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.waveWidth(this, context);
    }
}
