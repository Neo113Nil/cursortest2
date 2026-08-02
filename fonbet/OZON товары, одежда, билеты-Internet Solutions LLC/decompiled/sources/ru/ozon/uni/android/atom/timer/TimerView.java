package ru.ozon.uni.android.atom.timer;

import Bi.a;
import Lt.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.timer.TimerView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.PaintExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.util.TextPaintStyleParser;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0010H\u0014¢\u0006\u0004\b#\u0010\u0012J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010&R*\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010&R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0002092\u0006\u0010,\u001a\u0002098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010A\u001a\u0002092\u0006\u0010,\u001a\u0002098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010;\"\u0004\bB\u0010=R$\u0010C\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\"\u0004\bE\u0010\u000fR\u0016\u0010F\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010;R$\u0010G\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bG\u0010D\"\u0004\bH\u0010\u000fR\u0016\u0010I\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010;R\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010;¨\u0006O"}, d2 = {"Lru/ozon/uni/android/atom/timer/TimerView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "newTime", "", "updateTime", "(Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "drawBar", "(Landroid/graphics/Canvas;)V", "drawCurrentSecond", "drawPreviousSecond", "default", "measureSpecSizeOrDefault", "(II)I", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "canvas", "onDraw", "seconds", "startTimer", "(I)V", "backColor", "I", "getBackColor", "()I", "setBackColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, "frontColor", "getFrontColor", "setFrontColor", "Landroid/view/animation/LinearInterpolator;", "linearInterpolator", "Landroid/view/animation/LinearInterpolator;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Landroid/animation/ValueAnimator;", "barAnimator", "Landroid/animation/ValueAnimator;", "", "barProgress", "F", "setBarProgress", "(F)V", "Landroid/graphics/Paint;", "barPaint", "Landroid/graphics/Paint;", "secondsProgress", "setSecondsProgress", "currentSecond", "Ljava/lang/String;", "setCurrentSecond", "currentSecondHalfWidth", "previousSecond", "setPreviousSecond", "previousSecondHalfWidth", "Landroid/text/TextPaint;", "secondsPaint", "Landroid/text/TextPaint;", "secondHeight", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimerView extends View implements AtomView {
    private int backColor;
    private ValueAnimator barAnimator;

    @NotNull
    private final Paint barPaint;
    private float barProgress;

    @NotNull
    private String currentSecond;
    private float currentSecondHalfWidth;
    private int frontColor;

    @NotNull
    private final LinearInterpolator linearInterpolator;

    @NotNull
    private String previousSecond;
    private float previousSecondHalfWidth;

    @NotNull
    private final RectF rect;
    private final float secondHeight;

    @NotNull
    private final TextPaint secondsPaint;
    private float secondsProgress;
    public static final int $stable = 8;
    private static final int defaultSize = UiExtKt.toPx(40);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawBar(Canvas canvas) {
        this.barPaint.setColor(this.backColor);
        canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.barPaint);
        this.barPaint.setColor(this.frontColor);
        canvas.drawArc(this.rect, 270.0f, this.barProgress * (-360.0f), false, this.barPaint);
    }

    private final void drawCurrentSecond(Canvas canvas) {
        float centerX = this.rect.centerX() - this.currentSecondHalfWidth;
        float baseline = PaintExtKt.getBaseline(this.secondsPaint, this.rect.centerY() - ((1.0f - this.secondsProgress) * this.secondHeight));
        this.secondsPaint.setAlpha((int) (this.secondsProgress * 255));
        canvas.drawText(this.currentSecond, centerX, baseline, this.secondsPaint);
    }

    private final void drawPreviousSecond(Canvas canvas) {
        float centerX = this.rect.centerX() - this.previousSecondHalfWidth;
        float baseline = PaintExtKt.getBaseline(this.secondsPaint, (this.secondsProgress * this.secondHeight) + this.rect.centerY());
        this.secondsPaint.setAlpha((int) ((1.0f - this.secondsProgress) * 255));
        canvas.drawText(this.previousSecond, centerX, baseline, this.secondsPaint);
    }

    private final int measureSpecSizeOrDefault(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i12, View.MeasureSpec.getSize(i11));
        }
        if (mode == 0) {
            return i12;
        }
        if (mode != 1073741824) {
            return 0;
        }
        return View.MeasureSpec.getSize(i11);
    }

    private final void setBarProgress(float f7) {
        this.barProgress = f7;
        invalidate();
    }

    private final void setCurrentSecond(String str) {
        setPreviousSecond(this.currentSecond);
        this.currentSecond = str;
        this.currentSecondHalfWidth = this.secondsPaint.measureText(str) / 2;
    }

    private final void setPreviousSecond(String str) {
        this.previousSecond = str;
        this.previousSecondHalfWidth = this.secondsPaint.measureText(str) / 2;
    }

    private final void setSecondsProgress(float f7) {
        this.secondsProgress = f7;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTimer$lambda$4$lambda$3(TimerView timerView, long j11, ValueAnimator valueAnimator) {
        timerView.setBarProgress(((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        timerView.updateTime(String.valueOf((int) Math.ceil((j11 * r5) / 1000)));
    }

    private final void updateTime(String newTime) {
        int i11 = 2;
        if (Intrinsics.d(this.currentSecond, newTime)) {
            return;
        }
        setCurrentSecond(newTime);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(this.linearInterpolator);
        ofFloat.addUpdateListener(new b(this, i11));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTime$lambda$6$lambda$5(TimerView timerView, ValueAnimator valueAnimator) {
        timerView.setSecondsProgress(((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawBar(canvas);
        drawCurrentSecond(canvas);
        drawPreviousSecond(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11 = defaultSize;
        setMeasuredDimension(measureSpecSizeOrDefault(widthMeasureSpec, i11), measureSpecSizeOrDefault(heightMeasureSpec, i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        float strokeWidth = (this.barPaint.getStrokeWidth() / 2) + Vc.a.c(new int[]{getPaddingTop(), getPaddingRight(), getPaddingBottom()}, getPaddingLeft());
        this.rect.set(strokeWidth, strokeWidth, w11 - strokeWidth, h11 - strokeWidth);
    }

    public final void setBackColor(int i11) {
        this.backColor = i11;
    }

    public final void setFrontColor(int i11) {
        this.frontColor = i11;
        this.secondsPaint.setColor(i11);
    }

    public final void startTimer(int seconds) {
        ValueAnimator valueAnimator = this.barAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final long j11 = seconds * 1000;
        setCurrentSecond(String.valueOf(seconds));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(this.linearInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rk0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TimerView.startTimer$lambda$4$lambda$3(TimerView.this, j11, valueAnimator2);
            }
        });
        ofFloat.start();
        this.barAnimator = ofFloat;
    }

    public /* synthetic */ TimerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_parandja);
        this.frontColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary);
        this.linearInterpolator = new LinearInterpolator();
        this.rect = new RectF();
        this.barProgress = 1.0f;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(UiExtKt.toPxF(2));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.barPaint = paint;
        this.secondsProgress = 1.0f;
        this.currentSecond = "";
        this.previousSecond = "";
        TextPaint textPaint = new TextPaint(1);
        TextPaintStyleParser.applyStyle$default(new TextPaintStyleParser(context), textPaint, R$style.TextStyle_Head_M, null, 4, null);
        textPaint.setColor(this.frontColor);
        this.secondsPaint = textPaint;
        this.secondHeight = PaintExtKt.getTextHeight(textPaint);
    }
}
