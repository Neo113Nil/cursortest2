package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R.\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\f¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4ViewFl;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;", "image", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "imageSizes", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;)V", "Lru/ozon/app/android/product/common/wave/WaveView;", "createWaveView", "()Lru/ozon/app/android/product/common/wave/WaveView;", "", "isSelected", "", "bindWaveView", "(Z)V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "item", "isBindImage", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;Z)V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "Landroid/view/View;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "overlayView", "Landroid/view/View;", "getOverlayView", "()Landroid/view/View;", "setOverlayView", "(Landroid/view/View;)V", "waveView$delegate", "LSc/j;", "getWaveView", "waveView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class ImageAspectV4ViewFl extends FrameLayout {

    @NotNull
    private final ImageAspectV4View image;

    @NotNull
    private final AspectsV4ImageConst imageSizes;
    private View overlayView;

    /* renamed from: waveView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAspectV4ViewFl(@NotNull Context context, @NotNull ImageAspectV4View image, @NotNull AspectsV4ImageConst imageSizes) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(imageSizes, "imageSizes");
        this.image = image;
        this.imageSizes = imageSizes;
        this.waveView = DelegatesKt.lazyUnsafe(new ImageAspectV4ViewFl$special$$inlined$lazyView$1(this, this));
        setId(R$id.aspectVariantRoot);
        setClipChildren(false);
        addView(image);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindWaveView(boolean isSelected) {
        WaveView waveView = getWaveView();
        ViewGroup.LayoutParams layoutParams = waveView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            AspectsV4ImageConst aspectsV4ImageConst = this.imageSizes;
            marginLayoutParams.width = isSelected ? aspectsV4ImageConst.getWaveWithBorderWidth() : aspectsV4ImageConst.getImageWidth();
            AspectsV4ImageConst aspectsV4ImageConst2 = this.imageSizes;
            marginLayoutParams.height = isSelected ? aspectsV4ImageConst2.getWaveWithBorderHeight() : aspectsV4ImageConst2.getWaveHeight();
            marginLayoutParams.bottomMargin = isSelected ? this.imageSizes.getImageBorderWidth() : 0;
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = waveView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = waveView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = waveView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            waveView.setLayoutParams(marginLayoutParams);
        }
        WaveView waveView2 = getWaveView();
        AspectsV4ImageConst aspectsV4ImageConst3 = this.imageSizes;
        waveView2.bind(new WaveModel(isSelected ? aspectsV4ImageConst3.getSingleWaveWithBorderWidth() : aspectsV4ImageConst3.getSingleWaveWidth(), isSelected ? R$attr.layerFloor2 : R$attr.layerFloor1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WaveView createWaveView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WaveView waveView = new WaveView(context, null, 0, 6, null);
        waveView.setId(R$id.waveV);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.imageSizes.getWaveHeight());
        layoutParams.gravity = 81;
        waveView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.imageSizes.getImageRadius());
        waveView.setBackground(gradientDrawable);
        waveView.setClipToOutline(true);
        return waveView;
    }

    private final WaveView getWaveView() {
        return (WaveView) this.waveView.getValue();
    }

    public final void bind(@NotNull AspectsV4ImageVO.Variant item, boolean isBindImage) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.image.bind(item, isBindImage);
        ViewExtKt.showOrGone(getWaveView(), Boolean.valueOf(item.getIsWave()));
        if (item.getIsWave()) {
            bindWaveView(item.getIsSelected());
        }
    }

    public final void setOverlayView(View view) {
        View view2 = this.overlayView;
        if (view2 != null) {
            removeView(view2);
        }
        this.overlayView = view;
        addView(view);
    }
}
