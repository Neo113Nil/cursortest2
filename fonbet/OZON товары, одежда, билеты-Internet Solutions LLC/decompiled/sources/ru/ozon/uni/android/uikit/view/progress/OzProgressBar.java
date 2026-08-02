package ru.ozon.uni.android.uikit.view.progress;

import Bi.a;
import Ij.C3261b;
import JC.d;
import Sc.InterfaceC3999a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u001eR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R*\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R*\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u001eR*\u00100\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010\u001eR*\u00103\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.\"\u0004\b5\u0010\u001eR.\u00107\u001a\u0004\u0018\u0001062\b\u0010'\u001a\u0004\u0018\u0001068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010>\u001a\u00020=2\u0006\u0010'\u001a\u00020=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010E\u001a\u00020D2\u0006\u0010'\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010K\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010,\u001a\u0004\bL\u0010.\"\u0004\bM\u0010\u001eR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010U\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010,R\u0016\u0010^\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010?R$\u0010\u001c\u001a\u00020=2\u0006\u0010'\u001a\u00020=8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010?\"\u0004\b_\u0010CR\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010,¨\u0006e"}, d2 = {"Lru/ozon/uni/android/uikit/view/progress/OzProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "percent", "setProgress", "(I)V", "updateFillPath", "()V", "animateProgress", "isAnimated", "Z", "()Z", "setAnimated", "(Z)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "hasBorder", "getHasBorder", "setHasBorder", "barColor", "I", "getBarColor", "()I", "setBarColor", "fillColor", "getFillColor", "setFillColor", "cornerRadius", "getCornerRadius", "setCornerRadius", "", "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "", "textSize", "F", "getTextSize", "()F", "setTextSize", "(F)V", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "textColor", "getTextColor", "setTextColor", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "Landroid/graphics/Paint;", "barPaint", "Landroid/graphics/Paint;", "fillPaint", "textPaint", "Landroid/graphics/RectF;", "backgroundRectBounds", "Landroid/graphics/RectF;", "fillRectBounds", "Landroid/graphics/Path;", "fillPath", "Landroid/graphics/Path;", "borderSize", "fillRadius", "setPercent", "", "corners", "[F", "dp2", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OzProgressBar extends View {
    private ValueAnimator animator;

    @NotNull
    private final RectF backgroundRectBounds;
    private int barColor;

    @NotNull
    private final Paint barPaint;
    private int borderSize;
    private int cornerRadius;

    @NotNull
    private float[] corners;
    private final int dp2;
    private int fillColor;

    @NotNull
    private final Paint fillPaint;

    @NotNull
    private final Path fillPath;
    private float fillRadius;

    @NotNull
    private final RectF fillRectBounds;
    private boolean hasBorder;
    private boolean isAnimated;
    private float percent;
    private CharSequence text;
    private int textColor;

    @NotNull
    private final Paint textPaint;
    private float textSize;

    @NotNull
    private Typeface typeface;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/uikit/view/progress/OzProgressBar$Companion;", "", "<init>", "()V", "DEFAULT_BAR_COLOR", "", "DEFAULT_FILL_COLOR", "DEFAULT_TEXT_COLOR", "DEFAULT_ANIMATION_DURATION", "", "MAX_VALUE", "MIN_VALUE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void animateProgress(int percent) {
        int i11 = 1;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.percent, percent / 100.0f);
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new d(this, i11));
        this.animator = ofFloat;
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateProgress$lambda$5$lambda$4(OzProgressBar ozProgressBar, ValueAnimator valueAnimator) {
        ozProgressBar.setPercent(((Float) a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        ozProgressBar.invalidate();
    }

    private final void setPercent(float f7) {
        this.percent = f7;
        float f11 = this.fillRadius;
        float f12 = (f7 < 0.0f || f7 >= 1.0f) ? f11 : 0.0f;
        this.corners = new float[]{f11, f11, f12, f12, f12, f12, f11, f11};
        updateFillPath();
    }

    private final void updateFillPath() {
        float f7 = this.percent;
        if (f7 > 0.0f) {
            RectF rectF = this.fillRectBounds;
            RectF rectF2 = this.backgroundRectBounds;
            float f11 = rectF2.left;
            int i11 = this.borderSize;
            rectF.set(f11 + i11, rectF2.top + i11, (rectF2.right - i11) * f7, rectF2.bottom - i11);
            this.fillPath.reset();
            this.fillPath.addRoundRect(this.fillRectBounds, this.corners, Path.Direction.CW);
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.backgroundRectBounds;
        float f7 = this.fillRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.barPaint);
        if (this.percent > 0.0f) {
            canvas.drawPath(this.fillPath, this.fillPaint);
        }
        CharSequence charSequence = this.text;
        if (charSequence != null) {
            canvas.drawText(charSequence, 0, charSequence.length(), getWidth() / 2, (getHeight() / 2) - ((this.textPaint.ascent() + this.textPaint.descent()) / 2), this.textPaint);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.backgroundRectBounds.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        updateFillPath();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), (this.borderSize * 2) + getMeasuredHeight());
    }

    public final void setBarColor(int i11) {
        this.barColor = i11;
        this.barPaint.setColor(i11);
        invalidate();
    }

    public final void setCornerRadius(int i11) {
        this.cornerRadius = i11;
        this.fillRadius = i11;
        invalidate();
    }

    public final void setFillColor(int i11) {
        this.fillColor = i11;
        this.fillPaint.setColor(i11);
        invalidate();
    }

    public final void setHasBorder(boolean z11) {
        this.hasBorder = z11;
        this.borderSize = z11 ? this.dp2 : 0;
        requestLayout();
        invalidate();
    }

    public final void setProgress(int percent) {
        if (percent > 100) {
            percent = 100;
        } else if (percent < 0) {
            percent = 0;
        }
        if (this.isAnimated) {
            animateProgress(percent);
        } else {
            setPercent(percent / 100.0f);
            invalidate();
        }
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        invalidate();
    }

    public final void setTextColor(int i11) {
        this.textColor = i11;
        this.textPaint.setColor(i11);
    }

    public final void setTypeface(@NotNull Typeface value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.typeface = value;
        this.textPaint.setTypeface(value);
    }

    public /* synthetic */ OzProgressBar(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzProgressBar(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isAnimated = true;
        this.barColor = -7829368;
        this.fillColor = BaseDotsIndicator.DEFAULT_POINT_COLOR;
        this.text = "";
        this.textSize = ResourceExtKt.toPxF(14);
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.typeface = DEFAULT;
        this.textColor = -1;
        this.barPaint = C3261b.b(1, -7829368);
        this.fillPaint = C3261b.b(1, BaseDotsIndicator.DEFAULT_POINT_COLOR);
        Paint b11 = C3261b.b(1, -1);
        b11.setTextAlign(Paint.Align.CENTER);
        b11.setTextSize(ResourceExtKt.toPxF(14));
        this.textPaint = b11;
        this.backgroundRectBounds = new RectF();
        this.fillRectBounds = new RectF();
        this.fillPath = new Path();
        this.corners = new float[0];
        this.dp2 = ResourceExtKt.toPx(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.OzProgressBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setText(obtainStyledAttributes.getText(R$styleable.OzProgressBar_android_text));
        setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(R$styleable.OzProgressBar_oz_pb_corner_radius, 0));
        setBarColor(obtainStyledAttributes.getColor(R$styleable.OzProgressBar_bar_color, -7829368));
        setTextColor(obtainStyledAttributes.getColor(R$styleable.OzProgressBar_android_textColor, -1));
        setFillColor(obtainStyledAttributes.getColor(R$styleable.OzProgressBar_fill_color, BaseDotsIndicator.DEFAULT_POINT_COLOR));
        this.isAnimated = obtainStyledAttributes.getBoolean(R$styleable.OzProgressBar_is_animated, true);
        setHasBorder(obtainStyledAttributes.getBoolean(R$styleable.OzProgressBar_hasBorder, false));
        setProgress(obtainStyledAttributes.getInt(R$styleable.OzProgressBar_percent, 0));
        obtainStyledAttributes.recycle();
    }
}
