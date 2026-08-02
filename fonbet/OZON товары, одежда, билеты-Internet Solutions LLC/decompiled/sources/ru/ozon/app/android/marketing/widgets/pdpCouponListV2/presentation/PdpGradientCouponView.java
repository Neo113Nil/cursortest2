package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import Oz.ViewOnClickListenerC3716a;
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$color;
import ru.ozon.app.android.marketing.databinding.ViewPdpGradientCouponBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0001^B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b$\u0010\u001fJ\u0017\u0010%\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b%\u0010\u001fJ\u001d\u0010(\u001a\u00020\u00102\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 ¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u00102\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100*¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b.\u0010\u001aJ\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0016J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u0010\u0016J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b2\u0010\u0016J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0010H\u0002¢\u0006\u0004\b7\u00105J\u001f\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010S\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010\u0018\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010Z\u001a\u0004\b\u0018\u0010[\"\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpGradientCouponView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "isSmallScreen", "isApplied", "updateRightTextSize", "(ZZ)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "dto", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bindApplyText", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "", "color", "bindAppliedColor", "(Ljava/lang/String;)V", "bindCodeText", "bindSubtitleText", "startColor", "endColor", "setGradient", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "body", "setCouponApplyClickListener", "(Lkotlin/jvm/functions/Function1;)V", "updateLeftTextMargins", "drawDivider", "drawProgressGradient", "makeRightPartApplied", "drawDefaultDivider", "drawAppliedDivider", "setLeftPartBoundsForApplied", "()V", "setLeftPartBoundsForNotApplied", "setAppliedPartBounds", "", "width", "height", "", "getGradientCoordinates", "(FF)[F", "Landroid/graphics/RectF;", "fillRectBounds", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "fillPath", "Landroid/graphics/Path;", "fillRadius", "F", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "fillPaint", "gradientColorStart", "I", "gradientColorEnd", "Landroid/graphics/drawable/PaintDrawable;", "gradientBackground", "Landroid/graphics/drawable/PaintDrawable;", "Lru/ozon/app/android/marketing/databinding/ViewPdpGradientCouponBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/ViewPdpGradientCouponBinding;", "corners", "[F", "getCorners", "()[F", "setCorners", "([F)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Z", "()Z", "setApplied", "(Z)V", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpGradientCouponView extends LinearLayout {
    private static final float CORNER_RADIUS;
    private static final int DOT_DIAMETER;
    private static final float DOT_RADIUS;
    private static final int VERTICAL_SHIFT;
    private static final int dp1;
    private static final int dp12;
    private static final int dp16;
    private static final int dp2;
    private static final int rightTextWidthForLargeScreen;
    private static final int rightTextWidthForSmallScreen;

    @NotNull
    private ViewPdpGradientCouponBinding binding;

    @NotNull
    private float[] corners;

    @NotNull
    private final Paint dividerPaint;

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

    static {
        float pxF = ResourceExtKt.toPxF(3);
        DOT_RADIUS = pxF;
        DOT_DIAMETER = ((int) pxF) * 2;
        CORNER_RADIUS = ResourceExtKt.toPxF(12);
        VERTICAL_SHIFT = ResourceExtKt.toPx(9);
        rightTextWidthForSmallScreen = ResourceExtKt.toPx(96);
        rightTextWidthForLargeScreen = ResourceExtKt.toPx(104);
        dp1 = ResourceExtKt.toPx(1);
        dp2 = ResourceExtKt.toPx(2);
        dp12 = ResourceExtKt.toPx(12);
        dp16 = ResourceExtKt.toPx(16);
    }

    public /* synthetic */ PdpGradientCouponView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void drawAppliedDivider(Canvas canvas) {
        int width = getWidth() - this.binding.gradientCouponApplyTV.getMeasuredWidth();
        int i11 = dp1;
        int i12 = width - i11;
        float f7 = 2;
        float width2 = getWidth() / f7;
        float height = getHeight() / f7;
        Path path = new Path();
        RectF rectF = new RectF();
        while (true) {
            int measuredHeight = getMeasuredHeight();
            int i13 = VERTICAL_SHIFT;
            if (i11 >= measuredHeight + i13) {
                break;
            }
            float f11 = DOT_RADIUS;
            path.addCircle(width2, height, f11, Path.Direction.CW);
            float f12 = i12;
            float f13 = i11;
            rectF.set(f12 - f11, f13 - f11, f12 + f11, f13 + f11);
            canvas.drawArc(rectF, 45.0f, 275.0f, false, this.dividerPaint);
            i11 += i13;
        }
        int i14 = i12 + dp2;
        int px = ResourceExtKt.toPx(5.5d);
        while (true) {
            int measuredHeight2 = getMeasuredHeight();
            int i15 = VERTICAL_SHIFT;
            if (px >= measuredHeight2 + i15) {
                return;
            }
            float f14 = DOT_RADIUS;
            path.addCircle(width2, height, f14, Path.Direction.CW);
            float f15 = i14;
            float f16 = px;
            rectF.set(f15 - f14, f16 - f14, f15 + f14, f16 + f14);
            canvas.drawArc(rectF, 135.0f, -270.0f, false, this.dividerPaint);
            px += i15;
        }
    }

    private final void drawDefaultDivider(Canvas canvas) {
        float width = (getWidth() - this.binding.gradientCouponApplyTV.getMeasuredWidth()) - DOT_RADIUS;
        float f7 = dp1;
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
        ViewPdpGradientCouponBinding viewPdpGradientCouponBinding = this.binding;
        float f7 = this.fillRadius;
        this.corners = new float[]{0.0f, 0.0f, f7, f7, f7, f7, 0.0f, 0.0f};
        this.fillRectBounds.set((getWidth() - viewPdpGradientCouponBinding.gradientCouponApplyTV.getMeasuredWidth()) + dp1, 0.0f, getWidth(), getHeight());
        this.fillPath.reset();
        this.fillPath.addRoundRect(this.fillRectBounds, this.corners, Path.Direction.CW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCouponApplyClickListener$lambda$12$lambda$11(Function1 function1, PdpGradientCouponView pdpGradientCouponView, View view) {
        function1.invoke(Boolean.valueOf(pdpGradientCouponView.isApplied));
    }

    private final void setLeftPartBoundsForApplied() {
        float f7 = this.fillRadius;
        this.corners = new float[]{f7, f7, 0.0f, 0.0f, 0.0f, 0.0f, f7, f7};
        this.gradientBackground.setBounds(0, 0, getWidth() - this.binding.gradientCouponApplyTV.getMeasuredWidth(), getHeight());
        this.gradientBackground.setCornerRadii(this.corners);
    }

    private final void setLeftPartBoundsForNotApplied() {
        this.gradientBackground.setBounds(0, 0, getWidth(), getHeight());
        this.gradientBackground.setCornerRadius(CORNER_RADIUS);
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

    @NotNull
    public final TextAtomV2View bindApplyText(@NotNull TextAtom dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextAtomV2View textAtomV2View = this.binding.gradientCouponApplyTV;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bind$default(textAtomV2View, TextMapperKt.dsTextAtom$default(dto, null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, 1, null, false, 3581, null), null, 2, null);
        textAtomV2View.setLetterSpacing(0.0f);
        Intrinsics.checkNotNullExpressionValue(textAtomV2View, "with(...)");
        return textAtomV2View;
    }

    @NotNull
    public final TextAtomV2View bindCodeText(@NotNull TextAtom dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextAtomV2View textAtomV2View = this.binding.gradientCouponCodeTV;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bind$default(textAtomV2View, TextMapperKt.dsTextAtom$default(dto, dto.getText(), null, null, null, null, null, null, null, null, 1, CommonAtomLabelDTO.TruncatingMode.TAIL, false, 2558, null), null, 2, null);
        textAtomV2View.setTextIsSelectable(false);
        Intrinsics.checkNotNullExpressionValue(textAtomV2View, "with(...)");
        return textAtomV2View;
    }

    @NotNull
    public final TextAtomV2View bindSubtitleText(TextAtom dto) {
        TextAtomV2View textAtomV2View = this.binding.gradientCouponSubtitleTV;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, dto != null ? TextMapperKt.dsTextAtom$default(dto, dto.getText(), null, null, null, null, null, null, null, null, 1, CommonAtomLabelDTO.TruncatingMode.TAIL, false, 2558, null) : null, null, 2, null);
        textAtomV2View.setTextIsSelectable(false);
        Intrinsics.checkNotNullExpressionValue(textAtomV2View, "with(...)");
        return textAtomV2View;
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
        if (this.isApplied) {
            setLeftPartBoundsForApplied();
        } else {
            setLeftPartBoundsForNotApplied();
        }
        setAppliedPartBounds();
        super.onLayout(changed, left, top, right, bottom);
    }

    public final void setApplied(boolean z11) {
        this.isApplied = z11;
        requestLayout();
        invalidate();
    }

    public final void setCouponApplyClickListener(@NotNull Function1<? super Boolean, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ViewPdpGradientCouponBinding viewPdpGradientCouponBinding = this.binding;
        viewPdpGradientCouponBinding.gradientCouponApplyTV.setTextIsSelectable(false);
        viewPdpGradientCouponBinding.gradientCouponApplyTV.setOnClickListener(new ViewOnClickListenerC3716a(0, body, this));
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

    public final void updateLeftTextMargins(boolean isSmallScreen, boolean isApplied) {
        ViewPdpGradientCouponBinding viewPdpGradientCouponBinding = this.binding;
        int i11 = isSmallScreen ? dp12 : dp16;
        int i12 = isApplied ? i11 : DOT_DIAMETER + i11;
        LinearLayout textLl = viewPdpGradientCouponBinding.textLl;
        Intrinsics.checkNotNullExpressionValue(textLl, "textLl");
        ViewGroup.LayoutParams layoutParams = textLl.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(i11);
        layoutParams2.setMarginEnd(i12);
        textLl.setLayoutParams(layoutParams2);
    }

    public final void updateRightTextSize(boolean isSmallScreen, boolean isApplied) {
        int i11;
        int i12;
        int i13;
        TextAtomV2View gradientCouponApplyTV = this.binding.gradientCouponApplyTV;
        Intrinsics.checkNotNullExpressionValue(gradientCouponApplyTV, "gradientCouponApplyTV");
        ViewGroup.LayoutParams layoutParams = gradientCouponApplyTV.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (!isSmallScreen || isApplied) {
            if (isSmallScreen && isApplied) {
                i11 = rightTextWidthForSmallScreen;
                i12 = dp2;
            } else if (isSmallScreen || isApplied) {
                i11 = rightTextWidthForLargeScreen;
                i12 = dp2;
            } else {
                i13 = rightTextWidthForLargeScreen;
            }
            i13 = i11 + i12;
        } else {
            i13 = rightTextWidthForSmallScreen;
        }
        layoutParams.width = i13;
        gradientCouponApplyTV.setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpGradientCouponView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
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
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpGradientCouponView$gradientBackground$1$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                float[] gradientCoordinates;
                int i12;
                int i13;
                gradientCoordinates = PdpGradientCouponView.this.getGradientCoordinates(width, height);
                float f7 = gradientCoordinates[0];
                float f11 = gradientCoordinates[1];
                float f12 = gradientCoordinates[2];
                float f13 = gradientCoordinates[3];
                i12 = PdpGradientCouponView.this.gradientColorStart;
                i13 = PdpGradientCouponView.this.gradientColorEnd;
                return new LinearGradient(f7, f11, f12, f13, new int[]{i12, i13}, (float[]) null, Shader.TileMode.CLAMP);
            }
        });
        this.gradientBackground = paintDrawable;
        ViewPdpGradientCouponBinding inflate = ViewPdpGradientCouponBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.corners = new float[0];
        setLayerType(2, null);
    }
}
