package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J5\u0010%\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R*\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010(\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u0014\u00107\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u00108\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R\u0014\u00109\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006H"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponDrawable;", "Landroid/graphics/drawable/PaintDrawable;", "Landroid/content/Context;", "context", "", "defaultBackgroundColor", "", "isStub", "<init>", "(Landroid/content/Context;IZ)V", "Landroid/graphics/Canvas;", "", "drawRoundedRect", "(Landroid/graphics/Canvas;)V", "drawPerforation", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;", "gradientDirection", "", "colors", "", "width", "height", "offsetX", "Landroid/graphics/Shader;", "createShader", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;[IFFF)Landroid/graphics/Shader;", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "canvas", "draw", "backgroundColor", "bindSolidBackground", "(I)V", "parentWidth", "parentHeight", "bindGradientBackground", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;[IIII)V", "I", "Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isApplied", "()Z", "setApplied", "(Z)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "eraser", "tearLineWidth", "F", "cornerRadius", "bigRadius", "smallRadius", "bigSpacing", "smallSpacing", "offset", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "", "radii", "[F", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "getStubRadii", "()[F", "stubRadii", "getCouponRadii", "couponRadii", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCouponDrawable extends PaintDrawable {
    private final float bigRadius;
    private final float bigSpacing;
    private final float cornerRadius;
    private final int defaultBackgroundColor;

    @NotNull
    private final Paint eraser;
    private boolean isApplied;
    private final boolean isStub;
    private final float offset;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final float[] radii;

    @NotNull
    private RectF rect;
    private final float smallRadius;
    private final float smallSpacing;
    private final float tearLineWidth;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticCouponListBackground.GradientDirection.values().length];
            try {
                iArr[StaticCouponListBackground.GradientDirection.LEFT_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.RIGHT_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.TOP_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.BOTTOM_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.TOP_RIGHT_LEFT_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StaticCouponListBackground.GradientDirection.BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StaticCouponListCouponDrawable(@NotNull Context context, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBackgroundColor = i11;
        this.isStub = z11;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(i11);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.eraser = paint2;
        this.tearLineWidth = ResourceExtKt.toPxF(1, context);
        this.cornerRadius = ResourceExtKt.toPxF(16, context);
        this.bigRadius = ResourceExtKt.toPxF(10, context);
        this.smallRadius = ResourceExtKt.toPxF(3, context);
        this.bigSpacing = ResourceExtKt.toPxF(6, context);
        this.smallSpacing = ResourceExtKt.toPxF(4, context);
        this.offset = ResourceExtKt.toPxF(6, context);
        this.rect = new RectF(getBounds());
        this.radii = z11 ? getStubRadii() : getCouponRadii();
        this.path = new Path();
    }

    private final Shader createShader(StaticCouponListBackground.GradientDirection gradientDirection, int[] colors, float width, float height, float offsetX) {
        float f7;
        float f11;
        float f12;
        float f13;
        switch (WhenMappings.$EnumSwitchMapping$0[gradientDirection.ordinal()]) {
            case 1:
                f7 = -offsetX;
                f11 = width - offsetX;
                f12 = 0.0f;
                f13 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 2:
                f11 = -offsetX;
                f7 = width - offsetX;
                f12 = 0.0f;
                f13 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 3:
                f13 = height;
                f7 = 0.0f;
                f12 = 0.0f;
                f11 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 4:
                f12 = height;
                f7 = 0.0f;
                f11 = 0.0f;
                f13 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 5:
                f7 = -offsetX;
                f11 = width - offsetX;
                f13 = height;
                f12 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 6:
                f11 = -offsetX;
                f7 = width - offsetX;
                f12 = height;
                f13 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 7:
                f11 = -offsetX;
                f7 = width - offsetX;
                f13 = height;
                f12 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            case 8:
                f7 = -offsetX;
                f11 = width - offsetX;
                f12 = height;
                f13 = 0.0f;
                return new LinearGradient(f7, f12, f11, f13, colors, (float[]) null, Shader.TileMode.CLAMP);
            default:
                throw new o();
        }
    }

    private final void drawPerforation(Canvas canvas) {
        RectF rectF;
        float f7;
        float f11 = this.isStub ? this.rect.left : this.rect.right;
        canvas.drawCircle(f11, this.rect.top - this.offset, this.bigRadius, this.eraser);
        canvas.drawCircle(f11, this.rect.bottom + this.offset, this.bigRadius, this.eraser);
        float f12 = (this.bigRadius - this.offset) + this.rect.top + this.bigSpacing;
        float f13 = this.smallRadius;
        while (true) {
            f12 += f13;
            rectF = this.rect;
            f7 = rectF.bottom;
            if (f12 >= ((f7 - this.bigRadius) + this.offset) - this.bigSpacing) {
                break;
            }
            canvas.drawCircle(f11, f12, this.smallRadius, this.eraser);
            f13 = (this.smallRadius * 2) + this.smallSpacing;
        }
        if (this.isApplied) {
            float f14 = this.tearLineWidth;
            canvas.drawRect(f11 - f14, rectF.top, f11 + f14, f7, this.eraser);
        }
    }

    private final void drawRoundedRect(Canvas canvas) {
        canvas.drawPath(this.path, this.paint);
    }

    private final float[] getCouponRadii() {
        float f7 = this.cornerRadius;
        return new float[]{f7, f7, 0.0f, 0.0f, 0.0f, 0.0f, f7, f7};
    }

    private final float[] getStubRadii() {
        float f7 = this.cornerRadius;
        return new float[]{0.0f, 0.0f, f7, f7, f7, f7, 0.0f, 0.0f};
    }

    public final void bindGradientBackground(@NotNull StaticCouponListBackground.GradientDirection gradientDirection, @NotNull int[] colors, int parentWidth, int parentHeight, int offsetX) {
        Intrinsics.checkNotNullParameter(gradientDirection, "gradientDirection");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.paint.setShader(createShader(gradientDirection, colors, parentWidth, parentHeight, offsetX));
        invalidateSelf();
    }

    public final void bindSolidBackground(int backgroundColor) {
        this.paint.setColor(backgroundColor);
        this.paint.setShader(null);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int saveLayer = canvas.saveLayer(this.rect, null);
        drawRoundedRect(canvas);
        drawPerforation(canvas);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        RectF rectF = new RectF(bounds);
        this.rect = rectF;
        this.path.addRoundRect(0.0f, 0.0f, rectF.right, rectF.bottom, this.radii, Path.Direction.CW);
    }

    public final void setApplied(boolean z11) {
        this.isApplied = z11;
        invalidateSelf();
    }
}
