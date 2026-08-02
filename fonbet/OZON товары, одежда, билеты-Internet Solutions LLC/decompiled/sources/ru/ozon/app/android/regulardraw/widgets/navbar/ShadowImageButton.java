package ru.ozon.app.android.regulardraw.widgets.navbar;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJC\u0010\u0018\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006/"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "", "drawDarkShadow", "(Landroid/graphics/Canvas;)V", "drawLightShadow", "drawMainColorRect", "", "left", "top", "right", "bottom", "Landroid/graphics/Paint;", "paint", "corners", "drawRoundedRectShadowWithClipPath", "(Landroid/graphics/Canvas;FFFFLandroid/graphics/Paint;F)V", "canvas", "onDraw", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "Landroid/graphics/BlurMaskFilter;", "blurMaskFilter$delegate", "LSc/j;", "getBlurMaskFilter", "()Landroid/graphics/BlurMaskFilter;", "blurMaskFilter", "Landroid/graphics/Path;", "roundedRectClipPath$delegate", "getRoundedRectClipPath", "()Landroid/graphics/Path;", "roundedRectClipPath", "bgPaint", "Landroid/graphics/Paint;", "shadowPaintLeft", "shadowPaintRight", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShadowImageButton extends AppCompatImageView {
    private static final float cornerRadius;
    private static final float shadowBlurRadius;
    private static final float shadowBlurWidth;
    private static final float shadowCornerRadius;
    private static final int shadowOffset;

    @NotNull
    private final Paint bgPaint;

    /* renamed from: blurMaskFilter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j blurMaskFilter;

    @NotNull
    private final RectF rectF;

    /* renamed from: roundedRectClipPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j roundedRectClipPath;

    @NotNull
    private final Paint shadowPaintLeft;

    @NotNull
    private final Paint shadowPaintRight;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton$Companion;", "", "<init>", "()V", "", "cornerRadius", "F", "getCornerRadius", "()F", "shadowBlurRadius", "getShadowBlurRadius", "", "SHADOW_LEFT", "Ljava/lang/String;", "SHADOW_RIGHT", "BG_COLOR", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCornerRadius() {
            return ShadowImageButton.cornerRadius;
        }

        public final float getShadowBlurRadius() {
            return ShadowImageButton.shadowBlurRadius;
        }

        private Companion() {
        }
    }

    static {
        float pxF = ResourceExtKt.toPxF(14);
        cornerRadius = pxF;
        shadowCornerRadius = pxF * 1.1f;
        shadowBlurRadius = ResourceExtKt.toPxF(3);
        shadowBlurWidth = ResourceExtKt.toPxF(5);
        shadowOffset = ResourceExtKt.toPx(6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowImageButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawDarkShadow(Canvas canvas) {
        RectF rectF = this.rectF;
        float f7 = rectF.left;
        int i11 = shadowOffset;
        drawRoundedRectShadowWithClipPath(canvas, f7 - i11, rectF.top - i11, rectF.right, rectF.bottom, this.shadowPaintRight, shadowCornerRadius);
    }

    private final void drawLightShadow(Canvas canvas) {
        RectF rectF = this.rectF;
        float f7 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        int i11 = shadowOffset;
        drawRoundedRectShadowWithClipPath(canvas, f7, f11, i11 + f12, rectF.bottom + i11, this.shadowPaintLeft, shadowCornerRadius);
    }

    private final void drawMainColorRect(Canvas canvas) {
        RectF rectF = this.rectF;
        drawRoundedRectShadowWithClipPath(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.bgPaint, cornerRadius);
    }

    private final void drawRoundedRectShadowWithClipPath(Canvas canvas, float f7, float f11, float f12, float f13, Paint paint, float f14) {
        canvas.clipPath(getRoundedRectClipPath());
        canvas.drawRoundRect(f7, f11, f12, f13, f14, f14, paint);
    }

    private final BlurMaskFilter getBlurMaskFilter() {
        return (BlurMaskFilter) this.blurMaskFilter.getValue();
    }

    private final Path getRoundedRectClipPath() {
        return (Path) this.roundedRectClipPath.getValue();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        drawMainColorRect(canvas);
        drawLightShadow(canvas);
        drawDarkShadow(canvas);
        super.onDraw(canvas);
    }

    public /* synthetic */ ShadowImageButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowImageButton(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rectF = new RectF();
        this.blurMaskFilter = k.b(ShadowImageButton$blurMaskFilter$2.INSTANCE);
        this.roundedRectClipPath = k.b(new ShadowImageButton$roundedRectClipPath$2(this));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(UtilKt.parseColor("#190684", context));
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setMaskFilter(getBlurMaskFilter());
        paint2.setColor(UtilKt.parseColor("#5C5D40FF", context));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        float f7 = shadowBlurWidth;
        paint2.setStrokeWidth(f7);
        this.shadowPaintLeft = paint2;
        Paint paint3 = new Paint(1);
        paint3.setMaskFilter(getBlurMaskFilter());
        paint3.setColor(UtilKt.parseColor("#B2080023", context));
        paint3.setStyle(style);
        paint3.setStrokeWidth(f7);
        this.shadowPaintRight = paint3;
        setWillNotDraw(false);
        setLayerType(1, null);
    }
}
