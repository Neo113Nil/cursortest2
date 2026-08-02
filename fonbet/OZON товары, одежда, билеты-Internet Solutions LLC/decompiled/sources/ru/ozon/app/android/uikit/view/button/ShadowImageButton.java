package ru.ozon.app.android.uikit.view.button;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0014\u0010\u001d\u001a\u00020\u0007*\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/uikit/view/button/ShadowImageButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rectF", "Landroid/graphics/RectF;", "borderRectF", "clipPath", "Landroid/graphics/Path;", "backgroundPaint", "Landroid/graphics/Paint;", "shadowLightPaint", "shadowDarkPaint", "borderPaint", "onSizeChanged", "", "width", "height", "oldwidth", "oldheight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "parseColor", "", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShadowImageButton extends AppCompatImageView {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float borderWidth;
    private static final float cornerRadius;
    private static final float shadowBlur;
    private static final float shadowCornerRadius;
    private static final float shadowOffset;
    private static final float shadowStrokeWidth;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private final RectF borderRectF;

    @NotNull
    private final Path clipPath;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Paint shadowDarkPaint;

    @NotNull
    private final Paint shadowLightPaint;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/uikit/view/button/ShadowImageButton$Companion;", "", "<init>", "()V", "", "INNER_SHADOW_LIGHT", "Ljava/lang/String;", "INNER_SHADOW_DARK", "BORDER_COLOR", "BACKGROUND_COLOR", "DEFAULT_COLOR", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float pxF = ResourceExtKt.toPxF(16);
        cornerRadius = pxF;
        shadowCornerRadius = pxF * 1.1f;
        shadowBlur = ResourceExtKt.toPxF(5);
        shadowStrokeWidth = ResourceExtKt.toPxF(6);
        shadowOffset = ResourceExtKt.toPxF(6);
        borderWidth = ResourceExtKt.toPxF(3) / 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowImageButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int parseColor(String str, Context context) {
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, str);
        return parseColor != null ? parseColor.intValue() : Color.parseColor("#000000");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.clipPath);
        RectF rectF = this.borderRectF;
        float f7 = cornerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.backgroundPaint);
        float f11 = borderWidth;
        RectF rectF2 = this.borderRectF;
        float f12 = rectF2.left + f11;
        float f13 = shadowOffset;
        float f14 = (rectF2.top + f11) - f13;
        float f15 = rectF2.right - f11;
        float f16 = rectF2.bottom - f11;
        float f17 = shadowCornerRadius;
        canvas.drawRoundRect(f12 - f13, f14, f15, f16, f17, f17, this.shadowDarkPaint);
        RectF rectF3 = this.borderRectF;
        canvas.drawRoundRect(rectF3.left + f11, rectF3.top + f11, (rectF3.right - f11) + f13, (rectF3.bottom - f11) + f13, f17, f17, this.shadowLightPaint);
        canvas.restore();
        canvas.drawRoundRect(this.borderRectF, f7, f7, this.borderPaint);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldwidth, int oldheight) {
        super.onSizeChanged(width, height, oldwidth, oldheight);
        this.rectF.set(0.0f, 0.0f, width, height);
        float f7 = borderWidth / 2;
        RectF rectF = this.borderRectF;
        RectF rectF2 = this.rectF;
        rectF.set(rectF2.left + f7, rectF2.top + f7, rectF2.right - f7, rectF2.bottom - f7);
        this.clipPath.reset();
        Path path = this.clipPath;
        RectF rectF3 = this.borderRectF;
        float f11 = cornerRadius;
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
    }

    public /* synthetic */ ShadowImageButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowImageButton(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rectF = new RectF();
        this.borderRectF = new RectF();
        this.clipPath = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(parseColor("#4D483D68", context));
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        float f7 = shadowStrokeWidth;
        paint2.setStrokeWidth(f7);
        paint2.setColor(parseColor("#73FFCEE8", context));
        float f11 = shadowBlur;
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint2.setMaskFilter(new BlurMaskFilter(f11, blur));
        this.shadowLightPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f7);
        paint3.setColor(parseColor("#B2C1317B", context));
        paint3.setMaskFilter(new BlurMaskFilter(f11, blur));
        this.shadowDarkPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(borderWidth);
        paint4.setColor(parseColor("#802A2A36", context));
        this.borderPaint = paint4;
        setWillNotDraw(false);
        setLayerType(1, null);
        setBackgroundColor(0);
    }
}
