package ru.ozon.app.android.marketing.common.view;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$color;
import ru.ozon.app.android.marketing.databinding.ViewGradientCouponBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010\u000eJ\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b,\u0010'J\u0017\u0010-\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b-\u0010'J\u001d\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00103R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00103R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010P\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bP\u0010R\"\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lru/ozon/app/android/marketing/common/view/GradientCouponView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "drawDivider", "(Landroid/graphics/Canvas;)V", "drawProgressGradient", "makeRightPartApplied", "drawDefaultDivider", "setAppliedPartBounds", "()V", "drawAppliedDivider", "", "width", "height", "", "getGradientCoordinates", "(FF)[F", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "dispatchDraw", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "dto", "bindApplyText", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "color", "bindAppliedColor", "(Ljava/lang/String;)V", "bindCodeText", "bindSubtitleText", "startColor", "endColor", "setGradient", "(Ljava/lang/String;Ljava/lang/String;)V", "dp1", "I", "dp2", "Landroid/graphics/RectF;", "fillRectBounds", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "fillPath", "Landroid/graphics/Path;", "fillRadius", "F", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "fillPaint", "gradientColorStart", "gradientColorEnd", "Landroid/graphics/drawable/PaintDrawable;", "gradientBackground", "Landroid/graphics/drawable/PaintDrawable;", "Lru/ozon/app/android/marketing/databinding/ViewGradientCouponBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/ViewGradientCouponBinding;", "corners", "[F", "getCorners", "()[F", "setCorners", "([F)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isApplied", "Z", "()Z", "setApplied", "(Z)V", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GradientCouponView extends LinearLayout {

    @NotNull
    private ViewGradientCouponBinding binding;

    @NotNull
    private float[] corners;

    @NotNull
    private final Paint dividerPaint;
    private final int dp1;
    private final int dp2;

    @NotNull
    private final Paint fillPaint;

    @NotNull
    private final Path fillPath;
    private float fillRadius;

    @NotNull
    private final RectF fillRectBounds;

    @NotNull
    private final PaintDrawable gradientBackground;
    private int gradientColorEnd;
    private int gradientColorStart;
    private boolean isApplied;
    public static final int $stable = 8;
    private static final float DOT_RADIUS = ResourceExtKt.toPxF(3);
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(12);
    private static final int VERTICAL_SHIFT = ResourceExtKt.toPx(9);
    private static final int MARGIN_RIGHT = ResourceExtKt.toPx(24);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCouponView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawAppliedDivider(Canvas canvas) {
        int width = getWidth() - this.binding.gradientCouponApplyTV.getMeasuredWidth();
        int i11 = this.dp1;
        float f7 = 2;
        float width2 = getWidth() / f7;
        float height = getHeight() / f7;
        Path path = new Path();
        RectF rectF = new RectF();
        while (true) {
            int measuredHeight = getMeasuredHeight();
            int i12 = VERTICAL_SHIFT;
            if (i11 >= measuredHeight + i12) {
                break;
            }
            float f11 = DOT_RADIUS;
            path.addCircle(width2, height, f11, Path.Direction.CW);
            float f12 = width;
            float f13 = i11;
            rectF.set(f12 - f11, f13 - f11, f12 + f11, f13 + f11);
            canvas.drawArc(rectF, 45.0f, 275.0f, false, this.dividerPaint);
            i11 += i12;
        }
        int i13 = width + this.dp2;
        int px = ResourceExtKt.toPx(5.5d);
        while (true) {
            int measuredHeight2 = getMeasuredHeight();
            int i14 = VERTICAL_SHIFT;
            if (px >= measuredHeight2 + i14) {
                return;
            }
            float f14 = DOT_RADIUS;
            path.addCircle(width2, height, f14, Path.Direction.CW);
            float f15 = i13;
            float f16 = px;
            rectF.set(f15 - f14, f16 - f14, f15 + f14, f16 + f14);
            canvas.drawArc(rectF, 135.0f, -270.0f, false, this.dividerPaint);
            px += i14;
        }
    }

    private final void drawDefaultDivider(Canvas canvas) {
        float width = getWidth() - this.binding.gradientCouponApplyTV.getMeasuredWidth();
        float f7 = this.dp1;
        while (true) {
            int measuredHeight = getMeasuredHeight();
            int i11 = VERTICAL_SHIFT;
            if (f7 >= measuredHeight + i11) {
                return;
            }
            canvas.drawCircle(width, f7, DOT_RADIUS, this.dividerPaint);
            f7 += i11;
        }
    }

    private final void drawDivider(Canvas canvas) {
        if (this.isApplied) {
            drawAppliedDivider(canvas);
        } else {
            drawDefaultDivider(canvas);
        }
    }

    private final void drawProgressGradient(Canvas canvas) {
        this.gradientBackground.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[] getGradientCoordinates(float width, float height) {
        float radians = (float) Math.toRadians(-80.0d);
        double d11 = 2;
        float f7 = 2;
        float abs = Math.abs(((float) Math.cos((3.1415927f - radians) - ((float) Math.acos(width / r1)))) * ((float) Math.sqrt(((float) Math.pow(width, d11)) + ((float) Math.pow(height, d11))))) / f7;
        double d12 = radians;
        float cos = ((float) Math.cos(d12)) * abs;
        float sin = abs * ((float) Math.sin(d12));
        float f11 = width / f7;
        float f12 = height / f7;
        return new float[]{f11 - cos, f12 + sin, f11 + cos, f12 - sin};
    }

    private final void makeRightPartApplied(Canvas canvas) {
        canvas.drawPath(this.fillPath, this.fillPaint);
    }

    private final void setAppliedPartBounds() {
        ViewGradientCouponBinding viewGradientCouponBinding = this.binding;
        float f7 = this.fillRadius;
        this.corners = new float[]{0.0f, 0.0f, f7, f7, f7, f7, 0.0f, 0.0f};
        this.fillRectBounds.set((getWidth() - viewGradientCouponBinding.gradientCouponApplyTV.getMeasuredWidth()) + this.dp2, 0.0f, getWidth() + this.dp1, getHeight());
        this.fillPath.reset();
        this.fillPath.addRoundRect(this.fillRectBounds, this.corners, Path.Direction.CW);
    }

    public final void bindAppliedColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        Paint paint = this.fillPaint;
        paint.setColor(parseColor != null ? parseColor.intValue() : paint.getColor());
    }

    public final void bindApplyText(@NotNull TextAtom dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        ViewGradientCouponBinding viewGradientCouponBinding = this.binding;
        TextAtomView gradientCouponApplyTV = viewGradientCouponBinding.gradientCouponApplyTV;
        Intrinsics.checkNotNullExpressionValue(gradientCouponApplyTV, "gradientCouponApplyTV");
        TextAtomHolderKt.bind$default(gradientCouponApplyTV, dto, null, 2, null);
        viewGradientCouponBinding.gradientCouponApplyTV.setMaxLinesOrDefault(1);
        viewGradientCouponBinding.gradientCouponApplyTV.setLetterSpacing(0.0f);
    }

    public final void bindCodeText(@NotNull TextAtom dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        ViewGradientCouponBinding viewGradientCouponBinding = this.binding;
        TextAtomView gradientCouponCodeTV = viewGradientCouponBinding.gradientCouponCodeTV;
        Intrinsics.checkNotNullExpressionValue(gradientCouponCodeTV, "gradientCouponCodeTV");
        TextAtomHolderKt.bind$default(gradientCouponCodeTV, dto, null, 2, null);
        viewGradientCouponBinding.gradientCouponCodeTV.setMaxLinesOrDefault(1);
    }

    public final void bindSubtitleText(TextAtom dto) {
        TextAtomView gradientCouponSubtitleTV = this.binding.gradientCouponSubtitleTV;
        Intrinsics.checkNotNullExpressionValue(gradientCouponSubtitleTV, "gradientCouponSubtitleTV");
        TextAtomHolderKt.bindOrGone$default(gradientCouponSubtitleTV, dto != null ? TextAtom.copy$default(dto, null, null, null, 1, null, null, null, 119, null) : null, null, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawProgressGradient(canvas);
        if (this.isApplied) {
            makeRightPartApplied(canvas);
        }
        super.dispatchDraw(canvas);
        drawDivider(canvas);
    }

    /* renamed from: isApplied, reason: from getter */
    public final boolean getIsApplied() {
        return this.isApplied;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.gradientBackground.setBounds(0, 0, getWidth(), getHeight());
        this.gradientBackground.setCornerRadius(CORNER_RADIUS);
        setAppliedPartBounds();
        super.onLayout(changed, left, top, right, bottom);
    }

    public final void setApplied(boolean z11) {
        this.isApplied = z11;
        requestLayout();
        invalidate();
    }

    public final void setGradient(@NotNull String startColor, @NotNull String endColor) {
        Intrinsics.checkNotNullParameter(startColor, "startColor");
        Intrinsics.checkNotNullParameter(endColor, "endColor");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.gradientColorStart = styleParser.parseColor(context, startColor, R$color.gradient_coupon_default_start_color);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.gradientColorEnd = styleParser.parseColor(context2, endColor, R$color.gradient_coupon_default_end_color);
    }

    public /* synthetic */ GradientCouponView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientCouponView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp1 = ResourceExtKt.toPx(1);
        this.dp2 = ResourceExtKt.toPx(2);
        this.fillRectBounds = new RectF();
        this.fillPath = new Path();
        this.fillRadius = CORNER_RADIUS;
        Paint paint = new Paint(1);
        paint.setColor(getResources().getColor(R.color.transparent, context.getTheme()));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.dividerPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(getResources().getColor(ru.ozon.uni.R$color.oz_bg_primary_hover, context.getTheme()));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.fillPaint = paint2;
        this.gradientColorStart = getResources().getColor(R$color.gradient_coupon_start_color, context.getTheme());
        this.gradientColorEnd = getResources().getColor(R$color.gradient_coupon_start_end, context.getTheme());
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: ru.ozon.app.android.marketing.common.view.GradientCouponView$gradientBackground$1$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                float[] gradientCoordinates;
                int i12;
                int i13;
                gradientCoordinates = GradientCouponView.this.getGradientCoordinates(width, height);
                float f7 = gradientCoordinates[0];
                float f11 = gradientCoordinates[1];
                float f12 = gradientCoordinates[2];
                float f13 = gradientCoordinates[3];
                i12 = GradientCouponView.this.gradientColorStart;
                i13 = GradientCouponView.this.gradientColorEnd;
                return new LinearGradient(f7, f11, f12, f13, new int[]{i12, i13}, (float[]) null, Shader.TileMode.CLAMP);
            }
        });
        this.gradientBackground = paintDrawable;
        this.corners = new float[0];
        this.binding = ViewGradientCouponBinding.inflate(LayoutInflater.from(context), this);
        setLayerType(2, null);
    }
}
