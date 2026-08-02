package ru.ozon.fintech.ui.animatedcircleprogress;

import G80.a;
import Gt.c;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import c3.C5740b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u0001:\u0001BB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00101\u001a\u0002002\u0006\u0010*\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00102R\u0016\u0010;\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010<\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00102R\u0016\u0010=\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00102R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@¨\u0006C"}, d2 = {"Lru/ozon/fintech/ui/animatedcircleprogress/AnimatedCircleProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "startAnim", "()V", "stopAnim", "attrSet", "initAttributes", "(Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "defaultTintColor", "I", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "oval", "Landroid/graphics/RectF;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "tintColor", "getTintColor", "()I", "setTintColor", "(I)V", "", "progressStrokeWidth", "F", "getProgressStrokeWidth", "()F", "setProgressStrokeWidth", "(F)V", "Lc3/b;", "trimInterpolator", "Lc3/b;", "baseTurns", "rotationTurns", "localStart", "localEnd", "Landroid/animation/ValueAnimator;", "trimAnimator", "Landroid/animation/ValueAnimator;", "rotationAnimator", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimatedCircleProgressView extends View {
    private static final int DEFAULT_MIN_SIZE = UiExtKt.toPx(10);
    private static final long DEFAULT_ROTATION_DURATION = 2000;
    public static final float DEFAULT_STROKE_WIDTH = 10.0f;
    private static final float MAX_SWEEP = 0.82f;
    private static final float MIN_SWEEP = 0.05f;
    private static final long TRIM_DURATION = 1333;
    private float baseTurns;
    private final int defaultTintColor;
    private float localEnd;
    private float localStart;

    @NotNull
    private final RectF oval;

    @NotNull
    private final Paint paint;
    private float progressStrokeWidth;
    private ValueAnimator rotationAnimator;
    private float rotationTurns;
    private int tintColor;
    private ValueAnimator trimAnimator;

    @NotNull
    private final C5740b trimInterpolator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initAttributes(AttributeSet attrSet, int defStyleAttr, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrSet, a.f9763a, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            setTintColor(obtainStyledAttributes.getColor(1, androidx.core.content.a.getColor(getContext(), R.color.blue_500)));
            setProgressStrokeWidth(UiExtKt.toDpF(obtainStyledAttributes.getFloat(0, 10.0f)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void startAnim() {
        ValueAnimator valueAnimator;
        int i11 = 1;
        ValueAnimator valueAnimator2 = this.trimAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.rotationAnimator) == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(TRIM_DURATION);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new c(this, 3));
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressView$startAnim$lambda$3$$inlined$addListener$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                    float f7;
                    AnimatedCircleProgressView animatedCircleProgressView = AnimatedCircleProgressView.this;
                    f7 = animatedCircleProgressView.baseTurns;
                    animatedCircleProgressView.baseTurns = f7 + 0.82f;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
            this.trimAnimator = ofFloat;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(DEFAULT_ROTATION_DURATION);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.addUpdateListener(new RM.a(this, i11));
            this.rotationAnimator = ofFloat2;
            ValueAnimator valueAnimator3 = this.trimAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            ValueAnimator valueAnimator4 = this.rotationAnimator;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnim$lambda$3$lambda$1(AnimatedCircleProgressView animatedCircleProgressView, ValueAnimator va2) {
        Intrinsics.checkNotNullParameter(va2, "va");
        float currentPlayTime = (va2.getCurrentPlayTime() % TRIM_DURATION) / TRIM_DURATION;
        if (currentPlayTime <= 0.5f) {
            animatedCircleProgressView.localStart = 0.0f;
            animatedCircleProgressView.localEnd = (animatedCircleProgressView.trimInterpolator.getInterpolation(currentPlayTime / 0.5f) * 0.77f) + MIN_SWEEP;
        } else {
            animatedCircleProgressView.localStart = animatedCircleProgressView.trimInterpolator.getInterpolation((currentPlayTime - 0.5f) / 0.5f) * 0.77f;
            animatedCircleProgressView.localEnd = MAX_SWEEP;
        }
        animatedCircleProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnim$lambda$5$lambda$4(AnimatedCircleProgressView animatedCircleProgressView, ValueAnimator va2) {
        Intrinsics.checkNotNullParameter(va2, "va");
        animatedCircleProgressView.rotationTurns = (va2.getCurrentPlayTime() % DEFAULT_ROTATION_DURATION) / DEFAULT_ROTATION_DURATION;
        animatedCircleProgressView.invalidate();
    }

    private final void stopAnim() {
        ValueAnimator valueAnimator = this.trimAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.rotationAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.trimAnimator = null;
        this.rotationAnimator = null;
    }

    public final float getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnim();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        stopAnim();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f7 = this.baseTurns;
        float f11 = this.rotationTurns;
        float f12 = f7 + f11 + this.localStart;
        float f13 = f7 + f11 + this.localEnd;
        canvas.drawArc(this.oval, ((f12 % 1.0f) * 360.0f) - 90.0f, Math.max(0.001f, (f13 - f12) * 360.0f), false, this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            int i11 = DEFAULT_MIN_SIZE;
            if (i11 <= size) {
                size = i11;
            }
        } else if (mode == 0) {
            size = DEFAULT_MIN_SIZE;
        }
        if (mode2 == Integer.MIN_VALUE) {
            int i12 = DEFAULT_MIN_SIZE;
            if (i12 <= size2) {
                size2 = i12;
            }
        } else if (mode2 == 0) {
            size2 = DEFAULT_MIN_SIZE;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        float f7 = this.progressStrokeWidth / 2.0f;
        this.oval.set(getPaddingLeft() + f7, getPaddingTop() + f7, (w11 - getPaddingRight()) - f7, (h11 - getPaddingBottom()) - f7);
    }

    public final void setProgressStrokeWidth(float f7) {
        if (this.progressStrokeWidth == f7) {
            return;
        }
        this.progressStrokeWidth = f7;
        this.paint.setStrokeWidth(f7);
        requestLayout();
    }

    public final void setTintColor(int i11) {
        if (this.tintColor != i11) {
            this.tintColor = i11;
            this.paint.setColor(i11);
            invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimatedCircleProgressView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = androidx.core.content.a.getColor(context, R.color.oz_blue);
        this.defaultTintColor = color;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(color);
        this.paint = paint;
        this.oval = new RectF();
        this.tintColor = color;
        this.progressStrokeWidth = 10.0f;
        this.trimInterpolator = new C5740b();
        this.localEnd = MIN_SWEEP;
        initAttributes(attributeSet, i11, i12);
    }
}
