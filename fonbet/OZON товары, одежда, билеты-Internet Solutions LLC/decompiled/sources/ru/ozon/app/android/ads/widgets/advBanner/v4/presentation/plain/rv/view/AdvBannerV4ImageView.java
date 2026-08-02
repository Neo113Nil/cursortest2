package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.presentation.CornerMaxRadius;
import ru.ozon.app.android.ads.presentation.CustomRoundViewCornersDelegate;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4ImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "cornerColor", "setCornerColor", "(I)V", "", "topRadius", "bottomRadius", "setRadius", "(FF)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "ratio", "F", "getRatio", "()F", "setRatio", "(F)V", "defaultRadiusPx", "Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate;", "customRoundViewCornersDelegate", "Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4ImageView extends AppCompatImageView {

    @NotNull
    private final CustomRoundViewCornersDelegate customRoundViewCornersDelegate;
    private final float defaultRadiusPx;
    private float ratio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvBannerV4ImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ratio = 1.0f;
        float pxF = ResourceExtKt.toPxF(8, context);
        this.defaultRadiusPx = pxF;
        CustomRoundViewCornersDelegate customRoundViewCornersDelegate = new CustomRoundViewCornersDelegate(context, pxF, pxF, pxF, pxF);
        this.customRoundViewCornersDelegate = customRoundViewCornersDelegate;
        customRoundViewCornersDelegate.init(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.customRoundViewCornersDelegate.drawRoundCorners(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(C6915b.c(size * this.ratio), 1073741824));
        this.customRoundViewCornersDelegate.setupBackgroundRect(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setCornerColor(int cornerColor) {
        this.customRoundViewCornersDelegate.setCornerColor(cornerColor);
    }

    public final void setRadius(float topRadius, float bottomRadius) {
        CustomRoundViewCornersDelegate customRoundViewCornersDelegate = this.customRoundViewCornersDelegate;
        CornerMaxRadius cornerMaxRadius = CornerMaxRadius.INSTANCE;
        if (customRoundViewCornersDelegate.m484setCornerRadiuswt40F6U(new CustomRoundViewCornersDelegate.CornerRadius(Float.valueOf(cornerMaxRadius.getRadius(topRadius)), Float.valueOf(cornerMaxRadius.getRadius(bottomRadius))))) {
            invalidate();
        }
    }

    public final void setRatio(float f7) {
        if (this.ratio == f7) {
            return;
        }
        this.ratio = f7;
        requestLayout();
    }
}
