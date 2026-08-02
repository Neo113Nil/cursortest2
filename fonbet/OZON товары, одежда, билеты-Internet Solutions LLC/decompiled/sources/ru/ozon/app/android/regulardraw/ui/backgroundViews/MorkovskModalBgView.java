package ru.ozon.app.android.regulardraw.ui.backgroundViews;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0007J\f\u0010!\u001a\u00020\u0015*\u00020\u001fH\u0002J\f\u0010\"\u001a\u00020\u0015*\u00020\u001fH\u0002J<\u0010#\u001a\u00020\u0015*\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020%H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/backgroundViews/MorkovskModalBgView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shadowPaint1", "Landroid/graphics/Paint;", "bgPaint", "rectF", "Landroid/graphics/RectF;", "roundedRectClipPath", "Landroid/graphics/Path;", "getRoundedRectClipPath", "()Landroid/graphics/Path;", "newHeight", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "drawDarkShadow", "drawMainColorRect", "drawRoundedRectShadowWithClipPath", "left", "", "top", "right", "bottom", "paint", "corners", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskModalBgView extends View {

    @NotNull
    private final Paint bgPaint;
    private int newHeight;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Paint shadowPaint1;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float shadowBlurRadius = UiExtKt.toPxF(10.0f);
    private static final float paintWidth = UiExtKt.toPxF(5.0f);
    private static final float cornerRadius = UiExtKt.toPxF(23.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/backgroundViews/MorkovskModalBgView$Companion;", "", "<init>", "()V", "shadowBlurRadius", "", "paintWidth", "cornerRadius", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MorkovskModalBgView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void drawDarkShadow(Canvas canvas) {
        RectF rectF = this.rectF;
        drawRoundedRectShadowWithClipPath(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.shadowPaint1, cornerRadius);
    }

    private final void drawMainColorRect(Canvas canvas) {
        RectF rectF = this.rectF;
        drawRoundedRectShadowWithClipPath(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.bgPaint, cornerRadius);
    }

    private final void drawRoundedRectShadowWithClipPath(Canvas canvas, float f7, float f11, float f12, float f13, Paint paint, float f14) {
        canvas.clipPath(getRoundedRectClipPath());
        canvas.drawRoundRect(f7, f11, f12, f13, f14, f14, paint);
    }

    private final Path getRoundedRectClipPath() {
        Path path = new Path();
        RectF rectF = this.rectF;
        float f7 = cornerRadius;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CCW);
        return path;
    }

    public final void bind(int height) {
        if (height == this.newHeight) {
            return;
        }
        this.newHeight = height;
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawMainColorRect(canvas);
        drawDarkShadow(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.newHeight, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.rectF.set(0.0f, 0.0f, width, height + cornerRadius);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorkovskModalBgView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setMaskFilter(new BlurMaskFilter(shadowBlurRadius, BlurMaskFilter.Blur.NORMAL));
        paint.setColor(UtilKt.parseColor(R$color.modal_shadow_color, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(paintWidth);
        this.shadowPaint1 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(UtilKt.parseColor(R$color.modal_bg_color, context));
        this.bgPaint = paint2;
        this.rectF = new RectF();
        setLayerType(1, null);
    }
}
